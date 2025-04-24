package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrp19 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BTGrp19 extends BTGrp19Serialized { 
   

						private char[] fillerWs037 = Field.fillLowValue(5);
				private BT19 bT19 = new BT19();
	
	/**
	* Constructor for BTGrp19
	**/
    public BTGrp19() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BTGrp19. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BTGrp19(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bT19.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of fillerWs037
	 *	@return fillerWs037
	 */
   public char[] getFillerWs037() throws CFException{
     if (isFillerWs037Modified()) { 
        fillerWs037 = refreshFillerWs037();
     }
   		return fillerWs037;
   }

  
	/**
	*  set variable fillerWs037
	*  Corresponding COBOL Variable is WS-FILLER
	*  @param value
	**/
   public void setFillerWs037(char[] value) {
      fillerWs037 = checkFillerWs037Constraints(value);
      serializeFillerWs037(fillerWs037);
   } 

     /**
	 * 	Update FillerWs037 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFillerWs037(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFillerWs037,fillerWs037.length);
   	
   }
   
   public void setFillerWs037(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs037,fillerWs037.length);
   	
   }
   
     /**
	 * 	Update FillerWs037 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs037(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs037+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FillerWs037 with another Field
	 *	@param value
	 */
   public void setFillerWs037(Field source) {
       replace(source,0,source.length(),beginFillerWs037,FILLER_WS_037_LEN);
   	
   }  
   
     /**
	 * 	Update FillerWs037 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFillerWs037(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFillerWs037,FILLER_WS_037_LEN);
   	
   }
   
     /**
	 * 	Update FillerWs037 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFillerWs037(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFillerWs037+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bT19
	 *	@return bT19
	 */   
	 public BT19 getBT19() {
   	return bT19;
   }
   /**
	* 	Update BT19 with the passed value
	*   Corresponding COBOL Variable is WS-19B-T
	*	@param value
	*/
   public void setBT19(char[] value) {
      bT19.setString(value); 
   }   
    
     /**
	 * 	Update BT19 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBT19(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT19.begin,bT19.length());
   }
   
     /**
	 * 	Update BT19 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBT19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT19.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BT19 with another Field
	 *	@param value
	 */
   public void setBT19(Field source) {
   	replace(source,0,source.length(),bT19.begin,bT19.length());
   }  
   
     /**
	 * 	Update BT19 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBT19(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bT19.begin,bT19.length());
   }
   
     /**
	 * 	Update BT19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBT19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bT19.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes BTGrp19
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFillerWs037(CONSTANTS.SPACE_5);
          bT19.initialize();
     
   }

		public static int getBTGrp19FieldLength() {
			return B_TGRP_19_LENGTH;
		}

}
  
