//import org.junit.Test;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.*;
//
//public class WordGameTest {
//
//    @Test
//    public void assertTheFirstCharOfNextWordIsTheSameAsTheLastCharOfPrevious() {
//        final var actualResult = WordGame.ifFirstCharOfNextWordSameAsLastCharOfPreviousWord("pen");
//
//        assertThat(actualResult, is(true));
//    }
//
//    @Test
//    public void assertTheFirstCharOfNextWordIsNotTheSameAsTheLastCharOfPrevious() {
//        final var actualResult = WordGame.ifFirstCharOfNextWordSameAsLastCharOfPreviousWord("dog");
//
//        assertThat(actualResult, is(false));
//    }
//
//    @Test
//    public void assertTheFirstCharOfNextWordAndTheSameAsTheLastCharOfPreviousAreCaseSensitive() {
//        final var actualResult = WordGame.ifFirstCharOfNextWordSameAsLastCharOfPreviousWord("Pog");
//
//        assertThat(actualResult, is(false));
//    }
//
//    @Test
//    public void addWordToArrayIfNotUsedBefore() {
//        assertThat(WordGame.saveWordIfItIsNotUsedBefore("penny"), is(true));
//        assertThat(WordGame.saveWordIfItIsNotUsedBefore("pencil"), is(true));
//        assertThat(WordGame.saveWordIfItIsNotUsedBefore("dog"), is(true));
//    }
//
//    @Test
//    public void returnFalseIfWordIsUsedBefore() {
//        assertThat(WordGame.saveWordIfItIsNotUsedBefore("pen"), is(true));
//        assertThat(WordGame.saveWordIfItIsNotUsedBefore("pen"), is(false));
//    }
//
//    @Test
//    public void wordCanOnlyBeAlphanumeric() {
//        assertThat(WordGame.isNotAlphanumeric("pen"), is(false));
//    }
//
//    @Test
//    public void wordCanotBeNumericOrOtherCharacters() {
//        assertThat(WordGame.isNotAlphanumeric("pen123"), is(true));;
//    }
//
//}
