package ru.mloleg.loggingstarter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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
    @ConditionalOnProperty(prefix = "logs", name = "loggingAdvice", havingValue = "true")
    public LoggingAdvice loggingAdvice() {
        return new LoggingAdvice();
    }

    @Bean
    @ConditionalOnProperty(prefix = "logs", name = "loggingFilter", havingValue = "true")
    public LoggingFilter loggingFilter() {
        return new LoggingFilter();
    }
}
