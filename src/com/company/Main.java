package com.company;


public class Main {

    public static void main(String[] args) {

        Fish seabass = new Fish();
        seabass.species = "Sea Bass";
        seabass.maxsize = 10;
        seabass.minsize = 5;

        Fish catfish = new Fish();
        catfish.species = "Catfish";
        catfish.maxsize = 15;
        catfish.minsize = 10;

        Fish blobfish = new Fish();
        blobfish.species = "Blobfish";
        blobfish.maxsize = 20;
        blobfish.minsize = 9;

        Fish guppy = new Fish();
        guppy.species = "Guppy";
        guppy.maxsize = 3;
        guppy.minsize = 1;

        Fish angelfish = new Fish();
        angelfish.species = "Angelfish";
        angelfish.maxsize = 4;
        angelfish.minsize = 1;

        Fish largemouthbass = new Fish();
        largemouthbass.species = "Largemouth Bass";
        largemouthbass.maxsize = 15;
        largemouthbass.minsize = 5;

        Fish clownfish = new Fish();
        clownfish.species = "Clownfish";
        clownfish.maxsize = 4;
        clownfish.minsize = 2;

        Fish[] pond_o_fish = new Fish[20];
        pond_o_fish[0] = seabass;
        pond_o_fish[1] = seabass;
        pond_o_fish[2] = seabass;
        pond_o_fish[3] = seabass;
        pond_o_fish[4] = blobfish;
        pond_o_fish[5] = guppy;
        pond_o_fish[6] = guppy;
        pond_o_fish[7] = guppy;
        pond_o_fish[8] = catfish;
        pond_o_fish[9] = angelfish;
        pond_o_fish[10] = angelfish;
        pond_o_fish[11] = angelfish;
        pond_o_fish[12] = largemouthbass;
        pond_o_fish[13] = largemouthbass;
        pond_o_fish[14] = clownfish;
        pond_o_fish[15] = clownfish;
        pond_o_fish[16] = clownfish;
        pond_o_fish[17] = catfish;
        pond_o_fish[18] = catfish;
        pond_o_fish[19] = largemouthbass;

        int lenthoffishlist = pond_o_fish.length;

        int catchamount = 3;



        while (catchamount > 0) {

            int fishtyperand1 = (int) (Math.random() * lenthoffishlist);


            System.out.println(pond_o_fish[fishtyperand1].catchfish());

            catchamount = catchamount -1;
        }
    }
}
