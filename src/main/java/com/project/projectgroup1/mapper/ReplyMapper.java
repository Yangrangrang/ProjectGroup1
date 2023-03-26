package com.project.projectgroup1.mapper;

import com.project.projectgroup1.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {
    List<UserDto> findAll();
}
