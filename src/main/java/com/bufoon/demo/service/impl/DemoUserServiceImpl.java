package com.bufoon.demo.service.impl;

import com.bufoon.demo.entity.DemoUser;
import com.bufoon.demo.mapper.DemoUserMapper;
import com.bufoon.demo.service.IDemoUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.bufoon.storage.db.support.DS;
import com.bufoon.storage.db.support.DSEnum;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bufoon
 * @since 2018-04-07
 */
@Service
public class DemoUserServiceImpl extends ServiceImpl<DemoUserMapper, DemoUser> implements IDemoUserService {

    @DS(DSEnum.SLAVE)
    public DemoUser findById(Integer id) {
        return selectById(id);
    }
}
