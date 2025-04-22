package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse10bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse10bSGrp")

public class Wse10bSGrp extends Wse10bSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller014 = Field.fillLowValue(3);

						private char[] wse10bS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse10bSGrp
	**/
    public Wse10bSGrp() {
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
	 *	Returns the value of wseFiller014
	 *	@return wseFiller014
	 */
   public char[] getWseFiller014() throws CFException{
     if (isWseFiller014Modified()) { 
        wseFiller014 = refreshWseFiller014();
     }
   		return wseFiller014;
   }

  
	/**
	*  set variable wseFiller014
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller014(char[] value) {
      wseFiller014 = checkWseFiller014Constraints(value);
      serializeWseFiller014(wseFiller014);
   } 

     /**
	 * 	Update WseFiller014 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller014(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller014,wseFiller014.length);
   	
   }
   
   public void setWseFiller014(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller014,wseFiller014.length);
   	
   }
   
     /**
	 * 	Update WseFiller014 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller014(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller014+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller014 with another Field
	 *	@param value
	 */
   public void setWseFiller014(Field source) {
       replace(source,0,source.length(),beginWseFiller014,WSE_FILLER_014_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller014 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller014(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller014,WSE_FILLER_014_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller014 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller014(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller014+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse10bS
	 *	@return wse10bS
	 */
   public char[] getWse10bS() throws CFException{
     if (isWse10bSModified()) { 
        wse10bS = refreshWse10bS();
     }
   		return wse10bS;
   }

  
	/**
	*  set variable wse10bS
	*  Corresponding COBOL Variable is WSE-10B-S
	*  @param value
	**/
   public void setWse10bS(char[] value) {
      wse10bS = checkWse10bSConstraints(value);
      serializeWse10bS(wse10bS);
   } 

     /**
	 * 	Update Wse10bS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse10bS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse10bS,wse10bS.length);
   	
   }
   
   public void setWse10bS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bS,wse10bS.length);
   	
   }
   
     /**
	 * 	Update Wse10bS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse10bS with another Field
	 *	@param value
	 */
   public void setWse10bS(Field source) {
       replace(source,0,source.length(),beginWse10bS,WSE_10B_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse10bS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse10bS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse10bS,WSE_10B_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse10bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bS+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse10bSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller014(CONSTANTS.SPACE_3);
         setWse10bS(CONSTANTS.SPACE_60);
   }

		public static int getWse10bSGrpFieldLength() {
			return WSE_10B_SGRP_LENGTH;
		}

}
  
