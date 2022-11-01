package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/SQRService.CSV")
    public void testRangeLimits(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.search(min, max);
        Assertions.assertEquals(expected, actual);
    }

}
