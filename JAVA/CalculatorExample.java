public class CalculatorExample {
    

    public static void main(String[] args){

        Calculator myCala = new Calculator();
        myCala.powerOn();

        int result1 = myCala.plus(5,6);
        System.out.println("result1:"+result1);

        byte x = 10;
        byte y = 4;

        double result2 = myCala.divide(x,y);
        System.out.println("result2:"+result2);

        myCala.powerOff();

    }
}