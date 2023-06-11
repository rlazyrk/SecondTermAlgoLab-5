package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeekerTest {

    @Test
    void findAllWithWord() {
        String expected = "more.jpg more.jpeg more.gif ";
        String forTest = "more.jpg lake.jpg river.gif \n" +
                "tree.gif more.jpeg lake.gif river.jpeg \n " +
                "more.gif";
        Seeker seeker = new Seeker();
        String forTest2 = seeker.findAllWithWord(forTest, "more");
        assertEquals(expected,forTest2);
    }
}