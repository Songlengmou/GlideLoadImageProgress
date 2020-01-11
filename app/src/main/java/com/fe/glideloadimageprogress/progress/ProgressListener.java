package com.fe.glideloadimageprogress.progress;

/**
 * @author Song
 */
public interface ProgressListener {
    void progress(long bytesRead, long contentLength, boolean done);
}
