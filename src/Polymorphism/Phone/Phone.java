package Polymorphism.Phone;

/*
4. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()
 1. create an interface named downloadable:
            variable: boolean downloadable
            abstract method: download();
    2. create an interface named AndroidApps that can inherit from downloadable interface
            variable: AppStoreName
    3. create an interface named AppleApps that can inherit from downloadable interface
            variable: AppStoreName
 */
interface downloadable{

    boolean downloadable = true; // public static final
    void download(); // public abstract

}

interface AndroidApps extends downloadable{  // 2 variables, 1 abstract method
    String AppStoreName = "Android"; // public static final
}

interface AppleApps extends downloadable { // 2 var, 1 abstract method
    String AppStoreName = "Apple";  // public static final
}


public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber); //abstract method
    public abstract void calling(long phoneNumber); //abstract method

    public String toString(){ //constructor
        return "brand= " + brand + ", model= " + model + ", price= " + price + ", size= " + size;
    }
}
