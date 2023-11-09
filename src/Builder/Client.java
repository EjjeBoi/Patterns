package Builder;

public class Client {
    public static void main(String[] args) {

        Programmer programmer = new Programmer.Builder()
                .setName("Ibragim")
                .setExperienceLevel(3)
                .setProgrammingLanguage("Java")
                .build();

        System.out.println("Programmer: " + programmer.getName() +
                ", Experience Level: " + programmer.getExperienceLevel() +
                ", Programming Language: " + programmer.getProgrammingLanguage());
    }
}