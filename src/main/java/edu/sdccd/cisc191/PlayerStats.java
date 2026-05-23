package edu.sdccd.cisc191;

import edu.sdccd.cisc191.roles.Class_role;

import java.util.ArrayList;
import java.util.List;

public class PlayerStats {
    public static Class_role chosenRole;

    // base stats
    public static double health = 3.0;
    public static double paddledamage= 1.0;
    public static int cScore;
    public static List<Integer> scoreHistory = new ArrayList<>();

}
