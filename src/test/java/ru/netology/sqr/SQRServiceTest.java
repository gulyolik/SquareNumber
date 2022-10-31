package ru.netology.sqr.;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @Test
    @CsvFileSource (files = "src/test/resources/SQRService.CSV")
    public int testRangeLimits(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.search(min, max);
        Assertions.assertEquals(expected, actual);
    }

}
