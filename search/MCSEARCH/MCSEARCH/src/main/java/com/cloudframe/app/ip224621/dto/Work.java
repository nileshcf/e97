package com.cloudframe.app.ip224621.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.ip224621.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] isItTheFirstTime100 = new char[1];

						private char[] isCombinationFound100 = new char[1];

						private char[] isOccurrenceValid100 = new char[1];

								private int valueOne300;

								private int valueFifty300;

						private char[] tblOverflowAbendCode300 = new char[4];

						private char[] para2111300 = new char[26];

						private char[] tableOverflowError600 = new char[48];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setIsCombinationFound100(("Y").toCharArray());
								setIsOccurrenceValid100(("Y").toCharArray());
								setValueOne300(1);
								setValueFifty300(50);
								setTblOverflowAbendCode300(("3001").toCharArray());
								setPara2111300(("2111-ABEND-ON-TBL-OVERFLOW").toCharArray());
								setTableOverflowError600((" PDS501S1 AND S2 COMBINATIONS TABLE OVER FLOW.  ").toCharArray());
    }


 

	/**
	 *	Returns the value of isItTheFirstTime100
	 *	@return isItTheFirstTime100
	 */
   public char[] getIsItTheFirstTime100() throws CFException{
   		return isItTheFirstTime100;
   }

  
	/**
	*  set variable isItTheFirstTime100
	*  Corresponding COBOL Variable is 100-IS-IT-THE-FIRST-TIME
	*  @param value
	**/
   public void setIsItTheFirstTime100(char[] value) {
       value = checkIsItTheFirstTime100Constraints(value);
       arraycopy(value,0,isItTheFirstTime100,0,value.length);
   } 
	public void setIsItTheFirstTime100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItTheFirstTime100,0,beginIndex + endIndex);
   }
	char[] itIsTheFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsTheFirstTime88100()
	 *	@return  Returns true if isItIsTheFirstTime88100() is "Y"
	 */
   public boolean isItIsTheFirstTime88100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsTheFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsTheFirstTime88100True() {  			
    	setIsItTheFirstTime100( itIsTheFirstTime8810088Value);
   	}
	char[] itIsNotFirstTime8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsNotFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True() {  			
    	setIsItTheFirstTime100( itIsNotFirstTime8810088Value);
   	}
	/**
	 *	Returns the value of isCombinationFound100
	 *	@return isCombinationFound100
	 */
   public char[] getIsCombinationFound100() throws CFException{
   		return isCombinationFound100;
   }

  
	/**
	*  set variable isCombinationFound100
	*  Corresponding COBOL Variable is 100-IS-COMBINATION-FOUND
	*  @param value
	**/
   public void setIsCombinationFound100(char[] value) {
       value = checkIsCombinationFound100Constraints(value);
       arraycopy(value,0,isCombinationFound100,0,value.length);
   } 
	public void setIsCombinationFound100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isCombinationFound100,0,beginIndex + endIndex);
   }
	char[] combinationFound8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isCombinationFound88100()
	 *	@return  Returns true if isCombinationFound88100() is "Y"
	 */
   public boolean isCombinationFound88100() throws CFException {
      return (  compareChars( getIsCombinationFound100() , combinationFound8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setCombinationFound88100True() {  			
    	setIsCombinationFound100( combinationFound8810088Value);
   	}
	char[] combinationNotFound8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isCombinationNotFound88100()
	 *	@return  Returns true if isCombinationNotFound88100() is "N"
	 */
   public boolean isCombinationNotFound88100() throws CFException {
      return (  compareChars( getIsCombinationFound100() , combinationNotFound8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setCombinationNotFound88100True() {  			
    	setIsCombinationFound100( combinationNotFound8810088Value);
   	}
	/**
	 *	Returns the value of isOccurrenceValid100
	 *	@return isOccurrenceValid100
	 */
   public char[] getIsOccurrenceValid100() throws CFException{
   		return isOccurrenceValid100;
   }

  
	/**
	*  set variable isOccurrenceValid100
	*  Corresponding COBOL Variable is 100-IS-OCCURRENCE-VALID
	*  @param value
	**/
   public void setIsOccurrenceValid100(char[] value) {
       value = checkIsOccurrenceValid100Constraints(value);
       arraycopy(value,0,isOccurrenceValid100,0,value.length);
   } 
	public void setIsOccurrenceValid100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isOccurrenceValid100,0,beginIndex + endIndex);
   }
	char[] occurrenceIsValid8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isOccurrenceIsValid88100()
	 *	@return  Returns true if isOccurrenceIsValid88100() is "Y"
	 */
   public boolean isOccurrenceIsValid88100() throws CFException {
      return (  compareChars( getIsOccurrenceValid100() , occurrenceIsValid8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setOccurrenceIsValid88100True() {  			
    	setIsOccurrenceValid100( occurrenceIsValid8810088Value);
   	}
	char[] occurrenceIsInvalid8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isOccurrenceIsInvalid88100()
	 *	@return  Returns true if isOccurrenceIsInvalid88100() is "N"
	 */
   public boolean isOccurrenceIsInvalid88100() throws CFException {
      return (  compareChars( getIsOccurrenceValid100() , occurrenceIsInvalid8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setOccurrenceIsInvalid88100True() {  			
    	setIsOccurrenceValid100( occurrenceIsInvalid8810088Value);
   	}
	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {
   		return valueOne300;
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-ONE
	 *	@param number
	 */
	public void setValueOne300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    valueOne300 = checkValueOne300MaxLimit(number); 
	}


	public void setValueOne300(long number) {
	    number = checkValueOne300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValueOne300((int)number);
	}
	
	/**
	 *	Returns the value of valueFifty300
	 *	@return valueFifty300
	 */
	public int getValueFifty300() throws CFException {
   		return valueFifty300;
	}
	
	/**
	 * 	Update ValueFifty300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-FIFTY
	 *	@param number
	 */
	public void setValueFifty300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    valueFifty300 = checkValueFifty300MaxLimit(number); 
	}


	public void setValueFifty300(long number) {
	    number = checkValueFifty300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValueFifty300((int)number);
	}
	
	/**
	 *	Returns the value of tblOverflowAbendCode300
	 *	@return tblOverflowAbendCode300
	 */
   public char[] getTblOverflowAbendCode300() throws CFException{
   		return tblOverflowAbendCode300;
   }

  
	/**
	*  set variable tblOverflowAbendCode300
	*  Corresponding COBOL Variable is 300-TBL-OVERFLOW-ABEND-CODE
	*  @param value
	**/
   public void setTblOverflowAbendCode300(char[] value) {
       value = checkTblOverflowAbendCode300Constraints(value);
       arraycopy(value,0,tblOverflowAbendCode300,0,value.length);
   } 
	public void setTblOverflowAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tblOverflowAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para2111300
	 *	@return para2111300
	 */
   public char[] getPara2111300() throws CFException{
   		return para2111300;
   }

  
	/**
	*  set variable para2111300
	*  Corresponding COBOL Variable is 300-PARA-2111
	*  @param value
	**/
   public void setPara2111300(char[] value) {
       value = checkPara2111300Constraints(value);
       arraycopy(value,0,para2111300,0,value.length);
   } 
	public void setPara2111300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para2111300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tableOverflowError600
	 *	@return tableOverflowError600
	 */
   public char[] getTableOverflowError600() throws CFException{
   		return tableOverflowError600;
   }

  
	/**
	*  set variable tableOverflowError600
	*  Corresponding COBOL Variable is 600-TABLE-OVERFLOW-ERROR
	*  @param value
	**/
   public void setTableOverflowError600(char[] value) {
       value = checkTableOverflowError600Constraints(value);
       arraycopy(value,0,tableOverflowError600,0,value.length);
   } 
	public void setTableOverflowError600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableOverflowError600,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
