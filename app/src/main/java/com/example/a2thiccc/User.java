package com.example.a2thiccc;

public class User {
    int id;
    String name, email, uname, pass;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    public void setuName(String uName){
        this.uname = uName;
    }

    public String getuName(){
        return this.uname;
    }

    public void setPass(String pass){
        this.pass = pass;
    }

    public String getPass(){
        return this.pass;
    }
}
