package com.twosigma.documentation.server.upload;

import java.nio.file.Path;

public interface OnUploadFinishedServerHandler {
    void onUploadFinished(String docId, Path destination);
}
