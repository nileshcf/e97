package com.cloudframe.app.ip650010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip650010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

						private char[] isItTheFirstTime100 = new char[1];

						private char[] isOptParmFileClosed100 = new char[1];

						private char[] optParmFileStatus200 = new char[2];

								private int valueOne300;

						private char[] fileOpenAbendCode300 = new char[4];

						private char[] fileStartAbendCode300 = new char[4];

						private char[] fileReadAbendCode300 = new char[4];

						private char[] fileCloseAbendCode300 = new char[4];

								private long optParmRecLngth400;

								private int recordsRead400;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setIsOptParmFileClosed100(("Y").toCharArray());
								setOptParmFileStatus200(("00").toCharArray());
								setValueOne300(1);
								setFileOpenAbendCode300(("3001").toCharArray());
								setFileStartAbendCode300(("3002").toCharArray());
								setFileReadAbendCode300(("3003").toCharArray());
								setFileCloseAbendCode300(("3004").toCharArray());
								setRecordsRead400(0);
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
	char[] itIsFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsFirstTime88100()
	 *	@return  Returns true if isItIsFirstTime88100() is "Y"
	 */
   public boolean isItIsFirstTime88100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsFirstTime88100True() {  			
    	setIsItTheFirstTime100( itIsFirstTime8810088Value);
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
	 *	Returns the value of isOptParmFileClosed100
	 *	@return isOptParmFileClosed100
	 */
   public char[] getIsOptParmFileClosed100() throws CFException{
   		return isOptParmFileClosed100;
   }

  
	/**
	*  set variable isOptParmFileClosed100
	*  Corresponding COBOL Variable is 100-IS-OPT-PARM-FILE-CLOSED
	*  @param value
	**/
   public void setIsOptParmFileClosed100(char[] value) {
       value = checkIsOptParmFileClosed100Constraints(value);
       arraycopy(value,0,isOptParmFileClosed100,0,value.length);
   } 
	public void setIsOptParmFileClosed100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isOptParmFileClosed100,0,beginIndex + endIndex);
   }
	char[] fileIsClosed8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFileIsClosed88100()
	 *	@return  Returns true if isFileIsClosed88100() is "Y"
	 */
   public boolean isFileIsClosed88100() throws CFException {
      return (  compareChars( getIsOptParmFileClosed100() , fileIsClosed8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFileIsClosed88100True() {  			
    	setIsOptParmFileClosed100( fileIsClosed8810088Value);
   	}
	char[] fileIsOpen8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isFileIsOpen88100()
	 *	@return  Returns true if isFileIsOpen88100() is "N"
	 */
   public boolean isFileIsOpen88100() throws CFException {
      return (  compareChars( getIsOptParmFileClosed100() , fileIsOpen8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setFileIsOpen88100True() {  			
    	setIsOptParmFileClosed100( fileIsOpen8810088Value);
   	}
	/**
	 *	Returns the value of optParmFileStatus200
	 *	@return optParmFileStatus200
	 */
   public char[] getOptParmFileStatus200() throws CFException{
   		return optParmFileStatus200;
   }

  
	/**
	*  set variable optParmFileStatus200
	*  Corresponding COBOL Variable is 200-OPT-PARM-FILE-STATUS
	*  @param value
	**/
   public void setOptParmFileStatus200(char[] value) {
       value = checkOptParmFileStatus200Constraints(value);
       arraycopy(value,0,optParmFileStatus200,0,value.length);
   } 
	public void setOptParmFileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,optParmFileStatus200,0,beginIndex + endIndex);
   }
	char[] optParmIoGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isOptParmIoGood88200()
	 *	@return  Returns true if isOptParmIoGood88200() is "00"
	 */
   public boolean isOptParmIoGood88200() throws CFException {
      return (  compareChars( getOptParmFileStatus200() , optParmIoGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setOptParmIoGood88200True() {  			
    	setOptParmFileStatus200( optParmIoGood8820088Value);
   	}
	char[] optParmAlreadyOpen8820088Value = "41".toCharArray();
	/**
	 *	Test condition "41" for isOptParmAlreadyOpen88200()
	 *	@return  Returns true if isOptParmAlreadyOpen88200() is "41"
	 */
   public boolean isOptParmAlreadyOpen88200() throws CFException {
      return (  compareChars( getOptParmFileStatus200() , optParmAlreadyOpen8820088Value)  == 0  );
   }


	/**
	*  set values "41"
	*/
   	public void setOptParmAlreadyOpen88200True() {  			
    	setOptParmFileStatus200( optParmAlreadyOpen8820088Value);
   	}
	char[] endOfFile8820088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isEndOfFile88200()
	 *	@return  Returns true if isEndOfFile88200() is "10"
	 */
   public boolean isEndOfFile88200() throws CFException {
      return (  compareChars( getOptParmFileStatus200() , endOfFile8820088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setEndOfFile88200True() {  			
    	setOptParmFileStatus200( endOfFile8820088Value);
   	}
	char[] noTblRecords8820088Value = "23".toCharArray();
	/**
	 *	Test condition "23" for isNoTblRecords88200()
	 *	@return  Returns true if isNoTblRecords88200() is "23"
	 */
   public boolean isNoTblRecords88200() throws CFException {
      return (  compareChars( getOptParmFileStatus200() , noTblRecords8820088Value)  == 0  );
   }


	/**
	*  set values "23"
	*/
   	public void setNoTblRecords88200True() {  			
    	setOptParmFileStatus200( noTblRecords8820088Value);
   	}
	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {
       if (isValueOne300Modified()) { 
           valueOne300 = refreshValueOne300();
        }
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
		serializeValueOne300(valueOne300);
	}
	

	public void setValueOne300(long number) {
	    number = checkValueOne300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValueOne300((int)number);
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValueOne300(char[] value) throws CFException {
		 valueOne300 = serializeValueOne300(value);
	}
	/**
	 * 	Update ValueOne300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValueOne300String(char[] value) throws CFException {
		 setValueOne300(value);
	}
	/**
	 *	Returns the value of fileOpenAbendCode300
	 *	@return fileOpenAbendCode300
	 */
   public char[] getFileOpenAbendCode300() throws CFException{
   		return fileOpenAbendCode300;
   }

  
	/**
	*  set variable fileOpenAbendCode300
	*  Corresponding COBOL Variable is 300-FILE-OPEN-ABEND-CODE
	*  @param value
	**/
   public void setFileOpenAbendCode300(char[] value) {
       value = checkFileOpenAbendCode300Constraints(value);
       arraycopy(value,0,fileOpenAbendCode300,0,value.length);
   } 
	public void setFileOpenAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fileOpenAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fileStartAbendCode300
	 *	@return fileStartAbendCode300
	 */
   public char[] getFileStartAbendCode300() throws CFException{
   		return fileStartAbendCode300;
   }

  
	/**
	*  set variable fileStartAbendCode300
	*  Corresponding COBOL Variable is 300-FILE-START-ABEND-CODE
	*  @param value
	**/
   public void setFileStartAbendCode300(char[] value) {
       value = checkFileStartAbendCode300Constraints(value);
       arraycopy(value,0,fileStartAbendCode300,0,value.length);
   } 
	public void setFileStartAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fileStartAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fileReadAbendCode300
	 *	@return fileReadAbendCode300
	 */
   public char[] getFileReadAbendCode300() throws CFException{
   		return fileReadAbendCode300;
   }

  
	/**
	*  set variable fileReadAbendCode300
	*  Corresponding COBOL Variable is 300-FILE-READ-ABEND-CODE
	*  @param value
	**/
   public void setFileReadAbendCode300(char[] value) {
       value = checkFileReadAbendCode300Constraints(value);
       arraycopy(value,0,fileReadAbendCode300,0,value.length);
   } 
	public void setFileReadAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fileReadAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fileCloseAbendCode300
	 *	@return fileCloseAbendCode300
	 */
   public char[] getFileCloseAbendCode300() throws CFException{
   		return fileCloseAbendCode300;
   }

  
	/**
	*  set variable fileCloseAbendCode300
	*  Corresponding COBOL Variable is 300-FILE-CLOSE-ABEND-CODE
	*  @param value
	**/
   public void setFileCloseAbendCode300(char[] value) {
       value = checkFileCloseAbendCode300Constraints(value);
       arraycopy(value,0,fileCloseAbendCode300,0,value.length);
   } 
	public void setFileCloseAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fileCloseAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of optParmRecLngth400
	 *	@return optParmRecLngth400
	 */
	public long getOptParmRecLngth400() throws CFException {
   		return optParmRecLngth400;
	}
	
	/**
	 * 	Update OptParmRecLngth400 with the passed value
	 *  Corresponding COBOL Variable is 400-OPT-PARM-REC-LNGTH
	 *	@param number
	 */
	public void setOptParmRecLngth400(long number) {
	     // Truncate if the number is beyond +/- Max range
	    optParmRecLngth400 = checkOptParmRecLngth400MaxLimit(number); 
	}


	/**
	 *	Returns the value of recordsRead400
	 *	@return recordsRead400
	 */
	public int getRecordsRead400() throws CFException {
   		return recordsRead400;
	}
	
	/**
	 * 	Update RecordsRead400 with the passed value
	 *  Corresponding COBOL Variable is 400-RECORDS-READ
	 *	@param number
	 */
	public void setRecordsRead400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    recordsRead400 = checkRecordsRead400MaxLimit(number); 
	}


	public void setRecordsRead400(long number) {
	    number = checkRecordsRead400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRecordsRead400((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
