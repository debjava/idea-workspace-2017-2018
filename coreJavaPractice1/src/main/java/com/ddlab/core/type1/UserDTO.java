package com.ddlab.core.type1;

public class UserDTO {
  private String firstName;
  private String lastName;

  public UserDTO() {}

  public UserDTO(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public UserDTO(UserBean userBean) {
    this.firstName = userBean.getFirstName();
    this.lastName = userBean.getLastName();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "UserDTO{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
  }
}
