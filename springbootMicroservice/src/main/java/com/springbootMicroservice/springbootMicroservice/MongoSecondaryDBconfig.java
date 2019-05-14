package com.springbootMicroservice.springbootMicroservice;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

public class MongoSecondaryDBconfig {
	
	@Bean(name = "secondaryDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.mongodb-secondary")
	public DataSource secondaryDataSource() {
		
		return DataSourceBuilder.create().build();
	}
	@Bean(name = "secondaryDataSourceJDBC")
	public JdbcTemplate jdbcSecondaryTemplate(@Qualifier("secondaryDataSource") DataSource dataSource) {
		
		return new JdbcTemplate(dataSource);
		
	}

}
