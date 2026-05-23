package edu.sdccd.cisc191.roles;



public class Tank extends Class_role{
    @Override
    double health() {
        return 6;
    }

    @Override
    String abillity() {
        return "agro";
    }

    @Override
    double damage() {
        return 4;
    }

    @Override
    public double speed() {
        return 5;
    }


}
