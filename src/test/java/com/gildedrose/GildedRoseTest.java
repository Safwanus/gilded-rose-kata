package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

    @Test
    void sellInMinus1Test(){

    }

    @Test
    void qualityPlusTest(){

    }

    @Test
    void qualityMinusTest(){

    }


    @Test
    void updateQualityTest() {
        Item[] items = new Item[] {
                new Item("Aged Brie", 5, 5) ,
                new Item("Aged Brie", -1, 1) ,
                new Item("Aged Brie", 0, 49) ,
                new Item("Aged Brie", 0, 50) ,
                new Item("Aged Brie", 2, 0),

                new Item("Sulfuras, Hand of Ragnaros", 10, 80) ,
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),

                new Item("Backstage passes to a TAFKAL80ETC concert", 12, 30) ,
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 30) ,
                new Item("Backstage passes to a TAFKAL80ETC concert", 8, 30) ,
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30) ,
                new Item("Backstage passes to a TAFKAL80ETC concert", 3, 30) ,
                new Item("Backstage passes to a TAFKAL80ETC concert", 3, 49) ,
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 30) ,
                new Item("Backstage passes to a TAFKAL80ETC concert", -1, 30) ,
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),

                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item ("Produit random", 2, 0),
                new Item("Un autre produit", 5, 30) ,
                new Item("Un autre produit", -2, 30) ,

                new Item("Conjured", 3, 6),
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        String resultAtempt = "Aged Brie, 4, 6\n" +
                "Aged Brie, -2, 3\n" +
                "Aged Brie, -1, 50\n" +
                "Aged Brie, -1, 50\n" +
                "Aged Brie, 1, 1\n" +
                "Sulfuras, Hand of Ragnaros, 10, 80\n" +
                "Sulfuras, Hand of Ragnaros, 0, 80\n" +
                "Sulfuras, Hand of Ragnaros, -1, 80\n" +
                "Backstage passes to a TAFKAL80ETC concert, 11, 31\n" +
                "Backstage passes to a TAFKAL80ETC concert, 9, 32\n" +
                "Backstage passes to a TAFKAL80ETC concert, 7, 32\n" +
                "Backstage passes to a TAFKAL80ETC concert, 4, 33\n" +
                "Backstage passes to a TAFKAL80ETC concert, 2, 33\n" +
                "Backstage passes to a TAFKAL80ETC concert, 2, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, -1, 0\n" +
                "Backstage passes to a TAFKAL80ETC concert, -2, 0\n" +
                "Backstage passes to a TAFKAL80ETC concert, 14, 21\n" +
                "Backstage passes to a TAFKAL80ETC concert, 9, 50\n" +
                "Backstage passes to a TAFKAL80ETC concert, 4, 50\n" +
                "+5 Dexterity Vest, 9, 19\n" +
                "Elixir of the Mongoose, 4, 6\n" +
                "Produit random, 1, 0\n" +
                "Un autre produit, 4, 29\n" +
                "Un autre produit, -3, 28\n" +
                "Conjured, 2, 4";

        String delim = "[\n]+";
        String[] tokens = resultAtempt.split(delim);

        for (int i = 0; i<items.length; i++){
            assertThat(items[i].toString(),is(tokens[i]));
        }
    }


}
