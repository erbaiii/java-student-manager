package com.erbai;

public class Manager {
    private String subjectName;
    private String subjectNo;
    private int subjectLife;

    public Manager() {

    }

    public Manager(String subjectName, String subjectNo, int subjectLife) {
//        this.subjectName = subjectName;
//        this.subjectNo = subjectNo;
//        this.subjectLife = subjectLife;
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
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
        if (subjectLife <= 0) return;
        this.subjectLife = subjectLife;
    }

    public String info() {
        String str = "专业信息如下:\n专业名称：" + this.getSubjectName() + "\n专业编号" + this.getSubjectNo() + "\n学制" + this.getSubjectLife();
        return str;
    }

}
