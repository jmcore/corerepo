package sample;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.collections.*;

public class Framework extends Application {

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



        ///sub_layouts
        //transfer selected
            Button move = new Button(">");
            move.setOnAction(e -> {
                selected.addAll(temp);

            });

            Button back = new Button("<");
            back.setOnAction(e -> {
                selected.remove(0);


            });

            VBox cen_but = new VBox();
            cen_but.setAlignment(Pos.CENTER);
            cen_but.getChildren().addAll(move,back);

            //sub 2

            ComboBox<String> c1 = new ComboBox();
            HBox h1 = new HBox();
            h1.setAlignment(Pos.TOP_LEFT);
            h1.getChildren().add(c1);

            //sub 3



        //layout 2
        BorderPane l2 = new BorderPane();
        l2.setLeft(list1);
        l2.setRight(list2);
        l2.setBottom(ret);
        l2.setCenter(cen_but);
        l2.setTop(h1);
        s2 = new Scene(l2, 500,250);


        window.setScene(s1);
        window.setTitle("TestTG");
        window.show();

    }
}
