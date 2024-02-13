public class ManGameCalculator extends GameCalculator { // ManGameCalculator class take inheritance GameCalculator
    public void calculate() // using the abstract method.
    {
        System.out.println("Your Score: 90"); // writing the score
    }

    public void CallManGameCalculator() // Create metot wich name is CallKidGameCalculator
    {
        System.out.println("Information For Man");
        calculate();
        gameOver();
        System.out.println();
    }
}
