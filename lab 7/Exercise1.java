import java.util.Map;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;
import java.util.*;

class Exercise1
{
	public Set<String> getValues(Map<String, String> m1)
	{
		Set<String> li=new TreeSet<String>(m1.values());
		
	
	return li;
	}
	
	public static void main(String args[]){
	Map<String, String> m=new HashMap<String, String>();
	m.put("1001","akki");
	m.put("1004","abhi");
	m.put("1003","rohith");
	m.put("1002", "kailash");
	Exercise1 e1=new Exercise1();
	System.out.println("Values of the map in sorted order as a list:\n\n"+e1.getValues(m));
	}
}