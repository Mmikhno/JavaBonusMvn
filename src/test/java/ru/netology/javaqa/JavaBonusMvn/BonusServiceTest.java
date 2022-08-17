package ru.netology.javaqa.JavaBonusMvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/sourceData.csv")

    public void bonusServiceTestWithParams(int expected, long amount, boolean isRegistered) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, isRegistered);
        Assertions.assertEquals(expected, actual);
    }

}
