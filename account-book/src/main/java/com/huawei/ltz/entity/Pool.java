package com.huawei.ltz.entity;

import java.util.List;

/**
 * 父类，资金池由多笔CashFlow构成
 * 
 * @author  l00383602
 * @version  [0.1v, 2018年2月20日]
 */
public abstract class Pool
{
    private List<CashFlow> cashFlows;
    
    public List<CashFlow> getCashFlows()
    {
        return cashFlows;
    }
    
    public void setCashFlows(List<CashFlow> cashFlows)
    {
        this.cashFlows = cashFlows;
    }
    
}
