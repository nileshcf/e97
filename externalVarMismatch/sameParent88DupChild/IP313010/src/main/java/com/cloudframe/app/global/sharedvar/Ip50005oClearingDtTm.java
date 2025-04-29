package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oClearingDtTm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip50005oClearingDtTm")

public class Ip50005oClearingDtTm extends Ip50005oClearingDtTmSerialized  implements InitializingBean {
   

						private char[] ip50005oClearingDt = Field.fillLowValue(8);

						private char[] ip50005oClearingTm = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50005oClearingDtTm
	**/
    public Ip50005oClearingDtTm() {
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
	 *	Returns the value of ip50005oClearingDt
	 *	@return ip50005oClearingDt
	 */
   public char[] getIp50005oClearingDt() throws CFException{
     if (isIp50005oClearingDtModified()) { 
        ip50005oClearingDt = refreshIp50005oClearingDt();
     }
   		return ip50005oClearingDt;
   }

  
	/**
	*  set variable ip50005oClearingDt
	*  Corresponding COBOL Variable is IP50005O-CLEARING-DT
	*  @param value
	**/
   public void setIp50005oClearingDt(char[] value) {
      ip50005oClearingDt = checkIp50005oClearingDtConstraints(value);
      serializeIp50005oClearingDt(ip50005oClearingDt);
   } 

     /**
	 * 	Update Ip50005oClearingDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005oClearingDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005oClearingDt,ip50005oClearingDt.length);
   	
   }
   
   public void setIp50005oClearingDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oClearingDt,ip50005oClearingDt.length);
   	
   }
   
     /**
	 * 	Update Ip50005oClearingDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oClearingDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oClearingDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005oClearingDt with another Field
	 *	@param value
	 */
   public void setIp50005oClearingDt(Field source) {
       replace(source,0,source.length(),beginIp50005oClearingDt,IP_50005O_CLEARING_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005oClearingDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005oClearingDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005oClearingDt,IP_50005O_CLEARING_DT_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005oClearingDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oClearingDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oClearingDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50005oClearingTm
	 *	@return ip50005oClearingTm
	 */
   public char[] getIp50005oClearingTm() throws CFException{
     if (isIp50005oClearingTmModified()) { 
        ip50005oClearingTm = refreshIp50005oClearingTm();
     }
   		return ip50005oClearingTm;
   }

  
	/**
	*  set variable ip50005oClearingTm
	*  Corresponding COBOL Variable is IP50005O-CLEARING-TM
	*  @param value
	**/
   public void setIp50005oClearingTm(char[] value) {
      ip50005oClearingTm = checkIp50005oClearingTmConstraints(value);
      serializeIp50005oClearingTm(ip50005oClearingTm);
   } 

     /**
	 * 	Update Ip50005oClearingTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005oClearingTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005oClearingTm,ip50005oClearingTm.length);
   	
   }
   
   public void setIp50005oClearingTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oClearingTm,ip50005oClearingTm.length);
   	
   }
   
     /**
	 * 	Update Ip50005oClearingTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oClearingTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oClearingTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005oClearingTm with another Field
	 *	@param value
	 */
   public void setIp50005oClearingTm(Field source) {
       replace(source,0,source.length(),beginIp50005oClearingTm,IP_50005O_CLEARING_TM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005oClearingTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005oClearingTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005oClearingTm,IP_50005O_CLEARING_TM_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005oClearingTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oClearingTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oClearingTm+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50005oClearingDtTm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50005oClearingDt(CONSTANTS.SPACE_8);
         setIp50005oClearingTm(CONSTANTS.SPACE_2);
   }

		public static int getIp50005oClearingDtTmFieldLength() {
			return IP_50005O_CLEARING_DT_TM_LENGTH;
		}

}
  
