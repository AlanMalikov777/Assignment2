package com.company;

import java.util.List;

public class Client implements Observer{
    private String name;
    public Client(String name){
        this.name=name;
    }

    @Override
    public void update(List<String> news) {
        System.out.println("Hello "+ name+"."+" We have a new price!\n" + news );
    }
}