package org.example.components;

import org.example.interfaces.Musician;
import org.springframework.stereotype.Component;

@Component
public class Guitarist implements Musician {
    @Override
    public void doCoding() {
        System.out.println("Guitar sounds");
    }
}