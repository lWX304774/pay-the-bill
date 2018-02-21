package com.huawei.ltz.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel
{
    private static Logger logger = Logger.getLogger(ReadExcel.class.toString());
    
    public static HashMap<String, XSSFSheet> readExcelFrom(String file,
            List<String> sheetNames)
    {
        // 保存sheet名称与内容 映射关系
        HashMap<String, XSSFSheet> sheetMap = new HashMap<String, XSSFSheet>();
        try
        {
            System.out.println(
                    "File name is " + file + ", sheet name is " + sheetNames);

            InputStream inp = new FileInputStream(file);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inp);
            
            for (String sheetName : sheetNames)
            {
                sheetMap.put(sheetName, xssfWorkbook.getSheet(sheetName));
            }
            
            xssfWorkbook.close();
        }
        catch (FileNotFoundException e)
        {
            logger.error("file: " + file + " not found!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            logger.error("IOException!");
            e.printStackTrace();
        }
        return sheetMap;
    }
    
}
