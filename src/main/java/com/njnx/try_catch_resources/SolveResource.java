package com.njnx.try_catch_resources;

import java.io.*;

/**
 * @author 26586
 */
public class SolveResource {

    /**
     * 传统方式实现对资源的关闭
     *
     * @return
     * @throws IOException
     */
    private String traditionalTryCatch() throws IOException {
        //1.单一资源关闭
//        String line = null;
//        BufferedReader br = new BufferedReader(new FileReader(""));
//        try {
//            line = br.readLine();
//        } finally {
//            br.close();
//        }
//        return line;


        //2.多个资源的关闭
        InputStream in = new FileInputStream("");

        try {
            OutputStream out = new FileOutputStream("");
            try {
                byte[] buf = new byte[100];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);

            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
        return null;

    }


    private String newTryWithResources() throws IOException {
        //1.单个资源的使用与关闭
//        try (BufferedReader br = new BufferedReader(new FileReader(""))) {
//            return br.readLine();
//        }

        //2.多个资源的使用与关闭
        try (FileInputStream in = new FileInputStream("");
             FileOutputStream out = new FileOutputStream("")) {
            byte[] buffer = new byte[100];
            int n = 0;
            while ((n = in.read(buffer)) != -1) {
                out.write(buffer, 0, n);
            }
        }
        return null;
    }


    public static void main(String[] args) throws Exception {

        AutoClose autoClose = new AutoClose();
        try {
            autoClose.work();
        } finally {
            autoClose.close();
        }

//        try (AutoClose autoClose = new AutoClose()) {
//            autoClose.work();
//        }

    }


}

