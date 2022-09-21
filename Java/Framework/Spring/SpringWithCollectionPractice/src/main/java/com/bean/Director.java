package com.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Director {
    String name;
    List<String> mobileno;
    Set<String> movies  ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMobileno() {
        return mobileno;
    }

    public void setMobileno(List<String> mobileno) {
        this.mobileno = mobileno;
    }

    public Set<String> getMovies() {
        return movies;
    }

    public void setMovies(Set<String> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", mobileno=" + mobileno +
                ", movies=" + movies +
                '}';
    }
}

