package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp17 extends BTGrp17Serialized { 
   

						private char[] fillerWs033 = Field.fillLowValue(5);
				private BT17 bT17 = new BT17();
	
	/**
	* Constructor for BTGrp17
	**/
    public BTGrp17() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp17. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp17(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT17.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs033
	 *	@return fillerWs033
	 */
   public char[] getFillerWs033() throws CFException{
     if (isFillerWs033Modified()) { 
        fillerWs033 = refreshFillerWs033();
     }
   		return fillerWs033;
   }

  
	/**
	*  set variable fillerWs033
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs033(char[] value) {
      fillerWs033 = checkFillerWs033Constraints(value);
      serializeFillerWs033(fillerWs033);
   } 

     /**
	 * 	Update FillerWs033 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs033(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs033,fillerWs033.length);
   	
   }
   
   public void setFillerWs033(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs033,fillerWs033.length);
   	
   }
   
     /**
	 * 	Update FillerWs033 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs033(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs033+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs033 with another Field
	 *	@param value
	 */
   public void setFillerWs033(Field source) {
       replace(source,0,source.length(),beginFillerWs033,FILLER_WS_033_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs033 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs033(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs033,FILLER_WS_033_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs033 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs033(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs033+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT17
	 *	@return bT17
	 */   
	 public BT17 getBT17() {
   	return bT17;
   }
   /**
	* 	Update BT17 with the passed value
	*   Corresponding COBOL Variable is WS-17B-T
	*	@param value
	*/
   public void setBT17(char[] value) {
      bT17.setString(value); 
   }   
    
     /**
	 * 	Update BT17 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT17(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT17.begin,bT17.length());
   }
   
     /**
	 * 	Update BT17 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT17.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT17 with another Field
	 *	@param value
	 */
   public void setBT17(Field source) {
   	replace(source,0,source.length(),bT17.begin,bT17.length());
   }  
   
     /**
	 * 	Update BT17 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT17(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT17.begin,bT17.length());
   }
   
     /**
	 * 	Update BT17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT17.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp17
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs033(CONSTANTS.SPACE_5);
          bT17.initialize();
     
   }

		public static int getBTGrp17FieldLength() {
			return B_TGRP_17_LENGTH;
		}

}
  
