package com.cloudframe.app.vsammon7.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon7.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private long i;

								private short j;

								private short q;

								private short r;

								private int rnCnt;

						private char[] eofSw = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setI(0L);
								setEofSw(fillSpace(1));
    }


 

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public long getI() throws CFException {
       if (isIModified()) { 
           i = refreshI();
        }
   		return i;
	}
	

	
	   
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is WS-I
	 *	@param number
	 */
	public void setI(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    i = checkIMaxLimit(number); 
		serializeI(i);
	}
	

	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value) throws CFException {
		 i = serializeI(value);
	}
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value) throws CFException {
		 setI(value);
	}
	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public short getJ() throws CFException {
   		return j;
	}
	
	/**
	 * 	Update J with the passed value
	 *  Corresponding COBOL Variable is WS-J
	 *	@param number
	 */
	public void setJ(short number) {
	     // Truncate if the number is beyond +/- Max range
	    j = checkJMaxLimit(number); 
	}

	public void setJ(int number) {
	    number = checkJMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setJ((short)number);
	}
	public void setJ(long number) {
	    number = checkJMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setJ((short)number);
	}
	

	/**
	 *	Returns the value of q
	 *	@return q
	 */
	public short getQ() throws CFException {
   		return q;
	}
	
	/**
	 * 	Update Q with the passed value
	 *  Corresponding COBOL Variable is Q
	 *	@param number
	 */
	public void setQ(short number) {
	     // Truncate if the number is beyond +/- Max range
	    q = checkQMaxLimit(number); 
	}

	public void setQ(int number) {
	    number = checkQMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setQ((short)number);
	}
	public void setQ(long number) {
	    number = checkQMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setQ((short)number);
	}
	

	/**
	 *	Returns the value of r
	 *	@return r
	 */
	public short getR() throws CFException {
   		return r;
	}
	
	/**
	 * 	Update R with the passed value
	 *  Corresponding COBOL Variable is R
	 *	@param number
	 */
	public void setR(short number) {
	     // Truncate if the number is beyond +/- Max range
	    r = checkRMaxLimit(number); 
	}

	public void setR(int number) {
	    number = checkRMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setR((short)number);
	}
	public void setR(long number) {
	    number = checkRMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setR((short)number);
	}
	

	/**
	 *	Returns the value of rnCnt
	 *	@return rnCnt
	 */
	public int getRnCnt() throws CFException {
       if (isRnCntModified()) { 
           rnCnt = refreshRnCnt();
        }
   		return rnCnt;
	}
	

	
	   
	/**
	 * 	Update RnCnt with the passed value
	 *  Corresponding COBOL Variable is WS-RN-CNT
	 *	@param number
	 */
	public void setRnCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rnCnt = checkRnCntMaxLimit(number); 
		serializeRnCnt(rnCnt);
	}
	

	public void setRnCnt(long number) {
	    number = checkRnCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRnCnt((int)number);
	}
	
	/**
	 * 	Update RnCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setRnCnt(char[] value) throws CFException {
		 rnCnt = serializeRnCnt(value);
	}
	/**
	 * 	Update RnCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRnCntString(char[] value) throws CFException {
		 setRnCnt(value);
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
	char[] endOfMonitor88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfMonitor()
	 *	@return  Returns true if isEndOfMonitor() is "Y"
	 */
   public boolean isEndOfMonitor() throws CFException {
      return (  compareChars( getEofSw() , endOfMonitor88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfMonitorTrue() {  			
    	setEofSw( endOfMonitor88Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
