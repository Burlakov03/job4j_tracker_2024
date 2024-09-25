package collection.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {
    private final Deque<Character> desCharactersElements;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> desCharactersElements, Deque<Character> evenElements) {
        this.desCharactersElements = desCharactersElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder result = new StringBuilder();
        int count = evenElements.size();
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                result.append(evenElements.peekFirst());
            }
            evenElements.poll();
        }
        return result.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        Iterator<Character> iterator = desCharactersElements.descendingIterator();
        while (iterator.hasNext()) {
            result.append(iterator.next());
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
