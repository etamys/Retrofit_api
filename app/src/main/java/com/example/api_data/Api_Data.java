package com.example.api_data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Api_Data {
    @SerializedName("id")
    @Expose
    private String id;

    public Api_Data(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @SerializedName("name")
    @Expose
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
