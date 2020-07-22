package MISC.ObjectFun;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Store
{
    int no;
    String name;
    List<Integer> marks;
    Store next;
    Store(int no, String name, List<Integer> marks, Store next)
    {
        this.no = no;
        this.name = name;
        this.marks = marks;
        this.next = next;
    }
    Store()
    {

    }
}

public class ObjectFun
{
    public static void main(String[] args) {
        List<Store> list_Store = new LinkedList<>();
        Store s2 = new Store();
        list_Store.add(new Store(1,"Harsh", new LinkedList<>(), s2));
        list_Store.get(0).marks.add(99);
        list_Store.get(0).marks.add(89);
        list_Store.get(0).marks.add(79);

        System.out.println(list_Store.get(0).no);
        System.out.println(list_Store.get(0).name);
        System.out.println(list_Store.get(0).marks.get(0));
        PrintMarks(list_Store.get(0).marks);

        System.out.println(list_Store.get(0).next);
    }
    public static void PrintMarks(List<Integer> l)
    {
        ListIterator it = l.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
