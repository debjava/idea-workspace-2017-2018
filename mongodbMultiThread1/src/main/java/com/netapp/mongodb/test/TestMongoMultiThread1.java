package com.netapp.mongodb.test;

public class TestMongoMultiThread1 {

  public static void main(String[] args) {

    String host = "vmwdwjdb01-stg.dmz.netapp.com";
    int port = 27100;
    String user = "devUser";
    String pass = "Netapp23";
    String database = "spogCacheStageDb";
    char[] passwordchars = pass.toCharArray();

    Thread thread1 = new MongoThread(host, port, user, passwordchars, database);
    Thread thread2 = new MongoThread(host, port, user, passwordchars, database);

    thread1.start();
    thread2.start();
  }
}
