package com.example.jsonviewexample.fileuploadb;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("files")
public class FileDbController {

    private final FileDbService service;

    @PostMapping
    public FileDto uploadFile(@RequestParam("file") MultipartFile file) throws IOException{
        return service.save(file);
    }

    @GetMapping("/{id}")
    public FileDb getFileById(@PathVariable String id){
        return service.getFileById(id);
    }

    @GetMapping
    public List<FileDto> getAllFile(){
        return service.getFileList();
    }
}
