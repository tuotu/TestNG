package core.process.impl;

import core.Parameter;
import core.process.ObjectProcess;
import core.utils.ObjectUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wiley
 * @date 2018/1/29 0029 13:56
 */
public class ArrayListProcess implements ObjectProcess{

    public Object process(Parameter parameter) {
        String fieldType = parameter.getCls().getName();

        if (ArrayList.class.getName().equals(fieldType)){
            List<String> list = new ArrayList<String>();
            String[] arr = parameter.getValue().split("#");
            for (String str: arr) {
                list.add(str);
            }
            return list;
        }
        return null;
    }
}
