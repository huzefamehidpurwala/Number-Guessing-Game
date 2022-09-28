import javax.swing.*;

public class NumberGuessing {
    public static void main(String[] args) {
        int computeNumber = (int) (Math.random() * 100 + 1);
        int userAnswer = 0;
        int count = 1;
        try {
            while (userAnswer != computeNumber) {
                String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
                userAnswer = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, " " + determineGuess(userAnswer, computeNumber, count));
                count++;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static String determineGuess(int userAnswer , int computeNumber , int count)
    {
        if (userAnswer <= 0 || userAnswer > 100) {
            return "Your guess is invalid";
        } else if (userAnswer == computeNumber) {
            return "Correct! \n Total Guesses : " + count;
        } else if (userAnswer > computeNumber) {
            return "Your guess is too high, try again, \n Try Number : " + count;
        } else if (userAnswer < computeNumber) {
            return "Your guess is too low, try again, \n Try Number :  " + count;
        } else {
            return "Your guess is incorrect \n Try Number : " + count;
        }
    }
}