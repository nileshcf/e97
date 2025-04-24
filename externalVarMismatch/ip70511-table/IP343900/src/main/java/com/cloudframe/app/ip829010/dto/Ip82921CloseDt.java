package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921CloseDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip82921CloseDt extends Ip82921CloseDtSerialized { 
   

						private char[] ip82921ClosedCcyy = Field.fillLowValue(4);

						private char[] ip82921Filler1 = Field.fillLowValue(1);

						private char[] ip82921ClosedMm = Field.fillLowValue(2);

						private char[] ip82921Filler2 = Field.fillLowValue(1);

						private char[] ip82921ClosedDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip82921CloseDt
	**/
    public Ip82921CloseDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip82921CloseDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921CloseDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip82921ClosedCcyy
	 *	@return ip82921ClosedCcyy
	 */
   public char[] getIp82921ClosedCcyy() throws CFException{
     if (isIp82921ClosedCcyyModified()) { 
        ip82921ClosedCcyy = refreshIp82921ClosedCcyy();
     }
   		return ip82921ClosedCcyy;
   }

  
	/**
	*  set variable ip82921ClosedCcyy
	*  Corresponding COBOL Variable is IP82921-CLOSED-CCYY
	*  @param value
	**/
   public void setIp82921ClosedCcyy(char[] value) {
      ip82921ClosedCcyy = checkIp82921ClosedCcyyConstraints(value);
      serializeIp82921ClosedCcyy(ip82921ClosedCcyy);
   } 

     /**
	 * 	Update Ip82921ClosedCcyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ClosedCcyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ClosedCcyy,ip82921ClosedCcyy.length);
   	
   }
   
   public void setIp82921ClosedCcyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ClosedCcyy,ip82921ClosedCcyy.length);
   	
   }
   
     /**
	 * 	Update Ip82921ClosedCcyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ClosedCcyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ClosedCcyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ClosedCcyy with another Field
	 *	@param value
	 */
   public void setIp82921ClosedCcyy(Field source) {
       replace(source,0,source.length(),beginIp82921ClosedCcyy,IP_82921_CLOSED_CCYY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ClosedCcyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ClosedCcyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ClosedCcyy,IP_82921_CLOSED_CCYY_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ClosedCcyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ClosedCcyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ClosedCcyy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921Filler1
	 *	@return ip82921Filler1
	 */
   public char[] getIp82921Filler1() throws CFException{
     if (isIp82921Filler1Modified()) { 
        ip82921Filler1 = refreshIp82921Filler1();
     }
   		return ip82921Filler1;
   }

  
	/**
	*  set variable ip82921Filler1
	*  Corresponding COBOL Variable is IP82921-FILLER1
	*  @param value
	**/
   public void setIp82921Filler1(char[] value) {
      ip82921Filler1 = checkIp82921Filler1Constraints(value);
      serializeIp82921Filler1(ip82921Filler1);
   } 

     /**
	 * 	Update Ip82921Filler1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921Filler1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921Filler1,ip82921Filler1.length);
   	
   }
   
   public void setIp82921Filler1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921Filler1,ip82921Filler1.length);
   	
   }
   
     /**
	 * 	Update Ip82921Filler1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921Filler1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921Filler1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921Filler1 with another Field
	 *	@param value
	 */
   public void setIp82921Filler1(Field source) {
       replace(source,0,source.length(),beginIp82921Filler1,IP_82921_FILLER_1_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921Filler1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921Filler1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921Filler1,IP_82921_FILLER_1_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921Filler1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921Filler1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921Filler1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921ClosedMm
	 *	@return ip82921ClosedMm
	 */
   public char[] getIp82921ClosedMm() throws CFException{
     if (isIp82921ClosedMmModified()) { 
        ip82921ClosedMm = refreshIp82921ClosedMm();
     }
   		return ip82921ClosedMm;
   }

  
	/**
	*  set variable ip82921ClosedMm
	*  Corresponding COBOL Variable is IP82921-CLOSED-MM
	*  @param value
	**/
   public void setIp82921ClosedMm(char[] value) {
      ip82921ClosedMm = checkIp82921ClosedMmConstraints(value);
      serializeIp82921ClosedMm(ip82921ClosedMm);
   } 

     /**
	 * 	Update Ip82921ClosedMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ClosedMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ClosedMm,ip82921ClosedMm.length);
   	
   }
   
   public void setIp82921ClosedMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ClosedMm,ip82921ClosedMm.length);
   	
   }
   
     /**
	 * 	Update Ip82921ClosedMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ClosedMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ClosedMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ClosedMm with another Field
	 *	@param value
	 */
   public void setIp82921ClosedMm(Field source) {
       replace(source,0,source.length(),beginIp82921ClosedMm,IP_82921_CLOSED_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ClosedMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ClosedMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ClosedMm,IP_82921_CLOSED_MM_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ClosedMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ClosedMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ClosedMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921Filler2
	 *	@return ip82921Filler2
	 */
   public char[] getIp82921Filler2() throws CFException{
     if (isIp82921Filler2Modified()) { 
        ip82921Filler2 = refreshIp82921Filler2();
     }
   		return ip82921Filler2;
   }

  
	/**
	*  set variable ip82921Filler2
	*  Corresponding COBOL Variable is IP82921-FILLER2
	*  @param value
	**/
   public void setIp82921Filler2(char[] value) {
      ip82921Filler2 = checkIp82921Filler2Constraints(value);
      serializeIp82921Filler2(ip82921Filler2);
   } 

     /**
	 * 	Update Ip82921Filler2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921Filler2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921Filler2,ip82921Filler2.length);
   	
   }
   
   public void setIp82921Filler2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921Filler2,ip82921Filler2.length);
   	
   }
   
     /**
	 * 	Update Ip82921Filler2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921Filler2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921Filler2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921Filler2 with another Field
	 *	@param value
	 */
   public void setIp82921Filler2(Field source) {
       replace(source,0,source.length(),beginIp82921Filler2,IP_82921_FILLER_2_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921Filler2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921Filler2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921Filler2,IP_82921_FILLER_2_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921Filler2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921Filler2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921Filler2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921ClosedDd
	 *	@return ip82921ClosedDd
	 */
   public char[] getIp82921ClosedDd() throws CFException{
     if (isIp82921ClosedDdModified()) { 
        ip82921ClosedDd = refreshIp82921ClosedDd();
     }
   		return ip82921ClosedDd;
   }

  
	/**
	*  set variable ip82921ClosedDd
	*  Corresponding COBOL Variable is IP82921-CLOSED-DD
	*  @param value
	**/
   public void setIp82921ClosedDd(char[] value) {
      ip82921ClosedDd = checkIp82921ClosedDdConstraints(value);
      serializeIp82921ClosedDd(ip82921ClosedDd);
   } 

     /**
	 * 	Update Ip82921ClosedDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ClosedDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ClosedDd,ip82921ClosedDd.length);
   	
   }
   
   public void setIp82921ClosedDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ClosedDd,ip82921ClosedDd.length);
   	
   }
   
     /**
	 * 	Update Ip82921ClosedDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ClosedDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ClosedDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ClosedDd with another Field
	 *	@param value
	 */
   public void setIp82921ClosedDd(Field source) {
       replace(source,0,source.length(),beginIp82921ClosedDd,IP_82921_CLOSED_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ClosedDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ClosedDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ClosedDd,IP_82921_CLOSED_DD_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ClosedDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ClosedDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ClosedDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip82921CloseDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp82921ClosedCcyy(CONSTANTS.SPACE_4);
         setIp82921Filler1(CONSTANTS.SPACE);
         setIp82921ClosedMm(CONSTANTS.SPACE_2);
         setIp82921Filler2(CONSTANTS.SPACE);
         setIp82921ClosedDd(CONSTANTS.SPACE_2);
   }

		public static int getIp82921CloseDtFieldLength() {
			return IP_82921_CLOSE_DT_LENGTH;
		}

}
  
