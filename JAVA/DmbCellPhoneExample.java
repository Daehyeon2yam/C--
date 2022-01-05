public class DmbCellPhoneExample {
    
    public static void main(String[] args){

        //DmbCellphone 객체 생성

        DmbCellphone DmbCellphone = new DmbCellphone("자바폰","검정",10);

        //Cellphone으로부터 상속 받은 필드들

        System.out.println("모델"+DmbCellphone.model);
        System.out.println("색상"+DmbCellphone.color);

        //DmbCellphone의 필드

        System.out.println("채널"+DmbCellphone.channel);

        //Cellphone으로부터 상속받은 메소드 호출

        DmbCellphone.powerOn();
        DmbCellphone.bell();
        DmbCellphone.sendVoice("여보세요");
        DmbCellphone.receiveVoice("안녕하세요 저는 홍길똥이에용");
        DmbCellphone.sendVoice("아 방가방가요");
        DmbCellphone.hangUp();

        //DmbCellphone 의 메소드 호출

        DmbCellphone.turnOnDmb();
        DmbCellphone.changeChannelDmb(12);
        DmbCellphone.turnOffDmb();

    }
}
