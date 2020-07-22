package Hashing.ObjectStore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ObjectStore {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Store> hm = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<2; i++)
        {
            System.out.println("Enter no of index "+i);
            int no = Integer.parseInt(br.readLine());
            System.out.println("Enter name of index "+i);
            String name = br.readLine();
            System.out.println("Enter all marks of index "+i);
            String s = br.readLine();
            String [] str = s.trim().split("\\s+");
            List<Integer> marks = new LinkedList<>();
            for(int j=0; j<str.length; j++)
            {
                marks.add(Integer.parseInt(str[j]));
            }
            Store store = new Store(no,name,marks);
            hm.put(i,store);
        }
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println("Key: "+pair.getKey());
            System.out.println(hm.get(pair.getKey()).no);
            System.out.println(hm.get(pair.getKey()).name);
            System.out.println("Size of Linked List: "+hm.get(pair.getKey()).marks.size());
            for(int i=0; i<hm.get(pair.getKey()).marks.size(); i++) {
                System.out.println(hm.get(pair.getKey()).marks.get(i));
            }
        }
    }
}
class Store{
    int no;
    String name;
    List<Integer> marks;
    Store(int no, String name, List<Integer> marks)
    {
        this.no = no;
        this.name = name;
        this.marks = marks;
    }
    Store()
    {

    }
}

/*
Enter no of index 0
01
Enter name of index 0
ABC
Enter all marks of index 0
99
Enter no of index 1
02
Enter name of index 1
ERT
Enter all marks of index 1
99 66 55
Key: 0
1
ABC
Size of Linked List: 1
99
Key: 1
2
ERT
Size of Linked List: 6
99
66
55
 */