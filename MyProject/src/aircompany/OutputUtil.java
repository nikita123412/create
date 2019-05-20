package aircompany;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class OutputUtil {

    private OutputUtil() {
    }

    public static void output(AirCompany company, String path) {
        try (RandomAccessFile output = new RandomAccessFile(new File(path), "rw")) {

            long sumCapacity = company.getSumCapacity();
            long sumCarriage = company.getSumCarriage();

            output.writeUTF(company.toString() + "\n");
            output.writeUTF("Sum carriage: " + Long.toString(sumCarriage) + "\n");
            output.writeUTF("Sum capacity: " + Long.toString(sumCapacity) + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}