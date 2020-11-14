package com.bp.business.controller;

import com.bp.business.service.MerchantService;
import com.bp.business.util.BusinessResponse;
import com.bp.business.vo.request.MerchantRequest;
import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @Author yipeng
 * @Date 2020/11/10 14:19
 * @Version 1.0
 * @Desc 商户管理控制器
 */
@RestController
@RequestMapping("/merchant")
public class MerchantController {

    private Logger logger = LoggerFactory.getLogger(MerchantController.class);

    @Autowired
    private MerchantService merchantService;

    @GetMapping("/list")
    public BusinessResponse getMerchantList() {
        Stopwatch stopwatch = Stopwatch.createStarted();
        BusinessResponse response = this.merchantService.getMerchantList();
        logger.info("getMerchantList result:{} cost:{} ms", response, stopwatch.elapsed(TimeUnit.MILLISECONDS));
        return response;
    }

    @PostMapping("/add")
    public BusinessResponse addMerchant(@RequestBody MerchantRequest request) {
        logger.info("addMerchant param:{}", request);
        Stopwatch stopwatch = Stopwatch.createStarted();
        BusinessResponse response = this.merchantService.addMerchant(request);
        logger.info("addMerchant result:{} cost:{} ms", response, stopwatch.elapsed(TimeUnit.MILLISECONDS));
        return response;
    }
}
