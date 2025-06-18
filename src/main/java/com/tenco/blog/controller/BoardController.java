package com.tenco.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {

    @GetMapping({"/","/index"})
    public String index(){
        // prefix: /templates/
        // return : index
        // suffix : .mustache
        // # 기본경로 : src/main/resource/templates/index.mustache
        return "index";
    }


    /*
    * 게시물 작성하기
    * getMapping로 템플릿 가져오기*/
    
    @GetMapping("/board/save-form")
    public String showSaveForm() {
        // Save form view를 반환
        return "board/save-form";
    }
    
    /*
    * 게시물 상세보기 요청
    * board/1
    * */
    @GetMapping("/board/{id}")
    public String detail(@PathVariable(name = "id") int id){
        // URL 에서 받은 id 값을 사용해서 특정 게시글 상세보기 조회
        // 실제로는 이 id값으로 데이터베이스에 있는 게시글 조회하고
        // 머스테치 파일로 데이터를 받아온다
        return "board/detail";
    }




}
