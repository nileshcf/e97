package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00754CabProgramTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00754CabProgramTbl extends Ip00754CabProgramTblSerialized { 
   

						private char[] ip00754CabProgram = Field.fillLowValue(4);

						private char[] ip00754CabPgmLifecycleInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00754CabProgramTbl
	**/
    public Ip00754CabProgramTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00754CabProgramTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00754CabProgramTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00754CabProgram
	 *	@return ip00754CabProgram
	 */
   public char[] getIp00754CabProgram() throws CFException{
     if (isIp00754CabProgramModified()) { 
        ip00754CabProgram = refreshIp00754CabProgram();
     }
   		return ip00754CabProgram;
   }

  
	/**
	*  set variable ip00754CabProgram
	*  Corresponding COBOL Variable is IP00754-CAB-PROGRAM
	*  @param value
	**/
   public void setIp00754CabProgram(char[] value) {
      ip00754CabProgram = checkIp00754CabProgramConstraints(value);
      serializeIp00754CabProgram(ip00754CabProgram);
   } 

     /**
	 * 	Update Ip00754CabProgram 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00754CabProgram(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00754CabProgram,ip00754CabProgram.length);
   	
   }
   
   public void setIp00754CabProgram(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754CabProgram,ip00754CabProgram.length);
   	
   }
   
     /**
	 * 	Update Ip00754CabProgram 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00754CabProgram(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754CabProgram+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00754CabProgram with another Field
	 *	@param value
	 */
   public void setIp00754CabProgram(Field source) {
       replace(source,0,source.length(),beginIp00754CabProgram,IP_00754_CAB_PROGRAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00754CabProgram 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00754CabProgram(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00754CabProgram,IP_00754_CAB_PROGRAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip00754CabProgram 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00754CabProgram(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754CabProgram+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00754CabPgmLifecycleInd
	 *	@return ip00754CabPgmLifecycleInd
	 */
   public char[] getIp00754CabPgmLifecycleInd() throws CFException{
     if (isIp00754CabPgmLifecycleIndModified()) { 
        ip00754CabPgmLifecycleInd = refreshIp00754CabPgmLifecycleInd();
     }
   		return ip00754CabPgmLifecycleInd;
   }

  
	/**
	*  set variable ip00754CabPgmLifecycleInd
	*  Corresponding COBOL Variable is IP00754-CAB-PGM-LIFECYCLE-IND
	*  @param value
	**/
   public void setIp00754CabPgmLifecycleInd(char[] value) {
      ip00754CabPgmLifecycleInd = checkIp00754CabPgmLifecycleIndConstraints(value);
      serializeIp00754CabPgmLifecycleInd(ip00754CabPgmLifecycleInd);
   } 

     /**
	 * 	Update Ip00754CabPgmLifecycleInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00754CabPgmLifecycleInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00754CabPgmLifecycleInd,ip00754CabPgmLifecycleInd.length);
   	
   }
   
   public void setIp00754CabPgmLifecycleInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754CabPgmLifecycleInd,ip00754CabPgmLifecycleInd.length);
   	
   }
   
     /**
	 * 	Update Ip00754CabPgmLifecycleInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00754CabPgmLifecycleInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754CabPgmLifecycleInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00754CabPgmLifecycleInd with another Field
	 *	@param value
	 */
   public void setIp00754CabPgmLifecycleInd(Field source) {
       replace(source,0,source.length(),beginIp00754CabPgmLifecycleInd,IP_00754_CAB_PGM_LIFECYCLE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00754CabPgmLifecycleInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00754CabPgmLifecycleInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00754CabPgmLifecycleInd,IP_00754_CAB_PGM_LIFECYCLE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00754CabPgmLifecycleInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00754CabPgmLifecycleInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00754CabPgmLifecycleInd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00754CabProgramTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00754CabProgram(CONSTANTS.SPACE_4);
         setIp00754CabPgmLifecycleInd(CONSTANTS.SPACE);
   }

		public static int getIp00754CabProgramTblFieldLength() {
			return IP_00754_CAB_PROGRAM_TBL_LENGTH;
		}

}
  
