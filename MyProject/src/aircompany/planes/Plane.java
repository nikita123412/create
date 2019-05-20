package aircompany.planes;




public class Plane extends AirVehicle {

    private final Type TYPE = Type.DEFAULT;
    private final String NAME = "Unknown";
    private final int FUEL_TANK_MAX = 0;
    private final int FUEL_TANK = 0;
    private final double WEIGHT = 0.0;
    private final double FUEL_CONSUMPTION = 0.0;
    private final int MAX_SPEED = 0;
    private final int CARRIAGE = 0;
    private final int MAX_CAPACITY = 0;
    private final boolean START = false;
    private final boolean FLIES = false;

    protected Type type;
    protected String name;
    protected int fuelTankMax;
    protected int fuelTank;
    protected double weight;
    protected double fuelConsumption;
    protected int maxSpeed;
    protected int carriage;
    protected int maxCapacity;
    protected boolean start = false;
    protected boolean flies = false;

// constructors-----------------------------------------------------------------------------------------------

    public Plane() {
        this.type = TYPE;
        this.name = NAME;
        this.fuelTank = FUEL_TANK;
        this.fuelTankMax = FUEL_TANK_MAX;
        this.weight = WEIGHT;
        this.fuelConsumption = FUEL_CONSUMPTION;
        this.maxSpeed = MAX_SPEED;
        this.carriage = CARRIAGE;
        this.maxCapacity = MAX_CAPACITY;
        this.start = START;
        this.flies = FLIES;
    }
    // enum------------------------------------------------------------------------------------------------------

    public enum Type {
        AIRBUS, BOEING, DUGLAS, AN, TU, DEFAULT;
    }

    // getters & setters------------------------------------------------------------------------------------------

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFlghtRange() {
        return (double) this.getFuelTank() / this.getFuelConsumption();
    }

    public int getFuelTankMax() {
        return fuelTankMax;
    }

    protected void setFuelTankMax(int fuelTankMax) {
        this.fuelTankMax = fuelTankMax;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isFlies() {
        return flies;
    }

    public void setFlies(boolean flies) {
        this.flies = flies;
    }

    public boolean isStart() {
        return start;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


//----------------------------------------------------------------------------------------------------------------

    public void start() {
        this.start = true;
    }

    public void fly(double time) {
        if (time <= this.getFlghtRange())
            if (start && this.getFuelTank() > 5000)
                if (this.getMaxSpeed() >= 600) {
                    this.setFlies(flies = true);
                    this.setFuelTank(this.getFuelTank() - (int) ((int) this.getFuelConsumption() * time));

                    System.out.println("Plane " + this.getName() + " is flying. Speed: " + this.getMaxSpeed() + "kms/h");
                } else
                    System.out.println("Speed of this airliner can't exceed " + this.getMaxSpeed() + " or be below 600 kms/h");
            else
                System.out.println("Plane " + this.getName() + " can not takeoff. Please check the engines and fuel level.");
        else
            System.out.println("This plane can't fly more than: " + this.getFlghtRange() + " hours without REFUELING");
    }

    public void land() {
        if (flies) {
            flies = false;
            start = false;
            System.out.println("Plane " + this.getName() + " is landing. Engines OFF ");
        } else System.out.println("Plane " + this.getName() + " is not flying.");
    }

    public void fill(int litters) {
        int canFillIn = this.getFuelTankMax() - this.getFuelTank();
        if (flies)
            System.out.println("Plane " + this.getName() + "is flying, please land the airliner");
        if ((this.getFuelTank() + litters) > this.getFuelTankMax()) {
            System.out.println("You can not fill more than " + canFillIn + " litters. Filled full tank.");
            this.setFuelTank(this.getFuelTankMax());
        } else {
            this.setFuelTank(this.getFuelTank() + litters);
            System.out.println(litters + " litters of fuel were filled.");
        }
    }


    public String toString() {
        final StringBuilder sb = new StringBuilder("Plane ");
        sb.append(getName());
        return sb.toString();
    }
}

