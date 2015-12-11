package com.example.mycompany.gradle.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.*;

public class Deploy extends DefaultTask {

    private String url;

    @TaskAction
    public void deploy() {
      System.out.println("Deploy a war file for the company's server: " + this.url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
