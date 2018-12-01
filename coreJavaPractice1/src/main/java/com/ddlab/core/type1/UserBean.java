package com.ddlab.core.type1;

public class UserBean {
  private String firstName;
  private String lastName;

  public UserBean() {}

  public UserBean(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
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
    return "UserBean{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
  }
}
