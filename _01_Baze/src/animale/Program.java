package animale;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        HashMap<Caine, Papagal> map = new HashMap<>();
        map.put(new Caine("canina", 15, "pitbull"), new Papagal("pasare", 20, "verde"));
        map.put(new Caine("canina", 15, "amstaff"), new Papagal("pasare", 20, "galben"));

        for(Caine c : map.keySet()) {
            System.out.println("caine: " + c.getRasa());
        }

        for(Papagal p : map.values()) {
            System.out.println(p);
        }

        // treeSet
        Caine c1 = new Caine("canina", 15, "pitbull");
        Caine c2 = new Caine("canina", 12, "amstaff");

        Set<Caine> set = new TreeSet<Caine>();
        set.add(c1);
        set.add(c2);

        for(Caine x : set) {
            System.out.println(x);
        }

        System.out.println(set.toString());
    }
}
