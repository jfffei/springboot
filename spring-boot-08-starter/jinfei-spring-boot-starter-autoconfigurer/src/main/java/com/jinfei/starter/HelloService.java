package com.jinfei.starter;

public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHelloJinfei(String name) {
        return helloProperties.getPrefix() + "-" + name + helloProperties.getSuffix();
    }
}
