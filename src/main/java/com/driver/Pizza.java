package com.driver;

public class Pizza {

    private int price;
    public int basePrice;
    public int extraCheesePrice;
    public int extraToppingsPrice;
    public int paperBagPrice;

    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isTakeAway;
    private boolean isBill;

    private String bill;

    public Pizza(Boolean isVeg) {
        // your code goes here
        if (isVeg) {
            this.basePrice = 300;
            this.extraToppingsPrice = 70;
        }
        else {
            this.basePrice = 400;
            this.extraToppingsPrice = 120;
        }
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;

        this.price = this.basePrice;
    }

    public Pizza() {
        this(false);
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!this.isExtraCheese) {
            this.price += this.extraCheesePrice;
            this.isExtraCheese = true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!this.isExtraToppings) {
            this.price += this.extraToppingsPrice;
            this.isExtraToppings = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (!this.isTakeAway) {
            this.price += this.paperBagPrice;
            this.isTakeAway = true;
        }
    }

    public String getBill() {
        // your code goes here
        if (!isBill) {
            this.bill = "Base Price Of The Pizza: " + this.basePrice + "\n";

            if (this.isExtraCheese)
                this.bill += "Extra Cheese Added: " + this.extraCheesePrice + "\n";

            if (this.isExtraToppings)
                this.bill += "Extra Toppings Added: " + this.extraToppingsPrice + "\n";

            if (this.isTakeAway)
                this.bill += "Paperbag Added: " + this.paperBagPrice + "\n";

            this.bill += "Total Price: " + this.price + "\n";

            this.isBill = true;
        }

        return this.bill;
    }
}
