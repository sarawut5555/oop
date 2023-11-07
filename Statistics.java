import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        int n = 10;
        double[] score = new double[n];
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + n + " values:");

        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += score[i];
        }
        double mean = sum / n;

        double sumOfSquaredDifferences = 0;
        for (int i = 0; i < n; i++) {
            double difference = score[i] - mean;
            sumOfSquaredDifferences += difference * difference;
        }
        double standardDeviation = Math.sqrt(sumOfSquaredDifferences / n);

        System.out.println("Mean (Average): " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);

        scanner.close();
    }
}

