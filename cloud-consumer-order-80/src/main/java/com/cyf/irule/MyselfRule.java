package com.cyf.irule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author by cyf
 * @date 2020/7/3.
 */
@Configuration
public class MyselfRule {
    /**
     * 定义为随机 主启动类要加RibbonClient注解
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
