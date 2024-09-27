package collection.queue;

import java.util.Deque;

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
        Character[] array = desCharactersElements.toArray(new Character[0]);
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]);
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
