public class StatePrintThread extends Thread{

    private Thread targetThread;
    
    public StatePrintThread(Thread targeThread){
        this.targetThread = targeThread; //상태를 조사할 스레드
    }

    public void run(){
        while(true){
            Thread.State state = targetThread.getState(); //스레드의 상태 얻기
            System.out.println("타겟 스레드 상태 : "+ state);
            if(state == Thread.State.NEW){
                targetThread.start();  //객체 생성 상태일경우 실행 대기 상태로 만듬
            }
            if(state == Thread.State.TERMINATED){
                break; //종료상태일경우 break로 끝낸다
            }
            try{
                //0.5초간 일시 정지
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }

}