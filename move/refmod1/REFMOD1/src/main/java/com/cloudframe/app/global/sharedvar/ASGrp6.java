package com.cloudframe.app.global.sharedvar;

/**
*  The class ASGrp6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_aSGrp6")

public class ASGrp6 extends ASGrp6Serialized  implements InitializingBean {
   

						private char[] fillerWs02 = Field.fillLowValue(3);

						private char[] aS6 = Field.fillLowValue(70);
	
	/**
	* Constructor for ASGrp6
	**/
    public ASGrp6() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of fillerWs02
	 *	@return fillerWs02
	 */
   public char[] getFillerWs02() throws CFException{
     if (isFillerWs02Modified()) { 
        fillerWs02 = refreshFillerWs02();
     }
   		return fillerWs02;
   }

  
	/**
	*  set variable fillerWs02
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs02(char[] value) {
      fillerWs02 = checkFillerWs02Constraints(value);
      serializeFillerWs02(fillerWs02);
   } 

     /**
	 * 	Update FillerWs02 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs02(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs02,fillerWs02.length);
   	
   }
   
   public void setFillerWs02(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs02,fillerWs02.length);
   	
   }
   
     /**
	 * 	Update FillerWs02 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs02+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs02 with another Field
	 *	@param value
	 */
   public void setFillerWs02(Field source) {
       replace(source,0,source.length(),beginFillerWs02,FILLER_WS_02_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs02 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs02(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs02,FILLER_WS_02_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs02+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aS6
	 *	@return aS6
	 */
   public char[] getAS6() throws CFException{
     if (isAS6Modified()) { 
        aS6 = refreshAS6();
     }
   		return aS6;
   }

  
	/**
	*  set variable aS6
	*  Corresponding COBOL Variable is WS-6A-S
	*  @param value
	**/
   public void setAS6(char[] value) {
      aS6 = checkAS6Constraints(value);
      serializeAS6(aS6);
   } 

     /**
	 * 	Update AS6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAS6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAS6,aS6.length);
   	
   }
   
   public void setAS6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAS6,aS6.length);
   	
   }
   
     /**
	 * 	Update AS6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AS6 with another Field
	 *	@param value
	 */
   public void setAS6(Field source) {
       replace(source,0,source.length(),beginAS6,A_S_6_LEN);
   	
   }  
   
     /**
	 * 	Update AS6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAS6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAS6,A_S_6_LEN);
   	
   }
   
     /**
	 * 	Update AS6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS6+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes ASGrp6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs02(CONSTANTS.SPACE_3);
         setAS6(CONSTANTS.SPACE_70);
   }

		public static int getASGrp6FieldLength() {
			return A_SGRP_6_LENGTH;
		}

}
  
