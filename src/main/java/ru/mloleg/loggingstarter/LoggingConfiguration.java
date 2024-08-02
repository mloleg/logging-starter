package ru.mloleg.loggingstarter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import ru.mloleg.loggingstarter.aspect.LogExecutionTimeAspect;

@AutoConfiguration
public class LoggingConfiguration {

    @Bean
    public LogExecutionTimeAspect logExecutionTimeAspect() {
        return new LogExecutionTimeAspect();
    }
}
