package aircompany.planes;


public class CargoBuilder {

    private CargoAirliner cargoAirliner;

    public CargoBuilder() {
        cargoAirliner = new CargoAirliner();
    }


    public CargoBuilder setType(CargoAirliner.Type type) {
        cargoAirliner.setType(type);
        return this;
    }

    public CargoBuilder setCarriageType(String carriageType) {
        cargoAirliner.setCarriageType(carriageType);
        return this;
    }

    public CargoBuilder setCarriage(int carriage) {
        if (carriage > 0 && carriage <= cargoAirliner.getMaxCapacity())
            cargoAirliner.setCarriage(carriage);
        else System.err.println("This plane carriage can't exceed: " + cargoAirliner.getMaxCapacity());
        return this;
    }

    public CargoBuilder setMaxCapacity (int MaxCapacity){
        cargoAirliner.setMaxCapacity(MaxCapacity);
        return this;
    }

    public CargoBuilder setClient(String client) {
        cargoAirliner.setClient(client);
        return this;
    }

    public CargoBuilder setSender(String sender) {
        cargoAirliner.setSender(sender);
        return this;
    }

    public CargoBuilder setName(String name) {
        cargoAirliner.setName(name);
        return this;
    }

    public CargoBuilder setWeight(double weight) {
        if (weight > 0)
            cargoAirliner.setWeight(weight);
        return this;
    }

    public CargoBuilder setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption > 0)
            cargoAirliner.setFuelConsumption(fuelConsumption);
        return this;
    }

    public CargoBuilder setFuelTank(int fuelTank) {
        if (fuelTank > 0)
            cargoAirliner.setFuelTank(fuelTank);
        return this;
    }

    public CargoBuilder setFuelTankMax(int fuelTank) {
        if (fuelTank > 0)
            cargoAirliner.setFuelTank(fuelTank);
        return this;
    }

    public CargoBuilder setSpeed(int speed) {
        if (speed >= cargoAirliner.TAKE_OFF_SPEED)
            cargoAirliner.setMaxSpeed(speed);
        return this;
    }

    public CargoAirliner build() {
        return cargoAirliner;
    }
}
