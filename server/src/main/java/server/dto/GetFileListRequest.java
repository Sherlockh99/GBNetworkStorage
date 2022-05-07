package server.dto;

import client.dto.BasicRequest;

public class GetFileListRequest implements BasicRequest {

    @Override
    public String getType() {
        return "getFileList";
    }
}
