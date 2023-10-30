package archive;

public class MyNode extends Node<Integer> {
    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("archive.MyNode.setData");
        super.setData(data);
    }
}