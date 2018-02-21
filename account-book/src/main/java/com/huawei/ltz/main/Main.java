package com.huawei.ltz.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.huawei.ltz.entity.CashFlow;
import com.huawei.ltz.utils.Convert;
import com.huawei.ltz.utils.ReadExcel;

/**
 * Hello world!
 *
 */
public class Main
{
    private static String filePath;
    
    private static List<String> poolNames;
    
    private static void init()
    {
        filePath = "D:\\l00383602\\files\\tmp\\无用\\finasion\\test.xlsx";
        
        poolNames = new ArrayList<String>();
        poolNames.add("MinePool");
        poolNames.add("LoadPool");
        poolNames.add("ParentPool");
        
        
    }
    
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        init();
        
        HashMap<String, XSSFSheet> sheetMap = ReadExcel.readExcelFrom(filePath,
                poolNames);
        List<CashFlow> cashFlows = Convert.excel2Pool(sheetMap);
    }
}
