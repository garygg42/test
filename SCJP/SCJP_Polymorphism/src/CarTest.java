public class CarTest {

    public static void main(String[] args) {
        Vehicle[] v = { new Vehicle(), new Car(), new Truck() };

        for (Vehicle tv : v) {
            System.out.println(tv.getThis());
        }
    }

}

class Test {
    public static void doSomething(Object o) {
        System.out.println(o);
    }
}

class Vehicle {
    public Vehicle getThis() {
        return this;
    }

}

class Car extends Vehicle {
    @Override
    public Car getThis() {
        return this;
    }

}

class Truck extends Vehicle {
    @Override
    public Truck getThis() {
        return this;
    }

}