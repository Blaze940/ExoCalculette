import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class InputHandler {
    public List<Integer> readCsv(String filename) throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return numbers;
    }
}

