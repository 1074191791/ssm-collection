package com.zhou.aspect;

import com.zhou.annotation.DataSourceSelector;
import com.zhou.utils.DatasourceContextHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhous
 * @create 2019-07-06 17:51
 */
@Aspect
@Component
@Order(1)
public class DataSourceSelectorAdvice {

    // 定义切点, 用于db源切换
    @Pointcut("@annotation(com.zhou.annotation.DataSourceSelector)")
    public void selectorDB() {
    }

    @Around("selectorDB() && @annotation(dataSourceSelector)")
    public Object aroundSelectDB(ProceedingJoinPoint pjp, DataSourceSelector dataSourceSelector) throws Throwable {
        // 设置具体的数据源
        DatasourceContextHolder.setDataSourceType(dataSourceSelector.dataSource());
        try {
            // 执行拦截的方法本体
            return pjp.proceed();
        } finally {
            // 清空设置的数据源
            DatasourceContextHolder.clearDataSourceType();
        }
    }

}