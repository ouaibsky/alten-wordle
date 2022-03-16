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
            "WORDLESSS,WORDLE",
            "BAR,.....",
            "WO,WO..???",
    })
    void should_check_worlds_with_wrong_length(String word, String response) {
        var wordle = new WordleCommand("WORDLE");
        assertThat(wordle.check(word)).isEqualTo(response);
    }

    /**
     * TO BE ENHANCE ... OR NOT
     */
    @ParameterizedTest
    @CsvSource({
            "aaaaa,aaaaa",
            "bravo,BRAVO",
    })
    void should_check_good_solution(String word, String response) {
        var wordle = new WordleCommand("WORDLE");
        assertThat(wordle.check(word)).isEqualTo(response);
    }

    @ParameterizedTest
    @CsvSource({
            "bbbbb,.....",
            "abbbb,A....",
            "babbb,.A...",
            "bbabb,..A..",
            "bbbab,...A.",
            "bbbba,....A",
    })
    void should_check_hiddden_aaaaa(String word, String response) {
        var wordle = new WordleCommand("aaaaa");
        assertThat(wordle.check(word)).isEqualTo(response);
    }

    @ParameterizedTest
    @CsvSource({
            "caccc,.a...",
            "ccacc,..a..",
            "cccac,...a.",
            "cccca,....a",
    })
    void should_check_hiddden_abbbb(String word, String response) {
        var wordle = new WordleCommand("abbbb");
        assertThat(wordle.check(word)).isEqualTo(response);
    }

}
