package com.example.jsonviewexample.fileuploadb;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FileDbService {

    private final FileDbRepositroy repositroy;

    public FileDto save(MultipartFile file) throws IOException {
        String filename = file.getOriginalFilename();
        FileDb fileDb = new FileDb(UUID.randomUUID().toString(), filename, file.getContentType(), file.getBytes());
        repositroy.save(fileDb);
        return mapToFileDto(fileDb);
    }

    public FileDb getFileById(String id){
        Optional<FileDb> fileOptional = repositroy.findById(id);
        if(fileOptional.isPresent()){
            return fileOptional.get();
        }
        return null;

    }

    public List<FileDto> getFileList(){
        return repositroy.findAll().stream().map(this::mapToFileDto).collect(Collectors.toList());
    }

    private FileDto mapToFileDto(FileDb fileDb){
        return new FileDto(fileDb.getId(), fileDb.getType(), fileDb.getName());
    }
}
