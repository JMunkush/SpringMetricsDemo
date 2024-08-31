package io.munkush.app;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricConfiguration {

    @Bean
    public MeterBinder meterBinder(){
        return meterRegistry -> {
            Counter.builder("greetings_count")
                    .description("Количество обращении")
                    .register(meterRegistry);
        };
    }
}
