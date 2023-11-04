package com.tinklebi.www;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/11/4 15:35
 */
public class Users implements Serializable {
    @Serial
    private static final long serialVersionUID = -8649529106247935093L;
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Users() {
    }

}
