package com.yt.dao;

import com.yt.domain.TPosition;

public interface TPositionMapper {
    int insert(TPosition record);

    int insertSelective(TPosition record);
}