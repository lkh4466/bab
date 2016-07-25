package spring.model.restraurant;

import org.springframework.web.multipart.MultipartFile;

public class ImgDTO {
	private int imgNum;
	private int restNum;
	private String imgName;
	private String fileName;
	private MultipartFile filenameMF;
	
	public int getImgNum() {
		return imgNum;
	}

	public void setImgNum(int imgNum) {
		this.imgNum = imgNum;
	}

	public int getRestNum() {
		return restNum;
	}

	public void setRestNum(int restNum) {
		this.restNum = restNum;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public MultipartFile getFilenameMF() {
		return filenameMF;
	}

	public void setFilenameMF(MultipartFile filenameMF) {
		this.filenameMF = filenameMF;
	}

}
