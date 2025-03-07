package org.example;

import java.util.Objects;

class Device{
    private String brand;
    private int price;
    public Device(String brand, int price) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return price == device.price && Objects.equals(brand, device.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }
}
public class ObjectClass {
    public static void main(String[] args) {
        Device device = new Device("iphone", 100);
        System.out.println(device);
    }
}
