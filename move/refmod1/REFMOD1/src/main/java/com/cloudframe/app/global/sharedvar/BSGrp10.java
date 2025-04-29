package com.cloudframe.app.global.sharedvar;

/**
*  The class BSGrp10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_bSGrp10")

public class BSGrp10 extends BSGrp10Serialized  implements InitializingBean {
   

						private char[] fillerWs014 = Field.fillLowValue(3);

						private char[] bS10 = Field.fillLowValue(70);
	
	/**
	* Constructor for BSGrp10
	**/
    public BSGrp10() {
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
	 *	Returns the value of fillerWs014
	 *	@return fillerWs014
	 */
   public char[] getFillerWs014() throws CFException{
     if (isFillerWs014Modified()) { 
        fillerWs014 = refreshFillerWs014();
     }
   		return fillerWs014;
   }

  
	/**
	*  set variable fillerWs014
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs014(char[] value) {
      fillerWs014 = checkFillerWs014Constraints(value);
      serializeFillerWs014(fillerWs014);
   } 

     /**
	 * 	Update FillerWs014 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs014(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs014,fillerWs014.length);
   	
   }
   
   public void setFillerWs014(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs014,fillerWs014.length);
   	
   }
   
     /**
	 * 	Update FillerWs014 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs014(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs014+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs014 with another Field
	 *	@param value
	 */
   public void setFillerWs014(Field source) {
       replace(source,0,source.length(),beginFillerWs014,FILLER_WS_014_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs014 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs014(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs014,FILLER_WS_014_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs014 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs014(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs014+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bS10
	 *	@return bS10
	 */
   public char[] getBS10() throws CFException{
     if (isBS10Modified()) { 
        bS10 = refreshBS10();
     }
   		return bS10;
   }

  
	/**
	*  set variable bS10
	*  Corresponding COBOL Variable is WS-10B-S
	*  @param value
	**/
   public void setBS10(char[] value) {
      bS10 = checkBS10Constraints(value);
      serializeBS10(bS10);
   } 

     /**
	 * 	Update BS10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBS10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBS10,bS10.length);
   	
   }
   
   public void setBS10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBS10,bS10.length);
   	
   }
   
     /**
	 * 	Update BS10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BS10 with another Field
	 *	@param value
	 */
   public void setBS10(Field source) {
       replace(source,0,source.length(),beginBS10,B_S_10_LEN);
   	
   }  
   
     /**
	 * 	Update BS10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBS10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBS10,B_S_10_LEN);
   	
   }
   
     /**
	 * 	Update BS10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS10+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BSGrp10
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs014(CONSTANTS.SPACE_3);
         setBS10(CONSTANTS.SPACE_70);
   }

		public static int getBSGrp10FieldLength() {
			return B_SGRP_10_LENGTH;
		}

}
  
