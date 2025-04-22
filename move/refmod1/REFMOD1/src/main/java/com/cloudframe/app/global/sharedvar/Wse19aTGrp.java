package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse19aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse19aTGrp extends Wse19aTGrpSerialized { 
   

						private char[] wseFiller036 = Field.fillLowValue(5);
				private Wse19aT wse19aT = new Wse19aT();
	
	/**
	* Constructor for Wse19aTGrp
	**/
    public Wse19aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse19aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse19aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse19aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller036
	 *	@return wseFiller036
	 */
   public char[] getWseFiller036() throws CFException{
     if (isWseFiller036Modified()) { 
        wseFiller036 = refreshWseFiller036();
     }
   		return wseFiller036;
   }

  
	/**
	*  set variable wseFiller036
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller036(char[] value) {
      wseFiller036 = checkWseFiller036Constraints(value);
      serializeWseFiller036(wseFiller036);
   } 

     /**
	 * 	Update WseFiller036 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller036(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller036,wseFiller036.length);
   	
   }
   
   public void setWseFiller036(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller036,wseFiller036.length);
   	
   }
   
     /**
	 * 	Update WseFiller036 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller036(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller036+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller036 with another Field
	 *	@param value
	 */
   public void setWseFiller036(Field source) {
       replace(source,0,source.length(),beginWseFiller036,WSE_FILLER_036_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller036 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller036(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller036,WSE_FILLER_036_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller036 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller036(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller036+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse19aT
	 *	@return wse19aT
	 */   
	 public Wse19aT getWse19aT() {
   	return wse19aT;
   }
   /**
	* 	Update Wse19aT with the passed value
	*   Corresponding COBOL Variable is WSE-19A-T
	*	@param value
	*/
   public void setWse19aT(char[] value) {
      wse19aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse19aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse19aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse19aT.begin,wse19aT.length());
   }
   
     /**
	 * 	Update Wse19aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse19aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse19aT with another Field
	 *	@param value
	 */
   public void setWse19aT(Field source) {
   	replace(source,0,source.length(),wse19aT.begin,wse19aT.length());
   }  
   
     /**
	 * 	Update Wse19aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse19aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse19aT.begin,wse19aT.length());
   }
   
     /**
	 * 	Update Wse19aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse19aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse19aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller036(CONSTANTS.SPACE_5);
          wse19aT.initialize();
     
   }

		public static int getWse19aTGrpFieldLength() {
			return WSE_19A_TGRP_LENGTH;
		}

}
  
