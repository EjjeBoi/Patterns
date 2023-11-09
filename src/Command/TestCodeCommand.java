package Command;

class TestCodeCommand implements Command {
    private Programmer programmer;

    TestCodeCommand(Programmer programmer) {
        this.programmer = programmer;
    }

    public void execute() {
        programmer.testCode();
    }
}