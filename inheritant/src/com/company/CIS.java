package com.company;

public class CIS {
    // private
    private static String university = "Khon Kaen University";
    // no modifier
    static String campus = "Nong Khai";
    static String cis = "Computer and Information Science";
    // protected
    protected static String faculty = "Faculty of Applied Science and Engineering";
    // public
    public static String address = "112 M.7 T. Nong Kom Koh Muang District, Nong Khai Thailand 43000";

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
