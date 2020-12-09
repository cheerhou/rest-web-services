package com.cheerhou.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/7
 */
@Component
public class UserDaoService {
    public static List<User> users = new ArrayList<>();

    private static int usersCount = 4;

    static {
        users.add(new User(1, "Jack", new Date()));
        users.add(new User(2, "Eva", new Date()));
        users.add(new User(3, "Mike", new Date()));
        users.add(new User(4, "Luck", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user: users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
