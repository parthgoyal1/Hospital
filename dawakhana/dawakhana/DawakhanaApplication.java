package com.sapient.dawakhana;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SuppressWarnings("unused")
@SpringBootApplication
public class DawakhanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DawakhanaApplication.class, args);
	}
	
	@Bean public DataSource datasource() { 
		return DataSourceBuilder.create()
				.driverClassName("com.mysql.cj.jdbc.Driver")
				.url("jdbc:mysql://localhost:3306/schema_ex") .username("root") .password("Sixonenine@619")
				.build(); }
}
