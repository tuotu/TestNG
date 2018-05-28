package core.process.impl;

import core.Parameter;
import core.process.ObjectProcess;
import core.utils.ObjectUtil;

import java.util.Date;

/**
 * @author wiley
 * @date 2018/1/25 0025 17:21
 */
public class NormalProcess implements ObjectProcess {

    public Object process(Parameter parameter) {
        String fieldType = parameter.getCls().getName();
        String value = parameter.getValue();

        if (String.class.getName().equals(fieldType)){
            return String.valueOf(value);
        }else if (Date.class.getName().equals(fieldType)){
            Date date = ObjectUtil.parseDate(value);
            if (null != date){
                return date;
            }
            return null;
        }else if (Integer.class.getName().equals(fieldType) || "int".equals(fieldType)){
            if (null == value || "".equals(value)){
                value = "0";
            }
            return Integer.parseInt(value);
        }else if (Long.class.getName().equals(fieldType) || "long".equals(fieldType)){
            if (null == value || "".equals(value)){
                value = "0";
            }
            return Long.parseLong(value);
        }else if (Double.class.getName().equals(fieldType) || "double".equals(fieldType)){
            if (null == value || "".equals(value)){
                value = "0";
            }
            return Double.parseDouble(value);
        }else if (Boolean.class.getName().equals(fieldType) || "boolean".equals(fieldType)){
            return Boolean.parseBoolean(value);
        }else if (Float.class.getName().equals(fieldType) || "float".equals(fieldType)){
            if (null == value || "".equals(value)){
                value = "0";
            }
            return Float.parseFloat(value);
        }


        return null;
    }
}
