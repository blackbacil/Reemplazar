package dad.maven.reemplaza.Reemplaza;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Reemplaza extends Application {
	private Button buttonBuscar = new Button("Buscar");
	private Button buttonReemplazar = new Button("Reemplazar");
	private Button buttonReemplazarTodo = new Button("Reemplazar todo");
	private Button buttonCerrar = new Button("Cerrar");
	private Button buttonAyuda = new Button("Ayuda");
	private TextField buscarText = new TextField();
	private TextField reemplazarText = new TextField();
	private CheckBox cbMayus= new CheckBox("Mayúsculas y minúsculas");
	private CheckBox cbBuscar= new CheckBox("Buscar hacia atrás");
	private CheckBox cbRegular= new CheckBox("Expresión regular");
	private CheckBox cbResaltar= new CheckBox("Resaltar resultados");
	private VBox botones;
	private VBox check1;
	private VBox check2;
	private HBox check;

	@Override
	public void start(Stage primaryStage) throws Exception {
		botones =new VBox(5,buttonBuscar,buttonReemplazar,buttonReemplazarTodo,buttonCerrar,buttonAyuda);
		check1 =new VBox(5,cbMayus,cbRegular);
		check2 =new VBox(5,cbBuscar,cbResaltar);
		check = new HBox(5,check1,check2);
		
		buttonBuscar.setMaxWidth(Double.MAX_VALUE);
		buttonReemplazar.setMaxWidth(Double.MAX_VALUE);
		buttonReemplazarTodo.setMaxWidth(Double.MAX_VALUE);
		buttonCerrar.setMaxWidth(Double.MAX_VALUE);
		buttonAyuda.setMaxWidth(Double.MAX_VALUE);
		

		
		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setVgap(5);
		root.setHgap(5);
		root.setGridLinesVisible(true);
		
		root.add(new Label("Buscar:"),0,0);
		root.add(new Label("Reemplazar con:  "),0,1);
		root.add(buscarText,1,0);
		root.add(reemplazarText,1,1);
		root.add(check,1,2);
		root.add(botones,2,0);
		
		GridPane.setRowSpan(botones,3);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints(),
			};
		
		root.getColumnConstraints().setAll(cols);
		cols[1].setHgrow(Priority.ALWAYS);
		
		Scene scene = new Scene(root, 600, 500);
		
		primaryStage.setTitle("AED");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
	launch(args);

	}

}
