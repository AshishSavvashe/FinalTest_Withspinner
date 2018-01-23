package com.example.admin.finaltest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Dell on 23-01-2018.
 */

public class CountryClass implements Serializable {

    @SerializedName("department_id")
    @Expose
    private String departmentId;

    @SerializedName("department_name")
    @Expose
    private String departmentName;

    public String getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public CountryClass(String departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }
}