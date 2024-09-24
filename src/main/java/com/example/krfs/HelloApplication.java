package com.example.krfs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
//import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

//import javax.print.attribute.standard.Media;
import java.io.File;
import java.io.IOException;
//import java.net.URL;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class HelloApplication extends Application {





    @Override
    public void start(Stage stage) throws IOException {
        playMusic("d.wav");

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("KRFS");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    public void playMusic(String location){
        File musicPath= new File(location);
        try{
            if(musicPath.exists()){
                AudioInputStream audioInput= AudioSystem.getAudioInputStream(musicPath);
                Clip clip =AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
            else{
                System.out.println("Not Found");
            }

        }
        catch(Exception e){ System.out.println(e);}
    }

    public static void main (String[] args) {
        launch();
    }
}