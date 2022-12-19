package com.johnsuhr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@Configuration
@EnableMethodSecurity(proxyTargetClass = true)
public class SecurityConfig {
}
