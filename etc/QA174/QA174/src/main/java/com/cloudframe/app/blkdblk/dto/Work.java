package com.cloudframe.app.blkdblk.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:08. using version 5.0.0.256
**/


import com.cloudframe.app.blkdblk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] umodeBuffer = Field.fillLowValue(40000);

								private long umodePos;

								private long umodeLen;

								private long umodeCnt;

								private long vbsCnt;

								private long umodeMessageLen;

						private char[] umodeFileStatus = Field.fillLowValue(2);

						private char[] vbsFileStatus = Field.fillLowValue(2);

								private long ip66102IpmMsgLngth;

								private int i;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setI(0);
    }


 

	/**
	 *	Returns the value of umodeBuffer
	 *	@return umodeBuffer
	 */
   public char[] getUmodeBuffer() throws CFException{
   		return umodeBuffer;
   }

  
	/**
	*  set variable umodeBuffer
	*  Corresponding COBOL Variable is UMODE-BUFFER
	*  @param value
	**/
   public void setUmodeBuffer(char[] value) {
       value = checkUmodeBufferConstraints(value);
       arraycopy(value,0,umodeBuffer,0,value.length);
   } 
	public void setUmodeBuffer(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,umodeBuffer,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of umodePos
	 *	@return umodePos
	 */
	public long getUmodePos() throws CFException {
   		return umodePos;
	}
	
	/**
	 * 	Update UmodePos with the passed value
	 *  Corresponding COBOL Variable is UMODE-POS
	 *	@param number
	 */
	public void setUmodePos(long number) {
	     // Truncate if the number is beyond +/- Max range
	    umodePos = checkUmodePosMaxLimit(number); 
	}


	/**
	 *	Returns the value of umodeLen
	 *	@return umodeLen
	 */
	public long getUmodeLen() throws CFException {
   		return umodeLen;
	}
	
	/**
	 * 	Update UmodeLen with the passed value
	 *  Corresponding COBOL Variable is UMODE-LEN
	 *	@param number
	 */
	public void setUmodeLen(long number) {
	     // Truncate if the number is beyond +/- Max range
	    umodeLen = checkUmodeLenMaxLimit(number); 
	}


	/**
	 *	Returns the value of umodeCnt
	 *	@return umodeCnt
	 */
	public long getUmodeCnt() throws CFException {
   		return umodeCnt;
	}
	
	/**
	 * 	Update UmodeCnt with the passed value
	 *  Corresponding COBOL Variable is UMODE-CNT
	 *	@param number
	 */
	public void setUmodeCnt(long number) {
	     // Truncate if the number is beyond +/- Max range
	    umodeCnt = checkUmodeCntMaxLimit(number); 
	}


	/**
	 *	Returns the value of vbsCnt
	 *	@return vbsCnt
	 */
	public long getVbsCnt() throws CFException {
   		return vbsCnt;
	}
	
	/**
	 * 	Update VbsCnt with the passed value
	 *  Corresponding COBOL Variable is VBS-CNT
	 *	@param number
	 */
	public void setVbsCnt(long number) {
	     // Truncate if the number is beyond +/- Max range
	    vbsCnt = checkVbsCntMaxLimit(number); 
	}


	/**
	 *	Returns the value of umodeMessageLen
	 *	@return umodeMessageLen
	 */
	public long getUmodeMessageLen() throws CFException {
   		return umodeMessageLen;
	}
	
	/**
	 * 	Update UmodeMessageLen with the passed value
	 *  Corresponding COBOL Variable is UMODE-MESSAGE-LEN
	 *	@param number
	 */
	public void setUmodeMessageLen(long number) {
	     // Truncate if the number is beyond +/- Max range
	    umodeMessageLen = checkUmodeMessageLenMaxLimit(number); 
	}


	/**
	 *	Returns the value of umodeFileStatus
	 *	@return umodeFileStatus
	 */
   public char[] getUmodeFileStatus() throws CFException{
   		return umodeFileStatus;
   }

  
	/**
	*  set variable umodeFileStatus
	*  Corresponding COBOL Variable is WS-UMODE-FILE-STATUS
	*  @param value
	**/
   public void setUmodeFileStatus(char[] value) {
       value = checkUmodeFileStatusConstraints(value);
       arraycopy(value,0,umodeFileStatus,0,value.length);
   } 
	public void setUmodeFileStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,umodeFileStatus,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of vbsFileStatus
	 *	@return vbsFileStatus
	 */
   public char[] getVbsFileStatus() throws CFException{
   		return vbsFileStatus;
   }

  
	/**
	*  set variable vbsFileStatus
	*  Corresponding COBOL Variable is WS-VBS-FILE-STATUS
	*  @param value
	**/
   public void setVbsFileStatus(char[] value) {
       value = checkVbsFileStatusConstraints(value);
       arraycopy(value,0,vbsFileStatus,0,value.length);
   } 
	public void setVbsFileStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vbsFileStatus,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ip66102IpmMsgLngth
	 *	@return ip66102IpmMsgLngth
	 */
	public long getIp66102IpmMsgLngth() throws CFException {
   		return ip66102IpmMsgLngth;
	}
	
	/**
	 * 	Update Ip66102IpmMsgLngth with the passed value
	 *  Corresponding COBOL Variable is IP66102-IPM-MSG-LNGTH
	 *	@param number
	 */
	public void setIp66102IpmMsgLngth(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66102IpmMsgLngth = checkIp66102IpmMsgLngthMaxLimit(number); 
	}


	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
   		return i;
	}
	
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is I
	 *	@param number
	 */
	public void setI(int number) {
	     // Truncate if the number is beyond +/- Max range
	    i = checkIMaxLimit(number); 
	}


	public void setI(long number) {
	    number = checkIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setI((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
