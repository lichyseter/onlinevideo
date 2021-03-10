package com.lichy.server.service;

import com.lichy.server.domain.Chapter;
import com.lichy.server.domain.ChapterExample;
import com.lichy.server.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    /**
     * 查询某一课程下的所有章
     */
    public List<Chapter> listByCourse(String courseId) {
        ChapterExample example = new ChapterExample();
        example.createCriteria().andCourseIdEqualTo("1");
        return chapterMapper.selectByExample(example);
    }
}
