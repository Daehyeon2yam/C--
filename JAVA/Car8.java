public class Car8 {
    Tire2 frontLeftTire = new HankookTire2();
    Tire2 frontRighTire = new HankookTire2();
    Tire2 backLeftTire = new HankookTire2();
    Tire2 backRightTire = new HankookTire2(); //인터페이스 타입 필드 선언 및 초기 구현 객체 대입
    
    void run(){
        frontLeftTire.roll();
        frontRighTire.roll();
        backLeftTire.roll();
        backRightTire.roll();  //인터페이스에서 설명된 Roll 호출
    }
}
