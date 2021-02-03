package a_11JavaCollectorsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Comparacao {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        System.out.println("Test time Array List: " +
                testTime(arrayList)); System.out.println("Test time Linked List: "
                + testTime(linkedList)); }
    private static long testTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        // Inserção de elementos no início da lista
        list.add(0);
        for (int i = 0; i != 100000; i++)
            list.add(0,i);
        return System.currentTimeMillis() - startTime;
    }
    //A razao pela qual desempenham de diferente forma é porque o linked list simplesmente
    //Anhade um novo elemento a lista; enquanto que o arrayList esta a criar uma nova lista
    // copiar a antiga e depois asignar a lista antiga e ahnadir o novo elemento
    //O cual demora muito mais tempo.
}

