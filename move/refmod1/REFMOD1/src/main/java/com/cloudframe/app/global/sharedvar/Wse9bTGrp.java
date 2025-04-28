package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse9bTGrp extends Wse9bTGrpSerialized { 
   

						private char[] wseFiller011 = Field.fillLowValue(5);
				private Wse9bT wse9bT = new Wse9bT();
	
	/**
	* Constructor for Wse9bTGrp
	**/
    public Wse9bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse9bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse9bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller011
	 *	@return wseFiller011
	 */
   public char[] getWseFiller011() throws CFException{
     if (isWseFiller011Modified()) { 
        wseFiller011 = refreshWseFiller011();
     }
   		return wseFiller011;
   }

  
	/**
	*  set variable wseFiller011
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller011(char[] value) {
      wseFiller011 = checkWseFiller011Constraints(value);
      serializeWseFiller011(wseFiller011);
   } 

     /**
	 * 	Update WseFiller011 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller011(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller011,wseFiller011.length);
   	
   }
   
   public void setWseFiller011(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller011,wseFiller011.length);
   	
   }
   
     /**
	 * 	Update WseFiller011 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller011(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller011+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller011 with another Field
	 *	@param value
	 */
   public void setWseFiller011(Field source) {
       replace(source,0,source.length(),beginWseFiller011,WSE_FILLER_011_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller011 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller011(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller011,WSE_FILLER_011_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller011 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller011(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller011+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse9bT
	 *	@return wse9bT
	 */   
	 public Wse9bT getWse9bT() {
   	return wse9bT;
   }
   /**
	* 	Update Wse9bT with the passed value
	*   Corresponding COBOL Variable is WSE-9B-T
	*	@param value
	*/
   public void setWse9bT(char[] value) {
      wse9bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse9bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse9bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9bT.begin,wse9bT.length());
   }
   
     /**
	 * 	Update Wse9bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse9bT with another Field
	 *	@param value
	 */
   public void setWse9bT(Field source) {
   	replace(source,0,source.length(),wse9bT.begin,wse9bT.length());
   }  
   
     /**
	 * 	Update Wse9bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse9bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9bT.begin,wse9bT.length());
   }
   
     /**
	 * 	Update Wse9bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse9bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller011(CONSTANTS.SPACE_5);
          wse9bT.initialize();
     
   }

		public static int getWse9bTGrpFieldLength() {
			return WSE_9B_TGRP_LENGTH;
		}

}
  
