package aircompany;

import aircompany.planes.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputUtil {

    private InputUtil() {

    }

    public static Airliner airlinerInput(String path, Airliner.Type type) {

        AirlinerBuilder builder = new AirlinerBuilder();
        Airliner plane = null;
        try (Scanner scn = new Scanner(new FileInputStream(path))) {
            plane = builder.setType(type)
                    .setName(scn.next())
                    .setFuelConsumption(scn.nextInt())
                    .setMaxCapacity(scn.nextInt())
                    .setFuelTankMax(scn.nextInt())
                    .setFuelTank(scn.nextInt())
                    .setDeparture(scn.next())
                    .setDestination(scn.next())
                    .setSpeed(scn.nextInt())
                    .setWeight(scn.nextDouble())
                    .setSeating(scn.nextInt())
                    .build();
        } catch (IOException e) {
            System.out.println(e);
        }
        return plane;
    }


    public static CargoAirliner cargoAirlinerInput(String path, CargoAirliner.Type type) {

        CargoBuilder builder = new CargoBuilder();
        CargoAirliner plane = null;
        try (Scanner scn = new Scanner(new FileInputStream(path))) {
            plane = builder.setType(type)
                    .setName(scn.next())
                    .setFuelConsumption(scn.nextInt())
                    .setFuelTankMax(scn.nextInt())
                    .setFuelTank(scn.nextInt())
                    .setMaxCapacity(scn.nextInt())
                    .setSender(scn.next())
                    .setClient(scn.next())
                    .setSpeed(scn.nextInt())
                    .setWeight(scn.nextDouble())
                    .setCarriage(scn.nextInt())
                    .setCarriageType(scn.next())
                    .build();
        } catch (IOException e) {
            System.out.println(e);
        }
        return plane;
    }


}

