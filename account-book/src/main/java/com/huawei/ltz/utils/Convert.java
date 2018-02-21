package com.huawei.ltz.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import com.huawei.ltz.entity.CashFlow;
import com.huawei.ltz.entity.MinePool;
import com.huawei.ltz.entity.Pool;

public class Convert
{
    public static List<CashFlow> excel2Pool(HashMap<String, XSSFSheet> sheetMap)
    {
        // TODO 获取到sheet 转换为资金流，是否应该以资金池维度呢
        MinePool minePool = new MinePool();
        XSSFSheet mineSheet = sheetMap.get(minePool.getPoolName());
        int firstRowNum = mineSheet.getFirstRowNum();
        int lastRowNum = mineSheet.getLastRowNum();
        // TODO 一个cell去遍历，然后构造cashFlows
        System.out.println(mineSheet.getRow(0).getCell(0));
        System.out.println("last row is " + lastRowNum);
        
        Set<String> sheetNames = sheetMap.keySet();
        for (String sheetName : sheetNames)
        {
            
        }
        
        List<CashFlow> cashFlows = new ArrayList<CashFlow>();
        
        return cashFlows;
    }
    
}
