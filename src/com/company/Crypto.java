package com.company;

import java.util.ArrayList;
import java.util.List;

public class Crypto implements Observable{
    private List<String>priceUpdates =new ArrayList<>();
    private List<Observer>clients =new ArrayList<>();

    public void addNews(String priceUpdate) {
        this.priceUpdates.add(priceUpdate);
        NotifyAll();
        this.priceUpdates.remove(priceUpdate);//remove after uploading a news
    }
    @Override
    public void NotifyAll() {
        for(Observer client:clients){
            client.update(this.priceUpdates);
        }
    }

    @Override
    public void SubscribeClients(Observer observer) {
        this.clients.add(observer);
    }

    @Override
    public void UnsubscribeClients(Observer observer) {
        this.clients.remove(observer);
    }
}
