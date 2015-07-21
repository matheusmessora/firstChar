package br.messora.matheus.app.stream;

public class StreamImpl implements Stream {

    private int cursor;
    private final char[] stream;

    public StreamImpl(String stream) {
        this.stream = stream.toCharArray();
    }

    @Override
    public char getNext() {
        char result = stream[cursor];
        cursor++;
        return result;
    }

    @Override
    public boolean hasNext() {
        return cursor < stream.length;
    }
}
