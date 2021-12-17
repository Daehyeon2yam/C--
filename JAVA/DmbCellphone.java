public class DmbCellphone extends Cellphone{

    //필드

    int channel;

    //생성자

    DmbCellphone(String model, String color, int channel){
        this.model = model;
        this.color=  color; // Cellphone으로부터 상속 받은 필드들
        this.channel= channel;
    }
    //메소드

    void turnOnDmb(){
        System.out.println("채널"+channel+"번 방송 수신을 시작합니다");
    }
    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("채널"+channel+"번으로 바꿉니다");
    }
    void turnOffDmb(){
        System.out.println("DMB 방송 수신을 종료합니다");
    }
}
