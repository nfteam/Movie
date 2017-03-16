package org.cinema.action;

import org.domian.utils.UUIDUtil;

/**
 * Created by LIANG on 2017/3/13.
 */
public class UUid {
    public static void main(String[] args) {
        String uuid= UUIDUtil.getUUID();
        System.out.println(uuid);

//        String path= "file/dir/go.swf";
//        String file = path.substring(0, "/file".length());
//        System.out.println("file  :" +file);
//        System.out.println("dir   : "+path.substring(path.indexOf("dir/"), path.indexOf("/go.swf")));
//        System.out.println("dir/go.swf   : "+path.substring(path.indexOf("dir/"), path.length()));
    }
}
