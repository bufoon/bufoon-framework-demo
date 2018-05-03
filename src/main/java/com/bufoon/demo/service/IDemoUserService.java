package com.bufoon.demo.service;

import com.bufoon.demo.entity.DemoUser;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bufoon
 * @since 2018-04-07
 */
public interface IDemoUserService extends IService<DemoUser> {
    DemoUser findById(Integer id);
}
