package com.savia.hemofilia.service;

import com.savia.hemofilia.valueobject.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;



public interface HemofiliaService {

    ResponseEntity<Message> save(MultipartFile multipartFile);




}
