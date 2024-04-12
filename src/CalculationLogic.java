import java.util.ArrayList;
import java.util.List;

// CalculationLogic
class CalculationLogic {
    public List<String> calculate(List<Integer> numbers, char operation) {
        List<String> results = new ArrayList<>();
        int cumulative = numbers.getFirst();
        results.add(String.valueOf(cumulative));
        for (int i = 1; i < numbers.size(); i++) {
            if (operation == '+') {
                results.add("+" + numbers.get(i) + " (=" + (cumulative += numbers.get(i)) + ")");
            } else if (operation == '*') {
                results.add("*" + numbers.get(i) + " (=" + (cumulative *= numbers.get(i)) + ")");
            }
        }
        results.add("-------");
        results.add("total = " + cumulative + (operation == '+' ? " (addition)" : " (multiplication)"));
        return results;
    }
}

