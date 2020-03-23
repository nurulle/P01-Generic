/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author Choco Calon Presiden RI
 */
public class Musik {
    String path, filename, filesize, extention;
    
    public Musik(String p, String fn, String fs, String e){
        this.path = p;
        this.filename = fn;
        this.filesize = fs;
        this.extention = e;
    }
    
    
    //biar cepet pake klik kanan > insert code > getter > centang semua> ok
    public  String getPath(){
        return path;
    }

    public String getFilename() {
        return filename;
    }

    public String getFilesize() {
        return filesize;
    }

    public String getExtention() {
        return extention;
    }   
    
}
