import com.github.sarxos.webcam.Webcam; 

import com.github.sarxos.webcam.WebcamPanel; 

import java.awt.*; 

import java.awt.event.ActionEvent; 

import java.awt.event.ActionListener; 

import java.awt.image.BufferedImage; 

import java.io.File; 

import java.io.IOException; 

import java.text.SimpleDateFormat; 

import java.util.Date; 

import java.util.logging.Level; 

import java.util.logging.Logger; 

import javax.imageio.ImageIO; 

import javax.swing.*; 

 

public class SRF implements ActionListener{ 

     

     

       JFrame frame=new JFrame(); 

       JFrame newFrame=new JFrame(); 

       

       JLabel titleofpage=new JLabel("STUDENT REGISTRATION FORM"); 

         

       JLabel name=new JLabel("Name of Student: "); 

//       JLabel qualification=new JLabel("Academic Qualification: "); 

//       JLabel dob=new JLabel("Date of Birth: "); 

//       JLabel course=new JLabel("Preferred Course: "); 

//       JLabel contact=new JLabel("Contact Number: "); 

//       JLabel email=new JLabel("Email Address: "); 

//       JLabel prAddress=new JLabel("Present Address: "); 

//       JLabel peAddress=new JLabel("Permanent Address: "); 

//       JLabel dov=new JLabel("Date of Visit: "); 

       JLabel courseCode=new JLabel("Course Code"); 

       JLabel id=new JLabel("Student ID Number:"); 

       JLabel expiryDate=new JLabel("Expiry Date: "); 

        

        

        

       JTextField name1=new JTextField(); 

//       JTextField qualification1=new JTextField(); 

//       JTextField dob1=new JTextField(); 

//       JTextField course1=new JTextField(); 

//       JTextField contact1=new JTextField(); 

//       JTextField email1=new JTextField(); 

//       JTextField prAddress1=new JTextField(); 

//       JTextField peAddress1=new JTextField(); 

//       JTextField dov1=new JTextField(); 

       JTextField courseCode1=new JTextField(); 

       JTextField id1=new JTextField(); 

       JTextField expiryDate1=new JTextField(); 

        

       JButton submitButton=new JButton("Submit"); 

       JButton cancelButton=new JButton("Cancel"); 

      // JButton CameraButton=new JButton("Photo"); 

       JButton extraButton=new JButton("Extra Button"); 

       

       JButton againButton=new JButton("New Card"); 

        

       String name_s=new String(); 

//       String qualification_s=new String(); 

//       String dob_s=new String(); 

//       String course_s=new String(); 

//       String contact_s=new String(); 

//       String email_s=new String(); 

//       String prAddress_s=new String();; 

//       String peAddress_s=new String(); 

//       String dov_s=new String(); 

       String id_s=new String(); 

       String courseCode_s=new String(); 

       String expiryDate_s=new String(); 

       String strDate=new String(); 

        

        

       String pic=new String(); 

     

          JFrame myframe_cameraFrame=new JFrame(); 

             JButton click_cameraFrame=new JButton("Capture"); 

                 JButton cancel_cameraFrame=new JButton("Cancel"); 

     

/** 
 * Starts adding various components in frame. 
 * JLabel, JTextField and JButtons are the major components. 
 * Does not return anything. 
 */ 

    public void startProcess(){ 

         

        frame.setVisible(true); 

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        frame.setSize(800,300); 

        frame.setLayout(null); 

    

        

       titleofpage.setBounds(200,5,500,100); 

        

       name.setBounds(10,100,200,20); 

//       qualification.setBounds(0,125,200,20); 

//       dob.setBounds(0,150,200,20); 

//       course.setBounds(0,175,200,20); 

//       contact.setBounds(0,200,200,20); 

//       email.setBounds(0,225, 200, 20); 

//       prAddress.setBounds(0,250,200,20); 

//       peAddress.setBounds(0,275,200,20); 

       id.setBounds(10, 125, 200, 20); 

       courseCode.setBounds(10,150,200,20); 

//       dov.setBounds(0,350,200,20); 

       expiryDate.setBounds(10,175,200,20); 

        

       name1.setBounds(250,100,200,20); 

//       qualification1.setBounds(250,125,200,20); 

//       dob1.setBounds(250,150,200,20); 

//       course1.setBounds(250,175,200,20); 

//       contact1.setBounds(250,200,200,20); 

//       email1.setBounds(250,225, 200, 20); 

//       prAddress1.setBounds(250,250,200,20); 

//       peAddress1.setBounds(250,275,200,20); 

       id1.setBounds(250, 125, 200, 20); 

       courseCode1.setBounds(250,150,200,20); 

//       dov1.setBounds(250,350,200,20); 

       expiryDate1.setBounds(250, 175, 200,20); 

        

       Font f=new Font("Courier",Font.BOLD,30); 

       titleofpage.setFont(f); 

        

         

        

  

        

        

       frame.add(titleofpage); 

       frame.add(name); 

//       frame.add(qualification); 

//       frame.add(dob); 

//       frame.add(course); 

//       frame.add(contact); 

//       frame.add(email); 

//       frame.add(prAddress); 

//       frame.add(peAddress); 

       frame.add(titleofpage); 

//       frame.add(dov); 

       frame.add(courseCode); 

       frame.add(id); 

       frame.add(expiryDate); 

       frame.add(name1);  

//       frame.add(qualification1); 

//       frame.add(dob1); 

//       frame.add(course1); 

//       frame.add(contact1); 

//       frame.add(email1); 

       frame.add(expiryDate1); 

//       frame.add(prAddress1); 

//       frame.add(peAddress1); 

//       frame.add(dov1); 

       frame.add(courseCode1); 

       frame.add(id1); 

       frame.add(submitButton); 

       frame.add(cancelButton); 

       frame.setTitle("Student Card Generator"); 

        

      // WebcamPanelAndPicClick abc=new WebcamPanelAndPicClick(); 

 

       submitButton.setBounds(10,225,200,20); 

       submitButton.addActionListener(this); 

       cancelButton.setBounds(250,225,200,20); 

       cancelButton.addActionListener(this); 

  

        

        String myDate=new String(); 

        Date date= new Date(); 

                SimpleDateFormat data=new SimpleDateFormat("yyyy-MM-dd"); 

               myDate=data.format(date); 

//               dov1.setText(myDate); 

        

        

  } 

     

    /** 
     * Performs action when button is clicked. 
     * Only one actionPerformed method in entire program 
     * @param e  
     */ 

     @Override 

    public void actionPerformed(ActionEvent e) { 

         

         

         

         

       if(e.getSource()==cancelButton){ 

             

            System.exit(0); 

       } 

        

       else if(e.getSource()==againButton){ 

           newFrame.setVisible(false); 

       } 

        

        

       else{ 

            

 

    JFileChooser chooser = new JFileChooser(); 

    chooser.setCurrentDirectory(new java.io.File(".")); 

    chooser.setDialogTitle("Select Image"); 

    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY); 

    chooser.setAcceptAllFileFilterUsed(false); 

 

    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { 

      System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory()); 

      System.out.println("getSelectedFile() : " + chooser.getSelectedFile()); 

    } else { 

      System.out.println("No Selection "); 

    } 

           

       name_s= name1.getText(); 

//       qualification_s=qualification1.getText(); 

//       dob_s=dob1.getText(); 

//       course_s=course1.getText(); 

//       contact_s=contact1.getText(); 

//       email_s=email1.getText(); 

//       prAddress_s=prAddress1.getText(); 

//       peAddress_s=peAddress1.getText(); 

//       dov_s=dov1.getText(); 

       id_s= id1.getText(); 

       courseCode_s=courseCode1.getText(); 

       expiryDate_s=expiryDate1.getText();  

   

        Date date= new Date(); 

                SimpleDateFormat formatter=new SimpleDateFormat("yyyyMMddhhmmss"); 

               strDate=formatter.format(date); 

               String fileName=chooser.getSelectedFile().toString(); 

 

                 

           try { 

              

               SRF myLocalVar=new SRF(); 

               myLocalVar.DisplayFunction(fileName, name_s, id_s, courseCode_s, expiryDate_s ); 

           } catch (InterruptedException | IOException ex) { 

               Logger.getLogger(SRF.class.getName()).log(Level.SEVERE, null, ex); 

           } 

         

        

       } 

          

         

        

        

    } 

     

     

    /** 
     * Used to display all information of form 
     * Receives various parameters and displays those parameters from form 
     */ 

    void DisplayFunction(String img_name, String name_s, String id_s, String courseCode_s, String expiryDate_s) throws IOException, InterruptedException{ 

         

        

         

        //remove this comment   //frame.setVisible(false); 

         

         

         

        Container c = newFrame.getContentPane(); 

        c.setLayout(null); 

         

         //ImageIcon icon=new ImageIcon("C:/Users/pc/Desktop/"+img_name+".jpg"); 

     ImageIcon icon=new ImageIcon(img_name); 

          

          

        /* 
         System.out.println(name_s); 
       +  System.out.println(qualification_s); 
         System.out.println(dob_s); 
         System.out.println(course_s); 
         System.out.println(contact_s); 
         System.out.println(email_s); 
         System.out.println(prAddress_s); 
         System.out.println(peAddress_s); 
         System.out.println(dov_s); 
      */ 

       

       JLabel titleofpage_a=new JLabel("STUDENT REGISTRATION FORM"); 

        

       JLabel name_q=new JLabel("Name of Student: "); 

//       JLabel qualification_q=new JLabel("Academic Qualification: "); 

//       JLabel dob_q=new JLabel("Date of Birth: "); 

//       JLabel course_q=new JLabel("Preferred Course: "); 

//       JLabel contact_q=new JLabel("Contact Number: "); 

//       JLabel email_q=new JLabel("Email Address: "); 

//       JLabel prAddress_q=new JLabel("Present Address: "); 

//       JLabel peAddress_q=new JLabel("Permanent Address: "); 

//       JLabel dov_q=new JLabel("Date of Visit: "); 

       JLabel id_q=new JLabel("Student ID Nmber:"); 

       JLabel courseCode_q=new JLabel("Course Code: "); 

       JLabel expiryDate_q=new JLabel("Expiry Date: "); 

        

        

       JLabel name_ans=new JLabel(name_s); 

       JLabel id_ans=new JLabel(id_s); 

       JLabel  courseCode_ans=new JLabel(courseCode_s); 

       JLabel expiryDate_ans=new JLabel(expiryDate_s); 

        

      JLabel image_for_final_display=new JLabel(icon); 

        

       name_q.setBounds(10,10,200,20); 

//       qualification_q.setBounds(0,125,200,20); 

//       dob_q.setBounds(0,150,200,20); 

//       dob_q.setBounds(502,80,200,20); 

//       course_q.setBounds(0,175,200,20); 

//       contact_q.setBounds(0,200,200,20); 

//       email_q.setBounds(0,225, 200, 20); 

//       prAddress_q.setBounds(0,250,200,20); 

//       peAddress_q.setBounds(0,275,200,20); 

//       dov_q.setBounds(0,300,200,20); 

       id_q.setBounds(10,35,200,20); 

       courseCode_q.setBounds(10,60,200,20); 

       expiryDate_q.setBounds(10,85,200,20); 

        

       name_ans.setBounds(250,10,200,20); 

       id_ans.setBounds(250,35,200,20); 

       courseCode_ans.setBounds(250,60,200,20); 

       expiryDate_ans.setBounds(250,85,200,20); 

        

      image_for_final_display.setBounds(500,10,100,100); 

        

      cancelButton.setBounds(250,120,200,20); 

      againButton.setBounds(10,120,200,20); 

       

      cancelButton.addActionListener(this); 

      againButton.addActionListener(this); 

       

       Font myFont=new Font("Courier",Font.BOLD,30); 

       titleofpage_a.setFont(myFont); 

        

 

       c.add(titleofpage_a); 

       c.add(name_q); 

//       c.add(qualification_q); 

//       c.add(dob_q); 

//       c.add(course_q); 

//       c.add(contact_q); 

//       c.add(email_q); 

//       c.add(prAddress_q); 

//       c.add(peAddress_q); 

//       c.add(dov_q); 

       c.add(id_q); 

       c.add(courseCode_q); 

       c.add(expiryDate_q); 

        

       c.add(name_ans);  

       c.add(id_ans); 

       c.add(courseCode_ans); 

       c.add(expiryDate_ans); 

        

      c.add(image_for_final_display); 

        

      c.add(againButton); 

      c.add(cancelButton); 

 

        

        newFrame.setVisible(true); 

        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        newFrame.setSize(800,300); 

        newFrame.setLayout(null); 

        newFrame.setTitle("DETAILS OF STUDENT"); 

        

     

         

    SRF_IDGG_VERSION3 callIDCardGenerator=new SRF_IDGG_VERSION3(); 

    SRF_IDGG_VERSION3.workingFunction(img_name, name_s, id_s, courseCode_s, expiryDate_s); 

         

    } 

     

    

    public static void main(String[] args) { 

         SRF o=new SRF(); 

        o.startProcess();     

    } 

 

 

} 