package Lab_03.AimsProject.src.lab02;

import lab02.Cart;
import lab02.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        System.out.print("Total cost is: ");
        System.out.println(anOrder.totalCost());
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.print("Total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
