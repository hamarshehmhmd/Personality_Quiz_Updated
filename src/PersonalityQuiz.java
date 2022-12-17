import java.util.Scanner;

public class PersonalityQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the personality type variables
        String personalityType = "";
        int extrovertScore = 0;
        int introvertScore = 0;
        int sensingScore = 0;
        int intuitiveScore = 0;
        int thinkingScore = 0;
        int feelingScore = 0;
        int judgingScore = 0;
        int perceivingScore = 0;

        // Ask the user a series of questions to determine their personality type
        System.out.println("Do you prefer to spend time alone or with others?");
        System.out.println("1. Alone 2. With others");
        int answer = scanner.nextInt();
        if (answer == 1) {
            introvertScore++;
        } else if (answer == 2) {
            extrovertScore++;
        }

        System.out.println("Do you prefer to focus on the present or the future?");
        System.out.println("1. Present 2. Future");
        answer = scanner.nextInt();
        if (answer == 1) {
            sensingScore++;
        } else if (answer == 2) {
            intuitiveScore++;
        }

        System.out.println("Do you make decisions based on logic or emotion?");
        System.out.println("1. Logic 2. Emotion");
        answer = scanner.nextInt();
        if (answer == 1) {
            thinkingScore++;
        } else if (answer == 2) {
            feelingScore++;
        }

        System.out.println("Do you prefer a structured or flexible approach to life?");
        System.out.println("1. Structured 2. Flexible");
        answer = scanner.nextInt();
        if (answer == 1) {
            judgingScore++;
        } else if (answer == 2) {
            perceivingScore++;
        }

        // Determine the user's personality type based on their scores
        if (extrovertScore > introvertScore) {
            personalityType += "E";
        } else {
            personalityType += "I";
        }

        if (sensingScore > intuitiveScore) {
            personalityType += "S";
        } else {
            personalityType += "N";
        }

        if (thinkingScore > feelingScore) {
            personalityType += "T";
        } else {
            personalityType += "F";
        }

        if (judgingScore > perceivingScore) {
            personalityType += "J";
        } else {
            personalityType += "P";
        }

        // Print the user's personality type
        System.out.println("Your personality type is: " + personalityType);
    }
}
