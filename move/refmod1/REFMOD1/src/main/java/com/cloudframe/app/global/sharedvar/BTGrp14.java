package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp14 extends BTGrp14Serialized { 
   

						private char[] fillerWs027 = Field.fillLowValue(5);
				private BT14 bT14 = new BT14();
	
	/**
	* Constructor for BTGrp14
	**/
    public BTGrp14() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp14. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp14(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT14.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs027
	 *	@return fillerWs027
	 */
   public char[] getFillerWs027() throws CFException{
     if (isFillerWs027Modified()) { 
        fillerWs027 = refreshFillerWs027();
     }
   		return fillerWs027;
   }

  
	/**
	*  set variable fillerWs027
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs027(char[] value) {
      fillerWs027 = checkFillerWs027Constraints(value);
      serializeFillerWs027(fillerWs027);
   } 

     /**
	 * 	Update FillerWs027 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs027(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs027,fillerWs027.length);
   	
   }
   
   public void setFillerWs027(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs027,fillerWs027.length);
   	
   }
   
     /**
	 * 	Update FillerWs027 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs027(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs027+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs027 with another Field
	 *	@param value
	 */
   public void setFillerWs027(Field source) {
       replace(source,0,source.length(),beginFillerWs027,FILLER_WS_027_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs027 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs027(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs027,FILLER_WS_027_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs027 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs027(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs027+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT14
	 *	@return bT14
	 */   
	 public BT14 getBT14() {
   	return bT14;
   }
   /**
	* 	Update BT14 with the passed value
	*   Corresponding COBOL Variable is WS-14B-T
	*	@param value
	*/
   public void setBT14(char[] value) {
      bT14.setString(value); 
   }   
    
     /**
	 * 	Update BT14 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT14(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT14.begin,bT14.length());
   }
   
     /**
	 * 	Update BT14 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT14.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT14 with another Field
	 *	@param value
	 */
   public void setBT14(Field source) {
   	replace(source,0,source.length(),bT14.begin,bT14.length());
   }  
   
     /**
	 * 	Update BT14 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT14(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT14.begin,bT14.length());
   }
   
     /**
	 * 	Update BT14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT14.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp14
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs027(CONSTANTS.SPACE_5);
          bT14.initialize();
     
   }

		public static int getBTGrp14FieldLength() {
			return B_TGRP_14_LENGTH;
		}

}
  
