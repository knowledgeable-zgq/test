package com.zgq.bookman.service.impl;

import com.zgq.bookman.entity.Book;
import com.zgq.bookman.mapper.BookMapper;
import com.zgq.bookman.service.IBookService;
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
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
