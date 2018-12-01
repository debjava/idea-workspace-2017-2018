package com.ddlab.core.type1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalType1 {

  public static void traditionalWay() {
    UserRepository userRepo = new UserRepository();
    List<UserBean> userList = userRepo.findAllUsers();
    // Print the values
    userList.forEach(System.out::println);

    // Convert List of UserBean to UserDTO in traditional way
    List<UserDTO> userDTOList = new ArrayList<>();
    for (UserBean user : userList) {
      userDTOList.add(new UserDTO(user.getFirstName(), user.getLastName()));
    }
    System.out.println("--------------------------");
    // Print user dto list
    userDTOList.forEach(System.out::println);
  }

  public static void functionalWay1() {
    UserRepository userRepo = new UserRepository();
    List<UserDTO> userDTOList =
        userRepo
            .findAllUsers()
            .stream()
            .map(
                userBean -> {
                  return new UserDTO(userBean.getFirstName(), userBean.getLastName());
                })
            .collect(Collectors.toList());
    userDTOList.forEach(System.out::println);
  }

  public static void functionalWay2() {
    UserRepository userRepo = new UserRepository();
    List<UserDTO> userDTOList =
        userRepo.findAllUsers().stream().map(FunctionalType1::toDTO).collect(Collectors.toList());
    userDTOList.forEach(System.out::println);
  }

  private static UserDTO toDTO(UserBean userBean) {
    return new UserDTO(userBean.getFirstName(), userBean.getLastName());
  }

    public static void functionalWay3() { //Best way to do it
        UserRepository userRepo = new UserRepository();
        List<UserDTO> userDTOList =
                userRepo.findAllUsers().stream().map(UserDTO::new).collect(Collectors.toList());
        userDTOList.forEach(System.out::println);
    }

  public static void main(String[] args) {
    //    traditionalWay();
    //    functionalWay1();
//    functionalWay2();
      functionalWay3();
  }
}
//https://dzone.com/articles/functional-programming-patterns-with-java-8