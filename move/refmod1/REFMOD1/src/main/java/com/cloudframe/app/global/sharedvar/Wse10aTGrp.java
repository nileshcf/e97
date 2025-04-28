package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse10aTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse10aTGrp extends Wse10aTGrpSerialized { 
   

						private char[] wseFiller013 = Field.fillLowValue(5);
				private Wse10aT wse10aT = new Wse10aT();
	
	/**
	* Constructor for Wse10aTGrp
	**/
    public Wse10aTGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse10aTGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse10aTGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wse10aT.setParent(this,getStartOffset() + 5);
    } 

	/**
	 *	Returns the value of wseFiller013
	 *	@return wseFiller013
	 */
   public char[] getWseFiller013() throws CFException{
     if (isWseFiller013Modified()) { 
        wseFiller013 = refreshWseFiller013();
     }
   		return wseFiller013;
   }

  
	/**
	*  set variable wseFiller013
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller013(char[] value) {
      wseFiller013 = checkWseFiller013Constraints(value);
      serializeWseFiller013(wseFiller013);
   } 

     /**
	 * 	Update WseFiller013 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller013(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller013,wseFiller013.length);
   	
   }
   
   public void setWseFiller013(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller013,wseFiller013.length);
   	
   }
   
     /**
	 * 	Update WseFiller013 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller013(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller013+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller013 with another Field
	 *	@param value
	 */
   public void setWseFiller013(Field source) {
       replace(source,0,source.length(),beginWseFiller013,WSE_FILLER_013_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller013 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller013(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller013,WSE_FILLER_013_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller013 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller013(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller013+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse10aT
	 *	@return wse10aT
	 */   
	 public Wse10aT getWse10aT() {
   	return wse10aT;
   }
   /**
	* 	Update Wse10aT with the passed value
	*   Corresponding COBOL Variable is WSE-10A-T
	*	@param value
	*/
   public void setWse10aT(char[] value) {
      wse10aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse10aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse10aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse10aT.begin,wse10aT.length());
   }
   
     /**
	 * 	Update Wse10aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse10aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse10aT with another Field
	 *	@param value
	 */
   public void setWse10aT(Field source) {
   	replace(source,0,source.length(),wse10aT.begin,wse10aT.length());
   }  
   
     /**
	 * 	Update Wse10aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse10aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse10aT.begin,wse10aT.length());
   }
   
     /**
	 * 	Update Wse10aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse10aT.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse10aTGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller013(CONSTANTS.SPACE_5);
          wse10aT.initialize();
     
   }

		public static int getWse10aTGrpFieldLength() {
			return WSE_10A_TGRP_LENGTH;
		}

}
  
