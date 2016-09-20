package com.interview.question001;

import com.interview.redis.JedisRespo;
import redis.clients.jedis.Jedis;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 第 0001 题：做为 Apple Store App 独立开发者，你要搞限时促销，为你的应用生成激活码（或者优惠券），使用 Python 如何生成 200 个激活码（或者优惠券）？
 * 第 0003 题：将 0001 题生成的 200 个激活码（或者优惠券）保存到 Redis 非关系型数据库中。
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
