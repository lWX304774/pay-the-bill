package com.huawei.ltz.entity;

/**
 * 每一笔资金流
 * 
 * @author  l00383602
 * @version  [0.1v, 2018年2月20日]
 */
public class CashFlow
{
    // 是支出还是收入
    private boolean isIncome;
    
    /**
     * "1 活期
        2 投资
        3 现金
        4 收入
        5 支出"
     */
    private int type;
    
    private int time;
    
    // 金额
    private int amount;
    
    // 投资平台
    private String platform;
    
    // 投资人
    private String investor;
    
    private String description;

    public boolean isIncome()
    {
        return isIncome;
    }

    public void setIncome(boolean isIncome)
    {
        this.isIncome = isIncome;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public int getTime()
    {
        return time;
    }

    public void setTime(int time)
    {
        this.time = time;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public String getPlatform()
    {
        return platform;
    }

    public void setPlatform(String platform)
    {
        this.platform = platform;
    }

    public String getInvestor()
    {
        return investor;
    }

    public void setInvestor(String investor)
    {
        this.investor = investor;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
    
}
