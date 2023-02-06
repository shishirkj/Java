public class Car {
    //Fields or variables
    public String name;
    //public String name = " ";       // to avoid null or exception we initialise it to empty String, String name = "" ;
    int price;

    public void carName(){  // Methods
        //  or use   public void carName(String name){
           this.name = name;                               // we use this.  when name of parameter is same as field.
    }
    /*      The keyword "this" in Java is used to refer to the current instance of an object. It is used to access instance variables and methods, and also to refer to the object itself when passing it as an argument to a method. Using "this" helps disambiguate between instance variables and local variables with the same name, and allows the programmer to clearly specify which variables and methods belong to the current object.
    */

    public void carPrice() {
        this.price = price;
    }

}
// Main.java and Car.java
