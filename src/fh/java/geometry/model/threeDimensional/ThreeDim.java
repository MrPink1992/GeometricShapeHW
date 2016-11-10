package fh.java.geometry.model.threeDimensional;

import fh.java.geometry.model.GeometricShape;

/**
 * Created by MacS on 09.11.16.
 */
public abstract class ThreeDim extends GeometricShape {
    protected  double sideA;
    protected  double sideB;
    public abstract double calcSurface();
    public abstract double calcVolume();


}
