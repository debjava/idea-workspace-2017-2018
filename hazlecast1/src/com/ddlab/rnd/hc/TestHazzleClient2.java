package com.ddlab.rnd.hc;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.XmlClientConfigBuilder;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class TestHazzleClient2 {
    public static void main(String[] args) throws IOException {

        ClientConfig cfg = new XmlClientConfigBuilder( new File("E:\\idea-ws-2017\\hazlecast1\\src\\com\\ddlab\\rnd\\hc\\client-config.xml")).build();

//        ClientConfig cfg = new XmlClientConfigBuilder("client-config.xml").build();
        HazelcastInstance client = HazelcastClient.newHazelcastClient(cfg);
        IMap map = client.getMap("customers");

//        System.out.println("Map Size:" + map.size());
//        map.put("1","Piku");
//        map.put("2","Lilu");
//        map.put("3","Arzoo");

        Set keySet = map.keySet();
        Iterator itr = keySet.iterator();
        while( itr.hasNext() ) {
            Object obj = itr.next();
            System.out.println(obj+"---"+map.get(obj));
        }

        client.shutdown();

    }
}
