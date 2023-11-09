package Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("Оба объекта являются одним и тем же экземпляром singleton.");
        } else {
            System.out.println("Объект не singleton.");
        }
    }
}