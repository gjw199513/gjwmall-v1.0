package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by gjw19 on 2017/8/30.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
