package com.ddlab.core.type1;

import java.util.Arrays;
import java.util.List;

public class UserRepository {

  public List<UserBean> findAllUsers() {
    return Arrays.asList(
        new UserBean("John", "Abraham"),
        new UserBean("Vidya", "Balan"),
        new UserBean("DD", "Mishra"));
  }
}
