package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp12 extends BTGrp12Serialized { 
   

						private char[] fillerWs019 = Field.fillLowValue(5);
				private BT12 bT12 = new BT12();
	
	/**
	* Constructor for BTGrp12
	**/
    public BTGrp12() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp12. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp12(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT12.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs019
	 *	@return fillerWs019
	 */
   public char[] getFillerWs019() throws CFException{
     if (isFillerWs019Modified()) { 
        fillerWs019 = refreshFillerWs019();
     }
   		return fillerWs019;
   }

  
	/**
	*  set variable fillerWs019
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs019(char[] value) {
      fillerWs019 = checkFillerWs019Constraints(value);
      serializeFillerWs019(fillerWs019);
   } 

     /**
	 * 	Update FillerWs019 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs019(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs019,fillerWs019.length);
   	
   }
   
   public void setFillerWs019(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs019,fillerWs019.length);
   	
   }
   
     /**
	 * 	Update FillerWs019 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs019(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs019+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs019 with another Field
	 *	@param value
	 */
   public void setFillerWs019(Field source) {
       replace(source,0,source.length(),beginFillerWs019,FILLER_WS_019_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs019 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs019(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs019,FILLER_WS_019_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs019 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs019(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs019+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT12
	 *	@return bT12
	 */   
	 public BT12 getBT12() {
   	return bT12;
   }
   /**
	* 	Update BT12 with the passed value
	*   Corresponding COBOL Variable is WS-12B-T
	*	@param value
	*/
   public void setBT12(char[] value) {
      bT12.setString(value); 
   }   
    
     /**
	 * 	Update BT12 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT12(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT12.begin,bT12.length());
   }
   
     /**
	 * 	Update BT12 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT12.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT12 with another Field
	 *	@param value
	 */
   public void setBT12(Field source) {
   	replace(source,0,source.length(),bT12.begin,bT12.length());
   }  
   
     /**
	 * 	Update BT12 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT12(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT12.begin,bT12.length());
   }
   
     /**
	 * 	Update BT12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT12.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp12
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs019(CONSTANTS.SPACE_5);
          bT12.initialize();
     
   }

		public static int getBTGrp12FieldLength() {
			return B_TGRP_12_LENGTH;
		}

}
  
