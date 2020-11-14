package com.bp.business.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author yipeng
 * @Date 2020/11/14 16:20
 * @Version 1.0
 * @Desc
 */
@Configuration
@MapperScan(basePackages = "com.bp.business.**.dao")
public class MybatisConfiguration {
}
