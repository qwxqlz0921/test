package org.example.jenkinsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class PageController {

    @GetMapping("/detail") // 指定处理 /User 路径下的 GET 请求
    public BookResponseDTO getPage() {
        BookResponseDTO build = BookResponseDTO.builder()
                .id("12")
                .userId("1212")
                .build();
        return build;
    }
}
