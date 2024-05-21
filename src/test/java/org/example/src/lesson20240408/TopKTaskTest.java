package org.example.src.lesson20240408;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.src.lesson20240408.TopKTask.topKWithPriorityQueue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TopKTaskTest {
    private List<TopKTask.Item> items;

    @BeforeEach
    public void setItems(){
        items = Arrays.asList(
                new TopKTask.Item("Book", 100),
                new TopKTask.Item("Toy1", 50),
                new TopKTask.Item("Toy2", 50),
                new TopKTask.Item("Toy3", 12),
                new TopKTask.Item("Toy4", 32),
                new TopKTask.Item("Toy5", 23),
                new TopKTask.Item("Toy6", 50),
                new TopKTask.Item("Doll", 25)
        );
    }

    @Test
    public void testTopKWithPriorityQueue() {
        List<TopKTask.Item> expected3 = Arrays.asList(
                new TopKTask.Item("Toy3", 12),
                new TopKTask.Item("Toy5", 23),
                new TopKTask.Item("Doll", 25)
        );

        List<TopKTask.Item> expected5 = Arrays.asList(
                new TopKTask.Item("Toy3", 12),
                new TopKTask.Item("Toy5", 23),
                new TopKTask.Item("Doll", 25),
                new TopKTask.Item("Toy4", 32),
                new TopKTask.Item("Toy2", 50)
        );

        List<TopKTask.Item> result3 = topKWithPriorityQueue(items, 3);
        List<TopKTask.Item> result5 = topKWithPriorityQueue(items, 5);

        assertEquals(expected3.size(), result3.size());
        for (int i = 0; i < expected3.size(); i++) {
            assertEquals(expected3.get(i).name, result3.get(i).name);
            assertEquals(expected3.get(i).price, result3.get(i).price);
        }

        assertEquals(expected5.size(), result5.size());
        for (int i = 0; i < expected5.size(); i++) {
           assertEquals(expected5.get(i).name, result5.get(i).name);
            assertEquals(expected5.get(i).price, result5.get(i).price);
        }
    }
}