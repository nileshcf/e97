package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse7aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse7aTGrp extends Wse7aTGrpSerialized { 
   

						private char[] wseFiller04 = Field.fillLowValue(5);
				private Wse7aT wse7aT = new Wse7aT();
	
	/**
	* Constructor for Wse7aTGrp
	**/
    public Wse7aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse7aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse7aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse7aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller04
	 *	@return wseFiller04
	 */
   public char[] getWseFiller04() throws CFException{
     if (isWseFiller04Modified()) { 
        wseFiller04 = refreshWseFiller04();
     }
   		return wseFiller04;
   }

  
	/**
	*  set variable wseFiller04
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller04(char[] value) {
      wseFiller04 = checkWseFiller04Constraints(value);
      serializeWseFiller04(wseFiller04);
   } 

     /**
	 * 	Update WseFiller04 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller04(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller04,wseFiller04.length);
   	
   }
   
   public void setWseFiller04(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller04,wseFiller04.length);
   	
   }
   
     /**
	 * 	Update WseFiller04 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller04(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller04+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller04 with another Field
	 *	@param value
	 */
   public void setWseFiller04(Field source) {
       replace(source,0,source.length(),beginWseFiller04,WSE_FILLER_04_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller04 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller04(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller04,WSE_FILLER_04_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller04 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller04(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller04+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse7aT
	 *	@return wse7aT
	 */   
	 public Wse7aT getWse7aT() {
   	return wse7aT;
   }
   /**
	* 	Update Wse7aT with the passed value
	*   Corresponding COBOL Variable is WSE-7A-T
	*	@param value
	*/
   public void setWse7aT(char[] value) {
      wse7aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse7aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse7aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse7aT.begin,wse7aT.length());
   }
   
     /**
	 * 	Update Wse7aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse7aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse7aT with another Field
	 *	@param value
	 */
   public void setWse7aT(Field source) {
   	replace(source,0,source.length(),wse7aT.begin,wse7aT.length());
   }  
   
     /**
	 * 	Update Wse7aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse7aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse7aT.begin,wse7aT.length());
   }
   
     /**
	 * 	Update Wse7aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse7aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse7aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller04(CONSTANTS.SPACE_5);
          wse7aT.initialize();
     
   }

		public static int getWse7aTGrpFieldLength() {
			return WSE_7A_TGRP_LENGTH;
		}

}
  
