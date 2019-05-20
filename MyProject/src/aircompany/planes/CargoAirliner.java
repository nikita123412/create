package aircompany.planes;



public class CargoAirliner extends Plane {

    protected final int TAKE_OFF_SPEED = 350;

    protected String carriageType;
    protected String sender;
    protected String client;

    protected CargoAirliner() {
    }


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getCarriageType() {
        return carriageType;
    }

    public void setCarriageType(String carriageType) {
        this.carriageType = carriageType;
    }


    @Override
    public void fly(double time) {
        if (time <= this.getFlghtRange()) {
            if (this.getFuelTank() > 5000) {
                if (start) {
                    this.setFlies(flies = true);
                    this.setFuelTank(this.getFuelTank() - (int) ((int) this.getFuelConsumption() * time));
                    System.out.println("Plane " + this.getName() + " is flying from " + getSender() + " to "
                            + getClient() + ". Speed: " + this.getMaxSpeed() + "kms/h");
                } else
                    System.out.println("Plane " + this.getName() + " can not takeoff. Please check the engines.");
            } else
                System.out.println("This plane can't fly more than: " + this.getFlghtRange() + " hours without REFUELING");
        } else
            System.out.println("This plane can't fly more than: " + this.getFlghtRange());
    }

    @Override
    public void land() {
        super.land();
    }

    @Override
    public void fill(int litters) {
        super.fill(litters);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Commercial airliner ");
        sb.append(getType()).append(" ");
        sb.append(getName()).append("\n");
        sb.append("Flight range: ").append(getFlghtRange()).append(" hours, ");
        sb.append(getFuelTank()).append(" litters of fuel left. ");
        sb.append("Fuel consumption: ").append(getFuelConsumption());
        sb.append(", speed: ").append(getMaxSpeed());
        sb.append(", carries: ").append(getMaxCapacity());
        sb.append(" tons of ");
        sb.append(getCarriageType());
        return sb.toString();
    }
}
