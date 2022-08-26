package one.papachi.fuse4j;


import one.papachi.fuse4j.results.ChmodResult;
import one.papachi.fuse4j.results.ChownResult;
import one.papachi.fuse4j.results.CreateResult;
import one.papachi.fuse4j.results.GetattrResult;
import one.papachi.fuse4j.results.MkdirResult;
import one.papachi.fuse4j.results.OpenResult;
import one.papachi.fuse4j.results.ReadResult;
import one.papachi.fuse4j.results.ReaddirResult;
import one.papachi.fuse4j.results.RenameResult;
import one.papachi.fuse4j.results.RmdirResult;
import one.papachi.fuse4j.results.TruncateResult;
import one.papachi.fuse4j.results.UnlinkResult;
import one.papachi.fuse4j.results.UtimentsResult;
import one.papachi.fuse4j.results.WriteResult;

import java.nio.ByteBuffer;

public class Fuse4j {

    static {
        System.loadLibrary("fuse4j");
    }

    public GetattrResult getattr(String fileName) {
        return null;
    }

    public CreateResult create(String fileName, int mode) {
        return null;
    }

    public OpenResult open(String fileName) {
        return null;
    }

    public ReadResult read(String fileName, ByteBuffer buffer, long offset) {
        return null;
    }

    public WriteResult write(String fileName, ByteBuffer buffer, long offset) {
        return null;
    }

    public TruncateResult truncate(String fileName, long size) {
        return null;
    }

    public UnlinkResult unlink(String fileName) {
        return null;
    }

    public MkdirResult mkdir(String fileName) {
        return null;
    }

    public ReaddirResult readdir(String fileName) {
        return null;
    }

    public RmdirResult rmdir(String fileName) {
        return null;
    }

    public RenameResult rename(String fileName, String newFileName) {
        return null;
    }

    public ChmodResult chmod(String fileName, int mode) {
        return null;
    }

    public ChownResult chown(String fileName, int uid, int gid) {
        return null;
    }

    public UtimentsResult utimens(String filename, long atime, long mtime) {
        return null;
    }

    public native int mount(String... args);

}
