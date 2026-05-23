package edu.sdccd.cisc191.roles;


public class Dps extends Class_role  {
    @Override
    double health() {
        return 1;
    }

    @Override
    String abillity() {
        return "killshot";
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
