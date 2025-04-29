package com.cloudframe.app.init1.dto;

/**
*  The class WscdlCalDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WscdlCalDate extends WscdlCalDateSerialized {
   

								private int wcdliBlCycNo;

								private int wcdliCurMm;

								private int wcdliCurYyyy;

						private char[] wcdliPrevCycDtInd = new char[1];

						private char[] wcdliNextCycDtInd = new char[1];
				private WcdloCycStartDt wcdloCycStartDt = new WcdloCycStartDt();
				private WcdloCycEndDt wcdloCycEndDt = new WcdloCycEndDt();
				private WcdloDateChar wcdloDateChar = new WcdloDateChar();

								private long wcdloStartDateIso;

								private long wcdloEndDateIso;
				private WcdloDateTable wcdloDateTable = new WcdloDateTable();

								private int wcdloHoldCurMm;

								private int wcdloHoldCurYyyy;

						private char[] wcdloHoldStartDt = new char[10];

								private long wcdloHoldStartDtIso;

						private char[] wcdloHoldEndDt = new char[10];

								private long wcdloHoldEndDtIso;

								private BigDecimal wcdloLeapYear = BigDecimal.ZERO;

						private char[] wcdloLeapYearSw = new char[1];

						private char[] wcdloValidationRsn = new char[1];

								private int wcdloValidCycles;

								private int wcdloValidMonths;

								private int wcdloCurMm;
	
	/**
	* Constructor for WscdlCalDate
	**/
    public WscdlCalDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wcdloCycStartDt.setParent(this,getStartOffset() + 10);
	       			wcdloCycEndDt.setParent(this,getStartOffset() + 20);
	       			wcdloDateChar.setParent(this,getStartOffset() + 30);
	       			wcdloDateTable.setParent(this,getStartOffset() + 90);
	   	/*  end of offset */
								setWcdliBlCycNo(0);
								setWcdliCurMm(0);
								setWcdliCurYyyy(0);
								setWcdliPrevCycDtInd(fillSpace(1));
								setWcdliNextCycDtInd(fillSpace(1));
								setWcdloHoldCurMm(0);
								setWcdloHoldCurYyyy(0);
								setWcdloHoldStartDt(fillSpace(10));
								setWcdloHoldStartDtIso(0L);
								setWcdloHoldEndDt(fillSpace(10));
								setWcdloHoldEndDtIso(0L);
								setWcdloLeapYear(BigDecimal.ZERO);
								setWcdloLeapYearSw(fillSpace(1));
								setWcdloValidationRsn(fillSpace(1));
								setWcdloValidCycles(0);
								setWcdloValidMonths(0);
								setWcdloCurMm(0);
    }


 

	/**
	 *	Returns the value of wcdliBlCycNo
	 *	@return wcdliBlCycNo
	 */
	public int getWcdliBlCycNo() throws CFException {
       if (isWcdliBlCycNoModified()) { 
           wcdliBlCycNo = refreshWcdliBlCycNo();
        }
   		return wcdliBlCycNo;
	}
	

	
	   
	/**
	 * 	Update WcdliBlCycNo with the passed value
	 *  Corresponding COBOL Variable is WCDLI-BL-CYC-NO
	 *	@param number
	 */
	public void setWcdliBlCycNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdliBlCycNo = checkWcdliBlCycNoMaxLimit(number); 
		serializeWcdliBlCycNo(wcdliBlCycNo);
	}
	

	public void setWcdliBlCycNo(long number) {
	    number = checkWcdliBlCycNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdliBlCycNo((int)number);
	}
	
	/**
	 * 	Update WcdliBlCycNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdliBlCycNo(char[] value) throws CFException {
		 wcdliBlCycNo = serializeWcdliBlCycNo(value);
	}
	/**
	 * 	Update WcdliBlCycNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdliBlCycNoString(char[] value) throws CFException {
		 setWcdliBlCycNo(value);
	}
	/**
	 *	Returns the value of wcdliCurMm
	 *	@return wcdliCurMm
	 */
	public int getWcdliCurMm() throws CFException {
       if (isWcdliCurMmModified()) { 
           wcdliCurMm = refreshWcdliCurMm();
        }
   		return wcdliCurMm;
	}
	

	
	   
	/**
	 * 	Update WcdliCurMm with the passed value
	 *  Corresponding COBOL Variable is WCDLI-CUR-MM
	 *	@param number
	 */
	public void setWcdliCurMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdliCurMm = checkWcdliCurMmMaxLimit(number); 
		serializeWcdliCurMm(wcdliCurMm);
	}
	

	public void setWcdliCurMm(long number) {
	    number = checkWcdliCurMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdliCurMm((int)number);
	}
	
	/**
	 * 	Update WcdliCurMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdliCurMm(char[] value) throws CFException {
		 wcdliCurMm = serializeWcdliCurMm(value);
	}
	/**
	 * 	Update WcdliCurMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdliCurMmString(char[] value) throws CFException {
		 setWcdliCurMm(value);
	}
	
	/**
	 *	Test condition 1 3 5 7 8 10 12 for isMonthWith31Days()
	 *	@return  Returns true if isMonthWith31Days() is 1 3 5 7 8 10 12
	 */
   public boolean isMonthWith31Days() throws CFException {
      return (  getWcdliCurMm()  ==  1  ||  getWcdliCurMm()  ==  3  ||  getWcdliCurMm()  ==  5  ||  getWcdliCurMm()  ==  7  ||  getWcdliCurMm()  ==  8  ||  getWcdliCurMm()  ==  10  ||  getWcdliCurMm()  ==  12  );
   }


	/**
	*  set values 1 3 5 7 8 10 12
	*/
   	public void setMonthWith31DaysTrue() {  			
    	setWcdliCurMm( 1);
   	}
	
	/**
	 *	Test condition 4 6 9 11 for isMonthWith30Days()
	 *	@return  Returns true if isMonthWith30Days() is 4 6 9 11
	 */
   public boolean isMonthWith30Days() throws CFException {
      return (  getWcdliCurMm()  ==  4  ||  getWcdliCurMm()  ==  6  ||  getWcdliCurMm()  ==  9  ||  getWcdliCurMm()  ==  11  );
   }


	/**
	*  set values 4 6 9 11
	*/
   	public void setMonthWith30DaysTrue() {  			
    	setWcdliCurMm( 4);
   	}
	
	/**
	 *	Test condition 2 for isMonthLess30Days()
	 *	@return  Returns true if isMonthLess30Days() is 2
	 */
   public boolean isMonthLess30Days() throws CFException {
      return (  getWcdliCurMm()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setMonthLess30DaysTrue() {  			
    	setWcdliCurMm( 2);
   	}
	/**
	 *	Returns the value of wcdliCurYyyy
	 *	@return wcdliCurYyyy
	 */
	public int getWcdliCurYyyy() throws CFException {
       if (isWcdliCurYyyyModified()) { 
           wcdliCurYyyy = refreshWcdliCurYyyy();
        }
   		return wcdliCurYyyy;
	}
	

	
	   
	/**
	 * 	Update WcdliCurYyyy with the passed value
	 *  Corresponding COBOL Variable is WCDLI-CUR-YYYY
	 *	@param number
	 */
	public void setWcdliCurYyyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdliCurYyyy = checkWcdliCurYyyyMaxLimit(number); 
		serializeWcdliCurYyyy(wcdliCurYyyy);
	}
	

	public void setWcdliCurYyyy(long number) {
	    number = checkWcdliCurYyyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdliCurYyyy((int)number);
	}
	
	/**
	 * 	Update WcdliCurYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdliCurYyyy(char[] value) throws CFException {
		 wcdliCurYyyy = serializeWcdliCurYyyy(value);
	}
	/**
	 * 	Update WcdliCurYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdliCurYyyyString(char[] value) throws CFException {
		 setWcdliCurYyyy(value);
	}
	/**
	 *	Returns the value of wcdliPrevCycDtInd
	 *	@return wcdliPrevCycDtInd
	 */
   public char[] getWcdliPrevCycDtInd() throws CFException{
     if (isWcdliPrevCycDtIndModified()) { 
        wcdliPrevCycDtInd = refreshWcdliPrevCycDtInd();
     }
   		return wcdliPrevCycDtInd;
   }

  
	/**
	*  set variable wcdliPrevCycDtInd
	*  Corresponding COBOL Variable is WCDLI-PREV-CYC-DT-IND
	*  @param value
	**/
   public void setWcdliPrevCycDtInd(char[] value) {
      wcdliPrevCycDtInd = checkWcdliPrevCycDtIndConstraints(value);
      serializeWcdliPrevCycDtInd(wcdliPrevCycDtInd);
   } 

     /**
	 * 	Update WcdliPrevCycDtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWcdliPrevCycDtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWcdliPrevCycDtInd,wcdliPrevCycDtInd.length);
   	
   }
   
   public void setWcdliPrevCycDtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWcdliPrevCycDtInd,wcdliPrevCycDtInd.length);
   	
   }
   
     /**
	 * 	Update WcdliPrevCycDtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdliPrevCycDtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdliPrevCycDtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WcdliPrevCycDtInd with another Field
	 *	@param value
	 */
   public void setWcdliPrevCycDtInd(Field source) {
       replace(source,0,source.length(),beginWcdliPrevCycDtInd,WCDLI_PREV_CYC_DT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update WcdliPrevCycDtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWcdliPrevCycDtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWcdliPrevCycDtInd,WCDLI_PREV_CYC_DT_IND_LEN);
   	
   }
   
     /**
	 * 	Update WcdliPrevCycDtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdliPrevCycDtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdliPrevCycDtInd+targetIndex,targetLen);
    
   }
	char[] wcdliPrevCycDtYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isWcdliPrevCycDtYes()
	 *	@return  Returns true if isWcdliPrevCycDtYes() is "Y"
	 */
   public boolean isWcdliPrevCycDtYes() throws CFException {
      return (  compareChars( getWcdliPrevCycDtInd() , wcdliPrevCycDtYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setWcdliPrevCycDtYesTrue() {  			
    	setWcdliPrevCycDtInd( wcdliPrevCycDtYes88Value);
   	}
	/**
	 *	Returns the value of wcdliNextCycDtInd
	 *	@return wcdliNextCycDtInd
	 */
   public char[] getWcdliNextCycDtInd() throws CFException{
     if (isWcdliNextCycDtIndModified()) { 
        wcdliNextCycDtInd = refreshWcdliNextCycDtInd();
     }
   		return wcdliNextCycDtInd;
   }

  
	/**
	*  set variable wcdliNextCycDtInd
	*  Corresponding COBOL Variable is WCDLI-NEXT-CYC-DT-IND
	*  @param value
	**/
   public void setWcdliNextCycDtInd(char[] value) {
      wcdliNextCycDtInd = checkWcdliNextCycDtIndConstraints(value);
      serializeWcdliNextCycDtInd(wcdliNextCycDtInd);
   } 

     /**
	 * 	Update WcdliNextCycDtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWcdliNextCycDtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWcdliNextCycDtInd,wcdliNextCycDtInd.length);
   	
   }
   
   public void setWcdliNextCycDtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWcdliNextCycDtInd,wcdliNextCycDtInd.length);
   	
   }
   
     /**
	 * 	Update WcdliNextCycDtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdliNextCycDtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdliNextCycDtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WcdliNextCycDtInd with another Field
	 *	@param value
	 */
   public void setWcdliNextCycDtInd(Field source) {
       replace(source,0,source.length(),beginWcdliNextCycDtInd,WCDLI_NEXT_CYC_DT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update WcdliNextCycDtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWcdliNextCycDtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWcdliNextCycDtInd,WCDLI_NEXT_CYC_DT_IND_LEN);
   	
   }
   
     /**
	 * 	Update WcdliNextCycDtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdliNextCycDtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdliNextCycDtInd+targetIndex,targetLen);
    
   }
	char[] wcdliNextCycDtYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isWcdliNextCycDtYes()
	 *	@return  Returns true if isWcdliNextCycDtYes() is "Y"
	 */
   public boolean isWcdliNextCycDtYes() throws CFException {
      return (  compareChars( getWcdliNextCycDtInd() , wcdliNextCycDtYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setWcdliNextCycDtYesTrue() {  			
    	setWcdliNextCycDtInd( wcdliNextCycDtYes88Value);
   	}
	/**
	 *	Returns the value of wcdloCycStartDt
	 *	@return wcdloCycStartDt
	 */   
	 public WcdloCycStartDt getWcdloCycStartDt() {
   	return wcdloCycStartDt;
   }
   /**
	* 	Update WcdloCycStartDt with the passed value
	*   Corresponding COBOL Variable is WCDLO-CYC-START-DT
	*	@param value
	*/
   public void setWcdloCycStartDt(char[] value) {
      wcdloCycStartDt.setString(value); 
   }   
    
     /**
	 * 	Update WcdloCycStartDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcdloCycStartDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloCycStartDt.begin,wcdloCycStartDt.length());
   }
   
     /**
	 * 	Update WcdloCycStartDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloCycStartDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloCycStartDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcdloCycStartDt with another Field
	 *	@param value
	 */
   public void setWcdloCycStartDt(Field source) {
   	replace(source,0,source.length(),wcdloCycStartDt.begin,wcdloCycStartDt.length());
   }  
   
     /**
	 * 	Update WcdloCycStartDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcdloCycStartDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloCycStartDt.begin,wcdloCycStartDt.length());
   }
   
     /**
	 * 	Update WcdloCycStartDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloCycStartDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloCycStartDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcdloCycEndDt
	 *	@return wcdloCycEndDt
	 */   
	 public WcdloCycEndDt getWcdloCycEndDt() {
   	return wcdloCycEndDt;
   }
   /**
	* 	Update WcdloCycEndDt with the passed value
	*   Corresponding COBOL Variable is WCDLO-CYC-END-DT
	*	@param value
	*/
   public void setWcdloCycEndDt(char[] value) {
      wcdloCycEndDt.setString(value); 
   }   
    
     /**
	 * 	Update WcdloCycEndDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcdloCycEndDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloCycEndDt.begin,wcdloCycEndDt.length());
   }
   
     /**
	 * 	Update WcdloCycEndDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloCycEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloCycEndDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcdloCycEndDt with another Field
	 *	@param value
	 */
   public void setWcdloCycEndDt(Field source) {
   	replace(source,0,source.length(),wcdloCycEndDt.begin,wcdloCycEndDt.length());
   }  
   
     /**
	 * 	Update WcdloCycEndDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcdloCycEndDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloCycEndDt.begin,wcdloCycEndDt.length());
   }
   
     /**
	 * 	Update WcdloCycEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloCycEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloCycEndDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcdloDateChar
	 *	@return wcdloDateChar
	 */   
	 public WcdloDateChar getWcdloDateChar() {
   	return wcdloDateChar;
   }
   /**
	* 	Update WcdloDateChar with the passed value
	*   Corresponding COBOL Variable is WCDLO-DATE-CHAR
	*	@param value
	*/
   public void setWcdloDateChar(char[] value) {
      wcdloDateChar.setString(value); 
   }   
    
     /**
	 * 	Update WcdloDateChar 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcdloDateChar(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloDateChar.begin,wcdloDateChar.length());
   }
   
     /**
	 * 	Update WcdloDateChar 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloDateChar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloDateChar.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcdloDateChar with another Field
	 *	@param value
	 */
   public void setWcdloDateChar(Field source) {
   	replace(source,0,source.length(),wcdloDateChar.begin,wcdloDateChar.length());
   }  
   
     /**
	 * 	Update WcdloDateChar 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcdloDateChar(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloDateChar.begin,wcdloDateChar.length());
   }
   
     /**
	 * 	Update WcdloDateChar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloDateChar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloDateChar.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcdloStartDateIso
	 *	@return wcdloStartDateIso
	 */
	public long getWcdloStartDateIso() throws CFException {
       if (isWcdloStartDateIsoModified()) { 
           wcdloStartDateIso = refreshWcdloStartDateIso();
        }
   		return wcdloStartDateIso;
	}
	

	
	   
	/**
	 * 	Update WcdloStartDateIso with the passed value
	 *  Corresponding COBOL Variable is WCDLO-START-DATE-ISO
	 *	@param number
	 */
	public void setWcdloStartDateIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloStartDateIso = checkWcdloStartDateIsoMaxLimit(number); 
		serializeWcdloStartDateIso(wcdloStartDateIso);
	}
	

	/**
	 * 	Update WcdloStartDateIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDateIso(char[] value) throws CFException {
		 wcdloStartDateIso = serializeWcdloStartDateIso(value);
	}
	/**
	 * 	Update WcdloStartDateIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDateIsoString(char[] value) throws CFException {
		 setWcdloStartDateIso(value);
	}
	/**
	 *	Returns the value of wcdloEndDateIso
	 *	@return wcdloEndDateIso
	 */
	public long getWcdloEndDateIso() throws CFException {
       if (isWcdloEndDateIsoModified()) { 
           wcdloEndDateIso = refreshWcdloEndDateIso();
        }
   		return wcdloEndDateIso;
	}
	

	
	   
	/**
	 * 	Update WcdloEndDateIso with the passed value
	 *  Corresponding COBOL Variable is WCDLO-END-DATE-ISO
	 *	@param number
	 */
	public void setWcdloEndDateIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloEndDateIso = checkWcdloEndDateIsoMaxLimit(number); 
		serializeWcdloEndDateIso(wcdloEndDateIso);
	}
	

	/**
	 * 	Update WcdloEndDateIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDateIso(char[] value) throws CFException {
		 wcdloEndDateIso = serializeWcdloEndDateIso(value);
	}
	/**
	 * 	Update WcdloEndDateIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDateIsoString(char[] value) throws CFException {
		 setWcdloEndDateIso(value);
	}
	/**
	 *	Returns the value of wcdloDateTable
	 *	@return wcdloDateTable
	 */   
	 public WcdloDateTable getWcdloDateTable() {
   	return wcdloDateTable;
   }
   /**
	* 	Update WcdloDateTable with the passed value
	*   Corresponding COBOL Variable is WCDLO-DATE-TABLE
	*	@param value
	*/
   public void setWcdloDateTable(char[] value) {
      wcdloDateTable.setString(value); 
   }   
    
     /**
	 * 	Update WcdloDateTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcdloDateTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloDateTable.begin,wcdloDateTable.length());
   }
   
     /**
	 * 	Update WcdloDateTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloDateTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloDateTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcdloDateTable with another Field
	 *	@param value
	 */
   public void setWcdloDateTable(Field source) {
   	replace(source,0,source.length(),wcdloDateTable.begin,wcdloDateTable.length());
   }  
   
     /**
	 * 	Update WcdloDateTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcdloDateTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloDateTable.begin,wcdloDateTable.length());
   }
   
     /**
	 * 	Update WcdloDateTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloDateTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloDateTable.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcdloHoldCurMm
	 *	@return wcdloHoldCurMm
	 */
	public int getWcdloHoldCurMm() throws CFException {
       if (isWcdloHoldCurMmModified()) { 
           wcdloHoldCurMm = refreshWcdloHoldCurMm();
        }
   		return wcdloHoldCurMm;
	}
	

	
	   
	/**
	 * 	Update WcdloHoldCurMm with the passed value
	 *  Corresponding COBOL Variable is WCDLO-HOLD-CUR-MM
	 *	@param number
	 */
	public void setWcdloHoldCurMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloHoldCurMm = checkWcdloHoldCurMmMaxLimit(number); 
		serializeWcdloHoldCurMm(wcdloHoldCurMm);
	}
	

	public void setWcdloHoldCurMm(long number) {
	    number = checkWcdloHoldCurMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloHoldCurMm((int)number);
	}
	
	/**
	 * 	Update WcdloHoldCurMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloHoldCurMm(char[] value) throws CFException {
		 wcdloHoldCurMm = serializeWcdloHoldCurMm(value);
	}
	/**
	 * 	Update WcdloHoldCurMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloHoldCurMmString(char[] value) throws CFException {
		 setWcdloHoldCurMm(value);
	}
	/**
	 *	Returns the value of wcdloHoldCurYyyy
	 *	@return wcdloHoldCurYyyy
	 */
	public int getWcdloHoldCurYyyy() throws CFException {
       if (isWcdloHoldCurYyyyModified()) { 
           wcdloHoldCurYyyy = refreshWcdloHoldCurYyyy();
        }
   		return wcdloHoldCurYyyy;
	}
	

	
	   
	/**
	 * 	Update WcdloHoldCurYyyy with the passed value
	 *  Corresponding COBOL Variable is WCDLO-HOLD-CUR-YYYY
	 *	@param number
	 */
	public void setWcdloHoldCurYyyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloHoldCurYyyy = checkWcdloHoldCurYyyyMaxLimit(number); 
		serializeWcdloHoldCurYyyy(wcdloHoldCurYyyy);
	}
	

	public void setWcdloHoldCurYyyy(long number) {
	    number = checkWcdloHoldCurYyyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloHoldCurYyyy((int)number);
	}
	
	/**
	 * 	Update WcdloHoldCurYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloHoldCurYyyy(char[] value) throws CFException {
		 wcdloHoldCurYyyy = serializeWcdloHoldCurYyyy(value);
	}
	/**
	 * 	Update WcdloHoldCurYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloHoldCurYyyyString(char[] value) throws CFException {
		 setWcdloHoldCurYyyy(value);
	}
	/**
	 *	Returns the value of wcdloHoldStartDt
	 *	@return wcdloHoldStartDt
	 */
   public char[] getWcdloHoldStartDt() throws CFException{
     if (isWcdloHoldStartDtModified()) { 
        wcdloHoldStartDt = refreshWcdloHoldStartDt();
     }
   		return wcdloHoldStartDt;
   }

  
	/**
	*  set variable wcdloHoldStartDt
	*  Corresponding COBOL Variable is WCDLO-HOLD-START-DT
	*  @param value
	**/
   public void setWcdloHoldStartDt(char[] value) {
      wcdloHoldStartDt = checkWcdloHoldStartDtConstraints(value);
      serializeWcdloHoldStartDt(wcdloHoldStartDt);
   } 

     /**
	 * 	Update WcdloHoldStartDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWcdloHoldStartDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWcdloHoldStartDt,wcdloHoldStartDt.length);
   	
   }
   
   public void setWcdloHoldStartDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloHoldStartDt,wcdloHoldStartDt.length);
   	
   }
   
     /**
	 * 	Update WcdloHoldStartDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloHoldStartDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloHoldStartDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WcdloHoldStartDt with another Field
	 *	@param value
	 */
   public void setWcdloHoldStartDt(Field source) {
       replace(source,0,source.length(),beginWcdloHoldStartDt,WCDLO_HOLD_START_DT_LEN);
   	
   }  
   
     /**
	 * 	Update WcdloHoldStartDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWcdloHoldStartDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWcdloHoldStartDt,WCDLO_HOLD_START_DT_LEN);
   	
   }
   
     /**
	 * 	Update WcdloHoldStartDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloHoldStartDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloHoldStartDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wcdloHoldStartDtIso
	 *	@return wcdloHoldStartDtIso
	 */
	public long getWcdloHoldStartDtIso() throws CFException {
       if (isWcdloHoldStartDtIsoModified()) { 
           wcdloHoldStartDtIso = refreshWcdloHoldStartDtIso();
        }
   		return wcdloHoldStartDtIso;
	}
	

	
	   
	/**
	 * 	Update WcdloHoldStartDtIso with the passed value
	 *  Corresponding COBOL Variable is WCDLO-HOLD-START-DT-ISO
	 *	@param number
	 */
	public void setWcdloHoldStartDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloHoldStartDtIso = checkWcdloHoldStartDtIsoMaxLimit(number); 
		serializeWcdloHoldStartDtIso(wcdloHoldStartDtIso);
	}
	

	/**
	 * 	Update WcdloHoldStartDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloHoldStartDtIso(char[] value) throws CFException {
		 wcdloHoldStartDtIso = serializeWcdloHoldStartDtIso(value);
	}
	/**
	 * 	Update WcdloHoldStartDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloHoldStartDtIsoString(char[] value) throws CFException {
		 setWcdloHoldStartDtIso(value);
	}
	/**
	 *	Returns the value of wcdloHoldEndDt
	 *	@return wcdloHoldEndDt
	 */
   public char[] getWcdloHoldEndDt() throws CFException{
     if (isWcdloHoldEndDtModified()) { 
        wcdloHoldEndDt = refreshWcdloHoldEndDt();
     }
   		return wcdloHoldEndDt;
   }

  
	/**
	*  set variable wcdloHoldEndDt
	*  Corresponding COBOL Variable is WCDLO-HOLD-END-DT
	*  @param value
	**/
   public void setWcdloHoldEndDt(char[] value) {
      wcdloHoldEndDt = checkWcdloHoldEndDtConstraints(value);
      serializeWcdloHoldEndDt(wcdloHoldEndDt);
   } 

     /**
	 * 	Update WcdloHoldEndDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWcdloHoldEndDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWcdloHoldEndDt,wcdloHoldEndDt.length);
   	
   }
   
   public void setWcdloHoldEndDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloHoldEndDt,wcdloHoldEndDt.length);
   	
   }
   
     /**
	 * 	Update WcdloHoldEndDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloHoldEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloHoldEndDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WcdloHoldEndDt with another Field
	 *	@param value
	 */
   public void setWcdloHoldEndDt(Field source) {
       replace(source,0,source.length(),beginWcdloHoldEndDt,WCDLO_HOLD_END_DT_LEN);
   	
   }  
   
     /**
	 * 	Update WcdloHoldEndDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWcdloHoldEndDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWcdloHoldEndDt,WCDLO_HOLD_END_DT_LEN);
   	
   }
   
     /**
	 * 	Update WcdloHoldEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloHoldEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloHoldEndDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wcdloHoldEndDtIso
	 *	@return wcdloHoldEndDtIso
	 */
	public long getWcdloHoldEndDtIso() throws CFException {
       if (isWcdloHoldEndDtIsoModified()) { 
           wcdloHoldEndDtIso = refreshWcdloHoldEndDtIso();
        }
   		return wcdloHoldEndDtIso;
	}
	

	
	   
	/**
	 * 	Update WcdloHoldEndDtIso with the passed value
	 *  Corresponding COBOL Variable is WCDLO-HOLD-END-DT-ISO
	 *	@param number
	 */
	public void setWcdloHoldEndDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloHoldEndDtIso = checkWcdloHoldEndDtIsoMaxLimit(number); 
		serializeWcdloHoldEndDtIso(wcdloHoldEndDtIso);
	}
	

	/**
	 * 	Update WcdloHoldEndDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloHoldEndDtIso(char[] value) throws CFException {
		 wcdloHoldEndDtIso = serializeWcdloHoldEndDtIso(value);
	}
	/**
	 * 	Update WcdloHoldEndDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloHoldEndDtIsoString(char[] value) throws CFException {
		 setWcdloHoldEndDtIso(value);
	}
	/**
	 *	Returns the value of wcdloLeapYear
	 *	@return wcdloLeapYear
	 */
	public BigDecimal getWcdloLeapYear() throws CFException {
       if (isWcdloLeapYearModified()) { 
           wcdloLeapYear = refreshWcdloLeapYear();
        }
   		return wcdloLeapYear;
	}
	

	
	   
	/**
	 * 	Update WcdloLeapYear with the passed number
	 *  Corresponding COBOL Variable is WCDLO-LEAP-YEAR
	 *	@param number
	 */
	public void setWcdloLeapYear(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       wcdloLeapYear = checkWcdloLeapYearMaxLimit(number);
	    serializeWcdloLeapYear(wcdloLeapYear);
   }
	/**
	 * 	Update WcdloLeapYear with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloLeapYear(char[] value) throws CFException {
		 wcdloLeapYear = serializeWcdloLeapYear(value);
	}   
	/**
	 *	Returns the value of wcdloLeapYearSw
	 *	@return wcdloLeapYearSw
	 */
   public char[] getWcdloLeapYearSw() throws CFException{
     if (isWcdloLeapYearSwModified()) { 
        wcdloLeapYearSw = refreshWcdloLeapYearSw();
     }
   		return wcdloLeapYearSw;
   }

  
	/**
	*  set variable wcdloLeapYearSw
	*  Corresponding COBOL Variable is WCDLO-LEAP-YEAR-SW
	*  @param value
	**/
   public void setWcdloLeapYearSw(char[] value) {
      wcdloLeapYearSw = checkWcdloLeapYearSwConstraints(value);
      serializeWcdloLeapYearSw(wcdloLeapYearSw);
   } 

     /**
	 * 	Update WcdloLeapYearSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWcdloLeapYearSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWcdloLeapYearSw,wcdloLeapYearSw.length);
   	
   }
   
   public void setWcdloLeapYearSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloLeapYearSw,wcdloLeapYearSw.length);
   	
   }
   
     /**
	 * 	Update WcdloLeapYearSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloLeapYearSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloLeapYearSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WcdloLeapYearSw with another Field
	 *	@param value
	 */
   public void setWcdloLeapYearSw(Field source) {
       replace(source,0,source.length(),beginWcdloLeapYearSw,WCDLO_LEAP_YEAR_SW_LEN);
   	
   }  
   
     /**
	 * 	Update WcdloLeapYearSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWcdloLeapYearSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWcdloLeapYearSw,WCDLO_LEAP_YEAR_SW_LEN);
   	
   }
   
     /**
	 * 	Update WcdloLeapYearSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloLeapYearSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloLeapYearSw+targetIndex,targetLen);
    
   }
	char[] leapYearYes88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isLeapYearYes()
	 *	@return  Returns true if isLeapYearYes() is "Y"
	 */
   public boolean isLeapYearYes() throws CFException {
      return (  compareChars( getWcdloLeapYearSw() , leapYearYes88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setLeapYearYesTrue() {  			
    	setWcdloLeapYearSw( leapYearYes88Value);
   	}
	char[] leapYearNo88Value = " ".toCharArray();
	/**
	 *	Test condition " " for isLeapYearNo()
	 *	@return  Returns true if isLeapYearNo() is " "
	 */
   public boolean isLeapYearNo() throws CFException {
      return (  compareChars( getWcdloLeapYearSw() , leapYearNo88Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setLeapYearNoTrue() {  			
    	setWcdloLeapYearSw( leapYearNo88Value);
   	}
	/**
	 *	Returns the value of wcdloValidationRsn
	 *	@return wcdloValidationRsn
	 */
   public char[] getWcdloValidationRsn() throws CFException{
     if (isWcdloValidationRsnModified()) { 
        wcdloValidationRsn = refreshWcdloValidationRsn();
     }
   		return wcdloValidationRsn;
   }

  
	/**
	*  set variable wcdloValidationRsn
	*  Corresponding COBOL Variable is WCDLO-VALIDATION-RSN
	*  @param value
	**/
   public void setWcdloValidationRsn(char[] value) {
      wcdloValidationRsn = checkWcdloValidationRsnConstraints(value);
      serializeWcdloValidationRsn(wcdloValidationRsn);
   } 

     /**
	 * 	Update WcdloValidationRsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWcdloValidationRsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWcdloValidationRsn,wcdloValidationRsn.length);
   	
   }
   
   public void setWcdloValidationRsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloValidationRsn,wcdloValidationRsn.length);
   	
   }
   
     /**
	 * 	Update WcdloValidationRsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloValidationRsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloValidationRsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WcdloValidationRsn with another Field
	 *	@param value
	 */
   public void setWcdloValidationRsn(Field source) {
       replace(source,0,source.length(),beginWcdloValidationRsn,WCDLO_VALIDATION_RSN_LEN);
   	
   }  
   
     /**
	 * 	Update WcdloValidationRsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWcdloValidationRsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWcdloValidationRsn,WCDLO_VALIDATION_RSN_LEN);
   	
   }
   
     /**
	 * 	Update WcdloValidationRsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloValidationRsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWcdloValidationRsn+targetIndex,targetLen);
    
   }
	char[] invalidMonth88Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isInvalidMonth()
	 *	@return  Returns true if isInvalidMonth() is "M"
	 */
   public boolean isInvalidMonth() throws CFException {
      return (  compareChars( getWcdloValidationRsn() , invalidMonth88Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setInvalidMonthTrue() {  			
    	setWcdloValidationRsn( invalidMonth88Value);
   	}
	char[] invalidBlCycNo88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isInvalidBlCycNo()
	 *	@return  Returns true if isInvalidBlCycNo() is "C"
	 */
   public boolean isInvalidBlCycNo() throws CFException {
      return (  compareChars( getWcdloValidationRsn() , invalidBlCycNo88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setInvalidBlCycNoTrue() {  			
    	setWcdloValidationRsn( invalidBlCycNo88Value);
   	}
	char[] invalidYear88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isInvalidYear()
	 *	@return  Returns true if isInvalidYear() is "Y"
	 */
   public boolean isInvalidYear() throws CFException {
      return (  compareChars( getWcdloValidationRsn() , invalidYear88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setInvalidYearTrue() {  			
    	setWcdloValidationRsn( invalidYear88Value);
   	}
	char[] inputValid88Value = "V".toCharArray();
	/**
	 *	Test condition "V" for isInputValid()
	 *	@return  Returns true if isInputValid() is "V"
	 */
   public boolean isInputValid() throws CFException {
      return (  compareChars( getWcdloValidationRsn() , inputValid88Value)  == 0  );
   }


	/**
	*  set values "V"
	*/
   	public void setInputValidTrue() {  			
    	setWcdloValidationRsn( inputValid88Value);
   	}
	/**
	 *	Returns the value of wcdloValidCycles
	 *	@return wcdloValidCycles
	 */
	public int getWcdloValidCycles() throws CFException {
       if (isWcdloValidCyclesModified()) { 
           wcdloValidCycles = refreshWcdloValidCycles();
        }
   		return wcdloValidCycles;
	}
	

	
	   
	/**
	 * 	Update WcdloValidCycles with the passed value
	 *  Corresponding COBOL Variable is WCDLO-VALID-CYCLES
	 *	@param number
	 */
	public void setWcdloValidCycles(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloValidCycles = checkWcdloValidCyclesMaxLimit(number); 
		serializeWcdloValidCycles(wcdloValidCycles);
	}
	

	public void setWcdloValidCycles(long number) {
	    number = checkWcdloValidCyclesMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloValidCycles((int)number);
	}
	
	/**
	 * 	Update WcdloValidCycles with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloValidCycles(char[] value) throws CFException {
		 wcdloValidCycles = serializeWcdloValidCycles(value);
	}
	/**
	 * 	Update WcdloValidCycles with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloValidCyclesString(char[] value) throws CFException {
		 setWcdloValidCycles(value);
	}
	
	/**
	 *	Test condition 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 for isListOfValidCycles()
	 *	@return  Returns true if isListOfValidCycles() is 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
	 */
   public boolean isListOfValidCycles() throws CFException {
      return (  getWcdloValidCycles()  ==  1  ||  getWcdloValidCycles()  ==  2  ||  getWcdloValidCycles()  ==  3  ||  getWcdloValidCycles()  ==  4  ||  getWcdloValidCycles()  ==  5  ||  getWcdloValidCycles()  ==  6  ||  getWcdloValidCycles()  ==  7  ||  getWcdloValidCycles()  ==  8  ||  getWcdloValidCycles()  ==  9  ||  getWcdloValidCycles()  ==  10  ||  getWcdloValidCycles()  ==  11  ||  getWcdloValidCycles()  ==  12  ||  getWcdloValidCycles()  ==  13  ||  getWcdloValidCycles()  ==  14  ||  getWcdloValidCycles()  ==  15  ||  getWcdloValidCycles()  ==  16  ||  getWcdloValidCycles()  ==  17  ||  getWcdloValidCycles()  ==  18  ||  getWcdloValidCycles()  ==  19  ||  getWcdloValidCycles()  ==  20  ||  getWcdloValidCycles()  ==  21  ||  getWcdloValidCycles()  ==  22  ||  getWcdloValidCycles()  ==  23  ||  getWcdloValidCycles()  ==  24  ||  getWcdloValidCycles()  ==  25  ||  getWcdloValidCycles()  ==  26  ||  getWcdloValidCycles()  ==  27  ||  getWcdloValidCycles()  ==  28  ||  getWcdloValidCycles()  ==  29  ||  getWcdloValidCycles()  ==  30  ||  getWcdloValidCycles()  ==  31  );
   }


	/**
	*  set values 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31
	*/
   	public void setListOfValidCyclesTrue() {  			
    	setWcdloValidCycles( 1);
   	}
	/**
	 *	Returns the value of wcdloValidMonths
	 *	@return wcdloValidMonths
	 */
	public int getWcdloValidMonths() throws CFException {
       if (isWcdloValidMonthsModified()) { 
           wcdloValidMonths = refreshWcdloValidMonths();
        }
   		return wcdloValidMonths;
	}
	

	
	   
	/**
	 * 	Update WcdloValidMonths with the passed value
	 *  Corresponding COBOL Variable is WCDLO-VALID-MONTHS
	 *	@param number
	 */
	public void setWcdloValidMonths(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloValidMonths = checkWcdloValidMonthsMaxLimit(number); 
		serializeWcdloValidMonths(wcdloValidMonths);
	}
	

	public void setWcdloValidMonths(long number) {
	    number = checkWcdloValidMonthsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloValidMonths((int)number);
	}
	
	/**
	 * 	Update WcdloValidMonths with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloValidMonths(char[] value) throws CFException {
		 wcdloValidMonths = serializeWcdloValidMonths(value);
	}
	/**
	 * 	Update WcdloValidMonths with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloValidMonthsString(char[] value) throws CFException {
		 setWcdloValidMonths(value);
	}
	
	/**
	 *	Test condition 1 2 3 4 5 6 7 8 9 10 11 12 for isListOfValidMonths()
	 *	@return  Returns true if isListOfValidMonths() is 1 2 3 4 5 6 7 8 9 10 11 12
	 */
   public boolean isListOfValidMonths() throws CFException {
      return (  getWcdloValidMonths()  ==  1  ||  getWcdloValidMonths()  ==  2  ||  getWcdloValidMonths()  ==  3  ||  getWcdloValidMonths()  ==  4  ||  getWcdloValidMonths()  ==  5  ||  getWcdloValidMonths()  ==  6  ||  getWcdloValidMonths()  ==  7  ||  getWcdloValidMonths()  ==  8  ||  getWcdloValidMonths()  ==  9  ||  getWcdloValidMonths()  ==  10  ||  getWcdloValidMonths()  ==  11  ||  getWcdloValidMonths()  ==  12  );
   }


	/**
	*  set values 1 2 3 4 5 6 7 8 9 10 11 12
	*/
   	public void setListOfValidMonthsTrue() {  			
    	setWcdloValidMonths( 1);
   	}
	/**
	 *	Returns the value of wcdloCurMm
	 *	@return wcdloCurMm
	 */
	public int getWcdloCurMm() throws CFException {
       if (isWcdloCurMmModified()) { 
           wcdloCurMm = refreshWcdloCurMm();
        }
   		return wcdloCurMm;
	}
	

	
	   
	/**
	 * 	Update WcdloCurMm with the passed value
	 *  Corresponding COBOL Variable is WCDLO-CUR-MM
	 *	@param number
	 */
	public void setWcdloCurMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloCurMm = checkWcdloCurMmMaxLimit(number); 
		serializeWcdloCurMm(wcdloCurMm);
	}
	

	public void setWcdloCurMm(long number) {
	    number = checkWcdloCurMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloCurMm((int)number);
	}
	
	/**
	 * 	Update WcdloCurMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloCurMm(char[] value) throws CFException {
		 wcdloCurMm = serializeWcdloCurMm(value);
	}
	/**
	 * 	Update WcdloCurMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloCurMmString(char[] value) throws CFException {
		 setWcdloCurMm(value);
	}
	
	/**
	 *	Test condition 1 3 5 7 8 10 12 for isMnthWith31Days()
	 *	@return  Returns true if isMnthWith31Days() is 1 3 5 7 8 10 12
	 */
   public boolean isMnthWith31Days() throws CFException {
      return (  getWcdloCurMm()  ==  1  ||  getWcdloCurMm()  ==  3  ||  getWcdloCurMm()  ==  5  ||  getWcdloCurMm()  ==  7  ||  getWcdloCurMm()  ==  8  ||  getWcdloCurMm()  ==  10  ||  getWcdloCurMm()  ==  12  );
   }


	/**
	*  set values 1 3 5 7 8 10 12
	*/
   	public void setMnthWith31DaysTrue() {  			
    	setWcdloCurMm( 1);
   	}
	
	/**
	 *	Test condition 4 6 9 11 for isMnthWith30Days()
	 *	@return  Returns true if isMnthWith30Days() is 4 6 9 11
	 */
   public boolean isMnthWith30Days() throws CFException {
      return (  getWcdloCurMm()  ==  4  ||  getWcdloCurMm()  ==  6  ||  getWcdloCurMm()  ==  9  ||  getWcdloCurMm()  ==  11  );
   }


	/**
	*  set values 4 6 9 11
	*/
   	public void setMnthWith30DaysTrue() {  			
    	setWcdloCurMm( 4);
   	}
	
	/**
	 *	Test condition 2 for isMnthLess30Days()
	 *	@return  Returns true if isMnthLess30Days() is 2
	 */
   public boolean isMnthLess30Days() throws CFException {
      return (  getWcdloCurMm()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setMnthLess30DaysTrue() {  			
    	setWcdloCurMm( 2);
   	}

	
	
	

		public static int getWscdlCalDateFieldLength() {
			return WSCDL_CAL_DATE_LENGTH;
		}

}
  
