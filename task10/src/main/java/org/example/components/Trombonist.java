package org.example.components;

import org.example.interfaces.Musician;
import org.springframework.stereotype.Component;

@Component
public class Trombonist implements Musician {
    @Override
    public void doCoding() {
        System.out.println("Trombone sounds");
    }
}