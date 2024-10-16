package by.bsuir.levelup.lesson01part2;

import by.bsuir.levelup.lesson01.QuadraticEquation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private final PrintStream standardOut = System.out;

    private final InputStream standardIn = System.in;

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "Hi, Hello",
                    "By, Good bye",
                    "How are you, How are you doing",
                    "affasnlasjfhasflfjlsaflsafjk", "Wtf?"
            }
    )
    void test(String input, String output) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Greeting.main(new String[]{});

        assertEquals(output, outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

}