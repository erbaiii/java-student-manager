package com.erbai;

public class Student {
    private String studentNo;
    private String studentName;
    private String studentSex;
    private Manager myManager;

    public Student() {

    }

    public Manager getMyManager() {
        if (this.myManager == null) this.myManager = new Manager();
        return myManager;
    }

    public void setMyManager(Manager myManager) {
        this.myManager = myManager;
    }

    public Student(String studentNo, String studentName, String studentSex, int studentAge) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
        this.setMyManager(myManager);
    }
    public Student(String studentNo, String studentName, String studentSex, int studentAge, Manager myManager) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
        this.setMyManager(myManager);
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    private int studentAge;

    public String introduction(String subjectName, int subjectLife) {
        String str = "" +
                "学生信息如下：\n姓名："
                + this.getStudentName()
                + "\n学号："
                + this.getStudentNo()
                + "\n性别："
                + this.getStudentSex()
                + "\n年龄："
                + this.getStudentAge()
                + "\n所报专业名称："
                + this.getMyManager().getSubjectName()
                + "\n学制年限："
                + this.getMyManager().getSubjectLife()
                ;
        return str;
    }

    public String introduction(Manager myManager) {
        String str = "" +
                "学生信息如下：\n姓名："
                + this.getStudentName()
                + "\n学号："
                + this.getStudentNo()
                + "\n性别："
                + this.getStudentSex()
                + "\n年龄："
                + this.getStudentAge()
                + "\n所报专业名称："
                + myManager.getSubjectName()
                + "\n学制年限："
                + myManager.getSubjectLife();
        return str;
    }
    public String introduction() {
        String str = "" +
                "学生信息如下：\n姓名："
                + this.getStudentName()
                + "\n学号："
                + this.getStudentNo()
                + "\n性别："
                + this.getStudentSex()
                + "\n年龄："
                + this.getStudentAge()
                + "\n所报专业名称："
                + this.getMyManager().getSubjectName()
                + "\n学制年限："
                + this.getMyManager().getSubjectLife()
                ;
        return str;
    }
}
