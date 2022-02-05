package org.itstep.command;

public class Invoker {
    private Command echoCommand;
    private Command exitCommand;
    private Command helpCommand;
    private Command nowCommand;

    public Invoker(Command echoCommand, Command exitCommand, Command helpCommand, Command nowCommand) {
        this.echoCommand = echoCommand;
        this.exitCommand = exitCommand;
        this.helpCommand = helpCommand;
        this.nowCommand = nowCommand;
    }

    public void echo(String input) {
        echoCommand.execute(input);
    }

    public void exit(String... args) {
        exitCommand.execute();
    }

    public void help() {
        helpCommand.execute();
    }

    public void now() {
        nowCommand.execute();
    }
}
