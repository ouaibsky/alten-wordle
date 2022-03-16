package sgcib.kata.wordle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class WordleCommandTest {

    private WordleCommand wordle = new WordleCommand("WORDLE");


    /**
     * TO BE ENHANCE ... OR NOT
     */
    @ParameterizedTest
    @CsvSource({
            "WORDLESSS,?????",
            "BAR,?????",
            "WO???",
    })
    void should_check_worlds_with_wrong_length(String word, String response) {
        assertThat(wordle.check(word)).isEqualTo(response);
    }

    /**
     * TO BE ENHANCE ... OR NOT
     */
    @ParameterizedTest
    @CsvSource({
            "WORDLESSS,?????",
            "BAR,?????",
            "WO???",
    })
    void should_check_regular_words(String word, String response) {
        assertThat(wordle.check(word)).isEqualTo(response);
    }
}
