package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse14bTGrp extends Wse14bTGrpSerialized { 
   

						private char[] wseFiller027 = Field.fillLowValue(5);
				private Wse14bT wse14bT = new Wse14bT();
	
	/**
	* Constructor for Wse14bTGrp
	**/
    public Wse14bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse14bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse14bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse14bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller027
	 *	@return wseFiller027
	 */
   public char[] getWseFiller027() throws CFException{
     if (isWseFiller027Modified()) { 
        wseFiller027 = refreshWseFiller027();
     }
   		return wseFiller027;
   }

  
	/**
	*  set variable wseFiller027
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller027(char[] value) {
      wseFiller027 = checkWseFiller027Constraints(value);
      serializeWseFiller027(wseFiller027);
   } 

     /**
	 * 	Update WseFiller027 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller027(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller027,wseFiller027.length);
   	
   }
   
   public void setWseFiller027(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller027,wseFiller027.length);
   	
   }
   
     /**
	 * 	Update WseFiller027 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller027(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller027+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller027 with another Field
	 *	@param value
	 */
   public void setWseFiller027(Field source) {
       replace(source,0,source.length(),beginWseFiller027,WSE_FILLER_027_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller027 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller027(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller027,WSE_FILLER_027_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller027 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller027(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller027+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse14bT
	 *	@return wse14bT
	 */   
	 public Wse14bT getWse14bT() {
   	return wse14bT;
   }
   /**
	* 	Update Wse14bT with the passed value
	*   Corresponding COBOL Variable is WSE-14B-T
	*	@param value
	*/
   public void setWse14bT(char[] value) {
      wse14bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse14bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse14bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse14bT.begin,wse14bT.length());
   }
   
     /**
	 * 	Update Wse14bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse14bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse14bT with another Field
	 *	@param value
	 */
   public void setWse14bT(Field source) {
   	replace(source,0,source.length(),wse14bT.begin,wse14bT.length());
   }  
   
     /**
	 * 	Update Wse14bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse14bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse14bT.begin,wse14bT.length());
   }
   
     /**
	 * 	Update Wse14bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse14bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse14bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller027(CONSTANTS.SPACE_5);
          wse14bT.initialize();
     
   }

		public static int getWse14bTGrpFieldLength() {
			return WSE_14B_TGRP_LENGTH;
		}

}
  
