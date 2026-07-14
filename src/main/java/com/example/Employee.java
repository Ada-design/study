package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @description: 员工
 * 
 * @author 16837
 * @date 2026-07-14 15:23:55
 */

@AllArgsConstructor
@Getter
@Setter
public class Employee {

    private String name;

    private BigDecimal salary;

    private Country country;

    private LocalDate hireDay;

    private Address address;
}
package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @description: 员工
 * 
 * @author 16837
 * @date 2026-07-14 15:23:55
 */

@AllArgsConstructor
@Getter
@Setter
public class Employee {

    private String name;

    private BigDecimal salary;

    private Country country;

    private LocalDate hireDay;
}
