package com.ivorymanager.mapper;

import com.ivorymanager.pojo.SpendPicture;
import com.ivorymanager.pojo.SpendPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpendPictureMapper {
    long countByExample(SpendPictureExample example);

    int deleteByExample(SpendPictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpendPicture record);

    int insertSelective(SpendPicture record);

    List<SpendPicture> selectByExample(SpendPictureExample example);

    SpendPicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpendPicture record, @Param("example") SpendPictureExample example);

    int updateByExample(@Param("record") SpendPicture record, @Param("example") SpendPictureExample example);

    int updateByPrimaryKeySelective(SpendPicture record);

    int updateByPrimaryKey(SpendPicture record);
}