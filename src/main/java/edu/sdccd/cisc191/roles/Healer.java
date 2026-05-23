package edu.sdccd.cisc191.roles;



public class Healer extends Class_role  {
    @Override
    double health() {
        return 3;
    }

    @Override
    String abillity() {
        return "heal";
    }

    @Override
    double damage() {
        return 2;
    }

    @Override
    public double speed() {
        return 6;
    }
}
