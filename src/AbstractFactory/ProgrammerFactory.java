package AbstractFactory;

interface ProgrammerFactory {
    JavaProgrammer createJavaProgrammer();
    PythonProgrammer createPythonProgrammer();
}
