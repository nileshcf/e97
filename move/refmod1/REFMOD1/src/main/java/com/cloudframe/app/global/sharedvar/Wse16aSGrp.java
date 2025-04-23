package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse16aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse16aSGrp")

public class Wse16aSGrp extends Wse16aSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller030 = Field.fillLowValue(3);

						private char[] wse16aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse16aSGrp
	**/
    public Wse16aSGrp() {
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
	 *	Returns the value of wseFiller030
	 *	@return wseFiller030
	 */
   public char[] getWseFiller030() throws CFException{
     if (isWseFiller030Modified()) { 
        wseFiller030 = refreshWseFiller030();
     }
   		return wseFiller030;
   }

  
	/**
	*  set variable wseFiller030
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller030(char[] value) {
      wseFiller030 = checkWseFiller030Constraints(value);
      serializeWseFiller030(wseFiller030);
   } 

     /**
	 * 	Update WseFiller030 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller030(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller030,wseFiller030.length);
   	
   }
   
   public void setWseFiller030(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller030,wseFiller030.length);
   	
   }
   
     /**
	 * 	Update WseFiller030 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller030(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller030+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller030 with another Field
	 *	@param value
	 */
   public void setWseFiller030(Field source) {
       replace(source,0,source.length(),beginWseFiller030,WSE_FILLER_030_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller030 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller030(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller030,WSE_FILLER_030_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller030 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller030(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller030+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse16aS
	 *	@return wse16aS
	 */
   public char[] getWse16aS() throws CFException{
     if (isWse16aSModified()) { 
        wse16aS = refreshWse16aS();
     }
   		return wse16aS;
   }

  
	/**
	*  set variable wse16aS
	*  Corresponding COBOL Variable is WSE-16A-S
	*  @param value
	**/
   public void setWse16aS(char[] value) {
      wse16aS = checkWse16aSConstraints(value);
      serializeWse16aS(wse16aS);
   } 

     /**
	 * 	Update Wse16aS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse16aS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse16aS,wse16aS.length);
   	
   }
   
   public void setWse16aS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aS,wse16aS.length);
   	
   }
   
     /**
	 * 	Update Wse16aS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse16aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse16aS with another Field
	 *	@param value
	 */
   public void setWse16aS(Field source) {
       replace(source,0,source.length(),beginWse16aS,WSE_16A_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse16aS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse16aS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse16aS,WSE_16A_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse16aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse16aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aS+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse16aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller030(CONSTANTS.SPACE_3);
         setWse16aS(CONSTANTS.SPACE_60);
   }

		public static int getWse16aSGrpFieldLength() {
			return WSE_16A_SGRP_LENGTH;
		}

}
  
