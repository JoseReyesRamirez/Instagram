
package com.mycompany.proyecto;
import java.util.Date;
/**
 *
 * @author CCCU
 */
public class Session {

    private String username;
    private Date loginTime;

    public Session(String username) {
        this.username = username;
        this.loginTime = new Date();
    }

    public String getUsername() {
        return username;
    }

    }

