package Java_OOP.Inheritance.StackOfStrings;
import java.util.ArrayList;
import java.util.List;
public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        if (this.data.isEmpty()) {
            throw new UnsupportedOperationException("Stack is empty");
        }
       String element=this.data.getLast();
        this.data.remove(element);
        return element;
    }

    public String peek() {
        if (this.data.isEmpty()) {
            throw new UnsupportedOperationException("Stack is empty");
        }
        return this.data.getLast();
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }
}
