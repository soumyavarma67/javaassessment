
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.swing.RowSorter.SortKey;
import javax.swing.text.html.HTMLDocument.Iterator;

public class SortingHashMap implements Comparator{
	  Integer sno;
	  String name;
	  
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void sortHash(HashMap<Integer, String> hm){
		
		
		
		System.out.println("Hash Map Before Sorting:");
		
		
		Set<Entry<Integer,String>> iter=hm.entrySet();
	
		for(Entry<Integer,String> entry:iter){
			
			System.out.println(entry.getKey()+":"+entry.getValue());
	 }
		
		
		
	}
	public static void main(String args[]){
		SortingHashMap ob=new SortingHashMap();
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("Enter the ID:");
			ob.sno=sc.nextInt();
			System.out.println("Enter the Name:");
			ob.name=sc.next();
			hm.put(ob.sno, ob.name);
			
		}
		
		ob.sortHash(hm);
	}
	@Override
	public int compare(Object o1, Object o2) {
		SortingHashMap sm=(SortingHashMap)o1;
		
		SortingHashMap sm1= (SortingHashMap)o2;
		if(sm.equals(sm.sno==sm1.sno))
			return 0;
		else if(sm.sno>sm1.sno)
			return 1;
		else 
			return -1;

       
		
	}

}
