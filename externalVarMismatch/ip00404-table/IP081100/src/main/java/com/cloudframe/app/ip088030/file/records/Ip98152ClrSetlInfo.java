package com.cloudframe.app.ip088030.file.records;

/**
*  The class Ip98152ClrSetlInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip088030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip98152ClrSetlInfo extends Ip98152ClrSetlInfoSerialized { 
   

						private char[] ip98152ClrMbrCurCd = Field.fillLowValue(3);

						private char[] ip98152ClrMbrCurExp = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip98152ClrSetlInfo
	**/
    public Ip98152ClrSetlInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip98152ClrSetlInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98152ClrSetlInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip98152ClrMbrCurCd
	 *	@return ip98152ClrMbrCurCd
	 */
   public char[] getIp98152ClrMbrCurCd() throws CFException{
     if (isIp98152ClrMbrCurCdModified()) { 
        ip98152ClrMbrCurCd = refreshIp98152ClrMbrCurCd();
     }
   		return ip98152ClrMbrCurCd;
   }

  
	/**
	*  set variable ip98152ClrMbrCurCd
	*  Corresponding COBOL Variable is IP98152-CLR-MBR-CUR-CD
	*  @param value
	**/
   public void setIp98152ClrMbrCurCd(char[] value) {
      ip98152ClrMbrCurCd = checkIp98152ClrMbrCurCdConstraints(value);
      serializeIp98152ClrMbrCurCd(ip98152ClrMbrCurCd);
   } 

     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98152ClrMbrCurCd,ip98152ClrMbrCurCd.length);
   	
   }
   
   public void setIp98152ClrMbrCurCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ClrMbrCurCd,ip98152ClrMbrCurCd.length);
   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ClrMbrCurCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98152ClrMbrCurCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(Field source) {
       replace(source,0,source.length(),beginIp98152ClrMbrCurCd,IP_98152_CLR_MBR_CUR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98152ClrMbrCurCd,IP_98152_CLR_MBR_CUR_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ClrMbrCurCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98152ClrMbrCurExp
	 *	@return ip98152ClrMbrCurExp
	 */
   public char[] getIp98152ClrMbrCurExp() throws CFException{
     if (isIp98152ClrMbrCurExpModified()) { 
        ip98152ClrMbrCurExp = refreshIp98152ClrMbrCurExp();
     }
   		return ip98152ClrMbrCurExp;
   }

  
	/**
	*  set variable ip98152ClrMbrCurExp
	*  Corresponding COBOL Variable is IP98152-CLR-MBR-CUR-EXP
	*  @param value
	**/
   public void setIp98152ClrMbrCurExp(char[] value) {
      ip98152ClrMbrCurExp = checkIp98152ClrMbrCurExpConstraints(value);
      serializeIp98152ClrMbrCurExp(ip98152ClrMbrCurExp);
   } 

     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98152ClrMbrCurExp,ip98152ClrMbrCurExp.length);
   	
   }
   
   public void setIp98152ClrMbrCurExp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ClrMbrCurExp,ip98152ClrMbrCurExp.length);
   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ClrMbrCurExp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98152ClrMbrCurExp with another Field
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(Field source) {
       replace(source,0,source.length(),beginIp98152ClrMbrCurExp,IP_98152_CLR_MBR_CUR_EXP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98152ClrMbrCurExp,IP_98152_CLR_MBR_CUR_EXP_LEN);
   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ClrMbrCurExp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp98152ClrSetlInfoFieldLength() {
			return IP_98152_CLR_SETL_INFO_LENGTH;
		}

}
  
