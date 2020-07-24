package com.company.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TestMap {
    private int id;
    private String name;

    public TestMap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestMap testMap = (TestMap) o;
        return id == testMap.id &&
                Objects.equals(name, testMap.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String [] args){
        TestMap t1 = new TestMap(1,"Dallas");
        TestMap t2 = new TestMap(2,"Austin");
        TestMap t3 = new TestMap(1,"Dallas");

        Map<TestMap, String > number = new HashMap<>();
        number.put(t1,"Dallas");
        number.put(t2,"Austin");
        number.put(t3,"Dallas");

       for(TestMap no : number.keySet()){
           System.out.println(no + ":" + number.get(no));

       }
        }
    }

