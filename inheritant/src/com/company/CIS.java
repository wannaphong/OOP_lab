package com.company;

public class CIS {
    public static String address = "112 M.7 T. Nong Kom Koh Muang District, Nong Khai Thailand 43000";
    protected static String faculty = "Faculty of Applied Science and Engineering";
    private static String university = "Khon Kaen University";
    public static void displayUniversity() {
        System.out.println(university);
    }
    protected static void displayFaculty() {
        System.out.println(faculty);
    }
    private static void displayAddress() {
        System.out.println(address);
    }

}
