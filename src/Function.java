import java.util.*;

public class Function {
    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the maths operation");
        System.out.println("Supported format 2+7-7*2/4");
        String input = in.nextLine();
        in.close();

        Queue<String> operations;
        Queue<String> numbers;

        String[] numberArr = input.split("[-+*/%]");
        String[] operatorsArr = input.split("[0-9]+");
        numbers = new LinkedList<>(Arrays.asList(numberArr));
        operations = new LinkedList<>(Arrays.asList(operatorsArr));

        Double result = Double.parseDouble(Objects.requireNonNull(numbers.poll()));

        while (!numbers.isEmpty()) {
            String opr = operations.poll();
            Operate operate;
            switch (Objects.requireNonNull(opr)) {
                case "+":
                    operate = new Add();
                    break;
                case "-":
                    operate = new Subtract();
                    break;
                case "*":
                    operate = new Multiple();
                    break;
                case "/":
                    operate = new Divided();
                    break;

                default:
                    continue;
            }
            Double num = Double.parseDouble(Objects.requireNonNull(numbers.poll()));
            result = operate.getResult(result, num);
        }
        System.out.println(result);
        in.close();
    }
}
