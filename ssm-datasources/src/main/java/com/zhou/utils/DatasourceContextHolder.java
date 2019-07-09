package com.zhou.utils;

import com.zhou.emum.DataSourceKey;

/**
 * @author zhous
 * @create 2019-07-06 17:47
 */
public class DatasourceContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    // 设置数据源
    public static void setDataSourceType(DataSourceKey dbKey) {
        contextHolder.set(dbKey.getDbKey());
    }

    // 获取当前的数据源
    public static String getDataSourceType() {
        return contextHolder.get();
    }

    // 清空数据源
    public static void clearDataSourceType() {
        contextHolder.remove();
    }
}
