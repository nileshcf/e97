package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp10 extends BTGrp10Serialized { 
   

						private char[] fillerWs015 = Field.fillLowValue(5);
				private BT10 bT10 = new BT10();
	
	/**
	* Constructor for BTGrp10
	**/
    public BTGrp10() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp10. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp10(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT10.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs015
	 *	@return fillerWs015
	 */
   public char[] getFillerWs015() throws CFException{
     if (isFillerWs015Modified()) { 
        fillerWs015 = refreshFillerWs015();
     }
   		return fillerWs015;
   }

  
	/**
	*  set variable fillerWs015
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs015(char[] value) {
      fillerWs015 = checkFillerWs015Constraints(value);
      serializeFillerWs015(fillerWs015);
   } 

     /**
	 * 	Update FillerWs015 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs015(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs015,fillerWs015.length);
   	
   }
   
   public void setFillerWs015(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs015,fillerWs015.length);
   	
   }
   
     /**
	 * 	Update FillerWs015 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs015(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs015+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs015 with another Field
	 *	@param value
	 */
   public void setFillerWs015(Field source) {
       replace(source,0,source.length(),beginFillerWs015,FILLER_WS_015_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs015 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs015(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs015,FILLER_WS_015_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs015 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs015(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs015+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT10
	 *	@return bT10
	 */   
	 public BT10 getBT10() {
   	return bT10;
   }
   /**
	* 	Update BT10 with the passed value
	*   Corresponding COBOL Variable is WS-10B-T
	*	@param value
	*/
   public void setBT10(char[] value) {
      bT10.setString(value); 
   }   
    
     /**
	 * 	Update BT10 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT10(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT10.begin,bT10.length());
   }
   
     /**
	 * 	Update BT10 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT10.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT10 with another Field
	 *	@param value
	 */
   public void setBT10(Field source) {
   	replace(source,0,source.length(),bT10.begin,bT10.length());
   }  
   
     /**
	 * 	Update BT10 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT10(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT10.begin,bT10.length());
   }
   
     /**
	 * 	Update BT10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT10.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp10
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs015(CONSTANTS.SPACE_5);
          bT10.initialize();
     
   }

		public static int getBTGrp10FieldLength() {
			return B_TGRP_10_LENGTH;
		}

}
  
