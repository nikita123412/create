package aircompany;

import aircompany.planes.Plane;
import aircompany.planes.Plane.Type;
import aircompany.sorter_stuff.PlaneGeneralSort;
import aircompany.sorter_stuff.PlaneSorter;
import aircompany.sorter_stuff.PlanesFilter;
import java.util.ArrayList;
import java.util.List;

import static aircompany.sorter_stuff.PlaneSortCriterions.*;




public class Runner {
    public static void main(String[] args) {

        // input
        Plane plane_0 = InputUtil.airlinerInput("files\\io\\File_Boeing 747-100.txt", Type.BOEING);
        Plane plane_1 = InputUtil.airlinerInput("files\\io\\File_AIRBUS A300.txt", Type.AIRBUS);
        Plane plane_2 = InputUtil.airlinerInput("files\\io\\File_AIRBUS A300-1.txt", Type.AIRBUS);
        Plane plane_3 = InputUtil.airlinerInput("files\\io\\File_AIRBUS A300-2.txt", Type.AIRBUS);
        Plane plane_4 = InputUtil.airlinerInput("files\\io\\File_Duglas DC-8.txt", Type.DUGLAS);
        Plane plane_5 = InputUtil.cargoAirlinerInput("files\\io\\File_AN_Ruslan_AN124.txt", Type.AN);
        Plane plane_6 = InputUtil.cargoAirlinerInput("files\\io\\File_AN_Mriya_AN225.txt", Type.AN);

        List<Plane> planes = new ArrayList<>();
        planes.add(plane_0);
        planes.add(plane_1);
        planes.add(plane_2);
        planes.add(plane_3);
        planes.add(plane_4);
        planes.add(plane_5);
        planes.add(plane_6);


        PlaneSorter.planesSort(planes, new PlaneGeneralSort(BY_NAME, BY_FLIGHT_RANGE));
        PlaneSorter.planeMax(planes, new PlaneGeneralSort(BY_CAPACITY));
        PlaneSorter.planeMin(planes, new PlaneGeneralSort(BY_FUEL_COMSUMPTION));


        AirCompany company = new AirCompany("Aero Express", planes);
        AirCompany filteredByFuel = new AirCompany("FilteredByFuel", PlanesFilter.filterFuelConsumption(planes, 6000, 8000));
        AirCompany filteredByName = new AirCompany("FilteredByName", PlanesFilter.filterByName(planes, "747"));


        OutputUtil.output(company, "files\\io\\File_out.txt");


        plane_1.start();
        plane_1.fly(10);
        plane_1.land();
        plane_1.fill(20000);
        plane_1.start();
        plane_1.fly(1);
        plane_1.land();
        System.out.println(plane_1);
    }
}

