package com.shlok.Collections.set.Admission;

import java.util.Objects;

public class Student {
    private int stdId;
    private String stdName; 
    private String stdEmail; 
    private String Cource;

    
    
    public Student() {
    }

    public Student(int stdId, String stdName, String stdEmail, String cource) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdEmail = stdEmail;
        Cource = cource;
    }

    public int getStdId() {
        return stdId;
    }
    public void setStdId(int stdId) {
        this.stdId = stdId;
    }
    public String getStdName() {
        return stdName;
    }
    public void setStdName(String stdName) {
        this.stdName = stdName;
    }
    public String getStdEmail() {
        return stdEmail.toLowerCase();
    }
    public void setStdEmail(String stdEmail) {
        this.stdEmail = stdEmail.toLowerCase();
    }
    public String getCource() {
        return Cource;
    }
    public void setCource(String cource) {
        Cource = cource;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((stdEmail == null) ? 0 : stdEmail.toLowerCase().hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student other = (Student) obj;

        return Objects.equals(stdEmail.toLowerCase(), other.stdEmail.toLowerCase());
    }
    
}
