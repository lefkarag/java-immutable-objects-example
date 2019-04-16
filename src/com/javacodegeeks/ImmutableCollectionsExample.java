package com.javacodegeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableCollectionsExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list = Collections.unmodifiableList(list);
        list.add(3);
    }
}