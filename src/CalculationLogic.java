import java.util.ArrayList;
import java.util.List;

// CalculationLogic
class CalculationLogic {
    public List<String> calculateAndShowResult(List<Integer> numbers, char operation) {
        List<String> results = new ArrayList<>();
        int cumulative = numbers.getFirst();
        results.add(String.valueOf(cumulative));
        for (int number = 1; number < numbers.size(); number++) {
            switch(operation) {
                case '+':
                    cumulative += numbers.get(number);
                    break;
                case '*':
                    cumulative *= numbers.get(number);
                    break;
            }
            results.add("" + operation + numbers.get(number) + " (=" + cumulative + ")");
        }

        results.add("-------");

        switch(operation) {
            case '+':
                results.add("total = " + cumulative + " (addition)");
                break;
            case '*':
                results.add("total = " + cumulative + " (multiplication)");
                break;
        }
        return results;
    }
}

