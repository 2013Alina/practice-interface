package org.itstep.command;

public class ExitCommand implements Command {
    private Receiver theReceiver;

    public ExitCommand(Receiver receiver) {
        this.theReceiver = receiver;
    }


    @Override
    public void execute(String... args) {
        theReceiver.exit();

    }
}
