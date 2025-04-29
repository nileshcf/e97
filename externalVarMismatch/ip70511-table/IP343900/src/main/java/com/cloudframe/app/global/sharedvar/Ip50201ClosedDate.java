package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201ClosedDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50201ClosedDate extends Ip50201ClosedDateSerialized { 
   

						private char[] ip50201ClosedCcyy = Field.fillLowValue(4);

						private char[] ip50201Filler1 = Field.fillLowValue(1);

						private char[] ip50201ClosedMm = Field.fillLowValue(2);

						private char[] ip50201Filler2 = Field.fillLowValue(1);

						private char[] ip50201ClosedDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50201ClosedDate
	**/
    public Ip50201ClosedDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50201ClosedDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201ClosedDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip50201ClosedCcyy
	 *	@return ip50201ClosedCcyy
	 */
   public char[] getIp50201ClosedCcyy() throws CFException{
     if (isIp50201ClosedCcyyModified()) { 
        ip50201ClosedCcyy = refreshIp50201ClosedCcyy();
     }
   		return ip50201ClosedCcyy;
   }

  
	/**
	*  set variable ip50201ClosedCcyy
	*  Corresponding COBOL Variable is IP50201-CLOSED-CCYY
	*  @param value
	**/
   public void setIp50201ClosedCcyy(char[] value) {
      ip50201ClosedCcyy = checkIp50201ClosedCcyyConstraints(value);
      serializeIp50201ClosedCcyy(ip50201ClosedCcyy);
   } 

     /**
	 * 	Update Ip50201ClosedCcyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201ClosedCcyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50201ClosedCcyy,ip50201ClosedCcyy.length);
   	
   }
   
   public void setIp50201ClosedCcyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ClosedCcyy,ip50201ClosedCcyy.length);
   	
   }
   
     /**
	 * 	Update Ip50201ClosedCcyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedCcyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ClosedCcyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50201ClosedCcyy with another Field
	 *	@param value
	 */
   public void setIp50201ClosedCcyy(Field source) {
       replace(source,0,source.length(),beginIp50201ClosedCcyy,IP_50201_CLOSED_CCYY_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50201ClosedCcyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201ClosedCcyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50201ClosedCcyy,IP_50201_CLOSED_CCYY_LEN);
   	
   }
   
     /**
	 * 	Update Ip50201ClosedCcyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedCcyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ClosedCcyy+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50201Filler1
	 *	@return ip50201Filler1
	 */
   public char[] getIp50201Filler1() throws CFException{
     if (isIp50201Filler1Modified()) { 
        ip50201Filler1 = refreshIp50201Filler1();
     }
   		return ip50201Filler1;
   }

  
	/**
	*  set variable ip50201Filler1
	*  Corresponding COBOL Variable is IP50201-FILLER1
	*  @param value
	**/
   public void setIp50201Filler1(char[] value) {
      ip50201Filler1 = checkIp50201Filler1Constraints(value);
      serializeIp50201Filler1(ip50201Filler1);
   } 

     /**
	 * 	Update Ip50201Filler1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201Filler1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50201Filler1,ip50201Filler1.length);
   	
   }
   
   public void setIp50201Filler1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201Filler1,ip50201Filler1.length);
   	
   }
   
     /**
	 * 	Update Ip50201Filler1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201Filler1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201Filler1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50201Filler1 with another Field
	 *	@param value
	 */
   public void setIp50201Filler1(Field source) {
       replace(source,0,source.length(),beginIp50201Filler1,IP_50201_FILLER_1_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50201Filler1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201Filler1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50201Filler1,IP_50201_FILLER_1_LEN);
   	
   }
   
     /**
	 * 	Update Ip50201Filler1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201Filler1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201Filler1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50201ClosedMm
	 *	@return ip50201ClosedMm
	 */
   public char[] getIp50201ClosedMm() throws CFException{
     if (isIp50201ClosedMmModified()) { 
        ip50201ClosedMm = refreshIp50201ClosedMm();
     }
   		return ip50201ClosedMm;
   }

  
	/**
	*  set variable ip50201ClosedMm
	*  Corresponding COBOL Variable is IP50201-CLOSED-MM
	*  @param value
	**/
   public void setIp50201ClosedMm(char[] value) {
      ip50201ClosedMm = checkIp50201ClosedMmConstraints(value);
      serializeIp50201ClosedMm(ip50201ClosedMm);
   } 

     /**
	 * 	Update Ip50201ClosedMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201ClosedMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50201ClosedMm,ip50201ClosedMm.length);
   	
   }
   
   public void setIp50201ClosedMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ClosedMm,ip50201ClosedMm.length);
   	
   }
   
     /**
	 * 	Update Ip50201ClosedMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ClosedMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50201ClosedMm with another Field
	 *	@param value
	 */
   public void setIp50201ClosedMm(Field source) {
       replace(source,0,source.length(),beginIp50201ClosedMm,IP_50201_CLOSED_MM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50201ClosedMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201ClosedMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50201ClosedMm,IP_50201_CLOSED_MM_LEN);
   	
   }
   
     /**
	 * 	Update Ip50201ClosedMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ClosedMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50201Filler2
	 *	@return ip50201Filler2
	 */
   public char[] getIp50201Filler2() throws CFException{
     if (isIp50201Filler2Modified()) { 
        ip50201Filler2 = refreshIp50201Filler2();
     }
   		return ip50201Filler2;
   }

  
	/**
	*  set variable ip50201Filler2
	*  Corresponding COBOL Variable is IP50201-FILLER2
	*  @param value
	**/
   public void setIp50201Filler2(char[] value) {
      ip50201Filler2 = checkIp50201Filler2Constraints(value);
      serializeIp50201Filler2(ip50201Filler2);
   } 

     /**
	 * 	Update Ip50201Filler2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201Filler2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50201Filler2,ip50201Filler2.length);
   	
   }
   
   public void setIp50201Filler2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201Filler2,ip50201Filler2.length);
   	
   }
   
     /**
	 * 	Update Ip50201Filler2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201Filler2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201Filler2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50201Filler2 with another Field
	 *	@param value
	 */
   public void setIp50201Filler2(Field source) {
       replace(source,0,source.length(),beginIp50201Filler2,IP_50201_FILLER_2_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50201Filler2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201Filler2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50201Filler2,IP_50201_FILLER_2_LEN);
   	
   }
   
     /**
	 * 	Update Ip50201Filler2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201Filler2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201Filler2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50201ClosedDd
	 *	@return ip50201ClosedDd
	 */
   public char[] getIp50201ClosedDd() throws CFException{
     if (isIp50201ClosedDdModified()) { 
        ip50201ClosedDd = refreshIp50201ClosedDd();
     }
   		return ip50201ClosedDd;
   }

  
	/**
	*  set variable ip50201ClosedDd
	*  Corresponding COBOL Variable is IP50201-CLOSED-DD
	*  @param value
	**/
   public void setIp50201ClosedDd(char[] value) {
      ip50201ClosedDd = checkIp50201ClosedDdConstraints(value);
      serializeIp50201ClosedDd(ip50201ClosedDd);
   } 

     /**
	 * 	Update Ip50201ClosedDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201ClosedDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50201ClosedDd,ip50201ClosedDd.length);
   	
   }
   
   public void setIp50201ClosedDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ClosedDd,ip50201ClosedDd.length);
   	
   }
   
     /**
	 * 	Update Ip50201ClosedDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ClosedDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50201ClosedDd with another Field
	 *	@param value
	 */
   public void setIp50201ClosedDd(Field source) {
       replace(source,0,source.length(),beginIp50201ClosedDd,IP_50201_CLOSED_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50201ClosedDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201ClosedDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50201ClosedDd,IP_50201_CLOSED_DD_LEN);
   	
   }
   
     /**
	 * 	Update Ip50201ClosedDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50201ClosedDd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50201ClosedDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50201ClosedCcyy(CONSTANTS.SPACE_4);
         setIp50201Filler1(CONSTANTS.SPACE);
         setIp50201ClosedMm(CONSTANTS.SPACE_2);
         setIp50201Filler2(CONSTANTS.SPACE);
         setIp50201ClosedDd(CONSTANTS.SPACE_2);
   }

		public static int getIp50201ClosedDateFieldLength() {
			return IP_50201_CLOSED_DATE_LENGTH;
		}

}
  
