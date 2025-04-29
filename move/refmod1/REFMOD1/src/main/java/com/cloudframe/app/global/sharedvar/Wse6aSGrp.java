package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse6aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse6aSGrp")

public class Wse6aSGrp extends Wse6aSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller02 = Field.fillLowValue(3);

						private char[] wse6aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse6aSGrp
	**/
    public Wse6aSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wseFiller02
	 *	@return wseFiller02
	 */
   public char[] getWseFiller02() throws CFException{
     if (isWseFiller02Modified()) { 
        wseFiller02 = refreshWseFiller02();
     }
   		return wseFiller02;
   }

  
	/**
	*  set variable wseFiller02
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller02(char[] value) {
      wseFiller02 = checkWseFiller02Constraints(value);
      serializeWseFiller02(wseFiller02);
   } 

     /**
	 * 	Update WseFiller02 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller02(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller02,wseFiller02.length);
   	
   }
   
   public void setWseFiller02(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller02,wseFiller02.length);
   	
   }
   
     /**
	 * 	Update WseFiller02 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller02+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller02 with another Field
	 *	@param value
	 */
   public void setWseFiller02(Field source) {
       replace(source,0,source.length(),beginWseFiller02,WSE_FILLER_02_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller02 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller02(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller02,WSE_FILLER_02_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller02+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse6aS
	 *	@return wse6aS
	 */
   public char[] getWse6aS() throws CFException{
     if (isWse6aSModified()) { 
        wse6aS = refreshWse6aS();
     }
   		return wse6aS;
   }

  
	/**
	*  set variable wse6aS
	*  Corresponding COBOL Variable is WSE-6A-S
	*  @param value
	**/
   public void setWse6aS(char[] value) {
      wse6aS = checkWse6aSConstraints(value);
      serializeWse6aS(wse6aS);
   } 

     /**
	 * 	Update Wse6aS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse6aS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse6aS,wse6aS.length);
   	
   }
   
   public void setWse6aS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aS,wse6aS.length);
   	
   }
   
     /**
	 * 	Update Wse6aS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse6aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse6aS with another Field
	 *	@param value
	 */
   public void setWse6aS(Field source) {
       replace(source,0,source.length(),beginWse6aS,WSE_6A_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse6aS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse6aS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse6aS,WSE_6A_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse6aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse6aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aS+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse6aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller02(CONSTANTS.SPACE_3);
         setWse6aS(CONSTANTS.SPACE_60);
   }

		public static int getWse6aSGrpFieldLength() {
			return WSE_6A_SGRP_LENGTH;
		}

}
  
