package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Wse14aSGrp extends Wse14aSGrpSerialized { 
   

						private char[] wseFiller024 = Field.fillLowValue(3);

						private char[] wse14aS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse14aSGrp
	**/
    public Wse14aSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wseFiller024
	 *	@return wseFiller024
	 */
   public char[] getWseFiller024() throws CFException{
     if (isWseFiller024Modified()) { 
        wseFiller024 = refreshWseFiller024();
     }
   		return wseFiller024;
   }

  
	/**
	*  set variable wseFiller024
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller024(char[] value) {
      wseFiller024 = checkWseFiller024Constraints(value);
      serializeWseFiller024(wseFiller024);
   } 

     /**
	 * 	Update WseFiller024 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller024(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller024,wseFiller024.length);
   	
   }
   
   public void setWseFiller024(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller024,wseFiller024.length);
   	
   }
   
     /**
	 * 	Update WseFiller024 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller024(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller024+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller024 with another Field
	 *	@param value
	 */
   public void setWseFiller024(Field source) {
       replace(source,0,source.length(),beginWseFiller024,WSE_FILLER_024_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller024 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller024(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller024,WSE_FILLER_024_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller024 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller024(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller024+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse14aS
	 *	@return wse14aS
	 */
   public char[] getWse14aS() throws CFException{
     if (isWse14aSModified()) { 
        wse14aS = refreshWse14aS();
     }
   		return wse14aS;
   }

  
	/**
	*  set variable wse14aS
	*  Corresponding COBOL Variable is WSE-14A-S
	*  @param value
	**/
   public void setWse14aS(char[] value) {
      wse14aS = checkWse14aSConstraints(value);
      serializeWse14aS(wse14aS);
   } 

     /**
	 * 	Update Wse14aS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse14aS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse14aS,wse14aS.length);
   	
   }
   
   public void setWse14aS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aS,wse14aS.length);
   	
   }
   
     /**
	 * 	Update Wse14aS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse14aS with another Field
	 *	@param value
	 */
   public void setWse14aS(Field source) {
       replace(source,0,source.length(),beginWse14aS,WSE_14A_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse14aS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse14aS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse14aS,WSE_14A_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse14aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aS+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse14aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller024(CONSTANTS.SPACE_3);
         setWse14aS(CONSTANTS.SPACE_60);
   }

		public static int getWse14aSGrpFieldLength() {
			return WSE_14A_SGRP_LENGTH;
		}

}
  
