package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 国家类
 * 
 * @author 16837
 * @date 2026-07-05 16:35:20
 */
@AllArgsConstructor
@Getter
public enum Country {

    China("China", "中国"),

    USA("USA", "美国");

    private final String name;
    private final String value;

}
