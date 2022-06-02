package cjani.spring;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Betonomeshalka";
    }
}
