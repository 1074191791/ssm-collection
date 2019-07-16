package com.zhou.utils;

import com.zhou.emum.DataSourceKey;

/**
 * @author zhous
 * @create 2019-07-06 17:47
 */
public class DatasourceContextHolder {

    private DatasourceContextHolder() {
    }

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    /**
     * 设置数据源
     */
    public static void setDataSourceType(DataSourceKey dbKey) {
        CONTEXT_HOLDER.set(dbKey.getDbKey());
    }

    /**
     * 获取当前的数据源
     *
     * @return
     */
    public static String getDataSourceType() {
        return CONTEXT_HOLDER.get();
    }

    /**
     * 清空数据源
     */
    public static void clearDataSourceType() {
        CONTEXT_HOLDER.remove();
    }
}
