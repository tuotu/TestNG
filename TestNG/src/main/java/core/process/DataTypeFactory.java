package core.process;

import core.Parameter;
import core.process.impl.ArrayListProcess;
import core.process.impl.EnumProcess;
import core.process.impl.NormalProcess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wiley
 * @date 2018/1/25 0025 17:11
 */
public class DataTypeFactory {
    private static final Logger logger = LoggerFactory.getLogger(DataTypeFactory.class);
    private static ObjectProcess[] process = {new NormalProcess(), new ArrayListProcess(), new EnumProcess()};

    public static Object process(Parameter parameter){
        Object obj = null;
        for (ObjectProcess pro: process) {

            try {
                obj = pro.process(parameter);
                if (obj != null){
                    break;
                }
            }catch (Throwable th){
                logger.error("字段转换出错");
            }
        }
        return obj;
    }
}
