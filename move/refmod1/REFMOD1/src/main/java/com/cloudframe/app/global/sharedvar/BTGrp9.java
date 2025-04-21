package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp9 extends BTGrp9Serialized { 
   

						private char[] fillerWs011 = Field.fillLowValue(5);
				private BT9 bT9 = new BT9();
	
	/**
	* Constructor for BTGrp9
	**/
    public BTGrp9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT9.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs011
	 *	@return fillerWs011
	 */
   public char[] getFillerWs011() throws CFException{
     if (isFillerWs011Modified()) { 
        fillerWs011 = refreshFillerWs011();
     }
   		return fillerWs011;
   }

  
	/**
	*  set variable fillerWs011
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs011(char[] value) {
      fillerWs011 = checkFillerWs011Constraints(value);
      serializeFillerWs011(fillerWs011);
   } 

     /**
	 * 	Update FillerWs011 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs011(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs011,fillerWs011.length);
   	
   }
   
   public void setFillerWs011(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs011,fillerWs011.length);
   	
   }
   
     /**
	 * 	Update FillerWs011 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs011(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs011+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs011 with another Field
	 *	@param value
	 */
   public void setFillerWs011(Field source) {
       replace(source,0,source.length(),beginFillerWs011,FILLER_WS_011_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs011 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs011(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs011,FILLER_WS_011_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs011 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs011(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs011+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT9
	 *	@return bT9
	 */   
	 public BT9 getBT9() {
   	return bT9;
   }
   /**
	* 	Update BT9 with the passed value
	*   Corresponding COBOL Variable is WS-9B-T
	*	@param value
	*/
   public void setBT9(char[] value) {
      bT9.setString(value); 
   }   
    
     /**
	 * 	Update BT9 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT9(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT9.begin,bT9.length());
   }
   
     /**
	 * 	Update BT9 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT9.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT9 with another Field
	 *	@param value
	 */
   public void setBT9(Field source) {
   	replace(source,0,source.length(),bT9.begin,bT9.length());
   }  
   
     /**
	 * 	Update BT9 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT9(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT9.begin,bT9.length());
   }
   
     /**
	 * 	Update BT9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT9.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs011(CONSTANTS.SPACE_5);
          bT9.initialize();
     
   }

		public static int getBTGrp9FieldLength() {
			return B_TGRP_9_LENGTH;
		}

}
  
