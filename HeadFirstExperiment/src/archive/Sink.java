package archive;

interface Sink<T> {
    void flush(T t);

}
