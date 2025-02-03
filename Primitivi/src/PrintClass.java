
public class PrintClass {


    private boolean value;
    
    private int numberInt;

    private short numberShort;

    private double numberDouble;

    private long numberLong;

    public void print (boolean value){
        this.value= value;
        System.out.println(value);
    }

    public void print (int numberInt){
        this.numberInt = numberInt;
        System.out.println(numberInt);
    }
    
    public void print (short numberShort){
        this.numberShort = numberShort;
        System.out.println(numberShort);
    }

    public void print (double numberDouble){
        this.numberDouble = numberDouble;
        System.out.println(numberDouble);
    }

    public void print (long numberLong){
        this.numberLong = numberLong;
        System.out.println(numberLong);
    }







}
