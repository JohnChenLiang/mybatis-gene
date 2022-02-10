package com.ivorymanager.mapper;

import com.ivorymanager.pojo.ProjectsRole;
import com.ivorymanager.pojo.ProjectsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectsRoleMapper {
    long countByExample(ProjectsRoleExample example);

    int deleteByExample(ProjectsRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectsRole record);

    int insertSelective(ProjectsRole record);

    List<ProjectsRole> selectByExample(ProjectsRoleExample example);

    ProjectsRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectsRole record, @Param("example") ProjectsRoleExample example);

    int updateByExample(@Param("record") ProjectsRole record, @Param("example") ProjectsRoleExample example);

    int updateByPrimaryKeySelective(ProjectsRole record);

    int updateByPrimaryKey(ProjectsRole record);
}