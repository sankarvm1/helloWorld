package test;

import org.junit.Test;

import main.HelloWorld;

public class HelloWorldTest {

    @Test
    public void testHello() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.hello();
    }


}
