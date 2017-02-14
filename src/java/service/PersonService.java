package service;

import org.springframework.stereotype.Service;

/**
 * Created by liliang on 2017/2/13.
 */
@Service
public class PersonService implements IPersonService {

    public String sayHello() {
        return "Hello";
    }
}
