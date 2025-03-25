package org.optum.uhg.dto.cfwidget;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:10. using version 5.0.0.158
**/


import org.optum.uhg.dto.serialize.cfwidget.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

						private char[] loSupplier = Field.fillLowValue(8);

						private char[] hiSupplier = Field.fillLowValue(8);

						private char[] timestamp = Field.fillLowValue(26);

						private char[] dateR = new char[10];

						private char[] timeR = new char[12];

						private char[] errPgm = new char[6];

						private char[] errLoc = new char[20];

						private char[] errMsg = new char[30];

								private long errCode;

						private char[] eofFlag = new char[1];

								private int writeRec;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDateR(fillSpace(10));
								setTimeR(("-           ").toCharArray());
								setErrPgm(("DB2REP").toCharArray());
								setErrLoc(fillSpace(20));
								setErrMsg(fillSpace(30));
								setErrCode(0L);
								setEofFlag(("N").toCharArray());
								setWriteRec(0);
    }


 

	/**
	 *	Returns the value of loSupplier
	 *	@return loSupplier
	 */
   public char[] getLoSupplier() throws CFException{
   		return loSupplier;
   }

  
	/**
	*  set variable loSupplier
	*  Corresponding COBOL Variable is LO-SUPPLIER
	*  @param value
	**/
   public void setLoSupplier(char[] value) {
       value = checkLoSupplierConstraints(value);
       arraycopy(value,0,loSupplier,0,value.length);
   } 
	public void setLoSupplier(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,loSupplier,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hiSupplier
	 *	@return hiSupplier
	 */
   public char[] getHiSupplier() throws CFException{
   		return hiSupplier;
   }

  
	/**
	*  set variable hiSupplier
	*  Corresponding COBOL Variable is HI-SUPPLIER
	*  @param value
	**/
   public void setHiSupplier(char[] value) {
       value = checkHiSupplierConstraints(value);
       arraycopy(value,0,hiSupplier,0,value.length);
   } 
	public void setHiSupplier(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hiSupplier,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of timestamp
	 *	@return timestamp
	 */
   public char[] getTimestamp() throws CFException{
   		return timestamp;
   }

  
	/**
	*  set variable timestamp
	*  Corresponding COBOL Variable is WS-TIMESTAMP
	*  @param value
	**/
   public void setTimestamp(char[] value) {
       value = checkTimestampConstraints(value);
       arraycopy(value,0,timestamp,0,value.length);
   } 
	public void setTimestamp(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,timestamp,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dateR
	 *	@return dateR
	 */
   public char[] getDateR() throws CFException{
   		return dateR;
   }

  
	/**
	*  set variable dateR
	*  Corresponding COBOL Variable is WS-DATE-R
	*  @param value
	**/
   public void setDateR(char[] value) {
       value = checkDateRConstraints(value);
       arraycopy(value,0,dateR,0,value.length);
   } 
	public void setDateR(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dateR,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of timeR
	 *	@return timeR
	 */
   public char[] getTimeR() throws CFException{
   		return timeR;
   }

  
	/**
	*  set variable timeR
	*  Corresponding COBOL Variable is WS-TIME-R
	*  @param value
	**/
   public void setTimeR(char[] value) {
       value = checkTimeRConstraints(value);
       arraycopy(value,0,timeR,0,value.length);
   } 
	public void setTimeR(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,timeR,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errPgm
	 *	@return errPgm
	 */
   public char[] getErrPgm() throws CFException{
   		return errPgm;
   }

  
	/**
	*  set variable errPgm
	*  Corresponding COBOL Variable is ERR-PGM
	*  @param value
	**/
   public void setErrPgm(char[] value) {
       value = checkErrPgmConstraints(value);
       arraycopy(value,0,errPgm,0,value.length);
   } 
	public void setErrPgm(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errPgm,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException{
   		return errLoc;
   }

  
	/**
	*  set variable errLoc
	*  Corresponding COBOL Variable is ERR-LOC
	*  @param value
	**/
   public void setErrLoc(char[] value) {
       value = checkErrLocConstraints(value);
       arraycopy(value,0,errLoc,0,value.length);
   } 
	public void setErrLoc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errLoc,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException{
   		return errMsg;
   }

  
	/**
	*  set variable errMsg
	*  Corresponding COBOL Variable is ERR-MSG
	*  @param value
	**/
   public void setErrMsg(char[] value) {
       value = checkErrMsgConstraints(value);
       arraycopy(value,0,errMsg,0,value.length);
   } 
	public void setErrMsg(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errCode
	 *	@return errCode
	 */
	public long getErrCode() throws CFException {
       if (isErrCodeModified()) { 
           errCode = refreshErrCode();
        }
   		return errCode;
	}
	

	
	   
	/**
	 * 	Update ErrCode with the passed value
	 *  Corresponding COBOL Variable is ERR-CODE
	 *	@param number
	 */
	public void setErrCode(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    errCode = checkErrCodeMaxLimit(number); 
		serializeErrCode(errCode);
	}
	

	/**
	 * 	Update ErrCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrCode(char[] value) throws CFException {
		 errCode = serializeErrCode(value);
	}
	/**
	 * 	Update ErrCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrCodeString(char[] value) throws CFException {
		 setErrCode(value);
	}
	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
   public char[] getEofFlag() throws CFException{
   		return eofFlag;
   }

  
	/**
	*  set variable eofFlag
	*  Corresponding COBOL Variable is EOF-FLAG
	*  @param value
	**/
   public void setEofFlag(char[] value) {
       value = checkEofFlagConstraints(value);
       arraycopy(value,0,eofFlag,0,value.length);
   } 
	public void setEofFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofFlag,0,beginIndex + endIndex);
   }
	char[] endOfFile88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfFile()
	 *	@return  Returns true if isEndOfFile() is "Y"
	 */
   public boolean isEndOfFile() throws CFException {
      return (  compareChars( getEofFlag() , endOfFile88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfFileTrue() {  			
    	setEofFlag( endOfFile88Value);
   	}
	/**
	 *	Returns the value of writeRec
	 *	@return writeRec
	 */
	public int getWriteRec() throws CFException {
       if (isWriteRecModified()) { 
           writeRec = refreshWriteRec();
        }
   		return writeRec;
	}
	

	
	   
	/**
	 * 	Update WriteRec with the passed value
	 *  Corresponding COBOL Variable is WS-WRITE-REC
	 *	@param number
	 */
	public void setWriteRec(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    writeRec = checkWriteRecMaxLimit(number); 
		serializeWriteRec(writeRec);
	}
	

	public void setWriteRec(long number) {
	    number = checkWriteRecMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWriteRec((int)number);
	}
	
	/**
	 * 	Update WriteRec with the passed value
	 *	@param value (String or char[])
	 */
	public void setWriteRec(char[] value) throws CFException {
		 writeRec = serializeWriteRec(value);
	}
	/**
	 * 	Update WriteRec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWriteRecString(char[] value) throws CFException {
		 setWriteRec(value);
	}
	
	/**
	 *	Test condition 0 for isWriteRec88()
	 *	@return  Returns true if isWriteRec88() is 0
	 */
   public boolean isWriteRec88() throws CFException {
      return (  getWriteRec()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setWriteRec88True() {  			
    	setWriteRec( 0);
   	}
	
	/**
	 *	Test condition 1 for isDontWriteRec88()
	 *	@return  Returns true if isDontWriteRec88() is 1
	 */
   public boolean isDontWriteRec88() throws CFException {
      return (  getWriteRec()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setDontWriteRec88True() {  			
    	setWriteRec( 1);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
