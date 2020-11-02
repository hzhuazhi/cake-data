package com.cake.data.master.core.service;

import com.cake.data.master.core.common.service.BaseService;
import com.cake.data.master.core.model.MobileCardDataModel;

/**
 * @Description TODO
 * @Date 2020/9/16 21:19
 * @Version 1.0
 */
public interface MobileCardDataService <T> extends BaseService<T> {
    public  int addMobileCardData(MobileCardDataModel mobileCardDataModel);
}
