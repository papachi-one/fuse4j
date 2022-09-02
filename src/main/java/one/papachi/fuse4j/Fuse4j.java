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

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.file.Paths;

public class Fuse4j {

    private static final String temporaryLibraryPath = System.getProperty("java.io.tmpdir");

    private static final String library = "libfuse4j.so";

    static {
        File file = Paths.get(temporaryLibraryPath, library).toFile();
        try (InputStream is = Fuse4j.class.getResourceAsStream(library); OutputStream os = new FileOutputStream(file)) {
            is.transferTo(os);
        } catch (Exception e) {
        }
        file.deleteOnExit();
        System.load(file.getAbsolutePath());
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
