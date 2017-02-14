package service;

import base.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by liliang on 2017/2/13.
 */
public class PersonServiceTest extends TestBase {


    @Autowired
    private IPersonService personServcie;

    @Test
    public void sayHelloTest() {

        String result = this.personServcie.sayHello();

        System.out.println(result);

        assertEquals("Hello", result);

    }

    @Test
    public void apptest() {

        ApplicationContext result = this.applicationContext;

        assertNotNull(result);

    }

}

