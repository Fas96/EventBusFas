package com.fas.eventbus.events;

public class EventSendData  {
    private String name;
    private String ID;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EventSendData(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }
}
