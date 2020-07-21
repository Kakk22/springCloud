package com.cyf.springcloud.alibaba.hander;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cyf.springcloud.entities.CommonResult;

/**
 * @author by cyf
 * @date 2020/7/21.
 */
public class CustomerBlockHandler {
    public static CommonResult handleException1(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");
    }

}
