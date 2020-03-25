package ru.netology.statistic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 13 };
        long expected = 13;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}
