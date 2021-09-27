package com.company;

public interface Observable {
    void SubscribeClients(Observer observer);
    void UnsubscribeClients(Observer observer);
    void NotifyAll();
}
