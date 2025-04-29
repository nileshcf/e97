package com.cloudframe.app.read0004.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.read0004.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] bitmap1644 = new char[16];

						private char[] bitmap1240 = new char[16];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBitmap1644(getString(new byte[] {(byte)0x80,(byte)0x20,(byte)0x01,(byte)0x20,(byte)0x20,(byte)0x01,(byte)0x20,(byte)0x20,(byte)0x02,(byte)0x20,(byte)0x20,(byte)0x20,(byte)0x20,(byte)0x20,(byte)0x20,(byte)0x20}).toCharArray());
								setBitmap1240(getString(new byte[] {(byte)0xF0,(byte)0x10,(byte)0x05,(byte)0x42,(byte)0x85,(byte)0x61,(byte)0x80,(byte)0x02,(byte)0x02,(byte)0x20,(byte)0x20,(byte)0x04,(byte)0x20,(byte)0x20,(byte)0x20,(byte)0x20}).toCharArray());
    }


 

	/**
	 *	Returns the value of bitmap1644
	 *	@return bitmap1644
	 */
   public char[] getBitmap1644() throws CFException{
   		return bitmap1644;
   }

  
	/**
	*  set variable bitmap1644
	*  Corresponding COBOL Variable is WS-BITMAP-1644
	*  @param value
	**/
   public void setBitmap1644(char[] value) {
       value = checkBitmap1644Constraints(value);
       arraycopy(value,0,bitmap1644,0,value.length);
   } 
	public void setBitmap1644(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bitmap1644,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bitmap1240
	 *	@return bitmap1240
	 */
   public char[] getBitmap1240() throws CFException{
   		return bitmap1240;
   }

  
	/**
	*  set variable bitmap1240
	*  Corresponding COBOL Variable is WS-BITMAP-1240
	*  @param value
	**/
   public void setBitmap1240(char[] value) {
       value = checkBitmap1240Constraints(value);
       arraycopy(value,0,bitmap1240,0,value.length);
   } 
	public void setBitmap1240(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bitmap1240,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
