package com.ivorymanager.mapper;

import com.ivorymanager.pojo.Spend;
import com.ivorymanager.pojo.SpendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpendMapper {
    long countByExample(SpendExample example);

    int deleteByExample(SpendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Spend record);

    int insertSelective(Spend record);

    List<Spend> selectByExample(SpendExample example);

    Spend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Spend record, @Param("example") SpendExample example);

    int updateByExample(@Param("record") Spend record, @Param("example") SpendExample example);

    int updateByPrimaryKeySelective(Spend record);

    int updateByPrimaryKey(Spend record);
}