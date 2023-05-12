package concepts;

public interface TestDefault {
    default double getNumber(){
        return Math.random();
    }

    static void someoperation(){
        System.out.println("Doing some operation");
    }
    void anotheroperation();
}
