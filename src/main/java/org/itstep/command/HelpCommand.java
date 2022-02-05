package org.itstep.command;

public class HelpCommand implements Command {
    private Receiver theReceiver;

    public HelpCommand(Receiver receiver){
        this.theReceiver = receiver;
    }

    @Override
    public void execute(String... args) {
       theReceiver.help();
    }
}
