package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse8aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse8aTGrp extends Wse8aTGrpSerialized { 
   

						private char[] wseFiller06 = Field.fillLowValue(5);
				private Wse8aT wse8aT = new Wse8aT();
	
	/**
	* Constructor for Wse8aTGrp
	**/
    public Wse8aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse8aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse8aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse8aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller06
	 *	@return wseFiller06
	 */
   public char[] getWseFiller06() throws CFException{
     if (isWseFiller06Modified()) { 
        wseFiller06 = refreshWseFiller06();
     }
   		return wseFiller06;
   }

  
	/**
	*  set variable wseFiller06
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller06(char[] value) {
      wseFiller06 = checkWseFiller06Constraints(value);
      serializeWseFiller06(wseFiller06);
   } 

     /**
	 * 	Update WseFiller06 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller06(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller06,wseFiller06.length);
   	
   }
   
   public void setWseFiller06(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller06,wseFiller06.length);
   	
   }
   
     /**
	 * 	Update WseFiller06 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller06(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller06+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller06 with another Field
	 *	@param value
	 */
   public void setWseFiller06(Field source) {
       replace(source,0,source.length(),beginWseFiller06,WSE_FILLER_06_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller06 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller06(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller06,WSE_FILLER_06_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller06 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller06(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller06+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse8aT
	 *	@return wse8aT
	 */   
	 public Wse8aT getWse8aT() {
   	return wse8aT;
   }
   /**
	* 	Update Wse8aT with the passed value
	*   Corresponding COBOL Variable is WSE-8A-T
	*	@param value
	*/
   public void setWse8aT(char[] value) {
      wse8aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse8aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse8aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse8aT.begin,wse8aT.length());
   }
   
     /**
	 * 	Update Wse8aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse8aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse8aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse8aT with another Field
	 *	@param value
	 */
   public void setWse8aT(Field source) {
   	replace(source,0,source.length(),wse8aT.begin,wse8aT.length());
   }  
   
     /**
	 * 	Update Wse8aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse8aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse8aT.begin,wse8aT.length());
   }
   
     /**
	 * 	Update Wse8aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse8aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse8aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse8aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller06(CONSTANTS.SPACE_5);
          wse8aT.initialize();
     
   }

		public static int getWse8aTGrpFieldLength() {
			return WSE_8A_TGRP_LENGTH;
		}

}
  
