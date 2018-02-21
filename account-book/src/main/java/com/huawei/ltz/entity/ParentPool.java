package com.huawei.ltz.entity;

public class ParentPool extends Pool
{
    private static String poolName;
    
    public static String getPoolName()
    {
        return poolName;
    }
    
    public static void setPoolName(String poolName)
    {
        ParentPool.poolName = poolName;
    }
    
}