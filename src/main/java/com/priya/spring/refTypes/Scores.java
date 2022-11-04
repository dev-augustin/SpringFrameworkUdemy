package com.priya.spring.refTypes;

public class Scores {
    private Double maths;
    private double physics;
    private Double chemistry;

    public Double getChemistry(){
        return chemistry;
    }
    public void setChemistry(Double chemistry){
        this.chemistry=chemistry;
    }

    public Double getMaths() {
        return maths;
    }

    public void setMaths(Double maths) {
        this.maths = maths;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "maths=" + maths +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                '}';
    }
}
