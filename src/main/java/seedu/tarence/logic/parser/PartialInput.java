package seedu.tarence.logic.parser;

import java.util.List;

/**
 * Represents the result of searching for autocomplete options to a user's partial input.
 */
public class PartialInput {
        public String originalInput;
        public String lastArgument;
        public List<String> completions;

        public PartialInput(String originalInput, String lastArgument, List<String> completions) {
            this.originalInput = originalInput;
            this.lastArgument = lastArgument;
            this.completions = completions;
        }

        @Override
        public boolean equals(Object other) {
            return other == this
                    || (other instanceof PartialInput
                        && originalInput.equals(((PartialInput) other).originalInput)
                        && lastArgument.equals(((PartialInput) other).lastArgument)
                        && completions.equals(((PartialInput) other).completions));
        }
}
