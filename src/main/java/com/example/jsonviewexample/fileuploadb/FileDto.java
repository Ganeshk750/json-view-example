package com.example.jsonviewexample.fileuploadb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileDto {
    private String id;
    private String type;
    private String name;
}
