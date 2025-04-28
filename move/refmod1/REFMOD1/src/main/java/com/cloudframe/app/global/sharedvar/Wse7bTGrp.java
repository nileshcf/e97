package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse7bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse7bTGrp extends Wse7bTGrpSerialized { 
   

						private char[] wseFiller05 = Field.fillLowValue(5);
				private Wse7bT wse7bT = new Wse7bT();
	
	/**
	* Constructor for Wse7bTGrp
	**/
    public Wse7bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse7bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse7bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse7bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller05
	 *	@return wseFiller05
	 */
   public char[] getWseFiller05() throws CFException{
     if (isWseFiller05Modified()) { 
        wseFiller05 = refreshWseFiller05();
     }
   		return wseFiller05;
   }

  
	/**
	*  set variable wseFiller05
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller05(char[] value) {
      wseFiller05 = checkWseFiller05Constraints(value);
      serializeWseFiller05(wseFiller05);
   } 

     /**
	 * 	Update WseFiller05 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller05(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller05,wseFiller05.length);
   	
   }
   
   public void setWseFiller05(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller05,wseFiller05.length);
   	
   }
   
     /**
	 * 	Update WseFiller05 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller05(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller05+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller05 with another Field
	 *	@param value
	 */
   public void setWseFiller05(Field source) {
       replace(source,0,source.length(),beginWseFiller05,WSE_FILLER_05_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller05 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller05(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller05,WSE_FILLER_05_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller05 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller05(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller05+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse7bT
	 *	@return wse7bT
	 */   
	 public Wse7bT getWse7bT() {
   	return wse7bT;
   }
   /**
	* 	Update Wse7bT with the passed value
	*   Corresponding COBOL Variable is WSE-7B-T
	*	@param value
	*/
   public void setWse7bT(char[] value) {
      wse7bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse7bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse7bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse7bT.begin,wse7bT.length());
   }
   
     /**
	 * 	Update Wse7bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse7bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse7bT with another Field
	 *	@param value
	 */
   public void setWse7bT(Field source) {
   	replace(source,0,source.length(),wse7bT.begin,wse7bT.length());
   }  
   
     /**
	 * 	Update Wse7bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse7bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse7bT.begin,wse7bT.length());
   }
   
     /**
	 * 	Update Wse7bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse7bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse7bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller05(CONSTANTS.SPACE_5);
          wse7bT.initialize();
     
   }

		public static int getWse7bTGrpFieldLength() {
			return WSE_7B_TGRP_LENGTH;
		}

}
  
