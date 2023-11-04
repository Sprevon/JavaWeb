package com.greenhub;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Comments
 * @Author LeonBwChen
 * @Date 2023/11/4 19:00
 */
public class Users implements Serializable {
    @Serial
    private static final long serialVersionUID = -3687612087489890324L;
    private String username;
    private String password;

    public Users() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
