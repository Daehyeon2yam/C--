public abstract class Phone {
    
    //추상 클래스 연습
    //필드
    public String owner;

    //생성자

    public Phone(String owner){
        this.owner=owner;
    }
    //메소드

    public void turnOn(){
        System.out.println("전원을 켭니다");
    }
    public void turnOff(){
        System.out.println("전원을 끕니다");
    }
}
