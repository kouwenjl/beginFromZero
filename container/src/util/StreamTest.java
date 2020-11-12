package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<StreamTestA> streamTestAS=new ArrayList<>();
        StreamTestA one=new StreamTestA("1","onr");
        StreamTestA two=new StreamTestA("2","two");
        streamTestAS.add(one);
        streamTestAS.add(two);
        System.out.println(streamTestAS.stream());
        System.out.println(streamTestAS.stream().map(t->{return t.getCode();}));
        System.out.println(streamTestAS.stream().flatMap(t->{return Stream.of("s");}));

    }

}

class  StreamTestA<T> {
    private T a;
    private String code;
    private String name;
    StreamTestA(String code,String name){
        this.name=name;
        this.code=code;

    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
