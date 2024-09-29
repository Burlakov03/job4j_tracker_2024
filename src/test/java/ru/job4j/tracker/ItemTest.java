package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

class ItemTest {
    @Test
    public void whenListItemSortAscByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "first"),
                new Item(2, "second"),
                new Item(3, "third"),
                new Item(4, "fourth")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(1, "first"),
                new Item(4, "fourth"),
                new Item(2, "second"),
                new Item(3, "third")
        );
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenListItemSortDescByName() {
        List<Item> items = Arrays.asList(
                new Item(1, "first"),
                new Item(2, "second"),
                new Item(3, "third"),
                new Item(4, "fourth")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "third"),
                new Item(2, "second"),
                new Item(4, "fourth"),
                new Item(1, "first")
        );
        assertThat(items).isEqualTo(expected);
    }
}