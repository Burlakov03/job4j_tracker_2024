package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final ArrayList<Item> items = new ArrayList<>(100);
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        size++;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        ArrayList<Item> rsl = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            if (items.get(i).getName().equals(key)) {
                rsl.add(items.get(i));
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean results = index != -1;
        if (results) {
            item.setId(id);
            items.set(index, item);
        }
        return results;
    }

    public void delete(int id) {
        items.remove(id);
    }
}