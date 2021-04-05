package snackBar;

public class Main{
    public static void main(String[] args) {
        workWithData();
    }
    private static void workWithData() {
        Customer Jane = new Customer("Jane", 45.25);
        Customer Bob = new Customer("Bob", 33.14);

        VendingMachine Food = new VendingMachine("Food");
        VendingMachine Drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");

        Snack Chips = new Snack("Chips", 36, 1.75, 0);
        Snack ChocolateBar = new Snack("Chocolate Bar", 36, 1.00, 0);
        Snack Pretzel = new Snack("Pretzel", 30, 2.00, 0);

        Snack Soda = new Snack("Soda", 24, 2.50, 1);
        Snack Water = new Snack("Water", 20, 2.75, 1);

        //jane buys 3 sodas
        Jane.buySnacks(7.50);
        System.out.println("Jane's Cash on hand is " + Jane.getCashOnHand());
        Soda.buySnack(3);
        System.out.println("Quantity of soda is " + Soda.getQuantity());

        //jane buys 1 pretzel
        Jane.buySnacks(2.00);
        System.out.println("Jane's Cash on hand is " + Jane.getCashOnHand());
        Pretzel.buySnack(1);
        System.out.println("Quantity of pretzel is " + Pretzel.getQuantity());

        //bob buys 2 sodas
        Bob.buySnacks(5.00);
        System.out.println("Bob's Cash on hand is " + Bob.getCashOnHand());
        Soda.buySnack(2);
        System.out.println("Quantity of soda is " + Soda.getQuantity());

        //Jane finds $10.00 and adds it to her cash on cashOnHand
        Jane.setCashOnHand(10.00);
        System.out.println("Jane's Cash on hand is " + Jane.getCashOnHand());

        //Jane buys 1 chocolate bar
        Jane.buySnacks(1.00);
        System.out.println("Jane's Cash on hand is " + Jane.getCashOnHand());
        ChocolateBar.buySnack(1);
        System.out.println("Quantity of chocolate bar is " + ChocolateBar.getQuantity());

        //add 12 more pretzels
        Pretzel.setQuantity(12);
        System.out.println("Quantity of pretzel is " + Pretzel.getQuantity());
        
        //bob buys 3 pretzels
        Bob.buySnacks(6.00);
        System.out.println("Bob's Cash on hand is " + Bob.getCashOnHand());
        Pretzel.buySnack(3);
        System.out.println("Quantity of pretzel is " + Pretzel.getQuantity());


    }
}