package com.poly.utilities;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileUtil {
	public File handleUploadFile(MultipartFile uploadedFile) {
		String folderPath = "C:\\Users\\ADMIN\\eclipse-workspace\\Practice\\src\\main\\webapp\\storage";
		File uploadFolder = new File(folderPath);

		if (!uploadFolder.exists()) {
			uploadFolder.mkdirs();
		}

		File savedFile = null;
		try {

			String uuid = UUID.randomUUID().toString();
			String fileName = uuid + "_" + uploadedFile.getOriginalFilename();

			savedFile = new File(uploadFolder, fileName);
			uploadedFile.transferTo(savedFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return savedFile;
	}
}
