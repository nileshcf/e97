package com.cloudframe.app.vsammon4.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/


import com.cloudframe.app.vsammon4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private long vskRecordSize;

						private char[] startKeytype = Field.fillLowValue(15);

								private short sub1;

								private long taskNo;

								private long reqSize;

								private int openFlags;

								private long primaryKeyDisp;

						private char[] vsamRecordDisp = Field.fillLowValue(221);

						private char[] vsvksdsFileStatus = Field.fillLowValue(2);

						private char[] eofSw = new char[1];

						private char[] charstr = new char[252];

						private char[] numstr = new char[200];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setVskRecordSize(0L);
								setEofSw(fillSpace(1));
								setCharstr("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()-_=+/?\\.,/{}|ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()-_=+/?\\.,/{}|ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()-_=+/?\\.,/{}|".toCharArray());
								setNumstr("01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789".toCharArray());
    }


 

	/**
	 *	Returns the value of vskRecordSize
	 *	@return vskRecordSize
	 */
	public long getVskRecordSize() throws CFException {
   		return vskRecordSize;
	}
	
	/**
	 * 	Update VskRecordSize with the passed value
	 *  Corresponding COBOL Variable is VSK-RECORD-SIZE
	 *	@param number
	 */
	public void setVskRecordSize(long number) {
	     // Truncate if the number is beyond +/- Max range
	    vskRecordSize = checkVskRecordSizeMaxLimit(number); 
	}


	/**
	 *	Returns the value of startKeytype
	 *	@return startKeytype
	 */
   public char[] getStartKeytype() throws CFException{
   		return startKeytype;
   }

  
	/**
	*  set variable startKeytype
	*  Corresponding COBOL Variable is WS-START-KEYTYPE
	*  @param value
	**/
   public void setStartKeytype(char[] value) {
       value = checkStartKeytypeConstraints(value);
       arraycopy(value,0,startKeytype,0,value.length);
   } 
	public void setStartKeytype(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,startKeytype,0,beginIndex + endIndex);
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
	 *	Returns the value of taskNo
	 *	@return taskNo
	 */
	public long getTaskNo() throws CFException {
       if (isTaskNoModified()) { 
           taskNo = refreshTaskNo();
        }
   		return taskNo;
	}
	

	
	   
	/**
	 * 	Update TaskNo with the passed value
	 *  Corresponding COBOL Variable is WS-TASK-NO
	 *	@param number
	 */
	public void setTaskNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    taskNo = checkTaskNoMaxLimit(number); 
		serializeTaskNo(taskNo);
	}
	

	/**
	 * 	Update TaskNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setTaskNo(char[] value) throws CFException {
		 taskNo = serializeTaskNo(value);
	}
	/**
	 * 	Update TaskNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTaskNoString(char[] value) throws CFException {
		 setTaskNo(value);
	}
	/**
	 *	Returns the value of reqSize
	 *	@return reqSize
	 */
	public long getReqSize() throws CFException {
       if (isReqSizeModified()) { 
           reqSize = refreshReqSize();
        }
   		return reqSize;
	}
	

	
	   
	/**
	 * 	Update ReqSize with the passed value
	 *  Corresponding COBOL Variable is WS-REQ-SIZE
	 *	@param number
	 */
	public void setReqSize(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    reqSize = checkReqSizeMaxLimit(number); 
		serializeReqSize(reqSize);
	}
	

	/**
	 * 	Update ReqSize with the passed value
	 *	@param value (String or char[])
	 */
	public void setReqSize(char[] value) throws CFException {
		 reqSize = serializeReqSize(value);
	}
	/**
	 * 	Update ReqSize with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReqSizeString(char[] value) throws CFException {
		 setReqSize(value);
	}
	/**
	 *	Returns the value of openFlags
	 *	@return openFlags
	 */
	public int getOpenFlags() throws CFException {
       if (isOpenFlagsModified()) { 
           openFlags = refreshOpenFlags();
        }
   		return openFlags;
	}
	

	
	   
	/**
	 * 	Update OpenFlags with the passed value
	 *  Corresponding COBOL Variable is OPEN-FLAGS
	 *	@param number
	 */
	public void setOpenFlags(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    openFlags = checkOpenFlagsMaxLimit(number); 
		serializeOpenFlags(openFlags);
	}
	

	public void setOpenFlags(long number) {
	    number = checkOpenFlagsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOpenFlags((int)number);
	}
	
	/**
	 * 	Update OpenFlags with the passed value
	 *	@param value (String or char[])
	 */
	public void setOpenFlags(char[] value) throws CFException {
		 openFlags = serializeOpenFlags(value);
	}
	/**
	 * 	Update OpenFlags with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOpenFlagsString(char[] value) throws CFException {
		 setOpenFlags(value);
	}
	
	/**
	 *	Test condition 0 for isSeqMode()
	 *	@return  Returns true if isSeqMode() is 0
	 */
   public boolean isSeqMode() throws CFException {
      return (  getOpenFlags()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSeqModeTrue() {  			
    	setOpenFlags( 0);
   	}
	
	/**
	 *	Test condition 1 for isDynMode()
	 *	@return  Returns true if isDynMode() is 1
	 */
   public boolean isDynMode() throws CFException {
      return (  getOpenFlags()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setDynModeTrue() {  			
    	setOpenFlags( 1);
   	}
	/**
	 *	Returns the value of primaryKeyDisp
	 *	@return primaryKeyDisp
	 */
	public long getPrimaryKeyDisp() throws CFException {
       if (isPrimaryKeyDispModified()) { 
           primaryKeyDisp = refreshPrimaryKeyDisp();
        }
   		return primaryKeyDisp;
	}
	

	
	   
	/**
	 * 	Update PrimaryKeyDisp with the passed value
	 *  Corresponding COBOL Variable is PRIMARY-KEY-DISP
	 *	@param number
	 */
	public void setPrimaryKeyDisp(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    primaryKeyDisp = checkPrimaryKeyDispMaxLimit(number); 
		serializePrimaryKeyDisp(primaryKeyDisp);
	}
	

	/**
	 * 	Update PrimaryKeyDisp with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrimaryKeyDisp(char[] value) throws CFException {
		 primaryKeyDisp = serializePrimaryKeyDisp(value);
	}
	/**
	 * 	Update PrimaryKeyDisp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrimaryKeyDispString(char[] value) throws CFException {
		 setPrimaryKeyDisp(value);
	}
	/**
	 *	Returns the value of vsamRecordDisp
	 *	@return vsamRecordDisp
	 */
   public char[] getVsamRecordDisp() throws CFException{
   		return vsamRecordDisp;
   }

  
	/**
	*  set variable vsamRecordDisp
	*  Corresponding COBOL Variable is VSAM-RECORD-DISP
	*  @param value
	**/
   public void setVsamRecordDisp(char[] value) {
       value = checkVsamRecordDispConstraints(value);
       arraycopy(value,0,vsamRecordDisp,0,value.length);
   } 
	public void setVsamRecordDisp(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vsamRecordDisp,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of vsvksdsFileStatus
	 *	@return vsvksdsFileStatus
	 */
   public char[] getVsvksdsFileStatus() throws CFException{
   		return vsvksdsFileStatus;
   }

  
	/**
	*  set variable vsvksdsFileStatus
	*  Corresponding COBOL Variable is VSVKSDS-FILE-STATUS
	*  @param value
	**/
   public void setVsvksdsFileStatus(char[] value) {
       value = checkVsvksdsFileStatusConstraints(value);
       arraycopy(value,0,vsvksdsFileStatus,0,value.length);
   } 
	public void setVsvksdsFileStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vsvksdsFileStatus,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException{
   		return eofSw;
   }

  
	/**
	*  set variable eofSw
	*  Corresponding COBOL Variable is WS-EOF-SW
	*  @param value
	**/
   public void setEofSw(char[] value) {
       value = checkEofSwConstraints(value);
       arraycopy(value,0,eofSw,0,value.length);
   } 
	public void setEofSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofSw,0,beginIndex + endIndex);
   }
	char[] endOfVsvksds88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfVsvksds()
	 *	@return  Returns true if isEndOfVsvksds() is "Y"
	 */
   public boolean isEndOfVsvksds() throws CFException {
      return (  compareChars( getEofSw() , endOfVsvksds88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfVsvksdsTrue() {  			
    	setEofSw( endOfVsvksds88Value);
   	}
	/**
	 *	Returns the value of charstr
	 *	@return charstr
	 */
   public char[] getCharstr() throws CFException{
   		return charstr;
   }

  
	/**
	*  set variable charstr
	*  Corresponding COBOL Variable is WS-CHARSTR
	*  @param value
	**/
   public void setCharstr(char[] value) {
       value = checkCharstrConstraints(value);
       arraycopy(value,0,charstr,0,value.length);
   } 
	public void setCharstr(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charstr,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of numstr
	 *	@return numstr
	 */
   public char[] getNumstr() throws CFException{
   		return numstr;
   }

  
	/**
	*  set variable numstr
	*  Corresponding COBOL Variable is WS-NUMSTR
	*  @param value
	**/
   public void setNumstr(char[] value) {
       value = checkNumstrConstraints(value);
       arraycopy(value,0,numstr,0,value.length);
   } 
	public void setNumstr(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,numstr,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
