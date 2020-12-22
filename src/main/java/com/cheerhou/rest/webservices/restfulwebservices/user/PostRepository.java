package com.cheerhou.rest.webservices.restfulwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/21
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
