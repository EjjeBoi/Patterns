package Command;

public class Client {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        Command writeCode = new WriteCodeCommand(programmer);
        Command testCode = new TestCodeCommand(programmer);

        ProjectManager projectManager = new ProjectManager();

        projectManager.setCommand(writeCode);

        projectManager.executeCommand();

        projectManager.setCommand(testCode);

        projectManager.executeCommand();
    }
}
