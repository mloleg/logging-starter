package ru.mloleg.loggingstarter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import ru.mloleg.loggingstarter.aspect.LogExecutionTimeAspect;
import ru.mloleg.loggingstarter.filter.LoggingAdvice;
import ru.mloleg.loggingstarter.filter.LoggingFilter;

@AutoConfiguration
public class LoggingConfiguration {

    @Bean
    public LogExecutionTimeAspect logExecutionTimeAspect() {
        return new LogExecutionTimeAspect();
    }

    @Bean
    public LoggingAdvice loggingAdvice() {
        return new LoggingAdvice();
    }

    @Bean
    public LoggingFilter loggingFilter() {
        return new LoggingFilter();
    }
}
