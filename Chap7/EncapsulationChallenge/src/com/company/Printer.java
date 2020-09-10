package com.company;

public class Printer {

    private int tonalLevel;
    private int pagePrinted;
    private boolean duplex;

    public Printer(int tonalLevel, boolean duplex) {
        if (tonalLevel > -1 && tonalLevel <= 100){
            this.tonalLevel = tonalLevel;
        } else {
            this.tonalLevel = -1;
        }

        this.duplex = duplex;
        this.pagePrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount >0 && tonerAmount <= 100) {
            if (this.tonalLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonalLevel += tonerAmount;
            return this.tonalLevel;
        } else {
            return -1;
        }
    }

    public int printPages (int pages){
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagePrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }
}
