import javax.swing.JOptionPane;

public class notasestructuradas {
    public static void main(String[] args) throws Exception {
        for(int est = 1; est <=2; est++) {
            Object parentComponent;
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 1 del estudiante"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 2 del estudiante"));
            float nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota3 del estudiante"));
            float notaFinal = (nota1 + nota2 + nota3) / 3;
            JOptionPane.showMessageDialog(null, "Informacion del estudiante: " + nombre + "Nota Final" + notaFinal );
            if(notaFinal <=3) {
                JOptionPane.showMessageDialog(null, "El estudiante reprobo el curso");
            }
            else{
                JOptionPane.showMessageDialog(null, "El estudiante aprobo el curso");
            }
        

        }
    }
}
