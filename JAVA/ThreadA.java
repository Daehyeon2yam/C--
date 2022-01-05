public class ThreadA extends Thread{

    public ThreadA(){
        setName("대현이얌");
    }
    public void run(){
        for(int i = 0; i<2 ; i++){
            System.out.println(getName()+"가 출력한내용");
        }
    }
}
