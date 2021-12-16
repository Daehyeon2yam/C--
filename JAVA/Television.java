public class Television {
    //정적 메소드 블록 선언
    static String company = "Samsung";
    static String model = "LCD";
    static String info;

    static{
        info = company + "-" + model;
    }
}
