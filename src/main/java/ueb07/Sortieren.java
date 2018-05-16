package ueb07;

import java.util.Comparator;

public class Sortieren {

    static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static <T extends Comparable<T>> void bubblesort(T[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if(a[j].compareTo(a[j+1]) > 0)
                    swap(a, j, j+1);
            }
        }
    }

    static <T> void bubblesort2(T[] a, Comparator <T> comp){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if(comp.compare(a[j], a[j+1]) > 0)
                    swap(a, j, j+1);
            }
        }
    }
}