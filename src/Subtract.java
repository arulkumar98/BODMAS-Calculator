public class Subtractor implements Operate {

    @Override
    public Double getResult(Double... numbers) {
        Double sum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum -= numbers[i];
        }
        return sum;
    }
}
