package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum() {
        int number = 3636;
        int sum = 0;
        sum +=  number % 10;
        number = number / 10;
        System.out.println(sum);

    }
}
