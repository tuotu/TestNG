package core.utils;

import core.Parameter;
import core.process.DataTypeFactory;
import javassist.*;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.LocalVariableAttribute;
import javassist.bytecode.MethodInfo;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author wiley
 * @date 2018/1/25 0025 17:26
 */
public class ObjectUtil {
    /**
     * 强制转换String到Date类型
     * @param dateStr
     * @return
     */
    public static Date parseDate(String dateStr) {
        if (null == dateStr && "".equals(dateStr)) {
            return null;
        }
        String fmtString = null;
        if (dateStr.contains(":")) {
            fmtString = "yyyy-mm-dd HH:mm:ss";
        } else {
            fmtString = "yyyy-MM-dd";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(fmtString, Locale.UK);
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            return null;
        }

    }

    /**
     * 获取指定类和方法的参数名
     *
     * @param targetClass
     * @param targetMethodName
     * @return
     */
    public static String[] getMethodVariableNames(String targetClass, String targetMethodName) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(targetClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ClassPool pool = ClassPool.getDefault();
        pool.insertClassPath(new ClassClassPath(clazz));
        CtClass cc;
        CtMethod cm = null;
        try {
            cc = pool.get(clazz.getName());
            cm = cc.getDeclaredMethod(targetMethodName);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        // 使用javaassist的反射方法获取方法的参数名
        MethodInfo methodInfo = cm.getMethodInfo();
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        LocalVariableAttribute attr = (LocalVariableAttribute) codeAttribute
                .getAttribute(LocalVariableAttribute.tag);
        String[] variableNames = new String[0];
        try {
            variableNames = new String[cm.getParameterTypes().length];
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        int staticIndex = Modifier.isStatic(cm.getModifiers()) ? 0 : 1;
        for (int i = 0; i < variableNames.length; i++)
            variableNames[i] = attr.variableName(i + staticIndex);
        return variableNames;
    }

    /**
     * 获取csv文件参数，并组装成parameter对象，并返回list
     * @param method
     * @param csvContent
     * @return
     */
    public static List<List<Parameter>> getMethodParameters(Method method, List<Map<String, String>> csvContent) {
        Class<?> cls = method.getDeclaringClass();
        //获取方法的参数
        Class<?>[] clss = method.getParameterTypes();
        String[] methodParameters = getMethodVariableNames(cls.getName(), method.getName());
        List<List<Parameter>> list = new ArrayList<List<Parameter>>();
        for (int i = 0; i < csvContent.size(); i++) {
            List<Parameter> parameterList = new ArrayList<Parameter>();
            for (int j = 0; j < clss.length; j++) {
                Parameter para = new Parameter();
                para.setName(methodParameters[j]);
                para.setValue(csvContent.get(i).get(methodParameters[j]));
                para.setCls(clss[j]);
                parameterList.add(para);
            }
            list.add(parameterList);
        }
        return list;
    }

    /**
     * 转换Parameter的数据类型
     */
    public static Object processParameters(Parameter para){
        Object obj = DataTypeFactory.process(para);
        return obj;
    }

    /**
     * 遍历所有的参数对象，并返回object数组
     * @param paList
     * @return
     */
    public static Object[][] processParams(List<List<Parameter>> paList){
        Object[][] objArray = new Object[paList.size()][];
        for (int i = 0; i < paList.size(); i++) {
            Object[] paraObject = new Object[paList.get(i).size()];
            for (int j = 0; j < paList.get(i).size(); j++) {
                Object obj = processParameters(paList.get(i).get(j));
                paraObject[j] = obj;
            }
            objArray[i] = paraObject;
        }
        return objArray;
    }



}
