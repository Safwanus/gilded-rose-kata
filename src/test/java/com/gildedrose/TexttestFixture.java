package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

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

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
