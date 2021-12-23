public class CarExample7 {
    
    public static void main(String[] args){
        Car7 car = new Car7();

        for(int i = 1; i <=5; i++){
            int problemLocation = car.run();
            if(problemLocation != 0){
                System.out.println(car.tires[problemLocation-1].location+"Hankook Tire로 교체");
                car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
            }
        }
    }
}
