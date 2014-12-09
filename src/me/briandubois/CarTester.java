package me.briandubois;// Brian DuBois

public class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car("Ferrari", 0);
        Car c2 = new Car("Hennesy", 0, 0, false);
        Car c3 = new Car("Ford", 0, 0, true);

        //The Ferrari
        c1.drive(35);
        if (c1.getisBroken() == false) {
            System.out.println("Your " + c1.getModel() + "'s position is " + c1.getPosition() + ". Its total distance is " + c1.gettotalDistance() + "");
        }

        //The Hennessy
        c2.drive(-35);
        c2.drive(435);
        if (c2.getisBroken() == false) {
            System.out.println("Your " + c2.getModel() + "'s position is " + c2.getPosition() + ". Its total distance is " + c2.gettotalDistance() + "");
        }

        //The Ford
        c3.drive(35);
        if (c3.getisBroken() == false) {
            System.out.println("Your" + c3.getModel() + "'s position is " + c3.getPosition() + ". Its total distance is " + c3.gettotalDistance() + "");
        }
    }
}