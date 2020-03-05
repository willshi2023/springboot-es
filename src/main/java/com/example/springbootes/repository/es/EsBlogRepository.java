package com.example.springbootes.repository.es;

import com.example.springbootes.entity.es.EsBlog;
import com.example.springbootes.entity.mysql.MysqlBlog;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,Integer> {
}
