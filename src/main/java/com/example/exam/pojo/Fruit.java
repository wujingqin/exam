package com.example.exam.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author qin
 * @version 2.0
 * @project exam
 * @description 水果类
 */
@Data
public class Fruit {
    private String fruitName;
    private BigDecimal fruitPrice;//单价
    private Integer fruitNum;//购买数量
    private Integer fruitType;//1:苹果 2：草莓 3：芒果
    private BigDecimal discount = new BigDecimal(1.0);//折扣
}
