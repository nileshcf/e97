package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01Fc2DataIndRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Bdms01Fc2DataIndRedefined extends Bdms01Fc2DataIndRedefinedSerialized { 
   

						private char[] bdms01Fc2Ind1 = Field.fillLowValue(1);

						private char[] bdms01Fc2Ind2 = Field.fillLowValue(1);

						private char[] bdms01Fc2Ind3 = Field.fillLowValue(1);

						private char[] bdms01Fc2Ind4 = Field.fillLowValue(1);

						private char[] bdms01Fc2Ind5 = Field.fillLowValue(1);

						private char[] bdms01Fc2Ind6 = Field.fillLowValue(1);

						private char[] bdms01Fc2Ind7 = Field.fillLowValue(1);

						private char[] bdms01Fc2Ind8 = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01Fc2DataIndRedefined
	**/
    public Bdms01Fc2DataIndRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01Fc2DataIndRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01Fc2DataIndRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01Fc2Ind1
	 *	@return bdms01Fc2Ind1
	 */
   public char[] getBdms01Fc2Ind1() throws CFException{
     if (isBdms01Fc2Ind1Modified()) { 
        bdms01Fc2Ind1 = refreshBdms01Fc2Ind1();
     }
   		return bdms01Fc2Ind1;
   }

  
	/**
	*  set variable bdms01Fc2Ind1
	*  Corresponding COBOL Variable is BDMS01-FC2-IND-1
	*  @param value
	**/
   public void setBdms01Fc2Ind1(char[] value) {
      bdms01Fc2Ind1 = checkBdms01Fc2Ind1Constraints(value);
      serializeBdms01Fc2Ind1(bdms01Fc2Ind1);
   } 

     /**
	 * 	Update Bdms01Fc2Ind1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2Ind1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2Ind1,bdms01Fc2Ind1.length);
   	
   }
   
   public void setBdms01Fc2Ind1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind1,bdms01Fc2Ind1.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2Ind1 with another Field
	 *	@param value
	 */
   public void setBdms01Fc2Ind1(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2Ind1,BDMS_01_FC_2_IND_1_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2Ind1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2Ind1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind1,BDMS_01_FC_2_IND_1_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2Ind2
	 *	@return bdms01Fc2Ind2
	 */
   public char[] getBdms01Fc2Ind2() throws CFException{
     if (isBdms01Fc2Ind2Modified()) { 
        bdms01Fc2Ind2 = refreshBdms01Fc2Ind2();
     }
   		return bdms01Fc2Ind2;
   }

  
	/**
	*  set variable bdms01Fc2Ind2
	*  Corresponding COBOL Variable is BDMS01-FC2-IND-2
	*  @param value
	**/
   public void setBdms01Fc2Ind2(char[] value) {
      bdms01Fc2Ind2 = checkBdms01Fc2Ind2Constraints(value);
      serializeBdms01Fc2Ind2(bdms01Fc2Ind2);
   } 

     /**
	 * 	Update Bdms01Fc2Ind2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2Ind2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2Ind2,bdms01Fc2Ind2.length);
   	
   }
   
   public void setBdms01Fc2Ind2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind2,bdms01Fc2Ind2.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2Ind2 with another Field
	 *	@param value
	 */
   public void setBdms01Fc2Ind2(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2Ind2,BDMS_01_FC_2_IND_2_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2Ind2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2Ind2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind2,BDMS_01_FC_2_IND_2_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2Ind3
	 *	@return bdms01Fc2Ind3
	 */
   public char[] getBdms01Fc2Ind3() throws CFException{
     if (isBdms01Fc2Ind3Modified()) { 
        bdms01Fc2Ind3 = refreshBdms01Fc2Ind3();
     }
   		return bdms01Fc2Ind3;
   }

  
	/**
	*  set variable bdms01Fc2Ind3
	*  Corresponding COBOL Variable is BDMS01-FC2-IND-3
	*  @param value
	**/
   public void setBdms01Fc2Ind3(char[] value) {
      bdms01Fc2Ind3 = checkBdms01Fc2Ind3Constraints(value);
      serializeBdms01Fc2Ind3(bdms01Fc2Ind3);
   } 

     /**
	 * 	Update Bdms01Fc2Ind3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2Ind3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2Ind3,bdms01Fc2Ind3.length);
   	
   }
   
   public void setBdms01Fc2Ind3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind3,bdms01Fc2Ind3.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2Ind3 with another Field
	 *	@param value
	 */
   public void setBdms01Fc2Ind3(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2Ind3,BDMS_01_FC_2_IND_3_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2Ind3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2Ind3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind3,BDMS_01_FC_2_IND_3_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2Ind4
	 *	@return bdms01Fc2Ind4
	 */
   public char[] getBdms01Fc2Ind4() throws CFException{
     if (isBdms01Fc2Ind4Modified()) { 
        bdms01Fc2Ind4 = refreshBdms01Fc2Ind4();
     }
   		return bdms01Fc2Ind4;
   }

  
	/**
	*  set variable bdms01Fc2Ind4
	*  Corresponding COBOL Variable is BDMS01-FC2-IND-4
	*  @param value
	**/
   public void setBdms01Fc2Ind4(char[] value) {
      bdms01Fc2Ind4 = checkBdms01Fc2Ind4Constraints(value);
      serializeBdms01Fc2Ind4(bdms01Fc2Ind4);
   } 

     /**
	 * 	Update Bdms01Fc2Ind4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2Ind4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2Ind4,bdms01Fc2Ind4.length);
   	
   }
   
   public void setBdms01Fc2Ind4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind4,bdms01Fc2Ind4.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2Ind4 with another Field
	 *	@param value
	 */
   public void setBdms01Fc2Ind4(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2Ind4,BDMS_01_FC_2_IND_4_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2Ind4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2Ind4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind4,BDMS_01_FC_2_IND_4_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2Ind5
	 *	@return bdms01Fc2Ind5
	 */
   public char[] getBdms01Fc2Ind5() throws CFException{
     if (isBdms01Fc2Ind5Modified()) { 
        bdms01Fc2Ind5 = refreshBdms01Fc2Ind5();
     }
   		return bdms01Fc2Ind5;
   }

  
	/**
	*  set variable bdms01Fc2Ind5
	*  Corresponding COBOL Variable is BDMS01-FC2-IND-5
	*  @param value
	**/
   public void setBdms01Fc2Ind5(char[] value) {
      bdms01Fc2Ind5 = checkBdms01Fc2Ind5Constraints(value);
      serializeBdms01Fc2Ind5(bdms01Fc2Ind5);
   } 

     /**
	 * 	Update Bdms01Fc2Ind5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2Ind5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2Ind5,bdms01Fc2Ind5.length);
   	
   }
   
   public void setBdms01Fc2Ind5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind5,bdms01Fc2Ind5.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2Ind5 with another Field
	 *	@param value
	 */
   public void setBdms01Fc2Ind5(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2Ind5,BDMS_01_FC_2_IND_5_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2Ind5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2Ind5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind5,BDMS_01_FC_2_IND_5_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2Ind6
	 *	@return bdms01Fc2Ind6
	 */
   public char[] getBdms01Fc2Ind6() throws CFException{
     if (isBdms01Fc2Ind6Modified()) { 
        bdms01Fc2Ind6 = refreshBdms01Fc2Ind6();
     }
   		return bdms01Fc2Ind6;
   }

  
	/**
	*  set variable bdms01Fc2Ind6
	*  Corresponding COBOL Variable is BDMS01-FC2-IND-6
	*  @param value
	**/
   public void setBdms01Fc2Ind6(char[] value) {
      bdms01Fc2Ind6 = checkBdms01Fc2Ind6Constraints(value);
      serializeBdms01Fc2Ind6(bdms01Fc2Ind6);
   } 

     /**
	 * 	Update Bdms01Fc2Ind6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2Ind6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2Ind6,bdms01Fc2Ind6.length);
   	
   }
   
   public void setBdms01Fc2Ind6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind6,bdms01Fc2Ind6.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2Ind6 with another Field
	 *	@param value
	 */
   public void setBdms01Fc2Ind6(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2Ind6,BDMS_01_FC_2_IND_6_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2Ind6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2Ind6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind6,BDMS_01_FC_2_IND_6_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2Ind7
	 *	@return bdms01Fc2Ind7
	 */
   public char[] getBdms01Fc2Ind7() throws CFException{
     if (isBdms01Fc2Ind7Modified()) { 
        bdms01Fc2Ind7 = refreshBdms01Fc2Ind7();
     }
   		return bdms01Fc2Ind7;
   }

  
	/**
	*  set variable bdms01Fc2Ind7
	*  Corresponding COBOL Variable is BDMS01-FC2-IND-7
	*  @param value
	**/
   public void setBdms01Fc2Ind7(char[] value) {
      bdms01Fc2Ind7 = checkBdms01Fc2Ind7Constraints(value);
      serializeBdms01Fc2Ind7(bdms01Fc2Ind7);
   } 

     /**
	 * 	Update Bdms01Fc2Ind7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2Ind7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2Ind7,bdms01Fc2Ind7.length);
   	
   }
   
   public void setBdms01Fc2Ind7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind7,bdms01Fc2Ind7.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2Ind7 with another Field
	 *	@param value
	 */
   public void setBdms01Fc2Ind7(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2Ind7,BDMS_01_FC_2_IND_7_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2Ind7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2Ind7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind7,BDMS_01_FC_2_IND_7_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind7+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2Ind8
	 *	@return bdms01Fc2Ind8
	 */
   public char[] getBdms01Fc2Ind8() throws CFException{
     if (isBdms01Fc2Ind8Modified()) { 
        bdms01Fc2Ind8 = refreshBdms01Fc2Ind8();
     }
   		return bdms01Fc2Ind8;
   }

  
	/**
	*  set variable bdms01Fc2Ind8
	*  Corresponding COBOL Variable is BDMS01-FC2-IND-8
	*  @param value
	**/
   public void setBdms01Fc2Ind8(char[] value) {
      bdms01Fc2Ind8 = checkBdms01Fc2Ind8Constraints(value);
      serializeBdms01Fc2Ind8(bdms01Fc2Ind8);
   } 

     /**
	 * 	Update Bdms01Fc2Ind8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2Ind8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2Ind8,bdms01Fc2Ind8.length);
   	
   }
   
   public void setBdms01Fc2Ind8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind8,bdms01Fc2Ind8.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2Ind8 with another Field
	 *	@param value
	 */
   public void setBdms01Fc2Ind8(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2Ind8,BDMS_01_FC_2_IND_8_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2Ind8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2Ind8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind8,BDMS_01_FC_2_IND_8_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2Ind8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2Ind8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2Ind8+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBdms01Fc2DataIndRedefinedFieldLength() {
			return BDMS_01_FC_2_DATA_IND_REDEFINED_LENGTH;
		}

}
  
