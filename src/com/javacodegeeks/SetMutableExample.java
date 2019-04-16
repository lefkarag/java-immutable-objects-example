package com.javacodegeeks;

import java.util.HashSet;

public class SetMutableExample {

    public static void main(String[] args) {
        HashSet<Numbers> numbers = new HashSet<>();
        Numbers n1 = new Numbers(1);
        Numbers n2 = new Numbers(2);
        Numbers n3 = new Numbers(3);
        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);

        System.out.println("Numbers: " + numbers);
        System.out.println("Numbers contain 4: " + numbers.contains(new Numbers(4)));

        // change n1 id
        n1.setId(4);

        System.out.println("\nNumbers: " + numbers);
        System.out.println("Numbers contain 4: " + numbers.contains(new Numbers(4))); // wrong !!!
    }
}

class Numbers {

    private int id;

    public Numbers(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Numbers other = (Numbers) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + "";
    }
}