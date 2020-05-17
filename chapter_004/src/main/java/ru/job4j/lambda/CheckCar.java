package ru.job4j.lambda;

@FunctionalInterface
public interface CheckCar {
    abstract public boolean test(Car car);
}
