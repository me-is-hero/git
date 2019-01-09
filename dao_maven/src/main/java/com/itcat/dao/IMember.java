package com.itcat.dao;

import com.itcast.domain.Member;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Select;

public interface IMember {

 @Select("select * from member where id=#{memberId}")
    Member  findById(String memberId);
}
