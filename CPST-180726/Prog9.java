 class Vehicle{
    public void drive(){
    IO.println("Driving");
    }
}
class Car extends Vehicle{
    @Override
    public void drive(){
        IO.println("Repairing a car");
        super.drive();
    }
}
void main(){
        Car c = new Car();
        c.drive();
    }

