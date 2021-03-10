package com.lichy.business.controller.admin;

import com.lichy.server.domain.Chapter;
import com.lichy.server.service.ChapterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {


    @Resource
    private ChapterService chapterService;

    /**
     * search list
     */
    @GetMapping("/list")
    public List<Chapter> list() {
        return chapterService.listByCourse("");
    }

}
