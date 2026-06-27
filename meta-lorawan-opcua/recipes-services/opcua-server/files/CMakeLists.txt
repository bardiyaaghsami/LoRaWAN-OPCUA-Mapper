cmake_minimum_required(VERSION 3.10)

project(opcua-server C)

find_library(OPEN62541_LIB open62541 REQUIRED)

add_executable(opcua-server main.c)

target_link_libraries(opcua-server ${OPEN62541_LIB})
