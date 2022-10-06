public class Divided implements Operate {
    @Override
    public Double getResult(Double... numbers) {
        Double sum = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            sum /= numbers[index];
        }
        return sum;
    }
}