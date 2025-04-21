package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse17bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse17bTGrp extends Wse17bTGrpSerialized { 
   

						private char[] wseFiller033 = Field.fillLowValue(5);
				private Wse17bT wse17bT = new Wse17bT();
	
	/**
	* Constructor for Wse17bTGrp
	**/
    public Wse17bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse17bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse17bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse17bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller033
	 *	@return wseFiller033
	 */
   public char[] getWseFiller033() throws CFException{
     if (isWseFiller033Modified()) { 
        wseFiller033 = refreshWseFiller033();
     }
   		return wseFiller033;
   }

  
	/**
	*  set variable wseFiller033
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller033(char[] value) {
      wseFiller033 = checkWseFiller033Constraints(value);
      serializeWseFiller033(wseFiller033);
   } 

     /**
	 * 	Update WseFiller033 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller033(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller033,wseFiller033.length);
   	
   }
   
   public void setWseFiller033(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller033,wseFiller033.length);
   	
   }
   
     /**
	 * 	Update WseFiller033 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller033(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller033+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller033 with another Field
	 *	@param value
	 */
   public void setWseFiller033(Field source) {
       replace(source,0,source.length(),beginWseFiller033,WSE_FILLER_033_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller033 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller033(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller033,WSE_FILLER_033_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller033 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller033(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller033+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse17bT
	 *	@return wse17bT
	 */   
	 public Wse17bT getWse17bT() {
   	return wse17bT;
   }
   /**
	* 	Update Wse17bT with the passed value
	*   Corresponding COBOL Variable is WSE-17B-T
	*	@param value
	*/
   public void setWse17bT(char[] value) {
      wse17bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse17bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse17bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse17bT.begin,wse17bT.length());
   }
   
     /**
	 * 	Update Wse17bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse17bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse17bT with another Field
	 *	@param value
	 */
   public void setWse17bT(Field source) {
   	replace(source,0,source.length(),wse17bT.begin,wse17bT.length());
   }  
   
     /**
	 * 	Update Wse17bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse17bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse17bT.begin,wse17bT.length());
   }
   
     /**
	 * 	Update Wse17bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse17bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse17bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller033(CONSTANTS.SPACE_5);
          wse17bT.initialize();
     
   }

		public static int getWse17bTGrpFieldLength() {
			return WSE_17B_TGRP_LENGTH;
		}

}
  
