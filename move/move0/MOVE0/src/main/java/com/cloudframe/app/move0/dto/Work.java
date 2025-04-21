package com.cloudframe.app.move0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Work extends WorkSerialized {
   

								private int sub1;

						private char[] label = Field.fillLowValue(5);

						private char[] wrkaApplication = Field.fillLowValue(2);

						private char[] rl6bfMonthlyAllowText1 = Field.fillLowValue(15);

						private char[] lkplanDataAllowUom = Field.fillLowValue(10);

								private BigDecimal numDisp1 = BigDecimal.ZERO;

								private BigDecimal numDec1 = BigDecimal.ZERO;

								private long int1;

								private int short1;

								private long long1;

								private BigDecimal numDisp2 = BigDecimal.ZERO;

								private BigDecimal numDec2 = BigDecimal.ZERO;

								private long int2;

								private int short2;

								private long long2;

								private char[] edit = Field.fillLowValue(21);

								private BigDecimal numDisp3 = BigDecimal.ZERO;

								private BigDecimal numDec3 = BigDecimal.ZERO;

								private int int3;

								private short short3;

								private long long3;

								private BigDecimal numDisp4 = BigDecimal.ZERO;

								private BigDecimal numDec4 = BigDecimal.ZERO;

								private int int4;

								private short short4;

								private long long4;

						private char[] beginning = new char[10];

						private char[] ending = new char[10];

								private BigDecimal d10 = BigDecimal.ZERO;

								private BigDecimal d20 = BigDecimal.ZERO;

								private BigDecimal d30 = BigDecimal.ZERO;

								private BigDecimal d40 = BigDecimal.ZERO;

								private BigDecimal d50 = BigDecimal.ZERO;

								private BigDecimal d60 = BigDecimal.ZERO;

								private BigDecimal d70 = BigDecimal.ZERO;

								private BigDecimal d80 = BigDecimal.ZERO;

								private BigDecimal d11 = BigDecimal.ZERO;

								private BigDecimal d21 = BigDecimal.ZERO;

								private BigDecimal d31 = BigDecimal.ZERO;

								private BigDecimal d41 = BigDecimal.ZERO;

								private BigDecimal d51 = BigDecimal.ZERO;

								private BigDecimal d61 = BigDecimal.ZERO;

								private BigDecimal d71 = BigDecimal.ZERO;

								private BigDecimal d81 = BigDecimal.ZERO;

								private BigDecimal p10 = BigDecimal.ZERO;

								private BigDecimal p20 = BigDecimal.ZERO;

								private BigDecimal p30 = BigDecimal.ZERO;

								private BigDecimal p40 = BigDecimal.ZERO;

								private BigDecimal p50 = BigDecimal.ZERO;

								private BigDecimal p60 = BigDecimal.ZERO;

								private BigDecimal p70 = BigDecimal.ZERO;

								private BigDecimal p80 = BigDecimal.ZERO;

								private BigDecimal p11 = BigDecimal.ZERO;

								private BigDecimal p21 = BigDecimal.ZERO;

								private BigDecimal p31 = BigDecimal.ZERO;

								private BigDecimal p41 = BigDecimal.ZERO;

								private BigDecimal p51 = BigDecimal.ZERO;

								private BigDecimal p61 = BigDecimal.ZERO;

								private BigDecimal p71 = BigDecimal.ZERO;

								private BigDecimal p81 = BigDecimal.ZERO;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBeginning(String.join("", java.util.Collections.nCopies(10, ">")).toCharArray());
								setEnding(String.join("", java.util.Collections.nCopies(10, "<")).toCharArray());
    }


 

	/**
	 *	Returns the value of sub1
	 *	@return sub1
	 */
	public int getSub1() throws CFException {
       if (isSub1Modified()) { 
           sub1 = refreshSub1();
        }
   		return sub1;
	}
	

	
	   
	/**
	 * 	Update Sub1 with the passed value
	 *  Corresponding COBOL Variable is SUB1
	 *	@param number
	 */
	public void setSub1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub1 = checkSub1MaxLimit(number); 
		serializeSub1(sub1);
	}
	

	public void setSub1(long number) {
	    number = checkSub1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSub1((int)number);
	}
	
	/**
	 * 	Update Sub1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1(char[] value) throws CFException {
		 sub1 = serializeSub1(value);
	}
	/**
	 * 	Update Sub1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1String(char[] value) throws CFException {
		 setSub1(value);
	}
	/**
	 *	Returns the value of label
	 *	@return label
	 */
   public char[] getLabel() throws CFException{
   		return label;
   }

  
	/**
	*  set variable label
	*  Corresponding COBOL Variable is WS-LABEL
	*  @param value
	**/
   public void setLabel(char[] value) {
       value = checkLabelConstraints(value);
       arraycopy(value,0,label,0,value.length);
   } 
	public void setLabel(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,label,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wrkaApplication
	 *	@return wrkaApplication
	 */
   public char[] getWrkaApplication() throws CFException{
   		return wrkaApplication;
   }

  
	/**
	*  set variable wrkaApplication
	*  Corresponding COBOL Variable is WRKA-APPLICATION
	*  @param value
	**/
   public void setWrkaApplication(char[] value) {
       value = checkWrkaApplicationConstraints(value);
       arraycopy(value,0,wrkaApplication,0,value.length);
   } 
	public void setWrkaApplication(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wrkaApplication,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rl6bfMonthlyAllowText1
	 *	@return rl6bfMonthlyAllowText1
	 */
   public char[] getRl6bfMonthlyAllowText1() throws CFException{
   		return rl6bfMonthlyAllowText1;
   }

  
	/**
	*  set variable rl6bfMonthlyAllowText1
	*  Corresponding COBOL Variable is RL6BF-MONTHLY-ALLOW-TEXT-1
	*  @param value
	**/
   public void setRl6bfMonthlyAllowText1(char[] value) {
       value = checkRl6bfMonthlyAllowText1Constraints(value);
       arraycopy(value,0,rl6bfMonthlyAllowText1,0,value.length);
   } 
	public void setRl6bfMonthlyAllowText1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rl6bfMonthlyAllowText1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lkplanDataAllowUom
	 *	@return lkplanDataAllowUom
	 */
   public char[] getLkplanDataAllowUom() throws CFException{
   		return lkplanDataAllowUom;
   }

  
	/**
	*  set variable lkplanDataAllowUom
	*  Corresponding COBOL Variable is LKPLAN-DATA-ALLOW-UOM
	*  @param value
	**/
   public void setLkplanDataAllowUom(char[] value) {
       value = checkLkplanDataAllowUomConstraints(value);
       arraycopy(value,0,lkplanDataAllowUom,0,value.length);
   } 
	public void setLkplanDataAllowUom(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lkplanDataAllowUom,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of numDisp1
	 *	@return numDisp1
	 */
	public BigDecimal getNumDisp1() throws CFException {
       if (isNumDisp1Modified()) { 
           numDisp1 = refreshNumDisp1();
        }
   		return numDisp1;
	}
	

	
	   
	/**
	 * 	Update NumDisp1 with the passed number
	 *  Corresponding COBOL Variable is NUM-DISP-1
	 *	@param number
	 */
	public void setNumDisp1(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       numDisp1 = checkNumDisp1MaxLimit(number);
	    serializeNumDisp1(numDisp1);
   }
	/**
	 * 	Update NumDisp1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumDisp1(char[] value) throws CFException {
		 numDisp1 = serializeNumDisp1(value);
	}   
	public BigDecimal getNumDec1() throws CFException {
        if (isNumDec1Modified()) { 
           numDec1 = refreshNumDec1();
        }
   		return numDec1;
	}

    public char[] getNumDec1String() {
          return  numDec1String();
    }
	
	/**
	 * 	Update NumDec1 with the passed number
	 *  Corresponding COBOL Variable is NUM-DEC-1
	 *	@param number
	 */
	public void setNumDec1(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     numDec1 = checkNumDec1MaxLimit(number);
	    serializeNumDec1(numDec1);
   }
	/**
	 *	Returns the value of int1
	 *	@return int1
	 */
	public long getInt1() throws CFException {
   		return int1;
	}
	
	/**
	 * 	Update Int1 with the passed value
	 *  Corresponding COBOL Variable is WS-INT-1
	 *	@param number
	 */
	public void setInt1(long number) {
	     // Truncate if the number is beyond +/- Max range
	    int1 = checkInt1MaxLimit(number); 
	}


	/**
	 *	Returns the value of short1
	 *	@return short1
	 */
	public int getShort1() throws CFException {
   		return short1;
	}
	
	/**
	 * 	Update Short1 with the passed value
	 *  Corresponding COBOL Variable is WS-SHORT-1
	 *	@param number
	 */
	public void setShort1(int number) {
	     // Truncate if the number is beyond +/- Max range
	    short1 = checkShort1MaxLimit(number); 
	}


	public void setShort1(long number) {
	    number = checkShort1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setShort1((int)number);
	}
	
	/**
	 *	Returns the value of long1
	 *	@return long1
	 */
	public long getLong1() throws CFException {
   		return long1;
	}
	
	/**
	 * 	Update Long1 with the passed value
	 *  Corresponding COBOL Variable is WS-LONG-1
	 *	@param number
	 */
	public void setLong1(long number) {
	     // Truncate if the number is beyond +/- Max range
	    long1 = checkLong1MaxLimit(number); 
	}


	/**
	 *	Returns the value of numDisp2
	 *	@return numDisp2
	 */
	public BigDecimal getNumDisp2() throws CFException {
       if (isNumDisp2Modified()) { 
           numDisp2 = refreshNumDisp2();
        }
   		return numDisp2;
	}
	

	
	   
	/**
	 * 	Update NumDisp2 with the passed number
	 *  Corresponding COBOL Variable is NUM-DISP-2
	 *	@param number
	 */
	public void setNumDisp2(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       numDisp2 = checkNumDisp2MaxLimit(number);
	    serializeNumDisp2(numDisp2);
   }
	/**
	 * 	Update NumDisp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumDisp2(char[] value) throws CFException {
		 numDisp2 = serializeNumDisp2(value);
	}   
	public BigDecimal getNumDec2() throws CFException {
        if (isNumDec2Modified()) { 
           numDec2 = refreshNumDec2();
        }
   		return numDec2;
	}

    public char[] getNumDec2String() {
          return  numDec2String();
    }
	
	/**
	 * 	Update NumDec2 with the passed number
	 *  Corresponding COBOL Variable is NUM-DEC-2
	 *	@param number
	 */
	public void setNumDec2(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     numDec2 = checkNumDec2MaxLimit(number);
	    serializeNumDec2(numDec2);
   }
	/**
	 *	Returns the value of int2
	 *	@return int2
	 */
	public long getInt2() throws CFException {
   		return int2;
	}
	
	/**
	 * 	Update Int2 with the passed value
	 *  Corresponding COBOL Variable is WS-INT-2
	 *	@param number
	 */
	public void setInt2(long number) {
	     // Truncate if the number is beyond +/- Max range
	    int2 = checkInt2MaxLimit(number); 
	}


	/**
	 *	Returns the value of short2
	 *	@return short2
	 */
	public int getShort2() throws CFException {
   		return short2;
	}
	
	/**
	 * 	Update Short2 with the passed value
	 *  Corresponding COBOL Variable is WS-SHORT-2
	 *	@param number
	 */
	public void setShort2(int number) {
	     // Truncate if the number is beyond +/- Max range
	    short2 = checkShort2MaxLimit(number); 
	}


	public void setShort2(long number) {
	    number = checkShort2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setShort2((int)number);
	}
	
	/**
	 *	Returns the value of long2
	 *	@return long2
	 */
	public long getLong2() throws CFException {
   		return long2;
	}
	
	/**
	 * 	Update Long2 with the passed value
	 *  Corresponding COBOL Variable is WS-LONG-2
	 *	@param number
	 */
	public void setLong2(long number) {
	     // Truncate if the number is beyond +/- Max range
	    long2 = checkLong2MaxLimit(number); 
	}


	/**
	 *	Returns the value of edit
	 *	@return edit
	 */
   public char[] getEdit() throws CFException{
     if (isEditModified()) { 
        edit = refreshEdit();
     }
   		return edit;
   }

  
	/**
	*  set variable edit
	*  Corresponding COBOL Variable is WS-EDIT
	*  @param value
	**/
   public void setEdit(char[] value) {
      edit = checkEditConstraints(value);
      serializeEdit(edit);
   } 

     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEdit,edit.length);
   	
   }
   
   public void setEdit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEdit,edit.length);
   	
   }
   
     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEdit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Edit with another Field
	 *	@param value
	 */
   public void setEdit(Field source) {
       replace(source,0,source.length(),beginEdit,EDIT_LEN);
   	
   }  
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEdit,EDIT_LEN);
   	
   }
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEdit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of numDisp3
	 *	@return numDisp3
	 */
	public BigDecimal getNumDisp3() throws CFException {
       if (isNumDisp3Modified()) { 
           numDisp3 = refreshNumDisp3();
        }
   		return numDisp3;
	}
	

    /**
	 *	Returns the String value of numDisp3
	 *	@return numDisp3
	 */
	public char[]  getNumDisp3ActualString() {
	    String value = String.valueOf(numDisp3).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update NumDisp3 with the passed number
	 *  Corresponding COBOL Variable is NUM-DISP-3
	 *	@param number
	 */
	public void setNumDisp3(BigDecimal number) {
       numDisp3 = checkNumDisp3MaxLimit(number);
	    serializeNumDisp3(numDisp3);
   }
	/**
	 * 	Update NumDisp3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumDisp3(char[] value) throws CFException {
		 numDisp3 = serializeNumDisp3(value);
	}   
	public BigDecimal getNumDec3() throws CFException {
        if (isNumDec3Modified()) { 
           numDec3 = refreshNumDec3();
        }
   		return numDec3;
	}

    public char[] getNumDec3String() {
          return  numDec3String();
    }
	
	/**
	 * 	Update NumDec3 with the passed number
	 *  Corresponding COBOL Variable is NUM-DEC-3
	 *	@param number
	 */
	public void setNumDec3(BigDecimal number) {	
     numDec3 = checkNumDec3MaxLimit(number);
	    serializeNumDec3(numDec3);
   }
	/**
	 *	Returns the value of int3
	 *	@return int3
	 */
	public int getInt3() throws CFException {
   		return int3;
	}
	
	/**
	 * 	Update Int3 with the passed value
	 *  Corresponding COBOL Variable is WS-INT-3
	 *	@param number
	 */
	public void setInt3(int number) {
	     // Truncate if the number is beyond +/- Max range
	    int3 = checkInt3MaxLimit(number); 
	}


	public void setInt3(long number) {
	    number = checkInt3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setInt3((int)number);
	}
	
	/**
	 *	Returns the value of short3
	 *	@return short3
	 */
	public short getShort3() throws CFException {
   		return short3;
	}
	
	/**
	 * 	Update Short3 with the passed value
	 *  Corresponding COBOL Variable is WS-SHORT-3
	 *	@param number
	 */
	public void setShort3(short number) {
	     // Truncate if the number is beyond +/- Max range
	    short3 = checkShort3MaxLimit(number); 
	}

	public void setShort3(int number) {
	    number = checkShort3MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setShort3((short)number);
	}
	public void setShort3(long number) {
	    number = checkShort3MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setShort3((short)number);
	}
	

	/**
	 *	Returns the value of long3
	 *	@return long3
	 */
	public long getLong3() throws CFException {
   		return long3;
	}
	
	/**
	 * 	Update Long3 with the passed value
	 *  Corresponding COBOL Variable is WS-LONG-3
	 *	@param number
	 */
	public void setLong3(long number) {
	     // Truncate if the number is beyond +/- Max range
	    long3 = checkLong3MaxLimit(number); 
	}


	/**
	 *	Returns the value of numDisp4
	 *	@return numDisp4
	 */
	public BigDecimal getNumDisp4() throws CFException {
       if (isNumDisp4Modified()) { 
           numDisp4 = refreshNumDisp4();
        }
   		return numDisp4;
	}
	

    /**
	 *	Returns the String value of numDisp4
	 *	@return numDisp4
	 */
	public char[]  getNumDisp4ActualString() {
	    String value = String.valueOf(numDisp4).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update NumDisp4 with the passed number
	 *  Corresponding COBOL Variable is NUM-DISP-4
	 *	@param number
	 */
	public void setNumDisp4(BigDecimal number) {
       numDisp4 = checkNumDisp4MaxLimit(number);
	    serializeNumDisp4(numDisp4);
   }
	/**
	 * 	Update NumDisp4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumDisp4(char[] value) throws CFException {
		 numDisp4 = serializeNumDisp4(value);
	}   
	public BigDecimal getNumDec4() throws CFException {
        if (isNumDec4Modified()) { 
           numDec4 = refreshNumDec4();
        }
   		return numDec4;
	}

    public char[] getNumDec4String() {
          return  numDec4String();
    }
	
	/**
	 * 	Update NumDec4 with the passed number
	 *  Corresponding COBOL Variable is NUM-DEC-4
	 *	@param number
	 */
	public void setNumDec4(BigDecimal number) {	
     numDec4 = checkNumDec4MaxLimit(number);
	    serializeNumDec4(numDec4);
   }
	/**
	 *	Returns the value of int4
	 *	@return int4
	 */
	public int getInt4() throws CFException {
   		return int4;
	}
	
	/**
	 * 	Update Int4 with the passed value
	 *  Corresponding COBOL Variable is WS-INT-4
	 *	@param number
	 */
	public void setInt4(int number) {
	     // Truncate if the number is beyond +/- Max range
	    int4 = checkInt4MaxLimit(number); 
	}


	public void setInt4(long number) {
	    number = checkInt4MaxLimit(number); // Truncate if value is beyond +/- Max range
		setInt4((int)number);
	}
	
	/**
	 *	Returns the value of short4
	 *	@return short4
	 */
	public short getShort4() throws CFException {
   		return short4;
	}
	
	/**
	 * 	Update Short4 with the passed value
	 *  Corresponding COBOL Variable is WS-SHORT-4
	 *	@param number
	 */
	public void setShort4(short number) {
	     // Truncate if the number is beyond +/- Max range
	    short4 = checkShort4MaxLimit(number); 
	}

	public void setShort4(int number) {
	    number = checkShort4MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setShort4((short)number);
	}
	public void setShort4(long number) {
	    number = checkShort4MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setShort4((short)number);
	}
	

	/**
	 *	Returns the value of long4
	 *	@return long4
	 */
	public long getLong4() throws CFException {
   		return long4;
	}
	
	/**
	 * 	Update Long4 with the passed value
	 *  Corresponding COBOL Variable is WS-LONG-4
	 *	@param number
	 */
	public void setLong4(long number) {
	     // Truncate if the number is beyond +/- Max range
	    long4 = checkLong4MaxLimit(number); 
	}


	/**
	 *	Returns the value of beginning
	 *	@return beginning
	 */
   public char[] getBeginning() throws CFException{
   		return beginning;
   }

  
	/**
	*  set variable beginning
	*  Corresponding COBOL Variable is WS-BEGINNING
	*  @param value
	**/
   public void setBeginning(char[] value) {
       value = checkBeginningConstraints(value);
       arraycopy(value,0,beginning,0,value.length);
   } 
	public void setBeginning(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,beginning,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ending
	 *	@return ending
	 */
   public char[] getEnding() throws CFException{
   		return ending;
   }

  
	/**
	*  set variable ending
	*  Corresponding COBOL Variable is WS-ENDING
	*  @param value
	**/
   public void setEnding(char[] value) {
       value = checkEndingConstraints(value);
       arraycopy(value,0,ending,0,value.length);
   } 
	public void setEnding(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ending,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of d10
	 *	@return d10
	 */
	public BigDecimal getD10() throws CFException {
       if (isD10Modified()) { 
           d10 = refreshD10();
        }
   		return d10;
	}
	

    /**
	 *	Returns the String value of d10
	 *	@return d10
	 */
	public char[]  getD10ActualString() {
	    String value = String.valueOf(d10).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update D10 with the passed number
	 *  Corresponding COBOL Variable is WS-D10
	 *	@param number
	 */
	public void setD10(BigDecimal number) {
       d10 = checkD10MaxLimit(number);
	    serializeD10(d10);
   }
	/**
	 * 	Update D10 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD10(char[] value) throws CFException {
		 d10 = serializeD10(value);
	}   
	/**
	 *	Returns the value of d20
	 *	@return d20
	 */
	public BigDecimal getD20() throws CFException {
       if (isD20Modified()) { 
           d20 = refreshD20();
        }
   		return d20;
	}
	

    /**
	 *	Returns the String value of d20
	 *	@return d20
	 */
	public char[]  getD20ActualString() {
	    String value = String.valueOf(d20).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update D20 with the passed number
	 *  Corresponding COBOL Variable is WS-D20
	 *	@param number
	 */
	public void setD20(BigDecimal number) {
       d20 = checkD20MaxLimit(number);
	    serializeD20(d20);
   }
	/**
	 * 	Update D20 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD20(char[] value) throws CFException {
		 d20 = serializeD20(value);
	}   
	/**
	 *	Returns the value of d30
	 *	@return d30
	 */
	public BigDecimal getD30() throws CFException {
       if (isD30Modified()) { 
           d30 = refreshD30();
        }
   		return d30;
	}
	

    /**
	 *	Returns the String value of d30
	 *	@return d30
	 */
	public char[]  getD30ActualString() {
	    String value = String.valueOf(d30).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update D30 with the passed number
	 *  Corresponding COBOL Variable is WS-D30
	 *	@param number
	 */
	public void setD30(BigDecimal number) {
       d30 = checkD30MaxLimit(number);
	    serializeD30(d30);
   }
	/**
	 * 	Update D30 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD30(char[] value) throws CFException {
		 d30 = serializeD30(value);
	}   
	/**
	 *	Returns the value of d40
	 *	@return d40
	 */
	public BigDecimal getD40() throws CFException {
       if (isD40Modified()) { 
           d40 = refreshD40();
        }
   		return d40;
	}
	

    /**
	 *	Returns the String value of d40
	 *	@return d40
	 */
	public char[]  getD40ActualString() {
	    String value = String.valueOf(d40).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update D40 with the passed number
	 *  Corresponding COBOL Variable is WS-D40
	 *	@param number
	 */
	public void setD40(BigDecimal number) {
       d40 = checkD40MaxLimit(number);
	    serializeD40(d40);
   }
	/**
	 * 	Update D40 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD40(char[] value) throws CFException {
		 d40 = serializeD40(value);
	}   
	/**
	 *	Returns the value of d50
	 *	@return d50
	 */
	public BigDecimal getD50() throws CFException {
       if (isD50Modified()) { 
           d50 = refreshD50();
        }
   		return d50;
	}
	

    /**
	 *	Returns the String value of d50
	 *	@return d50
	 */
	public char[]  getD50ActualString() {
	    String value = String.valueOf(d50).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update D50 with the passed number
	 *  Corresponding COBOL Variable is WS-D50
	 *	@param number
	 */
	public void setD50(BigDecimal number) {
       d50 = checkD50MaxLimit(number);
	    serializeD50(d50);
   }
	/**
	 * 	Update D50 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD50(char[] value) throws CFException {
		 d50 = serializeD50(value);
	}   
	/**
	 *	Returns the value of d60
	 *	@return d60
	 */
	public BigDecimal getD60() throws CFException {
       if (isD60Modified()) { 
           d60 = refreshD60();
        }
   		return d60;
	}
	

    /**
	 *	Returns the String value of d60
	 *	@return d60
	 */
	public char[]  getD60ActualString() {
	    String value = String.valueOf(d60).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update D60 with the passed number
	 *  Corresponding COBOL Variable is WS-D60
	 *	@param number
	 */
	public void setD60(BigDecimal number) {
       d60 = checkD60MaxLimit(number);
	    serializeD60(d60);
   }
	/**
	 * 	Update D60 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD60(char[] value) throws CFException {
		 d60 = serializeD60(value);
	}   
	/**
	 *	Returns the value of d70
	 *	@return d70
	 */
	public BigDecimal getD70() throws CFException {
       if (isD70Modified()) { 
           d70 = refreshD70();
        }
   		return d70;
	}
	

    /**
	 *	Returns the String value of d70
	 *	@return d70
	 */
	public char[]  getD70ActualString() {
	    String value = String.valueOf(d70).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update D70 with the passed number
	 *  Corresponding COBOL Variable is WS-D70
	 *	@param number
	 */
	public void setD70(BigDecimal number) {
       d70 = checkD70MaxLimit(number);
	    serializeD70(d70);
   }
	/**
	 * 	Update D70 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD70(char[] value) throws CFException {
		 d70 = serializeD70(value);
	}   
	/**
	 *	Returns the value of d80
	 *	@return d80
	 */
	public BigDecimal getD80() throws CFException {
       if (isD80Modified()) { 
           d80 = refreshD80();
        }
   		return d80;
	}
	

    /**
	 *	Returns the String value of d80
	 *	@return d80
	 */
	public char[]  getD80ActualString() {
	    String value = String.valueOf(d80).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update D80 with the passed number
	 *  Corresponding COBOL Variable is WS-D80
	 *	@param number
	 */
	public void setD80(BigDecimal number) {
       d80 = checkD80MaxLimit(number);
	    serializeD80(d80);
   }
	/**
	 * 	Update D80 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD80(char[] value) throws CFException {
		 d80 = serializeD80(value);
	}   
	/**
	 *	Returns the value of d11
	 *	@return d11
	 */
	public BigDecimal getD11() throws CFException {
       if (isD11Modified()) { 
           d11 = refreshD11();
        }
   		return d11;
	}
	

	
	   
	/**
	 * 	Update D11 with the passed number
	 *  Corresponding COBOL Variable is WS-D11
	 *	@param number
	 */
	public void setD11(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       d11 = checkD11MaxLimit(number);
	    serializeD11(d11);
   }
	/**
	 * 	Update D11 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD11(char[] value) throws CFException {
		 d11 = serializeD11(value);
	}   
	/**
	 *	Returns the value of d21
	 *	@return d21
	 */
	public BigDecimal getD21() throws CFException {
       if (isD21Modified()) { 
           d21 = refreshD21();
        }
   		return d21;
	}
	

	
	   
	/**
	 * 	Update D21 with the passed number
	 *  Corresponding COBOL Variable is WS-D21
	 *	@param number
	 */
	public void setD21(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       d21 = checkD21MaxLimit(number);
	    serializeD21(d21);
   }
	/**
	 * 	Update D21 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD21(char[] value) throws CFException {
		 d21 = serializeD21(value);
	}   
	/**
	 *	Returns the value of d31
	 *	@return d31
	 */
	public BigDecimal getD31() throws CFException {
       if (isD31Modified()) { 
           d31 = refreshD31();
        }
   		return d31;
	}
	

	
	   
	/**
	 * 	Update D31 with the passed number
	 *  Corresponding COBOL Variable is WS-D31
	 *	@param number
	 */
	public void setD31(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       d31 = checkD31MaxLimit(number);
	    serializeD31(d31);
   }
	/**
	 * 	Update D31 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD31(char[] value) throws CFException {
		 d31 = serializeD31(value);
	}   
	/**
	 *	Returns the value of d41
	 *	@return d41
	 */
	public BigDecimal getD41() throws CFException {
       if (isD41Modified()) { 
           d41 = refreshD41();
        }
   		return d41;
	}
	

	
	   
	/**
	 * 	Update D41 with the passed number
	 *  Corresponding COBOL Variable is WS-D41
	 *	@param number
	 */
	public void setD41(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       d41 = checkD41MaxLimit(number);
	    serializeD41(d41);
   }
	/**
	 * 	Update D41 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD41(char[] value) throws CFException {
		 d41 = serializeD41(value);
	}   
	/**
	 *	Returns the value of d51
	 *	@return d51
	 */
	public BigDecimal getD51() throws CFException {
       if (isD51Modified()) { 
           d51 = refreshD51();
        }
   		return d51;
	}
	

	
	   
	/**
	 * 	Update D51 with the passed number
	 *  Corresponding COBOL Variable is WS-D51
	 *	@param number
	 */
	public void setD51(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       d51 = checkD51MaxLimit(number);
	    serializeD51(d51);
   }
	/**
	 * 	Update D51 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD51(char[] value) throws CFException {
		 d51 = serializeD51(value);
	}   
	/**
	 *	Returns the value of d61
	 *	@return d61
	 */
	public BigDecimal getD61() throws CFException {
       if (isD61Modified()) { 
           d61 = refreshD61();
        }
   		return d61;
	}
	

	
	   
	/**
	 * 	Update D61 with the passed number
	 *  Corresponding COBOL Variable is WS-D61
	 *	@param number
	 */
	public void setD61(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       d61 = checkD61MaxLimit(number);
	    serializeD61(d61);
   }
	/**
	 * 	Update D61 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD61(char[] value) throws CFException {
		 d61 = serializeD61(value);
	}   
	/**
	 *	Returns the value of d71
	 *	@return d71
	 */
	public BigDecimal getD71() throws CFException {
       if (isD71Modified()) { 
           d71 = refreshD71();
        }
   		return d71;
	}
	

	
	   
	/**
	 * 	Update D71 with the passed number
	 *  Corresponding COBOL Variable is WS-D71
	 *	@param number
	 */
	public void setD71(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       d71 = checkD71MaxLimit(number);
	    serializeD71(d71);
   }
	/**
	 * 	Update D71 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD71(char[] value) throws CFException {
		 d71 = serializeD71(value);
	}   
	/**
	 *	Returns the value of d81
	 *	@return d81
	 */
	public BigDecimal getD81() throws CFException {
       if (isD81Modified()) { 
           d81 = refreshD81();
        }
   		return d81;
	}
	

	
	   
	/**
	 * 	Update D81 with the passed number
	 *  Corresponding COBOL Variable is WS-D81
	 *	@param number
	 */
	public void setD81(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       d81 = checkD81MaxLimit(number);
	    serializeD81(d81);
   }
	/**
	 * 	Update D81 with the passed value
	 *	@param value (String or char[])
	 */
	public void setD81(char[] value) throws CFException {
		 d81 = serializeD81(value);
	}   
	public BigDecimal getP10() throws CFException {
        if (isP10Modified()) { 
           p10 = refreshP10();
        }
   		return p10;
	}

    public char[] getP10String() {
          return  p10String();
    }
	
	/**
	 * 	Update P10 with the passed number
	 *  Corresponding COBOL Variable is WS-P10
	 *	@param number
	 */
	public void setP10(BigDecimal number) {	
     p10 = checkP10MaxLimit(number);
	    serializeP10(p10);
   }
	public BigDecimal getP20() throws CFException {
        if (isP20Modified()) { 
           p20 = refreshP20();
        }
   		return p20;
	}

    public char[] getP20String() {
          return  p20String();
    }
	
	/**
	 * 	Update P20 with the passed number
	 *  Corresponding COBOL Variable is WS-P20
	 *	@param number
	 */
	public void setP20(BigDecimal number) {	
     p20 = checkP20MaxLimit(number);
	    serializeP20(p20);
   }
	public BigDecimal getP30() throws CFException {
        if (isP30Modified()) { 
           p30 = refreshP30();
        }
   		return p30;
	}

    public char[] getP30String() {
          return  p30String();
    }
	
	/**
	 * 	Update P30 with the passed number
	 *  Corresponding COBOL Variable is WS-P30
	 *	@param number
	 */
	public void setP30(BigDecimal number) {	
     p30 = checkP30MaxLimit(number);
	    serializeP30(p30);
   }
	public BigDecimal getP40() throws CFException {
        if (isP40Modified()) { 
           p40 = refreshP40();
        }
   		return p40;
	}

    public char[] getP40String() {
          return  p40String();
    }
	
	/**
	 * 	Update P40 with the passed number
	 *  Corresponding COBOL Variable is WS-P40
	 *	@param number
	 */
	public void setP40(BigDecimal number) {	
     p40 = checkP40MaxLimit(number);
	    serializeP40(p40);
   }
	public BigDecimal getP50() throws CFException {
        if (isP50Modified()) { 
           p50 = refreshP50();
        }
   		return p50;
	}

    public char[] getP50String() {
          return  p50String();
    }
	
	/**
	 * 	Update P50 with the passed number
	 *  Corresponding COBOL Variable is WS-P50
	 *	@param number
	 */
	public void setP50(BigDecimal number) {	
     p50 = checkP50MaxLimit(number);
	    serializeP50(p50);
   }
	public BigDecimal getP60() throws CFException {
        if (isP60Modified()) { 
           p60 = refreshP60();
        }
   		return p60;
	}

    public char[] getP60String() {
          return  p60String();
    }
	
	/**
	 * 	Update P60 with the passed number
	 *  Corresponding COBOL Variable is WS-P60
	 *	@param number
	 */
	public void setP60(BigDecimal number) {	
     p60 = checkP60MaxLimit(number);
	    serializeP60(p60);
   }
	public BigDecimal getP70() throws CFException {
        if (isP70Modified()) { 
           p70 = refreshP70();
        }
   		return p70;
	}

    public char[] getP70String() {
          return  p70String();
    }
	
	/**
	 * 	Update P70 with the passed number
	 *  Corresponding COBOL Variable is WS-P70
	 *	@param number
	 */
	public void setP70(BigDecimal number) {	
     p70 = checkP70MaxLimit(number);
	    serializeP70(p70);
   }
	public BigDecimal getP80() throws CFException {
        if (isP80Modified()) { 
           p80 = refreshP80();
        }
   		return p80;
	}

    public char[] getP80String() {
          return  p80String();
    }
	
	/**
	 * 	Update P80 with the passed number
	 *  Corresponding COBOL Variable is WS-P80
	 *	@param number
	 */
	public void setP80(BigDecimal number) {	
     p80 = checkP80MaxLimit(number);
	    serializeP80(p80);
   }
	public BigDecimal getP11() throws CFException {
        if (isP11Modified()) { 
           p11 = refreshP11();
        }
   		return p11;
	}

    public char[] getP11String() {
          return  p11String();
    }
	
	/**
	 * 	Update P11 with the passed number
	 *  Corresponding COBOL Variable is WS-P11
	 *	@param number
	 */
	public void setP11(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     p11 = checkP11MaxLimit(number);
	    serializeP11(p11);
   }
	public BigDecimal getP21() throws CFException {
        if (isP21Modified()) { 
           p21 = refreshP21();
        }
   		return p21;
	}

    public char[] getP21String() {
          return  p21String();
    }
	
	/**
	 * 	Update P21 with the passed number
	 *  Corresponding COBOL Variable is WS-P21
	 *	@param number
	 */
	public void setP21(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     p21 = checkP21MaxLimit(number);
	    serializeP21(p21);
   }
	public BigDecimal getP31() throws CFException {
        if (isP31Modified()) { 
           p31 = refreshP31();
        }
   		return p31;
	}

    public char[] getP31String() {
          return  p31String();
    }
	
	/**
	 * 	Update P31 with the passed number
	 *  Corresponding COBOL Variable is WS-P31
	 *	@param number
	 */
	public void setP31(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     p31 = checkP31MaxLimit(number);
	    serializeP31(p31);
   }
	public BigDecimal getP41() throws CFException {
        if (isP41Modified()) { 
           p41 = refreshP41();
        }
   		return p41;
	}

    public char[] getP41String() {
          return  p41String();
    }
	
	/**
	 * 	Update P41 with the passed number
	 *  Corresponding COBOL Variable is WS-P41
	 *	@param number
	 */
	public void setP41(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     p41 = checkP41MaxLimit(number);
	    serializeP41(p41);
   }
	public BigDecimal getP51() throws CFException {
        if (isP51Modified()) { 
           p51 = refreshP51();
        }
   		return p51;
	}

    public char[] getP51String() {
          return  p51String();
    }
	
	/**
	 * 	Update P51 with the passed number
	 *  Corresponding COBOL Variable is WS-P51
	 *	@param number
	 */
	public void setP51(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     p51 = checkP51MaxLimit(number);
	    serializeP51(p51);
   }
	public BigDecimal getP61() throws CFException {
        if (isP61Modified()) { 
           p61 = refreshP61();
        }
   		return p61;
	}

    public char[] getP61String() {
          return  p61String();
    }
	
	/**
	 * 	Update P61 with the passed number
	 *  Corresponding COBOL Variable is WS-P61
	 *	@param number
	 */
	public void setP61(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     p61 = checkP61MaxLimit(number);
	    serializeP61(p61);
   }
	public BigDecimal getP71() throws CFException {
        if (isP71Modified()) { 
           p71 = refreshP71();
        }
   		return p71;
	}

    public char[] getP71String() {
          return  p71String();
    }
	
	/**
	 * 	Update P71 with the passed number
	 *  Corresponding COBOL Variable is WS-P71
	 *	@param number
	 */
	public void setP71(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     p71 = checkP71MaxLimit(number);
	    serializeP71(p71);
   }
	public BigDecimal getP81() throws CFException {
        if (isP81Modified()) { 
           p81 = refreshP81();
        }
   		return p81;
	}

    public char[] getP81String() {
          return  p81String();
    }
	
	/**
	 * 	Update P81 with the passed number
	 *  Corresponding COBOL Variable is WS-P81
	 *	@param number
	 */
	public void setP81(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     p81 = checkP81MaxLimit(number);
	    serializeP81(p81);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
