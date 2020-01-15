package com.thoughtworks.marsrover.first;

public class HelloWorld {
    private Dependency dependency;

    public HelloWorld(Dependency dependency) {

        this.dependency = dependency;
    }
    public String beenCalled() {
        return dependency.say();
    }
}
