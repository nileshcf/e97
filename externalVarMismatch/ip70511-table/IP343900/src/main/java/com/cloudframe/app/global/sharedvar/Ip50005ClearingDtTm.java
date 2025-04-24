package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005ClearingDtTm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip50005ClearingDtTm extends Ip50005ClearingDtTmSerialized { 
   

						private char[] ip50005ClearingDt = Field.fillLowValue(8);

						private char[] ip50005ClearingTm = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50005ClearingDtTm
	**/
    public Ip50005ClearingDtTm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip50005ClearingDt
	 *	@return ip50005ClearingDt
	 */
   public char[] getIp50005ClearingDt() throws CFException{
     if (isIp50005ClearingDtModified()) { 
        ip50005ClearingDt = refreshIp50005ClearingDt();
     }
   		return ip50005ClearingDt;
   }

  
	/**
	*  set variable ip50005ClearingDt
	*  Corresponding COBOL Variable is IP50005-CLEARING-DT
	*  @param value
	**/
   public void setIp50005ClearingDt(char[] value) {
      ip50005ClearingDt = checkIp50005ClearingDtConstraints(value);
      serializeIp50005ClearingDt(ip50005ClearingDt);
   } 

     /**
	 * 	Update Ip50005ClearingDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005ClearingDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005ClearingDt,ip50005ClearingDt.length);
   	
   }
   
   public void setIp50005ClearingDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005ClearingDt,ip50005ClearingDt.length);
   	
   }
   
     /**
	 * 	Update Ip50005ClearingDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005ClearingDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005ClearingDt with another Field
	 *	@param value
	 */
   public void setIp50005ClearingDt(Field source) {
       replace(source,0,source.length(),beginIp50005ClearingDt,IP_50005_CLEARING_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005ClearingDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005ClearingDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005ClearingDt,IP_50005_CLEARING_DT_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005ClearingDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005ClearingDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50005ClearingTm
	 *	@return ip50005ClearingTm
	 */
   public char[] getIp50005ClearingTm() throws CFException{
     if (isIp50005ClearingTmModified()) { 
        ip50005ClearingTm = refreshIp50005ClearingTm();
     }
   		return ip50005ClearingTm;
   }

  
	/**
	*  set variable ip50005ClearingTm
	*  Corresponding COBOL Variable is IP50005-CLEARING-TM
	*  @param value
	**/
   public void setIp50005ClearingTm(char[] value) {
      ip50005ClearingTm = checkIp50005ClearingTmConstraints(value);
      serializeIp50005ClearingTm(ip50005ClearingTm);
   } 

     /**
	 * 	Update Ip50005ClearingTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005ClearingTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005ClearingTm,ip50005ClearingTm.length);
   	
   }
   
   public void setIp50005ClearingTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005ClearingTm,ip50005ClearingTm.length);
   	
   }
   
     /**
	 * 	Update Ip50005ClearingTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005ClearingTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005ClearingTm with another Field
	 *	@param value
	 */
   public void setIp50005ClearingTm(Field source) {
       replace(source,0,source.length(),beginIp50005ClearingTm,IP_50005_CLEARING_TM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005ClearingTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005ClearingTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005ClearingTm,IP_50005_CLEARING_TM_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005ClearingTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005ClearingTm+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50005ClearingDtTm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50005ClearingDt(CONSTANTS.SPACE_8);
         setIp50005ClearingTm(CONSTANTS.SPACE_2);
   }

		public static int getIp50005ClearingDtTmFieldLength() {
			return IP_50005_CLEARING_DT_TM_LENGTH;
		}

}
  
