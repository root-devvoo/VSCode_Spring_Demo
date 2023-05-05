package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class IndexController {
    // 인텔리 j 단축키 공부하기 (ctrl+d, shift+엔터, ctrl+shift+f)
    @GetMapping("/index")
    public ResponseEntity<?> index() {
        log.debug("디버그");
        log.info("인포");
        log.warn("경고");
        log.error("에러");
        log.error("에러");
        log.error("에러");
        log.error("에러");

        log.debug("디버그 : ");
        System.out.println("테스트 : ");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
