package com.example.ggg.retrofit2test;

import com.google.gson.annotations.Expose;

/**
 * Created by GGG on 2/5/2560.
 */

public class Products {
    @Expose
    String pid;
    @Expose
    String name;
    @Expose
    String price;
    @Expose
    String description;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
