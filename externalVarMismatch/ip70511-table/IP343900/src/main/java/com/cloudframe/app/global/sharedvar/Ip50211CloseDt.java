package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211CloseDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50211CloseDt extends Ip50211CloseDtSerialized { 
   

						private char[] ip50211ClosedCcyy = Field.fillLowValue(4);

						private char[] ip50211Filler1 = Field.fillLowValue(1);

						private char[] ip50211ClosedMm = Field.fillLowValue(2);

						private char[] ip50211Filler2 = Field.fillLowValue(1);

						private char[] ip50211ClosedDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50211CloseDt
	**/
    public Ip50211CloseDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50211CloseDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211CloseDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip50211ClosedCcyy
	 *	@return ip50211ClosedCcyy
	 */
   public char[] getIp50211ClosedCcyy() throws CFException{
     if (isIp50211ClosedCcyyModified()) { 
        ip50211ClosedCcyy = refreshIp50211ClosedCcyy();
     }
   		return ip50211ClosedCcyy;
   }

  
	/**
	*  set variable ip50211ClosedCcyy
	*  Corresponding COBOL Variable is IP50211-CLOSED-CCYY
	*  @param value
	**/
   public void setIp50211ClosedCcyy(char[] value) {
      ip50211ClosedCcyy = checkIp50211ClosedCcyyConstraints(value);
      serializeIp50211ClosedCcyy(ip50211ClosedCcyy);
   } 

     /**
	 * 	Update Ip50211ClosedCcyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211ClosedCcyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211ClosedCcyy,ip50211ClosedCcyy.length);
   	
   }
   
   public void setIp50211ClosedCcyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ClosedCcyy,ip50211ClosedCcyy.length);
   	
   }
   
     /**
	 * 	Update Ip50211ClosedCcyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ClosedCcyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ClosedCcyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211ClosedCcyy with another Field
	 *	@param value
	 */
   public void setIp50211ClosedCcyy(Field source) {
       replace(source,0,source.length(),beginIp50211ClosedCcyy,IP_50211_CLOSED_CCYY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211ClosedCcyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211ClosedCcyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211ClosedCcyy,IP_50211_CLOSED_CCYY_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211ClosedCcyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ClosedCcyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ClosedCcyy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211Filler1
	 *	@return ip50211Filler1
	 */
   public char[] getIp50211Filler1() throws CFException{
     if (isIp50211Filler1Modified()) { 
        ip50211Filler1 = refreshIp50211Filler1();
     }
   		return ip50211Filler1;
   }

  
	/**
	*  set variable ip50211Filler1
	*  Corresponding COBOL Variable is IP50211-FILLER1
	*  @param value
	**/
   public void setIp50211Filler1(char[] value) {
      ip50211Filler1 = checkIp50211Filler1Constraints(value);
      serializeIp50211Filler1(ip50211Filler1);
   } 

     /**
	 * 	Update Ip50211Filler1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211Filler1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211Filler1,ip50211Filler1.length);
   	
   }
   
   public void setIp50211Filler1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211Filler1,ip50211Filler1.length);
   	
   }
   
     /**
	 * 	Update Ip50211Filler1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211Filler1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211Filler1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211Filler1 with another Field
	 *	@param value
	 */
   public void setIp50211Filler1(Field source) {
       replace(source,0,source.length(),beginIp50211Filler1,IP_50211_FILLER_1_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211Filler1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211Filler1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211Filler1,IP_50211_FILLER_1_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211Filler1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211Filler1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211Filler1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211ClosedMm
	 *	@return ip50211ClosedMm
	 */
   public char[] getIp50211ClosedMm() throws CFException{
     if (isIp50211ClosedMmModified()) { 
        ip50211ClosedMm = refreshIp50211ClosedMm();
     }
   		return ip50211ClosedMm;
   }

  
	/**
	*  set variable ip50211ClosedMm
	*  Corresponding COBOL Variable is IP50211-CLOSED-MM
	*  @param value
	**/
   public void setIp50211ClosedMm(char[] value) {
      ip50211ClosedMm = checkIp50211ClosedMmConstraints(value);
      serializeIp50211ClosedMm(ip50211ClosedMm);
   } 

     /**
	 * 	Update Ip50211ClosedMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211ClosedMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211ClosedMm,ip50211ClosedMm.length);
   	
   }
   
   public void setIp50211ClosedMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ClosedMm,ip50211ClosedMm.length);
   	
   }
   
     /**
	 * 	Update Ip50211ClosedMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ClosedMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ClosedMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211ClosedMm with another Field
	 *	@param value
	 */
   public void setIp50211ClosedMm(Field source) {
       replace(source,0,source.length(),beginIp50211ClosedMm,IP_50211_CLOSED_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211ClosedMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211ClosedMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211ClosedMm,IP_50211_CLOSED_MM_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211ClosedMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ClosedMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ClosedMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211Filler2
	 *	@return ip50211Filler2
	 */
   public char[] getIp50211Filler2() throws CFException{
     if (isIp50211Filler2Modified()) { 
        ip50211Filler2 = refreshIp50211Filler2();
     }
   		return ip50211Filler2;
   }

  
	/**
	*  set variable ip50211Filler2
	*  Corresponding COBOL Variable is IP50211-FILLER2
	*  @param value
	**/
   public void setIp50211Filler2(char[] value) {
      ip50211Filler2 = checkIp50211Filler2Constraints(value);
      serializeIp50211Filler2(ip50211Filler2);
   } 

     /**
	 * 	Update Ip50211Filler2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211Filler2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211Filler2,ip50211Filler2.length);
   	
   }
   
   public void setIp50211Filler2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211Filler2,ip50211Filler2.length);
   	
   }
   
     /**
	 * 	Update Ip50211Filler2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211Filler2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211Filler2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211Filler2 with another Field
	 *	@param value
	 */
   public void setIp50211Filler2(Field source) {
       replace(source,0,source.length(),beginIp50211Filler2,IP_50211_FILLER_2_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211Filler2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211Filler2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211Filler2,IP_50211_FILLER_2_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211Filler2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211Filler2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211Filler2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211ClosedDd
	 *	@return ip50211ClosedDd
	 */
   public char[] getIp50211ClosedDd() throws CFException{
     if (isIp50211ClosedDdModified()) { 
        ip50211ClosedDd = refreshIp50211ClosedDd();
     }
   		return ip50211ClosedDd;
   }

  
	/**
	*  set variable ip50211ClosedDd
	*  Corresponding COBOL Variable is IP50211-CLOSED-DD
	*  @param value
	**/
   public void setIp50211ClosedDd(char[] value) {
      ip50211ClosedDd = checkIp50211ClosedDdConstraints(value);
      serializeIp50211ClosedDd(ip50211ClosedDd);
   } 

     /**
	 * 	Update Ip50211ClosedDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211ClosedDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211ClosedDd,ip50211ClosedDd.length);
   	
   }
   
   public void setIp50211ClosedDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ClosedDd,ip50211ClosedDd.length);
   	
   }
   
     /**
	 * 	Update Ip50211ClosedDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ClosedDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ClosedDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211ClosedDd with another Field
	 *	@param value
	 */
   public void setIp50211ClosedDd(Field source) {
       replace(source,0,source.length(),beginIp50211ClosedDd,IP_50211_CLOSED_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211ClosedDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211ClosedDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211ClosedDd,IP_50211_CLOSED_DD_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211ClosedDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ClosedDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ClosedDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50211CloseDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50211ClosedCcyy(CONSTANTS.SPACE_4);
         setIp50211Filler1(CONSTANTS.SPACE);
         setIp50211ClosedMm(CONSTANTS.SPACE_2);
         setIp50211Filler2(CONSTANTS.SPACE);
         setIp50211ClosedDd(CONSTANTS.SPACE_2);
   }

		public static int getIp50211CloseDtFieldLength() {
			return IP_50211_CLOSE_DT_LENGTH;
		}

}
  
