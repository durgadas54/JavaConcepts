package concepts.inheritance;

public class main {
    public static void main(String[] args) {
        doSomething(new Custom());
    }
    public static  void doSomething(base b){
        System.out.println(b instanceof Custom);
    }
}
