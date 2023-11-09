package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        ProgrammerFactory javaFactory = new JavaFactory();

        JavaProgrammer javaProgrammer = javaFactory.createJavaProgrammer();

        javaProgrammer.codeJava();

        ProgrammerFactory pythonFactory = new PythonFactory();
        PythonProgrammer pythonProgrammer = pythonFactory.createPythonProgrammer();
        pythonProgrammer.codePython();
    }
}
