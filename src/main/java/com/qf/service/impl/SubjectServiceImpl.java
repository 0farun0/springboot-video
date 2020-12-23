package com.qf.service.impl;

import com.qf.pojo.Subject;
import com.qf.dao.SubjectMapper;
import com.qf.service.SubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学科表，存储各个学科的名字 服务实现类
 * </p>
 *
 * @author yangl
 * @since 2020-12-23
 */
@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements SubjectService {

}
