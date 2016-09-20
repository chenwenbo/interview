package com.interview.question001;

import com.interview.redis.JedisRespo;
import redis.clients.jedis.Jedis;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by Administrator on 2016/9/19.
 */
public class Coupon {

    private static final String ALL_CHARS = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static Jedis jedis = JedisRespo.getJedisInstance();


    public Set<String> getCouponCode(int count, int length){
        Set<String> couponCodes = new HashSet<String>();
        while (couponCodes.size() < count) {
            couponCodes.add(generateKey(length));
        }
        return couponCodes;
    }

    private String generateKey(int length) {
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < length; i++) {
            sbf.append(ALL_CHARS.charAt(new Random().nextInt(ALL_CHARS.length())));
        }
        return sbf.toString();
    }

    public void saveCoupons(String activiteName ,Set<String> coupons){

        for (String coupon : coupons) {
            jedis.rpush(activiteName, coupon);
        }

    }

    public void printCoupons(String activiteName) {
        List<String> list = jedis.lrange(activiteName, 0, -1);
        for (String couponCode : list) {
            System.out.println(couponCode);
        }
    }

    public void clearCoupons(String activiteName){
        jedis.del(activiteName);
    }

}
