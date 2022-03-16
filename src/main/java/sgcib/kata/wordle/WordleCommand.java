package sgcib.kata.wordle;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import javax.validation.constraints.Size;

@ShellComponent
public class WordleCommand {
    private String hidden;

    /**
     * DO NOT TOUCH THIS
     *
     * @param hidden reference world.
     */
    WordleCommand(String hidden) {
        this.hidden = hidden;
    }

    /**
     * DO NOT TOUCH THIS.
     */
    public WordleCommand() {
        this("     ");
    }

    /**
     * DO NOT TOUCH THIS.
     *
     * @param hiddenWord to be saves as the reference.
     */
    @ShellMethod("Set the hidden word.")
    public void hidden(@Size(min = 5, max = 5) String hiddenWord) {
        hidden = hiddenWord;
        System.out.println("Hidden word is now: '%s'".formatted(hidden));
    }

    /**
     * @param word to be checked against hidden.
     * @return a string containing identified letters or not.
     */
    @ShellMethod("Check a proposal.")
    public String check(String word) {
        return "?????";
    }
}
