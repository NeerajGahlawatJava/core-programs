package com.app.java.core;

import java.util.*;

public final class EmployeeImmutable {

    private final int empId;

    private final String name;

    private final long salary;

    private final List<String> degrees;

    private final Map<String, Integer> metaData;

    private final Date joiningDate;

    public EmployeeImmutable(int empId, String name, long salary, Date joiningDate, List<String> degrees, Map<String, Integer> metaData) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.degrees = Collections.unmodifiableList(degrees);
        Map<String, Integer> tempMap = new HashMap<>();
        metaData.entrySet().stream().map(stringIntegerEntry -> tempMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue()));
        this.metaData = tempMap;
        this.joiningDate = new Date(this.getJoiningDate().getTime());
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public List<String> getDegrees() {
        return Collections.unmodifiableList(degrees);
    }

    public Map<String, Integer> getMetaData() {
        Map<String, Integer> tempMap = new HashMap<>();
        this.metaData.entrySet().stream().map(stringIntegerEntry -> tempMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue()));
        return tempMap;
    }

    public Date getJoiningDate() {
        return new Date(this.joiningDate.getTime());
    }
}
