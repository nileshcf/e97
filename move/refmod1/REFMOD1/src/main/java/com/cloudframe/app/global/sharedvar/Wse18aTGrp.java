package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse18aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse18aTGrp extends Wse18aTGrpSerialized { 
   

						private char[] wseFiller034 = Field.fillLowValue(5);
				private Wse18aT wse18aT = new Wse18aT();
	
	/**
	* Constructor for Wse18aTGrp
	**/
    public Wse18aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse18aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse18aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse18aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller034
	 *	@return wseFiller034
	 */
   public char[] getWseFiller034() throws CFException{
     if (isWseFiller034Modified()) { 
        wseFiller034 = refreshWseFiller034();
     }
   		return wseFiller034;
   }

  
	/**
	*  set variable wseFiller034
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller034(char[] value) {
      wseFiller034 = checkWseFiller034Constraints(value);
      serializeWseFiller034(wseFiller034);
   } 

     /**
	 * 	Update WseFiller034 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller034(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller034,wseFiller034.length);
   	
   }
   
   public void setWseFiller034(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller034,wseFiller034.length);
   	
   }
   
     /**
	 * 	Update WseFiller034 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller034(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller034+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller034 with another Field
	 *	@param value
	 */
   public void setWseFiller034(Field source) {
       replace(source,0,source.length(),beginWseFiller034,WSE_FILLER_034_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller034 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller034(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller034,WSE_FILLER_034_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller034 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller034(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller034+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse18aT
	 *	@return wse18aT
	 */   
	 public Wse18aT getWse18aT() {
   	return wse18aT;
   }
   /**
	* 	Update Wse18aT with the passed value
	*   Corresponding COBOL Variable is WSE-18A-T
	*	@param value
	*/
   public void setWse18aT(char[] value) {
      wse18aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse18aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse18aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse18aT.begin,wse18aT.length());
   }
   
     /**
	 * 	Update Wse18aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse18aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse18aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse18aT with another Field
	 *	@param value
	 */
   public void setWse18aT(Field source) {
   	replace(source,0,source.length(),wse18aT.begin,wse18aT.length());
   }  
   
     /**
	 * 	Update Wse18aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse18aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse18aT.begin,wse18aT.length());
   }
   
     /**
	 * 	Update Wse18aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse18aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse18aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse18aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller034(CONSTANTS.SPACE_5);
          wse18aT.initialize();
     
   }

		public static int getWse18aTGrpFieldLength() {
			return WSE_18A_TGRP_LENGTH;
		}

}
  
