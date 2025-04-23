package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse8bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse8bTGrp extends Wse8bTGrpSerialized { 
   

						private char[] wseFiller07 = Field.fillLowValue(5);
				private Wse8bT wse8bT = new Wse8bT();
	
	/**
	* Constructor for Wse8bTGrp
	**/
    public Wse8bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse8bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse8bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse8bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller07
	 *	@return wseFiller07
	 */
   public char[] getWseFiller07() throws CFException{
     if (isWseFiller07Modified()) { 
        wseFiller07 = refreshWseFiller07();
     }
   		return wseFiller07;
   }

  
	/**
	*  set variable wseFiller07
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller07(char[] value) {
      wseFiller07 = checkWseFiller07Constraints(value);
      serializeWseFiller07(wseFiller07);
   } 

     /**
	 * 	Update WseFiller07 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller07(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller07,wseFiller07.length);
   	
   }
   
   public void setWseFiller07(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller07,wseFiller07.length);
   	
   }
   
     /**
	 * 	Update WseFiller07 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller07(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller07+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller07 with another Field
	 *	@param value
	 */
   public void setWseFiller07(Field source) {
       replace(source,0,source.length(),beginWseFiller07,WSE_FILLER_07_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller07 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller07(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller07,WSE_FILLER_07_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller07 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller07(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller07+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse8bT
	 *	@return wse8bT
	 */   
	 public Wse8bT getWse8bT() {
   	return wse8bT;
   }
   /**
	* 	Update Wse8bT with the passed value
	*   Corresponding COBOL Variable is WSE-8B-T
	*	@param value
	*/
   public void setWse8bT(char[] value) {
      wse8bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse8bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse8bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse8bT.begin,wse8bT.length());
   }
   
     /**
	 * 	Update Wse8bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse8bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse8bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse8bT with another Field
	 *	@param value
	 */
   public void setWse8bT(Field source) {
   	replace(source,0,source.length(),wse8bT.begin,wse8bT.length());
   }  
   
     /**
	 * 	Update Wse8bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse8bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse8bT.begin,wse8bT.length());
   }
   
     /**
	 * 	Update Wse8bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse8bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse8bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse8bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller07(CONSTANTS.SPACE_5);
          wse8bT.initialize();
     
   }

		public static int getWse8bTGrpFieldLength() {
			return WSE_8B_TGRP_LENGTH;
		}

}
  
