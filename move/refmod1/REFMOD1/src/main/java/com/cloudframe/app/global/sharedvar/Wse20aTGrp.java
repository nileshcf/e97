package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse20aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse20aTGrp extends Wse20aTGrpSerialized { 
   

						private char[] wseFiller038 = Field.fillLowValue(5);
				private Wse20aT wse20aT = new Wse20aT();
	
	/**
	* Constructor for Wse20aTGrp
	**/
    public Wse20aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse20aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse20aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse20aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller038
	 *	@return wseFiller038
	 */
   public char[] getWseFiller038() throws CFException{
     if (isWseFiller038Modified()) { 
        wseFiller038 = refreshWseFiller038();
     }
   		return wseFiller038;
   }

  
	/**
	*  set variable wseFiller038
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller038(char[] value) {
      wseFiller038 = checkWseFiller038Constraints(value);
      serializeWseFiller038(wseFiller038);
   } 

     /**
	 * 	Update WseFiller038 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller038(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller038,wseFiller038.length);
   	
   }
   
   public void setWseFiller038(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller038,wseFiller038.length);
   	
   }
   
     /**
	 * 	Update WseFiller038 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller038(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller038+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller038 with another Field
	 *	@param value
	 */
   public void setWseFiller038(Field source) {
       replace(source,0,source.length(),beginWseFiller038,WSE_FILLER_038_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller038 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller038(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller038,WSE_FILLER_038_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller038 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller038(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller038+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse20aT
	 *	@return wse20aT
	 */   
	 public Wse20aT getWse20aT() {
   	return wse20aT;
   }
   /**
	* 	Update Wse20aT with the passed value
	*   Corresponding COBOL Variable is WSE-20A-T
	*	@param value
	*/
   public void setWse20aT(char[] value) {
      wse20aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse20aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse20aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse20aT.begin,wse20aT.length());
   }
   
     /**
	 * 	Update Wse20aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse20aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse20aT with another Field
	 *	@param value
	 */
   public void setWse20aT(Field source) {
   	replace(source,0,source.length(),wse20aT.begin,wse20aT.length());
   }  
   
     /**
	 * 	Update Wse20aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse20aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse20aT.begin,wse20aT.length());
   }
   
     /**
	 * 	Update Wse20aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse20aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse20aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller038(CONSTANTS.SPACE_5);
          wse20aT.initialize();
     
   }

		public static int getWse20aTGrpFieldLength() {
			return WSE_20A_TGRP_LENGTH;
		}

}
  
