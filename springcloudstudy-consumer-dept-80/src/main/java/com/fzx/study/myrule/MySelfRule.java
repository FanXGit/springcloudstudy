package com.fzx.study.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;



public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule_FZX();
    }
}
