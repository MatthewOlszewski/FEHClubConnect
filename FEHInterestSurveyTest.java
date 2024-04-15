import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FEHInterestSurveyTest {

    /**
     * Test for to ensure returns proper max return value for this combination
     * of numbers.
     */
    @Test
    public void recommendationType_10_14_17() {
        int sports = 10;
        int social = 14;
        int professional = 17;
        String result = FEHInterestSurvey.recommendationType(sports, social,
                professional);

        String beginningPhrase = "Club Genre Returned to Recommendation Function: ";
        assertEquals(result, beginningPhrase + " Professional ");
    }

    /**
     * Test for to ensure returns proper max return value for this combination
     * of numbers.
     */
    @Test
    public void recommendationType_10_14_10() {
        int sports = 10;
        int social = 14;
        int professional = 10;
        String result = FEHInterestSurvey.recommendationType(sports, social,
                professional);

        String beginningPhrase = "Club Genre Returned to Recommendation Function: ";
        assertEquals(result, beginningPhrase + " Social ");
    }

    /**
     * Test for to ensure returns proper max return value for this combination
     * of numbers.
     */
    @Test
    public void recommendationType_21_14_17() {
        int sports = 21;
        int social = 14;
        int professional = 17;
        String result = FEHInterestSurvey.recommendationType(sports, social,
                professional);

        String beginningPhrase = "Club Genre Returned to Recommendation Function: ";
        assertEquals(result, beginningPhrase + " Sport ");
    }

    /**
     * Test for to ensure returns proper max return value for this combination
     * of numbers.
     */
    @Test
    public void recommendationType_17_17_17() {
        int sports = 17;
        int social = 17;
        int professional = 17;
        String result = FEHInterestSurvey.recommendationType(sports, social,
                professional);

        String beginningPhrase = "Club Genre Returned to Recommendation Function: ";
        assertEquals(result, beginningPhrase + " Sport  Social  Professional ");
    }

    /**
     * Test for to ensure returns proper string return value for this
     * combination of numbers.
     */
    @Test
    public void recommendationType_17_14_17() {
        int sports = 17;
        int social = 14;
        int professional = 17;
        String result = FEHInterestSurvey.recommendationType(sports, social,
                professional);

        String beginningPhrase = "Club Genre Returned to Recommendation Function: ";
        assertEquals(result, beginningPhrase + " Sport  Professional ");
    }

    /**
     * Test for to ensure returns proper string return value for this
     * combination of numbers.
     */
    @Test
    public void recommendationType_16_17_17() {
        int sports = 16;
        int social = 17;
        int professional = 17;
        String result = FEHInterestSurvey.recommendationType(sports, social,
                professional);

        String beginningPhrase = "Club Genre Returned to Recommendation Function: ";
        assertEquals(result, beginningPhrase + " Social  Professional ");
    }

    /**
     * Test for to ensure returns proper string return value for this
     * combination of numbers.
     */
    @Test
    public void recommendationType_17_17_16() {
        int sports = 17;
        int social = 17;
        int professional = 16;
        String result = FEHInterestSurvey.recommendationType(sports, social,
                professional);

        String beginningPhrase = "Club Genre Returned to Recommendation Function: ";
        assertEquals(result, beginningPhrase + " Sport  Social ");
    }

}
