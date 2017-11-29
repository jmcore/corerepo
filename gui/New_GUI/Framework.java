package sample;

 import javafx.application.*;
 import javafx.geometry.Pos;
 import javafx.scene.*;
 import javafx.scene.control.*;
 import javafx.scene.layout.*;
 import javafx.stage.*;
 import javafx.collections.*;

public class Main extends Application {
    public static int i = 0;
    private Stage window;
    private Scene s1, s2, s3;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        //button 1
        Button b1 = new Button("Test Generator");
        b1.setOnAction(e -> window.setScene(s2));
        b1.setPrefSize(250,250);

        //button 2
        Button b2 = new Button("Jeopardy Board");
        b2.setOnAction(e -> window.setScene(s3));
        b2.setPrefSize(250,250);

        //button 3
        Button b3 = new Button("Make test");
        b3.setOnAction(e -> System.out.println("hi"));


        //return button
        Button ret = new Button("Return");
        ret.setOnAction(e -> window.setScene(s1));

        //layout 1
        HBox l1 = new HBox();
        l1.getChildren().addAll(b1,b2);
        s1 = new Scene(l1, 500,250);

        ///Component 1
        ListView<String> list1 = new ListView();
        ObservableList<String> items =FXCollections.observableArrayList (
                "Single", "Double", "Suite", "Family App");
        list1.setItems(items);

        ListView<String> list2 = new ListView();
        ObservableList<String> selected =FXCollections.observableArrayList();
        list2.setItems(selected);

        ObservableList<String> temp = list1.getSelectionModel().getSelectedItems();

        //List for difficulty
        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        choiceBox.getItems().addAll("Normal","Hard","Turbo Multi Extra");
        choiceBox.setValue("Normal");

        ///sub_layouts
        //transfer selected

        Button move = new Button(">");
        move.setOnAction(e -> {
            selected.addAll(temp);
            i++;



        });

        Button back = new Button("<");
        back.setOnAction(e -> {
            if(i <= 0){
                System.out.println("Empty List");
            }
            else{
                selected.remove(0);
                i--;
            }


        });

        VBox cen_but = new VBox();
        cen_but.setAlignment(Pos.CENTER);
        cen_but.getChildren().addAll(move,back);

        //sub 2

        ComboBox<String> c1 = new ComboBox();
        HBox h1 = new HBox();
        h1.setAlignment(Pos.TOP_CENTER);
        h1.getChildren().addAll(c1, choiceBox);

        //sub 3

        HBox h2 = new HBox();
        h2.setAlignment(Pos.CENTER);
        h2.getChildren().addAll(ret,b3);

        Label label1 = new Label("Test Name:");
        TextField textField = new TextField ();
        h2.getChildren().addAll(label1,textField);






        //layout 2
        BorderPane l2 = new BorderPane();
        l2.setLeft(list1);
        l2.setRight(list2);
        l2.setBottom(h2);
        l2.setCenter(cen_but);
        l2.setTop(h1);
        s2 = new Scene(l2, 600,300);


        window.setScene(s1);
        window.setTitle("TestTG");
        window.show();

    }
}
