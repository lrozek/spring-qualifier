package pl.lrozek.spring.qualifier.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceProvider {

    @Bean
    public Service serviceNo1() {
        return new ServiceImpl( 10L );
    }

}
