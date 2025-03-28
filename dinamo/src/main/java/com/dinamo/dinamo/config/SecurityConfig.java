package com.dinamo.dinamo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable()) // Desactivar CSRF para pruebas
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/usuarios/**").permitAll() // Permitir acceso a usuarios sin autenticación
                        .anyRequest().authenticated() // Todo lo demás requiere autenticación
                )
                .httpBasic(httpBasic -> {}) // Habilitar autenticación básica
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}