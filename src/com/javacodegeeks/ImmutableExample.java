package com.javacodegeeks;

public class ImmutableExample {

    public static void main(String[] args) {
        final Color red = new Color("RED", "#ff0000");
        System.out.printf("Color %s hex is %s", red.getName(), red.getHex());
    }
}

class Color {
    
    private final String name;
    private final String hex;
    
    public Color(String name, String hex) {
        this.name = name;
        this.hex = hex;
    }
    
    public String getName() {
        return name;
    }

    public String getHex() {
        return hex;
    }
}