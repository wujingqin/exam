package com.example.exam.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author qin
 * @version 1.0
 * @project exam
 * @description 水果类
 */
@Data
public class Fruit {
    private String fruitName;
    private BigDecimal fruitPrice;
    private String fruitType;//1:苹果 2：草莓 3：芒果
    private BigDecimal discount;//折扣
}
