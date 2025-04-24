package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360HeaderSscIdGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class X360HeaderSscIdGrp extends X360HeaderSscIdGrpSerialized { 
   

						private char[] x360HeaderSscId1 = Field.fillLowValue(3);

						private char[] x360HeaderSscId2 = Field.fillLowValue(3);

						private char[] x360HeaderSscId3 = Field.fillLowValue(3);

						private char[] x360HeaderSscId4 = Field.fillLowValue(3);

						private char[] x360HeaderSscId5 = Field.fillLowValue(3);

						private char[] x360HeaderSscId6 = Field.fillLowValue(3);

						private char[] x360HeaderSscId7 = Field.fillLowValue(3);

						private char[] x360HeaderSscId8 = Field.fillLowValue(3);

						private char[] x360HeaderSscId9 = Field.fillLowValue(3);

						private char[] x360HeaderSscId10 = Field.fillLowValue(3);

						private char[] x360HeaderSscId11 = Field.fillLowValue(3);

						private char[] x360HeaderSscId12 = Field.fillLowValue(3);

						private char[] x360HeaderSscId13 = Field.fillLowValue(3);

						private char[] x360HeaderSscId14 = Field.fillLowValue(3);

						private char[] x360HeaderSscId15 = Field.fillLowValue(3);

						private char[] x360HeaderSscId16 = Field.fillLowValue(3);

						private char[] x360HeaderSscId17 = Field.fillLowValue(3);

						private char[] x360HeaderSscId18 = Field.fillLowValue(3);

						private char[] x360HeaderSscId19 = Field.fillLowValue(3);

						private char[] x360HeaderSscId20 = Field.fillLowValue(3);

						private char[] x360HeaderSscId21 = Field.fillLowValue(3);

						private char[] x360HeaderSscId22 = Field.fillLowValue(3);

						private char[] x360HeaderSscId23 = Field.fillLowValue(3);

						private char[] x360HeaderSscId24 = Field.fillLowValue(3);

						private char[] x360HeaderSscId25 = Field.fillLowValue(3);
	
	/**
	* Constructor for X360HeaderSscIdGrp
	**/
    public X360HeaderSscIdGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360HeaderSscIdGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360HeaderSscIdGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of x360HeaderSscId1
	 *	@return x360HeaderSscId1
	 */
   public char[] getX360HeaderSscId1() throws CFException{
     if (isX360HeaderSscId1Modified()) { 
        x360HeaderSscId1 = refreshX360HeaderSscId1();
     }
   		return x360HeaderSscId1;
   }

  
	/**
	*  set variable x360HeaderSscId1
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID1
	*  @param value
	**/
   public void setX360HeaderSscId1(char[] value) {
      x360HeaderSscId1 = checkX360HeaderSscId1Constraints(value);
      serializeX360HeaderSscId1(x360HeaderSscId1);
   } 

     /**
	 * 	Update X360HeaderSscId1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId1,x360HeaderSscId1.length);
   	
   }
   
   public void setX360HeaderSscId1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId1,x360HeaderSscId1.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId1 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId1(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId1,X_360_HEADER_SSC_ID_1_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId1,X_360_HEADER_SSC_ID_1_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId2
	 *	@return x360HeaderSscId2
	 */
   public char[] getX360HeaderSscId2() throws CFException{
     if (isX360HeaderSscId2Modified()) { 
        x360HeaderSscId2 = refreshX360HeaderSscId2();
     }
   		return x360HeaderSscId2;
   }

  
	/**
	*  set variable x360HeaderSscId2
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID2
	*  @param value
	**/
   public void setX360HeaderSscId2(char[] value) {
      x360HeaderSscId2 = checkX360HeaderSscId2Constraints(value);
      serializeX360HeaderSscId2(x360HeaderSscId2);
   } 

     /**
	 * 	Update X360HeaderSscId2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId2,x360HeaderSscId2.length);
   	
   }
   
   public void setX360HeaderSscId2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId2,x360HeaderSscId2.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId2 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId2(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId2,X_360_HEADER_SSC_ID_2_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId2,X_360_HEADER_SSC_ID_2_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId3
	 *	@return x360HeaderSscId3
	 */
   public char[] getX360HeaderSscId3() throws CFException{
     if (isX360HeaderSscId3Modified()) { 
        x360HeaderSscId3 = refreshX360HeaderSscId3();
     }
   		return x360HeaderSscId3;
   }

  
	/**
	*  set variable x360HeaderSscId3
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID3
	*  @param value
	**/
   public void setX360HeaderSscId3(char[] value) {
      x360HeaderSscId3 = checkX360HeaderSscId3Constraints(value);
      serializeX360HeaderSscId3(x360HeaderSscId3);
   } 

     /**
	 * 	Update X360HeaderSscId3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId3,x360HeaderSscId3.length);
   	
   }
   
   public void setX360HeaderSscId3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId3,x360HeaderSscId3.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId3 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId3(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId3,X_360_HEADER_SSC_ID_3_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId3,X_360_HEADER_SSC_ID_3_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId4
	 *	@return x360HeaderSscId4
	 */
   public char[] getX360HeaderSscId4() throws CFException{
     if (isX360HeaderSscId4Modified()) { 
        x360HeaderSscId4 = refreshX360HeaderSscId4();
     }
   		return x360HeaderSscId4;
   }

  
	/**
	*  set variable x360HeaderSscId4
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID4
	*  @param value
	**/
   public void setX360HeaderSscId4(char[] value) {
      x360HeaderSscId4 = checkX360HeaderSscId4Constraints(value);
      serializeX360HeaderSscId4(x360HeaderSscId4);
   } 

     /**
	 * 	Update X360HeaderSscId4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId4,x360HeaderSscId4.length);
   	
   }
   
   public void setX360HeaderSscId4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId4,x360HeaderSscId4.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId4 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId4(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId4,X_360_HEADER_SSC_ID_4_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId4,X_360_HEADER_SSC_ID_4_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId5
	 *	@return x360HeaderSscId5
	 */
   public char[] getX360HeaderSscId5() throws CFException{
     if (isX360HeaderSscId5Modified()) { 
        x360HeaderSscId5 = refreshX360HeaderSscId5();
     }
   		return x360HeaderSscId5;
   }

  
	/**
	*  set variable x360HeaderSscId5
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID5
	*  @param value
	**/
   public void setX360HeaderSscId5(char[] value) {
      x360HeaderSscId5 = checkX360HeaderSscId5Constraints(value);
      serializeX360HeaderSscId5(x360HeaderSscId5);
   } 

     /**
	 * 	Update X360HeaderSscId5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId5,x360HeaderSscId5.length);
   	
   }
   
   public void setX360HeaderSscId5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId5,x360HeaderSscId5.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId5 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId5(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId5,X_360_HEADER_SSC_ID_5_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId5,X_360_HEADER_SSC_ID_5_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId6
	 *	@return x360HeaderSscId6
	 */
   public char[] getX360HeaderSscId6() throws CFException{
     if (isX360HeaderSscId6Modified()) { 
        x360HeaderSscId6 = refreshX360HeaderSscId6();
     }
   		return x360HeaderSscId6;
   }

  
	/**
	*  set variable x360HeaderSscId6
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID6
	*  @param value
	**/
   public void setX360HeaderSscId6(char[] value) {
      x360HeaderSscId6 = checkX360HeaderSscId6Constraints(value);
      serializeX360HeaderSscId6(x360HeaderSscId6);
   } 

     /**
	 * 	Update X360HeaderSscId6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId6,x360HeaderSscId6.length);
   	
   }
   
   public void setX360HeaderSscId6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId6,x360HeaderSscId6.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId6 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId6(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId6,X_360_HEADER_SSC_ID_6_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId6,X_360_HEADER_SSC_ID_6_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId7
	 *	@return x360HeaderSscId7
	 */
   public char[] getX360HeaderSscId7() throws CFException{
     if (isX360HeaderSscId7Modified()) { 
        x360HeaderSscId7 = refreshX360HeaderSscId7();
     }
   		return x360HeaderSscId7;
   }

  
	/**
	*  set variable x360HeaderSscId7
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID7
	*  @param value
	**/
   public void setX360HeaderSscId7(char[] value) {
      x360HeaderSscId7 = checkX360HeaderSscId7Constraints(value);
      serializeX360HeaderSscId7(x360HeaderSscId7);
   } 

     /**
	 * 	Update X360HeaderSscId7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId7,x360HeaderSscId7.length);
   	
   }
   
   public void setX360HeaderSscId7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId7,x360HeaderSscId7.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId7 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId7(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId7,X_360_HEADER_SSC_ID_7_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId7,X_360_HEADER_SSC_ID_7_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId7+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId8
	 *	@return x360HeaderSscId8
	 */
   public char[] getX360HeaderSscId8() throws CFException{
     if (isX360HeaderSscId8Modified()) { 
        x360HeaderSscId8 = refreshX360HeaderSscId8();
     }
   		return x360HeaderSscId8;
   }

  
	/**
	*  set variable x360HeaderSscId8
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID8
	*  @param value
	**/
   public void setX360HeaderSscId8(char[] value) {
      x360HeaderSscId8 = checkX360HeaderSscId8Constraints(value);
      serializeX360HeaderSscId8(x360HeaderSscId8);
   } 

     /**
	 * 	Update X360HeaderSscId8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId8,x360HeaderSscId8.length);
   	
   }
   
   public void setX360HeaderSscId8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId8,x360HeaderSscId8.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId8 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId8(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId8,X_360_HEADER_SSC_ID_8_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId8,X_360_HEADER_SSC_ID_8_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId8+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId9
	 *	@return x360HeaderSscId9
	 */
   public char[] getX360HeaderSscId9() throws CFException{
     if (isX360HeaderSscId9Modified()) { 
        x360HeaderSscId9 = refreshX360HeaderSscId9();
     }
   		return x360HeaderSscId9;
   }

  
	/**
	*  set variable x360HeaderSscId9
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID9
	*  @param value
	**/
   public void setX360HeaderSscId9(char[] value) {
      x360HeaderSscId9 = checkX360HeaderSscId9Constraints(value);
      serializeX360HeaderSscId9(x360HeaderSscId9);
   } 

     /**
	 * 	Update X360HeaderSscId9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId9(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId9,x360HeaderSscId9.length);
   	
   }
   
   public void setX360HeaderSscId9(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId9,x360HeaderSscId9.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId9+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId9 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId9(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId9,X_360_HEADER_SSC_ID_9_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId9(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId9,X_360_HEADER_SSC_ID_9_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId9+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId10
	 *	@return x360HeaderSscId10
	 */
   public char[] getX360HeaderSscId10() throws CFException{
     if (isX360HeaderSscId10Modified()) { 
        x360HeaderSscId10 = refreshX360HeaderSscId10();
     }
   		return x360HeaderSscId10;
   }

  
	/**
	*  set variable x360HeaderSscId10
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID10
	*  @param value
	**/
   public void setX360HeaderSscId10(char[] value) {
      x360HeaderSscId10 = checkX360HeaderSscId10Constraints(value);
      serializeX360HeaderSscId10(x360HeaderSscId10);
   } 

     /**
	 * 	Update X360HeaderSscId10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId10,x360HeaderSscId10.length);
   	
   }
   
   public void setX360HeaderSscId10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId10,x360HeaderSscId10.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId10 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId10(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId10,X_360_HEADER_SSC_ID_10_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId10,X_360_HEADER_SSC_ID_10_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId10+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId11
	 *	@return x360HeaderSscId11
	 */
   public char[] getX360HeaderSscId11() throws CFException{
     if (isX360HeaderSscId11Modified()) { 
        x360HeaderSscId11 = refreshX360HeaderSscId11();
     }
   		return x360HeaderSscId11;
   }

  
	/**
	*  set variable x360HeaderSscId11
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID11
	*  @param value
	**/
   public void setX360HeaderSscId11(char[] value) {
      x360HeaderSscId11 = checkX360HeaderSscId11Constraints(value);
      serializeX360HeaderSscId11(x360HeaderSscId11);
   } 

     /**
	 * 	Update X360HeaderSscId11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId11,x360HeaderSscId11.length);
   	
   }
   
   public void setX360HeaderSscId11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId11,x360HeaderSscId11.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId11 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId11(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId11,X_360_HEADER_SSC_ID_11_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId11,X_360_HEADER_SSC_ID_11_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId12
	 *	@return x360HeaderSscId12
	 */
   public char[] getX360HeaderSscId12() throws CFException{
     if (isX360HeaderSscId12Modified()) { 
        x360HeaderSscId12 = refreshX360HeaderSscId12();
     }
   		return x360HeaderSscId12;
   }

  
	/**
	*  set variable x360HeaderSscId12
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID12
	*  @param value
	**/
   public void setX360HeaderSscId12(char[] value) {
      x360HeaderSscId12 = checkX360HeaderSscId12Constraints(value);
      serializeX360HeaderSscId12(x360HeaderSscId12);
   } 

     /**
	 * 	Update X360HeaderSscId12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId12,x360HeaderSscId12.length);
   	
   }
   
   public void setX360HeaderSscId12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId12,x360HeaderSscId12.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId12 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId12(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId12,X_360_HEADER_SSC_ID_12_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId12,X_360_HEADER_SSC_ID_12_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId12+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId13
	 *	@return x360HeaderSscId13
	 */
   public char[] getX360HeaderSscId13() throws CFException{
     if (isX360HeaderSscId13Modified()) { 
        x360HeaderSscId13 = refreshX360HeaderSscId13();
     }
   		return x360HeaderSscId13;
   }

  
	/**
	*  set variable x360HeaderSscId13
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID13
	*  @param value
	**/
   public void setX360HeaderSscId13(char[] value) {
      x360HeaderSscId13 = checkX360HeaderSscId13Constraints(value);
      serializeX360HeaderSscId13(x360HeaderSscId13);
   } 

     /**
	 * 	Update X360HeaderSscId13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId13,x360HeaderSscId13.length);
   	
   }
   
   public void setX360HeaderSscId13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId13,x360HeaderSscId13.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId13 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId13(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId13,X_360_HEADER_SSC_ID_13_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId13,X_360_HEADER_SSC_ID_13_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId14
	 *	@return x360HeaderSscId14
	 */
   public char[] getX360HeaderSscId14() throws CFException{
     if (isX360HeaderSscId14Modified()) { 
        x360HeaderSscId14 = refreshX360HeaderSscId14();
     }
   		return x360HeaderSscId14;
   }

  
	/**
	*  set variable x360HeaderSscId14
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID14
	*  @param value
	**/
   public void setX360HeaderSscId14(char[] value) {
      x360HeaderSscId14 = checkX360HeaderSscId14Constraints(value);
      serializeX360HeaderSscId14(x360HeaderSscId14);
   } 

     /**
	 * 	Update X360HeaderSscId14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId14,x360HeaderSscId14.length);
   	
   }
   
   public void setX360HeaderSscId14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId14,x360HeaderSscId14.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId14 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId14(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId14,X_360_HEADER_SSC_ID_14_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId14,X_360_HEADER_SSC_ID_14_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId14+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId15
	 *	@return x360HeaderSscId15
	 */
   public char[] getX360HeaderSscId15() throws CFException{
     if (isX360HeaderSscId15Modified()) { 
        x360HeaderSscId15 = refreshX360HeaderSscId15();
     }
   		return x360HeaderSscId15;
   }

  
	/**
	*  set variable x360HeaderSscId15
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID15
	*  @param value
	**/
   public void setX360HeaderSscId15(char[] value) {
      x360HeaderSscId15 = checkX360HeaderSscId15Constraints(value);
      serializeX360HeaderSscId15(x360HeaderSscId15);
   } 

     /**
	 * 	Update X360HeaderSscId15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId15,x360HeaderSscId15.length);
   	
   }
   
   public void setX360HeaderSscId15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId15,x360HeaderSscId15.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId15 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId15(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId15,X_360_HEADER_SSC_ID_15_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId15,X_360_HEADER_SSC_ID_15_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId16
	 *	@return x360HeaderSscId16
	 */
   public char[] getX360HeaderSscId16() throws CFException{
     if (isX360HeaderSscId16Modified()) { 
        x360HeaderSscId16 = refreshX360HeaderSscId16();
     }
   		return x360HeaderSscId16;
   }

  
	/**
	*  set variable x360HeaderSscId16
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID16
	*  @param value
	**/
   public void setX360HeaderSscId16(char[] value) {
      x360HeaderSscId16 = checkX360HeaderSscId16Constraints(value);
      serializeX360HeaderSscId16(x360HeaderSscId16);
   } 

     /**
	 * 	Update X360HeaderSscId16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId16,x360HeaderSscId16.length);
   	
   }
   
   public void setX360HeaderSscId16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId16,x360HeaderSscId16.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId16 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId16(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId16,X_360_HEADER_SSC_ID_16_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId16,X_360_HEADER_SSC_ID_16_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId16+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId17
	 *	@return x360HeaderSscId17
	 */
   public char[] getX360HeaderSscId17() throws CFException{
     if (isX360HeaderSscId17Modified()) { 
        x360HeaderSscId17 = refreshX360HeaderSscId17();
     }
   		return x360HeaderSscId17;
   }

  
	/**
	*  set variable x360HeaderSscId17
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID17
	*  @param value
	**/
   public void setX360HeaderSscId17(char[] value) {
      x360HeaderSscId17 = checkX360HeaderSscId17Constraints(value);
      serializeX360HeaderSscId17(x360HeaderSscId17);
   } 

     /**
	 * 	Update X360HeaderSscId17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId17,x360HeaderSscId17.length);
   	
   }
   
   public void setX360HeaderSscId17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId17,x360HeaderSscId17.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId17 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId17(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId17,X_360_HEADER_SSC_ID_17_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId17,X_360_HEADER_SSC_ID_17_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId17+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId18
	 *	@return x360HeaderSscId18
	 */
   public char[] getX360HeaderSscId18() throws CFException{
     if (isX360HeaderSscId18Modified()) { 
        x360HeaderSscId18 = refreshX360HeaderSscId18();
     }
   		return x360HeaderSscId18;
   }

  
	/**
	*  set variable x360HeaderSscId18
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID18
	*  @param value
	**/
   public void setX360HeaderSscId18(char[] value) {
      x360HeaderSscId18 = checkX360HeaderSscId18Constraints(value);
      serializeX360HeaderSscId18(x360HeaderSscId18);
   } 

     /**
	 * 	Update X360HeaderSscId18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId18(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId18,x360HeaderSscId18.length);
   	
   }
   
   public void setX360HeaderSscId18(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId18,x360HeaderSscId18.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId18+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId18 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId18(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId18,X_360_HEADER_SSC_ID_18_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId18(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId18,X_360_HEADER_SSC_ID_18_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId18+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId19
	 *	@return x360HeaderSscId19
	 */
   public char[] getX360HeaderSscId19() throws CFException{
     if (isX360HeaderSscId19Modified()) { 
        x360HeaderSscId19 = refreshX360HeaderSscId19();
     }
   		return x360HeaderSscId19;
   }

  
	/**
	*  set variable x360HeaderSscId19
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID19
	*  @param value
	**/
   public void setX360HeaderSscId19(char[] value) {
      x360HeaderSscId19 = checkX360HeaderSscId19Constraints(value);
      serializeX360HeaderSscId19(x360HeaderSscId19);
   } 

     /**
	 * 	Update X360HeaderSscId19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId19,x360HeaderSscId19.length);
   	
   }
   
   public void setX360HeaderSscId19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId19,x360HeaderSscId19.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId19 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId19(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId19,X_360_HEADER_SSC_ID_19_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId19,X_360_HEADER_SSC_ID_19_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId19+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId20
	 *	@return x360HeaderSscId20
	 */
   public char[] getX360HeaderSscId20() throws CFException{
     if (isX360HeaderSscId20Modified()) { 
        x360HeaderSscId20 = refreshX360HeaderSscId20();
     }
   		return x360HeaderSscId20;
   }

  
	/**
	*  set variable x360HeaderSscId20
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID20
	*  @param value
	**/
   public void setX360HeaderSscId20(char[] value) {
      x360HeaderSscId20 = checkX360HeaderSscId20Constraints(value);
      serializeX360HeaderSscId20(x360HeaderSscId20);
   } 

     /**
	 * 	Update X360HeaderSscId20 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId20(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId20,x360HeaderSscId20.length);
   	
   }
   
   public void setX360HeaderSscId20(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId20,x360HeaderSscId20.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId20 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId20+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId20 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId20(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId20,X_360_HEADER_SSC_ID_20_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId20 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId20(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId20,X_360_HEADER_SSC_ID_20_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId20+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId21
	 *	@return x360HeaderSscId21
	 */
   public char[] getX360HeaderSscId21() throws CFException{
     if (isX360HeaderSscId21Modified()) { 
        x360HeaderSscId21 = refreshX360HeaderSscId21();
     }
   		return x360HeaderSscId21;
   }

  
	/**
	*  set variable x360HeaderSscId21
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID21
	*  @param value
	**/
   public void setX360HeaderSscId21(char[] value) {
      x360HeaderSscId21 = checkX360HeaderSscId21Constraints(value);
      serializeX360HeaderSscId21(x360HeaderSscId21);
   } 

     /**
	 * 	Update X360HeaderSscId21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId21(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId21,x360HeaderSscId21.length);
   	
   }
   
   public void setX360HeaderSscId21(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId21,x360HeaderSscId21.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId21+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId21 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId21(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId21,X_360_HEADER_SSC_ID_21_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId21(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId21,X_360_HEADER_SSC_ID_21_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId21+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId22
	 *	@return x360HeaderSscId22
	 */
   public char[] getX360HeaderSscId22() throws CFException{
     if (isX360HeaderSscId22Modified()) { 
        x360HeaderSscId22 = refreshX360HeaderSscId22();
     }
   		return x360HeaderSscId22;
   }

  
	/**
	*  set variable x360HeaderSscId22
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID22
	*  @param value
	**/
   public void setX360HeaderSscId22(char[] value) {
      x360HeaderSscId22 = checkX360HeaderSscId22Constraints(value);
      serializeX360HeaderSscId22(x360HeaderSscId22);
   } 

     /**
	 * 	Update X360HeaderSscId22 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId22(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId22,x360HeaderSscId22.length);
   	
   }
   
   public void setX360HeaderSscId22(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId22,x360HeaderSscId22.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId22 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId22(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId22+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId22 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId22(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId22,X_360_HEADER_SSC_ID_22_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId22 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId22(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId22,X_360_HEADER_SSC_ID_22_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId22 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId22(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId22+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId23
	 *	@return x360HeaderSscId23
	 */
   public char[] getX360HeaderSscId23() throws CFException{
     if (isX360HeaderSscId23Modified()) { 
        x360HeaderSscId23 = refreshX360HeaderSscId23();
     }
   		return x360HeaderSscId23;
   }

  
	/**
	*  set variable x360HeaderSscId23
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID23
	*  @param value
	**/
   public void setX360HeaderSscId23(char[] value) {
      x360HeaderSscId23 = checkX360HeaderSscId23Constraints(value);
      serializeX360HeaderSscId23(x360HeaderSscId23);
   } 

     /**
	 * 	Update X360HeaderSscId23 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId23(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId23,x360HeaderSscId23.length);
   	
   }
   
   public void setX360HeaderSscId23(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId23,x360HeaderSscId23.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId23 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId23(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId23+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId23 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId23(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId23,X_360_HEADER_SSC_ID_23_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId23 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId23(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId23,X_360_HEADER_SSC_ID_23_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId23 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId23(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId23+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId24
	 *	@return x360HeaderSscId24
	 */
   public char[] getX360HeaderSscId24() throws CFException{
     if (isX360HeaderSscId24Modified()) { 
        x360HeaderSscId24 = refreshX360HeaderSscId24();
     }
   		return x360HeaderSscId24;
   }

  
	/**
	*  set variable x360HeaderSscId24
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID24
	*  @param value
	**/
   public void setX360HeaderSscId24(char[] value) {
      x360HeaderSscId24 = checkX360HeaderSscId24Constraints(value);
      serializeX360HeaderSscId24(x360HeaderSscId24);
   } 

     /**
	 * 	Update X360HeaderSscId24 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId24(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId24,x360HeaderSscId24.length);
   	
   }
   
   public void setX360HeaderSscId24(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId24,x360HeaderSscId24.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId24 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId24(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId24+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId24 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId24(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId24,X_360_HEADER_SSC_ID_24_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId24 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId24(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId24,X_360_HEADER_SSC_ID_24_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId24 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId24(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId24+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360HeaderSscId25
	 *	@return x360HeaderSscId25
	 */
   public char[] getX360HeaderSscId25() throws CFException{
     if (isX360HeaderSscId25Modified()) { 
        x360HeaderSscId25 = refreshX360HeaderSscId25();
     }
   		return x360HeaderSscId25;
   }

  
	/**
	*  set variable x360HeaderSscId25
	*  Corresponding COBOL Variable is X360-HEADER-SSC-ID25
	*  @param value
	**/
   public void setX360HeaderSscId25(char[] value) {
      x360HeaderSscId25 = checkX360HeaderSscId25Constraints(value);
      serializeX360HeaderSscId25(x360HeaderSscId25);
   } 

     /**
	 * 	Update X360HeaderSscId25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscId25(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderSscId25,x360HeaderSscId25.length);
   	
   }
   
   public void setX360HeaderSscId25(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId25,x360HeaderSscId25.length);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId25+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderSscId25 with another Field
	 *	@param value
	 */
   public void setX360HeaderSscId25(Field source) {
       replace(source,0,source.length(),beginX360HeaderSscId25,X_360_HEADER_SSC_ID_25_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderSscId25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderSscId25(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderSscId25,X_360_HEADER_SSC_ID_25_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderSscId25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscId25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderSscId25+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes X360HeaderSscIdGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setX360HeaderSscId1(CONSTANTS.SPACE_3);
         setX360HeaderSscId2(CONSTANTS.SPACE_3);
         setX360HeaderSscId3(CONSTANTS.SPACE_3);
         setX360HeaderSscId4(CONSTANTS.SPACE_3);
         setX360HeaderSscId5(CONSTANTS.SPACE_3);
         setX360HeaderSscId6(CONSTANTS.SPACE_3);
         setX360HeaderSscId7(CONSTANTS.SPACE_3);
         setX360HeaderSscId8(CONSTANTS.SPACE_3);
         setX360HeaderSscId9(CONSTANTS.SPACE_3);
         setX360HeaderSscId10(CONSTANTS.SPACE_3);
         setX360HeaderSscId11(CONSTANTS.SPACE_3);
         setX360HeaderSscId12(CONSTANTS.SPACE_3);
         setX360HeaderSscId13(CONSTANTS.SPACE_3);
         setX360HeaderSscId14(CONSTANTS.SPACE_3);
         setX360HeaderSscId15(CONSTANTS.SPACE_3);
         setX360HeaderSscId16(CONSTANTS.SPACE_3);
         setX360HeaderSscId17(CONSTANTS.SPACE_3);
         setX360HeaderSscId18(CONSTANTS.SPACE_3);
         setX360HeaderSscId19(CONSTANTS.SPACE_3);
         setX360HeaderSscId20(CONSTANTS.SPACE_3);
         setX360HeaderSscId21(CONSTANTS.SPACE_3);
         setX360HeaderSscId22(CONSTANTS.SPACE_3);
         setX360HeaderSscId23(CONSTANTS.SPACE_3);
         setX360HeaderSscId24(CONSTANTS.SPACE_3);
         setX360HeaderSscId25(CONSTANTS.SPACE_3);
   }

		public static int getX360HeaderSscIdGrpFieldLength() {
			return X_360_HEADER_SSC_ID_GRP_LENGTH;
		}

}
  
