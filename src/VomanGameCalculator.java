public class VomanGameCalculator extends GameCalculator { // VomanGameCalculator class take inheritance GameCalculator
    public void calculate() // using the abstract method
    {
        System.out.println("Your Score: 95"); // writing the score
    }

    public void CallVomanGameCalculator() // Create metot wich name is CallVomanGameCalculator
    {
        System.out.println("Information For Voman");
        calculate();
        gameOver();
        System.out.println();
    }
}
