package com.zgq.bookman.service.impl;

import com.zgq.bookman.entity.Type;
import com.zgq.bookman.mapper.TypeMapper;
import com.zgq.bookman.service.ITypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements ITypeService {

}
