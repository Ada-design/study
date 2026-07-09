package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 货币的种类
 * 
 * @author 16837
 * @date 2026-07-05 13:26:24
 */
@Getter
@AllArgsConstructor
public enum MoneyType {

    CNY("CNY", "人民币"),
    USD("USD", "美元"),
    EUR("EUR", "欧元"),
    GBP("GBP", "英镑"),
    JPY("JPY", "日元"),
    // 全球主流货币
    CHF("CHF", "瑞士法郎"),
    CAD("CAD", "加拿大元"),
    AUD("AUD", "澳大利亚元"),
    HKD("HKD", "港币"),
    SGD("SGD", "新加坡元"),
    // 亚太地区
    KRW("KRW", "韩元"),
    TWD("TWD", "新台币"),
    MOP("MOP", "澳门元"),
    THB("THB", "泰铢"),
    MYR("MYR", "马来西亚林吉特"),
    IDR("IDR", "印尼盾"),
    PHP("PHP", "菲律宾比索"),
    INR("INR", "印度卢比"),
    VND("VND", "越南盾"),
    // 其他地区
    RUB("RUB", "俄罗斯卢布"),
    BRL("BRL", "巴西雷亚尔"),
    ZAR("ZAR", "南非兰特"),
    MXN("MXN", "墨西哥比索"),
    SEK("SEK", "瑞典克朗"),
    NOK("NOK", "挪威克朗"),
    DKK("DKK", "丹麦克朗");
    

    
    private final String value;

    private  String name;

     /**
     * 业务常用工具方法：根据编码值反查枚举实例
     * @param value 货币编码
     * @return 对应枚举
     */
    public static MoneyType fromValue(String value) {
        for (MoneyType moneyType : values()) {
            if (moneyType.getValue().equals(value)) {
                return moneyType;
            }
        }
        throw new IllegalArgumentException("未知的货币类型编码: " + value);
    }
}
