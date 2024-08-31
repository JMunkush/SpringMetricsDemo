package io.munkush.app;

import io.micrometer.core.instrument.MeterRegistry;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class MainController {


    private final MeterRegistry meterRegistry;


    @GetMapping("/greetings/{name}")
    public String greetings(@PathVariable String name){

        this.meterRegistry.counter("greetings_count", List.of()).increment();

        return "Hello, " + name + " !!!";
    }
}
