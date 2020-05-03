package from;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class MyUploadForm {
    private String description;
//    CommonsMultipartFile:tạo một cá thể bao bọc file đã cho;
    private CommonsMultipartFile[] fileDatas;

    public String getDescription() {

        return description;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public CommonsMultipartFile[] getFileDatas() {

        return fileDatas;

    }

    public void setFileDatas(CommonsMultipartFile[] fileDatas) {

        this.fileDatas = fileDatas;

    }
}
