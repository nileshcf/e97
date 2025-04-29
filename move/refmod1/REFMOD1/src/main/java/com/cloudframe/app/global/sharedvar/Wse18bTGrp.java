package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse18bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse18bTGrp extends Wse18bTGrpSerialized { 
   

						private char[] wseFiller035 = Field.fillLowValue(5);
				private Wse18bT wse18bT = new Wse18bT();
	
	/**
	* Constructor for Wse18bTGrp
	**/
    public Wse18bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse18bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse18bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse18bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller035
	 *	@return wseFiller035
	 */
   public char[] getWseFiller035() throws CFException{
     if (isWseFiller035Modified()) { 
        wseFiller035 = refreshWseFiller035();
     }
   		return wseFiller035;
   }

  
	/**
	*  set variable wseFiller035
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller035(char[] value) {
      wseFiller035 = checkWseFiller035Constraints(value);
      serializeWseFiller035(wseFiller035);
   } 

     /**
	 * 	Update WseFiller035 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller035(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller035,wseFiller035.length);
   	
   }
   
   public void setWseFiller035(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller035,wseFiller035.length);
   	
   }
   
     /**
	 * 	Update WseFiller035 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller035(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller035+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller035 with another Field
	 *	@param value
	 */
   public void setWseFiller035(Field source) {
       replace(source,0,source.length(),beginWseFiller035,WSE_FILLER_035_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller035 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller035(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller035,WSE_FILLER_035_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller035 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller035(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller035+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse18bT
	 *	@return wse18bT
	 */   
	 public Wse18bT getWse18bT() {
   	return wse18bT;
   }
   /**
	* 	Update Wse18bT with the passed value
	*   Corresponding COBOL Variable is WSE-18B-T
	*	@param value
	*/
   public void setWse18bT(char[] value) {
      wse18bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse18bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse18bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse18bT.begin,wse18bT.length());
   }
   
     /**
	 * 	Update Wse18bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse18bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse18bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse18bT with another Field
	 *	@param value
	 */
   public void setWse18bT(Field source) {
   	replace(source,0,source.length(),wse18bT.begin,wse18bT.length());
   }  
   
     /**
	 * 	Update Wse18bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse18bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse18bT.begin,wse18bT.length());
   }
   
     /**
	 * 	Update Wse18bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse18bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse18bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse18bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller035(CONSTANTS.SPACE_5);
          wse18bT.initialize();
     
   }

		public static int getWse18bTGrpFieldLength() {
			return WSE_18B_TGRP_LENGTH;
		}

}
  
