package it.petrovich.model;

import it.petrovich.model.extended.Accept;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestSerialization {

    @Test
    void simpleTest() {
        val accept = new Accept();
        System.out.println(accept);
        assertNotNull(accept);
    }
}
