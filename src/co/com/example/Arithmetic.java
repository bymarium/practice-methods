package co.com.example;

public class Arithmetic {
    //Class attributes
    int a;
    int b;

    //method
    public void add(){
        int result = a + b;
        System.out.println("result = " + result);
    }

    public int addWithReturn(){
        /* int result = a + b;
        return result; */
        return a + b;
    }

    public int addWithArguments(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        // return a + b;
        return this.addWithReturn();
    }
}
