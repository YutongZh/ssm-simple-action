package com.yt.dao;

import com.yt.domain.TRelation;

public interface TRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TRelation record);

    int insertSelective(TRelation record);

    TRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TRelation record);

    int updateByPrimaryKey(TRelation record);
}