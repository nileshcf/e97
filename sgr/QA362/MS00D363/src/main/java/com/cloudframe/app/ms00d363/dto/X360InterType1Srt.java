package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360InterType1Srt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360InterType1Srt extends X360InterType1SrtSerialized { 
   

						private char[] x360InstIdSrt1 = Field.fillLowValue(10);
	
	/**
	* Constructor for X360InterType1Srt
	**/
    public X360InterType1Srt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360InterType1Srt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360InterType1Srt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360InstIdSrt1
	 *	@return x360InstIdSrt1
	 */
   public char[] getX360InstIdSrt1() throws CFException{
     if (isX360InstIdSrt1Modified()) { 
        x360InstIdSrt1 = refreshX360InstIdSrt1();
     }
   		return x360InstIdSrt1;
   }

  
	/**
	*  set variable x360InstIdSrt1
	*  Corresponding COBOL Variable is X360-INST-ID-SRT1
	*  @param value
	**/
   public void setX360InstIdSrt1(char[] value) {
      x360InstIdSrt1 = checkX360InstIdSrt1Constraints(value);
      serializeX360InstIdSrt1(x360InstIdSrt1);
   } 

     /**
	 * 	Update X360InstIdSrt1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360InstIdSrt1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360InstIdSrt1,x360InstIdSrt1.length);
   	
   }
   
   public void setX360InstIdSrt1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360InstIdSrt1,x360InstIdSrt1.length);
   	
   }
   
     /**
	 * 	Update X360InstIdSrt1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360InstIdSrt1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360InstIdSrt1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360InstIdSrt1 with another Field
	 *	@param value
	 */
   public void setX360InstIdSrt1(Field source) {
       replace(source,0,source.length(),beginX360InstIdSrt1,X_360_INST_ID_SRT_1_LEN);
   	
   }  
   
     /**
	 * 	Update X360InstIdSrt1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360InstIdSrt1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360InstIdSrt1,X_360_INST_ID_SRT_1_LEN);
   	
   }
   
     /**
	 * 	Update X360InstIdSrt1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360InstIdSrt1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360InstIdSrt1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getX360InterType1SrtFieldLength() {
			return X_360_INTER_TYPE_1_SRT_LENGTH;
		}

}
  
