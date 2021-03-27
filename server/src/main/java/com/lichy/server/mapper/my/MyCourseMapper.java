package com.lichy.server.mapper.my;

import com.lichy.server.dto.CourseDto;
import com.lichy.server.dto.CoursePageDto;
import com.lichy.server.dto.SortDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyCourseMapper {

    List<CourseDto> list(@Param("pageDto") CoursePageDto pageDto);

    int updateTime(@Param("courseId") String courseId);

    int updateSort(SortDto sortDto);

    int moveSortsBackward(SortDto sortDto);

    int moveSortsForward(SortDto sortDto);
}
