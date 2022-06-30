package dictionary;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveableDictionary {

    private ArrayList<String> words;
    private ArrayList<String> translation;
    private String file;
    private Storer storer;

    public SaveableDictionary() {
        this.words = new ArrayList<>();
        this.translation = new ArrayList<>();
    }

    public SaveableDictionary(String file) {
        this.storer = new Storer();
        this.file = file;
        this.words = new ArrayList<>();
        this.translation = new ArrayList<>();
    }

    public void add(String words, String translation) {
        if (!this.words.contains(words) && !this.translation.contains(translation)) {
            this.words.add(words);
            this.translation.add(translation);
        }
    }

    public void delete(String word) {
        if (this.words.contains(word)) {
            this.translation.remove(this.words.indexOf(word));
            this.words.remove(word);
        } else if (this.translation.contains(word)) {
            this.words.remove(this.translation.indexOf(word));
            this.translation.remove(word);
        }
    }

    public String translate(String word) {
        if (this.words.contains(word)) {
            return this.translation.get(this.words.indexOf(word));
        } else if (this.translation.contains(word)) {
            return this.words.get(this.translation.indexOf(word));
        }
        return null;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.file))) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        StringBuilder dictionary = new StringBuilder();
        String row;
        for (int i = 0; i < this.words.size(); i++) {
            if (this.words.size() - 1 == i) {
                row = this.words.get(i) + ":" + this.translation.get(i);
            } else {
                row = this.words.get(i) + ":" + this.translation.get(i) + "\n";
            }
            dictionary.append(row);
        }
        try {
            this.storer.writeToFile(this.file, dictionary.toString());
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
