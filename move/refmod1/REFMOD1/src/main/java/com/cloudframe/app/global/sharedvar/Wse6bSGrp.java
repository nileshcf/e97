package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse6bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse6bSGrp")

public class Wse6bSGrp extends Wse6bSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller03 = Field.fillLowValue(3);

						private char[] wse6bS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse6bSGrp
	**/
    public Wse6bSGrp() {
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
	 *	Returns the value of wseFiller03
	 *	@return wseFiller03
	 */
   public char[] getWseFiller03() throws CFException{
     if (isWseFiller03Modified()) { 
        wseFiller03 = refreshWseFiller03();
     }
   		return wseFiller03;
   }

  
	/**
	*  set variable wseFiller03
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller03(char[] value) {
      wseFiller03 = checkWseFiller03Constraints(value);
      serializeWseFiller03(wseFiller03);
   } 

     /**
	 * 	Update WseFiller03 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller03(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller03,wseFiller03.length);
   	
   }
   
   public void setWseFiller03(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller03,wseFiller03.length);
   	
   }
   
     /**
	 * 	Update WseFiller03 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller03(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller03+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller03 with another Field
	 *	@param value
	 */
   public void setWseFiller03(Field source) {
       replace(source,0,source.length(),beginWseFiller03,WSE_FILLER_03_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller03 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller03(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller03,WSE_FILLER_03_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller03 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller03(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller03+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse6bS
	 *	@return wse6bS
	 */
   public char[] getWse6bS() throws CFException{
     if (isWse6bSModified()) { 
        wse6bS = refreshWse6bS();
     }
   		return wse6bS;
   }

  
	/**
	*  set variable wse6bS
	*  Corresponding COBOL Variable is WSE-6B-S
	*  @param value
	**/
   public void setWse6bS(char[] value) {
      wse6bS = checkWse6bSConstraints(value);
      serializeWse6bS(wse6bS);
   } 

     /**
	 * 	Update Wse6bS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse6bS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse6bS,wse6bS.length);
   	
   }
   
   public void setWse6bS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bS,wse6bS.length);
   	
   }
   
     /**
	 * 	Update Wse6bS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse6bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse6bS with another Field
	 *	@param value
	 */
   public void setWse6bS(Field source) {
       replace(source,0,source.length(),beginWse6bS,WSE_6B_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse6bS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse6bS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse6bS,WSE_6B_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse6bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse6bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bS+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse6bSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller03(CONSTANTS.SPACE_3);
         setWse6bS(CONSTANTS.SPACE_60);
   }

		public static int getWse6bSGrpFieldLength() {
			return WSE_6B_SGRP_LENGTH;
		}

}
  
