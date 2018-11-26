/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaProject;

/**
 *
 * @author PushkarSharma
 */
import java.util.Random; 
  
public class GetRandomNumber
{
    static int RandomNumFunc()
    {
        Random rand = new Random(); 
        int genNum = rand.nextInt(1000); 
        return genNum;
    } 
}