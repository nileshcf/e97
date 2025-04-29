package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp7 extends BTGrp7Serialized { 
   

						private char[] fillerWs05 = Field.fillLowValue(5);
				private BT7 bT7 = new BT7();
	
	/**
	* Constructor for BTGrp7
	**/
    public BTGrp7() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp7. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp7(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT7.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs05
	 *	@return fillerWs05
	 */
   public char[] getFillerWs05() throws CFException{
     if (isFillerWs05Modified()) { 
        fillerWs05 = refreshFillerWs05();
     }
   		return fillerWs05;
   }

  
	/**
	*  set variable fillerWs05
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs05(char[] value) {
      fillerWs05 = checkFillerWs05Constraints(value);
      serializeFillerWs05(fillerWs05);
   } 

     /**
	 * 	Update FillerWs05 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs05(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs05,fillerWs05.length);
   	
   }
   
   public void setFillerWs05(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs05,fillerWs05.length);
   	
   }
   
     /**
	 * 	Update FillerWs05 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs05(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs05+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs05 with another Field
	 *	@param value
	 */
   public void setFillerWs05(Field source) {
       replace(source,0,source.length(),beginFillerWs05,FILLER_WS_05_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs05 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs05(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs05,FILLER_WS_05_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs05 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs05(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs05+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT7
	 *	@return bT7
	 */   
	 public BT7 getBT7() {
   	return bT7;
   }
   /**
	* 	Update BT7 with the passed value
	*   Corresponding COBOL Variable is WS-7B-T
	*	@param value
	*/
   public void setBT7(char[] value) {
      bT7.setString(value); 
   }   
    
     /**
	 * 	Update BT7 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT7(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT7.begin,bT7.length());
   }
   
     /**
	 * 	Update BT7 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT7.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT7 with another Field
	 *	@param value
	 */
   public void setBT7(Field source) {
   	replace(source,0,source.length(),bT7.begin,bT7.length());
   }  
   
     /**
	 * 	Update BT7 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT7(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT7.begin,bT7.length());
   }
   
     /**
	 * 	Update BT7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT7.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs05(CONSTANTS.SPACE_5);
          bT7.initialize();
     
   }

		public static int getBTGrp7FieldLength() {
			return B_TGRP_7_LENGTH;
		}

}
  
