# Game Calculator

This project was created to calculate game scores for different player types.

## GameCalculator Class

- `public abstract class GameCalculator`: The abstract class `GameCalculator` contains the basic methods for calculating game scores.
  - `public abstract void calculate()`: An abstract method to be implemented by subclasses.
  - `public void gameOver()`: A method that indicates the end state of the game.

## KidsGameCalculator Class

- `public class KidsGameCalculator extends GameCalculator`: A special score calculation class for child players.
  - `public void calculate()`: Implements abstract method, calculates points for child players.

## ManGameCalculator Class

- `public class ManGameCalculator extends GameCalculator`: A special score calculation class for male players.
  - `public void calculate()`: Implements abstract method, calculates points for male players.

## WomanGameCalculator Class

- `public class WomanGameCalculator extends GameCalculator`: A specialised score calculation class for female players.
  - `public void calculate()`: Implements the abstract method, calculates points for female players.

## Main Class

- `public class Main`: This is the main class of the project, it calculates points by creating instances for different player types.
  - `public static void Woman()`: A method that calculates points for female players and displays the game end state.
  - `public static void Man()`: Calculates points for male players.