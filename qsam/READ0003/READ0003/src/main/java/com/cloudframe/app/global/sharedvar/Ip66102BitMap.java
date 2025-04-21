package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66102BitMap is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:58. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip66102BitMap extends Ip66102BitMapSerialized { 
   

						private char[] ip66102BitByte1 = Field.fillLowValue(1);

						private char[] ip66102BitByte2 = Field.fillLowValue(1);

						private char[] ip66102BitByte3 = Field.fillLowValue(1);

						private char[] ip66102BitByte4 = Field.fillLowValue(1);

						private char[] ip66102BitByte5 = Field.fillLowValue(1);

						private char[] ip66102BitByte6 = Field.fillLowValue(1);

						private char[] ip66102BitByte7 = Field.fillLowValue(1);

						private char[] ip66102BitByte8 = Field.fillLowValue(1);

						private char[] ip66102BitByte9 = Field.fillLowValue(1);

						private char[] ip66102BitByte10 = Field.fillLowValue(1);

						private char[] ip66102BitByte11 = Field.fillLowValue(1);

						private char[] ip66102BitByte12 = Field.fillLowValue(1);

						private char[] ip66102BitByte13 = Field.fillLowValue(1);

						private char[] ip66102BitByte14 = Field.fillLowValue(1);

						private char[] ip66102BitByte15 = Field.fillLowValue(1);

						private char[] ip66102BitByte16 = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip66102BitMap
	**/
    public Ip66102BitMap() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip66102BitMap. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66102BitMap(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip66102BitByte1
	 *	@return ip66102BitByte1
	 */
   public char[] getIp66102BitByte1() throws CFException{
     if (isIp66102BitByte1Modified()) { 
        ip66102BitByte1 = refreshIp66102BitByte1();
     }
   		return ip66102BitByte1;
   }

  
	/**
	*  set variable ip66102BitByte1
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-1
	*  @param value
	**/
   public void setIp66102BitByte1(char[] value) {
      ip66102BitByte1 = checkIp66102BitByte1Constraints(value);
      serializeIp66102BitByte1(ip66102BitByte1);
   } 

     /**
	 * 	Update Ip66102BitByte1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte1,ip66102BitByte1.length);
   	
   }
   
   public void setIp66102BitByte1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte1,ip66102BitByte1.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte1 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte1(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte1,IP_66102_BIT_BYTE_1_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte1,IP_66102_BIT_BYTE_1_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte2
	 *	@return ip66102BitByte2
	 */
   public char[] getIp66102BitByte2() throws CFException{
     if (isIp66102BitByte2Modified()) { 
        ip66102BitByte2 = refreshIp66102BitByte2();
     }
   		return ip66102BitByte2;
   }

  
	/**
	*  set variable ip66102BitByte2
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-2
	*  @param value
	**/
   public void setIp66102BitByte2(char[] value) {
      ip66102BitByte2 = checkIp66102BitByte2Constraints(value);
      serializeIp66102BitByte2(ip66102BitByte2);
   } 

     /**
	 * 	Update Ip66102BitByte2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte2,ip66102BitByte2.length);
   	
   }
   
   public void setIp66102BitByte2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte2,ip66102BitByte2.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte2 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte2(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte2,IP_66102_BIT_BYTE_2_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte2,IP_66102_BIT_BYTE_2_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte3
	 *	@return ip66102BitByte3
	 */
   public char[] getIp66102BitByte3() throws CFException{
     if (isIp66102BitByte3Modified()) { 
        ip66102BitByte3 = refreshIp66102BitByte3();
     }
   		return ip66102BitByte3;
   }

  
	/**
	*  set variable ip66102BitByte3
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-3
	*  @param value
	**/
   public void setIp66102BitByte3(char[] value) {
      ip66102BitByte3 = checkIp66102BitByte3Constraints(value);
      serializeIp66102BitByte3(ip66102BitByte3);
   } 

     /**
	 * 	Update Ip66102BitByte3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte3,ip66102BitByte3.length);
   	
   }
   
   public void setIp66102BitByte3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte3,ip66102BitByte3.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte3 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte3(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte3,IP_66102_BIT_BYTE_3_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte3,IP_66102_BIT_BYTE_3_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte4
	 *	@return ip66102BitByte4
	 */
   public char[] getIp66102BitByte4() throws CFException{
     if (isIp66102BitByte4Modified()) { 
        ip66102BitByte4 = refreshIp66102BitByte4();
     }
   		return ip66102BitByte4;
   }

  
	/**
	*  set variable ip66102BitByte4
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-4
	*  @param value
	**/
   public void setIp66102BitByte4(char[] value) {
      ip66102BitByte4 = checkIp66102BitByte4Constraints(value);
      serializeIp66102BitByte4(ip66102BitByte4);
   } 

     /**
	 * 	Update Ip66102BitByte4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte4,ip66102BitByte4.length);
   	
   }
   
   public void setIp66102BitByte4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte4,ip66102BitByte4.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte4 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte4(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte4,IP_66102_BIT_BYTE_4_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte4,IP_66102_BIT_BYTE_4_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte5
	 *	@return ip66102BitByte5
	 */
   public char[] getIp66102BitByte5() throws CFException{
     if (isIp66102BitByte5Modified()) { 
        ip66102BitByte5 = refreshIp66102BitByte5();
     }
   		return ip66102BitByte5;
   }

  
	/**
	*  set variable ip66102BitByte5
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-5
	*  @param value
	**/
   public void setIp66102BitByte5(char[] value) {
      ip66102BitByte5 = checkIp66102BitByte5Constraints(value);
      serializeIp66102BitByte5(ip66102BitByte5);
   } 

     /**
	 * 	Update Ip66102BitByte5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte5,ip66102BitByte5.length);
   	
   }
   
   public void setIp66102BitByte5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte5,ip66102BitByte5.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte5 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte5(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte5,IP_66102_BIT_BYTE_5_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte5,IP_66102_BIT_BYTE_5_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte6
	 *	@return ip66102BitByte6
	 */
   public char[] getIp66102BitByte6() throws CFException{
     if (isIp66102BitByte6Modified()) { 
        ip66102BitByte6 = refreshIp66102BitByte6();
     }
   		return ip66102BitByte6;
   }

  
	/**
	*  set variable ip66102BitByte6
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-6
	*  @param value
	**/
   public void setIp66102BitByte6(char[] value) {
      ip66102BitByte6 = checkIp66102BitByte6Constraints(value);
      serializeIp66102BitByte6(ip66102BitByte6);
   } 

     /**
	 * 	Update Ip66102BitByte6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte6,ip66102BitByte6.length);
   	
   }
   
   public void setIp66102BitByte6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte6,ip66102BitByte6.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte6 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte6(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte6,IP_66102_BIT_BYTE_6_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte6,IP_66102_BIT_BYTE_6_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte7
	 *	@return ip66102BitByte7
	 */
   public char[] getIp66102BitByte7() throws CFException{
     if (isIp66102BitByte7Modified()) { 
        ip66102BitByte7 = refreshIp66102BitByte7();
     }
   		return ip66102BitByte7;
   }

  
	/**
	*  set variable ip66102BitByte7
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-7
	*  @param value
	**/
   public void setIp66102BitByte7(char[] value) {
      ip66102BitByte7 = checkIp66102BitByte7Constraints(value);
      serializeIp66102BitByte7(ip66102BitByte7);
   } 

     /**
	 * 	Update Ip66102BitByte7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte7,ip66102BitByte7.length);
   	
   }
   
   public void setIp66102BitByte7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte7,ip66102BitByte7.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte7 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte7(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte7,IP_66102_BIT_BYTE_7_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte7,IP_66102_BIT_BYTE_7_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte7+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte8
	 *	@return ip66102BitByte8
	 */
   public char[] getIp66102BitByte8() throws CFException{
     if (isIp66102BitByte8Modified()) { 
        ip66102BitByte8 = refreshIp66102BitByte8();
     }
   		return ip66102BitByte8;
   }

  
	/**
	*  set variable ip66102BitByte8
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-8
	*  @param value
	**/
   public void setIp66102BitByte8(char[] value) {
      ip66102BitByte8 = checkIp66102BitByte8Constraints(value);
      serializeIp66102BitByte8(ip66102BitByte8);
   } 

     /**
	 * 	Update Ip66102BitByte8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte8,ip66102BitByte8.length);
   	
   }
   
   public void setIp66102BitByte8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte8,ip66102BitByte8.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte8 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte8(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte8,IP_66102_BIT_BYTE_8_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte8,IP_66102_BIT_BYTE_8_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte8+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte9
	 *	@return ip66102BitByte9
	 */
   public char[] getIp66102BitByte9() throws CFException{
     if (isIp66102BitByte9Modified()) { 
        ip66102BitByte9 = refreshIp66102BitByte9();
     }
   		return ip66102BitByte9;
   }

  
	/**
	*  set variable ip66102BitByte9
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-9
	*  @param value
	**/
   public void setIp66102BitByte9(char[] value) {
      ip66102BitByte9 = checkIp66102BitByte9Constraints(value);
      serializeIp66102BitByte9(ip66102BitByte9);
   } 

     /**
	 * 	Update Ip66102BitByte9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte9(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte9,ip66102BitByte9.length);
   	
   }
   
   public void setIp66102BitByte9(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte9,ip66102BitByte9.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte9+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte9 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte9(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte9,IP_66102_BIT_BYTE_9_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte9(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte9,IP_66102_BIT_BYTE_9_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte9+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte10
	 *	@return ip66102BitByte10
	 */
   public char[] getIp66102BitByte10() throws CFException{
     if (isIp66102BitByte10Modified()) { 
        ip66102BitByte10 = refreshIp66102BitByte10();
     }
   		return ip66102BitByte10;
   }

  
	/**
	*  set variable ip66102BitByte10
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-10
	*  @param value
	**/
   public void setIp66102BitByte10(char[] value) {
      ip66102BitByte10 = checkIp66102BitByte10Constraints(value);
      serializeIp66102BitByte10(ip66102BitByte10);
   } 

     /**
	 * 	Update Ip66102BitByte10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte10,ip66102BitByte10.length);
   	
   }
   
   public void setIp66102BitByte10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte10,ip66102BitByte10.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte10 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte10(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte10,IP_66102_BIT_BYTE_10_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte10,IP_66102_BIT_BYTE_10_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte10+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte11
	 *	@return ip66102BitByte11
	 */
   public char[] getIp66102BitByte11() throws CFException{
     if (isIp66102BitByte11Modified()) { 
        ip66102BitByte11 = refreshIp66102BitByte11();
     }
   		return ip66102BitByte11;
   }

  
	/**
	*  set variable ip66102BitByte11
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-11
	*  @param value
	**/
   public void setIp66102BitByte11(char[] value) {
      ip66102BitByte11 = checkIp66102BitByte11Constraints(value);
      serializeIp66102BitByte11(ip66102BitByte11);
   } 

     /**
	 * 	Update Ip66102BitByte11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte11,ip66102BitByte11.length);
   	
   }
   
   public void setIp66102BitByte11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte11,ip66102BitByte11.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte11 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte11(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte11,IP_66102_BIT_BYTE_11_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte11,IP_66102_BIT_BYTE_11_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte12
	 *	@return ip66102BitByte12
	 */
   public char[] getIp66102BitByte12() throws CFException{
     if (isIp66102BitByte12Modified()) { 
        ip66102BitByte12 = refreshIp66102BitByte12();
     }
   		return ip66102BitByte12;
   }

  
	/**
	*  set variable ip66102BitByte12
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-12
	*  @param value
	**/
   public void setIp66102BitByte12(char[] value) {
      ip66102BitByte12 = checkIp66102BitByte12Constraints(value);
      serializeIp66102BitByte12(ip66102BitByte12);
   } 

     /**
	 * 	Update Ip66102BitByte12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte12,ip66102BitByte12.length);
   	
   }
   
   public void setIp66102BitByte12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte12,ip66102BitByte12.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte12 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte12(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte12,IP_66102_BIT_BYTE_12_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte12,IP_66102_BIT_BYTE_12_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte12+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte13
	 *	@return ip66102BitByte13
	 */
   public char[] getIp66102BitByte13() throws CFException{
     if (isIp66102BitByte13Modified()) { 
        ip66102BitByte13 = refreshIp66102BitByte13();
     }
   		return ip66102BitByte13;
   }

  
	/**
	*  set variable ip66102BitByte13
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-13
	*  @param value
	**/
   public void setIp66102BitByte13(char[] value) {
      ip66102BitByte13 = checkIp66102BitByte13Constraints(value);
      serializeIp66102BitByte13(ip66102BitByte13);
   } 

     /**
	 * 	Update Ip66102BitByte13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte13,ip66102BitByte13.length);
   	
   }
   
   public void setIp66102BitByte13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte13,ip66102BitByte13.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte13 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte13(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte13,IP_66102_BIT_BYTE_13_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte13,IP_66102_BIT_BYTE_13_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte14
	 *	@return ip66102BitByte14
	 */
   public char[] getIp66102BitByte14() throws CFException{
     if (isIp66102BitByte14Modified()) { 
        ip66102BitByte14 = refreshIp66102BitByte14();
     }
   		return ip66102BitByte14;
   }

  
	/**
	*  set variable ip66102BitByte14
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-14
	*  @param value
	**/
   public void setIp66102BitByte14(char[] value) {
      ip66102BitByte14 = checkIp66102BitByte14Constraints(value);
      serializeIp66102BitByte14(ip66102BitByte14);
   } 

     /**
	 * 	Update Ip66102BitByte14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte14,ip66102BitByte14.length);
   	
   }
   
   public void setIp66102BitByte14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte14,ip66102BitByte14.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte14 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte14(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte14,IP_66102_BIT_BYTE_14_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte14,IP_66102_BIT_BYTE_14_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte14+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte15
	 *	@return ip66102BitByte15
	 */
   public char[] getIp66102BitByte15() throws CFException{
     if (isIp66102BitByte15Modified()) { 
        ip66102BitByte15 = refreshIp66102BitByte15();
     }
   		return ip66102BitByte15;
   }

  
	/**
	*  set variable ip66102BitByte15
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-15
	*  @param value
	**/
   public void setIp66102BitByte15(char[] value) {
      ip66102BitByte15 = checkIp66102BitByte15Constraints(value);
      serializeIp66102BitByte15(ip66102BitByte15);
   } 

     /**
	 * 	Update Ip66102BitByte15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte15,ip66102BitByte15.length);
   	
   }
   
   public void setIp66102BitByte15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte15,ip66102BitByte15.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte15 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte15(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte15,IP_66102_BIT_BYTE_15_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte15,IP_66102_BIT_BYTE_15_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip66102BitByte16
	 *	@return ip66102BitByte16
	 */
   public char[] getIp66102BitByte16() throws CFException{
     if (isIp66102BitByte16Modified()) { 
        ip66102BitByte16 = refreshIp66102BitByte16();
     }
   		return ip66102BitByte16;
   }

  
	/**
	*  set variable ip66102BitByte16
	*  Corresponding COBOL Variable is IP66102-BIT-BYTE-16
	*  @param value
	**/
   public void setIp66102BitByte16(char[] value) {
      ip66102BitByte16 = checkIp66102BitByte16Constraints(value);
      serializeIp66102BitByte16(ip66102BitByte16);
   } 

     /**
	 * 	Update Ip66102BitByte16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitByte16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102BitByte16,ip66102BitByte16.length);
   	
   }
   
   public void setIp66102BitByte16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte16,ip66102BitByte16.length);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102BitByte16 with another Field
	 *	@param value
	 */
   public void setIp66102BitByte16(Field source) {
       replace(source,0,source.length(),beginIp66102BitByte16,IP_66102_BIT_BYTE_16_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102BitByte16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102BitByte16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102BitByte16,IP_66102_BIT_BYTE_16_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102BitByte16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitByte16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102BitByte16+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip66102BitMap
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66102BitByte1(CONSTANTS.SPACE);
         setIp66102BitByte2(CONSTANTS.SPACE);
         setIp66102BitByte3(CONSTANTS.SPACE);
         setIp66102BitByte4(CONSTANTS.SPACE);
         setIp66102BitByte5(CONSTANTS.SPACE);
         setIp66102BitByte6(CONSTANTS.SPACE);
         setIp66102BitByte7(CONSTANTS.SPACE);
         setIp66102BitByte8(CONSTANTS.SPACE);
         setIp66102BitByte9(CONSTANTS.SPACE);
         setIp66102BitByte10(CONSTANTS.SPACE);
         setIp66102BitByte11(CONSTANTS.SPACE);
         setIp66102BitByte12(CONSTANTS.SPACE);
         setIp66102BitByte13(CONSTANTS.SPACE);
         setIp66102BitByte14(CONSTANTS.SPACE);
         setIp66102BitByte15(CONSTANTS.SPACE);
         setIp66102BitByte16(CONSTANTS.SPACE);
   }

		public static int getIp66102BitMapFieldLength() {
			return IP_66102_BIT_MAP_LENGTH;
		}

}
  
