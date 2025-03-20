package ru.job4j.di.annotation;

import org.springframework.stereotype.Component;
@Component
public class Bird implements Pet<Bird>{
    @Value("${bird.name:simpleBird}")
    private String name;
    private String name = "Bird";

    @Override
    public String print() {
        return "Bird name = %s".formatted(name);
    }
}
