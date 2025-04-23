package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360InterType2Srt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360InterType2Srt extends X360InterType2SrtSerialized { 
   

						private char[] x360SscServIdSrt2 = Field.fillLowValue(3);

						private char[] x360IsisAgreeNumSrt2 = Field.fillLowValue(4);

	
	/**
	* Constructor for X360InterType2Srt
	**/
    public X360InterType2Srt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360InterType2Srt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360InterType2Srt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360SscServIdSrt2
	 *	@return x360SscServIdSrt2
	 */
   public char[] getX360SscServIdSrt2() throws CFException{
     if (isX360SscServIdSrt2Modified()) { 
        x360SscServIdSrt2 = refreshX360SscServIdSrt2();
     }
   		return x360SscServIdSrt2;
   }

  
	/**
	*  set variable x360SscServIdSrt2
	*  Corresponding COBOL Variable is X360-SSC-SERV-ID-SRT2
	*  @param value
	**/
   public void setX360SscServIdSrt2(char[] value) {
      x360SscServIdSrt2 = checkX360SscServIdSrt2Constraints(value);
      serializeX360SscServIdSrt2(x360SscServIdSrt2);
   } 

     /**
	 * 	Update X360SscServIdSrt2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SscServIdSrt2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SscServIdSrt2,x360SscServIdSrt2.length);
   	
   }
   
   public void setX360SscServIdSrt2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SscServIdSrt2,x360SscServIdSrt2.length);
   	
   }
   
     /**
	 * 	Update X360SscServIdSrt2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SscServIdSrt2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SscServIdSrt2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SscServIdSrt2 with another Field
	 *	@param value
	 */
   public void setX360SscServIdSrt2(Field source) {
       replace(source,0,source.length(),beginX360SscServIdSrt2,X_360_SSC_SERV_ID_SRT_2_LEN);
   	
   }  
   
     /**
	 * 	Update X360SscServIdSrt2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SscServIdSrt2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SscServIdSrt2,X_360_SSC_SERV_ID_SRT_2_LEN);
   	
   }
   
     /**
	 * 	Update X360SscServIdSrt2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SscServIdSrt2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SscServIdSrt2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360IsisAgreeNumSrt2
	 *	@return x360IsisAgreeNumSrt2
	 */
   public char[] getX360IsisAgreeNumSrt2() throws CFException{
     if (isX360IsisAgreeNumSrt2Modified()) { 
        x360IsisAgreeNumSrt2 = refreshX360IsisAgreeNumSrt2();
     }
   		return x360IsisAgreeNumSrt2;
   }

  
	/**
	*  set variable x360IsisAgreeNumSrt2
	*  Corresponding COBOL Variable is X360-ISIS-AGREE-NUM-SRT2
	*  @param value
	**/
   public void setX360IsisAgreeNumSrt2(char[] value) {
      x360IsisAgreeNumSrt2 = checkX360IsisAgreeNumSrt2Constraints(value);
      serializeX360IsisAgreeNumSrt2(x360IsisAgreeNumSrt2);
   } 

     /**
	 * 	Update X360IsisAgreeNumSrt2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360IsisAgreeNumSrt2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360IsisAgreeNumSrt2,x360IsisAgreeNumSrt2.length);
   	
   }
   
   public void setX360IsisAgreeNumSrt2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360IsisAgreeNumSrt2,x360IsisAgreeNumSrt2.length);
   	
   }
   
     /**
	 * 	Update X360IsisAgreeNumSrt2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360IsisAgreeNumSrt2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360IsisAgreeNumSrt2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360IsisAgreeNumSrt2 with another Field
	 *	@param value
	 */
   public void setX360IsisAgreeNumSrt2(Field source) {
       replace(source,0,source.length(),beginX360IsisAgreeNumSrt2,X_360_ISIS_AGREE_NUM_SRT_2_LEN);
   	
   }  
   
     /**
	 * 	Update X360IsisAgreeNumSrt2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360IsisAgreeNumSrt2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360IsisAgreeNumSrt2,X_360_ISIS_AGREE_NUM_SRT_2_LEN);
   	
   }
   
     /**
	 * 	Update X360IsisAgreeNumSrt2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360IsisAgreeNumSrt2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360IsisAgreeNumSrt2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getX360InterType2SrtFieldLength() {
			return X_360_INTER_TYPE_2_SRT_LENGTH;
		}

}
  
