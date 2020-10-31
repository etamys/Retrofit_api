package com.example.api_data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class data {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("practicearea")
    @Expose
    private ArrayList<Api_Data> practicearea;

    public data(String status, ArrayList<Api_Data> practicearea) {
        this.status = status;
        this.practicearea = practicearea;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<Api_Data> getPracticearea() {
        return practicearea;
    }
}
