import java.io.IOException;

public class CalculationTest {
    public static void main(String[] args) {
        CalculationSolver solver = new CalculationSolver();
        testCalculation(solver);
        testSerialization();
    }

    public static void testCalculation(CalculationSolver solver) {
        double result = solver.solve(10.0, 5.0); // Очікуваний результат: 15.0
        double expected = 15.0;
        if (result == expected) {
            System.out.println("Test for calculation passed.");
        } else {
            System.out.println("Test for calculation failed. Expected: " + expected + ", Actual: " + result);
        }
    }

    public static void testSerialization() {
        CalculationResult original = new CalculationResult(10.0, 5.0, 50.0);
        String fileName = "test_serialization.ser";

        try {
            // Серіалізація об'єкта
            ObjectSerializationDemo.serializeObject(original, fileName);

            // Десеріалізація об'єкта
            CalculationResult restored = ObjectSerializationDemo.deserializeObject(fileName);

            // Перевірка на рівність даних
            if (original.getParameter1() == restored.getParameter1()
                    && original.getParameter2() == restored.getParameter2()
                    && original.getResult() == restored.getResult()) {
                System.out.println("Test for serialization passed.");
            } else {
                System.out.println("Test for serialization failed.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
    }
}



