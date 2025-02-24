package com.example.demo.admin.mapper;

import com.example.demo.admin.dto.MemberDto;
import com.example.demo.admin.model.MemberParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    long selectListCount(MemberParam parameter);
    List<MemberDto> selectList(MemberParam parameter);

}
