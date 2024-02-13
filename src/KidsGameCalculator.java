public class KidsGameCalculator extends GameCalculator { // KıdsGame Calculator class take inheritance GameCalculator
    public void calculate() // using the abstract method
    {
        System.out.println("Your score: 100"); // writing the score
    }

    public void CallKidGameCalculator() // Create metot wich name is CallKidGameCalculator
    {
        System.out.println("Information For Kid");
        calculate();
        gameOver();
        System.out.println();
    }

}
