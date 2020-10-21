package com.firstProject;

public class Stu {
    private int id;       //private 进行封装，通过get()和set()方法取值和赋值
    private String name;
    private String sex;
    private int num;

    public Stu(){

    }
    public Stu(int id,String name,String sex,int num){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.num = num;
    }
    public String toString(){
        return "Stu[id="+id+", name="+name+", sex="+sex+", num="+num+"]";
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
