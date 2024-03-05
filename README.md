# Practice2, Variant 5
# Dvorovenko Max

![photo_2024-03-05_18-26-26](https://github.com/snowaaaaaaaaaa/Practice2/assets/144525592/7d2152d2-808c-43bc-9235-a54265a60e8e)

```
public class BinaryCount {
    public static void main(String[] args) {
        double base = 5.0; // Довжина сторони основи прямокутника
        double height = 4.0; // Висота прямокутника
        double triangleBase = 3.0; // Довжина основи рівнобедреного трикутника
        double triangleHeight = 4.0; // Висота рівнобедреного трикутника

        double rectanglePerimeter = 2 * (base + height);
        double trianglePerimeter = 2 * triangleBase + height;

        double sum = rectanglePerimeter + trianglePerimeter;

        String binaryRepresentation = Integer.toBinaryString((int) sum);

        int countOnes = 0;
        for (int i = 0; i < binaryRepresentation.length(); i++) {
            if (binaryRepresentation.charAt(i) == '1') {
                countOnes++;
            }
        }

        System.out.println("Сума периметрів у двійковому представленні: " + binaryRepresentation);
        System.out.println("Кількість одиниць у двійковому представленні: " + countOnes);
    }
}
```
