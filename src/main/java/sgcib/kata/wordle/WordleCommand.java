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
        setHidden(hidden);
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
     * @param hidden to be saves as the reference.
     */
    @ShellMethod(value = "Set the hidden word.", key = "hidden")
    final void setHidden(@Size(min = 5, max = 5) String hidden) {
        this.hidden = hidden.toLowerCase();
        System.out.printf("Hidden word is now: '%s'%n", hidden);
    }

    final String getHidden() {
        return hidden;
    }

    /**
     * @param guess to be checked against hidden.
     * @return a string containing identified letters or not.
     */
    @ShellMethod("Check a proposal.")
    public String check(String guess) {
        // TODO: Add you implementation !
        return "?????";
    }
}
