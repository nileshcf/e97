package com.cloudframe.app.mdsnum.dto;

/**
*  The class MiscAreas is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.mdsnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MiscAreas extends MiscAreasSerialized {
   

						private char[] amtd = Field.fillLowValue(18);

								private char[] amtd0 = Field.fillLowValue(18);

								private char[] amtd1 = Field.fillLowValue(18);

								private char[] amtd2 = Field.fillLowValue(18);

								private char[] amtd3 = Field.fillLowValue(18);

								private char[] amtd4 = Field.fillLowValue(18);

								private char[] amtd5 = Field.fillLowValue(18);

								private char[] amtd6 = Field.fillLowValue(18);

								private char[] amtd7 = Field.fillLowValue(18);
	
	/**
	* Constructor for MiscAreas
	**/
    public MiscAreas() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of amtd
	 *	@return amtd
	 */
   public char[] getAmtd() throws CFException{
     if (isAmtdModified()) { 
        amtd = refreshAmtd();
     }
   		return amtd;
   }

  
	/**
	*  set variable amtd
	*  Corresponding COBOL Variable is WS-AMTD
	*  @param value
	**/
   public void setAmtd(char[] value) {
      amtd = checkAmtdConstraints(value);
      serializeAmtd(amtd);
   } 

     /**
	 * 	Update Amtd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtd,amtd.length);
   	
   }
   
   public void setAmtd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd,amtd.length);
   	
   }
   
     /**
	 * 	Update Amtd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtd with another Field
	 *	@param value
	 */
   public void setAmtd(Field source) {
       replace(source,0,source.length(),beginAmtd,AMTD_LEN);
   	
   }  
   
     /**
	 * 	Update Amtd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtd,AMTD_LEN);
   	
   }
   
     /**
	 * 	Update Amtd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtd0
	 *	@return amtd0
	 */
   public char[] getAmtd0() throws CFException{
     if (isAmtd0Modified()) { 
        amtd0 = refreshAmtd0();
     }
   		return amtd0;
   }

  
	/**
	*  set variable amtd0
	*  Corresponding COBOL Variable is WS-AMTD0
	*  @param value
	**/
   public void setAmtd0(char[] value) {
      amtd0 = checkAmtd0Constraints(value);
      serializeAmtd0(amtd0);
   } 

     /**
	 * 	Update Amtd0 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd0(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtd0,amtd0.length);
   	
   }
   
   public void setAmtd0(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd0,amtd0.length);
   	
   }
   
     /**
	 * 	Update Amtd0 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd0(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd0+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtd0 with another Field
	 *	@param value
	 */
   public void setAmtd0(Field source) {
       replace(source,0,source.length(),beginAmtd0,AMTD_0_LEN);
   	
   }  
   
     /**
	 * 	Update Amtd0 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd0(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtd0,AMTD_0_LEN);
   	
   }
   
     /**
	 * 	Update Amtd0 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd0(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd0+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtd1
	 *	@return amtd1
	 */
   public char[] getAmtd1() throws CFException{
     if (isAmtd1Modified()) { 
        amtd1 = refreshAmtd1();
     }
   		return amtd1;
   }

  
	/**
	*  set variable amtd1
	*  Corresponding COBOL Variable is WS-AMTD1
	*  @param value
	**/
   public void setAmtd1(char[] value) {
      amtd1 = checkAmtd1Constraints(value);
      serializeAmtd1(amtd1);
   } 

     /**
	 * 	Update Amtd1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtd1,amtd1.length);
   	
   }
   
   public void setAmtd1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd1,amtd1.length);
   	
   }
   
     /**
	 * 	Update Amtd1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtd1 with another Field
	 *	@param value
	 */
   public void setAmtd1(Field source) {
       replace(source,0,source.length(),beginAmtd1,AMTD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Amtd1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtd1,AMTD_1_LEN);
   	
   }
   
     /**
	 * 	Update Amtd1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtd2
	 *	@return amtd2
	 */
   public char[] getAmtd2() throws CFException{
     if (isAmtd2Modified()) { 
        amtd2 = refreshAmtd2();
     }
   		return amtd2;
   }

  
	/**
	*  set variable amtd2
	*  Corresponding COBOL Variable is WS-AMTD2
	*  @param value
	**/
   public void setAmtd2(char[] value) {
      amtd2 = checkAmtd2Constraints(value);
      serializeAmtd2(amtd2);
   } 

     /**
	 * 	Update Amtd2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtd2,amtd2.length);
   	
   }
   
   public void setAmtd2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd2,amtd2.length);
   	
   }
   
     /**
	 * 	Update Amtd2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtd2 with another Field
	 *	@param value
	 */
   public void setAmtd2(Field source) {
       replace(source,0,source.length(),beginAmtd2,AMTD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Amtd2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtd2,AMTD_2_LEN);
   	
   }
   
     /**
	 * 	Update Amtd2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtd3
	 *	@return amtd3
	 */
   public char[] getAmtd3() throws CFException{
     if (isAmtd3Modified()) { 
        amtd3 = refreshAmtd3();
     }
   		return amtd3;
   }

  
	/**
	*  set variable amtd3
	*  Corresponding COBOL Variable is WS-AMTD3
	*  @param value
	**/
   public void setAmtd3(char[] value) {
      amtd3 = checkAmtd3Constraints(value);
      serializeAmtd3(amtd3);
   } 

     /**
	 * 	Update Amtd3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtd3,amtd3.length);
   	
   }
   
   public void setAmtd3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd3,amtd3.length);
   	
   }
   
     /**
	 * 	Update Amtd3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtd3 with another Field
	 *	@param value
	 */
   public void setAmtd3(Field source) {
       replace(source,0,source.length(),beginAmtd3,AMTD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Amtd3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtd3,AMTD_3_LEN);
   	
   }
   
     /**
	 * 	Update Amtd3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtd4
	 *	@return amtd4
	 */
   public char[] getAmtd4() throws CFException{
     if (isAmtd4Modified()) { 
        amtd4 = refreshAmtd4();
     }
   		return amtd4;
   }

  
	/**
	*  set variable amtd4
	*  Corresponding COBOL Variable is WS-AMTD4
	*  @param value
	**/
   public void setAmtd4(char[] value) {
      amtd4 = checkAmtd4Constraints(value);
      serializeAmtd4(amtd4);
   } 

     /**
	 * 	Update Amtd4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtd4,amtd4.length);
   	
   }
   
   public void setAmtd4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd4,amtd4.length);
   	
   }
   
     /**
	 * 	Update Amtd4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtd4 with another Field
	 *	@param value
	 */
   public void setAmtd4(Field source) {
       replace(source,0,source.length(),beginAmtd4,AMTD_4_LEN);
   	
   }  
   
     /**
	 * 	Update Amtd4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtd4,AMTD_4_LEN);
   	
   }
   
     /**
	 * 	Update Amtd4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtd5
	 *	@return amtd5
	 */
   public char[] getAmtd5() throws CFException{
     if (isAmtd5Modified()) { 
        amtd5 = refreshAmtd5();
     }
   		return amtd5;
   }

  
	/**
	*  set variable amtd5
	*  Corresponding COBOL Variable is WS-AMTD5
	*  @param value
	**/
   public void setAmtd5(char[] value) {
      amtd5 = checkAmtd5Constraints(value);
      serializeAmtd5(amtd5);
   } 

     /**
	 * 	Update Amtd5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtd5,amtd5.length);
   	
   }
   
   public void setAmtd5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd5,amtd5.length);
   	
   }
   
     /**
	 * 	Update Amtd5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtd5 with another Field
	 *	@param value
	 */
   public void setAmtd5(Field source) {
       replace(source,0,source.length(),beginAmtd5,AMTD_5_LEN);
   	
   }  
   
     /**
	 * 	Update Amtd5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtd5,AMTD_5_LEN);
   	
   }
   
     /**
	 * 	Update Amtd5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtd6
	 *	@return amtd6
	 */
   public char[] getAmtd6() throws CFException{
     if (isAmtd6Modified()) { 
        amtd6 = refreshAmtd6();
     }
   		return amtd6;
   }

  
	/**
	*  set variable amtd6
	*  Corresponding COBOL Variable is WS-AMTD6
	*  @param value
	**/
   public void setAmtd6(char[] value) {
      amtd6 = checkAmtd6Constraints(value);
      serializeAmtd6(amtd6);
   } 

     /**
	 * 	Update Amtd6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtd6,amtd6.length);
   	
   }
   
   public void setAmtd6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd6,amtd6.length);
   	
   }
   
     /**
	 * 	Update Amtd6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtd6 with another Field
	 *	@param value
	 */
   public void setAmtd6(Field source) {
       replace(source,0,source.length(),beginAmtd6,AMTD_6_LEN);
   	
   }  
   
     /**
	 * 	Update Amtd6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtd6,AMTD_6_LEN);
   	
   }
   
     /**
	 * 	Update Amtd6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtd7
	 *	@return amtd7
	 */
   public char[] getAmtd7() throws CFException{
     if (isAmtd7Modified()) { 
        amtd7 = refreshAmtd7();
     }
   		return amtd7;
   }

  
	/**
	*  set variable amtd7
	*  Corresponding COBOL Variable is WS-AMTD7
	*  @param value
	**/
   public void setAmtd7(char[] value) {
      amtd7 = checkAmtd7Constraints(value);
      serializeAmtd7(amtd7);
   } 

     /**
	 * 	Update Amtd7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtd7,amtd7.length);
   	
   }
   
   public void setAmtd7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd7,amtd7.length);
   	
   }
   
     /**
	 * 	Update Amtd7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtd7 with another Field
	 *	@param value
	 */
   public void setAmtd7(Field source) {
       replace(source,0,source.length(),beginAmtd7,AMTD_7_LEN);
   	
   }  
   
     /**
	 * 	Update Amtd7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtd7,AMTD_7_LEN);
   	
   }
   
     /**
	 * 	Update Amtd7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtd7+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes MiscAreas
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setAmtd(CONSTANTS.SPACE_18);
   }

		public static int getMiscAreasFieldLength() {
			return MISC_AREAS_LENGTH;
		}

}
  
