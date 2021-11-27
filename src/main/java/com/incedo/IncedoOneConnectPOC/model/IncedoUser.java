package com.incedo.IncedoOneConnectPOC.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IncedoUser {
    private String username;
    private String password;
    private String projectId;

    public IncedoUser(String username,String password,String projectId){
        this.username = username;
        this.password = password;
        this.projectId = projectId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getProjectId() {
        return projectId;
    }
}
