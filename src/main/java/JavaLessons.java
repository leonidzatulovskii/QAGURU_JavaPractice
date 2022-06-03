public class JavaLessons{

    public static void main(String[] args) {

        int eggsAvailable = (int)(Math.random() * 50 + 0);
        int eggsMustBe = 30;
        int eggsToBuy = eggsMustBe - eggsAvailable;
        int milkBottlesAvailable = (int)(Math.random() * 5 + 0);
        int milkBottlesMustBe = 3;
        int milkBottlesToBuy = milkBottlesMustBe - milkBottlesAvailable;
        int breadAvailable = (int)(Math.random() * 3 + 0);
        int breadMustBe = 2;
        int breadToBuy = breadMustBe - breadAvailable;
        float eggPrice = 0.2F;
        float milkPrice = 2.0F;
        float breadPrice = 1.5F;
        String goodsToBuy = "You need to buy ";
        float totalAmount = 0.0F;

        if(eggsToBuy > 0 && milkBottlesToBuy > 0 && breadToBuy > 0) {
            goodsToBuy += eggsToBuy + " eggs, " + milkBottlesToBuy + " milk bottles, " + breadToBuy + " loafs of bread";
            totalAmount = (eggsToBuy * eggPrice) + (milkBottlesToBuy * milkPrice) + (breadToBuy * breadPrice);
        } else if(eggsToBuy <= 0 && milkBottlesToBuy > 0 && breadToBuy > 0) {
            goodsToBuy += milkBottlesToBuy + " milk bottles, " + breadToBuy + " loafs of bread";
            totalAmount = (milkBottlesToBuy * milkPrice) + (breadToBuy * breadPrice);
        } else if(eggsToBuy <= 0 && milkBottlesToBuy <= 0 && breadToBuy > 0) {
            goodsToBuy += breadToBuy + " loafs of bread";
            totalAmount = (breadToBuy * breadPrice);
        } else if(eggsToBuy <= 0 && milkBottlesToBuy > 0 && breadToBuy <= 0) {
            goodsToBuy +=milkBottlesToBuy + " milk bottles";
            totalAmount = (milkBottlesToBuy * milkPrice);
        } else if(eggsToBuy > 0 && milkBottlesToBuy <= 0 && breadToBuy <= 0) {
            goodsToBuy += eggsToBuy + " eggs";
            totalAmount = (eggsToBuy * eggPrice);
        } else if(eggsToBuy > 0 && milkBottlesToBuy <= 0 && breadToBuy > 0) {
            goodsToBuy += eggsToBuy + " eggs, " + breadToBuy + " loafs of bread";
            totalAmount = (eggsToBuy * eggPrice) + (breadToBuy * breadPrice);
        } else if(eggsToBuy > 0 && milkBottlesToBuy > 0 && breadToBuy <= 0) {
            goodsToBuy += eggsToBuy + " eggs, " + milkBottlesToBuy + " milk bottles";
            totalAmount = (eggsToBuy * eggPrice) + (milkBottlesToBuy * milkPrice);
        } else {
            goodsToBuy = "You need nothing";
        }

        switch (goodsToBuy) {
            case "You need nothing": System.out.println(goodsToBuy);
                break;
            default: System.out.println(goodsToBuy + ", it costs " + totalAmount + "$");
        }
    }
}
