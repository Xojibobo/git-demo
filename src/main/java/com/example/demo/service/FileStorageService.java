package com.example.demo.service;

import com.example.demo.domain.FileStorage;
import com.example.demo.repository.FileStorageRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileStorageService {
private final FileStorageRepository fileStorageRepository;

    public FileStorageService(FileStorageRepository fileStorageRepository) {
        this.fileStorageRepository = fileStorageRepository;
    }
public void save(MultipartFile multipartFile){
    FileStorage fileStorage = new FileStorage();
    fileStorage.setName(multipartFile.getName());
    fileStorage.setExtansion(String.valueOf(multipartFile));
}
}
