package com.zhou.emum;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zhous
 * @create 2019-07-06 17:45
 */
@Getter
@AllArgsConstructor
public enum DataSourceKey {

    DB1("db1"),
    DB2("db2");

    private String dbKey;

}