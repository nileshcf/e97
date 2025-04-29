package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse12aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse12aTGrp extends Wse12aTGrpSerialized { 
   

						private char[] wseFiller018 = Field.fillLowValue(5);
				private Wse12aT wse12aT = new Wse12aT();
	
	/**
	* Constructor for Wse12aTGrp
	**/
    public Wse12aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse12aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse12aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse12aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller018
	 *	@return wseFiller018
	 */
   public char[] getWseFiller018() throws CFException{
     if (isWseFiller018Modified()) { 
        wseFiller018 = refreshWseFiller018();
     }
   		return wseFiller018;
   }

  
	/**
	*  set variable wseFiller018
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller018(char[] value) {
      wseFiller018 = checkWseFiller018Constraints(value);
      serializeWseFiller018(wseFiller018);
   } 

     /**
	 * 	Update WseFiller018 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller018(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller018,wseFiller018.length);
   	
   }
   
   public void setWseFiller018(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller018,wseFiller018.length);
   	
   }
   
     /**
	 * 	Update WseFiller018 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller018(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller018+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller018 with another Field
	 *	@param value
	 */
   public void setWseFiller018(Field source) {
       replace(source,0,source.length(),beginWseFiller018,WSE_FILLER_018_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller018 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller018(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller018,WSE_FILLER_018_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller018 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller018(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller018+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse12aT
	 *	@return wse12aT
	 */   
	 public Wse12aT getWse12aT() {
   	return wse12aT;
   }
   /**
	* 	Update Wse12aT with the passed value
	*   Corresponding COBOL Variable is WSE-12A-T
	*	@param value
	*/
   public void setWse12aT(char[] value) {
      wse12aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse12aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse12aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse12aT.begin,wse12aT.length());
   }
   
     /**
	 * 	Update Wse12aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse12aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse12aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse12aT with another Field
	 *	@param value
	 */
   public void setWse12aT(Field source) {
   	replace(source,0,source.length(),wse12aT.begin,wse12aT.length());
   }  
   
     /**
	 * 	Update Wse12aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse12aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse12aT.begin,wse12aT.length());
   }
   
     /**
	 * 	Update Wse12aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse12aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse12aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse12aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller018(CONSTANTS.SPACE_5);
          wse12aT.initialize();
     
   }

		public static int getWse12aTGrpFieldLength() {
			return WSE_12A_TGRP_LENGTH;
		}

}
  
