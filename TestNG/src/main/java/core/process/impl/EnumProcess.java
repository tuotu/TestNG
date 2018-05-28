package core.process.impl;

import core.Parameter;
import core.process.ObjectProcess;
import core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wiley
 * @date 2018/1/29 0029 14:07
 */
public class EnumProcess implements ObjectProcess {
    private static final Logger logger	= LoggerFactory.getLogger(EnumProcess.class.getName());
    public Object process(Parameter parameter) {
        Object obj = null;
        String fieldType = parameter.getCls().getName();
        String fieldValue = parameter.getValue();
        if (parameter.getCls().isEnum() && StringUtils.isNotBank(fieldValue)){
            try {
                obj = Enum.valueOf(parameter.getCls(), fieldValue);
            }catch (RuntimeException e){
                logger.error("枚举值" + fieldValue + "不能转换成枚举：" + fieldType);
            }
            return obj;
        }

        return null;
    }
}
