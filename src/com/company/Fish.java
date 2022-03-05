package com.company;

public class Fish {
    String species;
    int minsize;
    int maxsize;

    public int catchsize () {
        int sizerange = this.maxsize - this.minsize +1;
        int random = (int) (Math.random() * sizerange);
        int size = random + this.minsize;
        return size;
    }
    public String catchfish () {
        int fishsize = this.catchsize();
        String fishsizereturn = String.valueOf(fishsize);
        String statement = "Caught a "+ this.species + " with a size of "+ fishsizereturn + "!";

        return statement;
    }


}
