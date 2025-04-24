package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Wse14bSGrp extends Wse14bSGrpSerialized { 
   

						private char[] wseFiller026 = Field.fillLowValue(3);

						private char[] wse14bS = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse14bSGrp
	**/
    public Wse14bSGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wseFiller026
	 *	@return wseFiller026
	 */
   public char[] getWseFiller026() throws CFException{
     if (isWseFiller026Modified()) { 
        wseFiller026 = refreshWseFiller026();
     }
   		return wseFiller026;
   }

  
	/**
	*  set variable wseFiller026
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller026(char[] value) {
      wseFiller026 = checkWseFiller026Constraints(value);
      serializeWseFiller026(wseFiller026);
   } 

     /**
	 * 	Update WseFiller026 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller026(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller026,wseFiller026.length);
   	
   }
   
   public void setWseFiller026(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller026,wseFiller026.length);
   	
   }
   
     /**
	 * 	Update WseFiller026 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller026(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller026+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller026 with another Field
	 *	@param value
	 */
   public void setWseFiller026(Field source) {
       replace(source,0,source.length(),beginWseFiller026,WSE_FILLER_026_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller026 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller026(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller026,WSE_FILLER_026_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller026 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller026(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller026+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse14bS
	 *	@return wse14bS
	 */
   public char[] getWse14bS() throws CFException{
     if (isWse14bSModified()) { 
        wse14bS = refreshWse14bS();
     }
   		return wse14bS;
   }

  
	/**
	*  set variable wse14bS
	*  Corresponding COBOL Variable is WSE-14B-S
	*  @param value
	**/
   public void setWse14bS(char[] value) {
      wse14bS = checkWse14bSConstraints(value);
      serializeWse14bS(wse14bS);
   } 

     /**
	 * 	Update Wse14bS 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse14bS(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse14bS,wse14bS.length);
   	
   }
   
   public void setWse14bS(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bS,wse14bS.length);
   	
   }
   
     /**
	 * 	Update Wse14bS 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bS+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse14bS with another Field
	 *	@param value
	 */
   public void setWse14bS(Field source) {
       replace(source,0,source.length(),beginWse14bS,WSE_14B_S_LEN);
   	
   }  
   
     /**
	 * 	Update Wse14bS 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse14bS(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse14bS,WSE_14B_S_LEN);
   	
   }
   
     /**
	 * 	Update Wse14bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bS+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse14bSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller026(CONSTANTS.SPACE_3);
         setWse14bS(CONSTANTS.SPACE_60);
   }

		public static int getWse14bSGrpFieldLength() {
			return WSE_14B_SGRP_LENGTH;
		}

}
  
