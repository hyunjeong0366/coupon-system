package com.example.api.repository;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AppliedUserRepository {

    private final RedisTemplate<String, String> redisTemplate;

    public AppliedUserRepository(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public Long add(Long usreId) {
        return redisTemplate
                .opsForSet()
                .add("applied_user", String.valueOf(usreId));
    }
}
