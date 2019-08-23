import java.awt.AlphaComposite; 

import java.awt.Color; 

import java.awt.Font; 

import java.awt.Graphics; 

import java.awt.Graphics2D; 

import java.awt.Image; 

import java.awt.image.BufferedImage; 

import java.io.File; 

import java.io.IOException; 

import java.net.URL; 

import java.text.SimpleDateFormat; 

import java.util.Date; 

import java.util.concurrent.TimeUnit; 

import javax.imageio.ImageIO; 

import javax.swing.Icon; 

import javax.swing.ImageIcon; 

 

public class SRF_IDGG_VERSION3 { 

    static int width, height; 

     

    /** 
     * Generates Identity Card through information received from SRF 
     * Receives EMPTY CARD from address "C:/Aman_ID_Card_Generator/StudentCard_nameErased.jpg" 
     * Puts image of client through "C:/Aman_ID_Card_Generator/Photos/"+img_name+".jpg" 
     * img_name is received from parameters 
     * Puts signature from "C:/Aman_ID_Card_Generator/RATNESH_SIR.png"  
     * @param img_name  
     * @param name_s 
//     * @param qualification_s 
//     * @param dob_s 
//     * @param course_s 
//     * @param contact_s 
//     * @param email_s  
//     * @param prAddress_s  
//     * @param peAddress_s 
//     * @param dov_s 
     * @param id_s 
     * @param courseCode_s,  
     * @param expiryDate_s 
     * Saves card in the location "C:/Aman_ID_Card_Generator/ID Card/"+name_s+"_"+img_name+".jpg". 
     * @throws java.io.IOException 
     */ 

 public static void workingFunction(String img_name, String name_s, String id_s, String courseCode_s, String expiryDate_s) throws IOException{ 

 

     System.out.println("NAME OF IMAGE ::::::::::::::: "+img_name); 

    //BufferedImage image=ImageIO.read(new File("E:/Neosphere Project/StudentCard_nameErased.jpg")); 

     BufferedImage image=ImageIO.read(new File("C:/Aman_ID_Card_Generator/StudentCard_nameErased.jpg")); 

     

     

    Graphics g=image.getGraphics(); 

     g.setColor(Color.black); 

      

      

     

    Font f = new Font("TimesRoman", Font.BOLD, 24);  

    g.setFont(f.deriveFont(30f)); 

    g.drawString(name_s,327,185); 

      

      

         Font f1 = new Font("TimesRoman", Font.PLAIN, 24);  

        g.setFont(f1.deriveFont(30f)); 

        g.drawString(courseCode_s, 327, 250); 

        g.drawString(expiryDate_s, 760, 425); 

        g.drawString(id_s, 327, 425); 

     

        

       //BufferedImage image_photo=ImageIO.read(new File("C:/Users/pc/Desktop/"+img_name+".jpg")); 

       BufferedImage image_photo=ImageIO.read(new File(img_name)); 

       

               g.drawImage(image_photo, 40, 45, 245, 248, null); 

         

/////////////////////////////SIGNATURE ADDITION///////////////////////////////////////// 

 

 

 //BufferedImage signature=ImageIO.read(new File("E:/Neosphere Project/RATNESH_SIR_YOUTUBE copy.png")); 

   BufferedImage signature=ImageIO.read(new File("C:/Aman_ID_Card_Generator/RATNESH_SIR.png")); 

    

      g.drawImage(signature, 65, 243, null); 

       

 

/////////////////////////////SIGNATURE ADDITION COMPLETED////////////////////////////////// 

               

               

               

     g.dispose(); 

      

      

      Date date= new Date(); 

                SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddhhmmss"); 

                String strDate=formatter.format(date); 

      

     //ImageIO.write(image, "png", new File("E:/Neosphere Project/StudentCard_nameErased_edited.jpg")); 

 ImageIO.write(image, "jpg", new File("C:/Aman_ID_Card_Generator/ID Card/"+name_s+"_"+strDate+".jpg")); 

      

      

 } 

  

 

} 



