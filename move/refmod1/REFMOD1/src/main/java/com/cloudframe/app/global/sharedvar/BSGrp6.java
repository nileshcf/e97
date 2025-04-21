package com.cloudframe.app.global.sharedvar;

/**
*  The class BSGrp6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_bSGrp6")

public class BSGrp6 extends BSGrp6Serialized  implements InitializingBean {
   

						private char[] fillerWs03 = Field.fillLowValue(3);

						private char[] bS6 = Field.fillLowValue(70);
	
	/**
	* Constructor for BSGrp6
	**/
    public BSGrp6() {
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
	 *	Returns the value of fillerWs03
	 *	@return fillerWs03
	 */
   public char[] getFillerWs03() throws CFException{
     if (isFillerWs03Modified()) { 
        fillerWs03 = refreshFillerWs03();
     }
   		return fillerWs03;
   }

  
	/**
	*  set variable fillerWs03
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs03(char[] value) {
      fillerWs03 = checkFillerWs03Constraints(value);
      serializeFillerWs03(fillerWs03);
   } 

     /**
	 * 	Update FillerWs03 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs03(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs03,fillerWs03.length);
   	
   }
   
   public void setFillerWs03(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs03,fillerWs03.length);
   	
   }
   
     /**
	 * 	Update FillerWs03 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs03(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs03+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs03 with another Field
	 *	@param value
	 */
   public void setFillerWs03(Field source) {
       replace(source,0,source.length(),beginFillerWs03,FILLER_WS_03_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs03 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs03(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs03,FILLER_WS_03_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs03 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs03(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs03+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bS6
	 *	@return bS6
	 */
   public char[] getBS6() throws CFException{
     if (isBS6Modified()) { 
        bS6 = refreshBS6();
     }
   		return bS6;
   }

  
	/**
	*  set variable bS6
	*  Corresponding COBOL Variable is WS-6B-S
	*  @param value
	**/
   public void setBS6(char[] value) {
      bS6 = checkBS6Constraints(value);
      serializeBS6(bS6);
   } 

     /**
	 * 	Update BS6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBS6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBS6,bS6.length);
   	
   }
   
   public void setBS6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBS6,bS6.length);
   	
   }
   
     /**
	 * 	Update BS6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BS6 with another Field
	 *	@param value
	 */
   public void setBS6(Field source) {
       replace(source,0,source.length(),beginBS6,B_S_6_LEN);
   	
   }  
   
     /**
	 * 	Update BS6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBS6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBS6,B_S_6_LEN);
   	
   }
   
     /**
	 * 	Update BS6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS6+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BSGrp6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs03(CONSTANTS.SPACE_3);
         setBS6(CONSTANTS.SPACE_70);
   }

		public static int getBSGrp6FieldLength() {
			return B_SGRP_6_LENGTH;
		}

}
  
