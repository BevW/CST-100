package topic5.chapter14;

import java.awt.Color;
import java.awt.Rectangle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E12 {
	/*
	(Display a bar chart) Write a program that uses a bar chart to display the percentages
	of the overall grade represented by projects, quizzes, midterm exams, and the
	final exam, as shown in Figure 14.46b. Suppose that projects take 20 percent and
	are displayed in red, quizzes take 10 percent and are displayed in blue, midterm
	exams take 30 percent and are displayed in green, and the final exam takes 40
	percent and is displayed in orange. Use the Rectangle class to display the bars.
	Interested readers may explore the JavaFX BarChart class for further study.
	 */
		@Override // Override start method in application class
		public void start(Stage primaryStage){
			// Create a Pane
			Pane pane = new Pane();
			
			Rectangle r1 = new Rectangle(25, 60, 60, 30);
			r1.setStroke(Color.RED);
			r1.setFill(Color.RED);
			pane.getChildren().add(new Text(25, 55, "Projects--20%"));// Place text
			pane.getChildren().add(r1); // add r1 to pane
			
			Rectangle r2 = new Rectangle(100, 80, 40, 30);
			r2.setSroke(Color.BLUE);
			r2.setFill(Color.BLUE);
			pane.getChildren().add(new Text(100, 75, "Quizzes--10%"));// Place text
			pane.getChildren().add(r2);
			
			Rectangle r3 = new Rectangle (175, 40, 80, 30);
			r3.setStroke(Color.GREEN);
			r3.setFill(Color.GREEN);
			pane.getChildren().add(new Text (175, 35, "Midterm Exams--30"));
			pane.getChildren().add(r3);
			
			Rectangle r4 = new Rectangle(250, 20, 100, 30);
			r4.setStroke(Color.ORANGE);
			r4.setFill(Color.ORANGE);
			pane.getChildren().add(new Text (250, 15, "Final Exam--40%"));
			pane.getChildren().add(r4);
			
			// Create a scene and plane it in the stage
			Scene scene = new Scene(pane, 300, 150);
			primaryStage.setTitle("Class Grades");// Set the stage title
			primaryStage.setScene(scene); // Place the scene in the stage
			primaryStage.show(); // Display the stage
		}
		// Main method
		public static void main(String[] args){
			Application.launch(args);
		}
}
