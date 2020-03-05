package com.example.springbootes.entity.mysql;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * CREATE TABLE `t_blog` (
 *   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
 *   `title` varchar(60) DEFAULT NULL COMMENT '博客标题',
 *   `author` varchar(60) DEFAULT NULL COMMENT '博客作者',
 *   `content` mediumtext COMMENT '博客内容',
 *   `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 *   `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
 *   PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8mb4
 */
@Data
@Table(name = "t_blog")
@Entity
public class MysqlBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    @Column(columnDefinition = "mediumtext")
    private String content;
    private Date createTime;
    private Date updateTime;
}
