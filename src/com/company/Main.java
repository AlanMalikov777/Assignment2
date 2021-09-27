package com.company;

public class Main {

    public static void main(String[] args) {
        //program that monitor cryptocurrencies prices
        Crypto bitcoin = new Crypto();
        Crypto dogecoin = new Crypto();
        Crypto etherium = new Crypto();

        Client client1=new Client("Alan");
        Client client2=new Client("Abay");
        Client client3=new Client("Sultan");
        Client client4=new Client("Damir");
        //clients will take news only after subscribing to bitcoin or other crypto objects,
        //because of that  first news will not be visible for users cause no one subscribed to bitcoin
        bitcoin.addNews("The bitcoin have increased to 9%");

        bitcoin.SubscribeClients(client1);//with this function c1 will available to watch the news about their crypto
        dogecoin.SubscribeClients(client2);
        etherium.SubscribeClients(client3);

        bitcoin.SubscribeClients(client4);
        dogecoin.SubscribeClients(client4);
        etherium.SubscribeClients(client4);


        bitcoin.addNews("The bitcoin have increased to 17%");
        System.out.println("--------------------------------------------------------");
        dogecoin.addNews("The dogecoin have decreased to 1.2%");
        System.out.println("--------------------------------------------------------");
        etherium.addNews("The etherium have increased to 2.2%");
        bitcoin.UnsubscribeClients(client4);//unsubscribe the client and client will not accept a news
        System.out.println("--------------------------------------------------------");

        bitcoin.addNews("The bitcoin have decreased to 1.9%");
        System.out.println("--------------------------------------------------------");

        dogecoin.UnsubscribeClients(client2);
        dogecoin.UnsubscribeClients(client4);
        dogecoin.addNews("The dogecoin have decreased to 1.5%");//no one subscriber and it is a reason why news is not visible to anyone


    }
}
