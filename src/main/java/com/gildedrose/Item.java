package com.gildedrose;

public class Item {

    private final String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() { return name; }

    public int getSellIn() {
        return sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void sellInMinus1() { this.sellIn -= 1; }

    public void qualityPlus_LimitAt0(int value) {
        if (this.quality <= (50 - value)) {
            this.quality += value;
        } else this.quality = 50;
    }

    public void qualityMinus_LimitAt0(int value) {
        if (this.quality >= value) {
            this.quality -= value;
        } else this.quality = 0;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }


}
