package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse20bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse20bTGrp extends Wse20bTGrpSerialized { 
   

						private char[] wseFiller039 = Field.fillLowValue(5);
				private Wse20bT wse20bT = new Wse20bT();
	
	/**
	* Constructor for Wse20bTGrp
	**/
    public Wse20bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse20bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse20bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse20bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller039
	 *	@return wseFiller039
	 */
   public char[] getWseFiller039() throws CFException{
     if (isWseFiller039Modified()) { 
        wseFiller039 = refreshWseFiller039();
     }
   		return wseFiller039;
   }

  
	/**
	*  set variable wseFiller039
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller039(char[] value) {
      wseFiller039 = checkWseFiller039Constraints(value);
      serializeWseFiller039(wseFiller039);
   } 

     /**
	 * 	Update WseFiller039 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller039(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller039,wseFiller039.length);
   	
   }
   
   public void setWseFiller039(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller039,wseFiller039.length);
   	
   }
   
     /**
	 * 	Update WseFiller039 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller039(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller039+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller039 with another Field
	 *	@param value
	 */
   public void setWseFiller039(Field source) {
       replace(source,0,source.length(),beginWseFiller039,WSE_FILLER_039_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller039 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller039(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller039,WSE_FILLER_039_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller039 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller039(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller039+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse20bT
	 *	@return wse20bT
	 */   
	 public Wse20bT getWse20bT() {
   	return wse20bT;
   }
   /**
	* 	Update Wse20bT with the passed value
	*   Corresponding COBOL Variable is WSE-20B-T
	*	@param value
	*/
   public void setWse20bT(char[] value) {
      wse20bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse20bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse20bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse20bT.begin,wse20bT.length());
   }
   
     /**
	 * 	Update Wse20bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse20bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse20bT with another Field
	 *	@param value
	 */
   public void setWse20bT(Field source) {
   	replace(source,0,source.length(),wse20bT.begin,wse20bT.length());
   }  
   
     /**
	 * 	Update Wse20bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse20bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse20bT.begin,wse20bT.length());
   }
   
     /**
	 * 	Update Wse20bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse20bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse20bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller039(CONSTANTS.SPACE_5);
          wse20bT.initialize();
     
   }

		public static int getWse20bTGrpFieldLength() {
			return WSE_20B_TGRP_LENGTH;
		}

}
  
