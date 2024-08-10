package org.example;

public class Pet {
    private String vards;
    private int vecums;
    private String veids;

    public Pet(String vards, int vecums, String veids){
        setVards(vards);
        setVecums(vecums);
        setVeids(veids);
    }
    public String getVards(){
        return vards;
    }
    public int getVecums(){
        return vecums;
    }
    public String getVeids(){
        return veids;
    }

    public void setVards(String vards){
        this.vards = vards;
    }
    public void setVecums(int vecums){
        this.vecums = vecums;
    }
    public void setVeids(String veids){
        this.veids = veids;
    }
    public String getPet(){
        return vards + " " + vecums + veids + " ";
    }
}
