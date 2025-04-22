package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse13bTGrp extends Wse13bTGrpSerialized { 
   

						private char[] wseFiller023 = Field.fillLowValue(5);
				private Wse13bT wse13bT = new Wse13bT();
	
	/**
	* Constructor for Wse13bTGrp
	**/
    public Wse13bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse13bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse13bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller023
	 *	@return wseFiller023
	 */
   public char[] getWseFiller023() throws CFException{
     if (isWseFiller023Modified()) { 
        wseFiller023 = refreshWseFiller023();
     }
   		return wseFiller023;
   }

  
	/**
	*  set variable wseFiller023
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller023(char[] value) {
      wseFiller023 = checkWseFiller023Constraints(value);
      serializeWseFiller023(wseFiller023);
   } 

     /**
	 * 	Update WseFiller023 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller023(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller023,wseFiller023.length);
   	
   }
   
   public void setWseFiller023(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller023,wseFiller023.length);
   	
   }
   
     /**
	 * 	Update WseFiller023 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller023(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller023+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller023 with another Field
	 *	@param value
	 */
   public void setWseFiller023(Field source) {
       replace(source,0,source.length(),beginWseFiller023,WSE_FILLER_023_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller023 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller023(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller023,WSE_FILLER_023_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller023 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller023(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller023+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse13bT
	 *	@return wse13bT
	 */   
	 public Wse13bT getWse13bT() {
   	return wse13bT;
   }
   /**
	* 	Update Wse13bT with the passed value
	*   Corresponding COBOL Variable is WSE-13B-T
	*	@param value
	*/
   public void setWse13bT(char[] value) {
      wse13bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse13bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse13bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13bT.begin,wse13bT.length());
   }
   
     /**
	 * 	Update Wse13bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse13bT with another Field
	 *	@param value
	 */
   public void setWse13bT(Field source) {
   	replace(source,0,source.length(),wse13bT.begin,wse13bT.length());
   }  
   
     /**
	 * 	Update Wse13bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse13bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13bT.begin,wse13bT.length());
   }
   
     /**
	 * 	Update Wse13bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse13bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller023(CONSTANTS.SPACE_5);
          wse13bT.initialize();
     
   }

		public static int getWse13bTGrpFieldLength() {
			return WSE_13B_TGRP_LENGTH;
		}

}
  
