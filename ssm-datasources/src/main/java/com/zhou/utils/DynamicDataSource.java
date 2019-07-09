package com.zhou.utils;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author zhous
 * @create 2019-07-06 17:48
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DatasourceContextHolder.getDataSourceType();
    }

}