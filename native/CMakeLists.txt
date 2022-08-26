cmake_minimum_required(VERSION 3.17)
project(fuse4j C)

set(CMAKE_C_STANDARD 99)

add_library(fuse4j SHARED one_papachi_fuse4j_Fuse4j.c)

find_library(fuse libfuse3)
target_link_libraries(fuse4j fuse3)


include_directories(/home/pc/.jdks/adopt-openjdk-16/include /home/pc/.jdks/adopt-openjdk-16/include/linux)