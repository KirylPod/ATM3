package client;


import atm.Atm;
import atm.AtmEvents;
import client.AbstractClient;

import java.io.IOException;

public class Client extends AbstractClient {


    @Override
    public Client goToAtm(Atm atm, AtmEvents events) throws IOException {
        return super.goToAtm(atm, events);
    }

    @Override
    public void takeCard(Atm atm, AtmEvents events) throws IOException {
        super.takeCard(atm, events);
    }
}
