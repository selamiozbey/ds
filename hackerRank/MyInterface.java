package hackerRank;

public interface MyInterface {
    void myFunc1();

    default void myFunc2() {
        System.out.println("test");
    }

}
