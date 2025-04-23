package com.cloudframe.app.ms00d363.dto;

/**
*  The class AmtfGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AmtfGroup extends AmtfGroupSerialized {
   

						private char[] amtf = Field.fillLowValue(11);

								private char[] amtf0 = Field.fillLowValue(11);

								private char[] amtf1 = Field.fillLowValue(11);

								private char[] amtf2 = Field.fillLowValue(11);

								private char[] amtf3 = Field.fillLowValue(11);

								private char[] amtf4 = Field.fillLowValue(11);

								private char[] amtf5 = Field.fillLowValue(11);

								private char[] amtf6 = Field.fillLowValue(11);

								private char[] amtf7 = Field.fillLowValue(11);
	
	/**
	* Constructor for AmtfGroup
	**/
    public AmtfGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of amtf
	 *	@return amtf
	 */
   public char[] getAmtf() throws CFException{
     if (isAmtfModified()) { 
        amtf = refreshAmtf();
     }
   		return amtf;
   }

  
	/**
	*  set variable amtf
	*  Corresponding COBOL Variable is WS-AMTF
	*  @param value
	**/
   public void setAmtf(char[] value) {
      amtf = checkAmtfConstraints(value);
      serializeAmtf(amtf);
   } 

     /**
	 * 	Update Amtf 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtf(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtf,amtf.length);
   	
   }
   
   public void setAmtf(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf,amtf.length);
   	
   }
   
     /**
	 * 	Update Amtf 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtf(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtf with another Field
	 *	@param value
	 */
   public void setAmtf(Field source) {
       replace(source,0,source.length(),beginAmtf,AMTF_LEN);
   	
   }  
   
     /**
	 * 	Update Amtf 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtf(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtf,AMTF_LEN);
   	
   }
   
     /**
	 * 	Update Amtf 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtf(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtf0
	 *	@return amtf0
	 */
   public char[] getAmtf0() throws CFException{
     if (isAmtf0Modified()) { 
        amtf0 = refreshAmtf0();
     }
   		return amtf0;
   }

  
	/**
	*  set variable amtf0
	*  Corresponding COBOL Variable is WS-AMTF0
	*  @param value
	**/
   public void setAmtf0(char[] value) {
      amtf0 = checkAmtf0Constraints(value);
      serializeAmtf0(amtf0);
   } 

     /**
	 * 	Update Amtf0 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtf0(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtf0,amtf0.length);
   	
   }
   
   public void setAmtf0(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf0,amtf0.length);
   	
   }
   
     /**
	 * 	Update Amtf0 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtf0(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf0+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtf0 with another Field
	 *	@param value
	 */
   public void setAmtf0(Field source) {
       replace(source,0,source.length(),beginAmtf0,AMTF_0_LEN);
   	
   }  
   
     /**
	 * 	Update Amtf0 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtf0(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtf0,AMTF_0_LEN);
   	
   }
   
     /**
	 * 	Update Amtf0 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtf0(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf0+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtf1
	 *	@return amtf1
	 */
   public char[] getAmtf1() throws CFException{
     if (isAmtf1Modified()) { 
        amtf1 = refreshAmtf1();
     }
   		return amtf1;
   }

  
	/**
	*  set variable amtf1
	*  Corresponding COBOL Variable is WS-AMTF1
	*  @param value
	**/
   public void setAmtf1(char[] value) {
      amtf1 = checkAmtf1Constraints(value);
      serializeAmtf1(amtf1);
   } 

     /**
	 * 	Update Amtf1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtf1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtf1,amtf1.length);
   	
   }
   
   public void setAmtf1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf1,amtf1.length);
   	
   }
   
     /**
	 * 	Update Amtf1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtf1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtf1 with another Field
	 *	@param value
	 */
   public void setAmtf1(Field source) {
       replace(source,0,source.length(),beginAmtf1,AMTF_1_LEN);
   	
   }  
   
     /**
	 * 	Update Amtf1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtf1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtf1,AMTF_1_LEN);
   	
   }
   
     /**
	 * 	Update Amtf1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtf1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtf2
	 *	@return amtf2
	 */
   public char[] getAmtf2() throws CFException{
     if (isAmtf2Modified()) { 
        amtf2 = refreshAmtf2();
     }
   		return amtf2;
   }

  
	/**
	*  set variable amtf2
	*  Corresponding COBOL Variable is WS-AMTF2
	*  @param value
	**/
   public void setAmtf2(char[] value) {
      amtf2 = checkAmtf2Constraints(value);
      serializeAmtf2(amtf2);
   } 

     /**
	 * 	Update Amtf2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtf2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtf2,amtf2.length);
   	
   }
   
   public void setAmtf2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf2,amtf2.length);
   	
   }
   
     /**
	 * 	Update Amtf2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtf2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtf2 with another Field
	 *	@param value
	 */
   public void setAmtf2(Field source) {
       replace(source,0,source.length(),beginAmtf2,AMTF_2_LEN);
   	
   }  
   
     /**
	 * 	Update Amtf2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtf2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtf2,AMTF_2_LEN);
   	
   }
   
     /**
	 * 	Update Amtf2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtf2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtf3
	 *	@return amtf3
	 */
   public char[] getAmtf3() throws CFException{
     if (isAmtf3Modified()) { 
        amtf3 = refreshAmtf3();
     }
   		return amtf3;
   }

  
	/**
	*  set variable amtf3
	*  Corresponding COBOL Variable is WS-AMTF3
	*  @param value
	**/
   public void setAmtf3(char[] value) {
      amtf3 = checkAmtf3Constraints(value);
      serializeAmtf3(amtf3);
   } 

     /**
	 * 	Update Amtf3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtf3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtf3,amtf3.length);
   	
   }
   
   public void setAmtf3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf3,amtf3.length);
   	
   }
   
     /**
	 * 	Update Amtf3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtf3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtf3 with another Field
	 *	@param value
	 */
   public void setAmtf3(Field source) {
       replace(source,0,source.length(),beginAmtf3,AMTF_3_LEN);
   	
   }  
   
     /**
	 * 	Update Amtf3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtf3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtf3,AMTF_3_LEN);
   	
   }
   
     /**
	 * 	Update Amtf3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtf3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtf4
	 *	@return amtf4
	 */
   public char[] getAmtf4() throws CFException{
     if (isAmtf4Modified()) { 
        amtf4 = refreshAmtf4();
     }
   		return amtf4;
   }

  
	/**
	*  set variable amtf4
	*  Corresponding COBOL Variable is WS-AMTF4
	*  @param value
	**/
   public void setAmtf4(char[] value) {
      amtf4 = checkAmtf4Constraints(value);
      serializeAmtf4(amtf4);
   } 

     /**
	 * 	Update Amtf4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtf4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtf4,amtf4.length);
   	
   }
   
   public void setAmtf4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf4,amtf4.length);
   	
   }
   
     /**
	 * 	Update Amtf4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtf4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtf4 with another Field
	 *	@param value
	 */
   public void setAmtf4(Field source) {
       replace(source,0,source.length(),beginAmtf4,AMTF_4_LEN);
   	
   }  
   
     /**
	 * 	Update Amtf4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtf4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtf4,AMTF_4_LEN);
   	
   }
   
     /**
	 * 	Update Amtf4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtf4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtf5
	 *	@return amtf5
	 */
   public char[] getAmtf5() throws CFException{
     if (isAmtf5Modified()) { 
        amtf5 = refreshAmtf5();
     }
   		return amtf5;
   }

  
	/**
	*  set variable amtf5
	*  Corresponding COBOL Variable is WS-AMTF5
	*  @param value
	**/
   public void setAmtf5(char[] value) {
      amtf5 = checkAmtf5Constraints(value);
      serializeAmtf5(amtf5);
   } 

     /**
	 * 	Update Amtf5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtf5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtf5,amtf5.length);
   	
   }
   
   public void setAmtf5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf5,amtf5.length);
   	
   }
   
     /**
	 * 	Update Amtf5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtf5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtf5 with another Field
	 *	@param value
	 */
   public void setAmtf5(Field source) {
       replace(source,0,source.length(),beginAmtf5,AMTF_5_LEN);
   	
   }  
   
     /**
	 * 	Update Amtf5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtf5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtf5,AMTF_5_LEN);
   	
   }
   
     /**
	 * 	Update Amtf5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtf5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtf6
	 *	@return amtf6
	 */
   public char[] getAmtf6() throws CFException{
     if (isAmtf6Modified()) { 
        amtf6 = refreshAmtf6();
     }
   		return amtf6;
   }

  
	/**
	*  set variable amtf6
	*  Corresponding COBOL Variable is WS-AMTF6
	*  @param value
	**/
   public void setAmtf6(char[] value) {
      amtf6 = checkAmtf6Constraints(value);
      serializeAmtf6(amtf6);
   } 

     /**
	 * 	Update Amtf6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtf6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtf6,amtf6.length);
   	
   }
   
   public void setAmtf6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf6,amtf6.length);
   	
   }
   
     /**
	 * 	Update Amtf6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtf6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtf6 with another Field
	 *	@param value
	 */
   public void setAmtf6(Field source) {
       replace(source,0,source.length(),beginAmtf6,AMTF_6_LEN);
   	
   }  
   
     /**
	 * 	Update Amtf6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtf6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtf6,AMTF_6_LEN);
   	
   }
   
     /**
	 * 	Update Amtf6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtf6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtf7
	 *	@return amtf7
	 */
   public char[] getAmtf7() throws CFException{
     if (isAmtf7Modified()) { 
        amtf7 = refreshAmtf7();
     }
   		return amtf7;
   }

  
	/**
	*  set variable amtf7
	*  Corresponding COBOL Variable is WS-AMTF7
	*  @param value
	**/
   public void setAmtf7(char[] value) {
      amtf7 = checkAmtf7Constraints(value);
      serializeAmtf7(amtf7);
   } 

     /**
	 * 	Update Amtf7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtf7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtf7,amtf7.length);
   	
   }
   
   public void setAmtf7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf7,amtf7.length);
   	
   }
   
     /**
	 * 	Update Amtf7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtf7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtf7 with another Field
	 *	@param value
	 */
   public void setAmtf7(Field source) {
       replace(source,0,source.length(),beginAmtf7,AMTF_7_LEN);
   	
   }  
   
     /**
	 * 	Update Amtf7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtf7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtf7,AMTF_7_LEN);
   	
   }
   
     /**
	 * 	Update Amtf7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtf7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtf7+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAmtfGroupFieldLength() {
			return AMTF_GROUP_LENGTH;
		}

}
  
