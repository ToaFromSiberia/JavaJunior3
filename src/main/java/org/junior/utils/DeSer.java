package org.junior.utils;

import java.io.*;

public class DeSer {

    public static void serialize(Object obj, String fname) throws IOException {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fname)))
        {
            o.writeObject(obj);
        }
    }

    public static Object deserialize(String fname) throws Exception {
        try (ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname)))
        {
            return o.readObject();
        }
    }

}
