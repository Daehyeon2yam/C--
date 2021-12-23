public class CarExample8 {
    
    public static void main(String[] args){
        Car8 mycar = new Car8();

        mycar.run();

        mycar.frontLeftTire = new KumhoTire2();
        mycar.frontRighTire = new KumhoTire2();

        mycar.run();

    }
}
