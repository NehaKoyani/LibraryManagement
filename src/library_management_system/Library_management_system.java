/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_management_system;

/**
 *
 * @author abc
 */
public class Library_management_system {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loginpage obj=new loginpage();
        try{
            Thread.sleep(150);
            obj.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
