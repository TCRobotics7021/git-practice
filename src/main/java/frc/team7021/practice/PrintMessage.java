package frc.team7021.practice;

public class PrintMessage {
    public String getMessage() {
        return "Hello World.";
    }

    public static void main(String[] args) {
        PrintMessage printMessage = new PrintMessage();
        System.out.println(printMessage.getMessage());
    }
}
