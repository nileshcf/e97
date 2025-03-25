package org.optum.uhg.dto.cics0012;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:12. using version 5.0.0.158
**/


import org.optum.uhg.dto.serialize.cics0012.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

								private short i;

						private char[] eofSw = new char[1];

								private int keylen;

						private char[] vssecu00 = new char[8];

						private char[] vssecu01 = new char[8];

						private char[] vssecu02 = new char[8];

						private char[] vssecu03 = new char[8];

						private char[] vssecu04 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setEofSw(fillSpace(1));
								setVssecu00(("VSSECU00").toCharArray());
								setVssecu01(("VSSECU01").toCharArray());
								setVssecu02(("VSSECU02").toCharArray());
								setVssecu03(("VSSECU03").toCharArray());
								setVssecu04(("VSSECU04").toCharArray());
    }


 

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {
   		return i;
	}
	
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is WS-I
	 *	@param number
	 */
	public void setI(short number) {
	     // Truncate if the number is beyond +/- Max range
	    i = checkIMaxLimit(number); 
	}

	public void setI(int number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	public void setI(long number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
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
	char[] endOfFile88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfFile()
	 *	@return  Returns true if isEndOfFile() is "Y"
	 */
   public boolean isEndOfFile() throws CFException {
      return (  compareChars( getEofSw() , endOfFile88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfFileTrue() {  			
    	setEofSw( endOfFile88Value);
   	}
	/**
	 *	Returns the value of keylen
	 *	@return keylen
	 */
	public int getKeylen() throws CFException {
   		return keylen;
	}
	
	/**
	 * 	Update Keylen with the passed value
	 *  Corresponding COBOL Variable is WS-KEYLEN
	 *	@param number
	 */
	public void setKeylen(int number) {
	     // Truncate if the number is beyond +/- Max range
	    keylen = checkKeylenMaxLimit(number); 
	}


	public void setKeylen(long number) {
	    number = checkKeylenMaxLimit(number); // Truncate if value is beyond +/- Max range
		setKeylen((int)number);
	}
	
	/**
	 *	Returns the value of vssecu00
	 *	@return vssecu00
	 */
   public char[] getVssecu00() throws CFException{
   		return vssecu00;
   }

  
	/**
	*  set variable vssecu00
	*  Corresponding COBOL Variable is VSSECU00
	*  @param value
	**/
   public void setVssecu00(char[] value) {
       value = checkVssecu00Constraints(value);
       arraycopy(value,0,vssecu00,0,value.length);
   } 
	public void setVssecu00(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vssecu00,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of vssecu01
	 *	@return vssecu01
	 */
   public char[] getVssecu01() throws CFException{
   		return vssecu01;
   }

  
	/**
	*  set variable vssecu01
	*  Corresponding COBOL Variable is VSSECU01
	*  @param value
	**/
   public void setVssecu01(char[] value) {
       value = checkVssecu01Constraints(value);
       arraycopy(value,0,vssecu01,0,value.length);
   } 
	public void setVssecu01(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vssecu01,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of vssecu02
	 *	@return vssecu02
	 */
   public char[] getVssecu02() throws CFException{
   		return vssecu02;
   }

  
	/**
	*  set variable vssecu02
	*  Corresponding COBOL Variable is VSSECU02
	*  @param value
	**/
   public void setVssecu02(char[] value) {
       value = checkVssecu02Constraints(value);
       arraycopy(value,0,vssecu02,0,value.length);
   } 
	public void setVssecu02(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vssecu02,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of vssecu03
	 *	@return vssecu03
	 */
   public char[] getVssecu03() throws CFException{
   		return vssecu03;
   }

  
	/**
	*  set variable vssecu03
	*  Corresponding COBOL Variable is VSSECU03
	*  @param value
	**/
   public void setVssecu03(char[] value) {
       value = checkVssecu03Constraints(value);
       arraycopy(value,0,vssecu03,0,value.length);
   } 
	public void setVssecu03(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vssecu03,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of vssecu04
	 *	@return vssecu04
	 */
   public char[] getVssecu04() throws CFException{
   		return vssecu04;
   }

  
	/**
	*  set variable vssecu04
	*  Corresponding COBOL Variable is VSSECU04
	*  @param value
	**/
   public void setVssecu04(char[] value) {
       value = checkVssecu04Constraints(value);
       arraycopy(value,0,vssecu04,0,value.length);
   } 
	public void setVssecu04(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vssecu04,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
