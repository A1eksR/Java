package org.example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
    public static void writeToFile(List<Pet> newPetList){
        Gson gson = new Gson();
        String json = gson.toJson(newPetList);
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(json);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static List<Pet> readFile(){
        List<Pet> newPetList;
        Gson gson = new Gson();
        try{
            String content = Files.readString(Path.of("filename.txt"), StandardCharsets.UTF_8);
            newPetList = List.of(gson.fromJson(content, Pet[].class));
        }catch (IOException e){
            newPetList = new ArrayList<>();
        }
        return newPetList;
    }
}
