package riak1.riak1;

import java.util.LinkedList;
import java.util.List;

import com.basho.riak.client.api.RiakClient;
import com.basho.riak.client.api.commands.kv.FetchValue;
import com.basho.riak.client.api.commands.kv.StoreValue;
import com.basho.riak.client.core.RiakCluster;
import com.basho.riak.client.core.RiakNode;
import com.basho.riak.client.core.query.Location;
import com.basho.riak.client.core.query.Namespace;
import com.basho.riak.client.core.query.RiakObject;
import com.basho.riak.client.core.util.BinaryValue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	RiakNode.Builder builder = new RiakNode.Builder();
    	builder.withMinConnections(10);
    	builder.withMaxConnections(50);
    	
    	List<String> addresses = new LinkedList<String>();
    	addresses.add("192.168.78.128");
    	
    	
    	List<RiakNode> nodes = RiakNode.Builder.buildNodes(builder, addresses);
    	RiakCluster cluster = new RiakCluster.Builder(nodes).build();
    	cluster.start();
    	RiakClient client = new RiakClient(cluster);
    	
    	
    	Namespace ns = new Namespace("default", "my_bucket");
    	Location location = new Location(ns, "my_key");
    	RiakObject riakObject = new RiakObject();
    	riakObject.setValue(BinaryValue.create("my_value"));
    	StoreValue store = new StoreValue.Builder(riakObject)
    	  .withLocation(location).build();
//    	  .withOption(Option.W, new Quorum(3)).build();
    	client.execute(store);
    	
    	
//    	Namespace ns = new Namespace("default","my_bucket");
//    	Location location = new Location(ns, "my_key");
    	FetchValue fv = new FetchValue.Builder(location).build();
    	FetchValue.Response response = client.execute(fv);
    	RiakObject obj = response.getValue(RiakObject.class);
    	
    	System.out.println("-------------");
    }
}
