package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    @Override
    public boolean add(T element) {
        if (!this.contains(element)) { // Eğer liste içinde yoksa ekle
            boolean added = super.add(element);
            this.sort(); // Ekleme sonrası sıralama yap
            return added;
        }
        return false; // Tekrar eden eleman eklenmez
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object obj) {
        boolean removed = super.remove(obj);
        if (removed) {
            this.sort(); // Silme sonrası sıralama yap
        }
        return removed;
    }
}
