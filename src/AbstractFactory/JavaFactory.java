package AbstractFactory;

class JavaFactory implements ProgrammerFactory {
    public JavaProgrammer createJavaProgrammer() {
        return new JavaProgrammerImpl();
    }

    public PythonProgrammer createPythonProgrammer() {
        return new NullProgrammer();
    }
}
