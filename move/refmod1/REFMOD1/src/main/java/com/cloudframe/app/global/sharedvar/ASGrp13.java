package com.cloudframe.app.global.sharedvar;

/**
*  The class ASGrp13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_aSGrp13")

public class ASGrp13 extends ASGrp13Serialized  implements InitializingBean {
   

						private char[] fillerWs020 = Field.fillLowValue(3);
				private AS13 aS13 = new AS13();
	
	/**
	* Constructor for ASGrp13
	**/
    public ASGrp13() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aS13.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of fillerWs020
	 *	@return fillerWs020
	 */
   public char[] getFillerWs020() throws CFException{
     if (isFillerWs020Modified()) { 
        fillerWs020 = refreshFillerWs020();
     }
   		return fillerWs020;
   }

  
	/**
	*  set variable fillerWs020
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs020(char[] value) {
      fillerWs020 = checkFillerWs020Constraints(value);
      serializeFillerWs020(fillerWs020);
   } 

     /**
	 * 	Update FillerWs020 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs020(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs020,fillerWs020.length);
   	
   }
   
   public void setFillerWs020(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs020,fillerWs020.length);
   	
   }
   
     /**
	 * 	Update FillerWs020 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs020(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs020+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs020 with another Field
	 *	@param value
	 */
   public void setFillerWs020(Field source) {
       replace(source,0,source.length(),beginFillerWs020,FILLER_WS_020_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs020 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs020(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs020,FILLER_WS_020_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs020 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs020(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs020+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aS13
	 *	@return aS13
	 */   
	 public AS13 getAS13() {
   	return aS13;
   }
   /**
	* 	Update AS13 with the passed value
	*   Corresponding COBOL Variable is WS-13A-S
	*	@param value
	*/
   public void setAS13(char[] value) {
      aS13.setString(value); 
   }   
    
     /**
	 * 	Update AS13 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAS13(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS13.begin,aS13.length());
   }
   
     /**
	 * 	Update AS13 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAS13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS13.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AS13 with another Field
	 *	@param value
	 */
   public void setAS13(Field source) {
   	replace(source,0,source.length(),aS13.begin,aS13.length());
   }  
   
     /**
	 * 	Update AS13 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAS13(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aS13.begin,aS13.length());
   }
   
     /**
	 * 	Update AS13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAS13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aS13.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ASGrp13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs020(CONSTANTS.SPACE_3);
          aS13.initialize();
     
   }

		public static int getASGrp13FieldLength() {
			return A_SGRP_13_LENGTH;
		}

}
  
