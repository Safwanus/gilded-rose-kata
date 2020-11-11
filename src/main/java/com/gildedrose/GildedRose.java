package com.gildedrose;


class GildedRose {
    /***
     * Object Item
     * params suivants: String name, Int sellIn, Int quality
     * Setters pour : name, sellIn, quality
     * Getters pour : quality
     * Méthodes suivantes: SellInMinus1(), qualityPlus_LimitAt50(), qualityMinus_LimitAt0()
     * Overwrite les methods suivantes: ToSring()
     */
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            identifyItem(item);
        }
    }

    private void identifyItem(Item item) {
        switch (item.getName()) {
            case "Aged Brie":
                updateAgedBrie(item);
                break;
            case "Sulfuras, Hand of Ragnaros":
                updateSulfurasHOR(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                updateBackstagePTATC(item);
                break;
            case "Conjured":
                updateConjured(item);
                break;
            default:
                updateDefaultItem(item);
        }
    }

    private void updateDefaultItem(Item item) {
        if (item.getSellIn() >= 0) {
            item.qualityMinus_LimitAt0(1);
        } else item.qualityMinus_LimitAt0(2);
        item.sellInMinus1();
    }

    private void updateConjured(Item item) {
        item.qualityMinus_LimitAt0(2);
        item.sellInMinus1();
    }

    private void updateBackstagePTATC(Item item) {
        if (item.getSellIn() > 10) {
            item.qualityPlus_LimitAt0(1);
        } else if (item.getSellIn() > 5) {
            item.qualityPlus_LimitAt0(2);
        } else if (item.getSellIn() > 0) {
            item.qualityPlus_LimitAt0(3);
        } else item.setQuality(0);
        item.sellInMinus1();
    }

    private void updateSulfurasHOR(Item item) {
        item.setQuality(80);
    }

    private void updateAgedBrie(Item item) {
        if (item.getSellIn() >= 0) {
            item.qualityPlus_LimitAt0(1);
        } else {
            item.qualityPlus_LimitAt0(2);
        }
        item.sellInMinus1();
    }
}