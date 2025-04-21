package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse11aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse11aTGrp extends Wse11aTGrpSerialized { 
   

						private char[] wseFiller016 = Field.fillLowValue(5);
				private Wse11aT wse11aT = new Wse11aT();
	
	/**
	* Constructor for Wse11aTGrp
	**/
    public Wse11aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse11aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse11aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse11aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller016
	 *	@return wseFiller016
	 */
   public char[] getWseFiller016() throws CFException{
     if (isWseFiller016Modified()) { 
        wseFiller016 = refreshWseFiller016();
     }
   		return wseFiller016;
   }

  
	/**
	*  set variable wseFiller016
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller016(char[] value) {
      wseFiller016 = checkWseFiller016Constraints(value);
      serializeWseFiller016(wseFiller016);
   } 

     /**
	 * 	Update WseFiller016 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller016(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller016,wseFiller016.length);
   	
   }
   
   public void setWseFiller016(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller016,wseFiller016.length);
   	
   }
   
     /**
	 * 	Update WseFiller016 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller016(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller016+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller016 with another Field
	 *	@param value
	 */
   public void setWseFiller016(Field source) {
       replace(source,0,source.length(),beginWseFiller016,WSE_FILLER_016_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller016 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller016(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller016,WSE_FILLER_016_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller016 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller016(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller016+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse11aT
	 *	@return wse11aT
	 */   
	 public Wse11aT getWse11aT() {
   	return wse11aT;
   }
   /**
	* 	Update Wse11aT with the passed value
	*   Corresponding COBOL Variable is WSE-11A-T
	*	@param value
	*/
   public void setWse11aT(char[] value) {
      wse11aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse11aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse11aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse11aT.begin,wse11aT.length());
   }
   
     /**
	 * 	Update Wse11aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse11aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse11aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse11aT with another Field
	 *	@param value
	 */
   public void setWse11aT(Field source) {
   	replace(source,0,source.length(),wse11aT.begin,wse11aT.length());
   }  
   
     /**
	 * 	Update Wse11aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse11aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse11aT.begin,wse11aT.length());
   }
   
     /**
	 * 	Update Wse11aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse11aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse11aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse11aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller016(CONSTANTS.SPACE_5);
          wse11aT.initialize();
     
   }

		public static int getWse11aTGrpFieldLength() {
			return WSE_11A_TGRP_LENGTH;
		}

}
  
