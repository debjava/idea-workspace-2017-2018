package com.ddlab.rnd.hc;

import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import javax.swing.*;

public class GettingStartedClient {

    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.addAddress("192.168.119.1:5701");
        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
        IMap map = client.getMap("customers");
        System.out.println("Map Size:" + map.size());
//        map.put("1","Piku");
//        map.put("2","Lilu");
//        map.put("3","Arzoo");
//
//        IMap map1 = client.getMap("FirstMap");
//        map1.put("207","Abcd-Hati-Ghoda");

        IMap mapi = client.getMap("FirstMap");
        System.out.printf("mapi---->"+mapi.get("207"));


        client.shutdown();

    }
}
