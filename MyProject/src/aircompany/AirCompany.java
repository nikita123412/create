package aircompany;

import aircompany.planes.Plane;

import java.util.ArrayList;
import java.util.List;


public class AirCompany {

    protected String name;
    protected List<Plane> planes;

// comstructors

    public AirCompany() {
        List<Plane> planes = new ArrayList<>();
    }

    public AirCompany(String name, List<Plane> planes) {
        this.name = name;
        this.planes = planes;
    }

    public AirCompany(String name) {
        this.name = name;
    }

    public AirCompany(List<Plane> planes) {
        this.planes = planes;
    }


    // getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> aircompany) {
        this.planes = aircompany;
    }


    public long getSumCapacity() {
        long result = 0;
        for (Plane plane : planes) {
            result += plane.getMaxCapacity();
        }
        return result;
    }

    public long getSumCarriage() {
        long result = 0;
        for (Plane plane : planes) {
            result += plane.getCarriage();
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AirCompany name: ");
        sb.append(name).append(". planes ")
        .append(planes).append("\n");
        return sb.toString();
    }
}