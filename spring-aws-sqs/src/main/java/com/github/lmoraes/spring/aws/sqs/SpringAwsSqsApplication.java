package com.github.lmoraes.spring.aws.sqs;

import com.github.lmoraes.spring.aws.sqs.configuration.AmazonSqsProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AmazonSqsProperties.class)
public class SpringAwsSqsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsSqsApplication.class, args);
	}

}
