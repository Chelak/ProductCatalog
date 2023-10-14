package com.celac.ecommerce.controller;

import com.celac.ecommerce.dto.FileMetaDTO;
import com.celac.ecommerce.exceptions.FileStorageException;
import com.celac.ecommerce.service.StorageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
* @author scelac
*/
@Secured({"ADMIN","SALE_MANAGER"})
@Controller
public class FileUploadController {
    private final StorageService storageService;

    public FileUploadController(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping("/upload-file")
    @ResponseBody
    public ResponseEntity<FileMetaDTO> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            return ResponseEntity.ok(storageService.store(file));
        } catch (FileStorageException e) {
           return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }


    }


}
