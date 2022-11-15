package com.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class LeaveType {




    @Id
    @Column(Id = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(Category = "category")
    private String category;

    @NotNull
    @Column(totaldays = "totalDays")
    private int totalDays;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setLastname(int totalDays) {
        this.totalDays = totalDays;
    }

}
