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

    /**
     * 数据源1标识
     */
    DB1("db1"),
    /**
     * 数据源2标识
     */
    DB2("db2");

    private String dbKey;

}