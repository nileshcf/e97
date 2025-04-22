package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101ChkPtKeyCpt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip32101ChkPtKeyCpt extends Ip32101ChkPtKeyCptSerialized { 
   

						private char[] ip32101ChkJobGrpName = Field.fillLowValue(6);

						private char[] ip32101ChkJobGrpNum = Field.fillLowValue(2);

						private char[] ip32101ChkLrmFiller = Field.fillLowValue(9);
	
	/**
	* Constructor for Ip32101ChkPtKeyCpt
	**/
    public Ip32101ChkPtKeyCpt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip32101ChkPtKeyCpt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtKeyCpt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip32101ChkJobGrpName
	 *	@return ip32101ChkJobGrpName
	 */
   public char[] getIp32101ChkJobGrpName() throws CFException{
     if (isIp32101ChkJobGrpNameModified()) { 
        ip32101ChkJobGrpName = refreshIp32101ChkJobGrpName();
     }
   		return ip32101ChkJobGrpName;
   }

  
	/**
	*  set variable ip32101ChkJobGrpName
	*  Corresponding COBOL Variable is IP32101-CHK-JOB-GRP-NAME
	*  @param value
	**/
   public void setIp32101ChkJobGrpName(char[] value) {
      ip32101ChkJobGrpName = checkIp32101ChkJobGrpNameConstraints(value);
      serializeIp32101ChkJobGrpName(ip32101ChkJobGrpName);
   } 

     /**
	 * 	Update Ip32101ChkJobGrpName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkJobGrpName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101ChkJobGrpName,ip32101ChkJobGrpName.length);
   	
   }
   
   public void setIp32101ChkJobGrpName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkJobGrpName,ip32101ChkJobGrpName.length);
   	
   }
   
     /**
	 * 	Update Ip32101ChkJobGrpName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkJobGrpName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkJobGrpName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101ChkJobGrpName with another Field
	 *	@param value
	 */
   public void setIp32101ChkJobGrpName(Field source) {
       replace(source,0,source.length(),beginIp32101ChkJobGrpName,IP_32101_CHK_JOB_GRP_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101ChkJobGrpName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101ChkJobGrpName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101ChkJobGrpName,IP_32101_CHK_JOB_GRP_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101ChkJobGrpName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkJobGrpName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkJobGrpName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip32101ChkJobGrpNum
	 *	@return ip32101ChkJobGrpNum
	 */
   public char[] getIp32101ChkJobGrpNum() throws CFException{
     if (isIp32101ChkJobGrpNumModified()) { 
        ip32101ChkJobGrpNum = refreshIp32101ChkJobGrpNum();
     }
   		return ip32101ChkJobGrpNum;
   }

  
	/**
	*  set variable ip32101ChkJobGrpNum
	*  Corresponding COBOL Variable is IP32101-CHK-JOB-GRP-NUM
	*  @param value
	**/
   public void setIp32101ChkJobGrpNum(char[] value) {
      ip32101ChkJobGrpNum = checkIp32101ChkJobGrpNumConstraints(value);
      serializeIp32101ChkJobGrpNum(ip32101ChkJobGrpNum);
   } 

     /**
	 * 	Update Ip32101ChkJobGrpNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkJobGrpNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101ChkJobGrpNum,ip32101ChkJobGrpNum.length);
   	
   }
   
   public void setIp32101ChkJobGrpNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkJobGrpNum,ip32101ChkJobGrpNum.length);
   	
   }
   
     /**
	 * 	Update Ip32101ChkJobGrpNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkJobGrpNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkJobGrpNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101ChkJobGrpNum with another Field
	 *	@param value
	 */
   public void setIp32101ChkJobGrpNum(Field source) {
       replace(source,0,source.length(),beginIp32101ChkJobGrpNum,IP_32101_CHK_JOB_GRP_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101ChkJobGrpNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101ChkJobGrpNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101ChkJobGrpNum,IP_32101_CHK_JOB_GRP_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101ChkJobGrpNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkJobGrpNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkJobGrpNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip32101ChkLrmFiller
	 *	@return ip32101ChkLrmFiller
	 */
   public char[] getIp32101ChkLrmFiller() throws CFException{
     if (isIp32101ChkLrmFillerModified()) { 
        ip32101ChkLrmFiller = refreshIp32101ChkLrmFiller();
     }
   		return ip32101ChkLrmFiller;
   }

  
	/**
	*  set variable ip32101ChkLrmFiller
	*  Corresponding COBOL Variable is IP32101-CHK-LRM-FILLER
	*  @param value
	**/
   public void setIp32101ChkLrmFiller(char[] value) {
      ip32101ChkLrmFiller = checkIp32101ChkLrmFillerConstraints(value);
      serializeIp32101ChkLrmFiller(ip32101ChkLrmFiller);
   } 

     /**
	 * 	Update Ip32101ChkLrmFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkLrmFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101ChkLrmFiller,ip32101ChkLrmFiller.length);
   	
   }
   
   public void setIp32101ChkLrmFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkLrmFiller,ip32101ChkLrmFiller.length);
   	
   }
   
     /**
	 * 	Update Ip32101ChkLrmFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkLrmFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkLrmFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101ChkLrmFiller with another Field
	 *	@param value
	 */
   public void setIp32101ChkLrmFiller(Field source) {
       replace(source,0,source.length(),beginIp32101ChkLrmFiller,IP_32101_CHK_LRM_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101ChkLrmFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101ChkLrmFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101ChkLrmFiller,IP_32101_CHK_LRM_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101ChkLrmFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkLrmFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkLrmFiller+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip32101ChkPtKeyCpt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp32101ChkJobGrpName(CONSTANTS.SPACE_6);
         setIp32101ChkJobGrpNum(CONSTANTS.SPACE_2);
         setIp32101ChkLrmFiller(CONSTANTS.SPACE_9);
   }

		public static int getIp32101ChkPtKeyCptFieldLength() {
			return IP_32101_CHK_PT_KEY_CPT_LENGTH;
		}

}
  
