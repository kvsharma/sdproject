package com.enterprise.adapter.spring.root;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ImportResource({ "classpath:com/enterprise/adapter/spring/root/repositories-config.xml" })
public class RepositoryConfig {
}
