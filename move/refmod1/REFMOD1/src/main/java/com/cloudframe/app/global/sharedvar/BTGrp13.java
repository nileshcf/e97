package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp13 extends BTGrp13Serialized { 
   

						private char[] fillerWs023 = Field.fillLowValue(5);
				private BT13 bT13 = new BT13();
	
	/**
	* Constructor for BTGrp13
	**/
    public BTGrp13() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT13.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs023
	 *	@return fillerWs023
	 */
   public char[] getFillerWs023() throws CFException{
     if (isFillerWs023Modified()) { 
        fillerWs023 = refreshFillerWs023();
     }
   		return fillerWs023;
   }

  
	/**
	*  set variable fillerWs023
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs023(char[] value) {
      fillerWs023 = checkFillerWs023Constraints(value);
      serializeFillerWs023(fillerWs023);
   } 

     /**
	 * 	Update FillerWs023 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs023(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs023,fillerWs023.length);
   	
   }
   
   public void setFillerWs023(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs023,fillerWs023.length);
   	
   }
   
     /**
	 * 	Update FillerWs023 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs023(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs023+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs023 with another Field
	 *	@param value
	 */
   public void setFillerWs023(Field source) {
       replace(source,0,source.length(),beginFillerWs023,FILLER_WS_023_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs023 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs023(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs023,FILLER_WS_023_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs023 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs023(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs023+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT13
	 *	@return bT13
	 */   
	 public BT13 getBT13() {
   	return bT13;
   }
   /**
	* 	Update BT13 with the passed value
	*   Corresponding COBOL Variable is WS-13B-T
	*	@param value
	*/
   public void setBT13(char[] value) {
      bT13.setString(value); 
   }   
    
     /**
	 * 	Update BT13 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT13(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT13.begin,bT13.length());
   }
   
     /**
	 * 	Update BT13 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT13.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT13 with another Field
	 *	@param value
	 */
   public void setBT13(Field source) {
   	replace(source,0,source.length(),bT13.begin,bT13.length());
   }  
   
     /**
	 * 	Update BT13 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT13(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT13.begin,bT13.length());
   }
   
     /**
	 * 	Update BT13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT13.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs023(CONSTANTS.SPACE_5);
          bT13.initialize();
     
   }

		public static int getBTGrp13FieldLength() {
			return B_TGRP_13_LENGTH;
		}

}
  
