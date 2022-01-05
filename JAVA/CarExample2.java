public class CarExample2 {
    
    public static void main(String[] args){


        Car2 car1 = new Car2();

        System.out.println("car1.company: "+ car1.company);


        Car2 car2 = new Car2("자가용","빨강");

        System.out.println("car2.company: "+car2.company);
        System.out.println("car2.color:"+car2.color);
    }
}
