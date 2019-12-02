package com.yt.service.impl;

import com.yt.dao.TUserMapper;
import com.yt.service.ISimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleServiceImpl implements ISimpleService {

    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public Object getUserInfo(Integer id) {
        return tUserMapper.selectByPrimaryKey(id);
    }
}
