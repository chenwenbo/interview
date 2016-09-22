package com.interview.question003;

import com.interview.redis.JedisRespo;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

/**
 * 第 0003 题：将 0001 题生成的 200 个激活码（或者优惠券）保存到 Redis 非关系型数据库中。
 */
public class ActiviteCodeRedis {

    private static Jedis jedis = JedisRespo.getJedisInstance();

    public void saveActiviteCode(String activiteName, Set<String> activiteCodes) {
        for (String activiteCode : activiteCodes) {
            jedis.rpush(activiteName, activiteCode);
        }
    }

    public List<String> queryActivitesCode(String activiteName) {
        return jedis.lrange(activiteName, 0, -1);
    }

    public void clearActiviteCodes(String activiteName) {
        jedis.del(activiteName);
    }

}
