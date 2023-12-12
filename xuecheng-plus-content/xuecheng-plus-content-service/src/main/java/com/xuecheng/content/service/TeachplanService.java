package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.model.po.Teachplan;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface TeachplanService {
    List<TeachplanDto> findTeachplanTree(Long courseId);

    /**
     * 报错课程计划
     * @param teachplan
     */
    void saveTeachplan(Teachplan teachplan);

    /**
     * 删除课程计划
     * @param teachplanId
     */
    void deleteTeachplan(Long teachplanId);

    /**
     * 课程计划排序
     * @param moveType
     * @param teachplanId
     */
    void orderByTeachplan(String moveType, Long teachplanId);
}
