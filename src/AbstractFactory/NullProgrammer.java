package AbstractFactory;

class NullProgrammer implements JavaProgrammer, PythonProgrammer {
    public void codeJava() {
        System.out.println("Not a Java programmer");
    }

    public void codePython() {
        System.out.println("Not a Python programmer");
    }
}
