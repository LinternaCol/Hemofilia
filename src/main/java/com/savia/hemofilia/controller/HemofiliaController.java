package com.savia.hemofilia.controller;

import com.savia.hemofilia.model.HemofiliaModel;
import com.savia.hemofilia.service.HemofiliaService;
import com.savia.hemofilia.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class HemofiliaController {
    @Autowired
    HemofiliaService hemofiliaService;

    @PostMapping("/upload")
    public ResponseEntity<Message> upload(@RequestParam("file")MultipartFile file){
        return (hemofiliaService.save(file));
    }

    @GetMapping("/all/hemofilia")
    public List<HemofiliaModel> allHemofilia(){
        return hemofiliaService.listHemofiliaModels();
    }
}
