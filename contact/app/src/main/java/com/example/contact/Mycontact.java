package com.example.contact;

public class Mycontact {
    int imageId;
    String name;
    String phone;

    public Mycontact() {
    }

    public Mycontact(int imageId, String name, String phone) {
        this.imageId = imageId;
        this.name = name;
        this.phone = phone;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
