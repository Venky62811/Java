package Array;

public class Weeklytemprature {

    public static void main(String[] args) {	
        float[][] temperature = {
            {38.8f, 34.5f, 32.2f, 30.3f}, // City 1
            {37.5f, 33.2f, 31.1f, 29.4f}  // City 2
        };

        for (int i = 0; i < temperature.length; i++) {
            float sum = 0;
            for (int j = 0; j < temperature[i].length; j++) {
                sum += temperature[i][j];
            }
            float avg = sum / temperature[i].length;
            System.out.println("Average temperature of City " +(i+1) + ": " + avg + "°C");
        }
    }
}
