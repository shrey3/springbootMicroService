package com.springbootMicroservice.springbootMicroservice;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

public class MongoPrimaryDBconfig {
	
	@Bean(name = "primaryDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.mongodb-primary")
	@Primary
	public DataSource primaryDataSource() {
		
		return DataSourceBuilder.create().build();
		
	}
	
	@Bean(name = "primaryDataSourceJDBC")
	public JdbcTemplate jdbcTemplate(@Qualifier("primaryDataSource") DataSource dataSource) {
		
		return new JdbcTemplate(dataSource);
		
	}

}
