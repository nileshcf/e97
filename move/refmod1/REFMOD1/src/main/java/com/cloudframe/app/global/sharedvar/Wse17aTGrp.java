package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse17aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse17aTGrp extends Wse17aTGrpSerialized { 
   

						private char[] wseFiller032 = Field.fillLowValue(5);
				private Wse17aT wse17aT = new Wse17aT();
	
	/**
	* Constructor for Wse17aTGrp
	**/
    public Wse17aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse17aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse17aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse17aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller032
	 *	@return wseFiller032
	 */
   public char[] getWseFiller032() throws CFException{
     if (isWseFiller032Modified()) { 
        wseFiller032 = refreshWseFiller032();
     }
   		return wseFiller032;
   }

  
	/**
	*  set variable wseFiller032
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller032(char[] value) {
      wseFiller032 = checkWseFiller032Constraints(value);
      serializeWseFiller032(wseFiller032);
   } 

     /**
	 * 	Update WseFiller032 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller032(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller032,wseFiller032.length);
   	
   }
   
   public void setWseFiller032(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller032,wseFiller032.length);
   	
   }
   
     /**
	 * 	Update WseFiller032 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller032(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller032+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller032 with another Field
	 *	@param value
	 */
   public void setWseFiller032(Field source) {
       replace(source,0,source.length(),beginWseFiller032,WSE_FILLER_032_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller032 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller032(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller032,WSE_FILLER_032_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller032 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller032(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller032+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse17aT
	 *	@return wse17aT
	 */   
	 public Wse17aT getWse17aT() {
   	return wse17aT;
   }
   /**
	* 	Update Wse17aT with the passed value
	*   Corresponding COBOL Variable is WSE-17A-T
	*	@param value
	*/
   public void setWse17aT(char[] value) {
      wse17aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse17aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse17aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse17aT.begin,wse17aT.length());
   }
   
     /**
	 * 	Update Wse17aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse17aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse17aT with another Field
	 *	@param value
	 */
   public void setWse17aT(Field source) {
   	replace(source,0,source.length(),wse17aT.begin,wse17aT.length());
   }  
   
     /**
	 * 	Update Wse17aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse17aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse17aT.begin,wse17aT.length());
   }
   
     /**
	 * 	Update Wse17aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse17aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse17aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller032(CONSTANTS.SPACE_5);
          wse17aT.initialize();
     
   }

		public static int getWse17aTGrpFieldLength() {
			return WSE_17A_TGRP_LENGTH;
		}

}
  
