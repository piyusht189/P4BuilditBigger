package com.example;
import java.util.Random;
public class Joker {

    public String tellJoke() {
        Random random = new Random();
        String joke;
        switch (random.nextInt(3)) {
            case 0:
                joke = "This is a funny joke!";
                break;
            case 1:
                joke = "This is a super funny joke!!";
                break;
            default:
                joke = "This is a super awesome funny joke!!!";
                break;
        }
        return joke;
    }
    }

