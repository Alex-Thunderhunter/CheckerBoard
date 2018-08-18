/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8.checkerboard;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Alex Thunderhunter
 */
public class EX8Checkerboard extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //new pane
        Pane pane = new Pane();
        
        //produces rectangles up to 32
        Rectangle r1 = new Rectangle(20,0,20,20);
        r1.setFill(Color.BLACK);       
        pane.getChildren().add(r1);
        
        Rectangle r2 = new Rectangle(60,0,20,20);
        r2.setFill(Color.BLACK);
        pane.getChildren().add(r2);
        
        Rectangle r3 = new Rectangle(100,0,20,20);
        r3.setFill(Color.BLACK);
        pane.getChildren().add(r3);
        
        Rectangle r4 = new Rectangle(140,0,20,20);
        r4.setFill(Color.BLACK);
        pane.getChildren().add(r4);
        
        Rectangle r5 = new Rectangle(100,120,20,20);
        r5.setFill(Color.BLACK);
        pane.getChildren().add(r5);
                
        Rectangle r6 = new Rectangle(0,20,20,20);
        r6.setFill(Color.BLACK);        
        pane.getChildren().add(r6);
        
        Rectangle r7 = new Rectangle(40,20,20,20);
        r7.setFill(Color.BLACK);
        pane.getChildren().add(r7);
        
        Rectangle r8 = new Rectangle(80,20,20,20);
        r8.setFill(Color.BLACK);        
        pane.getChildren().add(r8);
        
        Rectangle r9 = new Rectangle(120,20,20,20);
        r9.setFill(Color.BLACK);
        pane.getChildren().add(r9);
        
        Rectangle r10 = new Rectangle(140,120,20,20);
        r10.setFill(Color.BLACK);
        pane.getChildren().add(r10);
        
        Rectangle r11 = new Rectangle(20,40,20,20);
        r11.setFill(Color.BLACK);
        pane.getChildren().add(r11);
        
        Rectangle r12 = new Rectangle(60,40,20,20);
        r12.setFill(Color.BLACK);
        pane.getChildren().add(r12);
        
        Rectangle r13 = new Rectangle(100,40,20,20);
        r13.setFill(Color.BLACK);
        pane.getChildren().add(r13);
        
        Rectangle r14 = new Rectangle(140,40,20,20);
        r14.setFill(Color.BLACK);
        pane.getChildren().add(r14);
        
        Rectangle r15 = new Rectangle(0,140,20,20);
        r15.setFill(Color.BLACK);
        pane.getChildren().add(r15);
        
        Rectangle r16 = new Rectangle(0,60,20,20);
        r16.setFill(Color.BLACK);
        pane.getChildren().add(r16);
        
        Rectangle r17 = new Rectangle(40,60,20,20);
        r17.setFill(Color.BLACK);
        pane.getChildren().add(r17);
        
        Rectangle r18 = new Rectangle(80,60,20,20);
        r18.setFill(Color.BLACK);
        pane.getChildren().add(r18);
        
        Rectangle r19 = new Rectangle(120,60,20,20);
        r19.setFill(Color.BLACK);
        pane.getChildren().add(r19);
        
        Rectangle r20 = new Rectangle(40,140,20,20);
        r20.setFill(Color.BLACK);
        pane.getChildren().add(r20);
        
        Rectangle r21 = new Rectangle(20,80,20,20);
        r21.setFill(Color.BLACK);
        pane.getChildren().add(r21);
        
        Rectangle r22 = new Rectangle(60,80,20,20);
        r22.setFill(Color.BLACK);
        pane.getChildren().add(r22);
        
        Rectangle r23 = new Rectangle(100,80,20,20);
        r23.setFill(Color.BLACK);
        pane.getChildren().add(r23);
        
        Rectangle r24 = new Rectangle(140,80,20,20);
        r24.setFill(Color.BLACK);
        pane.getChildren().add(r24);
        
        Rectangle r25 = new Rectangle(80,140,20,20);
        r25.setFill(Color.BLACK);
        pane.getChildren().add(r25);
        
        Rectangle r26 = new Rectangle(0,100,20,20);
        r26.setFill(Color.BLACK);
        pane.getChildren().add(r26);
        
        Rectangle r27 = new Rectangle(40,100,20,20);
        r27.setFill(Color.BLACK);
        pane.getChildren().add(r27);
        
        
        Rectangle r28 = new Rectangle(80,100,20,20);
        r28.setFill(Color.BLACK);
        pane.getChildren().add(r28);
        
        Rectangle r29 = new Rectangle(120,100,20,20);
        r29.setFill(Color.BLACK);
        pane.getChildren().add(r29);
        
        Rectangle r30 = new Rectangle(120,140,20,20);
        r30.setFill(Color.BLACK);
        pane.getChildren().add(r30);
        
        Rectangle r31 = new Rectangle(20,120,20,20);
        r31.setFill(Color.BLACK);
        pane.getChildren().add(r31);
        
        Rectangle r32 = new Rectangle(60,120,20,20);
        r32.setFill(Color.BLACK);
        pane.getChildren().add(r32);
        
        
        //Scene and Stage
        Scene scene = new Scene(pane, 160, 160);
        primaryStage.setTitle("Checkerboard");
        primaryStage.setScene(scene);
        primaryStage.show();
          
        
    }
  
}
