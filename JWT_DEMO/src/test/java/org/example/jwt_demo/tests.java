package org.example.jwt_demo;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

//@SpringBootTest
class tests {

    /**
     * 生成令牌
     */
    @Test
    public void testGenJwt(){
        Map<String, Object> claims = new HashMap<>();
        claims.put("id" , 1);
        claims.put("name" , "test");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"JwtDemo")//签名算法,后面一部分为秘钥
                .setClaims(claims)//载荷
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))//有效时间，这里的1000单位为ms
                .compact();
        System.out.println(jwt);
    }

    /**
     * 解析令牌
     */
    @Test
    public void testParseJwt(){
        Claims claims = Jwts.parser()
                .setSigningKey("JwtDemo")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoidGVzdCIsImlkIjoxLCJleHAiOjE3NDAyOTU4MDl9.afAWCY3ol4_ME6PQEbVJyLb-QVUoZHESmC6Rf9fkhQ8")
                .getBody();
        System.out.println(claims);
    }
}
