package com.bp.business.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import java.util.UUID;

/**
 * @Author yipeng
 * @Date 2020/11/14 15:25
 * @Version 1.0
 * @Desc
 */
@WebListener
public class LogListener implements ServletRequestListener {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        MDC.clear();
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        String mdcseq = UUID.randomUUID().toString().replace("-", "");
        MDC.put("traceId", mdcseq);
    }
}
