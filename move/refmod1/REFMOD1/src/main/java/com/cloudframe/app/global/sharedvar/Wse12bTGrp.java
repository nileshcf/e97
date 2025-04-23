package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse12bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse12bTGrp extends Wse12bTGrpSerialized { 
   

						private char[] wseFiller019 = Field.fillLowValue(5);
				private Wse12bT wse12bT = new Wse12bT();
	
	/**
	* Constructor for Wse12bTGrp
	**/
    public Wse12bTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse12bTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse12bTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse12bT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller019
	 *	@return wseFiller019
	 */
   public char[] getWseFiller019() throws CFException{
     if (isWseFiller019Modified()) { 
        wseFiller019 = refreshWseFiller019();
     }
   		return wseFiller019;
   }

  
	/**
	*  set variable wseFiller019
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller019(char[] value) {
      wseFiller019 = checkWseFiller019Constraints(value);
      serializeWseFiller019(wseFiller019);
   } 

     /**
	 * 	Update WseFiller019 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller019(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller019,wseFiller019.length);
   	
   }
   
   public void setWseFiller019(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller019,wseFiller019.length);
   	
   }
   
     /**
	 * 	Update WseFiller019 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller019(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller019+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller019 with another Field
	 *	@param value
	 */
   public void setWseFiller019(Field source) {
       replace(source,0,source.length(),beginWseFiller019,WSE_FILLER_019_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller019 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller019(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller019,WSE_FILLER_019_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller019 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller019(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller019+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse12bT
	 *	@return wse12bT
	 */   
	 public Wse12bT getWse12bT() {
   	return wse12bT;
   }
   /**
	* 	Update Wse12bT with the passed value
	*   Corresponding COBOL Variable is WSE-12B-T
	*	@param value
	*/
   public void setWse12bT(char[] value) {
      wse12bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse12bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse12bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse12bT.begin,wse12bT.length());
   }
   
     /**
	 * 	Update Wse12bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse12bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse12bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse12bT with another Field
	 *	@param value
	 */
   public void setWse12bT(Field source) {
   	replace(source,0,source.length(),wse12bT.begin,wse12bT.length());
   }  
   
     /**
	 * 	Update Wse12bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse12bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse12bT.begin,wse12bT.length());
   }
   
     /**
	 * 	Update Wse12bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse12bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse12bT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse12bTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller019(CONSTANTS.SPACE_5);
          wse12bT.initialize();
     
   }

		public static int getWse12bTGrpFieldLength() {
			return WSE_12B_TGRP_LENGTH;
		}

}
  
