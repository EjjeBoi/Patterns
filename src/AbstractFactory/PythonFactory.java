package AbstractFactory;

class PythonFactory implements ProgrammerFactory {
    public JavaProgrammer createJavaProgrammer() {
        return new NullProgrammer();
    }

    public PythonProgrammer createPythonProgrammer() {
        return new PythonProgrammerImpl();
    }
}
