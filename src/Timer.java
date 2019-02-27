import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Timer {
    private static long startTime = 0;
    private static long endTime = 0;

    public static void start() {
        startTime = System.currentTimeMillis();
    }

    public static void stop() {
        endTime = System.currentTimeMillis();
    }

    public static void printTimeToFile(String fileName) {
        try {
            long timeNeeded = endTime - startTime;
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append("Pre-processing time: " + timeNeeded + " milliseconds \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
