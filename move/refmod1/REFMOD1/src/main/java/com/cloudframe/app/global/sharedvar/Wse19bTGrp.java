package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse19bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse19bTGrp extends Wse19bTGrpSerialized { 
   

						private char[] wseFiller037 = Field.fillLowValue(5);
				private Wse19bT wse19bT = new Wse19bT();
	
	/**
	* Constructor for Wse19bTGrp
	**/
    public Wse19bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse19bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse19bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse19bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller037
	 *	@return wseFiller037
	 */
   public char[] getWseFiller037() throws CFException{
     if (isWseFiller037Modified()) { 
        wseFiller037 = refreshWseFiller037();
     }
   		return wseFiller037;
   }

  
	/**
	*  set variable wseFiller037
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller037(char[] value) {
      wseFiller037 = checkWseFiller037Constraints(value);
      serializeWseFiller037(wseFiller037);
   } 

     /**
	 * 	Update WseFiller037 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller037(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller037,wseFiller037.length);
   	
   }
   
   public void setWseFiller037(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller037,wseFiller037.length);
   	
   }
   
     /**
	 * 	Update WseFiller037 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller037(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller037+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller037 with another Field
	 *	@param value
	 */
   public void setWseFiller037(Field source) {
       replace(source,0,source.length(),beginWseFiller037,WSE_FILLER_037_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller037 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller037(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller037,WSE_FILLER_037_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller037 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller037(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller037+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse19bT
	 *	@return wse19bT
	 */   
	 public Wse19bT getWse19bT() {
   	return wse19bT;
   }
   /**
	* 	Update Wse19bT with the passed value
	*   Corresponding COBOL Variable is WSE-19B-T
	*	@param value
	*/
   public void setWse19bT(char[] value) {
      wse19bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse19bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse19bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse19bT.begin,wse19bT.length());
   }
   
     /**
	 * 	Update Wse19bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse19bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse19bT with another Field
	 *	@param value
	 */
   public void setWse19bT(Field source) {
   	replace(source,0,source.length(),wse19bT.begin,wse19bT.length());
   }  
   
     /**
	 * 	Update Wse19bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse19bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse19bT.begin,wse19bT.length());
   }
   
     /**
	 * 	Update Wse19bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse19bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse19bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller037(CONSTANTS.SPACE_5);
          wse19bT.initialize();
     
   }

		public static int getWse19bTGrpFieldLength() {
			return WSE_19B_TGRP_LENGTH;
		}

}
  
