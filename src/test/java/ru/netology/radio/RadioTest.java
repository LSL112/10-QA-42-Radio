package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testPenultimateStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);

        radio.next();
        int actual = radio.getCurrentStationNumber();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLastStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.next();
        int actual = radio.getCurrentStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSecondStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(1);

        radio.prev();
        int actual = radio.getCurrentStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.prev();
        int actual = radio.getCurrentStationNumber();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPenultimateVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(9);

        radio.increaseVolume();
        int actual = radio.getCurrentSoundVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLastVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);

        radio.increaseVolume();
        int actual = radio.getCurrentSoundVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSecondVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(2);

        radio.decreaseVolume();
        int actual = radio.getCurrentSoundVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFirstVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);

        radio.decreaseVolume();
        int actual = radio.getCurrentSoundVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(11);

        radio.increaseVolume();
        int actual = radio.getCurrentSoundVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(12);

        int actual = radio.getCurrentStationNumber();
        int expected = actual;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-1);

        radio.decreaseVolume();
        int actual = radio.getCurrentSoundVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);

        int actual = radio.getCurrentStationNumber();
        int expected = actual;

        Assertions.assertEquals(expected, actual);
    }

}
