public class SupersonicAirplane extends Airplane{

    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override //메소드 재정의
    public void fly(){
        if(flyMode == SUPERSONIC){
            System.out.println("초음속비행합니다");
        }else{
            //Airplanle 객체의 Fly 메소드 호출
            super.fly();
        }
    }
}     