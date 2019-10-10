package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class CannonsCollectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(CannonsCollectionApplication.class, args);

        Cannon cannon1 = new Cannon();
        Cannon cannon2 = new Cannon();
        Cannon cannon3 = new Cannon();
        Cannon cannon4 = new Cannon();
        Cannon cannon5 = new Cannon();

        //LinedList with cannons
        LinkedList<Cannon> cannons = new LinkedList<Cannon>();

        System.out.println("Starting loading cannons:\n");

        //adding cannons to LinkedList
        cannons.add(cannon1);
        cannons.add(cannon2);
        cannons.add(cannon3);
        cannons.add(cannon4);
        cannons.add(cannon5);

        //Loading Cannons using for loop.
        for(int n = 0; n < cannons.size(); n++) {
            if (!cannons.get(n).loaded){
                System.out.println("Loading Cannon #"+(n+1)+"....");
                cannons.get(n).loaded=true;
            }
        }

        System.out.println("\nStarting shooting:\n");

        //Starting shootning..
        for(Cannon c: cannons) {
            c.fire();
        }

        System.out.println("\nStarting shooting again:\n");

        //Loading the Cannons again using fire() method...
        for(Cannon c: cannons) {
            c.fire();
        }

    }

}
