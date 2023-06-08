package com.erbai;

public class Manager {
    private String subjectName;
    private String subjectNo;
    private int subjectLife;
    public Manager(){

    }
    public Manager(String subjectName,String subjectNo, int subjectLife){
        this.subjectName = subjectName;
        this.subjectNo = subjectNo;
        this.subjectLife = subjectLife;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    public void setSubjectLife(int subjectLife) {
        this.subjectLife = subjectLife;
    }

}
