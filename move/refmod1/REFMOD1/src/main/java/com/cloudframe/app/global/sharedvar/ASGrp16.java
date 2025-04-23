package com.cloudframe.app.global.sharedvar;

/**
*  The class ASGrp16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_aSGrp16")

public class ASGrp16 extends ASGrp16Serialized  implements InitializingBean {
   

						private char[] fillerWs030 = Field.fillLowValue(3);

						private char[] aS16 = Field.fillLowValue(70);
	
	/**
	* Constructor for ASGrp16
	**/
    public ASGrp16() {
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
	 *	Returns the value of fillerWs030
	 *	@return fillerWs030
	 */
   public char[] getFillerWs030() throws CFException{
     if (isFillerWs030Modified()) { 
        fillerWs030 = refreshFillerWs030();
     }
   		return fillerWs030;
   }

  
	/**
	*  set variable fillerWs030
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs030(char[] value) {
      fillerWs030 = checkFillerWs030Constraints(value);
      serializeFillerWs030(fillerWs030);
   } 

     /**
	 * 	Update FillerWs030 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs030(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs030,fillerWs030.length);
   	
   }
   
   public void setFillerWs030(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs030,fillerWs030.length);
   	
   }
   
     /**
	 * 	Update FillerWs030 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs030(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs030+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs030 with another Field
	 *	@param value
	 */
   public void setFillerWs030(Field source) {
       replace(source,0,source.length(),beginFillerWs030,FILLER_WS_030_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs030 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs030(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs030,FILLER_WS_030_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs030 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs030(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs030+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aS16
	 *	@return aS16
	 */
   public char[] getAS16() throws CFException{
     if (isAS16Modified()) { 
        aS16 = refreshAS16();
     }
   		return aS16;
   }

  
	/**
	*  set variable aS16
	*  Corresponding COBOL Variable is WS-16A-S
	*  @param value
	**/
   public void setAS16(char[] value) {
      aS16 = checkAS16Constraints(value);
      serializeAS16(aS16);
   } 

     /**
	 * 	Update AS16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAS16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAS16,aS16.length);
   	
   }
   
   public void setAS16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAS16,aS16.length);
   	
   }
   
     /**
	 * 	Update AS16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AS16 with another Field
	 *	@param value
	 */
   public void setAS16(Field source) {
       replace(source,0,source.length(),beginAS16,A_S_16_LEN);
   	
   }  
   
     /**
	 * 	Update AS16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAS16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAS16,A_S_16_LEN);
   	
   }
   
     /**
	 * 	Update AS16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAS16+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes ASGrp16
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs030(CONSTANTS.SPACE_3);
         setAS16(CONSTANTS.SPACE_70);
   }

		public static int getASGrp16FieldLength() {
			return A_SGRP_16_LENGTH;
		}

}
  
