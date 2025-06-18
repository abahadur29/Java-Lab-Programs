public class ArgumentChecker {

    public static void main(String[] args) throws CheckArgumentException {
      if (args.length < 4) {
        throw new CheckArgumentException("Please provide four numbers as arguments.");
      }
  
      int sumOfSquares = 0;
      for (String arg : args) {
        try {
          int number = Integer.parseInt(arg);
          sumOfSquares += number * number; // Square the number
        } catch (NumberFormatException e) {
          System.err.println("Invalid argument: " + arg + ". Skipping...");
        }
      }
      System.out.println("Sum of squares: " + sumOfSquares);
    }
  }
  
  class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
      super(message);
    }
  }
  