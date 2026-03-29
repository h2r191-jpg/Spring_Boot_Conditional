package ru.example.spring_boot_conditional.Config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.example.spring_boot_conditional.profile.DevProfile;
import ru.example.spring_boot_conditional.profile.ProductionProfile;
import ru.example.spring_boot_conditional.interfaces.SystemProfile;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {

        return new DevProfile();
    }
    @Bean
    @ConditionalOnProperty(name = "netology.profile.dev", havingValue = "false", matchIfMissing = true)
    public SystemProfile prodProfile() {

        return new ProductionProfile();
    }
}
