package com.cloudframe.app.global.sharedvar;

/**
*  The class BSGrp16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_bSGrp16")

public class BSGrp16 extends BSGrp16Serialized  implements InitializingBean {
   

						private char[] fillerWs031 = Field.fillLowValue(3);

						private char[] bS16 = Field.fillLowValue(70);
	
	/**
	* Constructor for BSGrp16
	**/
    public BSGrp16() {
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
	 *	Returns the value of fillerWs031
	 *	@return fillerWs031
	 */
   public char[] getFillerWs031() throws CFException{
     if (isFillerWs031Modified()) { 
        fillerWs031 = refreshFillerWs031();
     }
   		return fillerWs031;
   }

  
	/**
	*  set variable fillerWs031
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs031(char[] value) {
      fillerWs031 = checkFillerWs031Constraints(value);
      serializeFillerWs031(fillerWs031);
   } 

     /**
	 * 	Update FillerWs031 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs031(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs031,fillerWs031.length);
   	
   }
   
   public void setFillerWs031(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs031,fillerWs031.length);
   	
   }
   
     /**
	 * 	Update FillerWs031 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs031(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs031+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs031 with another Field
	 *	@param value
	 */
   public void setFillerWs031(Field source) {
       replace(source,0,source.length(),beginFillerWs031,FILLER_WS_031_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs031 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs031(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs031,FILLER_WS_031_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs031 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs031(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs031+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bS16
	 *	@return bS16
	 */
   public char[] getBS16() throws CFException{
     if (isBS16Modified()) { 
        bS16 = refreshBS16();
     }
   		return bS16;
   }

  
	/**
	*  set variable bS16
	*  Corresponding COBOL Variable is WS-16B-S
	*  @param value
	**/
   public void setBS16(char[] value) {
      bS16 = checkBS16Constraints(value);
      serializeBS16(bS16);
   } 

     /**
	 * 	Update BS16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBS16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBS16,bS16.length);
   	
   }
   
   public void setBS16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBS16,bS16.length);
   	
   }
   
     /**
	 * 	Update BS16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBS16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BS16 with another Field
	 *	@param value
	 */
   public void setBS16(Field source) {
       replace(source,0,source.length(),beginBS16,B_S_16_LEN);
   	
   }  
   
     /**
	 * 	Update BS16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBS16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBS16,B_S_16_LEN);
   	
   }
   
     /**
	 * 	Update BS16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBS16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBS16+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BSGrp16
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs031(CONSTANTS.SPACE_3);
         setBS16(CONSTANTS.SPACE_70);
   }

		public static int getBSGrp16FieldLength() {
			return B_SGRP_16_LENGTH;
		}

}
  
