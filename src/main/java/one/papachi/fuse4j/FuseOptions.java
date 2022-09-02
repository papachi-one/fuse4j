package one.papachi.fuse4j;

import java.util.ArrayList;
import java.util.List;

public class FuseOptions {

    private final static String DEBUG = "-d";
    private final static String FOREGROUND_OPERATION = "-f";
    private final static String SINGLE_THREADED = "-s";
    private final static String CLONE_FD = "clone_fd";
    private final static String MAX_IDLE_THREADS = "max_idle_threads=";
    private final static String KERNEL_CACHE = "kernel_cache";
    private final static String AUTO_CACHE = "auto_cache";
    private final static String NOAUTO_CACHE = "noauto_cache";
    private final static String UMASK = "umask=";
    private final static String UID = "uid=";
    private final static String GID = "gid=";
    private final static String ENTRY_TIMEOUT = "entry_timeout=";
    private final static String NEGATIVE_TIMEOUT = "negative_timeout=";
    private final static String ATTR_TIMEOUT = "attr_timeout=";
    private final static String AC_ATTR_TIMEOUT = "ac_attr_timeout=";
    private final static String NOFORGET = "noforget";
    private final static String REMEMBER = "remember=";
    private final static String ALLOW_OTHER = "allow_other";
    private final static String ALLOW_ROOT = "allow_root";
    private final static String AUTO_UNMOUNT = "auto_unmount";

    private final List<String> options = new ArrayList<>();

    private String mountPoint;

    public FuseOptions() {
        options.add("fuse4j");
    }

    public FuseOptions setDebug() {
        options.add(DEBUG);
        return this;
    }

    public FuseOptions setForegroundOperation() {
        options.add(FOREGROUND_OPERATION);
        return this;
    }

    public FuseOptions setSingleThreaded() {
        options.add(SINGLE_THREADED);
        return this;
    }

    public FuseOptions setCloneFd() {
        options.add("-o");
        options.add(CLONE_FD);
        return this;
    }

    public FuseOptions setMaxIdleThreads(int n) {
        options.add("-o");
        options.add(MAX_IDLE_THREADS + n);
        return this;
    }

    public FuseOptions setKernelCache() {
        options.add("-o");
        options.add(KERNEL_CACHE);
        return this;
    }

    public FuseOptions setAutoCache() {
        options.add("-o");
        options.add(AUTO_CACHE);
        return this;
    }

    public FuseOptions setNoautoCache() {
        options.add("-o");
        options.add(NOAUTO_CACHE);
        return this;
    }

    public FuseOptions setUmask(int umask) {
        options.add("-o");
        options.add(UMASK + "0" + umask);
        return this;
    }

    public FuseOptions setUid(int uid) {
        options.add("-o");
        options.add(UID + uid);
        return this;
    }

    public FuseOptions setGid(int gid) {
        options.add("-o");
        options.add(GID + gid);
        return this;
    }

    public FuseOptions setEntryTimeout(int n) {
        options.add("-o");
        options.add(ENTRY_TIMEOUT + n);
        return this;
    }

    public FuseOptions setNegativeTimeout(int n) {
        options.add("-o");
        options.add(NEGATIVE_TIMEOUT + n);
        return this;
    }

    public FuseOptions setAttrTimeout(int n) {
        options.add("-o");
        options.add(ATTR_TIMEOUT + n);
        return this;
    }

    public FuseOptions setAcAttrTimeout(int n) {
        options.add("-o");
        options.add(AC_ATTR_TIMEOUT + n);
        return this;
    }

    public FuseOptions setNoforget() {
        options.add("-o");
        options.add(NOFORGET);
        return this;
    }

    public FuseOptions setRemember(int n) {
        options.add("-o");
        options.add(REMEMBER + n);
        return this;
    }

    public FuseOptions setAllowOther() {
        options.add("-o");
        options.add(ALLOW_OTHER);
        return this;
    }

    public FuseOptions setAllowRoot() {
        options.add("-o");
        options.add(ALLOW_ROOT);
        return this;
    }

    public FuseOptions setAutoUnmount() {
        options.add("-o");
        options.add(AUTO_UNMOUNT);
        return this;
    }

    public FuseOptions setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    public String[] build() {
        options.add(mountPoint);
        return options.toArray(new String[0]);
    }

}
