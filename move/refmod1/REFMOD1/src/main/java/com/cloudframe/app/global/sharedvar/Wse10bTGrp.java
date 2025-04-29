package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse10bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse10bTGrp extends Wse10bTGrpSerialized { 
   

						private char[] wseFiller015 = Field.fillLowValue(5);
				private Wse10bT wse10bT = new Wse10bT();
	
	/**
	* Constructor for Wse10bTGrp
	**/
    public Wse10bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse10bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse10bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse10bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller015
	 *	@return wseFiller015
	 */
   public char[] getWseFiller015() throws CFException{
     if (isWseFiller015Modified()) { 
        wseFiller015 = refreshWseFiller015();
     }
   		return wseFiller015;
   }

  
	/**
	*  set variable wseFiller015
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller015(char[] value) {
      wseFiller015 = checkWseFiller015Constraints(value);
      serializeWseFiller015(wseFiller015);
   } 

     /**
	 * 	Update WseFiller015 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller015(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller015,wseFiller015.length);
   	
   }
   
   public void setWseFiller015(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller015,wseFiller015.length);
   	
   }
   
     /**
	 * 	Update WseFiller015 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller015(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller015+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller015 with another Field
	 *	@param value
	 */
   public void setWseFiller015(Field source) {
       replace(source,0,source.length(),beginWseFiller015,WSE_FILLER_015_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller015 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller015(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller015,WSE_FILLER_015_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller015 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller015(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller015+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse10bT
	 *	@return wse10bT
	 */   
	 public Wse10bT getWse10bT() {
   	return wse10bT;
   }
   /**
	* 	Update Wse10bT with the passed value
	*   Corresponding COBOL Variable is WSE-10B-T
	*	@param value
	*/
   public void setWse10bT(char[] value) {
      wse10bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse10bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse10bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse10bT.begin,wse10bT.length());
   }
   
     /**
	 * 	Update Wse10bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse10bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse10bT with another Field
	 *	@param value
	 */
   public void setWse10bT(Field source) {
   	replace(source,0,source.length(),wse10bT.begin,wse10bT.length());
   }  
   
     /**
	 * 	Update Wse10bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse10bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse10bT.begin,wse10bT.length());
   }
   
     /**
	 * 	Update Wse10bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse10bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse10bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller015(CONSTANTS.SPACE_5);
          wse10bT.initialize();
     
   }

		public static int getWse10bTGrpFieldLength() {
			return WSE_10B_TGRP_LENGTH;
		}

}
  
