import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Simple HelloWorld program (clear of Checkstyle and SpotBugs warnings).
 *
 * @author Matt Olszewski
 */
public final class FEHInterestSurvey {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private FEHInterestSurvey() {
        // no code needed here
    }

    /**
     * Questionnaire will get a total number score from user. That score will
     * then be fed into scorer to
     *
     * @param out
     * @return returns a score
     */
    public static int sportQuestionnairre(SimpleWriter out, SimpleReader in) {

        int summedSportsScores = 0;
        int scores = 0;

        String[] sportsInterestPhrases = new String[5];
        sportsInterestPhrases[0] = "Interest in Outdoor Activities";
        sportsInterestPhrases[1] = "Interest in Exercise";
        sportsInterestPhrases[2] = "Interest in Friendly Competition";
        sportsInterestPhrases[3] = "Interest in Sporting Event Watch Parties";
        sportsInterestPhrases[4] = "Interest in Playing Sports on a Weekday";

        for (int i = 0; i < 5; i++) {
            scores = 0;
            while (scores <= 0 || scores >= 6) {
                out.println("On a Level of 1 to 5, What is Your ...");
                out.println(sportsInterestPhrases[i]);
                scores = in.nextInteger();
            }
            summedSportsScores += scores;
        }

        assert summedSportsScores >= 5 && summedSportsScores <= 25;

        return summedSportsScores;
    }

    /**
     * Questionnaire will get a total number score from user. That score will
     * then be fed into scorer to
     *
     * @param out
     * @return returns a score
     */
    public static int socialQuestionnairre(SimpleWriter out, SimpleReader in) {

        int summedSocialScores = 0;
        int scores = 0;
        String[] socialInterestPhrases = new String[5];
        socialInterestPhrases[0] = "Interest in Greek Life";
        socialInterestPhrases[1] = "Interest in ethnic communities";
        socialInterestPhrases[2] = "Interest in Exploring Campus";
        socialInterestPhrases[3] = "Interest in Exploring Columbus";
        socialInterestPhrases[4] = "Interest in Meeting Large Sets of People";

        for (int i = 0; i < 5; i++) {
            scores = 0;
            while (scores <= 0 || scores >= 6) {
                out.println("On a Level of 1 to 5, What is Your ...");
                out.println(socialInterestPhrases[i]);
                scores = in.nextInteger();
            }
            summedSocialScores += scores;
        }

        assert summedSocialScores >= 5 && summedSocialScores <= 25;

        return summedSocialScores;
    }

    /**
     * Questionnaire will get a total number score from user. That score will
     * then be fed into scorer to
     *
     * @param out
     * @return returns a score
     */
    public static int professionalQuestionnairre(SimpleWriter out,
            SimpleReader in) {

        int summedProfessionalScores = 0;
        int scores = 0;
        String[] professionalInterestPhrases = new String[5];
        professionalInterestPhrases[0] = "Interest in Career Development Opportunities";
        professionalInterestPhrases[1] = "Interest in Developing Practicial Career Skills";
        professionalInterestPhrases[2] = "Interest in Networking with Likeminded Peers";
        professionalInterestPhrases[3] = "Interest in Learning about Professions Related to Your Major";
        professionalInterestPhrases[4] = "Interest in Resume Building";

        for (int i = 0; i < 5; i++) {
            scores = 0;
            while (scores <= 0 || scores >= 6) {
                out.println("On a Level of 1 to 5, What is Your ...");
                out.println(professionalInterestPhrases[i]);
                scores = in.nextInteger();
            }
            summedProfessionalScores += scores;
        }

        assert summedProfessionalScores >= 5 && summedProfessionalScores <= 25;

        return summedProfessionalScores;
    }

    /**
     *
     * @param sport
     *            score for sport genre from survey
     * @param social
     *            score for social genre from survey
     * @param professional
     *            score for professional genre from survey
     * @return returns the club genre(s) to recommend to user.
     */
    public static String recommendationType(int sport, int social,
            int professional) {

        String returnedType = "Club Genre Returned to Recommendation Function: ";

        int[] arrNum = { sport, social, professional };

        int max = 0;

        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] > max) {
                max = arrNum[i];
            }
        }

        if (sport == max) {
            returnedType += " Sport ";
        }
        if (social == max) {
            returnedType += " Social ";
        }
        if (professional == max) {
            returnedType += " Professional ";
        }

        return returnedType;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        SimpleReader in = new SimpleReader1L();

        out.println(
                "The following set of questions will help gauge your interests");
        out.println(
                "Please respond to each of the following questions with your");
        out.println("interest level on a scale of 1 to 5.\n");

        int sportInterest = sportQuestionnairre(out, in);
        int socialInterest = socialQuestionnairre(out, in);
        int professionalInterest = professionalQuestionnairre(out, in);

        String rankedClubTypes = recommendationType(sportInterest,
                socialInterest, professionalInterest);
        out.println();
        out.println("Results of Survey");
        out.println("Sports: " + sportInterest);
        out.println("Social: " + socialInterest);
        out.println("Professional: " + professionalInterest);
        out.println(rankedClubTypes);

        in.close();
        out.close();
    }

}
