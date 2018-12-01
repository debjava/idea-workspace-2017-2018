package com.ddlab.rnd.hc;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.ClientNetworkConfig;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHazzleCastClient1 {
    public static void main(String[] args) {

        ClientConfig hcClientConfig = new ClientConfig();
        ClientNetworkConfig clientNetworkConfig = new ClientNetworkConfig();
        clientNetworkConfig.addAddress("192.168.119.1:5701");

        hcClientConfig.setNetworkConfig(clientNetworkConfig);
        HazelcastInstance client = HazelcastClient.newHazelcastClient(hcClientConfig);
        IMap map = client.getMap("customers");
//        Iterable itr = map.entrySet();
//        System.out.printf("-->"+client.getMap("abc"));

        Set keySet = map.keySet();
        Iterator itr = keySet.iterator();
        while( itr.hasNext() ) {
            Object obj = itr.next();
            System.out.printf(obj+"---"+map.get(obj));
        }

//        for (Map.Entry entry : map.entrySet())
//        {
//            System.out.println(entry.getKey() + "/" + entry.getValue());
//        }
        client.shutdown();
    }
}
