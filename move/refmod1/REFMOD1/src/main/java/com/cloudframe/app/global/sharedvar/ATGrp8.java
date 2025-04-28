package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrp8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ATGrp8 extends ATGrp8Serialized { 
   

						private char[] fillerWs06 = Field.fillLowValue(5);
				private AT8 aT8 = new AT8();
	
	/**
	* Constructor for ATGrp8
	**/
    public ATGrp8() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ATGrp8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ATGrp8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			aT8.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs06
	 *	@return fillerWs06
	 */
   public char[] getFillerWs06() throws CFException{
     if (isFillerWs06Modified()) { 
        fillerWs06 = refreshFillerWs06();
     }
   		return fillerWs06;
   }

  
	/**
	*  set variable fillerWs06
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs06(char[] value) {
      fillerWs06 = checkFillerWs06Constraints(value);
      serializeFillerWs06(fillerWs06);
   } 

     /**
	 * 	Update FillerWs06 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs06(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs06,fillerWs06.length);
   	
   }
   
   public void setFillerWs06(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs06,fillerWs06.length);
   	
   }
   
     /**
	 * 	Update FillerWs06 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs06(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs06+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs06 with another Field
	 *	@param value
	 */
   public void setFillerWs06(Field source) {
       replace(source,0,source.length(),beginFillerWs06,FILLER_WS_06_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs06 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs06(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs06,FILLER_WS_06_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs06 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs06(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs06+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aT8
	 *	@return aT8
	 */   
	 public AT8 getAT8() {
   	return aT8;
   }
   /**
	* 	Update AT8 with the passed value
	*   Corresponding COBOL Variable is WS-8A-T
	*	@param value
	*/
   public void setAT8(char[] value) {
      aT8.setString(value); 
   }   
    
     /**
	 * 	Update AT8 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAT8(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT8.begin,aT8.length());
   }
   
     /**
	 * 	Update AT8 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAT8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT8.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AT8 with another Field
	 *	@param value
	 */
   public void setAT8(Field source) {
   	replace(source,0,source.length(),aT8.begin,aT8.length());
   }  
   
     /**
	 * 	Update AT8 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAT8(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aT8.begin,aT8.length());
   }
   
     /**
	 * 	Update AT8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAT8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aT8.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes ATGrp8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs06(CONSTANTS.SPACE_5);
          aT8.initialize();
     
   }

		public static int getATGrp8FieldLength() {
			return A_TGRP_8_LENGTH;
		}

}
  
