package com.example.springbootes;

import com.example.springbootes.entity.es.EsBlog;
import com.example.springbootes.repository.es.EsBlogRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;

@SpringBootTest
@Slf4j
class SpringbootEsApplicationTests {
    @Autowired
    private EsBlogRepository esBlogRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testEs(){
        Iterable<EsBlog> all = esBlogRepository.findAll();
        Iterator<EsBlog> iterator = all.iterator();
        EsBlog next = iterator.next();
        log.info(">>> {} <<<",next.getTitle());
    }
}
