package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        for(int i = 0; i<20; i++) mylist.add(i);
        Stream<Integer> sequentialStream = mylist.stream();
        Stream<Integer> highNumsSeq = sequentialStream.filter(ab -> ab >12);
        highNumsSeq.forEach(a->System.out.println("High number " + a));
    }


}
