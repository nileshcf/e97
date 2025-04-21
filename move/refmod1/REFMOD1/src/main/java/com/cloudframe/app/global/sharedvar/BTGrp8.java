package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp8 extends BTGrp8Serialized { 
   

						private char[] fillerWs07 = Field.fillLowValue(5);
				private BT8 bT8 = new BT8();
	
	/**
	* Constructor for BTGrp8
	**/
    public BTGrp8() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT8.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs07
	 *	@return fillerWs07
	 */
   public char[] getFillerWs07() throws CFException{
     if (isFillerWs07Modified()) { 
        fillerWs07 = refreshFillerWs07();
     }
   		return fillerWs07;
   }

  
	/**
	*  set variable fillerWs07
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs07(char[] value) {
      fillerWs07 = checkFillerWs07Constraints(value);
      serializeFillerWs07(fillerWs07);
   } 

     /**
	 * 	Update FillerWs07 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs07(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs07,fillerWs07.length);
   	
   }
   
   public void setFillerWs07(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs07,fillerWs07.length);
   	
   }
   
     /**
	 * 	Update FillerWs07 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs07(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs07+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs07 with another Field
	 *	@param value
	 */
   public void setFillerWs07(Field source) {
       replace(source,0,source.length(),beginFillerWs07,FILLER_WS_07_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs07 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs07(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs07,FILLER_WS_07_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs07 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs07(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs07+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT8
	 *	@return bT8
	 */   
	 public BT8 getBT8() {
   	return bT8;
   }
   /**
	* 	Update BT8 with the passed value
	*   Corresponding COBOL Variable is WS-8B-T
	*	@param value
	*/
   public void setBT8(char[] value) {
      bT8.setString(value); 
   }   
    
     /**
	 * 	Update BT8 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT8(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT8.begin,bT8.length());
   }
   
     /**
	 * 	Update BT8 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT8.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT8 with another Field
	 *	@param value
	 */
   public void setBT8(Field source) {
   	replace(source,0,source.length(),bT8.begin,bT8.length());
   }  
   
     /**
	 * 	Update BT8 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT8(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT8.begin,bT8.length());
   }
   
     /**
	 * 	Update BT8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT8.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs07(CONSTANTS.SPACE_5);
          bT8.initialize();
     
   }

		public static int getBTGrp8FieldLength() {
			return B_TGRP_8_LENGTH;
		}

}
  
