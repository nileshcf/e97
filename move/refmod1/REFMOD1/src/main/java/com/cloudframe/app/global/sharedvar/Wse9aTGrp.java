package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse9aTGrp extends Wse9aTGrpSerialized { 
   

						private char[] wseFiller09 = Field.fillLowValue(5);
				private Wse9aT wse9aT = new Wse9aT();
	
	/**
	* Constructor for Wse9aTGrp
	**/
    public Wse9aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse9aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse9aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller09
	 *	@return wseFiller09
	 */
   public char[] getWseFiller09() throws CFException{
     if (isWseFiller09Modified()) { 
        wseFiller09 = refreshWseFiller09();
     }
   		return wseFiller09;
   }

  
	/**
	*  set variable wseFiller09
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller09(char[] value) {
      wseFiller09 = checkWseFiller09Constraints(value);
      serializeWseFiller09(wseFiller09);
   } 

     /**
	 * 	Update WseFiller09 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller09(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller09,wseFiller09.length);
   	
   }
   
   public void setWseFiller09(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller09,wseFiller09.length);
   	
   }
   
     /**
	 * 	Update WseFiller09 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller09(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller09+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller09 with another Field
	 *	@param value
	 */
   public void setWseFiller09(Field source) {
       replace(source,0,source.length(),beginWseFiller09,WSE_FILLER_09_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller09 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller09(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller09,WSE_FILLER_09_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller09 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller09(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller09+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse9aT
	 *	@return wse9aT
	 */   
	 public Wse9aT getWse9aT() {
   	return wse9aT;
   }
   /**
	* 	Update Wse9aT with the passed value
	*   Corresponding COBOL Variable is WSE-9A-T
	*	@param value
	*/
   public void setWse9aT(char[] value) {
      wse9aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse9aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse9aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9aT.begin,wse9aT.length());
   }
   
     /**
	 * 	Update Wse9aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse9aT with another Field
	 *	@param value
	 */
   public void setWse9aT(Field source) {
   	replace(source,0,source.length(),wse9aT.begin,wse9aT.length());
   }  
   
     /**
	 * 	Update Wse9aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse9aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9aT.begin,wse9aT.length());
   }
   
     /**
	 * 	Update Wse9aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse9aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller09(CONSTANTS.SPACE_5);
          wse9aT.initialize();
     
   }

		public static int getWse9aTGrpFieldLength() {
			return WSE_9A_TGRP_LENGTH;
		}

}
  
