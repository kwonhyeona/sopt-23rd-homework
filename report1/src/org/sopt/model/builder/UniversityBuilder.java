package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {
    int idx;
    String name;
    String phone;
    String address;

    public UniversityBuilder setIdx(int idx) {
        this.idx = idx;
        return this;
    }

    public UniversityBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UniversityBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UniversityBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public University build() {
        return new University(idx, name, phone, address);
    }
}
