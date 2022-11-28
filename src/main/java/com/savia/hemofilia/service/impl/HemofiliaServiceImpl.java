package com.savia.hemofilia.service.impl;


import com.savia.hemofilia.model.HemofiliaModel;
import com.savia.hemofilia.repository.HemofiliaRepositoryValidator;
import com.savia.hemofilia.service.HemofiliaService;
import com.savia.hemofilia.valueobject.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class HemofiliaServiceImpl implements HemofiliaService {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    FileReader fr = null;
    BufferedReader br = null;
    File fileLo=null;
    @Autowired
    HemofiliaRepositoryValidator hemofiliaRepository;
    @Override
    public ResponseEntity<Message> save(MultipartFile multipartFile) {
        Date fechaInicio = new Date();

        try {
            fileLo = new File("src/main/resources/targetFile.tmp");
            try (OutputStream os = new FileOutputStream(fileLo)) {
                os.write(multipartFile.getBytes());
            }
            fr = new FileReader (fileLo);
            BufferedReader br = new BufferedReader(fr);
            String linea="";
            String[] seccion ;
            int con=0;
            while((linea=br.readLine())!=null){
                seccion = linea.split(";");
                try{
                    if (con>0){

                        HemofiliaModel hemofiliaModel=new HemofiliaModel(seccion[0],seccion[1],seccion[2],seccion[3],
                                seccion[4],seccion[5],simpleDateFormat.parse(seccion[6]),seccion[7],Integer.parseInt(seccion[8]),
                                seccion[9],seccion[10],Integer.parseInt(seccion[11]),Integer.parseInt(seccion[12]),
                                Integer.parseInt(seccion[13]),seccion[14],simpleDateFormat.parse(seccion[15]),
                                Integer.parseInt(seccion[16]),Integer.parseInt(seccion[17]),Integer.parseInt(seccion[18]),
                                Integer.parseInt(seccion[19]),simpleDateFormat.parse(seccion[20]),Long.parseLong(seccion[21]),
                                Integer.parseInt(seccion[22]),Integer.parseInt(seccion[23]),Float.parseFloat(seccion[24]),
                                Integer.parseInt(seccion[25]),Integer.parseInt(seccion[26]),Integer.parseInt(seccion[27]),
                                simpleDateFormat.parse(seccion[28]),Integer.parseInt(seccion[29]),Integer.parseInt(seccion[30]),
                                Float.parseFloat(seccion[31]),Float.parseFloat(seccion[32]),Float.parseFloat(seccion[33]),
                                Integer.parseInt(seccion[34]),Integer.parseInt(seccion[35]),Integer.parseInt(seccion[36]),
                                Integer.parseInt(seccion[37]),seccion[38],seccion[39],seccion[40],seccion[41],
                                Long.parseLong(seccion[42]),Integer.parseInt(seccion[43]),Integer.parseInt(seccion[44]),
                                Integer.parseInt(seccion[45]),Integer.parseInt(seccion[46]),Integer.parseInt(seccion[47]),
                                Integer.parseInt(seccion[48]),Integer.parseInt(seccion[49]),Integer.parseInt(seccion[50]),
                                Integer.parseInt(seccion[51]),Integer.parseInt(seccion[52]),Integer.parseInt(seccion[53]),
                                Integer.parseInt(seccion[54]),Integer.parseInt(seccion[55]),simpleDateFormat.parse(seccion[56]),
                                Integer.parseInt(seccion[57]),Integer.parseInt(seccion[58]),Integer.parseInt(seccion[59]),
                                Integer.parseInt(seccion[60]),Integer.parseInt(seccion[61]),Integer.parseInt(seccion[62]),
                                Integer.parseInt(seccion[63]),Integer.parseInt(seccion[64]),Integer.parseInt(seccion[65]),
                                Integer.parseInt(seccion[66]),Integer.parseInt(seccion[67]),Integer.parseInt(seccion[68]),
                                Integer.parseInt(seccion[69]),Integer.parseInt(seccion[70]),Integer.parseInt(seccion[71]),
                                Integer.parseInt(seccion[72]),Integer.parseInt(seccion[73]),Integer.parseInt(seccion[74]),
                                Integer.parseInt(seccion[75]),Integer.parseInt(seccion[76]),Integer.parseInt(seccion[77]),
                                Integer.parseInt(seccion[78]),Integer.parseInt(seccion[79]),Integer.parseInt(seccion[80]),
                                Integer.parseInt(seccion[81]),seccion[82],seccion[83],seccion[84],seccion[85],
                                Integer.parseInt(seccion[86]),Integer.parseInt(seccion[87]),Double.parseDouble(seccion[88]),
                                Double.parseDouble(seccion[89]),Double.parseDouble(seccion[90]),Double.parseDouble(seccion[91]),
                                Integer.parseInt(seccion[93]),Integer.parseInt(seccion[93]),simpleDateFormat.parse(seccion[94]),
                                Integer.parseInt(seccion[95]),simpleDateFormat.parse(seccion[96])
                                );

                        hemofiliaRepository.save(hemofiliaModel);
                        ResponseEntity.ok()
                                .body(new Message("Upload file successfully:"+multipartFile.getOriginalFilename()));
                    }
                    con++;
                }catch (Error v){
                    return ResponseEntity.badRequest()
                            .body(new Message("El archivo: "+multipartFile.getOriginalFilename()+" tiene un error en su contenido : "+v.getMessage()));

                }
            }
            Date fechaFin = new Date();
            System.out.println("Fecha Inicio  : "+fechaInicio);
            System.out.println("Fecha Fin : "+fechaFin);
            return ResponseEntity.ok()
                    .body(new Message("El archivo: "+multipartFile.getOriginalFilename()+" se cargo correctamente"));

        }catch (Exception e){
            return ResponseEntity.badRequest()
                    .body(new Message("El archivo: "+multipartFile.getOriginalFilename()+" tiene un error  : "+e.getLocalizedMessage()));

        }

    }

    @Override
    public List<HemofiliaModel> listHemofiliaModels(){
        System.out.println(hemofiliaRepository.findAll().get(1).getActividadCoagulanteFactor());
            return  hemofiliaRepository.findAll();
    }
}
