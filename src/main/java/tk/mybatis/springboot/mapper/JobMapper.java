package tk.mybatis.springboot.mapper;

import tk.mybatis.springboot.model.Job;
import tk.mybatis.springboot.util.MyMapper;

import java.util.List;

public interface JobMapper  extends MyMapper<Job> {


    List<Job> selectJobList();
}