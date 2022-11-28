package com.savia.hemofilia.service;

import com.savia.hemofilia.model.HemofiliaModel;
import com.savia.hemofilia.valueobject.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface HemofiliaService {

    ResponseEntity<Message> save(MultipartFile multipartFile);
    List<HemofiliaModel> listHemofiliaModels();





}
