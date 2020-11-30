package lang;

/**
 * 重写两小一大： 子类的异常类型和返回值类型要小于等于父类 修饰符范围要大于等于父类
 *
 * 深拷贝:1.序列化对象然后反序列化 2.手动在对象的clone中 为属性重新new 一个对象 然后把旧对象的值赋值进来
 */

public class ObjectTest implements Cloneable{
    private SubObjectTest objectTest = new SubObjectTest();

    /**
     *
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
//        Object
        ObjectTest objectTest = new ObjectTest();
        System.out.println("原始对象:" + objectTest);
        System.out.println("原始对象属性:" + objectTest.getObjectTest());
        objectTest = objectTest.clone();
        System.out.println("复制对象:" + objectTest);
        System.out.println("复制对象属性:" + objectTest.getObjectTest());
    }

    public SubObjectTest getObjectTest() {
        return objectTest;
    }

    public void setObjectTest(SubObjectTest objectTest) {
        this.objectTest = objectTest;
    }

    @Override
    public ObjectTest clone() throws CloneNotSupportedException {
        return (ObjectTest) (super.clone());
    }
}

class SubObjectTest implements Cloneable{
    private String cloneFiled = "cloneFiled";

    public String getCloneFiled() {
        return cloneFiled;
    }

    public void setCloneFiled(String cloneFiled) {
        this.cloneFiled = cloneFiled.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("子类的copy方法");
        return super.clone();
    }
}
