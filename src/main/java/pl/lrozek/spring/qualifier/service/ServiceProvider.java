package pl.lrozek.spring.qualifier.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceProvider {

    @Qualifier("1")
    @Bean
    public Service serviceNo1() {
        return new ServiceImpl( 10L );
    }

    @Qualifier("2")
    @Bean
    public Service serviceNo2() {
        return new ServiceImpl( 5L );
    }

}
