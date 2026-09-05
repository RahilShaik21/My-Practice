package oops.collectionframe;

import org.jetbrains.annotations.NotNull;

import javax.naming.Name;
import java.util.Iterator;

public class DemoCf2 {
    static void main(String[] args) {
        NameContainer n=new NameContainer(new String[]{"hi","hello","rahil"});
//        Iterator<String> it=n.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        //Enchance for loop
        for(String name:n){
            System.out.println(name);
        }
    }
}
class NameContainer implements Iterable<String> {
        private String[] names;
        private int size;

        NameContainer(String[] names) {
            this.names = names;
            this.size = names.length;
        }

        @Override
        public @NotNull Iterator<String> iterator() {
            return new Iterator<String>() {
                private int pos = 0;
                @Override
                public boolean hasNext() {
                    return pos < size;
                }

                @Override
                public String next() {
                    return names[pos++];
                }
            };
        }

    }

