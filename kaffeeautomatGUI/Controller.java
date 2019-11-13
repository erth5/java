package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Controller {
    @FXML
        private TextField input;
    @FXML
        private Label output;
    @FXML
        private Label result;

    //public
    public static void pre (){
    }

    @FXML //Bei Eingabe
    public void handleinput(){

        //Vorbereiten und Zurücksetzen
        String c = input.getText();
        String zcurrent = "s0";
        output.setText("");
        result.setText("Kein Kaffee");

        //Mögliche Erweiterung: Filtern der Eingabewerte
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length(); i++){
            char input = c.charAt(i);
            switch (input){
                case '1': sb.append("1");
                    break;
                case '2': sb.append("2");
                    break;
                case 'A': sb.append("A");
                    break;
                case 'R': sb.append("R");
                    break;
                default:
            }
        }
        //System.out.println(sb);

        //Eingabe auswerten
        for (int i = 0; i < sb.length(); i++){
            char symbol = sb.charAt(i);

            switch (zcurrent){
                case ("s0"): {//Anfangszustand
                    switch (symbol) {
                        case '1': zcurrent = "s1";
                            break;
                        case '2': zcurrent = "s2";
                            break;
                        case 'A': zcurrent = "s0";//Ignorieren
                            break;
                        case 'R': zcurrent = "s0";//Ignorieren
                            break;
                    }
                    output.setText(output.getText() + zcurrent + " / ");
                    break;

                }
                case ("s1") : {//1€ eingeworfen
                    switch (symbol) {
                        case '1': zcurrent = "s2";
                            break;
                        case '2': zcurrent = "s3";
                            break;
                        case 'A': zcurrent = "s1";//Ignorieren
                            break;
                        case 'R': zcurrent = "s0";//Geld auswerfen
                            break;
                    }
                    output.setText(output.getText() + zcurrent + " / ");
                    break;

                }
                case ("s2") : {//2€ eingeworfen
                    switch (symbol) {
                        case '1': zcurrent = "s3";
                            break;
                        case '2': zcurrent = "s2";//Geld durchleiten
                            break;
                        case 'A': zcurrent = "s2";//Ignorieren
                            break;
                        case 'R': zcurrent = "s0";//Geld auswerfen
                            break;
                    }
                    output.setText(output.getText() + zcurrent + " / ");
                    break;

                }
                case ("s3") : {//2€ eingeworfen
                    switch (symbol) {
                        case '1': zcurrent = "s3";//Geld durchleiten
                            break;
                        case '2': zcurrent = "s3";//Geld durchleiten
                            break;
                        case 'A': {
                            zcurrent = "s0";//
                            result.setText("Kaffee!");//Kaffee ausschenken
                            break;
                        }
                        case 'R': zcurrent = "s0";//Geld auswerfen
                            break;
                    }
                    output.setText(output.getText() + zcurrent + " / ");
                    break;
                }
            }//switche
        }//schleife
    }
}
