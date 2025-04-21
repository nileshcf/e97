package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse10aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse10aSGrp")

public class Wse10aSGrp extends Wse10aSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller012 = Field.fillLowValue(3);

						private char[] wse10aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse10aSGrp
	**/
    public Wse10aSGrp() {
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
	 *	Returns the value of wseFiller012
	 *	@return wseFiller012
	 */
   public char[] getWseFiller012() throws CFException{
     if (isWseFiller012Modified()) { 
        wseFiller012 = refreshWseFiller012();
     }
   		return wseFiller012;
   }

  
	/**
	*  set variable wseFiller012
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller012(char[] value) {
      wseFiller012 = checkWseFiller012Constraints(value);
      serializeWseFiller012(wseFiller012);
   } 

     /**
	 * 	Update WseFiller012 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller012(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller012,wseFiller012.length);
   	
   }
   
   public void setWseFiller012(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller012,wseFiller012.length);
   	
   }
   
     /**
	 * 	Update WseFiller012 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller012(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller012+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller012 with another Field
	 *	@param value
	 */
   public void setWseFiller012(Field source) {
       replace(source,0,source.length(),beginWseFiller012,WSE_FILLER_012_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller012 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller012(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller012,WSE_FILLER_012_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller012 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller012(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller012+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse10aS
	 *	@return wse10aS
	 */
   public char[] getWse10aS() throws CFException{
     if (isWse10aSModified()) { 
        wse10aS = refreshWse10aS();
     }
   		return wse10aS;
   }

  
	/**
	*  set variable wse10aS
	*  Corresponding COBOL Variable is WSE-10A-S
	*  @param value
	**/
   public void setWse10aS(char[] value) {
      wse10aS = checkWse10aSConstraints(value);
      serializeWse10aS(wse10aS);
   } 

     /**
	 * 	Update Wse10aS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse10aS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse10aS,wse10aS.length);
   	
   }
   
   public void setWse10aS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aS,wse10aS.length);
   	
   }
   
     /**
	 * 	Update Wse10aS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse10aS with another Field
	 *	@param value
	 */
   public void setWse10aS(Field source) {
       replace(source,0,source.length(),beginWse10aS,WSE_10A_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse10aS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse10aS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse10aS,WSE_10A_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse10aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aS+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse10aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller012(CONSTANTS.SPACE_3);
         setWse10aS(CONSTANTS.SPACE_60);
   }

		public static int getWse10aSGrpFieldLength() {
			return WSE_10A_SGRP_LENGTH;
		}

}
  
