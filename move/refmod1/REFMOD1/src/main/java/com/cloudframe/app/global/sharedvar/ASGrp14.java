package com.cloudframe.app.global.sharedvar;

/**
*  The class ASGrp14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_aSGrp14")

public class ASGrp14 extends ASGrp14Serialized  implements InitializingBean {
   

						private char[] fillerWs024 = Field.fillLowValue(3);

						private char[] aS14 = Field.fillLowValue(70);
	
	/**
	* Constructor for ASGrp14
	**/
    public ASGrp14() {
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
	 *	Returns the value of fillerWs024
	 *	@return fillerWs024
	 */
   public char[] getFillerWs024() throws CFException{
     if (isFillerWs024Modified()) { 
        fillerWs024 = refreshFillerWs024();
     }
   		return fillerWs024;
   }

  
	/**
	*  set variable fillerWs024
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs024(char[] value) {
      fillerWs024 = checkFillerWs024Constraints(value);
      serializeFillerWs024(fillerWs024);
   } 

     /**
	 * 	Update FillerWs024 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs024(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs024,fillerWs024.length);
   	
   }
   
   public void setFillerWs024(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs024,fillerWs024.length);
   	
   }
   
     /**
	 * 	Update FillerWs024 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs024(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs024+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs024 with another Field
	 *	@param value
	 */
   public void setFillerWs024(Field source) {
       replace(source,0,source.length(),beginFillerWs024,FILLER_WS_024_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs024 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs024(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs024,FILLER_WS_024_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs024 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs024(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs024+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aS14
	 *	@return aS14
	 */
   public char[] getAS14() throws CFException{
     if (isAS14Modified()) { 
        aS14 = refreshAS14();
     }
   		return aS14;
   }

  
	/**
	*  set variable aS14
	*  Corresponding COBOL Variable is WS-14A-S
	*  @param value
	**/
   public void setAS14(char[] value) {
      aS14 = checkAS14Constraints(value);
      serializeAS14(aS14);
   } 

     /**
	 * 	Update AS14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAS14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAS14,aS14.length);
   	
   }
   
   public void setAS14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAS14,aS14.length);
   	
   }
   
     /**
	 * 	Update AS14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AS14 with another Field
	 *	@param value
	 */
   public void setAS14(Field source) {
       replace(source,0,source.length(),beginAS14,A_S_14_LEN);
   	
   }  
   
     /**
	 * 	Update AS14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAS14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAS14,A_S_14_LEN);
   	
   }
   
     /**
	 * 	Update AS14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS14+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes ASGrp14
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs024(CONSTANTS.SPACE_3);
         setAS14(CONSTANTS.SPACE_70);
   }

		public static int getASGrp14FieldLength() {
			return A_SGRP_14_LENGTH;
		}

}
  
