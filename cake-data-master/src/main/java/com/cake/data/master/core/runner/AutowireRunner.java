package com.cake.data.master.core.runner;

import com.cake.data.master.core.common.redis.RedisIdService;
import com.cake.data.master.core.common.redis.RedisService;
import com.cake.data.master.core.common.utils.constant.LoadConstant;
import com.cake.data.master.core.service.BankService;
import com.cake.data.master.core.service.MobileCardDataService;
import com.cake.data.master.core.service.MobileCardHeartbeatService;
import com.cake.data.master.core.service.MobileCardService;
import com.cake.data.master.util.ComponentUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
@Order(0)
public class AutowireRunner implements ApplicationRunner {
    private final static Logger log = LoggerFactory.getLogger(AutowireRunner.class);

    /**
     * 5分钟.
     */
    public long FIVE_MIN = 300;


    Thread runThread = null;

    @Autowired
    private RedisIdService redisIdService;
    @Autowired
    private RedisService redisService;
    @Resource
    private LoadConstant loadConstant;



    @Autowired
    private BankService bankService;

    @Autowired
    private MobileCardService mobileCardService;

    @Autowired
    private MobileCardDataService mobileCardDataService;

    @Autowired
    private MobileCardHeartbeatService mobileCardHeartbeatService;








    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("AutowireRunner ...");
        ComponentUtil.redisIdService = redisIdService;
        ComponentUtil.redisService = redisService;
        ComponentUtil.loadConstant = loadConstant;


        ComponentUtil.bankService = bankService;
        ComponentUtil.mobileCardService = mobileCardService;
        ComponentUtil.mobileCardDataService = mobileCardDataService;
        ComponentUtil.mobileCardHeartbeatService = mobileCardHeartbeatService;

        runThread = new RunThread();
        runThread.start();






    }

    /**
     * @author df
     * @Description: TODO(模拟请求)
     * <p>1.随机获取当日金额的任务</p>
     * <p>2.获取代码信息</p>
     * @create 20:21 2019/1/29
     **/
    class RunThread extends Thread{
        @Override
        public void run() {
            log.info("启动啦............");
        }
    }




}
