public class DriverExample {
    
    public static void main(String[] args){
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi); //버스랑 택시의 자동 타입 변환이 이뤄졌다. 
    }
}
