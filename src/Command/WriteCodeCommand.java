package Command;

class WriteCodeCommand implements Command {
    private Programmer programmer;

    WriteCodeCommand(Programmer programmer) {
        this.programmer = programmer;
    }

    public void execute() {
        programmer.writeCode();
    }
}