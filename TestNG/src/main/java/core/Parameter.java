package core;
import java.io.Serializable;

public class Parameter implements Serializable{
    //参数名
    private String name;
    //参数值
    private String value;
    //参数的数据类型
    private Class cls;

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCls(Class cls) {
        this.cls = cls;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public Class getCls() {
        return cls;
    }

    @Override
    public String toString() {
        return "Parameter: " + name +", value = " + value + ", and it's type is " + cls;
    }
}
