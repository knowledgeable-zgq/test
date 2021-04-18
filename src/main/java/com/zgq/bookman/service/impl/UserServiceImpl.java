package com.zgq.bookman.service.impl;

import com.zgq.bookman.entity.User;
import com.zgq.bookman.mapper.UserMapper;
import com.zgq.bookman.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zgq
 * @since 2021-04-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
