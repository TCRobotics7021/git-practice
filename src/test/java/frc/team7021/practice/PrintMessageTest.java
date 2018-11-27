package frc.team7021.practice;

import org.junit.Assert;
import org.junit.Test;

public class PrintMessageTest {
    @Test
    public void testGetMessage() {
        PrintMessage printMessage = new PrintMessage();
        Assert.assertEquals(printMessage.getMessage(), "Hello World!");
    }
}
