package com.kingidee.kotlingraphql

import com.auth0.spring.security.api.JwtWebSecurityConfigurer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import java.util.*

@EnableWebSecurity
@Configuration
class SecurityConfig : WebSecurityConfigurerAdapter() {

    @Value(value = "\${auth0.apiAudience}")
    private lateinit var apiAudience: String
    @Value(value = "\${auth0.issuer}")
    private lateinit var issuer: String

    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource {
        val configuration = CorsConfiguration()
        configuration.allowedOrigins = Arrays.asList("http://localhost:9000")
        configuration.allowCredentials = true
        configuration.addAllowedHeader("Authorization")
        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", configuration)
        return source
    }


    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.cors()
        JwtWebSecurityConfigurer
                .forRS256(apiAudience, issuer)
                .configure(http)
                .authorizeRequests()
                .antMatchers("/graphql").authenticated()
    }
}