package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp20 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp20 extends BTGrp20Serialized { 
   

						private char[] fillerWs039 = Field.fillLowValue(5);
				private BT20 bT20 = new BT20();
	
	/**
	* Constructor for BTGrp20
	**/
    public BTGrp20() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp20. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp20(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT20.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs039
	 *	@return fillerWs039
	 */
   public char[] getFillerWs039() throws CFException{
     if (isFillerWs039Modified()) { 
        fillerWs039 = refreshFillerWs039();
     }
   		return fillerWs039;
   }

  
	/**
	*  set variable fillerWs039
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs039(char[] value) {
      fillerWs039 = checkFillerWs039Constraints(value);
      serializeFillerWs039(fillerWs039);
   } 

     /**
	 * 	Update FillerWs039 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs039(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs039,fillerWs039.length);
   	
   }
   
   public void setFillerWs039(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs039,fillerWs039.length);
   	
   }
   
     /**
	 * 	Update FillerWs039 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs039(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs039+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs039 with another Field
	 *	@param value
	 */
   public void setFillerWs039(Field source) {
       replace(source,0,source.length(),beginFillerWs039,FILLER_WS_039_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs039 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs039(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs039,FILLER_WS_039_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs039 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs039(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs039+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT20
	 *	@return bT20
	 */   
	 public BT20 getBT20() {
   	return bT20;
   }
   /**
	* 	Update BT20 with the passed value
	*   Corresponding COBOL Variable is WS-20B-T
	*	@param value
	*/
   public void setBT20(char[] value) {
      bT20.setString(value); 
   }   
    
     /**
	 * 	Update BT20 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT20(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT20.begin,bT20.length());
   }
   
     /**
	 * 	Update BT20 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT20.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT20 with another Field
	 *	@param value
	 */
   public void setBT20(Field source) {
   	replace(source,0,source.length(),bT20.begin,bT20.length());
   }  
   
     /**
	 * 	Update BT20 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT20(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT20.begin,bT20.length());
   }
   
     /**
	 * 	Update BT20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT20.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp20
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs039(CONSTANTS.SPACE_5);
          bT20.initialize();
     
   }

		public static int getBTGrp20FieldLength() {
			return B_TGRP_20_LENGTH;
		}

}
  
