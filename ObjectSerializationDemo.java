import java.io.*;

public class ObjectSerializationDemo {
    // Метод для збереження об'єкта в файл
    public static void serializeObject(CalculationResult obj, String fileName) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(obj);
            System.out.println("Об'єкт успішно серіалізовано.");
        }
    }
    
    public static CalculationResult deserializeObject(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            CalculationResult obj = (CalculationResult) inputStream.readObject();
            System.out.println("Об'єкт успішно десеріалізовано.");
            return obj;
        }
    }
    
    public static void main(String[] args) {
        CalculationResult result = new CalculationResult(10.0, 5.0, 50.0);
        String fileName = "calculation_result.ser";
        
        try {
            // Збереження об'єкта в файл
            serializeObject(result, fileName);
            
            CalculationResult restoredResult = deserializeObject(fileName);
            System.out.println("Параметр 1: " + restoredResult.getParameter1());
            System.out.println("Параметр 2: " + restoredResult.getParameter2());
            System.out.println("Результат: " + restoredResult.getResult());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
