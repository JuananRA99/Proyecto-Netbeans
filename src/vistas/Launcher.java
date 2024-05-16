/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Juan Antonio
 */
public class Launcher extends javax.swing.JFrame {


    public Launcher() {
          initComponents();
         
        Home p1= new Home();
    ShowPanel(p1);
    
 
        setImageLabel(fondo, "src/imagenes/Fondo base.png", new Dimension(1920,1080));
      setImageLabel(img1, "src/imagenes/LauncherButton0.png", new Dimension(80,80));
       setImageLabel(img2, "src/imagenes/LauncherButton1.png", new Dimension(80,80));
        setImageLabel(img3, "src/imagenes/LauncherButton2.png", new Dimension(80,80));
         setImageLabel(img4,"src/imagenes/LauncherButton3.png",  new Dimension(80,80));
         setImageLabel(img5, "src/imagenes/LauncherButton4.png", new Dimension(80,80));
         setImageLabel(img6,"src/imagenes/LauncherButton5.png",  new Dimension(80,80));
         setImageLabel(img7,"src/imagenes/LauncherButton6.png",  new Dimension(80,80));
                  setImageLabel(img8,"src/imagenes/LauncherButton7.png",  new Dimension(80,80));
         setImageLabel(img9, "src/imagenes/LauncherButton8.png", new Dimension(80,80));
         setImageLabel(img10,"src/imagenes/LauncherButton9.png",  new Dimension(80,80));
         setImageLabel(img11, "src/imagenes/LauncherButton10.png", new Dimension(80,80));
         setImageLabel(img12,"src/imagenes/LauncherButton11.png",  new Dimension(80,80));
          setImageLabel(img13, "src/imagenes/LauncherButton12.png", new Dimension(80,80));
         setImageLabel(img14,"src/imagenes/LauncherButton13.png",  new Dimension(80,80));


     

       //  setImageLabel(jLabel2, "src/imagenes/Grado0.png", new Dimension(90,90));
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();
        img8 = new javax.swing.JLabel();
        img9 = new javax.swing.JLabel();
        img10 = new javax.swing.JLabel();
        img11 = new javax.swing.JLabel();
        img12 = new javax.swing.JLabel();
        img13 = new javax.swing.JLabel();
        img14 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img1MouseReleased(evt);
            }
        });
        jPanel1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 90, 90));

        img2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img2MouseReleased(evt);
            }
        });
        jPanel1.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 90, 90));

        img3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img3MouseReleased(evt);
            }
        });
        jPanel1.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 90, 90));

        img4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img4MouseReleased(evt);
            }
        });
        jPanel1.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 90, 90));

        img5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img5MouseReleased(evt);
            }
        });
        jPanel1.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 90, 90));

        img6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img6MouseReleased(evt);
            }
        });
        jPanel1.add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 90, 90));

        img7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img7MouseReleased(evt);
            }
        });
        jPanel1.add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 90, 90, 90));

        img8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img8MouseReleased(evt);
            }
        });
        jPanel1.add(img8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 90, 90, 90));

        img9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img9MouseReleased(evt);
            }
        });
        jPanel1.add(img9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 90, 90, 90));

        img10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img10MouseReleased(evt);
            }
        });
        jPanel1.add(img10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 90, 90, 90));

        img11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img11MouseReleased(evt);
            }
        });
        jPanel1.add(img11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 90, 90, 90));

        img12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img12MouseReleased(evt);
            }
        });
        jPanel1.add(img12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 90, 90, 90));

        img13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img13MouseReleased(evt);
            }
        });
        jPanel1.add(img13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 90, 90, 90));

        img14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                img14MouseReleased(evt);
            }
        });
        jPanel1.add(img14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 90, 90, 90));

        content.setOpaque(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 1540, 840));

        fondo.setOpaque(true);
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void img1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseClicked

    }//GEN-LAST:event_img1MouseClicked

    private void img1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MousePressed
        Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton0.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img1.setIcon(scaledIcon);
    }//GEN-LAST:event_img1MousePressed

    private void img1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img1MouseReleased
     ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton0.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img1.setIcon(scaledIcon);
    }//GEN-LAST:event_img1MouseReleased

    private void img2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MousePressed
     Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton1.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img2.setIcon(scaledIcon);
    }//GEN-LAST:event_img2MousePressed

    private void img2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img2MouseReleased
         ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton1.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img2.setIcon(scaledIcon);
                                 
    }//GEN-LAST:event_img2MouseReleased

    private void img3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MousePressed
      Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton2.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img3.setIcon(scaledIcon);
                                     
    }//GEN-LAST:event_img3MousePressed

    private void img3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img3MouseReleased
          ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton2.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img3.setIcon(scaledIcon);
    }//GEN-LAST:event_img3MouseReleased

    private void img4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img4MousePressed
     Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton3.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img4.setIcon(scaledIcon);
                               
    }//GEN-LAST:event_img4MousePressed

    private void img4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img4MouseReleased
         ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton3.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img4.setIcon(scaledIcon);
    }//GEN-LAST:event_img4MouseReleased

    private void img5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img5MousePressed
      Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton4.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img5.setIcon(scaledIcon);
    }//GEN-LAST:event_img5MousePressed

    private void img5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img5MouseReleased
   ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton4.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img5.setIcon(scaledIcon);
    }//GEN-LAST:event_img5MouseReleased

    private void img6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img6MousePressed
    Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton5.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img6.setIcon(scaledIcon);
    }//GEN-LAST:event_img6MousePressed

    private void img6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img6MouseReleased
         ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton5.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img6.setIcon(scaledIcon);
    }//GEN-LAST:event_img6MouseReleased

    private void img7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img7MousePressed
          Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton6.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img7.setIcon(scaledIcon);
    }//GEN-LAST:event_img7MousePressed

    private void img7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img7MouseReleased
       ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton6.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img7.setIcon(scaledIcon);
    }//GEN-LAST:event_img7MouseReleased

    private void img8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img8MousePressed
  Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton6.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img7.setIcon(scaledIcon);
    }//GEN-LAST:event_img8MousePressed

    private void img8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img8MouseReleased
       ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton7.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img8.setIcon(scaledIcon);
    }//GEN-LAST:event_img8MouseReleased

    private void img9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img9MousePressed
       Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton8.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img9.setIcon(scaledIcon);
    }//GEN-LAST:event_img9MousePressed

    private void img9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img9MouseReleased
         ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton8.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img9.setIcon(scaledIcon);
    }//GEN-LAST:event_img9MouseReleased

    private void img10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img10MousePressed
    Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton9.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img10.setIcon(scaledIcon);
    }//GEN-LAST:event_img10MousePressed

    private void img10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img10MouseReleased
        ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton9.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img10.setIcon(scaledIcon);
    }//GEN-LAST:event_img10MouseReleased

    private void img11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img11MousePressed
      Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton10.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img11.setIcon(scaledIcon);
    }//GEN-LAST:event_img11MousePressed

    private void img11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img11MouseReleased
        ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton10.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img11.setIcon(scaledIcon);
    }//GEN-LAST:event_img11MouseReleased

    private void img12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img12MousePressed
      Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton11.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img12.setIcon(scaledIcon);
    }//GEN-LAST:event_img12MousePressed

    private void img12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img12MouseReleased
         ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton11.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img12.setIcon(scaledIcon);
    }//GEN-LAST:event_img12MouseReleased

    private void img13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img13MousePressed
      Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton12.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img13.setIcon(scaledIcon);
    }//GEN-LAST:event_img13MousePressed

    private void img13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img13MouseReleased
      ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton12.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img13.setIcon(scaledIcon);
    }//GEN-LAST:event_img13MouseReleased

    private void img14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img14MousePressed
      Home p1 = new Home();
    ShowPanel(p1);
 
    
    ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton13.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 100;
    int newHeight = 100;

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img14.setIcon(scaledIcon);
    }//GEN-LAST:event_img14MousePressed

    private void img14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img14MouseReleased
         ImageIcon originalIcon = new ImageIcon("src/imagenes/LauncherButton13.png");
    Image originalImage = originalIcon.getImage();

    int newWidth = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón
    int newHeight = 80; // Ajusta el tamaño de acuerdo al tamaño original del botón

    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    img14.setIcon(scaledIcon);
    }//GEN-LAST:event_img14MouseReleased
  
  
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Launcher().setVisible(true);
            }
        });
    }
    
    
       private void ShowPanel (JPanel p){
        
   
        p.setSize(1560, 840);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add( p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();        //
    }
 
    private void setImagePanel(JPanel panelName, String root, Dimension dimension){
    ImageIcon image = new ImageIcon(root);
    Image scaledImage = image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_DEFAULT);
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    panelName.removeAll(); // Limpiar cualquier componente anterior en el panel
    panelName.setLayout(new BorderLayout());
    JLabel label = new JLabel(scaledIcon);
    panelName.add(label, BorderLayout.CENTER);
    panelName.repaint();
}
    
      private void setImageLabel(JLabel labelName, String root, Dimension dimension){
     ImageIcon image= new ImageIcon(root);
     Icon icon = new ImageIcon(
     image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_DEFAULT));
     labelName.setIcon(icon);
     this.repaint();
 }
 

     private void setImageButton(JButton button, String root, Dimension dimension) {
    ImageIcon image = new ImageIcon(root);
    Image scaledImage = image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_DEFAULT);
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    button.setIcon(scaledIcon);
    button.setText(""); // Para evitar que el texto del botón afecte la visualización de la imagen
    button.setHorizontalTextPosition(SwingConstants.CENTER); // Centrar la imagen en el botón
    button.setVerticalTextPosition(SwingConstants.CENTER);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img10;
    private javax.swing.JLabel img11;
    private javax.swing.JLabel img12;
    private javax.swing.JLabel img13;
    private javax.swing.JLabel img14;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JLabel img8;
    private javax.swing.JLabel img9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


