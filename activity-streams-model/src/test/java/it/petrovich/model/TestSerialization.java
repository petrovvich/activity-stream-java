package it.petrovich.model;

import it.petrovich.model.core.BaseObject;
import it.petrovich.model.extended.Accept;
import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSerialization {

    @Test
    void simpleTest() {
        val accept = new Accept();
        accept.setActor(new BaseObject());

        assertAll(
                () -> assertNotNull(accept.getType()),
                () -> assertEquals("Accept", accept.getType()),
                () -> assertNotNull(accept.getActor())
        );
    }
}
