package aircompany.planes;


public class AirlinerBuilder {
    private Airliner airliner;

    public AirlinerBuilder() {
        airliner = new Airliner();
    }


    public AirlinerBuilder setType(Airliner.Type type) {
        airliner.setType(type);
        return this;
    }

    public AirlinerBuilder setName(String name) {
        airliner.setName(name);
        return this;
    }

    public AirlinerBuilder setSeating(int seating) {
        if (seating > 0)
            airliner.setSeating(seating);
        return this;
    }

    public AirlinerBuilder setCarriage(int carriage) {
        if (carriage > 0 && carriage <= airliner.getMaxCapacity())
            airliner.setCarriage(carriage);
        else System.err.println("This plane carriage can't exceed: " + airliner.getMaxCapacity());
        return this;
    }

    public AirlinerBuilder setDeparture(String departure) {
        airliner.setDeparture(departure);
        return this;
    }

    public AirlinerBuilder setDestination(String destination) {
        airliner.setDestination(destination);
        return this;
    }

    public AirlinerBuilder setMaxCapacity(int maxCapacity) {
        if (maxCapacity > 0)
            airliner.setMaxCapacity(maxCapacity);
        return this;
    }

    public AirlinerBuilder setWeight(double weight) {
        if (weight > 0)
            airliner.setWeight(weight);
        return this;
    }

    public AirlinerBuilder setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption > 0)
            airliner.setFuelConsumption(fuelConsumption);
        return this;
    }

    public AirlinerBuilder setFuelTank(int fuelTank) {
        if (fuelTank > 0)
            airliner.setFuelTank(fuelTank);
        return this;
    }

    public AirlinerBuilder setFuelTankMax(int fuelTank) {
        if (fuelTank > 0)
            airliner.setFuelTankMax(fuelTank);
        return this;
    }

    public AirlinerBuilder setSpeed(int speed) {
        if (speed >= airliner.TAKE_OFF_SPEED)
            airliner.setMaxSpeed(speed);
        return this;
    }

    public Airliner build() {
        return airliner;
    }
}
