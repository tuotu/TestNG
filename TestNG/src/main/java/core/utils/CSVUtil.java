package core.utils;

import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wiley
 * @date 2018/1/25 0025 15:57
 */
public class CSVUtil {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CSVUtil.class);

    public static List<Map<String, String>> readCSVFileAll(String filePath) {

        BufferedReader reader = null;
        try {
            File file = new File(filePath);
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
            reader = new BufferedReader(isr);
            List<Map<String, String>> csvContent = new ArrayList<Map<String, String>>();
            String[] title = reader.readLine().split(",");
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] csvList = line.split(",");
                Map<String, String> map = new HashMap<String, String>();
                for (int i = 0; i < csvList.length; i++){
                    String value = csvList[i];
                    if (value.contains("~")){
                        value = value.substring(1, value.length());
                    }
                    map.put(title[i], value.trim());
                }
                csvContent.add(map);
            }
            reader.close();
            return csvContent;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(filePath +": "+ e.getMessage());
        } catch (IOException e) {
            logger.info("文件读取错误");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


}
