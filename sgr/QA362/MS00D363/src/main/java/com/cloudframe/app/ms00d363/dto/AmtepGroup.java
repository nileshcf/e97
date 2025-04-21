package com.cloudframe.app.ms00d363.dto;

/**
*  The class AmtepGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AmtepGroup extends AmtepGroupSerialized {
   

						private char[] amtep = Field.fillLowValue(20);

								private char[] amtep0 = Field.fillLowValue(20);

								private char[] amtep1 = Field.fillLowValue(20);

								private char[] amtep2 = Field.fillLowValue(20);

								private char[] amtep3 = Field.fillLowValue(20);

								private char[] amtep4 = Field.fillLowValue(20);

								private char[] amtep5 = Field.fillLowValue(20);

								private char[] amtep6 = Field.fillLowValue(20);

								private char[] amtep7 = Field.fillLowValue(20);
	
	/**
	* Constructor for AmtepGroup
	**/
    public AmtepGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of amtep
	 *	@return amtep
	 */
   public char[] getAmtep() throws CFException{
     if (isAmtepModified()) { 
        amtep = refreshAmtep();
     }
   		return amtep;
   }

  
	/**
	*  set variable amtep
	*  Corresponding COBOL Variable is WS-AMTEP
	*  @param value
	**/
   public void setAmtep(char[] value) {
      amtep = checkAmtepConstraints(value);
      serializeAmtep(amtep);
   } 

     /**
	 * 	Update Amtep 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtep(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtep,amtep.length);
   	
   }
   
   public void setAmtep(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep,amtep.length);
   	
   }
   
     /**
	 * 	Update Amtep 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtep(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtep with another Field
	 *	@param value
	 */
   public void setAmtep(Field source) {
       replace(source,0,source.length(),beginAmtep,AMTEP_LEN);
   	
   }  
   
     /**
	 * 	Update Amtep 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtep(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtep,AMTEP_LEN);
   	
   }
   
     /**
	 * 	Update Amtep 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtep(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtep0
	 *	@return amtep0
	 */
   public char[] getAmtep0() throws CFException{
     if (isAmtep0Modified()) { 
        amtep0 = refreshAmtep0();
     }
   		return amtep0;
   }

  
	/**
	*  set variable amtep0
	*  Corresponding COBOL Variable is WS-AMTEP0
	*  @param value
	**/
   public void setAmtep0(char[] value) {
      amtep0 = checkAmtep0Constraints(value);
      serializeAmtep0(amtep0);
   } 

     /**
	 * 	Update Amtep0 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtep0(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtep0,amtep0.length);
   	
   }
   
   public void setAmtep0(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep0,amtep0.length);
   	
   }
   
     /**
	 * 	Update Amtep0 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtep0(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep0+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtep0 with another Field
	 *	@param value
	 */
   public void setAmtep0(Field source) {
       replace(source,0,source.length(),beginAmtep0,AMTEP_0_LEN);
   	
   }  
   
     /**
	 * 	Update Amtep0 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtep0(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtep0,AMTEP_0_LEN);
   	
   }
   
     /**
	 * 	Update Amtep0 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtep0(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep0+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtep1
	 *	@return amtep1
	 */
   public char[] getAmtep1() throws CFException{
     if (isAmtep1Modified()) { 
        amtep1 = refreshAmtep1();
     }
   		return amtep1;
   }

  
	/**
	*  set variable amtep1
	*  Corresponding COBOL Variable is WS-AMTEP1
	*  @param value
	**/
   public void setAmtep1(char[] value) {
      amtep1 = checkAmtep1Constraints(value);
      serializeAmtep1(amtep1);
   } 

     /**
	 * 	Update Amtep1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtep1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtep1,amtep1.length);
   	
   }
   
   public void setAmtep1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep1,amtep1.length);
   	
   }
   
     /**
	 * 	Update Amtep1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtep1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtep1 with another Field
	 *	@param value
	 */
   public void setAmtep1(Field source) {
       replace(source,0,source.length(),beginAmtep1,AMTEP_1_LEN);
   	
   }  
   
     /**
	 * 	Update Amtep1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtep1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtep1,AMTEP_1_LEN);
   	
   }
   
     /**
	 * 	Update Amtep1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtep1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtep2
	 *	@return amtep2
	 */
   public char[] getAmtep2() throws CFException{
     if (isAmtep2Modified()) { 
        amtep2 = refreshAmtep2();
     }
   		return amtep2;
   }

  
	/**
	*  set variable amtep2
	*  Corresponding COBOL Variable is WS-AMTEP2
	*  @param value
	**/
   public void setAmtep2(char[] value) {
      amtep2 = checkAmtep2Constraints(value);
      serializeAmtep2(amtep2);
   } 

     /**
	 * 	Update Amtep2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtep2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtep2,amtep2.length);
   	
   }
   
   public void setAmtep2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep2,amtep2.length);
   	
   }
   
     /**
	 * 	Update Amtep2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtep2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtep2 with another Field
	 *	@param value
	 */
   public void setAmtep2(Field source) {
       replace(source,0,source.length(),beginAmtep2,AMTEP_2_LEN);
   	
   }  
   
     /**
	 * 	Update Amtep2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtep2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtep2,AMTEP_2_LEN);
   	
   }
   
     /**
	 * 	Update Amtep2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtep2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtep3
	 *	@return amtep3
	 */
   public char[] getAmtep3() throws CFException{
     if (isAmtep3Modified()) { 
        amtep3 = refreshAmtep3();
     }
   		return amtep3;
   }

  
	/**
	*  set variable amtep3
	*  Corresponding COBOL Variable is WS-AMTEP3
	*  @param value
	**/
   public void setAmtep3(char[] value) {
      amtep3 = checkAmtep3Constraints(value);
      serializeAmtep3(amtep3);
   } 

     /**
	 * 	Update Amtep3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtep3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtep3,amtep3.length);
   	
   }
   
   public void setAmtep3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep3,amtep3.length);
   	
   }
   
     /**
	 * 	Update Amtep3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtep3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtep3 with another Field
	 *	@param value
	 */
   public void setAmtep3(Field source) {
       replace(source,0,source.length(),beginAmtep3,AMTEP_3_LEN);
   	
   }  
   
     /**
	 * 	Update Amtep3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtep3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtep3,AMTEP_3_LEN);
   	
   }
   
     /**
	 * 	Update Amtep3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtep3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtep4
	 *	@return amtep4
	 */
   public char[] getAmtep4() throws CFException{
     if (isAmtep4Modified()) { 
        amtep4 = refreshAmtep4();
     }
   		return amtep4;
   }

  
	/**
	*  set variable amtep4
	*  Corresponding COBOL Variable is WS-AMTEP4
	*  @param value
	**/
   public void setAmtep4(char[] value) {
      amtep4 = checkAmtep4Constraints(value);
      serializeAmtep4(amtep4);
   } 

     /**
	 * 	Update Amtep4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtep4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtep4,amtep4.length);
   	
   }
   
   public void setAmtep4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep4,amtep4.length);
   	
   }
   
     /**
	 * 	Update Amtep4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtep4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtep4 with another Field
	 *	@param value
	 */
   public void setAmtep4(Field source) {
       replace(source,0,source.length(),beginAmtep4,AMTEP_4_LEN);
   	
   }  
   
     /**
	 * 	Update Amtep4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtep4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtep4,AMTEP_4_LEN);
   	
   }
   
     /**
	 * 	Update Amtep4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtep4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtep5
	 *	@return amtep5
	 */
   public char[] getAmtep5() throws CFException{
     if (isAmtep5Modified()) { 
        amtep5 = refreshAmtep5();
     }
   		return amtep5;
   }

  
	/**
	*  set variable amtep5
	*  Corresponding COBOL Variable is WS-AMTEP5
	*  @param value
	**/
   public void setAmtep5(char[] value) {
      amtep5 = checkAmtep5Constraints(value);
      serializeAmtep5(amtep5);
   } 

     /**
	 * 	Update Amtep5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtep5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtep5,amtep5.length);
   	
   }
   
   public void setAmtep5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep5,amtep5.length);
   	
   }
   
     /**
	 * 	Update Amtep5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtep5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtep5 with another Field
	 *	@param value
	 */
   public void setAmtep5(Field source) {
       replace(source,0,source.length(),beginAmtep5,AMTEP_5_LEN);
   	
   }  
   
     /**
	 * 	Update Amtep5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtep5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtep5,AMTEP_5_LEN);
   	
   }
   
     /**
	 * 	Update Amtep5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtep5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtep6
	 *	@return amtep6
	 */
   public char[] getAmtep6() throws CFException{
     if (isAmtep6Modified()) { 
        amtep6 = refreshAmtep6();
     }
   		return amtep6;
   }

  
	/**
	*  set variable amtep6
	*  Corresponding COBOL Variable is WS-AMTEP6
	*  @param value
	**/
   public void setAmtep6(char[] value) {
      amtep6 = checkAmtep6Constraints(value);
      serializeAmtep6(amtep6);
   } 

     /**
	 * 	Update Amtep6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtep6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtep6,amtep6.length);
   	
   }
   
   public void setAmtep6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep6,amtep6.length);
   	
   }
   
     /**
	 * 	Update Amtep6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtep6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtep6 with another Field
	 *	@param value
	 */
   public void setAmtep6(Field source) {
       replace(source,0,source.length(),beginAmtep6,AMTEP_6_LEN);
   	
   }  
   
     /**
	 * 	Update Amtep6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtep6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtep6,AMTEP_6_LEN);
   	
   }
   
     /**
	 * 	Update Amtep6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtep6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of amtep7
	 *	@return amtep7
	 */
   public char[] getAmtep7() throws CFException{
     if (isAmtep7Modified()) { 
        amtep7 = refreshAmtep7();
     }
   		return amtep7;
   }

  
	/**
	*  set variable amtep7
	*  Corresponding COBOL Variable is WS-AMTEP7
	*  @param value
	**/
   public void setAmtep7(char[] value) {
      amtep7 = checkAmtep7Constraints(value);
      serializeAmtep7(amtep7);
   } 

     /**
	 * 	Update Amtep7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtep7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAmtep7,amtep7.length);
   	
   }
   
   public void setAmtep7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep7,amtep7.length);
   	
   }
   
     /**
	 * 	Update Amtep7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtep7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Amtep7 with another Field
	 *	@param value
	 */
   public void setAmtep7(Field source) {
       replace(source,0,source.length(),beginAmtep7,AMTEP_7_LEN);
   	
   }  
   
     /**
	 * 	Update Amtep7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtep7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAmtep7,AMTEP_7_LEN);
   	
   }
   
     /**
	 * 	Update Amtep7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtep7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAmtep7+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAmtepGroupFieldLength() {
			return AMTEP_GROUP_LENGTH;
		}

}
  
