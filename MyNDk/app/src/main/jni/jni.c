//
// Created by weizejian on 16/3/9.
//

#include "com_example_weizejian_myndk_MainActivity.h"
JNIEXPORT jstring JNICALL Java_com_example_weizejian_myndk_MainActivity_getStringFromNative
        (JNIEnv * env, jobject obj){
    return (*env)->NewStringUTF(env,"I'm comes from to Native Functionffff4444!");
}

JNIEXPORT jstring JNICALL Java_com_example_weizejian_myndk_MainActivity_getMyname
        (JNIEnv * env, jobject obj){

    return (*env)->NewStringUTF(env,"weizejian");
}