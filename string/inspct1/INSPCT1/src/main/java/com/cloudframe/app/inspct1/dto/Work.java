package com.cloudframe.app.inspct1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.inspct1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private short sub1;

								private short sub2;

								private int sub3;

								private char[] subEdt = Field.fillLowValue(9);

						private char[] searchPredicate = new char[300];

						private char[] searchPredicate2 = new char[300];

						private char[] convrtPredicate = new char[300];

						private char[] replacPredicate = new char[300];

						private char[] parm = Field.fillLowValue(30);

						private char[] counterLine = Field.fillLowValue(80);

						private char[] xmlSegment = Field.fillLowValue(80);

								private short ltCount;

								private short floatPlusCount;

								private short floatMinusCount;

								private short floatDollarCount;

								private short htmlMLength;

						private char[] lessthan = new char[1];

						private char[] greaterthan = new char[1];

						private char[] ampersand = new char[1];

						private char[] apostrophe = new char[1];

						private char[] doublquote = new char[2];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSub1((short)0);
								setSub2((short)0);
								setSub3(0);
								setSearchPredicate("12346789%123456789%123456789%123456789%1234567890                     23456789%12                                                                                                                                                                                                                           ".toCharArray());
								setSearchPredicate2("12%46%89%123456789%123456789%123456789%1234567890                     23456789%12                                                                                                                                                                                                                           ".toCharArray());
								setConvrtPredicate("12346789%123456789%123456789%123456789%1234567890                     23456789%12                                                                                                                                                                                                                           ".toCharArray());
								setReplacPredicate("12346789%123456789%123456789%123456789%1234567890                     23456789%12                                                                                                                                                                                                                           ".toCharArray());
								setLessthan(("<").toCharArray());
								setGreaterthan((">").toCharArray());
								setAmpersand(("&").toCharArray());
								setApostrophe(("'").toCharArray());
								setDoublquote(("\" ").toCharArray());
    }


 

	/**
	 *	Returns the value of sub1
	 *	@return sub1
	 */
	public short getSub1() throws CFException {
   		return sub1;
	}
	
	/**
	 * 	Update Sub1 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB1
	 *	@param number
	 */
	public void setSub1(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sub1 = checkSub1MaxLimit(number); 
	}

	public void setSub1(int number) {
	    number = checkSub1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub1((short)number);
	}
	public void setSub1(long number) {
	    number = checkSub1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub1((short)number);
	}
	

	/**
	 *	Returns the value of sub2
	 *	@return sub2
	 */
	public short getSub2() throws CFException {
   		return sub2;
	}
	
	/**
	 * 	Update Sub2 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB2
	 *	@param number
	 */
	public void setSub2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sub2 = checkSub2MaxLimit(number); 
	}

	public void setSub2(int number) {
	    number = checkSub2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub2((short)number);
	}
	public void setSub2(long number) {
	    number = checkSub2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub2((short)number);
	}
	

	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {
   		return sub3;
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB3
	 *	@param number
	 */
	public void setSub3(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sub3 = checkSub3MaxLimit(number); 
	}


	public void setSub3(long number) {
	    number = checkSub3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSub3((int)number);
	}
	
	/**
	 *	Returns the value of subEdt
	 *	@return subEdt
	 */
   public char[] getSubEdt() throws CFException{
     if (isSubEdtModified()) { 
        subEdt = refreshSubEdt();
     }
   		return subEdt;
   }

  
	/**
	*  set variable subEdt
	*  Corresponding COBOL Variable is WS-SUB-EDT
	*  @param value
	**/
   public void setSubEdt(char[] value) {
      subEdt = checkSubEdtConstraints(value);
      serializeSubEdt(subEdt);
   } 

     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSubEdt,subEdt.length);
   	
   }
   
   public void setSubEdt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSubEdt,subEdt.length);
   	
   }
   
     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSubEdt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SubEdt with another Field
	 *	@param value
	 */
   public void setSubEdt(Field source) {
       replace(source,0,source.length(),beginSubEdt,SUB_EDT_LEN);
   	
   }  
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSubEdt,SUB_EDT_LEN);
   	
   }
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSubEdt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of searchPredicate
	 *	@return searchPredicate
	 */
   public char[] getSearchPredicate() throws CFException{
   		return searchPredicate;
   }

  
	/**
	*  set variable searchPredicate
	*  Corresponding COBOL Variable is WS-SEARCH-PREDICATE
	*  @param value
	**/
   public void setSearchPredicate(char[] value) {
       value = checkSearchPredicateConstraints(value);
       arraycopy(value,0,searchPredicate,0,value.length);
   } 
	public void setSearchPredicate(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,searchPredicate,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of searchPredicate2
	 *	@return searchPredicate2
	 */
   public char[] getSearchPredicate2() throws CFException{
   		return searchPredicate2;
   }

  
	/**
	*  set variable searchPredicate2
	*  Corresponding COBOL Variable is WS-SEARCH-PREDICATE2
	*  @param value
	**/
   public void setSearchPredicate2(char[] value) {
       value = checkSearchPredicate2Constraints(value);
       arraycopy(value,0,searchPredicate2,0,value.length);
   } 
	public void setSearchPredicate2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,searchPredicate2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of convrtPredicate
	 *	@return convrtPredicate
	 */
   public char[] getConvrtPredicate() throws CFException{
   		return convrtPredicate;
   }

  
	/**
	*  set variable convrtPredicate
	*  Corresponding COBOL Variable is WS-CONVRT-PREDICATE
	*  @param value
	**/
   public void setConvrtPredicate(char[] value) {
       value = checkConvrtPredicateConstraints(value);
       arraycopy(value,0,convrtPredicate,0,value.length);
   } 
	public void setConvrtPredicate(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,convrtPredicate,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of replacPredicate
	 *	@return replacPredicate
	 */
   public char[] getReplacPredicate() throws CFException{
   		return replacPredicate;
   }

  
	/**
	*  set variable replacPredicate
	*  Corresponding COBOL Variable is WS-REPLAC-PREDICATE
	*  @param value
	**/
   public void setReplacPredicate(char[] value) {
       value = checkReplacPredicateConstraints(value);
       arraycopy(value,0,replacPredicate,0,value.length);
   } 
	public void setReplacPredicate(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,replacPredicate,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of parm
	 *	@return parm
	 */
   public char[] getParm() throws CFException{
   		return parm;
   }

  
	/**
	*  set variable parm
	*  Corresponding COBOL Variable is WS-PARM
	*  @param value
	**/
   public void setParm(char[] value) {
       value = checkParmConstraints(value);
       arraycopy(value,0,parm,0,value.length);
   } 
	public void setParm(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parm,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of counterLine
	 *	@return counterLine
	 */
   public char[] getCounterLine() throws CFException{
   		return counterLine;
   }

  
	/**
	*  set variable counterLine
	*  Corresponding COBOL Variable is COUNTER-LINE
	*  @param value
	**/
   public void setCounterLine(char[] value) {
       value = checkCounterLineConstraints(value);
       arraycopy(value,0,counterLine,0,value.length);
   } 
	public void setCounterLine(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,counterLine,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of xmlSegment
	 *	@return xmlSegment
	 */
   public char[] getXmlSegment() throws CFException{
   		return xmlSegment;
   }

  
	/**
	*  set variable xmlSegment
	*  Corresponding COBOL Variable is XML-SEGMENT
	*  @param value
	**/
   public void setXmlSegment(char[] value) {
       value = checkXmlSegmentConstraints(value);
       arraycopy(value,0,xmlSegment,0,value.length);
   } 
	public void setXmlSegment(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,xmlSegment,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ltCount
	 *	@return ltCount
	 */
	public short getLtCount() throws CFException {
   		return ltCount;
	}
	
	/**
	 * 	Update LtCount with the passed value
	 *  Corresponding COBOL Variable is WS-LT-COUNT
	 *	@param number
	 */
	public void setLtCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ltCount = checkLtCountMaxLimit(number); 
	}

	public void setLtCount(int number) {
	    number = checkLtCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLtCount((short)number);
	}
	public void setLtCount(long number) {
	    number = checkLtCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLtCount((short)number);
	}
	

	/**
	 *	Returns the value of floatPlusCount
	 *	@return floatPlusCount
	 */
	public short getFloatPlusCount() throws CFException {
   		return floatPlusCount;
	}
	
	/**
	 * 	Update FloatPlusCount with the passed value
	 *  Corresponding COBOL Variable is FLOAT-PLUS-COUNT
	 *	@param number
	 */
	public void setFloatPlusCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    floatPlusCount = checkFloatPlusCountMaxLimit(number); 
	}

	public void setFloatPlusCount(int number) {
	    number = checkFloatPlusCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFloatPlusCount((short)number);
	}
	public void setFloatPlusCount(long number) {
	    number = checkFloatPlusCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFloatPlusCount((short)number);
	}
	

	/**
	 *	Returns the value of floatMinusCount
	 *	@return floatMinusCount
	 */
	public short getFloatMinusCount() throws CFException {
   		return floatMinusCount;
	}
	
	/**
	 * 	Update FloatMinusCount with the passed value
	 *  Corresponding COBOL Variable is FLOAT-MINUS-COUNT
	 *	@param number
	 */
	public void setFloatMinusCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    floatMinusCount = checkFloatMinusCountMaxLimit(number); 
	}

	public void setFloatMinusCount(int number) {
	    number = checkFloatMinusCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFloatMinusCount((short)number);
	}
	public void setFloatMinusCount(long number) {
	    number = checkFloatMinusCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFloatMinusCount((short)number);
	}
	

	/**
	 *	Returns the value of floatDollarCount
	 *	@return floatDollarCount
	 */
	public short getFloatDollarCount() throws CFException {
   		return floatDollarCount;
	}
	
	/**
	 * 	Update FloatDollarCount with the passed value
	 *  Corresponding COBOL Variable is FLOAT-DOLLAR-COUNT
	 *	@param number
	 */
	public void setFloatDollarCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    floatDollarCount = checkFloatDollarCountMaxLimit(number); 
	}

	public void setFloatDollarCount(int number) {
	    number = checkFloatDollarCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFloatDollarCount((short)number);
	}
	public void setFloatDollarCount(long number) {
	    number = checkFloatDollarCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFloatDollarCount((short)number);
	}
	

	/**
	 *	Returns the value of htmlMLength
	 *	@return htmlMLength
	 */
	public short getHtmlMLength() throws CFException {
   		return htmlMLength;
	}
	
	/**
	 * 	Update HtmlMLength with the passed value
	 *  Corresponding COBOL Variable is WS-HTML-M-LENGTH
	 *	@param number
	 */
	public void setHtmlMLength(short number) {
	     // Truncate if the number is beyond +/- Max range
	    htmlMLength = checkHtmlMLengthMaxLimit(number); 
	}

	public void setHtmlMLength(int number) {
	    number = checkHtmlMLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHtmlMLength((short)number);
	}
	public void setHtmlMLength(long number) {
	    number = checkHtmlMLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHtmlMLength((short)number);
	}
	

	/**
	 *	Returns the value of lessthan
	 *	@return lessthan
	 */
   public char[] getLessthan() throws CFException{
   		return lessthan;
   }

  
	/**
	*  set variable lessthan
	*  Corresponding COBOL Variable is LESSTHAN
	*  @param value
	**/
   public void setLessthan(char[] value) {
       value = checkLessthanConstraints(value);
       arraycopy(value,0,lessthan,0,value.length);
   } 
	public void setLessthan(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lessthan,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of greaterthan
	 *	@return greaterthan
	 */
   public char[] getGreaterthan() throws CFException{
   		return greaterthan;
   }

  
	/**
	*  set variable greaterthan
	*  Corresponding COBOL Variable is GREATERTHAN
	*  @param value
	**/
   public void setGreaterthan(char[] value) {
       value = checkGreaterthanConstraints(value);
       arraycopy(value,0,greaterthan,0,value.length);
   } 
	public void setGreaterthan(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,greaterthan,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ampersand
	 *	@return ampersand
	 */
   public char[] getAmpersand() throws CFException{
   		return ampersand;
   }

  
	/**
	*  set variable ampersand
	*  Corresponding COBOL Variable is AMPERSAND
	*  @param value
	**/
   public void setAmpersand(char[] value) {
       value = checkAmpersandConstraints(value);
       arraycopy(value,0,ampersand,0,value.length);
   } 
	public void setAmpersand(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ampersand,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of apostrophe
	 *	@return apostrophe
	 */
   public char[] getApostrophe() throws CFException{
   		return apostrophe;
   }

  
	/**
	*  set variable apostrophe
	*  Corresponding COBOL Variable is APOSTROPHE
	*  @param value
	**/
   public void setApostrophe(char[] value) {
       value = checkApostropheConstraints(value);
       arraycopy(value,0,apostrophe,0,value.length);
   } 
	public void setApostrophe(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,apostrophe,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of doublquote
	 *	@return doublquote
	 */
   public char[] getDoublquote() throws CFException{
   		return doublquote;
   }

  
	/**
	*  set variable doublquote
	*  Corresponding COBOL Variable is DOUBLQUOTE
	*  @param value
	**/
   public void setDoublquote(char[] value) {
       value = checkDoublquoteConstraints(value);
       arraycopy(value,0,doublquote,0,value.length);
   } 
	public void setDoublquote(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,doublquote,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
