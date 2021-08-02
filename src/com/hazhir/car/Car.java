package com.hazhir.car;


import java.util.Objects;

public class Car implements CarInterface, Comparable<Car>
{
    private String name;

    private String model;

    private long price;

    private int speed;

    public Car()
    {

    }

    public Car(String name, String model, long price, int speed)
    {
        this.name = name;
        this.model = model;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public long getPrice()
    {
        return this.price;
    }

    @Override
    public void setPrice(long price)
    {
        this.price = price;
    }

    @Override
    public String getModel()
    {
        return this.model;
    }

    @Override
    public void setModel(String model)
    {
        this.model = model;
    }

    @Override
    public int getSpeed()
    {
        return this.speed;
    }

    @Override
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(this.name, car.name);
    }

//    @Override
//    public int hashCode()
//    {
//        return Objects.hash(name, speed);
//    }

    @Override
    public int compareTo(Car car)
    {
        if (this.price == car.getPrice()) {
            return 0;
        }

        if (this.price >= car.getPrice()) {
            return 1;
        }

        return -1;
    }

    @Override
    public String toString()
    {
        return "name=>" + this.name +
                "     " + "model=> " + this.model +
                "     " + "price=> " + this.price +
                "     " + "speed=> " + this.speed;
    }
}
