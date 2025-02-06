import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilmTest {
    private Film film18 = new Film("Alien", Film.RATING_18);
    private Film film15 = new Film("Aliens", Film.RATING_15);
    private Film film12 = new Film("Spiderman", Film.RATING_12);
    private Film filmPG = new Film("Coco", Film.RATING_PG);
    private Film filmU = new Film("Chitty Chitty Bang Bang", Film.RATING_U);


    @Test
    @DisplayName("Over 18 are allowed to watch 18 rated films")
//    isAllowedToView_CONDITIONS_EXCEPTEDOUTCOMES
    void isAllowedToView_FilmIs18RatedAndViewIsOver18_ReturnTrue() {
        assertTrue(film18.isAllowedToView(18));
    }

    @Test
    @DisplayName("Over 15 are allowed to watch 15 rated films")
    void isAllowedToView_FilmIs15RatedViewerIsOver15_ReturnTrue() {
        assertAll("Film Rating is 15 and viewers are over 15",
                () -> assertTrue(film15.isAllowedToView(15)),
                () -> assertTrue(film15.isAllowedToView(77)),
                () -> assertTrue(film15.isAllowedToView(21))
        );

        assertAll("Film Rating is 15 and viewers are over 15",
                () -> assertTrue(film15.isAllowedToView(15)),
                () -> assertTrue(film15.isAllowedToView(77)),
                () -> assertTrue(film15.isAllowedToView(21))
        );

    }

    @Test
    @DisplayName("Under 15 are not allowed to watch 15 rated films")
    void isAllowedToView_FilmIs15RatedViewerIsUnder15_ReturnFalse() {
        assertFalse(film15.isAllowedToView(14));
        assertFalse(film15.isAllowedToView(1));
        assertFalse(film15.isAllowedToView(5));
        assertFalse(film15.isAllowedToView(13));
    }

    @Test
    @DisplayName("Under 15 are not allowed to watch 15 rated films")
    void isAllowedToView_FilmIsURated_ReturnTrue() {
        assertTrue(filmU.isAllowedToView(1));
        assertTrue(filmU.isAllowedToView(12));
        assertTrue(filmU.isAllowedToView(15));
        assertTrue(filmU.isAllowedToView(21));
    }

}
