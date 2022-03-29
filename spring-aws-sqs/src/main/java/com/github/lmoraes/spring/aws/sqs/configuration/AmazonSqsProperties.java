package com.github.lmoraes.spring.aws.sqs.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "aws.sqs")
public final class AmazonSqsProperties {

    private final String accessKey;
    private final String secretKey;
    private final String endpoint;
    private final String region;

    public AmazonSqsProperties(String accessKey, String secretKey, String endpoint, String region) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.endpoint = endpoint;
        this.region = region;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getRegion() {
        return region;
    }
}