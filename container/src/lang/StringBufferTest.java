package lang;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StringBufferTest implements Serializable {
    String dxs="666";
    StringBuilderTest builderTest=new StringBuilderTest();
    public static void main(String[] args) throws Exception{
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("C:\\Users\\dxs\\Desktop\\yfids\\dxs.txt"));
        objectOutputStream.writeObject(new StringBufferTest());
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
