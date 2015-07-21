package br.messora.matheus.app.stream;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class StreamImplTest {

    @Test
    public void should_return_true_if_stream_is_not_empty() {
        StreamImpl stream = new StreamImpl("A");

        assertTrue(stream.hasNext());
    }

    @Test
    public void should_return_false_if_stream_ended_when_hasNext() {
        StreamImpl stream = new StreamImpl("A");
        stream.getNext();

        assertFalse(stream.hasNext());
    }

}