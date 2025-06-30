//package com.korit.authstudy.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//@Configuration
//public class SecurityConfig2 {
//
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//
//        corsConfiguration.addAllowedOriginPattern(CorsConfiguration.ALL);
//        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL);
//        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL);
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfiguration);
//        return source;
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.cors(Customizer.withDefaults());
//
//        httpSecurity.csrf(csrf -> csrf.disable());
//        httpSecurity.formLogin(formLogin -> formLogin.disable());
//        httpSecurity.logout(logout -> logout.disable());
//        httpSecurity.httpBasic(httpBasic -> httpBasic.disable());
//
//        httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
//
//        return httpSecurity.build();
//    }
//}
