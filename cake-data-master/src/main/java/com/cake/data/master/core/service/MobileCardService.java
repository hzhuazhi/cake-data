package com.cake.data.master.core.service;

import com.cake.data.master.core.common.service.BaseService;
import com.cake.data.master.core.model.mobilecard.MobileCardModel;

/**
 * @Description 手机卡的Service层
 * @Author yoko
 * @Date 2020/5/18 17:22
 * @Version 1.0
 */
public interface MobileCardService<T> extends BaseService<T> {

    /**
     * @Description: 根据条件查询策略数据
     * @param model - 查询条件
     * @param isCache - 是否通过缓存查询：0需要通过缓存查询，1直接查询数据库
     * @return
     * @author yoko
     * @date 2019/11/21 19:26
     */
    public MobileCardModel getMobileCard(MobileCardModel model, int isCache) throws Exception;

    /**
     * @Description: 更新手机卡的心跳
     * @param model
     * @return
     * @author yoko
     * @date 2020/9/16 11:22
     */
    public int updateHeartbeatStatus(MobileCardModel model);
}
