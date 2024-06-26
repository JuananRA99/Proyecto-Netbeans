/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Juan Antonio
 */
public class Home extends javax.swing.JPanel {
    int indicesGrado= 0;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setImageLabel(jLabel1, "src/imagenes/Grado0.png", new Dimension(353,273));
          setImageLabel(jLabel2, "src/imagenes/Grado1.png", new Dimension(353,273));
               setImageLabel(jLabel3, "src/imagenes/Grado2.png", new Dimension(353,273));
                   setImageLabel(jLabel4, "src/imagenes/Grado3.png", new Dimension(353,273));
          setImageLabel(jLabel5, "src/imagenes/Grado4.png", new Dimension(353,273));
               setImageLabel(jLabel6, "src/imagenes/Grado5.png", new Dimension(353,273));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grado0.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grado1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grado2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grado3.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grado4.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grado5.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(942, Short.MAX_VALUE))
        );

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1560, 840));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    
               try {
           String obj = new String(Files.readAllBytes(Paths.get("C:\\Users\\Juan Antonio\\Downloads\\BaseDeDatos.json")));
                
        // Convierte el String a un objeto JSON
               JSONObject jsonObject = new JSONObject(obj); 
            JSONArray grados = jsonObject.getJSONArray("grados");
            
            //obtengo el grado
            JSONObject grado = grados.getJSONObject(indicesGrado);
        
        // Obtengo el nombre del grado
        String nombreGrado = grado.getString("nombre");
        System.out.println("Nombre del grado: " + nombreGrado);
          JSONArray juegos = grado.getJSONArray("juegos");

           JSONObject juego = juegos.getJSONObject(0);
           

        // Obtén el título y la descripción del primer juego
        String titulo = juego.getString("titulo");
                   System.out.println(titulo);
        String descripcion = juego.getString("descripcion");
                   System.out.println(descripcion);
                 
             String imagen= juego.getString("imagen");
           Game p2= new Game(titulo,descripcion,imagen);
               ShowPanel(p2);
     
         } catch (Exception e) {
        e.printStackTrace();
    
    
    }//GEN-LAST:event_jLabel1MouseClicked
    }
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
 
         try {
           String obj = new String(Files.readAllBytes(Paths.get("C:\\Users\\Juan Antonio\\Downloads\\BaseDeDatos.json")));
                
        // Convierte el String a un objeto JSON
               JSONObject jsonObject = new JSONObject(obj); 
            JSONArray grados = jsonObject.getJSONArray("grados");
            
            //obtengo el grado
            JSONObject grado = grados.getJSONObject(indicesGrado);
        
        // Obtengo el nombre del grado
        String nombreGrado = grado.getString("nombre");
        System.out.println("Nombre del grado: " + nombreGrado);
          JSONArray juegos = grado.getJSONArray("juegos");

           JSONObject juego = juegos.getJSONObject(1);
           

        // Obtén el título y la descripción del primer juego
        String titulo = juego.getString("titulo");
                   System.out.println(titulo);
        String descripcion = juego.getString("descripcion");
                   System.out.println(descripcion);
                 
             String imagen= juego.getString("imagen");
           Game p2= new Game(titulo,descripcion,imagen);
               ShowPanel(p2);
     
         } catch (Exception e) {
        e.printStackTrace();
    
    
    }                                    
  
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        
          ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado0.png");
    Image originalImage = originalIcon.getImage();
    
    int newWidth = 383;
    int newHeight = 293;
    
    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    jLabel1.setIcon(scaledIcon);

    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    
    
         try {
           String obj = new String(Files.readAllBytes(Paths.get("C:\\Users\\Juan Antonio\\Downloads\\BaseDeDatos.json")));

        // Convierte el String a un objeto JSON
               JSONObject jsonObject = new JSONObject(obj); 
               JSONArray grados = jsonObject.getJSONArray("grados");
            
            //obtengo el grado
            JSONObject grado = grados.getJSONObject(indicesGrado);
        
        // Obtengo el nombre del grado
        String nombreGrado = grado.getString("nombre");
        System.out.println("Nombre del grado: " + nombreGrado);
        //System.out.println("Lee " + jsonObject);
          JSONArray juegos = grado.getJSONArray("juegos");

           JSONObject juego = juegos.getJSONObject(2);
           

        // Obtén el título y la descripción del primer juego
        String titulo = juego.getString("titulo");
        String descripcion = juego.getString("descripcion");
         String imagen= juego.getString("imagen");
           Game p2= new Game(titulo,descripcion,imagen);
               ShowPanel(p2);
         } catch (Exception e) {
        e.printStackTrace();
    }
  
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      try {
           String obj = new String(Files.readAllBytes(Paths.get("C:\\Users\\Juan Antonio\\Downloads\\BaseDeDatos.json")));

        // Convierte el String a un objeto JSON
               JSONObject jsonObject = new JSONObject(obj); 
               JSONArray grados = jsonObject.getJSONArray("grados");
            
            //obtengo el grado
            JSONObject grado = grados.getJSONObject(indicesGrado);
        
        // Obtengo el nombre del grado
        String nombreGrado = grado.getString("nombre");
        System.out.println("Nombre del grado: " + nombreGrado);
          JSONArray juegos = grado.getJSONArray("juegos");

           JSONObject juego = juegos.getJSONObject(3);
           

        // Obtén el título y la descripción del primer juego
        String titulo = juego.getString("titulo");
        String descripcion = juego.getString("descripcion");
         String imagen= juego.getString("imagen");
           Game p2= new Game(titulo,descripcion,imagen);
             ShowPanel(p2); 
         } catch (Exception e) {
        e.printStackTrace();
    }
  
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    try {
           String obj = new String(Files.readAllBytes(Paths.get("C:\\Users\\Juan Antonio\\Downloads\\BaseDeDatos.json")));

        // Convierte el String a un objeto JSON
               JSONObject jsonObject = new JSONObject(obj); 
               JSONArray grados = jsonObject.getJSONArray("grados");
            
            //obtengo el grado
            JSONObject grado = grados.getJSONObject(indicesGrado);
        
        // Obtengo el nombre del grado
        String nombreGrado = grado.getString("nombre");
        System.out.println("Nombre del grado: " + nombreGrado);
          JSONArray juegos = grado.getJSONArray("juegos");

           JSONObject juego = juegos.getJSONObject(4);
           

        // Obtén el título y la descripción del primer juego
        String titulo = juego.getString("titulo");
        String descripcion = juego.getString("descripcion");
        
         String imagen= juego.getString("imagen");
           Game p2= new Game(titulo,descripcion,imagen);
               ShowPanel(p2);
         } catch (Exception e) {
        e.printStackTrace();
    }
  
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
 try {
           String obj = new String(Files.readAllBytes(Paths.get("C:\\Users\\Juan Antonio\\Downloads\\BaseDeDatos.json")));

        // Convierte el String a un objeto JSON
               JSONObject jsonObject = new JSONObject(obj); 
             JSONArray grados = jsonObject.getJSONArray("grados");
            
            //obtengo el grado
            JSONObject grado = grados.getJSONObject(indicesGrado);
        
        // Obtengo el nombre del grado
        String nombreGrado = grado.getString("nombre");
        System.out.println("Nombre del grado: " + nombreGrado);
        //System.out.println("Lee " + jsonObject);
          JSONArray juegos = grado.getJSONArray("juegos");

           JSONObject juego = juegos.getJSONObject(5);
           

        // Obtén el título y la descripción del primer juego
        String titulo = juego.getString("titulo");
        String descripcion = juego.getString("descripcion");
        
           String imagen= juego.getString("imagen");
           Game p2= new Game(titulo,descripcion,imagen);
               ShowPanel(p2);
         } catch (Exception e) {
        e.printStackTrace();
    }
  
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
                    ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado1.png");
    Image originalImage = originalIcon.getImage();
    
    int newWidth = 383;
    int newHeight = 293;
    
    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    jLabel2.setIcon(scaledIcon);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
      ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado2.png");
        Image originalImage = originalIcon.getImage();
        
        int newWidth = 383;
        int newHeight = 293;
        
        Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        jLabel3.setIcon(scaledIcon);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
         ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado3.png");
        Image originalImage = originalIcon.getImage();
        
        int newWidth = 383;
        int newHeight = 293;
        
        Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        jLabel4.setIcon(scaledIcon);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado4.png");
        Image originalImage = originalIcon.getImage();
        
        int newWidth = 383;
        int newHeight = 293;
        
        Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        jLabel5.setIcon(scaledIcon);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
           ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado5.png");
        Image originalImage = originalIcon.getImage();
        
        int newWidth = 383;
        int newHeight = 293;
        
        Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        jLabel6.setIcon(scaledIcon);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed

   
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado0.png");
    Image originalImage = originalIcon.getImage();
    
    int newWidth = 353; // Tamaño más pequeño
    int newHeight = 273; // Tamaño más pequeño
    
    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    jLabel1.setIcon(scaledIcon);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
     ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado1.png");
    Image originalImage = originalIcon.getImage();
    
    int newWidth = 353; // Tamaño más pequeño
    int newHeight = 273; // Tamaño más pequeño
    
    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    jLabel2.setIcon(scaledIcon);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
    ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado2.png");
    Image originalImage = originalIcon.getImage();
    
    int newWidth = 353; // Tamaño más pequeño
    int newHeight = 273; // Tamaño más pequeño
    
    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    jLabel3.setIcon(scaledIcon);
                                      
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado3.png");
    Image originalImage = originalIcon.getImage();
    
    int newWidth = 353; // Tamaño más pequeño
    int newHeight = 273; // Tamaño más pequeño
    
    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    jLabel4.setIcon(scaledIcon);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
      ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado4.png");
    Image originalImage = originalIcon.getImage();
    
    int newWidth = 353; // Tamaño más pequeño
    int newHeight = 273; // Tamaño más pequeño
    
    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    jLabel5.setIcon(scaledIcon);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
    ImageIcon originalIcon = new ImageIcon("src/imagenes/Grado5.png");
    Image originalImage = originalIcon.getImage();
    
    int newWidth = 353; // Tamaño más pequeño
    int newHeight = 273; // Tamaño más pequeño
    
    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
    
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    jLabel6.setIcon(scaledIcon);
    }//GEN-LAST:event_jLabel6MouseExited


          private void setImageLabel(JLabel labelName, String root, Dimension dimension){
     ImageIcon image= new ImageIcon(root);
     Icon icon = new ImageIcon(
     image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_DEFAULT));
     labelName.setIcon(icon);
     this.repaint();
 }
        
    private void ShowPanel (JPanel p){
        
   
        p.setSize(1560, 840);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add( p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();        //
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
