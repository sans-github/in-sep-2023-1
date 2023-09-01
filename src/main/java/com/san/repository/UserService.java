package com.san.repository;

import com.san.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  public User getUser(int id) {
    System.out.println("Getting user for id: " + id);
    String sql = "SELECT * FROM USER WHERE id = " + id;

    return (User)jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(User.class));
  }

  public void deleteUser(int id) {
    System.out.println("Deleting user for id: " + id);
    String sql = "DELETE FROM USER WHERE id = " + id;
    jdbcTemplate.update(sql);
  }
}
