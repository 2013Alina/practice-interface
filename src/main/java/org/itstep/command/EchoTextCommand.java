package org.itstep.command;

public class EchoTextCommand implements Command {
    private Receiver theReceiver;

    public EchoTextCommand(Receiver receiver){
        this.theReceiver = receiver;
    }


    @Override
    public void execute(String... args) {
        theReceiver.echo(args[0]);
    }
}
