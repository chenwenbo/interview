package com.interview.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Redis 仓库
 */
public class JedisRespo {

    public static Jedis jedis;

    private JedisRespo() {
        throw new RuntimeException();
    }

    public static Jedis getJedisInstance(){
        if (jedis != null) {
            return jedis;
        }else {
            JedisPool pool = new JedisPool(new JedisPoolConfig(), "120.25.251.32");
            jedis = pool.getResource();
            jedis.auth("redis123");
            return jedis;
        }
    }

}
