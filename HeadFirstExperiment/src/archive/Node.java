package archive;

public class Node<T> {

    public T data;

    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("archive.Node.setData");
        this.data = data;
    }
}