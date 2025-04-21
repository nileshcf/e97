package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360OtherDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360OtherDataFields extends X360OtherDataFieldsSerialized { 
   

						private char[] x360TjfRecType = Field.fillLowValue(2);

						private char[] x360PlusSettDate = Field.fillLowValue(4);

						private char[] x360BatchFeeKey = Field.fillLowValue(14);

						private char[] x360Report211NeededSwitch = Field.fillLowValue(1);

								private int x360McsImpDec;

						private char[] x360InstName = Field.fillLowValue(25);

						private char[] x360ProcName = Field.fillLowValue(25);

						private char[] x360AtmPosFlag = Field.fillLowValue(1);

						private char[] x360SetlTyp = Field.fillLowValue(1);

						private char[] x360InstId = Field.fillLowValue(10);
				private X360AdditionalSortingFields x360AdditionalSortingFields = new X360AdditionalSortingFields();

								private int x360TransactionCnt;

								private long x360BatchSendingIca;

						private char[] x360SrtMcsSeqNum = Field.fillLowValue(6);

						private char[] x360SpecialProcessor = Field.fillLowValue(1);

	
	/**
	* Constructor for X360OtherDataFields
	**/
    public X360OtherDataFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360OtherDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360OtherDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			x360AdditionalSortingFields.setParent(this,getStartOffset() + 84);
    } 

	/**
	 *	Returns the value of x360TjfRecType
	 *	@return x360TjfRecType
	 */
   public char[] getX360TjfRecType() throws CFException{
     if (isX360TjfRecTypeModified()) { 
        x360TjfRecType = refreshX360TjfRecType();
     }
   		return x360TjfRecType;
   }

  
	/**
	*  set variable x360TjfRecType
	*  Corresponding COBOL Variable is X360-TJF-REC-TYPE
	*  @param value
	**/
   public void setX360TjfRecType(char[] value) {
      x360TjfRecType = checkX360TjfRecTypeConstraints(value);
      serializeX360TjfRecType(x360TjfRecType);
   } 

     /**
	 * 	Update X360TjfRecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360TjfRecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360TjfRecType,x360TjfRecType.length);
   	
   }
   
   public void setX360TjfRecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360TjfRecType,x360TjfRecType.length);
   	
   }
   
     /**
	 * 	Update X360TjfRecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360TjfRecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360TjfRecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360TjfRecType with another Field
	 *	@param value
	 */
   public void setX360TjfRecType(Field source) {
       replace(source,0,source.length(),beginX360TjfRecType,X_360_TJF_REC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update X360TjfRecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360TjfRecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360TjfRecType,X_360_TJF_REC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update X360TjfRecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360TjfRecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360TjfRecType+targetIndex,targetLen);
    
   }
	char[] x360TjfRecType01Financial88Value = "01".toCharArray();
	/**
	 *	Test condition "01" for isX360TjfRecType01Financial()
	 *	@return  Returns true if isX360TjfRecType01Financial() is "01"
	 */
   public boolean isX360TjfRecType01Financial() throws CFException {
      return (  compareChars( getX360TjfRecType() , x360TjfRecType01Financial88Value)  == 0  );
   }


	/**
	*  set values "01"
	*/
   	public void setX360TjfRecType01FinancialTrue() {  			
    	setX360TjfRecType( x360TjfRecType01Financial88Value);
   	}
	char[] x360TjfRecType02Reversal88Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isX360TjfRecType02Reversal()
	 *	@return  Returns true if isX360TjfRecType02Reversal() is "02"
	 */
   public boolean isX360TjfRecType02Reversal() throws CFException {
      return (  compareChars( getX360TjfRecType() , x360TjfRecType02Reversal88Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setX360TjfRecType02ReversalTrue() {  			
    	setX360TjfRecType( x360TjfRecType02Reversal88Value);
   	}
	/**
	 *	Returns the value of x360PlusSettDate
	 *	@return x360PlusSettDate
	 */
   public char[] getX360PlusSettDate() throws CFException{
     if (isX360PlusSettDateModified()) { 
        x360PlusSettDate = refreshX360PlusSettDate();
     }
   		return x360PlusSettDate;
   }

  
	/**
	*  set variable x360PlusSettDate
	*  Corresponding COBOL Variable is X360-PLUS-SETT-DATE
	*  @param value
	**/
   public void setX360PlusSettDate(char[] value) {
      x360PlusSettDate = checkX360PlusSettDateConstraints(value);
      serializeX360PlusSettDate(x360PlusSettDate);
   } 

     /**
	 * 	Update X360PlusSettDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360PlusSettDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360PlusSettDate,x360PlusSettDate.length);
   	
   }
   
   public void setX360PlusSettDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360PlusSettDate,x360PlusSettDate.length);
   	
   }
   
     /**
	 * 	Update X360PlusSettDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360PlusSettDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360PlusSettDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360PlusSettDate with another Field
	 *	@param value
	 */
   public void setX360PlusSettDate(Field source) {
       replace(source,0,source.length(),beginX360PlusSettDate,X_360_PLUS_SETT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update X360PlusSettDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360PlusSettDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360PlusSettDate,X_360_PLUS_SETT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update X360PlusSettDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360PlusSettDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360PlusSettDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360BatchFeeKey
	 *	@return x360BatchFeeKey
	 */
   public char[] getX360BatchFeeKey() throws CFException{
     if (isX360BatchFeeKeyModified()) { 
        x360BatchFeeKey = refreshX360BatchFeeKey();
     }
   		return x360BatchFeeKey;
   }

  
	/**
	*  set variable x360BatchFeeKey
	*  Corresponding COBOL Variable is X360-BATCH-FEE-KEY
	*  @param value
	**/
   public void setX360BatchFeeKey(char[] value) {
      x360BatchFeeKey = checkX360BatchFeeKeyConstraints(value);
      serializeX360BatchFeeKey(x360BatchFeeKey);
   } 

     /**
	 * 	Update X360BatchFeeKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360BatchFeeKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360BatchFeeKey,x360BatchFeeKey.length);
   	
   }
   
   public void setX360BatchFeeKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360BatchFeeKey,x360BatchFeeKey.length);
   	
   }
   
     /**
	 * 	Update X360BatchFeeKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360BatchFeeKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360BatchFeeKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360BatchFeeKey with another Field
	 *	@param value
	 */
   public void setX360BatchFeeKey(Field source) {
       replace(source,0,source.length(),beginX360BatchFeeKey,X_360_BATCH_FEE_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update X360BatchFeeKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360BatchFeeKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360BatchFeeKey,X_360_BATCH_FEE_KEY_LEN);
   	
   }
   
     /**
	 * 	Update X360BatchFeeKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360BatchFeeKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360BatchFeeKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360Report211NeededSwitch
	 *	@return x360Report211NeededSwitch
	 */
   public char[] getX360Report211NeededSwitch() throws CFException{
     if (isX360Report211NeededSwitchModified()) { 
        x360Report211NeededSwitch = refreshX360Report211NeededSwitch();
     }
   		return x360Report211NeededSwitch;
   }

  
	/**
	*  set variable x360Report211NeededSwitch
	*  Corresponding COBOL Variable is X360-REPORT211-NEEDED-SWITCH
	*  @param value
	**/
   public void setX360Report211NeededSwitch(char[] value) {
      x360Report211NeededSwitch = checkX360Report211NeededSwitchConstraints(value);
      serializeX360Report211NeededSwitch(x360Report211NeededSwitch);
   } 

     /**
	 * 	Update X360Report211NeededSwitch 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360Report211NeededSwitch(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360Report211NeededSwitch,x360Report211NeededSwitch.length);
   	
   }
   
   public void setX360Report211NeededSwitch(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360Report211NeededSwitch,x360Report211NeededSwitch.length);
   	
   }
   
     /**
	 * 	Update X360Report211NeededSwitch 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360Report211NeededSwitch(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360Report211NeededSwitch+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360Report211NeededSwitch with another Field
	 *	@param value
	 */
   public void setX360Report211NeededSwitch(Field source) {
       replace(source,0,source.length(),beginX360Report211NeededSwitch,X_360_REPORT_211_NEEDED_SWITCH_LEN);
   	
   }  
   
     /**
	 * 	Update X360Report211NeededSwitch 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360Report211NeededSwitch(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360Report211NeededSwitch,X_360_REPORT_211_NEEDED_SWITCH_LEN);
   	
   }
   
     /**
	 * 	Update X360Report211NeededSwitch 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360Report211NeededSwitch(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360Report211NeededSwitch+targetIndex,targetLen);
    
   }
	char[] x360Report211IsNeeded88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isX360Report211IsNeeded()
	 *	@return  Returns true if isX360Report211IsNeeded() is "Y"
	 */
   public boolean isX360Report211IsNeeded() throws CFException {
      return (  compareChars( getX360Report211NeededSwitch() , x360Report211IsNeeded88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setX360Report211IsNeededTrue() {  			
    	setX360Report211NeededSwitch( x360Report211IsNeeded88Value);
   	}
	char[] x360Report211NotNeeded88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isX360Report211NotNeeded()
	 *	@return  Returns true if isX360Report211NotNeeded() is "N"
	 */
   public boolean isX360Report211NotNeeded() throws CFException {
      return (  compareChars( getX360Report211NeededSwitch() , x360Report211NotNeeded88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setX360Report211NotNeededTrue() {  			
    	setX360Report211NeededSwitch( x360Report211NotNeeded88Value);
   	}
	/**
	 *	Returns the value of x360McsImpDec
	 *	@return x360McsImpDec
	 */
	public int getX360McsImpDec() throws CFException {
       if (isX360McsImpDecModified()) { 
           x360McsImpDec = refreshX360McsImpDec();
        }
   		return x360McsImpDec;
	}
	

	
	   
	/**
	 * 	Update X360McsImpDec with the passed value
	 *  Corresponding COBOL Variable is X360-MCS-IMP-DEC
	 *	@param number
	 */
	public void setX360McsImpDec(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360McsImpDec = checkX360McsImpDecMaxLimit(number); 
		serializeX360McsImpDec(x360McsImpDec);
	}
	

	public void setX360McsImpDec(long number) {
	    number = checkX360McsImpDecMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360McsImpDec((int)number);
	}
	
	/**
	 * 	Update X360McsImpDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360McsImpDec(char[] value) throws CFException {
		 x360McsImpDec = serializeX360McsImpDec(value);
	}
	/**
	 * 	Update X360McsImpDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360McsImpDecString(char[] value) throws CFException {
		 setX360McsImpDec(value);
	}
	/**
	 *	Returns the value of x360InstName
	 *	@return x360InstName
	 */
   public char[] getX360InstName() throws CFException{
     if (isX360InstNameModified()) { 
        x360InstName = refreshX360InstName();
     }
   		return x360InstName;
   }

  
	/**
	*  set variable x360InstName
	*  Corresponding COBOL Variable is X360-INST-NAME
	*  @param value
	**/
   public void setX360InstName(char[] value) {
      x360InstName = checkX360InstNameConstraints(value);
      serializeX360InstName(x360InstName);
   } 

     /**
	 * 	Update X360InstName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360InstName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360InstName,x360InstName.length);
   	
   }
   
   public void setX360InstName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360InstName,x360InstName.length);
   	
   }
   
     /**
	 * 	Update X360InstName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360InstName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360InstName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360InstName with another Field
	 *	@param value
	 */
   public void setX360InstName(Field source) {
       replace(source,0,source.length(),beginX360InstName,X_360_INST_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update X360InstName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360InstName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360InstName,X_360_INST_NAME_LEN);
   	
   }
   
     /**
	 * 	Update X360InstName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360InstName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360InstName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360ProcName
	 *	@return x360ProcName
	 */
   public char[] getX360ProcName() throws CFException{
     if (isX360ProcNameModified()) { 
        x360ProcName = refreshX360ProcName();
     }
   		return x360ProcName;
   }

  
	/**
	*  set variable x360ProcName
	*  Corresponding COBOL Variable is X360-PROC-NAME
	*  @param value
	**/
   public void setX360ProcName(char[] value) {
      x360ProcName = checkX360ProcNameConstraints(value);
      serializeX360ProcName(x360ProcName);
   } 

     /**
	 * 	Update X360ProcName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360ProcName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360ProcName,x360ProcName.length);
   	
   }
   
   public void setX360ProcName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360ProcName,x360ProcName.length);
   	
   }
   
     /**
	 * 	Update X360ProcName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360ProcName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360ProcName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360ProcName with another Field
	 *	@param value
	 */
   public void setX360ProcName(Field source) {
       replace(source,0,source.length(),beginX360ProcName,X_360_PROC_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update X360ProcName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360ProcName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360ProcName,X_360_PROC_NAME_LEN);
   	
   }
   
     /**
	 * 	Update X360ProcName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360ProcName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360ProcName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360AtmPosFlag
	 *	@return x360AtmPosFlag
	 */
   public char[] getX360AtmPosFlag() throws CFException{
     if (isX360AtmPosFlagModified()) { 
        x360AtmPosFlag = refreshX360AtmPosFlag();
     }
   		return x360AtmPosFlag;
   }

  
	/**
	*  set variable x360AtmPosFlag
	*  Corresponding COBOL Variable is X360-ATM-POS-FLAG
	*  @param value
	**/
   public void setX360AtmPosFlag(char[] value) {
      x360AtmPosFlag = checkX360AtmPosFlagConstraints(value);
      serializeX360AtmPosFlag(x360AtmPosFlag);
   } 

     /**
	 * 	Update X360AtmPosFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360AtmPosFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360AtmPosFlag,x360AtmPosFlag.length);
   	
   }
   
   public void setX360AtmPosFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360AtmPosFlag,x360AtmPosFlag.length);
   	
   }
   
     /**
	 * 	Update X360AtmPosFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360AtmPosFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360AtmPosFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360AtmPosFlag with another Field
	 *	@param value
	 */
   public void setX360AtmPosFlag(Field source) {
       replace(source,0,source.length(),beginX360AtmPosFlag,X_360_ATM_POS_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update X360AtmPosFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360AtmPosFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360AtmPosFlag,X_360_ATM_POS_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update X360AtmPosFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360AtmPosFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360AtmPosFlag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SetlTyp
	 *	@return x360SetlTyp
	 */
   public char[] getX360SetlTyp() throws CFException{
     if (isX360SetlTypModified()) { 
        x360SetlTyp = refreshX360SetlTyp();
     }
   		return x360SetlTyp;
   }

  
	/**
	*  set variable x360SetlTyp
	*  Corresponding COBOL Variable is X360-SETL-TYP
	*  @param value
	**/
   public void setX360SetlTyp(char[] value) {
      x360SetlTyp = checkX360SetlTypConstraints(value);
      serializeX360SetlTyp(x360SetlTyp);
   } 

     /**
	 * 	Update X360SetlTyp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SetlTyp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SetlTyp,x360SetlTyp.length);
   	
   }
   
   public void setX360SetlTyp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SetlTyp,x360SetlTyp.length);
   	
   }
   
     /**
	 * 	Update X360SetlTyp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SetlTyp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SetlTyp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SetlTyp with another Field
	 *	@param value
	 */
   public void setX360SetlTyp(Field source) {
       replace(source,0,source.length(),beginX360SetlTyp,X_360_SETL_TYP_LEN);
   	
   }  
   
     /**
	 * 	Update X360SetlTyp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SetlTyp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SetlTyp,X_360_SETL_TYP_LEN);
   	
   }
   
     /**
	 * 	Update X360SetlTyp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SetlTyp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SetlTyp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360InstId
	 *	@return x360InstId
	 */
   public char[] getX360InstId() throws CFException{
     if (isX360InstIdModified()) { 
        x360InstId = refreshX360InstId();
     }
   		return x360InstId;
   }

  
	/**
	*  set variable x360InstId
	*  Corresponding COBOL Variable is X360-INST-ID
	*  @param value
	**/
   public void setX360InstId(char[] value) {
      x360InstId = checkX360InstIdConstraints(value);
      serializeX360InstId(x360InstId);
   } 

     /**
	 * 	Update X360InstId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360InstId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360InstId,x360InstId.length);
   	
   }
   
   public void setX360InstId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360InstId,x360InstId.length);
   	
   }
   
     /**
	 * 	Update X360InstId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360InstId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360InstId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360InstId with another Field
	 *	@param value
	 */
   public void setX360InstId(Field source) {
       replace(source,0,source.length(),beginX360InstId,X_360_INST_ID_LEN);
   	
   }  
   
     /**
	 * 	Update X360InstId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360InstId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360InstId,X_360_INST_ID_LEN);
   	
   }
   
     /**
	 * 	Update X360InstId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360InstId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360InstId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360AdditionalSortingFields
	 *	@return x360AdditionalSortingFields
	 */   
	 public X360AdditionalSortingFields getX360AdditionalSortingFields() {
   	return x360AdditionalSortingFields;
   }
   /**
	* 	Update X360AdditionalSortingFields with the passed value
	*   Corresponding COBOL Variable is X360-ADDITIONAL-SORTING-FIELDS
	*	@param value
	*/
   public void setX360AdditionalSortingFields(char[] value) {
      x360AdditionalSortingFields.setString(value); 
   }   
    
     /**
	 * 	Update X360AdditionalSortingFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360AdditionalSortingFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AdditionalSortingFields.begin,x360AdditionalSortingFields.length());
   }
   
     /**
	 * 	Update X360AdditionalSortingFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360AdditionalSortingFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AdditionalSortingFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360AdditionalSortingFields with another Field
	 *	@param value
	 */
   public void setX360AdditionalSortingFields(Field source) {
   	replace(source,0,source.length(),x360AdditionalSortingFields.begin,x360AdditionalSortingFields.length());
   }  
   
     /**
	 * 	Update X360AdditionalSortingFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360AdditionalSortingFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360AdditionalSortingFields.begin,x360AdditionalSortingFields.length());
   }
   
     /**
	 * 	Update X360AdditionalSortingFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360AdditionalSortingFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360AdditionalSortingFields.begin+targetIndex,targetLen);
   }
	public int getX360TransactionCnt() throws CFException {
        if (isX360TransactionCntModified()) { 
           x360TransactionCnt = refreshX360TransactionCnt();
        }
   		return x360TransactionCnt;
	}
	
	/**
	 * 	Update X360TransactionCnt with the passed value
	 *  Corresponding COBOL Variable is X360-TRANSACTION-CNT
	 *	@param number
	 */
	public void setX360TransactionCnt(int number) {
			x360TransactionCnt = checkX360TransactionCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360TransactionCnt(x360TransactionCnt);
	}


	public void setX360TransactionCnt(long number) {
	    number = checkX360TransactionCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360TransactionCnt((int)number);
	}
	
	/**
	 *	Returns the value of x360BatchSendingIca
	 *	@return x360BatchSendingIca
	 */
	public long getX360BatchSendingIca() throws CFException {
       if (isX360BatchSendingIcaModified()) { 
           x360BatchSendingIca = refreshX360BatchSendingIca();
        }
   		return x360BatchSendingIca;
	}
	

	
	   
	/**
	 * 	Update X360BatchSendingIca with the passed value
	 *  Corresponding COBOL Variable is X360-BATCH-SENDING-ICA
	 *	@param number
	 */
	public void setX360BatchSendingIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360BatchSendingIca = checkX360BatchSendingIcaMaxLimit(number); 
		serializeX360BatchSendingIca(x360BatchSendingIca);
	}
	

	/**
	 * 	Update X360BatchSendingIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360BatchSendingIca(char[] value) throws CFException {
		 x360BatchSendingIca = serializeX360BatchSendingIca(value);
	}
	/**
	 * 	Update X360BatchSendingIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360BatchSendingIcaString(char[] value) throws CFException {
		 setX360BatchSendingIca(value);
	}
	/**
	 *	Returns the value of x360SrtMcsSeqNum
	 *	@return x360SrtMcsSeqNum
	 */
   public char[] getX360SrtMcsSeqNum() throws CFException{
     if (isX360SrtMcsSeqNumModified()) { 
        x360SrtMcsSeqNum = refreshX360SrtMcsSeqNum();
     }
   		return x360SrtMcsSeqNum;
   }

  
	/**
	*  set variable x360SrtMcsSeqNum
	*  Corresponding COBOL Variable is X360-SRT-MCS-SEQ-NUM
	*  @param value
	**/
   public void setX360SrtMcsSeqNum(char[] value) {
      x360SrtMcsSeqNum = checkX360SrtMcsSeqNumConstraints(value);
      serializeX360SrtMcsSeqNum(x360SrtMcsSeqNum);
   } 

     /**
	 * 	Update X360SrtMcsSeqNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SrtMcsSeqNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SrtMcsSeqNum,x360SrtMcsSeqNum.length);
   	
   }
   
   public void setX360SrtMcsSeqNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtMcsSeqNum,x360SrtMcsSeqNum.length);
   	
   }
   
     /**
	 * 	Update X360SrtMcsSeqNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtMcsSeqNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtMcsSeqNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SrtMcsSeqNum with another Field
	 *	@param value
	 */
   public void setX360SrtMcsSeqNum(Field source) {
       replace(source,0,source.length(),beginX360SrtMcsSeqNum,X_360_SRT_MCS_SEQ_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update X360SrtMcsSeqNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SrtMcsSeqNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SrtMcsSeqNum,X_360_SRT_MCS_SEQ_NUM_LEN);
   	
   }
   
     /**
	 * 	Update X360SrtMcsSeqNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SrtMcsSeqNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SrtMcsSeqNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of x360SpecialProcessor
	 *	@return x360SpecialProcessor
	 */
   public char[] getX360SpecialProcessor() throws CFException{
     if (isX360SpecialProcessorModified()) { 
        x360SpecialProcessor = refreshX360SpecialProcessor();
     }
   		return x360SpecialProcessor;
   }

  
	/**
	*  set variable x360SpecialProcessor
	*  Corresponding COBOL Variable is X360-SPECIAL-PROCESSOR
	*  @param value
	**/
   public void setX360SpecialProcessor(char[] value) {
      x360SpecialProcessor = checkX360SpecialProcessorConstraints(value);
      serializeX360SpecialProcessor(x360SpecialProcessor);
   } 

     /**
	 * 	Update X360SpecialProcessor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360SpecialProcessor(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360SpecialProcessor,x360SpecialProcessor.length);
   	
   }
   
   public void setX360SpecialProcessor(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360SpecialProcessor,x360SpecialProcessor.length);
   	
   }
   
     /**
	 * 	Update X360SpecialProcessor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360SpecialProcessor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SpecialProcessor+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360SpecialProcessor with another Field
	 *	@param value
	 */
   public void setX360SpecialProcessor(Field source) {
       replace(source,0,source.length(),beginX360SpecialProcessor,X_360_SPECIAL_PROCESSOR_LEN);
   	
   }  
   
     /**
	 * 	Update X360SpecialProcessor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360SpecialProcessor(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360SpecialProcessor,X_360_SPECIAL_PROCESSOR_LEN);
   	
   }
   
     /**
	 * 	Update X360SpecialProcessor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360SpecialProcessor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360SpecialProcessor+targetIndex,targetLen);
    
   }

	
	
	

		public static int getX360OtherDataFieldsFieldLength() {
			return X_360_OTHER_DATA_FIELDS_LENGTH;
		}

}
  
