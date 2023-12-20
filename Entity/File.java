package com.example.springboot.entity.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("file")
public class File {
    private Integer fileId;
    private Integer fileNo;
    private Integer schoolClientNo;
    private String name;
    private String type;
    private Long size;
    private String URL;
    private String md5;
    private Boolean isDelete;
    private Boolean enable;
}
