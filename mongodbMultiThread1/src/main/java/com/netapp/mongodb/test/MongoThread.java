package com.netapp.mongodb.test;

import com.mongodb.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MongoThread extends Thread {

  private String host;
  private int port;
  private String user;
  private String database;
  private char[] passwordchars;

  private List<ServerAddress> cluster = new ArrayList<ServerAddress>();

  public MongoThread(String host, int port, String user, char[] passwordchars, String database) {
    this.host = host;
    this.port = port;
    this.user = user;
    this.passwordchars = passwordchars;
    this.database = database;

    // add server hosts and ports
    cluster.add(new ServerAddress("vmwdwjdb01-stg.dmz.netapp.com", port));
    cluster.add(new ServerAddress("vmwdwjdb02-stg.dmz.netapp.com", port));
    cluster.add(new ServerAddress("vmwdwjdb03-stg.dmz.netapp.com", port));
  }

  @Override
  public void run() {
    long threadId = Thread.currentThread().getId();
    System.out.println("Thread Id : " + threadId);

    // Add the business logic here
    MongoCredential credential =
        MongoCredential.createScramSha1Credential(user, database, passwordchars);

    MongoClientOptions.Builder clientOptions = new MongoClientOptions.Builder();
    clientOptions.minConnectionsPerHost(100);
    clientOptions.connectionsPerHost(500);

    MongoClient mongoClient = new MongoClient(cluster, Arrays.asList(credential));
    mongoClient.getMongoOptions().setConnectionsPerHost(19);
    mongoClient.getMongoOptions().connectionsPerHost = 10;
    System.out.println(
        "after setting pool size: " + mongoClient.getMongoOptions().getConnectionsPerHost());

    DB db = mongoClient.getDB("spogCacheStageDb");

    DBCollection table = db.getCollection("EDGTest");
    table = db.getCollection("applrole_to_widgets");
    table = db.getCollection("application_roles");
    table = db.getCollection("user_widget_preferences");

    System.out.println("table row count: " + table.count());
    BasicDBObject searchQuery = new BasicDBObject();

    searchQuery.put("userId", "robertlewallen");

    DBCursor cursor = table.find(searchQuery);

    System.out.println("Read Data...");
    while (cursor.hasNext()) {
      System.out.println(cursor.next());
    }

    System.out.println("Executions Completed");

    try {
      TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
