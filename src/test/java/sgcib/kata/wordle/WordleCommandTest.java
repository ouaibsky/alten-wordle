package sgcib.kata.wordle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class WordleCommandTest {

    /**
     * TO BE ENHANCE ... OR NOT
     */
    @ParameterizedTest
    @CsvSource({
            "bravo,BRAVO",
    })
    void should_check_good_solution(String guess, String expected) {
        var wordle = new WordleCommand("BRAVO");
        assertThat(wordle.check(guess)).isEqualTo(expected);
    }

    /**
     * TO BE ENHANCE ... OR NOT
     */
    @ParameterizedTest
    @CsvSource({
            "WORDL,WORDL",
            "WORDLESSS,WORDL",
            "BAT,.....",
            "WO,WO...",
    })
    void should_check_worlds_with_wrong_length(String guess, String expected) {
        var wordle = new WordleCommand("WORDL");
        assertThat(wordle.check(guess)).isEqualTo(expected);
    }

    /**
     * TO BE ENHANCE ... OR NOT
     */
    @ParameterizedTest
    @CsvSource({
            "bbbbb,.....",
            "abbbb,A....",
            "babbb,.A...",
            "bbabb,..A..",
            "bbbab,...A.",
            "bbbba,....A",
    })
    void should_check_hidden_aaaaa(String guess, String expected) {
        var wordle = new WordleCommand("aaaaa");
        assertThat(wordle.check(guess)).isEqualTo(expected);
    }

    /**
     * TO BE ENHANCE ... OR NOT
     */
    @ParameterizedTest
    @CsvSource({
            "caccc,.a...",
            "ccacc,..a..",
            "cccac,...a.",
            "cccca,....a",
    })
    void should_check_hiddden_abbbb(String guess, String expected) {
        var wordle = new WordleCommand("abbbb");
        assertThat(wordle.check(guess)).isEqualTo(expected);
    }

    // Other test cases to be added or not !

}
