package Udemy_Package.Polymorphism.Example4;

public class Hamburger {
    private String name, meat, breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name+" hamburger "+" on a "+this.breadRollType+" roll"+" price is "+this.price);

        if(this.addition1Name !=null){
            hamburgerPrice +=this.addition1Price;
            System.out.println("Added "+this.addition1Name+" for an extra "+this.addition1Name);
        }
        if(this.addition2Name !=null){
            hamburgerPrice +=this.addition2Price;
            System.out.println("Added "+this.addition2Name+" for an extra "+this.addition2Name);
        }if(this.addition3Name !=null){
            hamburgerPrice +=this.addition3Price;
            System.out.println("Added "+this.addition3Name+" for an extra "+this.addition3Name);
        }
        if(this.addition1Name !=null){
            hamburgerPrice +=this.addition1Price;
            System.out.println("Added "+this.addition1Name+" for an extra "+this.addition1Name);
        }
        return hamburgerPrice;

    }

}