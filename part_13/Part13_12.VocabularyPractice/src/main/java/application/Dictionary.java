package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary;
    private List<String> words;

    public Dictionary() {
        this.dictionary = new HashMap<>();
        this.words = new ArrayList<>();
    }

    public String get(String word) {
        return this.dictionary.get(word);
    }

    public void add(String word, String translation) {
        if (!this.words.contains(word)) {
            this.words.add(word);
        }
        this.dictionary.put(word, translation);
    }

    public String getRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(this.words.size());
        return this.words.get(randomNumber);
    }
}
