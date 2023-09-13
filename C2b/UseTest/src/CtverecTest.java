import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CtverecTest {

    @org.junit.jupiter.api.Test
    void getA() {
        Ctverec c = new Ctverec(3);
        assertEquals(3, c.getA(),"Spatna strana");
    }

    @org.junit.jupiter.api.Test
    void setA() {
        fail("Not implemented yet");
    }
}