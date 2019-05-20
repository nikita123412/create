package aircompany.sorter_stuff;

import aircompany.planes.Plane;

import java.util.Comparator;
/**
 * ������������. ���������� �������� ���������. ������� ������������.
 * ��������� ����� ����������� � ����������������. �������� ����������
 * ��������� �������� �� ��������� ������. ����� ������� � ��������, ��-
 * ������������� ��������� ��������� ���������� ����������� ��������.
 */

/**
 * Created by ������������ on 28.08.2015.
 */
public enum PlaneSortCriterions implements Comparator<Plane> {

    BY_TYPE {
        @Override
        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return o1.getType().compareTo(o2.getType());
        }
    },
    BY_NAME {
        @Override
        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return o1.getName().compareTo(o2.getName());
        }
    }, BY_FLIGHT_RANGE {
        @Override
        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return o1.getFlghtRange() > o2.getFlghtRange() ? 1 : -1;
        }
    }, BY_FUEL_COMSUMPTION {
        @Override
        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return Integer.valueOf((int)o1.getFuelConsumption()).compareTo((int) o2.getFuelConsumption());
        }
    }, BY_CAPACITY {
        @Override
        public int compare(Plane o1, Plane o2) {
            if(o1 == null || o2 == null) {
                System.err.println("Object <Plane> might been initialized!");
                return -1;
            }
            return Integer.valueOf(o1.getMaxCapacity()).compareTo(o2.getMaxCapacity());
        }
    }
}
