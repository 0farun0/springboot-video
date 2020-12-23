package com.qf.service.impl;

import com.qf.pojo.Admin;
import com.qf.dao.AdminMapper;
import com.qf.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yangl
 * @since 2020-12-23
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
