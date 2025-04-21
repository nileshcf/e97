package com.cloudframe.app.gp004760.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.gp004760.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] sys201FileStatus200 = new char[2];

						private char[] sys202FileStatus200 = new char[2];

						private char[] statusCode300 = new char[25];

						private char[] abendCode300 = new char[4];

						private char[] errorMessage600 = new char[40];

								private int statusCode600;

						private char[] displayAbendMsgTxt600 = new char[480];

						private char[] abendPara300 = new char[35];

								private long idx800;

								private long sub800;

								private short plusOneHundred300;

						private char[] cabtccextCsr100 = new char[1];

								private long outfileCnt;

								private int ocrCnt;

						private char[] thisPgmDb2CollIdBase300 = new char[7];

						private char[] db2ErrModule300 = new char[8];

						private char[] outputCntMsg600 = new char[43];

								private char[] wsSqlcodeDisp800 = new char[4];
							

						private char[] wsCurrParagraph800 = new char[30];

						private char[] wsSqlFunction800 = new char[25];

						private char[] wsCurrTable800 = new char[25];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSys201FileStatus200(fillSpace(2));
								setSys202FileStatus200(fillSpace(2));
								setStatusCode300(("GP004760 : STATUS CODE : ").toCharArray());
								setAbendCode300(fillSpace(4));
								setErrorMessage600(fillSpace(40));
								setStatusCode600(0);
								setDisplayAbendMsgTxt600("************************************************************************************************************************A B E N D          A B E N D          A B E N D                                                                         A B E N D       G P 0 0 4 7 6 0       A B E N D                                                                         ************************************************************************************************************************".toCharArray());
								setAbendPara300(fillSpace(35));
								setPlusOneHundred300((short)100);
								setCabtccextCsr100(("N").toCharArray());
								setThisPgmDb2CollIdBase300(("COLLGPA").toCharArray());
								setDb2ErrModule300(("DB200020").toCharArray());
								setOutputCntMsg600(("TOTAL OUTPUT RECORDS WRITTEN:              ").toCharArray());
								setWsSqlcodeDisp800(CFUtil.cobolNumberFormatter("-999".toCharArray(),"0".toCharArray()));
								setWsCurrParagraph800(fillSpace(30));
								setWsSqlFunction800(fillSpace(25));
								setWsCurrTable800(fillSpace(25));
    }


 

	/**
	 *	Returns the value of sys201FileStatus200
	 *	@return sys201FileStatus200
	 */
   public char[] getSys201FileStatus200() throws CFException{
   		return sys201FileStatus200;
   }

  
	/**
	*  set variable sys201FileStatus200
	*  Corresponding COBOL Variable is 200-SYS201-FILE-STATUS
	*  @param value
	**/
   public void setSys201FileStatus200(char[] value) {
       value = checkSys201FileStatus200Constraints(value);
       arraycopy(value,0,sys201FileStatus200,0,value.length);
   } 
	public void setSys201FileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys201FileStatus200,0,beginIndex + endIndex);
   }
	char[] sys201Success8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys201Success88200()
	 *	@return  Returns true if isSys201Success88200() is "00"
	 */
   public boolean isSys201Success88200() throws CFException {
      return (  compareChars( getSys201FileStatus200() , sys201Success8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys201Success88200True() {  			
    	setSys201FileStatus200( sys201Success8820088Value);
   	}
	/**
	 *	Returns the value of sys202FileStatus200
	 *	@return sys202FileStatus200
	 */
   public char[] getSys202FileStatus200() throws CFException{
   		return sys202FileStatus200;
   }

  
	/**
	*  set variable sys202FileStatus200
	*  Corresponding COBOL Variable is 200-SYS202-FILE-STATUS
	*  @param value
	**/
   public void setSys202FileStatus200(char[] value) {
       value = checkSys202FileStatus200Constraints(value);
       arraycopy(value,0,sys202FileStatus200,0,value.length);
   } 
	public void setSys202FileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys202FileStatus200,0,beginIndex + endIndex);
   }
	char[] sys202Success8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys202Success88200()
	 *	@return  Returns true if isSys202Success88200() is "00"
	 */
   public boolean isSys202Success88200() throws CFException {
      return (  compareChars( getSys202FileStatus200() , sys202Success8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys202Success88200True() {  			
    	setSys202FileStatus200( sys202Success8820088Value);
   	}
	/**
	 *	Returns the value of statusCode300
	 *	@return statusCode300
	 */
   public char[] getStatusCode300() throws CFException{
   		return statusCode300;
   }

  
	/**
	*  set variable statusCode300
	*  Corresponding COBOL Variable is 300-STATUS-CODE
	*  @param value
	**/
   public void setStatusCode300(char[] value) {
       value = checkStatusCode300Constraints(value);
       arraycopy(value,0,statusCode300,0,value.length);
   } 
	public void setStatusCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,statusCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
   public char[] getAbendCode300() throws CFException{
   		return abendCode300;
   }

  
	/**
	*  set variable abendCode300
	*  Corresponding COBOL Variable is 300-ABEND-CODE
	*  @param value
	**/
   public void setAbendCode300(char[] value) {
       value = checkAbendCode300Constraints(value);
       arraycopy(value,0,abendCode300,0,value.length);
   } 
	public void setAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendCode300,0,beginIndex + endIndex);
   }
	char[] fileOpenAbendCode8830088Value = "3001".toCharArray();
	/**
	 *	Test condition "3001" for isFileOpenAbendCode88300()
	 *	@return  Returns true if isFileOpenAbendCode88300() is "3001"
	 */
   public boolean isFileOpenAbendCode88300() throws CFException {
      return (  compareChars( getAbendCode300() , fileOpenAbendCode8830088Value)  == 0  );
   }


	/**
	*  set values "3001"
	*/
   	public void setFileOpenAbendCode88300True() {  			
    	setAbendCode300( fileOpenAbendCode8830088Value);
   	}
	char[] fileWriteAbendCode8830088Value = "3003".toCharArray();
	/**
	 *	Test condition "3003" for isFileWriteAbendCode88300()
	 *	@return  Returns true if isFileWriteAbendCode88300() is "3003"
	 */
   public boolean isFileWriteAbendCode88300() throws CFException {
      return (  compareChars( getAbendCode300() , fileWriteAbendCode8830088Value)  == 0  );
   }


	/**
	*  set values "3003"
	*/
   	public void setFileWriteAbendCode88300True() {  			
    	setAbendCode300( fileWriteAbendCode8830088Value);
   	}
	char[] fileCloseAbendCode8830088Value = "3004".toCharArray();
	/**
	 *	Test condition "3004" for isFileCloseAbendCode88300()
	 *	@return  Returns true if isFileCloseAbendCode88300() is "3004"
	 */
   public boolean isFileCloseAbendCode88300() throws CFException {
      return (  compareChars( getAbendCode300() , fileCloseAbendCode8830088Value)  == 0  );
   }


	/**
	*  set values "3004"
	*/
   	public void setFileCloseAbendCode88300True() {  			
    	setAbendCode300( fileCloseAbendCode8830088Value);
   	}
	/**
	 *	Returns the value of errorMessage600
	 *	@return errorMessage600
	 */
   public char[] getErrorMessage600() throws CFException{
   		return errorMessage600;
   }

  
	/**
	*  set variable errorMessage600
	*  Corresponding COBOL Variable is 600-ERROR-MESSAGE
	*  @param value
	**/
   public void setErrorMessage600(char[] value) {
       value = checkErrorMessage600Constraints(value);
       arraycopy(value,0,errorMessage600,0,value.length);
   } 
	public void setErrorMessage600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errorMessage600,0,beginIndex + endIndex);
   }
	char[] abendOpenSys2018860088Value = "ERROR OPENING SYS201 CAB EXTRACT FILE   ".toCharArray();
	/**
	 *	Test condition "ERROR OPENING SYS201 CAB EXTRACT FILE" for isAbendOpenSys20188600()
	 *	@return  Returns true if isAbendOpenSys20188600() is "ERROR OPENING SYS201 CAB EXTRACT FILE"
	 */
   public boolean isAbendOpenSys20188600() throws CFException {
      return (  compareChars( getErrorMessage600() , abendOpenSys2018860088Value)  == 0  );
   }


	/**
	*  set values "ERROR OPENING SYS201 CAB EXTRACT FILE"
	*/
   	public void setAbendOpenSys20188600True() {  			
    	setErrorMessage600( abendOpenSys2018860088Value);
   	}
	char[] abendWriteSys2018860088Value = "ERROR WRITING SYS201 CAB EXTRACT FILE   ".toCharArray();
	/**
	 *	Test condition "ERROR WRITING SYS201 CAB EXTRACT FILE" for isAbendWriteSys20188600()
	 *	@return  Returns true if isAbendWriteSys20188600() is "ERROR WRITING SYS201 CAB EXTRACT FILE"
	 */
   public boolean isAbendWriteSys20188600() throws CFException {
      return (  compareChars( getErrorMessage600() , abendWriteSys2018860088Value)  == 0  );
   }


	/**
	*  set values "ERROR WRITING SYS201 CAB EXTRACT FILE"
	*/
   	public void setAbendWriteSys20188600True() {  			
    	setErrorMessage600( abendWriteSys2018860088Value);
   	}
	char[] abendCloseSys2018860088Value = "ERROR CLOSING SYS201 CAB EXTRACT FILE   ".toCharArray();
	/**
	 *	Test condition "ERROR CLOSING SYS201 CAB EXTRACT FILE" for isAbendCloseSys20188600()
	 *	@return  Returns true if isAbendCloseSys20188600() is "ERROR CLOSING SYS201 CAB EXTRACT FILE"
	 */
   public boolean isAbendCloseSys20188600() throws CFException {
      return (  compareChars( getErrorMessage600() , abendCloseSys2018860088Value)  == 0  );
   }


	/**
	*  set values "ERROR CLOSING SYS201 CAB EXTRACT FILE"
	*/
   	public void setAbendCloseSys20188600True() {  			
    	setErrorMessage600( abendCloseSys2018860088Value);
   	}
	char[] abendOpenSys2028860088Value = "ERROR OPENING SYS202 NSPK EXTRCT FILE   ".toCharArray();
	/**
	 *	Test condition "ERROR OPENING SYS202 NSPK EXTRCT FILE" for isAbendOpenSys20288600()
	 *	@return  Returns true if isAbendOpenSys20288600() is "ERROR OPENING SYS202 NSPK EXTRCT FILE"
	 */
   public boolean isAbendOpenSys20288600() throws CFException {
      return (  compareChars( getErrorMessage600() , abendOpenSys2028860088Value)  == 0  );
   }


	/**
	*  set values "ERROR OPENING SYS202 NSPK EXTRCT FILE"
	*/
   	public void setAbendOpenSys20288600True() {  			
    	setErrorMessage600( abendOpenSys2028860088Value);
   	}
	char[] abendWriteSys2028860088Value = "ERROR WRITING SYS202 NSPK EXTRCT FILE   ".toCharArray();
	/**
	 *	Test condition "ERROR WRITING SYS202 NSPK EXTRCT FILE" for isAbendWriteSys20288600()
	 *	@return  Returns true if isAbendWriteSys20288600() is "ERROR WRITING SYS202 NSPK EXTRCT FILE"
	 */
   public boolean isAbendWriteSys20288600() throws CFException {
      return (  compareChars( getErrorMessage600() , abendWriteSys2028860088Value)  == 0  );
   }


	/**
	*  set values "ERROR WRITING SYS202 NSPK EXTRCT FILE"
	*/
   	public void setAbendWriteSys20288600True() {  			
    	setErrorMessage600( abendWriteSys2028860088Value);
   	}
	char[] abendCloseSys2028860088Value = "ERROR CLOSING SYS202 NSPK EXTRCT FILE   ".toCharArray();
	/**
	 *	Test condition "ERROR CLOSING SYS202 NSPK EXTRCT FILE" for isAbendCloseSys20288600()
	 *	@return  Returns true if isAbendCloseSys20288600() is "ERROR CLOSING SYS202 NSPK EXTRCT FILE"
	 */
   public boolean isAbendCloseSys20288600() throws CFException {
      return (  compareChars( getErrorMessage600() , abendCloseSys2028860088Value)  == 0  );
   }


	/**
	*  set values "ERROR CLOSING SYS202 NSPK EXTRCT FILE"
	*/
   	public void setAbendCloseSys20288600True() {  			
    	setErrorMessage600( abendCloseSys2028860088Value);
   	}
	/**
	 *	Returns the value of statusCode600
	 *	@return statusCode600
	 */
	public int getStatusCode600() throws CFException {
       if (isStatusCode600Modified()) { 
           statusCode600 = refreshStatusCode600();
        }
   		return statusCode600;
	}
	

	
	   
	/**
	 * 	Update StatusCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-STATUS-CODE
	 *	@param number
	 */
	public void setStatusCode600(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    statusCode600 = checkStatusCode600MaxLimit(number); 
		serializeStatusCode600(statusCode600);
	}
	

	public void setStatusCode600(long number) {
	    number = checkStatusCode600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setStatusCode600((int)number);
	}
	
	/**
	 * 	Update StatusCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStatusCode600(char[] value) throws CFException {
		 statusCode600 = serializeStatusCode600(value);
	}
	/**
	 * 	Update StatusCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStatusCode600String(char[] value) throws CFException {
		 setStatusCode600(value);
	}
	/**
	 *	Returns the value of displayAbendMsgTxt600
	 *	@return displayAbendMsgTxt600
	 */
   public char[] getDisplayAbendMsgTxt600() throws CFException{
   		return displayAbendMsgTxt600;
   }

  
	/**
	*  set variable displayAbendMsgTxt600
	*  Corresponding COBOL Variable is 600-DISPLAY-ABEND-MSG-TXT
	*  @param value
	**/
   public void setDisplayAbendMsgTxt600(char[] value) {
       value = checkDisplayAbendMsgTxt600Constraints(value);
       arraycopy(value,0,displayAbendMsgTxt600,0,value.length);
   } 
	public void setDisplayAbendMsgTxt600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,displayAbendMsgTxt600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendPara300
	 *	@return abendPara300
	 */
   public char[] getAbendPara300() throws CFException{
   		return abendPara300;
   }

  
	/**
	*  set variable abendPara300
	*  Corresponding COBOL Variable is 300-ABEND-PARA
	*  @param value
	**/
   public void setAbendPara300(char[] value) {
       value = checkAbendPara300Constraints(value);
       arraycopy(value,0,abendPara300,0,value.length);
   } 
	public void setAbendPara300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendPara300,0,beginIndex + endIndex);
   }
	char[] openSys201Para8830088Value = "1100-OPEN-SYS201-FILE              ".toCharArray();
	/**
	 *	Test condition "1100-OPEN-SYS201-FILE" for isOpenSys201Para88300()
	 *	@return  Returns true if isOpenSys201Para88300() is "1100-OPEN-SYS201-FILE"
	 */
   public boolean isOpenSys201Para88300() throws CFException {
      return (  compareChars( getAbendPara300() , openSys201Para8830088Value)  == 0  );
   }


	/**
	*  set values "1100-OPEN-SYS201-FILE"
	*/
   	public void setOpenSys201Para88300True() {  			
    	setAbendPara300( openSys201Para8830088Value);
   	}
	char[] writeSys201Para8830088Value = "2900-WRITE-SYS201-FILE             ".toCharArray();
	/**
	 *	Test condition "2900-WRITE-SYS201-FILE" for isWriteSys201Para88300()
	 *	@return  Returns true if isWriteSys201Para88300() is "2900-WRITE-SYS201-FILE"
	 */
   public boolean isWriteSys201Para88300() throws CFException {
      return (  compareChars( getAbendPara300() , writeSys201Para8830088Value)  == 0  );
   }


	/**
	*  set values "2900-WRITE-SYS201-FILE"
	*/
   	public void setWriteSys201Para88300True() {  			
    	setAbendPara300( writeSys201Para8830088Value);
   	}
	char[] closeSys201Para8830088Value = "2950-CLOSE-SYS201-FILE             ".toCharArray();
	/**
	 *	Test condition "2950-CLOSE-SYS201-FILE" for isCloseSys201Para88300()
	 *	@return  Returns true if isCloseSys201Para88300() is "2950-CLOSE-SYS201-FILE"
	 */
   public boolean isCloseSys201Para88300() throws CFException {
      return (  compareChars( getAbendPara300() , closeSys201Para8830088Value)  == 0  );
   }


	/**
	*  set values "2950-CLOSE-SYS201-FILE"
	*/
   	public void setCloseSys201Para88300True() {  			
    	setAbendPara300( closeSys201Para8830088Value);
   	}
	char[] openSys202Para8830088Value = "1101-OPEN-SYS202-FILE              ".toCharArray();
	/**
	 *	Test condition "1101-OPEN-SYS202-FILE" for isOpenSys202Para88300()
	 *	@return  Returns true if isOpenSys202Para88300() is "1101-OPEN-SYS202-FILE"
	 */
   public boolean isOpenSys202Para88300() throws CFException {
      return (  compareChars( getAbendPara300() , openSys202Para8830088Value)  == 0  );
   }


	/**
	*  set values "1101-OPEN-SYS202-FILE"
	*/
   	public void setOpenSys202Para88300True() {  			
    	setAbendPara300( openSys202Para8830088Value);
   	}
	char[] writeSys202Para8830088Value = "2901-WRITE-SYS202-FILE             ".toCharArray();
	/**
	 *	Test condition "2901-WRITE-SYS202-FILE" for isWriteSys202Para88300()
	 *	@return  Returns true if isWriteSys202Para88300() is "2901-WRITE-SYS202-FILE"
	 */
   public boolean isWriteSys202Para88300() throws CFException {
      return (  compareChars( getAbendPara300() , writeSys202Para8830088Value)  == 0  );
   }


	/**
	*  set values "2901-WRITE-SYS202-FILE"
	*/
   	public void setWriteSys202Para88300True() {  			
    	setAbendPara300( writeSys202Para8830088Value);
   	}
	char[] closeSys202Para8830088Value = "2951-CLOSE-SYS202-FILE             ".toCharArray();
	/**
	 *	Test condition "2951-CLOSE-SYS202-FILE" for isCloseSys202Para88300()
	 *	@return  Returns true if isCloseSys202Para88300() is "2951-CLOSE-SYS202-FILE"
	 */
   public boolean isCloseSys202Para88300() throws CFException {
      return (  compareChars( getAbendPara300() , closeSys202Para8830088Value)  == 0  );
   }


	/**
	*  set values "2951-CLOSE-SYS202-FILE"
	*/
   	public void setCloseSys202Para88300True() {  			
    	setAbendPara300( closeSys202Para8830088Value);
   	}
	/**
	 *	Returns the value of idx800
	 *	@return idx800
	 */
	public long getIdx800() throws CFException {
       if (isIdx800Modified()) { 
           idx800 = refreshIdx800();
        }
   		return idx800;
	}
	

	
	   
	/**
	 * 	Update Idx800 with the passed value
	 *  Corresponding COBOL Variable is 800-IDX
	 *	@param number
	 */
	public void setIdx800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    idx800 = checkIdx800MaxLimit(number); 
		serializeIdx800(idx800);
	}
	

	/**
	 * 	Update Idx800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx800(char[] value) throws CFException {
		 idx800 = serializeIdx800(value);
	}
	/**
	 * 	Update Idx800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdx800String(char[] value) throws CFException {
		 setIdx800(value);
	}
	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public long getSub800() throws CFException {
       if (isSub800Modified()) { 
           sub800 = refreshSub800();
        }
   		return sub800;
	}
	

	
	   
	/**
	 * 	Update Sub800 with the passed value
	 *  Corresponding COBOL Variable is 800-SUB
	 *	@param number
	 */
	public void setSub800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub800 = checkSub800MaxLimit(number); 
		serializeSub800(sub800);
	}
	

	/**
	 * 	Update Sub800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub800(char[] value) throws CFException {
		 sub800 = serializeSub800(value);
	}
	/**
	 * 	Update Sub800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub800String(char[] value) throws CFException {
		 setSub800(value);
	}
	/**
	 *	Returns the value of plusOneHundred300
	 *	@return plusOneHundred300
	 */
	public short getPlusOneHundred300() throws CFException {
       if (isPlusOneHundred300Modified()) { 
           plusOneHundred300 = refreshPlusOneHundred300();
        }
   		return plusOneHundred300;
	}
	

    /**
	 *	Returns the String value of plusOneHundred300
	 *	@return plusOneHundred300
	 */
	public char[]  getPlusOneHundred300ActualString() {
	    String value = String.valueOf(plusOneHundred300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update PlusOneHundred300 with the passed value
	 *  Corresponding COBOL Variable is 300-PLUS-ONE-HUNDRED
	 *	@param number
	 */
	public void setPlusOneHundred300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    plusOneHundred300 = checkPlusOneHundred300MaxLimit(number); 
		serializePlusOneHundred300(plusOneHundred300);
	}
	
	public void setPlusOneHundred300(int number) {
	    number = checkPlusOneHundred300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPlusOneHundred300((short)number);
	}
	public void setPlusOneHundred300(long number) {
	    number = checkPlusOneHundred300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPlusOneHundred300((short)number);
	}
	

	/**
	 * 	Update PlusOneHundred300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlusOneHundred300(char[] value) throws CFException {
		 plusOneHundred300 = serializePlusOneHundred300(value);
	}
	/**
	 * 	Update PlusOneHundred300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlusOneHundred300String(char[] value) throws CFException {
		 setPlusOneHundred300(value);
	}
	/**
	 *	Returns the value of cabtccextCsr100
	 *	@return cabtccextCsr100
	 */
   public char[] getCabtccextCsr100() throws CFException{
   		return cabtccextCsr100;
   }

  
	/**
	*  set variable cabtccextCsr100
	*  Corresponding COBOL Variable is 100-CABTCCEXT-CSR
	*  @param value
	**/
   public void setCabtccextCsr100(char[] value) {
       value = checkCabtccextCsr100Constraints(value);
       arraycopy(value,0,cabtccextCsr100,0,value.length);
   } 
	public void setCabtccextCsr100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cabtccextCsr100,0,beginIndex + endIndex);
   }
	char[] startCabtccextCsr10088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isStartCabtccextCsr100()
	 *	@return  Returns true if isStartCabtccextCsr100() is "N"
	 */
   public boolean isStartCabtccextCsr100() throws CFException {
      return (  compareChars( getCabtccextCsr100() , startCabtccextCsr10088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setStartCabtccextCsr100True() {  			
    	setCabtccextCsr100( startCabtccextCsr10088Value);
   	}
	char[] endCabtccextCsr10088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndCabtccextCsr100()
	 *	@return  Returns true if isEndCabtccextCsr100() is "Y"
	 */
   public boolean isEndCabtccextCsr100() throws CFException {
      return (  compareChars( getCabtccextCsr100() , endCabtccextCsr10088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndCabtccextCsr100True() {  			
    	setCabtccextCsr100( endCabtccextCsr10088Value);
   	}
	/**
	 *	Returns the value of outfileCnt
	 *	@return outfileCnt
	 */
	public long getOutfileCnt() throws CFException {
       if (isOutfileCntModified()) { 
           outfileCnt = refreshOutfileCnt();
        }
   		return outfileCnt;
	}
	

	
	   
	/**
	 * 	Update OutfileCnt with the passed value
	 *  Corresponding COBOL Variable is WS-OUTFILE-CNT
	 *	@param number
	 */
	public void setOutfileCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    outfileCnt = checkOutfileCntMaxLimit(number); 
		serializeOutfileCnt(outfileCnt);
	}
	

	/**
	 * 	Update OutfileCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutfileCnt(char[] value) throws CFException {
		 outfileCnt = serializeOutfileCnt(value);
	}
	/**
	 * 	Update OutfileCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutfileCntString(char[] value) throws CFException {
		 setOutfileCnt(value);
	}
	/**
	 *	Returns the value of ocrCnt
	 *	@return ocrCnt
	 */
	public int getOcrCnt() throws CFException {
       if (isOcrCntModified()) { 
           ocrCnt = refreshOcrCnt();
        }
   		return ocrCnt;
	}
	

	
	   
	/**
	 * 	Update OcrCnt with the passed value
	 *  Corresponding COBOL Variable is WS-OCR-CNT
	 *	@param number
	 */
	public void setOcrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ocrCnt = checkOcrCntMaxLimit(number); 
		serializeOcrCnt(ocrCnt);
	}
	

	public void setOcrCnt(long number) {
	    number = checkOcrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOcrCnt((int)number);
	}
	
	/**
	 * 	Update OcrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setOcrCnt(char[] value) throws CFException {
		 ocrCnt = serializeOcrCnt(value);
	}
	/**
	 * 	Update OcrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOcrCntString(char[] value) throws CFException {
		 setOcrCnt(value);
	}
	/**
	 *	Returns the value of thisPgmDb2CollIdBase300
	 *	@return thisPgmDb2CollIdBase300
	 */
   public char[] getThisPgmDb2CollIdBase300() throws CFException{
   		return thisPgmDb2CollIdBase300;
   }

  
	/**
	*  set variable thisPgmDb2CollIdBase300
	*  Corresponding COBOL Variable is 300-THIS-PGM-DB2-COLL-ID-BASE
	*  @param value
	**/
   public void setThisPgmDb2CollIdBase300(char[] value) {
       value = checkThisPgmDb2CollIdBase300Constraints(value);
       arraycopy(value,0,thisPgmDb2CollIdBase300,0,value.length);
   } 
	public void setThisPgmDb2CollIdBase300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,thisPgmDb2CollIdBase300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of db2ErrModule300
	 *	@return db2ErrModule300
	 */
   public char[] getDb2ErrModule300() throws CFException{
   		return db2ErrModule300;
   }

  
	/**
	*  set variable db2ErrModule300
	*  Corresponding COBOL Variable is 300-DB2-ERR-MODULE
	*  @param value
	**/
   public void setDb2ErrModule300(char[] value) {
       value = checkDb2ErrModule300Constraints(value);
       arraycopy(value,0,db2ErrModule300,0,value.length);
   } 
	public void setDb2ErrModule300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,db2ErrModule300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of outputCntMsg600
	 *	@return outputCntMsg600
	 */
   public char[] getOutputCntMsg600() throws CFException{
   		return outputCntMsg600;
   }

  
	/**
	*  set variable outputCntMsg600
	*  Corresponding COBOL Variable is 600-OUTPUT-CNT-MSG
	*  @param value
	**/
   public void setOutputCntMsg600(char[] value) {
       value = checkOutputCntMsg600Constraints(value);
       arraycopy(value,0,outputCntMsg600,0,value.length);
   } 
	public void setOutputCntMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,outputCntMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wsSqlcodeDisp800
	 *	@return wsSqlcodeDisp800
	 */
   public char[] getWsSqlcodeDisp800() throws CFException{
     if (isWsSqlcodeDisp800Modified()) { 
        wsSqlcodeDisp800 = refreshWsSqlcodeDisp800();
     }
   		return wsSqlcodeDisp800;
   }

  
	/**
	*  set variable wsSqlcodeDisp800
	*  Corresponding COBOL Variable is 800-WS-SQLCODE-DISP
	*  @param value
	**/
   public void setWsSqlcodeDisp800(char[] value) {
      wsSqlcodeDisp800 = checkWsSqlcodeDisp800Constraints(value);
      serializeWsSqlcodeDisp800(wsSqlcodeDisp800);
   } 

     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsSqlcodeDisp800,wsSqlcodeDisp800.length);
   	
   }
   
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsSqlcodeDisp800,wsSqlcodeDisp800.length);
   	
   }
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsSqlcodeDisp800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsSqlcodeDisp800 with another Field
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source) {
       replace(source,0,source.length(),beginWsSqlcodeDisp800,WS_SQLCODE_DISP_800_LEN);
   	
   }  
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsSqlcodeDisp800,WS_SQLCODE_DISP_800_LEN);
   	
   }
   
     /**
	 * 	Update WsSqlcodeDisp800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsSqlcodeDisp800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsSqlcodeDisp800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsCurrParagraph800
	 *	@return wsCurrParagraph800
	 */
   public char[] getWsCurrParagraph800() throws CFException{
   		return wsCurrParagraph800;
   }

  
	/**
	*  set variable wsCurrParagraph800
	*  Corresponding COBOL Variable is 800-WS-CURR-PARAGRAPH
	*  @param value
	**/
   public void setWsCurrParagraph800(char[] value) {
       value = checkWsCurrParagraph800Constraints(value);
       arraycopy(value,0,wsCurrParagraph800,0,value.length);
   } 
	public void setWsCurrParagraph800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wsCurrParagraph800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wsSqlFunction800
	 *	@return wsSqlFunction800
	 */
   public char[] getWsSqlFunction800() throws CFException{
   		return wsSqlFunction800;
   }

  
	/**
	*  set variable wsSqlFunction800
	*  Corresponding COBOL Variable is 800-WS-SQL-FUNCTION
	*  @param value
	**/
   public void setWsSqlFunction800(char[] value) {
       value = checkWsSqlFunction800Constraints(value);
       arraycopy(value,0,wsSqlFunction800,0,value.length);
   } 
	public void setWsSqlFunction800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wsSqlFunction800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wsCurrTable800
	 *	@return wsCurrTable800
	 */
   public char[] getWsCurrTable800() throws CFException{
   		return wsCurrTable800;
   }

  
	/**
	*  set variable wsCurrTable800
	*  Corresponding COBOL Variable is 800-WS-CURR-TABLE
	*  @param value
	**/
   public void setWsCurrTable800(char[] value) {
       value = checkWsCurrTable800Constraints(value);
       arraycopy(value,0,wsCurrTable800,0,value.length);
   } 
	public void setWsCurrTable800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wsCurrTable800,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
