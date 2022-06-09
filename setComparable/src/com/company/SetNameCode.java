package com.company;

import java.util.Objects;

public class SetNameCode {
    private String name;
    private int code;

    public SetNameCode(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetNameCode that = (SetNameCode) o;
        return code == that.code && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code);
    }

    @Override
    public String toString() {
        return "SetNameCode{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
