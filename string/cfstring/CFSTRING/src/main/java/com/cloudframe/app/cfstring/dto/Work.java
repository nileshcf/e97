package com.cloudframe.app.cfstring.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfstring.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] string1 = new char[55];

						private char[] string2 = new char[55];

						private char[] holdString = new char[55];

								private int cnt1;

								private char[] edit = Field.fillLowValue(5);

						private char[] parm1 = new char[30];

						private char[] parm2 = new char[30];

						private char[] parm3 = new char[30];

						private char[] parm4 = new char[30];

						private char[] parm5 = new char[30];

						private char[] parm6 = new char[30];

								private int p1Cnt;

								private int p2Cnt;

								private int p3Cnt;

								private int p4Cnt;

								private int p5Cnt;

								private int p6Cnt;

						private char[] delimRec = Field.fillLowValue(1761);

								private short len;

						private char[] svcIdNoP1 = new char[7];

						private char[] svcIdNoP2 = new char[18];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setString1(("PARM1 1%PARM2%  PARM3-ABC%PARM4-XYZ%CloudFrame!!!!     ").toCharArray());
								setString2(fillSpace(55));
								setHoldString(fillSpace(55));
								setCnt1(0);
								setParm1(fillSpace(30));
								setParm2(fillSpace(30));
								setParm3(fillSpace(30));
								setParm4(fillSpace(30));
								setParm5(fillSpace(30));
								setParm6(fillSpace(30));
								setLen((short)5);
								setSvcIdNoP1(("5432101").toCharArray());
								setSvcIdNoP2(("13445             ").toCharArray());
    }


 

	/**
	 *	Returns the value of string1
	 *	@return string1
	 */
   public char[] getString1() throws CFException{
   		return string1;
   }

  
	/**
	*  set variable string1
	*  Corresponding COBOL Variable is WS-STRING-1
	*  @param value
	**/
   public void setString1(char[] value) {
       value = checkString1Constraints(value);
       arraycopy(value,0,string1,0,value.length);
   } 
	public void setString1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,string1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of string2
	 *	@return string2
	 */
   public char[] getString2() throws CFException{
   		return string2;
   }

  
	/**
	*  set variable string2
	*  Corresponding COBOL Variable is WS-STRING-2
	*  @param value
	**/
   public void setString2(char[] value) {
       value = checkString2Constraints(value);
       arraycopy(value,0,string2,0,value.length);
   } 
	public void setString2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,string2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of holdString
	 *	@return holdString
	 */
   public char[] getHoldString() throws CFException{
   		return holdString;
   }

  
	/**
	*  set variable holdString
	*  Corresponding COBOL Variable is WS-HOLD-STRING
	*  @param value
	**/
   public void setHoldString(char[] value) {
       value = checkHoldStringConstraints(value);
       arraycopy(value,0,holdString,0,value.length);
   } 
	public void setHoldString(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,holdString,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of cnt1
	 *	@return cnt1
	 */
	public int getCnt1() throws CFException {
       if (isCnt1Modified()) { 
           cnt1 = refreshCnt1();
        }
   		return cnt1;
	}
	

	
	   
	/**
	 * 	Update Cnt1 with the passed value
	 *  Corresponding COBOL Variable is WS-CNT1
	 *	@param number
	 */
	public void setCnt1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cnt1 = checkCnt1MaxLimit(number); 
		serializeCnt1(cnt1);
	}
	

	public void setCnt1(long number) {
	    number = checkCnt1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCnt1((int)number);
	}
	
	/**
	 * 	Update Cnt1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnt1(char[] value) throws CFException {
		 cnt1 = serializeCnt1(value);
	}
	/**
	 * 	Update Cnt1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCnt1String(char[] value) throws CFException {
		 setCnt1(value);
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
	 *	Returns the value of parm1
	 *	@return parm1
	 */
   public char[] getParm1() throws CFException{
   		return parm1;
   }

  
	/**
	*  set variable parm1
	*  Corresponding COBOL Variable is WS-PARM-1
	*  @param value
	**/
   public void setParm1(char[] value) {
       value = checkParm1Constraints(value);
       arraycopy(value,0,parm1,0,value.length);
   } 
	public void setParm1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parm1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of parm2
	 *	@return parm2
	 */
   public char[] getParm2() throws CFException{
   		return parm2;
   }

  
	/**
	*  set variable parm2
	*  Corresponding COBOL Variable is WS-PARM-2
	*  @param value
	**/
   public void setParm2(char[] value) {
       value = checkParm2Constraints(value);
       arraycopy(value,0,parm2,0,value.length);
   } 
	public void setParm2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parm2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of parm3
	 *	@return parm3
	 */
   public char[] getParm3() throws CFException{
   		return parm3;
   }

  
	/**
	*  set variable parm3
	*  Corresponding COBOL Variable is WS-PARM-3
	*  @param value
	**/
   public void setParm3(char[] value) {
       value = checkParm3Constraints(value);
       arraycopy(value,0,parm3,0,value.length);
   } 
	public void setParm3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parm3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of parm4
	 *	@return parm4
	 */
   public char[] getParm4() throws CFException{
   		return parm4;
   }

  
	/**
	*  set variable parm4
	*  Corresponding COBOL Variable is WS-PARM-4
	*  @param value
	**/
   public void setParm4(char[] value) {
       value = checkParm4Constraints(value);
       arraycopy(value,0,parm4,0,value.length);
   } 
	public void setParm4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parm4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of parm5
	 *	@return parm5
	 */
   public char[] getParm5() throws CFException{
   		return parm5;
   }

  
	/**
	*  set variable parm5
	*  Corresponding COBOL Variable is WS-PARM-5
	*  @param value
	**/
   public void setParm5(char[] value) {
       value = checkParm5Constraints(value);
       arraycopy(value,0,parm5,0,value.length);
   } 
	public void setParm5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parm5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of parm6
	 *	@return parm6
	 */
   public char[] getParm6() throws CFException{
   		return parm6;
   }

  
	/**
	*  set variable parm6
	*  Corresponding COBOL Variable is WS-PARM-6
	*  @param value
	**/
   public void setParm6(char[] value) {
       value = checkParm6Constraints(value);
       arraycopy(value,0,parm6,0,value.length);
   } 
	public void setParm6(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parm6,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of p1Cnt
	 *	@return p1Cnt
	 */
	public int getP1Cnt() throws CFException {
   		return p1Cnt;
	}
	
	/**
	 * 	Update P1Cnt with the passed value
	 *  Corresponding COBOL Variable is WS-P1-CNT
	 *	@param number
	 */
	public void setP1Cnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    p1Cnt = checkP1CntMaxLimit(number); 
	}


	public void setP1Cnt(long number) {
	    number = checkP1CntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setP1Cnt((int)number);
	}
	
	/**
	 *	Returns the value of p2Cnt
	 *	@return p2Cnt
	 */
	public int getP2Cnt() throws CFException {
   		return p2Cnt;
	}
	
	/**
	 * 	Update P2Cnt with the passed value
	 *  Corresponding COBOL Variable is WS-P2-CNT
	 *	@param number
	 */
	public void setP2Cnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    p2Cnt = checkP2CntMaxLimit(number); 
	}


	public void setP2Cnt(long number) {
	    number = checkP2CntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setP2Cnt((int)number);
	}
	
	/**
	 *	Returns the value of p3Cnt
	 *	@return p3Cnt
	 */
	public int getP3Cnt() throws CFException {
   		return p3Cnt;
	}
	
	/**
	 * 	Update P3Cnt with the passed value
	 *  Corresponding COBOL Variable is WS-P3-CNT
	 *	@param number
	 */
	public void setP3Cnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    p3Cnt = checkP3CntMaxLimit(number); 
	}


	public void setP3Cnt(long number) {
	    number = checkP3CntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setP3Cnt((int)number);
	}
	
	/**
	 *	Returns the value of p4Cnt
	 *	@return p4Cnt
	 */
	public int getP4Cnt() throws CFException {
   		return p4Cnt;
	}
	
	/**
	 * 	Update P4Cnt with the passed value
	 *  Corresponding COBOL Variable is WS-P4-CNT
	 *	@param number
	 */
	public void setP4Cnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    p4Cnt = checkP4CntMaxLimit(number); 
	}


	public void setP4Cnt(long number) {
	    number = checkP4CntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setP4Cnt((int)number);
	}
	
	/**
	 *	Returns the value of p5Cnt
	 *	@return p5Cnt
	 */
	public int getP5Cnt() throws CFException {
   		return p5Cnt;
	}
	
	/**
	 * 	Update P5Cnt with the passed value
	 *  Corresponding COBOL Variable is WS-P5-CNT
	 *	@param number
	 */
	public void setP5Cnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    p5Cnt = checkP5CntMaxLimit(number); 
	}


	public void setP5Cnt(long number) {
	    number = checkP5CntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setP5Cnt((int)number);
	}
	
	/**
	 *	Returns the value of p6Cnt
	 *	@return p6Cnt
	 */
	public int getP6Cnt() throws CFException {
   		return p6Cnt;
	}
	
	/**
	 * 	Update P6Cnt with the passed value
	 *  Corresponding COBOL Variable is WS-P6-CNT
	 *	@param number
	 */
	public void setP6Cnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    p6Cnt = checkP6CntMaxLimit(number); 
	}


	public void setP6Cnt(long number) {
	    number = checkP6CntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setP6Cnt((int)number);
	}
	
	/**
	 *	Returns the value of delimRec
	 *	@return delimRec
	 */
   public char[] getDelimRec() throws CFException{
   		return delimRec;
   }

  
	/**
	*  set variable delimRec
	*  Corresponding COBOL Variable is WS-DELIM-REC
	*  @param value
	**/
   public void setDelimRec(char[] value) {
       value = checkDelimRecConstraints(value);
       arraycopy(value,0,delimRec,0,value.length);
   } 
	public void setDelimRec(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,delimRec,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of len
	 *	@return len
	 */
	public short getLen() throws CFException {
   		return len;
	}
	
	/**
	 * 	Update Len with the passed value
	 *  Corresponding COBOL Variable is WS-LEN
	 *	@param number
	 */
	public void setLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    len = checkLenMaxLimit(number); 
	}

	public void setLen(int number) {
	    number = checkLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLen((short)number);
	}
	public void setLen(long number) {
	    number = checkLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLen((short)number);
	}
	

	/**
	 *	Returns the value of svcIdNoP1
	 *	@return svcIdNoP1
	 */
   public char[] getSvcIdNoP1() throws CFException{
   		return svcIdNoP1;
   }

  
	/**
	*  set variable svcIdNoP1
	*  Corresponding COBOL Variable is WS-SVC-ID-NO-P1
	*  @param value
	**/
   public void setSvcIdNoP1(char[] value) {
       value = checkSvcIdNoP1Constraints(value);
       arraycopy(value,0,svcIdNoP1,0,value.length);
   } 
	public void setSvcIdNoP1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,svcIdNoP1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of svcIdNoP2
	 *	@return svcIdNoP2
	 */
   public char[] getSvcIdNoP2() throws CFException{
   		return svcIdNoP2;
   }

  
	/**
	*  set variable svcIdNoP2
	*  Corresponding COBOL Variable is WS-SVC-ID-NO-P2
	*  @param value
	**/
   public void setSvcIdNoP2(char[] value) {
       value = checkSvcIdNoP2Constraints(value);
       arraycopy(value,0,svcIdNoP2,0,value.length);
   } 
	public void setSvcIdNoP2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,svcIdNoP2,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
