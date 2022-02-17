package demo;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class helloWorldTest {
    @DisplayName("Simple test")
    @Test
    public void hi(){
        assertEquals("hello Jakkapat",new helloworld().hi("Jakkapat"));
    }
}
