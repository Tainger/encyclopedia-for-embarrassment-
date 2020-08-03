package com.alieducation.service.Impl;

import com.alieducation.dao.BlackListDao;
import com.alieducation.entity.BlackList;
import com.alieducation.service.BlackListService;
import org.springframework.stereotype.Service;

/**
 * @author JiaZhiYuan
 * @version 1.0
 * @date 2020/8/2 16:44
 */

@Service
public class BlackListServiceImpl implements BlackListService {
    private BlackListDao blackListDao;

    @Override
    public int insertBlackList(BlackList blackList) {
        return blackListDao.insert(blackList);
    }
}
