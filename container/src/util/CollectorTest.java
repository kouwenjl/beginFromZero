package util;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CollectorTest {
    public static void main(String[] args) {
        StreamTestB testB=new StreamTestB("1","one");
        List<StreamTestB> list= Arrays.asList(testB,new StreamTestB("2","two"));
        list.stream().collect(Collector.of(ArrayList::new, ArrayList::add, (left, right) -> {
            System.out.println(66);
            left.addAll(right); return left; }));
}

}
class  StreamTestB implements Comparable<StreamTestB> {
    private String code;
    private String name;
    StreamTestB(String code,String name){
        this.name=name;
        this.code=code;

    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    @Override
    public int compareTo(StreamTestB o) {
        return this.code.compareTo(((StreamTestB)o).getCode());
    }
}
