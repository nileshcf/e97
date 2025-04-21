package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse14aTGrp extends Wse14aTGrpSerialized { 
   

						private char[] wseFiller025 = Field.fillLowValue(5);
				private Wse14aT wse14aT = new Wse14aT();
	
	/**
	* Constructor for Wse14aTGrp
	**/
    public Wse14aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse14aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse14aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse14aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller025
	 *	@return wseFiller025
	 */
   public char[] getWseFiller025() throws CFException{
     if (isWseFiller025Modified()) { 
        wseFiller025 = refreshWseFiller025();
     }
   		return wseFiller025;
   }

  
	/**
	*  set variable wseFiller025
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller025(char[] value) {
      wseFiller025 = checkWseFiller025Constraints(value);
      serializeWseFiller025(wseFiller025);
   } 

     /**
	 * 	Update WseFiller025 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller025(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller025,wseFiller025.length);
   	
   }
   
   public void setWseFiller025(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller025,wseFiller025.length);
   	
   }
   
     /**
	 * 	Update WseFiller025 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller025(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller025+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller025 with another Field
	 *	@param value
	 */
   public void setWseFiller025(Field source) {
       replace(source,0,source.length(),beginWseFiller025,WSE_FILLER_025_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller025 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller025(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller025,WSE_FILLER_025_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller025 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller025(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller025+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse14aT
	 *	@return wse14aT
	 */   
	 public Wse14aT getWse14aT() {
   	return wse14aT;
   }
   /**
	* 	Update Wse14aT with the passed value
	*   Corresponding COBOL Variable is WSE-14A-T
	*	@param value
	*/
   public void setWse14aT(char[] value) {
      wse14aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse14aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse14aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse14aT.begin,wse14aT.length());
   }
   
     /**
	 * 	Update Wse14aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse14aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse14aT with another Field
	 *	@param value
	 */
   public void setWse14aT(Field source) {
   	replace(source,0,source.length(),wse14aT.begin,wse14aT.length());
   }  
   
     /**
	 * 	Update Wse14aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse14aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse14aT.begin,wse14aT.length());
   }
   
     /**
	 * 	Update Wse14aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse14aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse14aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller025(CONSTANTS.SPACE_5);
          wse14aT.initialize();
     
   }

		public static int getWse14aTGrpFieldLength() {
			return WSE_14A_TGRP_LENGTH;
		}

}
  
