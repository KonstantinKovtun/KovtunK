package ru.job4j.lambda;

public class Example {
    private static void printTest(Car car, CheckCar check) {
        if (check.test(car)) {
            System.out.println(car);
        }
    }

    public static void main(String[] args) {
        Car audiA3 = new Car("AudiA3", true, true);
        Car audiA6 = new Car("AudiA6", true, false);
        printTest(audiA6, c -> c.isFullDrive());
        printTest(audiA6, c -> c.isGasEngine());
        printTest(audiA3, c -> c.isGasEngine());
        printTest(audiA3, c -> c.isFullDrive());

        printTest(audiA3, new CheckCar() {
            @Override
            public boolean test(Car car) {
                return car.isFullDrive();
            }
        });
        printTest(audiA3, (car) -> car.isGasEngine());
    }
}
