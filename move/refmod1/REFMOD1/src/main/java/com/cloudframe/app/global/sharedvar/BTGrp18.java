package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp18 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp18 extends BTGrp18Serialized { 
   

						private char[] fillerWs035 = Field.fillLowValue(5);
				private BT18 bT18 = new BT18();
	
	/**
	* Constructor for BTGrp18
	**/
    public BTGrp18() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp18. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp18(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT18.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs035
	 *	@return fillerWs035
	 */
   public char[] getFillerWs035() throws CFException{
     if (isFillerWs035Modified()) { 
        fillerWs035 = refreshFillerWs035();
     }
   		return fillerWs035;
   }

  
	/**
	*  set variable fillerWs035
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs035(char[] value) {
      fillerWs035 = checkFillerWs035Constraints(value);
      serializeFillerWs035(fillerWs035);
   } 

     /**
	 * 	Update FillerWs035 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs035(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs035,fillerWs035.length);
   	
   }
   
   public void setFillerWs035(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs035,fillerWs035.length);
   	
   }
   
     /**
	 * 	Update FillerWs035 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs035(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs035+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs035 with another Field
	 *	@param value
	 */
   public void setFillerWs035(Field source) {
       replace(source,0,source.length(),beginFillerWs035,FILLER_WS_035_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs035 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs035(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs035,FILLER_WS_035_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs035 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs035(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs035+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT18
	 *	@return bT18
	 */   
	 public BT18 getBT18() {
   	return bT18;
   }
   /**
	* 	Update BT18 with the passed value
	*   Corresponding COBOL Variable is WS-18B-T
	*	@param value
	*/
   public void setBT18(char[] value) {
      bT18.setString(value); 
   }   
    
     /**
	 * 	Update BT18 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT18(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT18.begin,bT18.length());
   }
   
     /**
	 * 	Update BT18 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT18.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT18 with another Field
	 *	@param value
	 */
   public void setBT18(Field source) {
   	replace(source,0,source.length(),bT18.begin,bT18.length());
   }  
   
     /**
	 * 	Update BT18 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT18(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT18.begin,bT18.length());
   }
   
     /**
	 * 	Update BT18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT18.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp18
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs035(CONSTANTS.SPACE_5);
          bT18.initialize();
     
   }

		public static int getBTGrp18FieldLength() {
			return B_TGRP_18_LENGTH;
		}

}
  
