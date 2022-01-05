public class KoreanExample {
    

    public static void main(String[] args){
        Korean k1 = new Korean("박자바","010-2222");
        Korean k2 = new Korean( "바바바바", "00202020");

        System.out.println("k1.name , ssn : "+k1.name+"  "+k1.ssn);
        System.out.println("k2.name,ssn"+ k2.name+"  "+k2.ssn);

    }
}
