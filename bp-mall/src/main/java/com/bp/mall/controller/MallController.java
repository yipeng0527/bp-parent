package com.bp.mall.controller;

import com.bp.mall.service.MallService;
import com.bp.mall.util.BusinessResponse;
import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author yipeng
 * @Date 2020/11/10 15:28
 * @Version 1.0
 * @Desc
 */
@RequestMapping("/mall")
@RestController
public class MallController {

    private Logger logger = LoggerFactory.getLogger(MallController.class);

    @Autowired
    private MallService mallService;

    @GetMapping("/get")
    public BusinessResponse getMall() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        BusinessResponse response = this.mallService.getMallList();
        logger.info("getMall result:{} cost:{} ms", response, stopwatch.elapsed(TimeUnit.MILLISECONDS));
        return response;
    }
}
