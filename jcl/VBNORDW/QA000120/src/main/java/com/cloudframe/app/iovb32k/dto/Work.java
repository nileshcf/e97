package com.cloudframe.app.iovb32k.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.iovb32k.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private int inFileStatus;

								private int outFileStatus;

								private short inEofFlag;

								private short lreclMax;

								private int outRecLen;

								private int inRecLen;

								private short i;

								private short j;

								private short k;

								private short dataLenMin;

								private short dataLenMax;

								private short recInCtr;

								private short recOutCtr;

								private char[] displayNum1 = Field.fillLowValue(6);

								private char[] displayNum2 = Field.fillLowValue(6);

								private char[] displayNum3 = Field.fillLowValue(6);

						private char[] mode = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setInFileStatus(0);
								setOutFileStatus(0);
								setInEofFlag((short)0);
								setLreclMax((short)32750);
								setOutRecLen(0);
								setInRecLen(0);
								setI((short)0);
								setJ((short)0);
								setK((short)0);
								setDataLenMin((short)0);
								setDataLenMax((short)80);
								setRecInCtr((short)0);
								setRecOutCtr((short)0);
    }


 

	/**
	 *	Returns the value of inFileStatus
	 *	@return inFileStatus
	 */
	public int getInFileStatus() throws CFException {
       if (isInFileStatusModified()) { 
           inFileStatus = refreshInFileStatus();
        }
   		return inFileStatus;
	}
	

	
	   
	/**
	 * 	Update InFileStatus with the passed value
	 *  Corresponding COBOL Variable is WS-IN-FILE-STATUS
	 *	@param number
	 */
	public void setInFileStatus(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    inFileStatus = checkInFileStatusMaxLimit(number); 
		serializeInFileStatus(inFileStatus);
	}
	

	public void setInFileStatus(long number) {
	    number = checkInFileStatusMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInFileStatus((int)number);
	}
	
	/**
	 * 	Update InFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInFileStatus(char[] value) throws CFException {
		 inFileStatus = serializeInFileStatus(value);
	}
	/**
	 * 	Update InFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInFileStatusString(char[] value) throws CFException {
		 setInFileStatus(value);
	}
	/**
	 *	Returns the value of outFileStatus
	 *	@return outFileStatus
	 */
	public int getOutFileStatus() throws CFException {
       if (isOutFileStatusModified()) { 
           outFileStatus = refreshOutFileStatus();
        }
   		return outFileStatus;
	}
	

	
	   
	/**
	 * 	Update OutFileStatus with the passed value
	 *  Corresponding COBOL Variable is WS-OUT-FILE-STATUS
	 *	@param number
	 */
	public void setOutFileStatus(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    outFileStatus = checkOutFileStatusMaxLimit(number); 
		serializeOutFileStatus(outFileStatus);
	}
	

	public void setOutFileStatus(long number) {
	    number = checkOutFileStatusMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutFileStatus((int)number);
	}
	
	/**
	 * 	Update OutFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutFileStatus(char[] value) throws CFException {
		 outFileStatus = serializeOutFileStatus(value);
	}
	/**
	 * 	Update OutFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutFileStatusString(char[] value) throws CFException {
		 setOutFileStatus(value);
	}
	/**
	 *	Returns the value of inEofFlag
	 *	@return inEofFlag
	 */
	public short getInEofFlag() throws CFException {
   		return inEofFlag;
	}
	
	/**
	 * 	Update InEofFlag with the passed value
	 *  Corresponding COBOL Variable is WS-IN-EOF-FLAG
	 *	@param number
	 */
	public void setInEofFlag(short number) {
	     // Truncate if the number is beyond +/- Max range
	    inEofFlag = checkInEofFlagMaxLimit(number); 
	}

	public void setInEofFlag(int number) {
	    number = checkInEofFlagMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setInEofFlag((short)number);
	}
	public void setInEofFlag(long number) {
	    number = checkInEofFlagMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setInEofFlag((short)number);
	}
	

	
	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return (  getInEofFlag()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue() {  			
    	setInEofFlag( (short)1);
   	}
	/**
	 *	Returns the value of lreclMax
	 *	@return lreclMax
	 */
	public short getLreclMax() throws CFException {
   		return lreclMax;
	}
	
	/**
	 * 	Update LreclMax with the passed value
	 *  Corresponding COBOL Variable is WS-LRECL-MAX
	 *	@param number
	 */
	public void setLreclMax(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lreclMax = checkLreclMaxMaxLimit(number); 
	}

	public void setLreclMax(int number) {
	    number = checkLreclMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLreclMax((short)number);
	}
	public void setLreclMax(long number) {
	    number = checkLreclMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLreclMax((short)number);
	}
	

	/**
	 *	Returns the value of outRecLen
	 *	@return outRecLen
	 */
	public int getOutRecLen() throws CFException {
   		return outRecLen;
	}
	
	/**
	 * 	Update OutRecLen with the passed value
	 *  Corresponding COBOL Variable is WS-OUT-REC-LEN
	 *	@param number
	 */
	public void setOutRecLen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    outRecLen = checkOutRecLenMaxLimit(number); 
	}


	public void setOutRecLen(long number) {
	    number = checkOutRecLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutRecLen((int)number);
	}
	
	/**
	 *	Returns the value of inRecLen
	 *	@return inRecLen
	 */
	public int getInRecLen() throws CFException {
   		return inRecLen;
	}
	
	/**
	 * 	Update InRecLen with the passed value
	 *  Corresponding COBOL Variable is WS-IN-REC-LEN
	 *	@param number
	 */
	public void setInRecLen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    inRecLen = checkInRecLenMaxLimit(number); 
	}


	public void setInRecLen(long number) {
	    number = checkInRecLenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInRecLen((int)number);
	}
	
	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {
   		return i;
	}
	
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is I
	 *	@param number
	 */
	public void setI(short number) {
	     // Truncate if the number is beyond +/- Max range
	    i = checkIMaxLimit(number); 
	}

	public void setI(int number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	public void setI(long number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	

	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public short getJ() throws CFException {
   		return j;
	}
	
	/**
	 * 	Update J with the passed value
	 *  Corresponding COBOL Variable is J
	 *	@param number
	 */
	public void setJ(short number) {
	     // Truncate if the number is beyond +/- Max range
	    j = checkJMaxLimit(number); 
	}

	public void setJ(int number) {
	    number = checkJMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setJ((short)number);
	}
	public void setJ(long number) {
	    number = checkJMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setJ((short)number);
	}
	

	/**
	 *	Returns the value of k
	 *	@return k
	 */
	public short getK() throws CFException {
   		return k;
	}
	
	/**
	 * 	Update K with the passed value
	 *  Corresponding COBOL Variable is K
	 *	@param number
	 */
	public void setK(short number) {
	     // Truncate if the number is beyond +/- Max range
	    k = checkKMaxLimit(number); 
	}

	public void setK(int number) {
	    number = checkKMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setK((short)number);
	}
	public void setK(long number) {
	    number = checkKMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setK((short)number);
	}
	

	/**
	 *	Returns the value of dataLenMin
	 *	@return dataLenMin
	 */
	public short getDataLenMin() throws CFException {
   		return dataLenMin;
	}
	
	/**
	 * 	Update DataLenMin with the passed value
	 *  Corresponding COBOL Variable is WS-DATA-LEN-MIN
	 *	@param number
	 */
	public void setDataLenMin(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dataLenMin = checkDataLenMinMaxLimit(number); 
	}

	public void setDataLenMin(int number) {
	    number = checkDataLenMinMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDataLenMin((short)number);
	}
	public void setDataLenMin(long number) {
	    number = checkDataLenMinMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDataLenMin((short)number);
	}
	

	/**
	 *	Returns the value of dataLenMax
	 *	@return dataLenMax
	 */
	public short getDataLenMax() throws CFException {
   		return dataLenMax;
	}
	
	/**
	 * 	Update DataLenMax with the passed value
	 *  Corresponding COBOL Variable is WS-DATA-LEN-MAX
	 *	@param number
	 */
	public void setDataLenMax(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dataLenMax = checkDataLenMaxMaxLimit(number); 
	}

	public void setDataLenMax(int number) {
	    number = checkDataLenMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDataLenMax((short)number);
	}
	public void setDataLenMax(long number) {
	    number = checkDataLenMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDataLenMax((short)number);
	}
	

	/**
	 *	Returns the value of recInCtr
	 *	@return recInCtr
	 */
	public short getRecInCtr() throws CFException {
   		return recInCtr;
	}
	
	/**
	 * 	Update RecInCtr with the passed value
	 *  Corresponding COBOL Variable is WS-REC-IN-CTR
	 *	@param number
	 */
	public void setRecInCtr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    recInCtr = checkRecInCtrMaxLimit(number); 
	}

	public void setRecInCtr(int number) {
	    number = checkRecInCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRecInCtr((short)number);
	}
	public void setRecInCtr(long number) {
	    number = checkRecInCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRecInCtr((short)number);
	}
	

	/**
	 *	Returns the value of recOutCtr
	 *	@return recOutCtr
	 */
	public short getRecOutCtr() throws CFException {
   		return recOutCtr;
	}
	
	/**
	 * 	Update RecOutCtr with the passed value
	 *  Corresponding COBOL Variable is WS-REC-OUT-CTR
	 *	@param number
	 */
	public void setRecOutCtr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    recOutCtr = checkRecOutCtrMaxLimit(number); 
	}

	public void setRecOutCtr(int number) {
	    number = checkRecOutCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRecOutCtr((short)number);
	}
	public void setRecOutCtr(long number) {
	    number = checkRecOutCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRecOutCtr((short)number);
	}
	

	/**
	 *	Returns the value of displayNum1
	 *	@return displayNum1
	 */
   public char[] getDisplayNum1() throws CFException{
     if (isDisplayNum1Modified()) { 
        displayNum1 = refreshDisplayNum1();
     }
   		return displayNum1;
   }

  
	/**
	*  set variable displayNum1
	*  Corresponding COBOL Variable is WS-DISPLAY-NUM-1
	*  @param value
	**/
   public void setDisplayNum1(char[] value) {
      displayNum1 = checkDisplayNum1Constraints(value);
      serializeDisplayNum1(displayNum1);
   } 

     /**
	 * 	Update DisplayNum1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNum1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDisplayNum1,displayNum1.length);
   	
   }
   
   public void setDisplayNum1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNum1,displayNum1.length);
   	
   }
   
     /**
	 * 	Update DisplayNum1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNum1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DisplayNum1 with another Field
	 *	@param value
	 */
   public void setDisplayNum1(Field source) {
       replace(source,0,source.length(),beginDisplayNum1,DISPLAY_NUM_1_LEN);
   	
   }  
   
     /**
	 * 	Update DisplayNum1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNum1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDisplayNum1,DISPLAY_NUM_1_LEN);
   	
   }
   
     /**
	 * 	Update DisplayNum1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNum1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of displayNum2
	 *	@return displayNum2
	 */
   public char[] getDisplayNum2() throws CFException{
     if (isDisplayNum2Modified()) { 
        displayNum2 = refreshDisplayNum2();
     }
   		return displayNum2;
   }

  
	/**
	*  set variable displayNum2
	*  Corresponding COBOL Variable is WS-DISPLAY-NUM-2
	*  @param value
	**/
   public void setDisplayNum2(char[] value) {
      displayNum2 = checkDisplayNum2Constraints(value);
      serializeDisplayNum2(displayNum2);
   } 

     /**
	 * 	Update DisplayNum2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNum2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDisplayNum2,displayNum2.length);
   	
   }
   
   public void setDisplayNum2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNum2,displayNum2.length);
   	
   }
   
     /**
	 * 	Update DisplayNum2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNum2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DisplayNum2 with another Field
	 *	@param value
	 */
   public void setDisplayNum2(Field source) {
       replace(source,0,source.length(),beginDisplayNum2,DISPLAY_NUM_2_LEN);
   	
   }  
   
     /**
	 * 	Update DisplayNum2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNum2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDisplayNum2,DISPLAY_NUM_2_LEN);
   	
   }
   
     /**
	 * 	Update DisplayNum2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNum2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of displayNum3
	 *	@return displayNum3
	 */
   public char[] getDisplayNum3() throws CFException{
     if (isDisplayNum3Modified()) { 
        displayNum3 = refreshDisplayNum3();
     }
   		return displayNum3;
   }

  
	/**
	*  set variable displayNum3
	*  Corresponding COBOL Variable is WS-DISPLAY-NUM-3
	*  @param value
	**/
   public void setDisplayNum3(char[] value) {
      displayNum3 = checkDisplayNum3Constraints(value);
      serializeDisplayNum3(displayNum3);
   } 

     /**
	 * 	Update DisplayNum3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNum3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDisplayNum3,displayNum3.length);
   	
   }
   
   public void setDisplayNum3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNum3,displayNum3.length);
   	
   }
   
     /**
	 * 	Update DisplayNum3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNum3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DisplayNum3 with another Field
	 *	@param value
	 */
   public void setDisplayNum3(Field source) {
       replace(source,0,source.length(),beginDisplayNum3,DISPLAY_NUM_3_LEN);
   	
   }  
   
     /**
	 * 	Update DisplayNum3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNum3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDisplayNum3,DISPLAY_NUM_3_LEN);
   	
   }
   
     /**
	 * 	Update DisplayNum3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNum3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mode
	 *	@return mode
	 */
   public char[] getMode() throws CFException{
   		return mode;
   }

  
	/**
	*  set variable mode
	*  Corresponding COBOL Variable is WS-MODE
	*  @param value
	**/
   public void setMode(char[] value) {
       value = checkModeConstraints(value);
       arraycopy(value,0,mode,0,value.length);
   } 
	public void setMode(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mode,0,beginIndex + endIndex);
   }
	char[] modeValid88Value1 = "B".toCharArray();
char[] modeValid88Value2 = "R".toCharArray();
char[] modeValid88Value3 = "W".toCharArray();

	/**
	 *	Test condition "B" "R" "W" for isModeValid()
	 *	@return  Returns true if isModeValid() is "B" "R" "W"
	 */
   public boolean isModeValid() throws CFException {
      return (  compareChars( getMode() , modeValid88Value1)  == 0  ||  compareChars( getMode() , modeValid88Value2)  == 0  ||  compareChars( getMode() , modeValid88Value3)  == 0  );
   }


	/**
	*  set values "B" "R" "W"
	*/
   	public void setModeValidTrue() {  			
    	setMode( modeValid88Value1);
   	}
	char[] modeWrite88Value1 = "W".toCharArray();
char[] modeWrite88Value2 = "B".toCharArray();

	/**
	 *	Test condition "W" "B" for isModeWrite()
	 *	@return  Returns true if isModeWrite() is "W" "B"
	 */
   public boolean isModeWrite() throws CFException {
      return (  compareChars( getMode() , modeWrite88Value1)  == 0  ||  compareChars( getMode() , modeWrite88Value2)  == 0  );
   }


	/**
	*  set values "W" "B"
	*/
   	public void setModeWriteTrue() {  			
    	setMode( modeWrite88Value1);
   	}
	char[] modeRead88Value1 = "R".toCharArray();
char[] modeRead88Value2 = "B".toCharArray();

	/**
	 *	Test condition "R" "B" for isModeRead()
	 *	@return  Returns true if isModeRead() is "R" "B"
	 */
   public boolean isModeRead() throws CFException {
      return (  compareChars( getMode() , modeRead88Value1)  == 0  ||  compareChars( getMode() , modeRead88Value2)  == 0  );
   }


	/**
	*  set values "R" "B"
	*/
   	public void setModeReadTrue() {  			
    	setMode( modeRead88Value1);
   	}
	char[] modeBoth88Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isModeBoth()
	 *	@return  Returns true if isModeBoth() is "B"
	 */
   public boolean isModeBoth() throws CFException {
      return (  compareChars( getMode() , modeBoth88Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setModeBothTrue() {  			
    	setMode( modeBoth88Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
