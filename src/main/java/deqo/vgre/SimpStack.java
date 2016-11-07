package deqo.vgre;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21305878 on 04/11/2016.
 *
 * un commentaire répondant à l'exigence #1
 */
public class SimpStack implements SimpleStack {

    private Stack<Item> pile;

    public SimpStack() {
        this.pile = new Stack<Item>();
    }

    @Override
    public boolean isEmpty() {
        return pile.isEmpty();
    }

    @Override
    public int getSize() {
        return pile.size();
    }

    @Override
    public void push(Item item) {
        pile.push(item);
        System.out.println("push successful !");
    }

    @Override
    public Item peek() throws EmptyStackException {
        return pile.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return pile.pop();
    }
}
