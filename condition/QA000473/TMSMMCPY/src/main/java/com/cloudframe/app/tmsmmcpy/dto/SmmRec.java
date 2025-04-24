package com.cloudframe.app.tmsmmcpy.dto;

/**
*  The class SmmRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:29. using version 5.0.0.254
**/


import com.cloudframe.app.tmsmmcpy.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SmmRec extends SmmRecSerialized { 
   
				private SmmKey smmKey = new SmmKey();

						private char[] smmSsDdrKey = Field.fillLowValue(10);

						private char[] smmMatchStatus = Field.fillLowValue(2);

						private char[] smmClassification = Field.fillLowValue(2);

						private char[] smmField2 = Field.fillLowValue(30);

						private char[] smmField4 = Field.fillLowValue(30);

						private char[] smmField5 = Field.fillLowValue(30);

						private char[] smmField6 = Field.fillLowValue(30);

						private char[] smmField7 = Field.fillLowValue(30);

						private char[] smmField8 = Field.fillLowValue(30);

						private char[] smmField9 = Field.fillLowValue(30);

						private char[] smmField10 = Field.fillLowValue(30);

						private char[] smmField11 = Field.fillLowValue(30);

						private char[] smmField12 = Field.fillLowValue(30);

						private char[] smmField13 = Field.fillLowValue(30);

						private char[] smmField14 = Field.fillLowValue(30);

						private char[] smmField15 = Field.fillLowValue(30);

						private char[] smmBranch = Field.fillLowValue(10);

						private char[] smmTeller = Field.fillLowValue(10);

						private char[] smmHash = Field.fillLowValue(30);

						private char[] smmType = Field.fillLowValue(10);

						private char[] smmAppTypePsetNum = Field.fillLowValue(3);

						private char[] smmPostingDate = Field.fillLowValue(10);

						private char[] smmTransTime = Field.fillLowValue(8);

						private char[] smmRefText1 = Field.fillLowValue(30);

						private char[] smmRefText2 = Field.fillLowValue(30);

						private char[] smmRefText3 = Field.fillLowValue(30);

						private char[] smmRefText4 = Field.fillLowValue(30);

						private char[] smmRefText5 = Field.fillLowValue(30);

						private char[] smmRefNum1 = Field.fillLowValue(30);

						private char[] smmRefNum2 = Field.fillLowValue(30);

						private char[] smmSubclass = Field.fillLowValue(10);

						private char[] smmFlags = Field.fillLowValue(5);

						private char[] smmCycleNo = Field.fillLowValue(1);

						private char[] smmCycleDate = Field.fillLowValue(8);

						private char[] smmEnd = Field.fillLowValue(3);
	
	/**
	* Constructor for SmmRec
	**/
    public SmmRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			smmKey.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of smmKey
	 *	@return smmKey
	 */   
	 public SmmKey getSmmKey() {
   	return smmKey;
   }
   /**
	* 	Update SmmKey with the passed value
	*   Corresponding COBOL Variable is SMM-KEY
	*	@param value
	*/
   public void setSmmKey(char[] value) {
      smmKey.setString(value); 
   }   
    
     /**
	 * 	Update SmmKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSmmKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,smmKey.begin,smmKey.length());
   }
   
     /**
	 * 	Update SmmKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,smmKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SmmKey with another Field
	 *	@param value
	 */
   public void setSmmKey(Field source) {
   	replace(source,0,source.length(),smmKey.begin,smmKey.length());
   }  
   
     /**
	 * 	Update SmmKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSmmKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,smmKey.begin,smmKey.length());
   }
   
     /**
	 * 	Update SmmKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,smmKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of smmSsDdrKey
	 *	@return smmSsDdrKey
	 */
   public char[] getSmmSsDdrKey() throws CFException{
     if (isSmmSsDdrKeyModified()) { 
        smmSsDdrKey = refreshSmmSsDdrKey();
     }
   		return smmSsDdrKey;
   }

  
	/**
	*  set variable smmSsDdrKey
	*  Corresponding COBOL Variable is SMM-SS-DDR-KEY
	*  @param value
	**/
   public void setSmmSsDdrKey(char[] value) {
      smmSsDdrKey = checkSmmSsDdrKeyConstraints(value);
      serializeSmmSsDdrKey(smmSsDdrKey);
   } 

     /**
	 * 	Update SmmSsDdrKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmSsDdrKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmSsDdrKey,smmSsDdrKey.length);
   	
   }
   
   public void setSmmSsDdrKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmSsDdrKey,smmSsDdrKey.length);
   	
   }
   
     /**
	 * 	Update SmmSsDdrKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmSsDdrKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmSsDdrKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmSsDdrKey with another Field
	 *	@param value
	 */
   public void setSmmSsDdrKey(Field source) {
       replace(source,0,source.length(),beginSmmSsDdrKey,SMM_SS_DDR_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update SmmSsDdrKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmSsDdrKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmSsDdrKey,SMM_SS_DDR_KEY_LEN);
   	
   }
   
     /**
	 * 	Update SmmSsDdrKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmSsDdrKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmSsDdrKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmMatchStatus
	 *	@return smmMatchStatus
	 */
   public char[] getSmmMatchStatus() throws CFException{
     if (isSmmMatchStatusModified()) { 
        smmMatchStatus = refreshSmmMatchStatus();
     }
   		return smmMatchStatus;
   }

  
	/**
	*  set variable smmMatchStatus
	*  Corresponding COBOL Variable is SMM-MATCH-STATUS
	*  @param value
	**/
   public void setSmmMatchStatus(char[] value) {
      smmMatchStatus = checkSmmMatchStatusConstraints(value);
      serializeSmmMatchStatus(smmMatchStatus);
   } 

     /**
	 * 	Update SmmMatchStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmMatchStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmMatchStatus,smmMatchStatus.length);
   	
   }
   
   public void setSmmMatchStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmMatchStatus,smmMatchStatus.length);
   	
   }
   
     /**
	 * 	Update SmmMatchStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmMatchStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmMatchStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmMatchStatus with another Field
	 *	@param value
	 */
   public void setSmmMatchStatus(Field source) {
       replace(source,0,source.length(),beginSmmMatchStatus,SMM_MATCH_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update SmmMatchStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmMatchStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmMatchStatus,SMM_MATCH_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update SmmMatchStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmMatchStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmMatchStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmClassification
	 *	@return smmClassification
	 */
   public char[] getSmmClassification() throws CFException{
     if (isSmmClassificationModified()) { 
        smmClassification = refreshSmmClassification();
     }
   		return smmClassification;
   }

  
	/**
	*  set variable smmClassification
	*  Corresponding COBOL Variable is SMM-CLASSIFICATION
	*  @param value
	**/
   public void setSmmClassification(char[] value) {
      smmClassification = checkSmmClassificationConstraints(value);
      serializeSmmClassification(smmClassification);
   } 

     /**
	 * 	Update SmmClassification 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmClassification(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmClassification,smmClassification.length);
   	
   }
   
   public void setSmmClassification(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmClassification,smmClassification.length);
   	
   }
   
     /**
	 * 	Update SmmClassification 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmClassification(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmClassification+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmClassification with another Field
	 *	@param value
	 */
   public void setSmmClassification(Field source) {
       replace(source,0,source.length(),beginSmmClassification,SMM_CLASSIFICATION_LEN);
   	
   }  
   
     /**
	 * 	Update SmmClassification 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmClassification(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmClassification,SMM_CLASSIFICATION_LEN);
   	
   }
   
     /**
	 * 	Update SmmClassification 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmClassification(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmClassification+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField2
	 *	@return smmField2
	 */
   public char[] getSmmField2() throws CFException{
     if (isSmmField2Modified()) { 
        smmField2 = refreshSmmField2();
     }
   		return smmField2;
   }

  
	/**
	*  set variable smmField2
	*  Corresponding COBOL Variable is SMM-FIELD2
	*  @param value
	**/
   public void setSmmField2(char[] value) {
      smmField2 = checkSmmField2Constraints(value);
      serializeSmmField2(smmField2);
   } 

     /**
	 * 	Update SmmField2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField2,smmField2.length);
   	
   }
   
   public void setSmmField2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField2,smmField2.length);
   	
   }
   
     /**
	 * 	Update SmmField2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField2 with another Field
	 *	@param value
	 */
   public void setSmmField2(Field source) {
       replace(source,0,source.length(),beginSmmField2,SMM_FIELD_2_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField2,SMM_FIELD_2_LEN);
   	
   }
   
     /**
	 * 	Update SmmField2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField4
	 *	@return smmField4
	 */
   public char[] getSmmField4() throws CFException{
     if (isSmmField4Modified()) { 
        smmField4 = refreshSmmField4();
     }
   		return smmField4;
   }

  
	/**
	*  set variable smmField4
	*  Corresponding COBOL Variable is SMM-FIELD4
	*  @param value
	**/
   public void setSmmField4(char[] value) {
      smmField4 = checkSmmField4Constraints(value);
      serializeSmmField4(smmField4);
   } 

     /**
	 * 	Update SmmField4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField4,smmField4.length);
   	
   }
   
   public void setSmmField4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField4,smmField4.length);
   	
   }
   
     /**
	 * 	Update SmmField4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField4 with another Field
	 *	@param value
	 */
   public void setSmmField4(Field source) {
       replace(source,0,source.length(),beginSmmField4,SMM_FIELD_4_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField4,SMM_FIELD_4_LEN);
   	
   }
   
     /**
	 * 	Update SmmField4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField5
	 *	@return smmField5
	 */
   public char[] getSmmField5() throws CFException{
     if (isSmmField5Modified()) { 
        smmField5 = refreshSmmField5();
     }
   		return smmField5;
   }

  
	/**
	*  set variable smmField5
	*  Corresponding COBOL Variable is SMM-FIELD5
	*  @param value
	**/
   public void setSmmField5(char[] value) {
      smmField5 = checkSmmField5Constraints(value);
      serializeSmmField5(smmField5);
   } 

     /**
	 * 	Update SmmField5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField5,smmField5.length);
   	
   }
   
   public void setSmmField5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField5,smmField5.length);
   	
   }
   
     /**
	 * 	Update SmmField5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField5 with another Field
	 *	@param value
	 */
   public void setSmmField5(Field source) {
       replace(source,0,source.length(),beginSmmField5,SMM_FIELD_5_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField5,SMM_FIELD_5_LEN);
   	
   }
   
     /**
	 * 	Update SmmField5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField6
	 *	@return smmField6
	 */
   public char[] getSmmField6() throws CFException{
     if (isSmmField6Modified()) { 
        smmField6 = refreshSmmField6();
     }
   		return smmField6;
   }

  
	/**
	*  set variable smmField6
	*  Corresponding COBOL Variable is SMM-FIELD6
	*  @param value
	**/
   public void setSmmField6(char[] value) {
      smmField6 = checkSmmField6Constraints(value);
      serializeSmmField6(smmField6);
   } 

     /**
	 * 	Update SmmField6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField6,smmField6.length);
   	
   }
   
   public void setSmmField6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField6,smmField6.length);
   	
   }
   
     /**
	 * 	Update SmmField6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField6 with another Field
	 *	@param value
	 */
   public void setSmmField6(Field source) {
       replace(source,0,source.length(),beginSmmField6,SMM_FIELD_6_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField6,SMM_FIELD_6_LEN);
   	
   }
   
     /**
	 * 	Update SmmField6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField7
	 *	@return smmField7
	 */
   public char[] getSmmField7() throws CFException{
     if (isSmmField7Modified()) { 
        smmField7 = refreshSmmField7();
     }
   		return smmField7;
   }

  
	/**
	*  set variable smmField7
	*  Corresponding COBOL Variable is SMM-FIELD7
	*  @param value
	**/
   public void setSmmField7(char[] value) {
      smmField7 = checkSmmField7Constraints(value);
      serializeSmmField7(smmField7);
   } 

     /**
	 * 	Update SmmField7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField7,smmField7.length);
   	
   }
   
   public void setSmmField7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField7,smmField7.length);
   	
   }
   
     /**
	 * 	Update SmmField7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField7 with another Field
	 *	@param value
	 */
   public void setSmmField7(Field source) {
       replace(source,0,source.length(),beginSmmField7,SMM_FIELD_7_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField7,SMM_FIELD_7_LEN);
   	
   }
   
     /**
	 * 	Update SmmField7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField7+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField8
	 *	@return smmField8
	 */
   public char[] getSmmField8() throws CFException{
     if (isSmmField8Modified()) { 
        smmField8 = refreshSmmField8();
     }
   		return smmField8;
   }

  
	/**
	*  set variable smmField8
	*  Corresponding COBOL Variable is SMM-FIELD8
	*  @param value
	**/
   public void setSmmField8(char[] value) {
      smmField8 = checkSmmField8Constraints(value);
      serializeSmmField8(smmField8);
   } 

     /**
	 * 	Update SmmField8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField8,smmField8.length);
   	
   }
   
   public void setSmmField8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField8,smmField8.length);
   	
   }
   
     /**
	 * 	Update SmmField8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField8 with another Field
	 *	@param value
	 */
   public void setSmmField8(Field source) {
       replace(source,0,source.length(),beginSmmField8,SMM_FIELD_8_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField8,SMM_FIELD_8_LEN);
   	
   }
   
     /**
	 * 	Update SmmField8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField8+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField9
	 *	@return smmField9
	 */
   public char[] getSmmField9() throws CFException{
     if (isSmmField9Modified()) { 
        smmField9 = refreshSmmField9();
     }
   		return smmField9;
   }

  
	/**
	*  set variable smmField9
	*  Corresponding COBOL Variable is SMM-FIELD9
	*  @param value
	**/
   public void setSmmField9(char[] value) {
      smmField9 = checkSmmField9Constraints(value);
      serializeSmmField9(smmField9);
   } 

     /**
	 * 	Update SmmField9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField9(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField9,smmField9.length);
   	
   }
   
   public void setSmmField9(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField9,smmField9.length);
   	
   }
   
     /**
	 * 	Update SmmField9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField9+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField9 with another Field
	 *	@param value
	 */
   public void setSmmField9(Field source) {
       replace(source,0,source.length(),beginSmmField9,SMM_FIELD_9_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField9(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField9,SMM_FIELD_9_LEN);
   	
   }
   
     /**
	 * 	Update SmmField9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField9+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField10
	 *	@return smmField10
	 */
   public char[] getSmmField10() throws CFException{
     if (isSmmField10Modified()) { 
        smmField10 = refreshSmmField10();
     }
   		return smmField10;
   }

  
	/**
	*  set variable smmField10
	*  Corresponding COBOL Variable is SMM-FIELD10
	*  @param value
	**/
   public void setSmmField10(char[] value) {
      smmField10 = checkSmmField10Constraints(value);
      serializeSmmField10(smmField10);
   } 

     /**
	 * 	Update SmmField10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField10,smmField10.length);
   	
   }
   
   public void setSmmField10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField10,smmField10.length);
   	
   }
   
     /**
	 * 	Update SmmField10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField10 with another Field
	 *	@param value
	 */
   public void setSmmField10(Field source) {
       replace(source,0,source.length(),beginSmmField10,SMM_FIELD_10_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField10,SMM_FIELD_10_LEN);
   	
   }
   
     /**
	 * 	Update SmmField10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField10+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField11
	 *	@return smmField11
	 */
   public char[] getSmmField11() throws CFException{
     if (isSmmField11Modified()) { 
        smmField11 = refreshSmmField11();
     }
   		return smmField11;
   }

  
	/**
	*  set variable smmField11
	*  Corresponding COBOL Variable is SMM-FIELD11
	*  @param value
	**/
   public void setSmmField11(char[] value) {
      smmField11 = checkSmmField11Constraints(value);
      serializeSmmField11(smmField11);
   } 

     /**
	 * 	Update SmmField11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField11,smmField11.length);
   	
   }
   
   public void setSmmField11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField11,smmField11.length);
   	
   }
   
     /**
	 * 	Update SmmField11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField11 with another Field
	 *	@param value
	 */
   public void setSmmField11(Field source) {
       replace(source,0,source.length(),beginSmmField11,SMM_FIELD_11_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField11,SMM_FIELD_11_LEN);
   	
   }
   
     /**
	 * 	Update SmmField11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField12
	 *	@return smmField12
	 */
   public char[] getSmmField12() throws CFException{
     if (isSmmField12Modified()) { 
        smmField12 = refreshSmmField12();
     }
   		return smmField12;
   }

  
	/**
	*  set variable smmField12
	*  Corresponding COBOL Variable is SMM-FIELD12
	*  @param value
	**/
   public void setSmmField12(char[] value) {
      smmField12 = checkSmmField12Constraints(value);
      serializeSmmField12(smmField12);
   } 

     /**
	 * 	Update SmmField12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField12,smmField12.length);
   	
   }
   
   public void setSmmField12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField12,smmField12.length);
   	
   }
   
     /**
	 * 	Update SmmField12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField12 with another Field
	 *	@param value
	 */
   public void setSmmField12(Field source) {
       replace(source,0,source.length(),beginSmmField12,SMM_FIELD_12_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField12,SMM_FIELD_12_LEN);
   	
   }
   
     /**
	 * 	Update SmmField12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField12+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField13
	 *	@return smmField13
	 */
   public char[] getSmmField13() throws CFException{
     if (isSmmField13Modified()) { 
        smmField13 = refreshSmmField13();
     }
   		return smmField13;
   }

  
	/**
	*  set variable smmField13
	*  Corresponding COBOL Variable is SMM-FIELD13
	*  @param value
	**/
   public void setSmmField13(char[] value) {
      smmField13 = checkSmmField13Constraints(value);
      serializeSmmField13(smmField13);
   } 

     /**
	 * 	Update SmmField13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField13,smmField13.length);
   	
   }
   
   public void setSmmField13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField13,smmField13.length);
   	
   }
   
     /**
	 * 	Update SmmField13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField13 with another Field
	 *	@param value
	 */
   public void setSmmField13(Field source) {
       replace(source,0,source.length(),beginSmmField13,SMM_FIELD_13_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField13,SMM_FIELD_13_LEN);
   	
   }
   
     /**
	 * 	Update SmmField13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField14
	 *	@return smmField14
	 */
   public char[] getSmmField14() throws CFException{
     if (isSmmField14Modified()) { 
        smmField14 = refreshSmmField14();
     }
   		return smmField14;
   }

  
	/**
	*  set variable smmField14
	*  Corresponding COBOL Variable is SMM-FIELD14
	*  @param value
	**/
   public void setSmmField14(char[] value) {
      smmField14 = checkSmmField14Constraints(value);
      serializeSmmField14(smmField14);
   } 

     /**
	 * 	Update SmmField14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField14,smmField14.length);
   	
   }
   
   public void setSmmField14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField14,smmField14.length);
   	
   }
   
     /**
	 * 	Update SmmField14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField14 with another Field
	 *	@param value
	 */
   public void setSmmField14(Field source) {
       replace(source,0,source.length(),beginSmmField14,SMM_FIELD_14_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField14,SMM_FIELD_14_LEN);
   	
   }
   
     /**
	 * 	Update SmmField14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField14+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField15
	 *	@return smmField15
	 */
   public char[] getSmmField15() throws CFException{
     if (isSmmField15Modified()) { 
        smmField15 = refreshSmmField15();
     }
   		return smmField15;
   }

  
	/**
	*  set variable smmField15
	*  Corresponding COBOL Variable is SMM-FIELD15
	*  @param value
	**/
   public void setSmmField15(char[] value) {
      smmField15 = checkSmmField15Constraints(value);
      serializeSmmField15(smmField15);
   } 

     /**
	 * 	Update SmmField15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField15,smmField15.length);
   	
   }
   
   public void setSmmField15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField15,smmField15.length);
   	
   }
   
     /**
	 * 	Update SmmField15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField15 with another Field
	 *	@param value
	 */
   public void setSmmField15(Field source) {
       replace(source,0,source.length(),beginSmmField15,SMM_FIELD_15_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField15,SMM_FIELD_15_LEN);
   	
   }
   
     /**
	 * 	Update SmmField15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmBranch
	 *	@return smmBranch
	 */
   public char[] getSmmBranch() throws CFException{
     if (isSmmBranchModified()) { 
        smmBranch = refreshSmmBranch();
     }
   		return smmBranch;
   }

  
	/**
	*  set variable smmBranch
	*  Corresponding COBOL Variable is SMM-BRANCH
	*  @param value
	**/
   public void setSmmBranch(char[] value) {
      smmBranch = checkSmmBranchConstraints(value);
      serializeSmmBranch(smmBranch);
   } 

     /**
	 * 	Update SmmBranch 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmBranch(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmBranch,smmBranch.length);
   	
   }
   
   public void setSmmBranch(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmBranch,smmBranch.length);
   	
   }
   
     /**
	 * 	Update SmmBranch 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmBranch(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmBranch+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmBranch with another Field
	 *	@param value
	 */
   public void setSmmBranch(Field source) {
       replace(source,0,source.length(),beginSmmBranch,SMM_BRANCH_LEN);
   	
   }  
   
     /**
	 * 	Update SmmBranch 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmBranch(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmBranch,SMM_BRANCH_LEN);
   	
   }
   
     /**
	 * 	Update SmmBranch 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmBranch(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmBranch+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmTeller
	 *	@return smmTeller
	 */
   public char[] getSmmTeller() throws CFException{
     if (isSmmTellerModified()) { 
        smmTeller = refreshSmmTeller();
     }
   		return smmTeller;
   }

  
	/**
	*  set variable smmTeller
	*  Corresponding COBOL Variable is SMM-TELLER
	*  @param value
	**/
   public void setSmmTeller(char[] value) {
      smmTeller = checkSmmTellerConstraints(value);
      serializeSmmTeller(smmTeller);
   } 

     /**
	 * 	Update SmmTeller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmTeller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmTeller,smmTeller.length);
   	
   }
   
   public void setSmmTeller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmTeller,smmTeller.length);
   	
   }
   
     /**
	 * 	Update SmmTeller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmTeller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmTeller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmTeller with another Field
	 *	@param value
	 */
   public void setSmmTeller(Field source) {
       replace(source,0,source.length(),beginSmmTeller,SMM_TELLER_LEN);
   	
   }  
   
     /**
	 * 	Update SmmTeller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmTeller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmTeller,SMM_TELLER_LEN);
   	
   }
   
     /**
	 * 	Update SmmTeller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmTeller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmTeller+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmHash
	 *	@return smmHash
	 */
   public char[] getSmmHash() throws CFException{
     if (isSmmHashModified()) { 
        smmHash = refreshSmmHash();
     }
   		return smmHash;
   }

  
	/**
	*  set variable smmHash
	*  Corresponding COBOL Variable is SMM-HASH
	*  @param value
	**/
   public void setSmmHash(char[] value) {
      smmHash = checkSmmHashConstraints(value);
      serializeSmmHash(smmHash);
   } 

     /**
	 * 	Update SmmHash 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmHash(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmHash,smmHash.length);
   	
   }
   
   public void setSmmHash(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmHash,smmHash.length);
   	
   }
   
     /**
	 * 	Update SmmHash 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmHash(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmHash+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmHash with another Field
	 *	@param value
	 */
   public void setSmmHash(Field source) {
       replace(source,0,source.length(),beginSmmHash,SMM_HASH_LEN);
   	
   }  
   
     /**
	 * 	Update SmmHash 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmHash(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmHash,SMM_HASH_LEN);
   	
   }
   
     /**
	 * 	Update SmmHash 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmHash(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmHash+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmType
	 *	@return smmType
	 */
   public char[] getSmmType() throws CFException{
     if (isSmmTypeModified()) { 
        smmType = refreshSmmType();
     }
   		return smmType;
   }

  
	/**
	*  set variable smmType
	*  Corresponding COBOL Variable is SMM-TYPE
	*  @param value
	**/
   public void setSmmType(char[] value) {
      smmType = checkSmmTypeConstraints(value);
      serializeSmmType(smmType);
   } 

     /**
	 * 	Update SmmType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmType,smmType.length);
   	
   }
   
   public void setSmmType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmType,smmType.length);
   	
   }
   
     /**
	 * 	Update SmmType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmType with another Field
	 *	@param value
	 */
   public void setSmmType(Field source) {
       replace(source,0,source.length(),beginSmmType,SMM_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update SmmType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmType,SMM_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update SmmType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmAppTypePsetNum
	 *	@return smmAppTypePsetNum
	 */
   public char[] getSmmAppTypePsetNum() throws CFException{
     if (isSmmAppTypePsetNumModified()) { 
        smmAppTypePsetNum = refreshSmmAppTypePsetNum();
     }
   		return smmAppTypePsetNum;
   }

  
	/**
	*  set variable smmAppTypePsetNum
	*  Corresponding COBOL Variable is SMM-APP-TYPE-PSET-NUM
	*  @param value
	**/
   public void setSmmAppTypePsetNum(char[] value) {
      smmAppTypePsetNum = checkSmmAppTypePsetNumConstraints(value);
      serializeSmmAppTypePsetNum(smmAppTypePsetNum);
   } 

     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmAppTypePsetNum,smmAppTypePsetNum.length);
   	
   }
   
   public void setSmmAppTypePsetNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmAppTypePsetNum,smmAppTypePsetNum.length);
   	
   }
   
     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmAppTypePsetNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmAppTypePsetNum with another Field
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(Field source) {
       replace(source,0,source.length(),beginSmmAppTypePsetNum,SMM_APP_TYPE_PSET_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmAppTypePsetNum,SMM_APP_TYPE_PSET_NUM_LEN);
   	
   }
   
     /**
	 * 	Update SmmAppTypePsetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmAppTypePsetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmAppTypePsetNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmPostingDate
	 *	@return smmPostingDate
	 */
   public char[] getSmmPostingDate() throws CFException{
     if (isSmmPostingDateModified()) { 
        smmPostingDate = refreshSmmPostingDate();
     }
   		return smmPostingDate;
   }

  
	/**
	*  set variable smmPostingDate
	*  Corresponding COBOL Variable is SMM-POSTING-DATE
	*  @param value
	**/
   public void setSmmPostingDate(char[] value) {
      smmPostingDate = checkSmmPostingDateConstraints(value);
      serializeSmmPostingDate(smmPostingDate);
   } 

     /**
	 * 	Update SmmPostingDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmPostingDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmPostingDate,smmPostingDate.length);
   	
   }
   
   public void setSmmPostingDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmPostingDate,smmPostingDate.length);
   	
   }
   
     /**
	 * 	Update SmmPostingDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmPostingDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmPostingDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmPostingDate with another Field
	 *	@param value
	 */
   public void setSmmPostingDate(Field source) {
       replace(source,0,source.length(),beginSmmPostingDate,SMM_POSTING_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update SmmPostingDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmPostingDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmPostingDate,SMM_POSTING_DATE_LEN);
   	
   }
   
     /**
	 * 	Update SmmPostingDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmPostingDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmPostingDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmTransTime
	 *	@return smmTransTime
	 */
   public char[] getSmmTransTime() throws CFException{
     if (isSmmTransTimeModified()) { 
        smmTransTime = refreshSmmTransTime();
     }
   		return smmTransTime;
   }

  
	/**
	*  set variable smmTransTime
	*  Corresponding COBOL Variable is SMM-TRANS-TIME
	*  @param value
	**/
   public void setSmmTransTime(char[] value) {
      smmTransTime = checkSmmTransTimeConstraints(value);
      serializeSmmTransTime(smmTransTime);
   } 

     /**
	 * 	Update SmmTransTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmTransTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmTransTime,smmTransTime.length);
   	
   }
   
   public void setSmmTransTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmTransTime,smmTransTime.length);
   	
   }
   
     /**
	 * 	Update SmmTransTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmTransTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmTransTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmTransTime with another Field
	 *	@param value
	 */
   public void setSmmTransTime(Field source) {
       replace(source,0,source.length(),beginSmmTransTime,SMM_TRANS_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update SmmTransTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmTransTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmTransTime,SMM_TRANS_TIME_LEN);
   	
   }
   
     /**
	 * 	Update SmmTransTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmTransTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmTransTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmRefText1
	 *	@return smmRefText1
	 */
   public char[] getSmmRefText1() throws CFException{
     if (isSmmRefText1Modified()) { 
        smmRefText1 = refreshSmmRefText1();
     }
   		return smmRefText1;
   }

  
	/**
	*  set variable smmRefText1
	*  Corresponding COBOL Variable is SMM-REF-TEXT1
	*  @param value
	**/
   public void setSmmRefText1(char[] value) {
      smmRefText1 = checkSmmRefText1Constraints(value);
      serializeSmmRefText1(smmRefText1);
   } 

     /**
	 * 	Update SmmRefText1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmRefText1,smmRefText1.length);
   	
   }
   
   public void setSmmRefText1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText1,smmRefText1.length);
   	
   }
   
     /**
	 * 	Update SmmRefText1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmRefText1 with another Field
	 *	@param value
	 */
   public void setSmmRefText1(Field source) {
       replace(source,0,source.length(),beginSmmRefText1,SMM_REF_TEXT_1_LEN);
   	
   }  
   
     /**
	 * 	Update SmmRefText1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmRefText1,SMM_REF_TEXT_1_LEN);
   	
   }
   
     /**
	 * 	Update SmmRefText1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmRefText2
	 *	@return smmRefText2
	 */
   public char[] getSmmRefText2() throws CFException{
     if (isSmmRefText2Modified()) { 
        smmRefText2 = refreshSmmRefText2();
     }
   		return smmRefText2;
   }

  
	/**
	*  set variable smmRefText2
	*  Corresponding COBOL Variable is SMM-REF-TEXT2
	*  @param value
	**/
   public void setSmmRefText2(char[] value) {
      smmRefText2 = checkSmmRefText2Constraints(value);
      serializeSmmRefText2(smmRefText2);
   } 

     /**
	 * 	Update SmmRefText2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmRefText2,smmRefText2.length);
   	
   }
   
   public void setSmmRefText2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText2,smmRefText2.length);
   	
   }
   
     /**
	 * 	Update SmmRefText2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmRefText2 with another Field
	 *	@param value
	 */
   public void setSmmRefText2(Field source) {
       replace(source,0,source.length(),beginSmmRefText2,SMM_REF_TEXT_2_LEN);
   	
   }  
   
     /**
	 * 	Update SmmRefText2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmRefText2,SMM_REF_TEXT_2_LEN);
   	
   }
   
     /**
	 * 	Update SmmRefText2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmRefText3
	 *	@return smmRefText3
	 */
   public char[] getSmmRefText3() throws CFException{
     if (isSmmRefText3Modified()) { 
        smmRefText3 = refreshSmmRefText3();
     }
   		return smmRefText3;
   }

  
	/**
	*  set variable smmRefText3
	*  Corresponding COBOL Variable is SMM-REF-TEXT3
	*  @param value
	**/
   public void setSmmRefText3(char[] value) {
      smmRefText3 = checkSmmRefText3Constraints(value);
      serializeSmmRefText3(smmRefText3);
   } 

     /**
	 * 	Update SmmRefText3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmRefText3,smmRefText3.length);
   	
   }
   
   public void setSmmRefText3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText3,smmRefText3.length);
   	
   }
   
     /**
	 * 	Update SmmRefText3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmRefText3 with another Field
	 *	@param value
	 */
   public void setSmmRefText3(Field source) {
       replace(source,0,source.length(),beginSmmRefText3,SMM_REF_TEXT_3_LEN);
   	
   }  
   
     /**
	 * 	Update SmmRefText3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmRefText3,SMM_REF_TEXT_3_LEN);
   	
   }
   
     /**
	 * 	Update SmmRefText3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmRefText4
	 *	@return smmRefText4
	 */
   public char[] getSmmRefText4() throws CFException{
     if (isSmmRefText4Modified()) { 
        smmRefText4 = refreshSmmRefText4();
     }
   		return smmRefText4;
   }

  
	/**
	*  set variable smmRefText4
	*  Corresponding COBOL Variable is SMM-REF-TEXT4
	*  @param value
	**/
   public void setSmmRefText4(char[] value) {
      smmRefText4 = checkSmmRefText4Constraints(value);
      serializeSmmRefText4(smmRefText4);
   } 

     /**
	 * 	Update SmmRefText4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmRefText4,smmRefText4.length);
   	
   }
   
   public void setSmmRefText4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText4,smmRefText4.length);
   	
   }
   
     /**
	 * 	Update SmmRefText4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmRefText4 with another Field
	 *	@param value
	 */
   public void setSmmRefText4(Field source) {
       replace(source,0,source.length(),beginSmmRefText4,SMM_REF_TEXT_4_LEN);
   	
   }  
   
     /**
	 * 	Update SmmRefText4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmRefText4,SMM_REF_TEXT_4_LEN);
   	
   }
   
     /**
	 * 	Update SmmRefText4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText4+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmRefText5
	 *	@return smmRefText5
	 */
   public char[] getSmmRefText5() throws CFException{
     if (isSmmRefText5Modified()) { 
        smmRefText5 = refreshSmmRefText5();
     }
   		return smmRefText5;
   }

  
	/**
	*  set variable smmRefText5
	*  Corresponding COBOL Variable is SMM-REF-TEXT5
	*  @param value
	**/
   public void setSmmRefText5(char[] value) {
      smmRefText5 = checkSmmRefText5Constraints(value);
      serializeSmmRefText5(smmRefText5);
   } 

     /**
	 * 	Update SmmRefText5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefText5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmRefText5,smmRefText5.length);
   	
   }
   
   public void setSmmRefText5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText5,smmRefText5.length);
   	
   }
   
     /**
	 * 	Update SmmRefText5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmRefText5 with another Field
	 *	@param value
	 */
   public void setSmmRefText5(Field source) {
       replace(source,0,source.length(),beginSmmRefText5,SMM_REF_TEXT_5_LEN);
   	
   }  
   
     /**
	 * 	Update SmmRefText5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefText5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmRefText5,SMM_REF_TEXT_5_LEN);
   	
   }
   
     /**
	 * 	Update SmmRefText5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefText5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefText5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmRefNum1
	 *	@return smmRefNum1
	 */
   public char[] getSmmRefNum1() throws CFException{
     if (isSmmRefNum1Modified()) { 
        smmRefNum1 = refreshSmmRefNum1();
     }
   		return smmRefNum1;
   }

  
	/**
	*  set variable smmRefNum1
	*  Corresponding COBOL Variable is SMM-REF-NUM1
	*  @param value
	**/
   public void setSmmRefNum1(char[] value) {
      smmRefNum1 = checkSmmRefNum1Constraints(value);
      serializeSmmRefNum1(smmRefNum1);
   } 

     /**
	 * 	Update SmmRefNum1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefNum1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmRefNum1,smmRefNum1.length);
   	
   }
   
   public void setSmmRefNum1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefNum1,smmRefNum1.length);
   	
   }
   
     /**
	 * 	Update SmmRefNum1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefNum1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmRefNum1 with another Field
	 *	@param value
	 */
   public void setSmmRefNum1(Field source) {
       replace(source,0,source.length(),beginSmmRefNum1,SMM_REF_NUM_1_LEN);
   	
   }  
   
     /**
	 * 	Update SmmRefNum1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefNum1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmRefNum1,SMM_REF_NUM_1_LEN);
   	
   }
   
     /**
	 * 	Update SmmRefNum1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefNum1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmRefNum2
	 *	@return smmRefNum2
	 */
   public char[] getSmmRefNum2() throws CFException{
     if (isSmmRefNum2Modified()) { 
        smmRefNum2 = refreshSmmRefNum2();
     }
   		return smmRefNum2;
   }

  
	/**
	*  set variable smmRefNum2
	*  Corresponding COBOL Variable is SMM-REF-NUM2
	*  @param value
	**/
   public void setSmmRefNum2(char[] value) {
      smmRefNum2 = checkSmmRefNum2Constraints(value);
      serializeSmmRefNum2(smmRefNum2);
   } 

     /**
	 * 	Update SmmRefNum2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRefNum2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmRefNum2,smmRefNum2.length);
   	
   }
   
   public void setSmmRefNum2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefNum2,smmRefNum2.length);
   	
   }
   
     /**
	 * 	Update SmmRefNum2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefNum2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmRefNum2 with another Field
	 *	@param value
	 */
   public void setSmmRefNum2(Field source) {
       replace(source,0,source.length(),beginSmmRefNum2,SMM_REF_NUM_2_LEN);
   	
   }  
   
     /**
	 * 	Update SmmRefNum2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRefNum2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmRefNum2,SMM_REF_NUM_2_LEN);
   	
   }
   
     /**
	 * 	Update SmmRefNum2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRefNum2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRefNum2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmSubclass
	 *	@return smmSubclass
	 */
   public char[] getSmmSubclass() throws CFException{
     if (isSmmSubclassModified()) { 
        smmSubclass = refreshSmmSubclass();
     }
   		return smmSubclass;
   }

  
	/**
	*  set variable smmSubclass
	*  Corresponding COBOL Variable is SMM-SUBCLASS
	*  @param value
	**/
   public void setSmmSubclass(char[] value) {
      smmSubclass = checkSmmSubclassConstraints(value);
      serializeSmmSubclass(smmSubclass);
   } 

     /**
	 * 	Update SmmSubclass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmSubclass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmSubclass,smmSubclass.length);
   	
   }
   
   public void setSmmSubclass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmSubclass,smmSubclass.length);
   	
   }
   
     /**
	 * 	Update SmmSubclass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmSubclass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmSubclass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmSubclass with another Field
	 *	@param value
	 */
   public void setSmmSubclass(Field source) {
       replace(source,0,source.length(),beginSmmSubclass,SMM_SUBCLASS_LEN);
   	
   }  
   
     /**
	 * 	Update SmmSubclass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmSubclass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmSubclass,SMM_SUBCLASS_LEN);
   	
   }
   
     /**
	 * 	Update SmmSubclass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmSubclass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmSubclass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmFlags
	 *	@return smmFlags
	 */
   public char[] getSmmFlags() throws CFException{
     if (isSmmFlagsModified()) { 
        smmFlags = refreshSmmFlags();
     }
   		return smmFlags;
   }

  
	/**
	*  set variable smmFlags
	*  Corresponding COBOL Variable is SMM-FLAGS
	*  @param value
	**/
   public void setSmmFlags(char[] value) {
      smmFlags = checkSmmFlagsConstraints(value);
      serializeSmmFlags(smmFlags);
   } 

     /**
	 * 	Update SmmFlags 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmFlags(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmFlags,smmFlags.length);
   	
   }
   
   public void setSmmFlags(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmFlags,smmFlags.length);
   	
   }
   
     /**
	 * 	Update SmmFlags 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmFlags(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmFlags+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmFlags with another Field
	 *	@param value
	 */
   public void setSmmFlags(Field source) {
       replace(source,0,source.length(),beginSmmFlags,SMM_FLAGS_LEN);
   	
   }  
   
     /**
	 * 	Update SmmFlags 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmFlags(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmFlags,SMM_FLAGS_LEN);
   	
   }
   
     /**
	 * 	Update SmmFlags 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmFlags(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmFlags+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmCycleNo
	 *	@return smmCycleNo
	 */
   public char[] getSmmCycleNo() throws CFException{
     if (isSmmCycleNoModified()) { 
        smmCycleNo = refreshSmmCycleNo();
     }
   		return smmCycleNo;
   }

  
	/**
	*  set variable smmCycleNo
	*  Corresponding COBOL Variable is SMM-CYCLE-NO
	*  @param value
	**/
   public void setSmmCycleNo(char[] value) {
      smmCycleNo = checkSmmCycleNoConstraints(value);
      serializeSmmCycleNo(smmCycleNo);
   } 

     /**
	 * 	Update SmmCycleNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmCycleNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmCycleNo,smmCycleNo.length);
   	
   }
   
   public void setSmmCycleNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmCycleNo,smmCycleNo.length);
   	
   }
   
     /**
	 * 	Update SmmCycleNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmCycleNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmCycleNo with another Field
	 *	@param value
	 */
   public void setSmmCycleNo(Field source) {
       replace(source,0,source.length(),beginSmmCycleNo,SMM_CYCLE_NO_LEN);
   	
   }  
   
     /**
	 * 	Update SmmCycleNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmCycleNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmCycleNo,SMM_CYCLE_NO_LEN);
   	
   }
   
     /**
	 * 	Update SmmCycleNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmCycleNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmCycleDate
	 *	@return smmCycleDate
	 */
   public char[] getSmmCycleDate() throws CFException{
     if (isSmmCycleDateModified()) { 
        smmCycleDate = refreshSmmCycleDate();
     }
   		return smmCycleDate;
   }

  
	/**
	*  set variable smmCycleDate
	*  Corresponding COBOL Variable is SMM-CYCLE-DATE
	*  @param value
	**/
   public void setSmmCycleDate(char[] value) {
      smmCycleDate = checkSmmCycleDateConstraints(value);
      serializeSmmCycleDate(smmCycleDate);
   } 

     /**
	 * 	Update SmmCycleDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmCycleDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmCycleDate,smmCycleDate.length);
   	
   }
   
   public void setSmmCycleDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmCycleDate,smmCycleDate.length);
   	
   }
   
     /**
	 * 	Update SmmCycleDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmCycleDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmCycleDate with another Field
	 *	@param value
	 */
   public void setSmmCycleDate(Field source) {
       replace(source,0,source.length(),beginSmmCycleDate,SMM_CYCLE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update SmmCycleDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmCycleDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmCycleDate,SMM_CYCLE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update SmmCycleDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmCycleDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmCycleDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmEnd
	 *	@return smmEnd
	 */
   public char[] getSmmEnd() throws CFException{
     if (isSmmEndModified()) { 
        smmEnd = refreshSmmEnd();
     }
   		return smmEnd;
   }

  
	/**
	*  set variable smmEnd
	*  Corresponding COBOL Variable is SMM-END
	*  @param value
	**/
   public void setSmmEnd(char[] value) {
      smmEnd = checkSmmEndConstraints(value);
      serializeSmmEnd(smmEnd);
   } 

     /**
	 * 	Update SmmEnd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmEnd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmEnd,smmEnd.length);
   	
   }
   
   public void setSmmEnd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmEnd,smmEnd.length);
   	
   }
   
     /**
	 * 	Update SmmEnd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmEnd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmEnd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmEnd with another Field
	 *	@param value
	 */
   public void setSmmEnd(Field source) {
       replace(source,0,source.length(),beginSmmEnd,SMM_END_LEN);
   	
   }  
   
     /**
	 * 	Update SmmEnd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmEnd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmEnd,SMM_END_LEN);
   	
   }
   
     /**
	 * 	Update SmmEnd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmEnd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmEnd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSmmRecFieldLength() {
			return SMM_REC_LENGTH;
		}

}
  
