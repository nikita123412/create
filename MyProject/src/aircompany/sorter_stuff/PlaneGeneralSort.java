package aircompany.sorter_stuff;

import aircompany.planes.Plane;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.
 * Посчитать общую вместимость и грузоподъемность. Провести сортировку
 * самолетов компании по дальности полета. Найти самолет в компании, со-
 * ответствующий заданному диапазону параметров потребления горючего.
 */

/**
 * Created by Пользователь on 28.08.2015.
 */
public class PlaneGeneralSort implements Comparator<Plane> {

    List<Comparator<Plane>> criterions;

    public PlaneGeneralSort(Comparator<Plane>... criterions) { // constructor
        this.criterions = Arrays.asList(criterions);
    }

    @Override
    public int compare(Plane o1, Plane o2) {
        if (o1 != null & o2 != null) {
            for (Comparator<Plane> comparator : criterions) {
                int result = comparator.compare(o1, o2);
                if (result != 0) {
                    return result;
                }
            }
        } else System.err.println("Object <Plane> might been initialized!");
        return 0;
    }
}

