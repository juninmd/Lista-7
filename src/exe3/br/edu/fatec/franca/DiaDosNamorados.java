/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3.br.edu.fatec.franca;

import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class DiaDosNamorados extends CartaoWeb {

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        JOptionPane.showMessageDialog(null, "Destinatário: " + this.getDestinatario() + "\nParabéns Mozão!!");
    }

}
