package com.cloudframe.app.ms00d363.dto;

/**
*  The class AmteGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AmteGroup extends AmteGroupSerialized {
   

						private char[] amte = Field.fillLowValue(16);

								private char[] amte0 = Field.fillLowValue(16);

								private char[] amte1 = Field.fillLowValue(16);

								private char[] amte2 = Field.fillLowValue(16);

								private char[] amte3 = Field.fillLowValue(16);

								private char[] amte4 = Field.fillLowValue(16);

								private char[] amte5 = Field.fillLowValue(16);

								private char[] amte6 = Field.fillLowValue(16);

								private char[] amte7 = Field.fillLowValue(16);
	
	/**
	* Constructor for AmteGroup
	**/
    public AmteGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of amte
	 *	@return amte
	 */
   public char[] getAmte() throws CFException{
     if (isAmteModified()) { 
        amte = refreshAmte();
     }
   		return amte;
   }

  
	/**
	*  set variable amte
	*  Corresponding COBOL Variable is WS-AMTE
	*  @param value
	**/
   public void setAmte(char[] value) {
      amte = checkAmteConstraints(value);
      serializeAmte(amte);
   } 

     /**
	 * 	Update Amte 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmte(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmte,amte.length);
   	
   }
   
   public void setAmte(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmte,amte.length);
   	
   }
   
     /**
	 * 	Update Amte 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmte(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amte with another Field
	 *	@param value
	 */
   public void setAmte(Field source) {
       replace(source,0,source.length(),beginAmte,AMTE_LEN);
   	
   }  
   
     /**
	 * 	Update Amte 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmte(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmte,AMTE_LEN);
   	
   }
   
     /**
	 * 	Update Amte 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmte(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amte0
	 *	@return amte0
	 */
   public char[] getAmte0() throws CFException{
     if (isAmte0Modified()) { 
        amte0 = refreshAmte0();
     }
   		return amte0;
   }

  
	/**
	*  set variable amte0
	*  Corresponding COBOL Variable is WS-AMTE0
	*  @param value
	**/
   public void setAmte0(char[] value) {
      amte0 = checkAmte0Constraints(value);
      serializeAmte0(amte0);
   } 

     /**
	 * 	Update Amte0 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmte0(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmte0,amte0.length);
   	
   }
   
   public void setAmte0(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmte0,amte0.length);
   	
   }
   
     /**
	 * 	Update Amte0 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmte0(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte0+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amte0 with another Field
	 *	@param value
	 */
   public void setAmte0(Field source) {
       replace(source,0,source.length(),beginAmte0,AMTE_0_LEN);
   	
   }  
   
     /**
	 * 	Update Amte0 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmte0(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmte0,AMTE_0_LEN);
   	
   }
   
     /**
	 * 	Update Amte0 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmte0(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte0+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amte1
	 *	@return amte1
	 */
   public char[] getAmte1() throws CFException{
     if (isAmte1Modified()) { 
        amte1 = refreshAmte1();
     }
   		return amte1;
   }

  
	/**
	*  set variable amte1
	*  Corresponding COBOL Variable is WS-AMTE1
	*  @param value
	**/
   public void setAmte1(char[] value) {
      amte1 = checkAmte1Constraints(value);
      serializeAmte1(amte1);
   } 

     /**
	 * 	Update Amte1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmte1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmte1,amte1.length);
   	
   }
   
   public void setAmte1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmte1,amte1.length);
   	
   }
   
     /**
	 * 	Update Amte1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmte1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amte1 with another Field
	 *	@param value
	 */
   public void setAmte1(Field source) {
       replace(source,0,source.length(),beginAmte1,AMTE_1_LEN);
   	
   }  
   
     /**
	 * 	Update Amte1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmte1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmte1,AMTE_1_LEN);
   	
   }
   
     /**
	 * 	Update Amte1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmte1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amte2
	 *	@return amte2
	 */
   public char[] getAmte2() throws CFException{
     if (isAmte2Modified()) { 
        amte2 = refreshAmte2();
     }
   		return amte2;
   }

  
	/**
	*  set variable amte2
	*  Corresponding COBOL Variable is WS-AMTE2
	*  @param value
	**/
   public void setAmte2(char[] value) {
      amte2 = checkAmte2Constraints(value);
      serializeAmte2(amte2);
   } 

     /**
	 * 	Update Amte2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmte2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmte2,amte2.length);
   	
   }
   
   public void setAmte2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmte2,amte2.length);
   	
   }
   
     /**
	 * 	Update Amte2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmte2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amte2 with another Field
	 *	@param value
	 */
   public void setAmte2(Field source) {
       replace(source,0,source.length(),beginAmte2,AMTE_2_LEN);
   	
   }  
   
     /**
	 * 	Update Amte2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmte2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmte2,AMTE_2_LEN);
   	
   }
   
     /**
	 * 	Update Amte2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmte2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amte3
	 *	@return amte3
	 */
   public char[] getAmte3() throws CFException{
     if (isAmte3Modified()) { 
        amte3 = refreshAmte3();
     }
   		return amte3;
   }

  
	/**
	*  set variable amte3
	*  Corresponding COBOL Variable is WS-AMTE3
	*  @param value
	**/
   public void setAmte3(char[] value) {
      amte3 = checkAmte3Constraints(value);
      serializeAmte3(amte3);
   } 

     /**
	 * 	Update Amte3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmte3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmte3,amte3.length);
   	
   }
   
   public void setAmte3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmte3,amte3.length);
   	
   }
   
     /**
	 * 	Update Amte3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmte3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amte3 with another Field
	 *	@param value
	 */
   public void setAmte3(Field source) {
       replace(source,0,source.length(),beginAmte3,AMTE_3_LEN);
   	
   }  
   
     /**
	 * 	Update Amte3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmte3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmte3,AMTE_3_LEN);
   	
   }
   
     /**
	 * 	Update Amte3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmte3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amte4
	 *	@return amte4
	 */
   public char[] getAmte4() throws CFException{
     if (isAmte4Modified()) { 
        amte4 = refreshAmte4();
     }
   		return amte4;
   }

  
	/**
	*  set variable amte4
	*  Corresponding COBOL Variable is WS-AMTE4
	*  @param value
	**/
   public void setAmte4(char[] value) {
      amte4 = checkAmte4Constraints(value);
      serializeAmte4(amte4);
   } 

     /**
	 * 	Update Amte4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmte4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmte4,amte4.length);
   	
   }
   
   public void setAmte4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmte4,amte4.length);
   	
   }
   
     /**
	 * 	Update Amte4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmte4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amte4 with another Field
	 *	@param value
	 */
   public void setAmte4(Field source) {
       replace(source,0,source.length(),beginAmte4,AMTE_4_LEN);
   	
   }  
   
     /**
	 * 	Update Amte4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmte4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmte4,AMTE_4_LEN);
   	
   }
   
     /**
	 * 	Update Amte4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmte4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amte5
	 *	@return amte5
	 */
   public char[] getAmte5() throws CFException{
     if (isAmte5Modified()) { 
        amte5 = refreshAmte5();
     }
   		return amte5;
   }

  
	/**
	*  set variable amte5
	*  Corresponding COBOL Variable is WS-AMTE5
	*  @param value
	**/
   public void setAmte5(char[] value) {
      amte5 = checkAmte5Constraints(value);
      serializeAmte5(amte5);
   } 

     /**
	 * 	Update Amte5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmte5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmte5,amte5.length);
   	
   }
   
   public void setAmte5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmte5,amte5.length);
   	
   }
   
     /**
	 * 	Update Amte5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmte5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amte5 with another Field
	 *	@param value
	 */
   public void setAmte5(Field source) {
       replace(source,0,source.length(),beginAmte5,AMTE_5_LEN);
   	
   }  
   
     /**
	 * 	Update Amte5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmte5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmte5,AMTE_5_LEN);
   	
   }
   
     /**
	 * 	Update Amte5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmte5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amte6
	 *	@return amte6
	 */
   public char[] getAmte6() throws CFException{
     if (isAmte6Modified()) { 
        amte6 = refreshAmte6();
     }
   		return amte6;
   }

  
	/**
	*  set variable amte6
	*  Corresponding COBOL Variable is WS-AMTE6
	*  @param value
	**/
   public void setAmte6(char[] value) {
      amte6 = checkAmte6Constraints(value);
      serializeAmte6(amte6);
   } 

     /**
	 * 	Update Amte6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmte6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmte6,amte6.length);
   	
   }
   
   public void setAmte6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmte6,amte6.length);
   	
   }
   
     /**
	 * 	Update Amte6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmte6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amte6 with another Field
	 *	@param value
	 */
   public void setAmte6(Field source) {
       replace(source,0,source.length(),beginAmte6,AMTE_6_LEN);
   	
   }  
   
     /**
	 * 	Update Amte6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmte6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmte6,AMTE_6_LEN);
   	
   }
   
     /**
	 * 	Update Amte6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmte6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amte7
	 *	@return amte7
	 */
   public char[] getAmte7() throws CFException{
     if (isAmte7Modified()) { 
        amte7 = refreshAmte7();
     }
   		return amte7;
   }

  
	/**
	*  set variable amte7
	*  Corresponding COBOL Variable is WS-AMTE7
	*  @param value
	**/
   public void setAmte7(char[] value) {
      amte7 = checkAmte7Constraints(value);
      serializeAmte7(amte7);
   } 

     /**
	 * 	Update Amte7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmte7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmte7,amte7.length);
   	
   }
   
   public void setAmte7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmte7,amte7.length);
   	
   }
   
     /**
	 * 	Update Amte7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmte7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amte7 with another Field
	 *	@param value
	 */
   public void setAmte7(Field source) {
       replace(source,0,source.length(),beginAmte7,AMTE_7_LEN);
   	
   }  
   
     /**
	 * 	Update Amte7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmte7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmte7,AMTE_7_LEN);
   	
   }
   
     /**
	 * 	Update Amte7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmte7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmte7+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAmteGroupFieldLength() {
			return AMTE_GROUP_LENGTH;
		}

}
  
