package org.itstep.command;

public class Receiver {
    public Receiver() {
    }

    public void help() {
        System.out.println("Help executed");
    }
    public void echo(String input){
        System.out.println(input.replaceFirst("echo ", ""));
    }
    public void now(){
        System.out.println(System.currentTimeMillis());
    }
    public void exit(){
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
