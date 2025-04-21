package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse11bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse11bTGrp extends Wse11bTGrpSerialized { 
   

						private char[] wseFiller017 = Field.fillLowValue(5);
				private Wse11bT wse11bT = new Wse11bT();
	
	/**
	* Constructor for Wse11bTGrp
	**/
    public Wse11bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse11bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse11bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse11bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller017
	 *	@return wseFiller017
	 */
   public char[] getWseFiller017() throws CFException{
     if (isWseFiller017Modified()) { 
        wseFiller017 = refreshWseFiller017();
     }
   		return wseFiller017;
   }

  
	/**
	*  set variable wseFiller017
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller017(char[] value) {
      wseFiller017 = checkWseFiller017Constraints(value);
      serializeWseFiller017(wseFiller017);
   } 

     /**
	 * 	Update WseFiller017 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller017(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller017,wseFiller017.length);
   	
   }
   
   public void setWseFiller017(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller017,wseFiller017.length);
   	
   }
   
     /**
	 * 	Update WseFiller017 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller017(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller017+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller017 with another Field
	 *	@param value
	 */
   public void setWseFiller017(Field source) {
       replace(source,0,source.length(),beginWseFiller017,WSE_FILLER_017_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller017 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller017(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller017,WSE_FILLER_017_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller017 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller017(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller017+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse11bT
	 *	@return wse11bT
	 */   
	 public Wse11bT getWse11bT() {
   	return wse11bT;
   }
   /**
	* 	Update Wse11bT with the passed value
	*   Corresponding COBOL Variable is WSE-11B-T
	*	@param value
	*/
   public void setWse11bT(char[] value) {
      wse11bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse11bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse11bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse11bT.begin,wse11bT.length());
   }
   
     /**
	 * 	Update Wse11bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse11bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse11bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse11bT with another Field
	 *	@param value
	 */
   public void setWse11bT(Field source) {
   	replace(source,0,source.length(),wse11bT.begin,wse11bT.length());
   }  
   
     /**
	 * 	Update Wse11bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse11bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse11bT.begin,wse11bT.length());
   }
   
     /**
	 * 	Update Wse11bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse11bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse11bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse11bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller017(CONSTANTS.SPACE_5);
          wse11bT.initialize();
     
   }

		public static int getWse11bTGrpFieldLength() {
			return WSE_11B_TGRP_LENGTH;
		}

}
  
