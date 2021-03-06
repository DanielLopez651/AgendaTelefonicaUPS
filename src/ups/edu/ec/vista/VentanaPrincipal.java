/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import ups.edu.ec.controlador.ControladorTelefono;
import ups.edu.ec.controlador.ControladorUsuario;
import ups.edu.ec.dao.TelefonoDAO;
import ups.edu.ec.dao.UsuarioDAO;


/**
 *
 * @author user
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private VentanaIniciarSesion ventanaIniciarSesion;
    private VentanaRegistrarUsuario ventanaRegistrarUsuario;
    private TelefonoDAO telefonoDAO;
    private UsuarioDAO usuarioDAO; 
    private ControladorTelefono controladorTelefono;
    private ControladorUsuario controladorUsuario;
    /**
     * Creates new form NewMDIApplication
     */
    public VentanaPrincipal() {
        initComponents();
        ventanaIniciarSesion= new VentanaIniciarSesion(controladorUsuario,this);
        ventanaRegistrarUsuario= new VentanaRegistrarUsuario(controladorUsuario);
        
        menuTelefono.setVisible(false);
        menuItemCerrarSesion.setVisible(false);
        controladorUsuario=new ControladorUsuario(usuarioDAO, telefonoDAO);
        controladorTelefono= new ControladorTelefono(telefonoDAO);         
    }

    public JMenuItem getInicarMenuItem() {
        return InicarMenuItem;
    }

    public JMenuItem getRegistarMenuItem() {
        return menuRegistar;
    }

    public JMenuItem getMenuItemCerrarSesion() {
        return menuItemCerrarSesion;
    }

    public JMenu getMenuTelefono() {
        return menuTelefono;
    }

 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuIniciarS = new javax.swing.JMenu();
        InicarMenuItem = new javax.swing.JMenuItem();
        menuRegistar = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuTelefono = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        desktopPane.setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        menuIniciarS.setMnemonic('f');
        menuIniciarS.setText("Inicio");

        InicarMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        InicarMenuItem.setMnemonic('o');
        InicarMenuItem.setText("Iniciar Sesion");
        InicarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicarMenuItemActionPerformed(evt);
            }
        });
        menuIniciarS.add(InicarMenuItem);

        menuRegistar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuRegistar.setMnemonic('s');
        menuRegistar.setText("Registar");
        menuRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistarActionPerformed(evt);
            }
        });
        menuIniciarS.add(menuRegistar);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menuIniciarS.add(exitMenuItem);

        menuItemCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCerrarSesion.setText("Cerra Sesion");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        menuIniciarS.add(menuItemCerrarSesion);

        menuBar.add(menuIniciarS);

        menuTelefono.setMnemonic('e');
        menuTelefono.setText("Menu Telefono");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        menuTelefono.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        menuTelefono.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        menuTelefono.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        menuTelefono.add(deleteMenuItem);

        menuBar.add(menuTelefono);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void InicarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicarMenuItemActionPerformed
       desktopPane.add(ventanaIniciarSesion);
       ventanaIniciarSesion.setVisible(true);
    }//GEN-LAST:event_InicarMenuItemActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        menuTelefono.setVisible(false);
        menuItemCerrarSesion.setVisible(false);
        menuIniciarS.setVisible(true);
        menuRegistar.setVisible(true);
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void menuRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistarActionPerformed
        desktopPane.add(ventanaRegistrarUsuario);
        ventanaRegistrarUsuario.setVisible(true);
    }//GEN-LAST:event_menuRegistarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem InicarMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuIniciarS;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuRegistar;
    private javax.swing.JMenu menuTelefono;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
