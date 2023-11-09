package Proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Загружаем проект: " + url);
    }

    @Override
    public void run() {
        System.out.println("Осуществляем запуск проекта: " + url);

    }
}
