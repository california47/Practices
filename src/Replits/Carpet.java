package Replits;

public class Carpet {
    //do not change -- Start
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below
    public Carpet(){
        width = 300;
        length = 300;
        totalPrice = 200;
        isPersian = false;
        unitPrice = 0;
    }

    public Carpet(double width, double length, double unitPrice, double totalPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.isPersian = isPersian;

        totalPrice = (width + length) * unitPrice;
        if(isPersian) totalPrice +=200;
    }







}
