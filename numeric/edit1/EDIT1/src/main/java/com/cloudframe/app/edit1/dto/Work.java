package com.cloudframe.app.edit1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:30. using version 5.0.0.257
**/


import com.cloudframe.app.edit1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private char[] wS1 = Field.fillLowValue(12);

								private char[] wS2 = Field.fillLowValue(12);

								private char[] wS3 = Field.fillLowValue(9);

								private char[] wS4 = Field.fillLowValue(8);

								private char[] wS5 = Field.fillLowValue(7);

								private char[] wS6 = Field.fillLowValue(7);

								private char[] wS07 = Field.fillLowValue(6);

								private char[] wS08 = Field.fillLowValue(6);

								private char[] wS09 = Field.fillLowValue(6);

								private char[] wS10 = Field.fillLowValue(6);

								private char[] wS11 = Field.fillLowValue(11);

								private char[] wS12 = Field.fillLowValue(7);

								private char[] wS13 = Field.fillLowValue(8);

								private char[] wS14 = Field.fillLowValue(7);

								private char[] wS15 = Field.fillLowValue(7);

								private char[] wS16 = Field.fillLowValue(8);

								private char[] wS17 = Field.fillLowValue(8);

								private char[] wS18 = Field.fillLowValue(10);

								private char[] wS19 = Field.fillLowValue(10);

								private char[] wS20 = Field.fillLowValue(7);

								private char[] wS21 = Field.fillLowValue(7);

								private char[] wS22 = Field.fillLowValue(12);

								private char[] wS23 = Field.fillLowValue(12);

								private char[] wS24 = Field.fillLowValue(15);

								private char[] wS25 = Field.fillLowValue(14);

								private char[] wS26 = Field.fillLowValue(7);

								private char[] wS27 = Field.fillLowValue(7);

								private char[] wS28 = Field.fillLowValue(7);

								private char[] wS29 = Field.fillLowValue(7);

								private char[] wS30 = Field.fillLowValue(7);

								private char[] wS31 = Field.fillLowValue(9);

								private char[] wS32 = Field.fillLowValue(9);

								private char[] wS33 = Field.fillLowValue(14);

								private char[] wS34 = Field.fillLowValue(15);

								private char[] wS35 = Field.fillLowValue(18);

								private char[] wS36 = Field.fillLowValue(10);

								private char[] wS37 = Field.fillLowValue(10);

								private char[] wS38 = Field.fillLowValue(21);

								private char[] wS39 = Field.fillLowValue(21);

								private char[] wS40 = Field.fillLowValue(21);

								private char[] wS42 = Field.fillLowValue(11);

								private char[] wS46 = Field.fillLowValue(15);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wS1
	 *	@return wS1
	 */
   public char[] getWS1() throws CFException{
     if (isWS1Modified()) { 
        wS1 = refreshWS1();
     }
   		return wS1;
   }

  
	/**
	*  set variable wS1
	*  Corresponding COBOL Variable is WS-1
	*  @param value
	**/
   public void setWS1(char[] value) {
      wS1 = checkWS1Constraints(value);
      serializeWS1(wS1);
   } 

     /**
	 * 	Update WS1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS1,wS1.length);
   	
   }
   
   public void setWS1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS1,wS1.length);
   	
   }
   
     /**
	 * 	Update WS1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS1 with another Field
	 *	@param value
	 */
   public void setWS1(Field source) {
       replace(source,0,source.length(),beginWS1,W_S_1_LEN);
   	
   }  
   
     /**
	 * 	Update WS1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS1,W_S_1_LEN);
   	
   }
   
     /**
	 * 	Update WS1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS2
	 *	@return wS2
	 */
   public char[] getWS2() throws CFException{
     if (isWS2Modified()) { 
        wS2 = refreshWS2();
     }
   		return wS2;
   }

  
	/**
	*  set variable wS2
	*  Corresponding COBOL Variable is WS-2
	*  @param value
	**/
   public void setWS2(char[] value) {
      wS2 = checkWS2Constraints(value);
      serializeWS2(wS2);
   } 

     /**
	 * 	Update WS2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS2,wS2.length);
   	
   }
   
   public void setWS2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS2,wS2.length);
   	
   }
   
     /**
	 * 	Update WS2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS2 with another Field
	 *	@param value
	 */
   public void setWS2(Field source) {
       replace(source,0,source.length(),beginWS2,W_S_2_LEN);
   	
   }  
   
     /**
	 * 	Update WS2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS2,W_S_2_LEN);
   	
   }
   
     /**
	 * 	Update WS2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS3
	 *	@return wS3
	 */
   public char[] getWS3() throws CFException{
     if (isWS3Modified()) { 
        wS3 = refreshWS3();
     }
   		return wS3;
   }

  
	/**
	*  set variable wS3
	*  Corresponding COBOL Variable is WS-3
	*  @param value
	**/
   public void setWS3(char[] value) {
      wS3 = checkWS3Constraints(value);
      serializeWS3(wS3);
   } 

     /**
	 * 	Update WS3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS3,wS3.length);
   	
   }
   
   public void setWS3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS3,wS3.length);
   	
   }
   
     /**
	 * 	Update WS3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS3 with another Field
	 *	@param value
	 */
   public void setWS3(Field source) {
       replace(source,0,source.length(),beginWS3,W_S_3_LEN);
   	
   }  
   
     /**
	 * 	Update WS3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS3,W_S_3_LEN);
   	
   }
   
     /**
	 * 	Update WS3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS4
	 *	@return wS4
	 */
   public char[] getWS4() throws CFException{
     if (isWS4Modified()) { 
        wS4 = refreshWS4();
     }
   		return wS4;
   }

  
	/**
	*  set variable wS4
	*  Corresponding COBOL Variable is WS-4
	*  @param value
	**/
   public void setWS4(char[] value) {
      wS4 = checkWS4Constraints(value);
      serializeWS4(wS4);
   } 

     /**
	 * 	Update WS4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS4,wS4.length);
   	
   }
   
   public void setWS4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS4,wS4.length);
   	
   }
   
     /**
	 * 	Update WS4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS4 with another Field
	 *	@param value
	 */
   public void setWS4(Field source) {
       replace(source,0,source.length(),beginWS4,W_S_4_LEN);
   	
   }  
   
     /**
	 * 	Update WS4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS4,W_S_4_LEN);
   	
   }
   
     /**
	 * 	Update WS4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS5
	 *	@return wS5
	 */
   public char[] getWS5() throws CFException{
     if (isWS5Modified()) { 
        wS5 = refreshWS5();
     }
   		return wS5;
   }

  
	/**
	*  set variable wS5
	*  Corresponding COBOL Variable is WS-5
	*  @param value
	**/
   public void setWS5(char[] value) {
      wS5 = checkWS5Constraints(value);
      serializeWS5(wS5);
   } 

     /**
	 * 	Update WS5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS5,wS5.length);
   	
   }
   
   public void setWS5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS5,wS5.length);
   	
   }
   
     /**
	 * 	Update WS5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS5 with another Field
	 *	@param value
	 */
   public void setWS5(Field source) {
       replace(source,0,source.length(),beginWS5,W_S_5_LEN);
   	
   }  
   
     /**
	 * 	Update WS5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS5,W_S_5_LEN);
   	
   }
   
     /**
	 * 	Update WS5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS6
	 *	@return wS6
	 */
   public char[] getWS6() throws CFException{
     if (isWS6Modified()) { 
        wS6 = refreshWS6();
     }
   		return wS6;
   }

  
	/**
	*  set variable wS6
	*  Corresponding COBOL Variable is WS-6
	*  @param value
	**/
   public void setWS6(char[] value) {
      wS6 = checkWS6Constraints(value);
      serializeWS6(wS6);
   } 

     /**
	 * 	Update WS6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS6,wS6.length);
   	
   }
   
   public void setWS6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS6,wS6.length);
   	
   }
   
     /**
	 * 	Update WS6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS6 with another Field
	 *	@param value
	 */
   public void setWS6(Field source) {
       replace(source,0,source.length(),beginWS6,W_S_6_LEN);
   	
   }  
   
     /**
	 * 	Update WS6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS6,W_S_6_LEN);
   	
   }
   
     /**
	 * 	Update WS6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS07
	 *	@return wS07
	 */
   public char[] getWS07() throws CFException{
     if (isWS07Modified()) { 
        wS07 = refreshWS07();
     }
   		return wS07;
   }

  
	/**
	*  set variable wS07
	*  Corresponding COBOL Variable is WS-07
	*  @param value
	**/
   public void setWS07(char[] value) {
      wS07 = checkWS07Constraints(value);
      serializeWS07(wS07);
   } 

     /**
	 * 	Update WS07 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS07(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS07,wS07.length);
   	
   }
   
   public void setWS07(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS07,wS07.length);
   	
   }
   
     /**
	 * 	Update WS07 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS07(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS07+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS07 with another Field
	 *	@param value
	 */
   public void setWS07(Field source) {
       replace(source,0,source.length(),beginWS07,W_S_07_LEN);
   	
   }  
   
     /**
	 * 	Update WS07 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS07(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS07,W_S_07_LEN);
   	
   }
   
     /**
	 * 	Update WS07 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS07(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS07+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS08
	 *	@return wS08
	 */
   public char[] getWS08() throws CFException{
     if (isWS08Modified()) { 
        wS08 = refreshWS08();
     }
   		return wS08;
   }

  
	/**
	*  set variable wS08
	*  Corresponding COBOL Variable is WS-08
	*  @param value
	**/
   public void setWS08(char[] value) {
      wS08 = checkWS08Constraints(value);
      serializeWS08(wS08);
   } 

     /**
	 * 	Update WS08 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS08(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS08,wS08.length);
   	
   }
   
   public void setWS08(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS08,wS08.length);
   	
   }
   
     /**
	 * 	Update WS08 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS08(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS08+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS08 with another Field
	 *	@param value
	 */
   public void setWS08(Field source) {
       replace(source,0,source.length(),beginWS08,W_S_08_LEN);
   	
   }  
   
     /**
	 * 	Update WS08 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS08(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS08,W_S_08_LEN);
   	
   }
   
     /**
	 * 	Update WS08 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS08(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS08+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS09
	 *	@return wS09
	 */
   public char[] getWS09() throws CFException{
     if (isWS09Modified()) { 
        wS09 = refreshWS09();
     }
   		return wS09;
   }

  
	/**
	*  set variable wS09
	*  Corresponding COBOL Variable is WS-09
	*  @param value
	**/
   public void setWS09(char[] value) {
      wS09 = checkWS09Constraints(value);
      serializeWS09(wS09);
   } 

     /**
	 * 	Update WS09 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS09(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS09,wS09.length);
   	
   }
   
   public void setWS09(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS09,wS09.length);
   	
   }
   
     /**
	 * 	Update WS09 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS09(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS09+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS09 with another Field
	 *	@param value
	 */
   public void setWS09(Field source) {
       replace(source,0,source.length(),beginWS09,W_S_09_LEN);
   	
   }  
   
     /**
	 * 	Update WS09 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS09(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS09,W_S_09_LEN);
   	
   }
   
     /**
	 * 	Update WS09 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS09(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS09+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS10
	 *	@return wS10
	 */
   public char[] getWS10() throws CFException{
     if (isWS10Modified()) { 
        wS10 = refreshWS10();
     }
   		return wS10;
   }

  
	/**
	*  set variable wS10
	*  Corresponding COBOL Variable is WS-10
	*  @param value
	**/
   public void setWS10(char[] value) {
      wS10 = checkWS10Constraints(value);
      serializeWS10(wS10);
   } 

     /**
	 * 	Update WS10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS10,wS10.length);
   	
   }
   
   public void setWS10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS10,wS10.length);
   	
   }
   
     /**
	 * 	Update WS10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS10 with another Field
	 *	@param value
	 */
   public void setWS10(Field source) {
       replace(source,0,source.length(),beginWS10,W_S_10_LEN);
   	
   }  
   
     /**
	 * 	Update WS10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS10,W_S_10_LEN);
   	
   }
   
     /**
	 * 	Update WS10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS10+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS11
	 *	@return wS11
	 */
   public char[] getWS11() throws CFException{
     if (isWS11Modified()) { 
        wS11 = refreshWS11();
     }
   		return wS11;
   }

  
	/**
	*  set variable wS11
	*  Corresponding COBOL Variable is WS-11
	*  @param value
	**/
   public void setWS11(char[] value) {
      wS11 = checkWS11Constraints(value);
      serializeWS11(wS11);
   } 

     /**
	 * 	Update WS11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS11,wS11.length);
   	
   }
   
   public void setWS11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS11,wS11.length);
   	
   }
   
     /**
	 * 	Update WS11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS11 with another Field
	 *	@param value
	 */
   public void setWS11(Field source) {
       replace(source,0,source.length(),beginWS11,W_S_11_LEN);
   	
   }  
   
     /**
	 * 	Update WS11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS11,W_S_11_LEN);
   	
   }
   
     /**
	 * 	Update WS11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS12
	 *	@return wS12
	 */
   public char[] getWS12() throws CFException{
     if (isWS12Modified()) { 
        wS12 = refreshWS12();
     }
   		return wS12;
   }

  
	/**
	*  set variable wS12
	*  Corresponding COBOL Variable is WS-12
	*  @param value
	**/
   public void setWS12(char[] value) {
      wS12 = checkWS12Constraints(value);
      serializeWS12(wS12);
   } 

     /**
	 * 	Update WS12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS12,wS12.length);
   	
   }
   
   public void setWS12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS12,wS12.length);
   	
   }
   
     /**
	 * 	Update WS12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS12 with another Field
	 *	@param value
	 */
   public void setWS12(Field source) {
       replace(source,0,source.length(),beginWS12,W_S_12_LEN);
   	
   }  
   
     /**
	 * 	Update WS12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS12,W_S_12_LEN);
   	
   }
   
     /**
	 * 	Update WS12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS12+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS13
	 *	@return wS13
	 */
   public char[] getWS13() throws CFException{
     if (isWS13Modified()) { 
        wS13 = refreshWS13();
     }
   		return wS13;
   }

  
	/**
	*  set variable wS13
	*  Corresponding COBOL Variable is WS-13
	*  @param value
	**/
   public void setWS13(char[] value) {
      wS13 = checkWS13Constraints(value);
      serializeWS13(wS13);
   } 

     /**
	 * 	Update WS13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS13,wS13.length);
   	
   }
   
   public void setWS13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS13,wS13.length);
   	
   }
   
     /**
	 * 	Update WS13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS13 with another Field
	 *	@param value
	 */
   public void setWS13(Field source) {
       replace(source,0,source.length(),beginWS13,W_S_13_LEN);
   	
   }  
   
     /**
	 * 	Update WS13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS13,W_S_13_LEN);
   	
   }
   
     /**
	 * 	Update WS13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS14
	 *	@return wS14
	 */
   public char[] getWS14() throws CFException{
     if (isWS14Modified()) { 
        wS14 = refreshWS14();
     }
   		return wS14;
   }

  
	/**
	*  set variable wS14
	*  Corresponding COBOL Variable is WS-14
	*  @param value
	**/
   public void setWS14(char[] value) {
      wS14 = checkWS14Constraints(value);
      serializeWS14(wS14);
   } 

     /**
	 * 	Update WS14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS14,wS14.length);
   	
   }
   
   public void setWS14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS14,wS14.length);
   	
   }
   
     /**
	 * 	Update WS14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS14 with another Field
	 *	@param value
	 */
   public void setWS14(Field source) {
       replace(source,0,source.length(),beginWS14,W_S_14_LEN);
   	
   }  
   
     /**
	 * 	Update WS14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS14,W_S_14_LEN);
   	
   }
   
     /**
	 * 	Update WS14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS14+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS15
	 *	@return wS15
	 */
   public char[] getWS15() throws CFException{
     if (isWS15Modified()) { 
        wS15 = refreshWS15();
     }
   		return wS15;
   }

  
	/**
	*  set variable wS15
	*  Corresponding COBOL Variable is WS-15
	*  @param value
	**/
   public void setWS15(char[] value) {
      wS15 = checkWS15Constraints(value);
      serializeWS15(wS15);
   } 

     /**
	 * 	Update WS15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS15,wS15.length);
   	
   }
   
   public void setWS15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS15,wS15.length);
   	
   }
   
     /**
	 * 	Update WS15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS15 with another Field
	 *	@param value
	 */
   public void setWS15(Field source) {
       replace(source,0,source.length(),beginWS15,W_S_15_LEN);
   	
   }  
   
     /**
	 * 	Update WS15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS15,W_S_15_LEN);
   	
   }
   
     /**
	 * 	Update WS15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS16
	 *	@return wS16
	 */
   public char[] getWS16() throws CFException{
     if (isWS16Modified()) { 
        wS16 = refreshWS16();
     }
   		return wS16;
   }

  
	/**
	*  set variable wS16
	*  Corresponding COBOL Variable is WS-16
	*  @param value
	**/
   public void setWS16(char[] value) {
      wS16 = checkWS16Constraints(value);
      serializeWS16(wS16);
   } 

     /**
	 * 	Update WS16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS16,wS16.length);
   	
   }
   
   public void setWS16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS16,wS16.length);
   	
   }
   
     /**
	 * 	Update WS16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS16 with another Field
	 *	@param value
	 */
   public void setWS16(Field source) {
       replace(source,0,source.length(),beginWS16,W_S_16_LEN);
   	
   }  
   
     /**
	 * 	Update WS16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS16,W_S_16_LEN);
   	
   }
   
     /**
	 * 	Update WS16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS16+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS17
	 *	@return wS17
	 */
   public char[] getWS17() throws CFException{
     if (isWS17Modified()) { 
        wS17 = refreshWS17();
     }
   		return wS17;
   }

  
	/**
	*  set variable wS17
	*  Corresponding COBOL Variable is WS-17
	*  @param value
	**/
   public void setWS17(char[] value) {
      wS17 = checkWS17Constraints(value);
      serializeWS17(wS17);
   } 

     /**
	 * 	Update WS17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS17,wS17.length);
   	
   }
   
   public void setWS17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS17,wS17.length);
   	
   }
   
     /**
	 * 	Update WS17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS17 with another Field
	 *	@param value
	 */
   public void setWS17(Field source) {
       replace(source,0,source.length(),beginWS17,W_S_17_LEN);
   	
   }  
   
     /**
	 * 	Update WS17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS17,W_S_17_LEN);
   	
   }
   
     /**
	 * 	Update WS17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS17+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS18
	 *	@return wS18
	 */
   public char[] getWS18() throws CFException{
     if (isWS18Modified()) { 
        wS18 = refreshWS18();
     }
   		return wS18;
   }

  
	/**
	*  set variable wS18
	*  Corresponding COBOL Variable is WS-18
	*  @param value
	**/
   public void setWS18(char[] value) {
      wS18 = checkWS18Constraints(value);
      serializeWS18(wS18);
   } 

     /**
	 * 	Update WS18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS18(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS18,wS18.length);
   	
   }
   
   public void setWS18(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS18,wS18.length);
   	
   }
   
     /**
	 * 	Update WS18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS18+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS18 with another Field
	 *	@param value
	 */
   public void setWS18(Field source) {
       replace(source,0,source.length(),beginWS18,W_S_18_LEN);
   	
   }  
   
     /**
	 * 	Update WS18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS18(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS18,W_S_18_LEN);
   	
   }
   
     /**
	 * 	Update WS18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS18+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS19
	 *	@return wS19
	 */
   public char[] getWS19() throws CFException{
     if (isWS19Modified()) { 
        wS19 = refreshWS19();
     }
   		return wS19;
   }

  
	/**
	*  set variable wS19
	*  Corresponding COBOL Variable is WS-19
	*  @param value
	**/
   public void setWS19(char[] value) {
      wS19 = checkWS19Constraints(value);
      serializeWS19(wS19);
   } 

     /**
	 * 	Update WS19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS19,wS19.length);
   	
   }
   
   public void setWS19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS19,wS19.length);
   	
   }
   
     /**
	 * 	Update WS19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS19 with another Field
	 *	@param value
	 */
   public void setWS19(Field source) {
       replace(source,0,source.length(),beginWS19,W_S_19_LEN);
   	
   }  
   
     /**
	 * 	Update WS19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS19,W_S_19_LEN);
   	
   }
   
     /**
	 * 	Update WS19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS19+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS20
	 *	@return wS20
	 */
   public char[] getWS20() throws CFException{
     if (isWS20Modified()) { 
        wS20 = refreshWS20();
     }
   		return wS20;
   }

  
	/**
	*  set variable wS20
	*  Corresponding COBOL Variable is WS-20
	*  @param value
	**/
   public void setWS20(char[] value) {
      wS20 = checkWS20Constraints(value);
      serializeWS20(wS20);
   } 

     /**
	 * 	Update WS20 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS20(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS20,wS20.length);
   	
   }
   
   public void setWS20(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS20,wS20.length);
   	
   }
   
     /**
	 * 	Update WS20 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS20+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS20 with another Field
	 *	@param value
	 */
   public void setWS20(Field source) {
       replace(source,0,source.length(),beginWS20,W_S_20_LEN);
   	
   }  
   
     /**
	 * 	Update WS20 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS20(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS20,W_S_20_LEN);
   	
   }
   
     /**
	 * 	Update WS20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS20+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS21
	 *	@return wS21
	 */
   public char[] getWS21() throws CFException{
     if (isWS21Modified()) { 
        wS21 = refreshWS21();
     }
   		return wS21;
   }

  
	/**
	*  set variable wS21
	*  Corresponding COBOL Variable is WS-21
	*  @param value
	**/
   public void setWS21(char[] value) {
      wS21 = checkWS21Constraints(value);
      serializeWS21(wS21);
   } 

     /**
	 * 	Update WS21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS21(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS21,wS21.length);
   	
   }
   
   public void setWS21(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS21,wS21.length);
   	
   }
   
     /**
	 * 	Update WS21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS21+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS21 with another Field
	 *	@param value
	 */
   public void setWS21(Field source) {
       replace(source,0,source.length(),beginWS21,W_S_21_LEN);
   	
   }  
   
     /**
	 * 	Update WS21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS21(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS21,W_S_21_LEN);
   	
   }
   
     /**
	 * 	Update WS21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS21+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS22
	 *	@return wS22
	 */
   public char[] getWS22() throws CFException{
     if (isWS22Modified()) { 
        wS22 = refreshWS22();
     }
   		return wS22;
   }

  
	/**
	*  set variable wS22
	*  Corresponding COBOL Variable is WS-22
	*  @param value
	**/
   public void setWS22(char[] value) {
      wS22 = checkWS22Constraints(value);
      serializeWS22(wS22);
   } 

     /**
	 * 	Update WS22 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS22(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS22,wS22.length);
   	
   }
   
   public void setWS22(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS22,wS22.length);
   	
   }
   
     /**
	 * 	Update WS22 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS22(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS22+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS22 with another Field
	 *	@param value
	 */
   public void setWS22(Field source) {
       replace(source,0,source.length(),beginWS22,W_S_22_LEN);
   	
   }  
   
     /**
	 * 	Update WS22 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS22(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS22,W_S_22_LEN);
   	
   }
   
     /**
	 * 	Update WS22 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS22(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS22+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS23
	 *	@return wS23
	 */
   public char[] getWS23() throws CFException{
     if (isWS23Modified()) { 
        wS23 = refreshWS23();
     }
   		return wS23;
   }

  
	/**
	*  set variable wS23
	*  Corresponding COBOL Variable is WS-23
	*  @param value
	**/
   public void setWS23(char[] value) {
      wS23 = checkWS23Constraints(value);
      serializeWS23(wS23);
   } 

     /**
	 * 	Update WS23 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS23(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS23,wS23.length);
   	
   }
   
   public void setWS23(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS23,wS23.length);
   	
   }
   
     /**
	 * 	Update WS23 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS23(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS23+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS23 with another Field
	 *	@param value
	 */
   public void setWS23(Field source) {
       replace(source,0,source.length(),beginWS23,W_S_23_LEN);
   	
   }  
   
     /**
	 * 	Update WS23 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS23(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS23,W_S_23_LEN);
   	
   }
   
     /**
	 * 	Update WS23 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS23(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS23+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS24
	 *	@return wS24
	 */
   public char[] getWS24() throws CFException{
     if (isWS24Modified()) { 
        wS24 = refreshWS24();
     }
   		return wS24;
   }

  
	/**
	*  set variable wS24
	*  Corresponding COBOL Variable is WS-24
	*  @param value
	**/
   public void setWS24(char[] value) {
      wS24 = checkWS24Constraints(value);
      serializeWS24(wS24);
   } 

     /**
	 * 	Update WS24 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS24(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS24,wS24.length);
   	
   }
   
   public void setWS24(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS24,wS24.length);
   	
   }
   
     /**
	 * 	Update WS24 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS24(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS24+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS24 with another Field
	 *	@param value
	 */
   public void setWS24(Field source) {
       replace(source,0,source.length(),beginWS24,W_S_24_LEN);
   	
   }  
   
     /**
	 * 	Update WS24 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS24(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS24,W_S_24_LEN);
   	
   }
   
     /**
	 * 	Update WS24 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS24(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS24+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS25
	 *	@return wS25
	 */
   public char[] getWS25() throws CFException{
     if (isWS25Modified()) { 
        wS25 = refreshWS25();
     }
   		return wS25;
   }

  
	/**
	*  set variable wS25
	*  Corresponding COBOL Variable is WS-25
	*  @param value
	**/
   public void setWS25(char[] value) {
      wS25 = checkWS25Constraints(value);
      serializeWS25(wS25);
   } 

     /**
	 * 	Update WS25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS25(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS25,wS25.length);
   	
   }
   
   public void setWS25(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS25,wS25.length);
   	
   }
   
     /**
	 * 	Update WS25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS25+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS25 with another Field
	 *	@param value
	 */
   public void setWS25(Field source) {
       replace(source,0,source.length(),beginWS25,W_S_25_LEN);
   	
   }  
   
     /**
	 * 	Update WS25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS25(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS25,W_S_25_LEN);
   	
   }
   
     /**
	 * 	Update WS25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS25+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS26
	 *	@return wS26
	 */
   public char[] getWS26() throws CFException{
     if (isWS26Modified()) { 
        wS26 = refreshWS26();
     }
   		return wS26;
   }

  
	/**
	*  set variable wS26
	*  Corresponding COBOL Variable is WS-26
	*  @param value
	**/
   public void setWS26(char[] value) {
      wS26 = checkWS26Constraints(value);
      serializeWS26(wS26);
   } 

     /**
	 * 	Update WS26 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS26(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS26,wS26.length);
   	
   }
   
   public void setWS26(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS26,wS26.length);
   	
   }
   
     /**
	 * 	Update WS26 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS26(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS26+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS26 with another Field
	 *	@param value
	 */
   public void setWS26(Field source) {
       replace(source,0,source.length(),beginWS26,W_S_26_LEN);
   	
   }  
   
     /**
	 * 	Update WS26 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS26(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS26,W_S_26_LEN);
   	
   }
   
     /**
	 * 	Update WS26 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS26(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS26+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS27
	 *	@return wS27
	 */
   public char[] getWS27() throws CFException{
     if (isWS27Modified()) { 
        wS27 = refreshWS27();
     }
   		return wS27;
   }

  
	/**
	*  set variable wS27
	*  Corresponding COBOL Variable is WS-27
	*  @param value
	**/
   public void setWS27(char[] value) {
      wS27 = checkWS27Constraints(value);
      serializeWS27(wS27);
   } 

     /**
	 * 	Update WS27 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS27(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS27,wS27.length);
   	
   }
   
   public void setWS27(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS27,wS27.length);
   	
   }
   
     /**
	 * 	Update WS27 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS27(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS27+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS27 with another Field
	 *	@param value
	 */
   public void setWS27(Field source) {
       replace(source,0,source.length(),beginWS27,W_S_27_LEN);
   	
   }  
   
     /**
	 * 	Update WS27 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS27(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS27,W_S_27_LEN);
   	
   }
   
     /**
	 * 	Update WS27 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS27(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS27+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS28
	 *	@return wS28
	 */
   public char[] getWS28() throws CFException{
     if (isWS28Modified()) { 
        wS28 = refreshWS28();
     }
   		return wS28;
   }

  
	/**
	*  set variable wS28
	*  Corresponding COBOL Variable is WS-28
	*  @param value
	**/
   public void setWS28(char[] value) {
      wS28 = checkWS28Constraints(value);
      serializeWS28(wS28);
   } 

     /**
	 * 	Update WS28 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS28(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS28,wS28.length);
   	
   }
   
   public void setWS28(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS28,wS28.length);
   	
   }
   
     /**
	 * 	Update WS28 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS28(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS28+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS28 with another Field
	 *	@param value
	 */
   public void setWS28(Field source) {
       replace(source,0,source.length(),beginWS28,W_S_28_LEN);
   	
   }  
   
     /**
	 * 	Update WS28 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS28(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS28,W_S_28_LEN);
   	
   }
   
     /**
	 * 	Update WS28 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS28(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS28+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS29
	 *	@return wS29
	 */
   public char[] getWS29() throws CFException{
     if (isWS29Modified()) { 
        wS29 = refreshWS29();
     }
   		return wS29;
   }

  
	/**
	*  set variable wS29
	*  Corresponding COBOL Variable is WS-29
	*  @param value
	**/
   public void setWS29(char[] value) {
      wS29 = checkWS29Constraints(value);
      serializeWS29(wS29);
   } 

     /**
	 * 	Update WS29 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS29(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS29,wS29.length);
   	
   }
   
   public void setWS29(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS29,wS29.length);
   	
   }
   
     /**
	 * 	Update WS29 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS29(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS29+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS29 with another Field
	 *	@param value
	 */
   public void setWS29(Field source) {
       replace(source,0,source.length(),beginWS29,W_S_29_LEN);
   	
   }  
   
     /**
	 * 	Update WS29 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS29(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS29,W_S_29_LEN);
   	
   }
   
     /**
	 * 	Update WS29 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS29(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS29+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS30
	 *	@return wS30
	 */
   public char[] getWS30() throws CFException{
     if (isWS30Modified()) { 
        wS30 = refreshWS30();
     }
   		return wS30;
   }

  
	/**
	*  set variable wS30
	*  Corresponding COBOL Variable is WS-30
	*  @param value
	**/
   public void setWS30(char[] value) {
      wS30 = checkWS30Constraints(value);
      serializeWS30(wS30);
   } 

     /**
	 * 	Update WS30 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS30(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS30,wS30.length);
   	
   }
   
   public void setWS30(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS30,wS30.length);
   	
   }
   
     /**
	 * 	Update WS30 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS30(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS30+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS30 with another Field
	 *	@param value
	 */
   public void setWS30(Field source) {
       replace(source,0,source.length(),beginWS30,W_S_30_LEN);
   	
   }  
   
     /**
	 * 	Update WS30 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS30(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS30,W_S_30_LEN);
   	
   }
   
     /**
	 * 	Update WS30 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS30(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS30+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS31
	 *	@return wS31
	 */
   public char[] getWS31() throws CFException{
     if (isWS31Modified()) { 
        wS31 = refreshWS31();
     }
   		return wS31;
   }

  
	/**
	*  set variable wS31
	*  Corresponding COBOL Variable is WS-31
	*  @param value
	**/
   public void setWS31(char[] value) {
      wS31 = checkWS31Constraints(value);
      serializeWS31(wS31);
   } 

     /**
	 * 	Update WS31 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS31(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS31,wS31.length);
   	
   }
   
   public void setWS31(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS31,wS31.length);
   	
   }
   
     /**
	 * 	Update WS31 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS31(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS31+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS31 with another Field
	 *	@param value
	 */
   public void setWS31(Field source) {
       replace(source,0,source.length(),beginWS31,W_S_31_LEN);
   	
   }  
   
     /**
	 * 	Update WS31 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS31(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS31,W_S_31_LEN);
   	
   }
   
     /**
	 * 	Update WS31 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS31(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS31+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS32
	 *	@return wS32
	 */
   public char[] getWS32() throws CFException{
     if (isWS32Modified()) { 
        wS32 = refreshWS32();
     }
   		return wS32;
   }

  
	/**
	*  set variable wS32
	*  Corresponding COBOL Variable is WS-32
	*  @param value
	**/
   public void setWS32(char[] value) {
      wS32 = checkWS32Constraints(value);
      serializeWS32(wS32);
   } 

     /**
	 * 	Update WS32 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS32(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS32,wS32.length);
   	
   }
   
   public void setWS32(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS32,wS32.length);
   	
   }
   
     /**
	 * 	Update WS32 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS32(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS32+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS32 with another Field
	 *	@param value
	 */
   public void setWS32(Field source) {
       replace(source,0,source.length(),beginWS32,W_S_32_LEN);
   	
   }  
   
     /**
	 * 	Update WS32 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS32(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS32,W_S_32_LEN);
   	
   }
   
     /**
	 * 	Update WS32 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS32(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS32+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS33
	 *	@return wS33
	 */
   public char[] getWS33() throws CFException{
     if (isWS33Modified()) { 
        wS33 = refreshWS33();
     }
   		return wS33;
   }

  
	/**
	*  set variable wS33
	*  Corresponding COBOL Variable is WS-33
	*  @param value
	**/
   public void setWS33(char[] value) {
      wS33 = checkWS33Constraints(value);
      serializeWS33(wS33);
   } 

     /**
	 * 	Update WS33 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS33(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS33,wS33.length);
   	
   }
   
   public void setWS33(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS33,wS33.length);
   	
   }
   
     /**
	 * 	Update WS33 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS33(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS33+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS33 with another Field
	 *	@param value
	 */
   public void setWS33(Field source) {
       replace(source,0,source.length(),beginWS33,W_S_33_LEN);
   	
   }  
   
     /**
	 * 	Update WS33 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS33(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS33,W_S_33_LEN);
   	
   }
   
     /**
	 * 	Update WS33 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS33(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS33+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS34
	 *	@return wS34
	 */
   public char[] getWS34() throws CFException{
     if (isWS34Modified()) { 
        wS34 = refreshWS34();
     }
   		return wS34;
   }

  
	/**
	*  set variable wS34
	*  Corresponding COBOL Variable is WS-34
	*  @param value
	**/
   public void setWS34(char[] value) {
      wS34 = checkWS34Constraints(value);
      serializeWS34(wS34);
   } 

     /**
	 * 	Update WS34 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS34(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS34,wS34.length);
   	
   }
   
   public void setWS34(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS34,wS34.length);
   	
   }
   
     /**
	 * 	Update WS34 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS34(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS34+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS34 with another Field
	 *	@param value
	 */
   public void setWS34(Field source) {
       replace(source,0,source.length(),beginWS34,W_S_34_LEN);
   	
   }  
   
     /**
	 * 	Update WS34 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS34(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS34,W_S_34_LEN);
   	
   }
   
     /**
	 * 	Update WS34 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS34(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS34+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS35
	 *	@return wS35
	 */
   public char[] getWS35() throws CFException{
     if (isWS35Modified()) { 
        wS35 = refreshWS35();
     }
   		return wS35;
   }

  
	/**
	*  set variable wS35
	*  Corresponding COBOL Variable is WS-35
	*  @param value
	**/
   public void setWS35(char[] value) {
      wS35 = checkWS35Constraints(value);
      serializeWS35(wS35);
   } 

     /**
	 * 	Update WS35 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS35(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS35,wS35.length);
   	
   }
   
   public void setWS35(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS35,wS35.length);
   	
   }
   
     /**
	 * 	Update WS35 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS35(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS35+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS35 with another Field
	 *	@param value
	 */
   public void setWS35(Field source) {
       replace(source,0,source.length(),beginWS35,W_S_35_LEN);
   	
   }  
   
     /**
	 * 	Update WS35 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS35(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS35,W_S_35_LEN);
   	
   }
   
     /**
	 * 	Update WS35 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS35(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS35+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS36
	 *	@return wS36
	 */
   public char[] getWS36() throws CFException{
     if (isWS36Modified()) { 
        wS36 = refreshWS36();
     }
   		return wS36;
   }

  
	/**
	*  set variable wS36
	*  Corresponding COBOL Variable is WS-36
	*  @param value
	**/
   public void setWS36(char[] value) {
      wS36 = checkWS36Constraints(value);
      serializeWS36(wS36);
   } 

     /**
	 * 	Update WS36 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS36(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS36,wS36.length);
   	
   }
   
   public void setWS36(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS36,wS36.length);
   	
   }
   
     /**
	 * 	Update WS36 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS36(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS36+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS36 with another Field
	 *	@param value
	 */
   public void setWS36(Field source) {
       replace(source,0,source.length(),beginWS36,W_S_36_LEN);
   	
   }  
   
     /**
	 * 	Update WS36 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS36(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS36,W_S_36_LEN);
   	
   }
   
     /**
	 * 	Update WS36 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS36(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS36+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS37
	 *	@return wS37
	 */
   public char[] getWS37() throws CFException{
     if (isWS37Modified()) { 
        wS37 = refreshWS37();
     }
   		return wS37;
   }

  
	/**
	*  set variable wS37
	*  Corresponding COBOL Variable is WS-37
	*  @param value
	**/
   public void setWS37(char[] value) {
      wS37 = checkWS37Constraints(value);
      serializeWS37(wS37);
   } 

     /**
	 * 	Update WS37 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS37(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS37,wS37.length);
   	
   }
   
   public void setWS37(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS37,wS37.length);
   	
   }
   
     /**
	 * 	Update WS37 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS37(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS37+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS37 with another Field
	 *	@param value
	 */
   public void setWS37(Field source) {
       replace(source,0,source.length(),beginWS37,W_S_37_LEN);
   	
   }  
   
     /**
	 * 	Update WS37 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS37(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS37,W_S_37_LEN);
   	
   }
   
     /**
	 * 	Update WS37 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS37(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS37+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS38
	 *	@return wS38
	 */
   public char[] getWS38() throws CFException{
     if (isWS38Modified()) { 
        wS38 = refreshWS38();
     }
   		return wS38;
   }

  
	/**
	*  set variable wS38
	*  Corresponding COBOL Variable is WS-38
	*  @param value
	**/
   public void setWS38(char[] value) {
      wS38 = checkWS38Constraints(value);
      serializeWS38(wS38);
   } 

     /**
	 * 	Update WS38 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS38(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS38,wS38.length);
   	
   }
   
   public void setWS38(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS38,wS38.length);
   	
   }
   
     /**
	 * 	Update WS38 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS38(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS38+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS38 with another Field
	 *	@param value
	 */
   public void setWS38(Field source) {
       replace(source,0,source.length(),beginWS38,W_S_38_LEN);
   	
   }  
   
     /**
	 * 	Update WS38 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS38(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS38,W_S_38_LEN);
   	
   }
   
     /**
	 * 	Update WS38 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS38(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS38+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS39
	 *	@return wS39
	 */
   public char[] getWS39() throws CFException{
     if (isWS39Modified()) { 
        wS39 = refreshWS39();
     }
   		return wS39;
   }

  
	/**
	*  set variable wS39
	*  Corresponding COBOL Variable is WS-39
	*  @param value
	**/
   public void setWS39(char[] value) {
      wS39 = checkWS39Constraints(value);
      serializeWS39(wS39);
   } 

     /**
	 * 	Update WS39 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS39(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS39,wS39.length);
   	
   }
   
   public void setWS39(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS39,wS39.length);
   	
   }
   
     /**
	 * 	Update WS39 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS39(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS39+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS39 with another Field
	 *	@param value
	 */
   public void setWS39(Field source) {
       replace(source,0,source.length(),beginWS39,W_S_39_LEN);
   	
   }  
   
     /**
	 * 	Update WS39 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS39(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS39,W_S_39_LEN);
   	
   }
   
     /**
	 * 	Update WS39 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS39(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS39+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS40
	 *	@return wS40
	 */
   public char[] getWS40() throws CFException{
     if (isWS40Modified()) { 
        wS40 = refreshWS40();
     }
   		return wS40;
   }

  
	/**
	*  set variable wS40
	*  Corresponding COBOL Variable is WS-40
	*  @param value
	**/
   public void setWS40(char[] value) {
      wS40 = checkWS40Constraints(value);
      serializeWS40(wS40);
   } 

     /**
	 * 	Update WS40 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS40(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS40,wS40.length);
   	
   }
   
   public void setWS40(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS40,wS40.length);
   	
   }
   
     /**
	 * 	Update WS40 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS40(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS40+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS40 with another Field
	 *	@param value
	 */
   public void setWS40(Field source) {
       replace(source,0,source.length(),beginWS40,W_S_40_LEN);
   	
   }  
   
     /**
	 * 	Update WS40 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS40(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS40,W_S_40_LEN);
   	
   }
   
     /**
	 * 	Update WS40 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS40(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS40+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS42
	 *	@return wS42
	 */
   public char[] getWS42() throws CFException{
     if (isWS42Modified()) { 
        wS42 = refreshWS42();
     }
   		return wS42;
   }

  
	/**
	*  set variable wS42
	*  Corresponding COBOL Variable is WS-42
	*  @param value
	**/
   public void setWS42(char[] value) {
      wS42 = checkWS42Constraints(value);
      serializeWS42(wS42);
   } 

     /**
	 * 	Update WS42 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS42(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS42,wS42.length);
   	
   }
   
   public void setWS42(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS42,wS42.length);
   	
   }
   
     /**
	 * 	Update WS42 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS42(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS42+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS42 with another Field
	 *	@param value
	 */
   public void setWS42(Field source) {
       replace(source,0,source.length(),beginWS42,W_S_42_LEN);
   	
   }  
   
     /**
	 * 	Update WS42 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS42(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS42,W_S_42_LEN);
   	
   }
   
     /**
	 * 	Update WS42 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS42(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS42+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wS46
	 *	@return wS46
	 */
   public char[] getWS46() throws CFException{
     if (isWS46Modified()) { 
        wS46 = refreshWS46();
     }
   		return wS46;
   }

  
	/**
	*  set variable wS46
	*  Corresponding COBOL Variable is WS-46
	*  @param value
	**/
   public void setWS46(char[] value) {
      wS46 = checkWS46Constraints(value);
      serializeWS46(wS46);
   } 

     /**
	 * 	Update WS46 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS46(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWS46,wS46.length);
   	
   }
   
   public void setWS46(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWS46,wS46.length);
   	
   }
   
     /**
	 * 	Update WS46 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS46(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS46+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WS46 with another Field
	 *	@param value
	 */
   public void setWS46(Field source) {
       replace(source,0,source.length(),beginWS46,W_S_46_LEN);
   	
   }  
   
     /**
	 * 	Update WS46 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS46(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWS46,W_S_46_LEN);
   	
   }
   
     /**
	 * 	Update WS46 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS46(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWS46+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
