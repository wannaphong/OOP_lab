package com.company;

public class Student extends CIS {
    public static void getUniversity() { // เรียกใช้งานได้โดยที่ไม่ต้องสร้างวัตถุ
        //System.out.println(university);
    }
    public void getFaculty() {
        System.out.println(faculty);
    }
    void getCampus(){
        System.out.println(campus);
    }
}
