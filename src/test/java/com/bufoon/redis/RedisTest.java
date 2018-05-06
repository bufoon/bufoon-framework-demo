package com.bufoon.redis;

import com.bufoon.AbstractTest;
import org.junit.Test;
import org.redisson.RedissonBucket;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @Author: bufoon
 * @Email: 285395841@qq.com
 * @Datetime: Created In 2018/5/6 0:41
 * @Desc: as follows.
 */
public class RedisTest extends AbstractTest {

    @Autowired(required = false)
    RedissonClient redissonClient;

    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    public void test(){
        RBucket<String> rBucket = redissonClient.getBucket("test1");
        logger.info(rBucket.get());
        rBucket.set("update");
    }

    @Test
    public void jedisTest(){
        System.out.println(redisTemplate.opsForValue().get("test"));
    }
}
