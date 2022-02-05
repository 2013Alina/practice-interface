package org.itstep.command;

public class NowCommand implements Command{
    private Receiver theReceiver;

    public NowCommand(Receiver receiver){
        this.theReceiver = receiver;
    }
    @Override
    public void execute(String... args) {
      theReceiver.now();
    }
}
