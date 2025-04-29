package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse16bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse16bSGrp")

public class Wse16bSGrp extends Wse16bSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller031 = Field.fillLowValue(3);

						private char[] wse16bS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse16bSGrp
	**/
    public Wse16bSGrp() {
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
	 *	Returns the value of wseFiller031
	 *	@return wseFiller031
	 */
   public char[] getWseFiller031() throws CFException{
     if (isWseFiller031Modified()) { 
        wseFiller031 = refreshWseFiller031();
     }
   		return wseFiller031;
   }

  
	/**
	*  set variable wseFiller031
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller031(char[] value) {
      wseFiller031 = checkWseFiller031Constraints(value);
      serializeWseFiller031(wseFiller031);
   } 

     /**
	 * 	Update WseFiller031 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller031(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller031,wseFiller031.length);
   	
   }
   
   public void setWseFiller031(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller031,wseFiller031.length);
   	
   }
   
     /**
	 * 	Update WseFiller031 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller031(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller031+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller031 with another Field
	 *	@param value
	 */
   public void setWseFiller031(Field source) {
       replace(source,0,source.length(),beginWseFiller031,WSE_FILLER_031_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller031 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller031(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller031,WSE_FILLER_031_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller031 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller031(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller031+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse16bS
	 *	@return wse16bS
	 */
   public char[] getWse16bS() throws CFException{
     if (isWse16bSModified()) { 
        wse16bS = refreshWse16bS();
     }
   		return wse16bS;
   }

  
	/**
	*  set variable wse16bS
	*  Corresponding COBOL Variable is WSE-16B-S
	*  @param value
	**/
   public void setWse16bS(char[] value) {
      wse16bS = checkWse16bSConstraints(value);
      serializeWse16bS(wse16bS);
   } 

     /**
	 * 	Update Wse16bS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse16bS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse16bS,wse16bS.length);
   	
   }
   
   public void setWse16bS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bS,wse16bS.length);
   	
   }
   
     /**
	 * 	Update Wse16bS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse16bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse16bS with another Field
	 *	@param value
	 */
   public void setWse16bS(Field source) {
       replace(source,0,source.length(),beginWse16bS,WSE_16B_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse16bS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse16bS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse16bS,WSE_16B_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse16bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse16bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bS+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse16bSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller031(CONSTANTS.SPACE_3);
         setWse16bS(CONSTANTS.SPACE_60);
   }

		public static int getWse16bSGrpFieldLength() {
			return WSE_16B_SGRP_LENGTH;
		}

}
  
