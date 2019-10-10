package com.kodilla;

public class Cannon {

    public boolean loaded;

    //fire method (+checking if Cannon is loaded)
    public void fire() {
        if (!loaded) {
            System.out.println("Cannon was not loaded! Loading a cannon...");
            loaded = true;
        }
        else {
            System.out.println("Bang!");
            loaded = false;
        }
    }


    public boolean getLoaded(){
        return loaded;
    }
}
