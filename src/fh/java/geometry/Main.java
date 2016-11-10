package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.threeDimensional.Kegel;
import fh.java.geometry.model.threeDimensional.Pyramide;
import fh.java.geometry.model.threeDimensional.ThreeDim;
import fh.java.geometry.model.threeDimensional.Wuerfel;
import fh.java.geometry.model.twoDimensional.Dreieck;
import fh.java.geometry.model.twoDimensional.Raute;
import fh.java.geometry.model.twoDimensional.RechtwinkeligesDreieck;
import fh.java.geometry.model.twoDimensional.TwoDim;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.doIt();
    }

    private void doIt() {
        List<TwoDim> twoDimensionalList = new ArrayList<>();
        List<ThreeDim> threeDimensionalList = new ArrayList<>();

        fillTwoDimensionalList(twoDimensionalList);
        fillThreeDimensionalList(threeDimensionalList);


        //printList(twoDimensionalList);
        //printThreeDimList(threeDimensionalList);

        calcTwoDimArea(twoDimensionalList);
        calcTwoDimPerimeter(twoDimensionalList);

        calcThreeDimSurface(threeDimensionalList);
        calcThreeDimVolume(threeDimensionalList);




    }

    public void fillTwoDimensionalList(List<TwoDim> twoDimensionalList) {
		twoDimensionalList.add(new Dreieck(1,2,3,4,5));
        twoDimensionalList.add(new Dreieck(2,3,4,5,6));

        twoDimensionalList.add(new Raute(3,4,5,6,7));
        twoDimensionalList.add(new Raute(4,5,6,7,8));

        twoDimensionalList.add(new RechtwinkeligesDreieck(5,6,7,8));
        twoDimensionalList.add(new RechtwinkeligesDreieck(6,7,8,9));
    }

    public void fillThreeDimensionalList(List<ThreeDim> threeDimensionalList) {
        threeDimensionalList.add(new Kegel(7,8,9,10));
        threeDimensionalList.add(new Kegel(8,9,10,11));

        threeDimensionalList.add(new Pyramide(9,10,11,12,13));
        threeDimensionalList.add(new Pyramide(10,11,12,13,14));

        threeDimensionalList.add(new Wuerfel(11,12,13));
        threeDimensionalList.add(new Wuerfel(12,13,14));
    }


    public static void printList(List<TwoDim> twoDimensionalList){
        for(int i = 0; i < twoDimensionalList.size(); i ++){
            System.out.println(twoDimensionalList.get(i));
        }
    }

    public static void printThreeDimList(List<ThreeDim> threeDimensionalList){
        for(int i = 0; i < threeDimensionalList.size(); i ++){
            System.out.println(threeDimensionalList.get(i));
        }
    }


    public static void calcTwoDimArea(List<TwoDim> twoDimensionalList){
        double c = 0;
        for (TwoDim twoDim : twoDimensionalList) {
            c = c + twoDim.calcArea();
        }
        System.out.println("Sum Two Dim Area: " + c);
    }

    public static void calcTwoDimPerimeter(List<TwoDim> twoDimensionalList){
        double c = 0;
        for (TwoDim twoDim : twoDimensionalList) {
            c = c + twoDim.calcPerimeter();
        }
        System.out.println("Sum Two Dim Perimeter: " + c);
    }

    public static void calcThreeDimSurface(List<ThreeDim> threeDimensionalList){
        double c = 0;
        for (ThreeDim threeDim : threeDimensionalList) {
            c = c + threeDim.calcSurface();
        }
        System.out.println("Sum Three Dim Surface: " + c);
    }

    public static void calcThreeDimVolume(List<ThreeDim> threeDimensionalList){
        double c = 0;
        for (ThreeDim threeDim : threeDimensionalList) {
            c = c + threeDim.calcVolume();
        }
        System.out.println("Sum Three Dim Volume: " + c);
    }


}
