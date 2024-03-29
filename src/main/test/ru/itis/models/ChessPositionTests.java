package ru.itis.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Тесты класса ChessPosition
 *
 * @author Ilshat Rizvanov
 **/
class ChessPositionTests {
    @Test
    void getFromStringPosition_shouldCorrectlyTransformXPosition() {
        assertEquals(51, ChessPosition.fromStringPosition("AZ1").getX());
    }

    @Test
    void getFromStringPosition_shouldCorrectlyTransformYPosition() {
        assertEquals(0, ChessPosition.fromStringPosition("AZ1").getY());
    }

    @Test
    void getFromStringPosition_withInvalidPosition_shouldThrowException() {
        assertThrows(Exception.class, () -> ChessPosition.fromStringPosition("Z-3"));
    }
}
