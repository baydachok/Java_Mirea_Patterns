package Pract3;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        SynchronizedList<Integer> list = new SynchronizedList<>();
        SemaphoreSet<Integer> set = new SemaphoreSet<>();
        ArrayList<Integer> unsafeList = new ArrayList<>(1000);
        HashSet<Integer> unsafeSet = new HashSet<>(1000);

        Thread one = new Thread(() -> {
            for (int i = 0; i < 499; i++) {
                list.add(i);
                set.add(i);
                unsafeList.add(i);
                unsafeSet.add(i);
            }
        });

        Thread second = new Thread(() -> {
            for (int i = 499; i < 1000; i++) {
                list.add(i);
                set.add(i);
                unsafeList.add(i);
                unsafeSet.add(i);
            }
        });
        one.start();
        second.start();
        try {
            Thread.sleep(2);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("SynchronizedList size = " + list.size());
        System.out.println("SemaphoreSet size = " + set.size());
        System.out.println("ArrayList size = " + unsafeList.size());
        System.out.println("HashSet size = " + unsafeSet.size());

    }
}