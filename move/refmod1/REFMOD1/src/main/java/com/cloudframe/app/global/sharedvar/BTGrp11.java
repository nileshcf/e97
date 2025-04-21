package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp11 extends BTGrp11Serialized { 
   

						private char[] fillerWs017 = Field.fillLowValue(5);
				private BT11 bT11 = new BT11();
	
	/**
	* Constructor for BTGrp11
	**/
    public BTGrp11() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp11. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp11(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT11.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs017
	 *	@return fillerWs017
	 */
   public char[] getFillerWs017() throws CFException{
     if (isFillerWs017Modified()) { 
        fillerWs017 = refreshFillerWs017();
     }
   		return fillerWs017;
   }

  
	/**
	*  set variable fillerWs017
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs017(char[] value) {
      fillerWs017 = checkFillerWs017Constraints(value);
      serializeFillerWs017(fillerWs017);
   } 

     /**
	 * 	Update FillerWs017 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs017(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs017,fillerWs017.length);
   	
   }
   
   public void setFillerWs017(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs017,fillerWs017.length);
   	
   }
   
     /**
	 * 	Update FillerWs017 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs017(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs017+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs017 with another Field
	 *	@param value
	 */
   public void setFillerWs017(Field source) {
       replace(source,0,source.length(),beginFillerWs017,FILLER_WS_017_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs017 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs017(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs017,FILLER_WS_017_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs017 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs017(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs017+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT11
	 *	@return bT11
	 */   
	 public BT11 getBT11() {
   	return bT11;
   }
   /**
	* 	Update BT11 with the passed value
	*   Corresponding COBOL Variable is WS-11B-T
	*	@param value
	*/
   public void setBT11(char[] value) {
      bT11.setString(value); 
   }   
    
     /**
	 * 	Update BT11 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT11(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT11.begin,bT11.length());
   }
   
     /**
	 * 	Update BT11 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT11.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT11 with another Field
	 *	@param value
	 */
   public void setBT11(Field source) {
   	replace(source,0,source.length(),bT11.begin,bT11.length());
   }  
   
     /**
	 * 	Update BT11 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT11(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT11.begin,bT11.length());
   }
   
     /**
	 * 	Update BT11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT11.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp11
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs017(CONSTANTS.SPACE_5);
          bT11.initialize();
     
   }

		public static int getBTGrp11FieldLength() {
			return B_TGRP_11_LENGTH;
		}

}
  
