package com.cake.data.master.util;


import com.cake.data.master.core.common.redis.RedisIdService;
import com.cake.data.master.core.common.redis.RedisService;
import com.cake.data.master.core.common.utils.constant.LoadConstant;
import com.cake.data.master.core.service.BankService;
import com.cake.data.master.core.service.MobileCardDataService;
import com.cake.data.master.core.service.MobileCardHeartbeatService;
import com.cake.data.master.core.service.MobileCardService;

/**
 * 工具类
 */
public class ComponentUtil {
    public static RedisIdService redisIdService;
    public static RedisService redisService;
    public static LoadConstant loadConstant;


    public static BankService bankService;
    public static MobileCardService mobileCardService;
    public static MobileCardDataService mobileCardDataService;
    public static MobileCardHeartbeatService mobileCardHeartbeatService;




}
