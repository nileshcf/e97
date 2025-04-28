package com.cloudframe.app.ip313010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:04. using version 5.0.0.256
**/


import com.cloudframe.app.ip313010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] saveTableId100 = Field.fillLowValue(8);

						private char[] saveEffDate100 = Field.fillLowValue(10);

						private char[] isItTheFirstTime100 = new char[1];

						private char[] ip313010300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] pgmVersion300 = new char[7];

						private char[] ptrIp996010800 = new char[8];

								private int length800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setIp313010300(("IP313010").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xD6,(byte)0x63,(byte)0x01,(byte)0x19,(byte)0x79,(byte)0x00}).toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setLength800(0);
    }


 

	/**
	 *	Returns the value of saveTableId100
	 *	@return saveTableId100
	 */
   public char[] getSaveTableId100() throws CFException{
   		return saveTableId100;
   }

  
	/**
	*  set variable saveTableId100
	*  Corresponding COBOL Variable is 100-SAVE-TABLE-ID
	*  @param value
	**/
   public void setSaveTableId100(char[] value) {
       value = checkSaveTableId100Constraints(value);
       arraycopy(value,0,saveTableId100,0,value.length);
   } 
	public void setSaveTableId100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,saveTableId100,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of saveEffDate100
	 *	@return saveEffDate100
	 */
   public char[] getSaveEffDate100() throws CFException{
   		return saveEffDate100;
   }

  
	/**
	*  set variable saveEffDate100
	*  Corresponding COBOL Variable is 100-SAVE-EFF-DATE
	*  @param value
	**/
   public void setSaveEffDate100(char[] value) {
       value = checkSaveEffDate100Constraints(value);
       arraycopy(value,0,saveEffDate100,0,value.length);
   } 
	public void setSaveEffDate100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,saveEffDate100,0,beginIndex + endIndex);
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
	 *	Returns the value of ip313010300
	 *	@return ip313010300
	 */
   public char[] getIp313010300() throws CFException{
   		return ip313010300;
   }

  
	/**
	*  set variable ip313010300
	*  Corresponding COBOL Variable is 300-IP313010
	*  @param value
	**/
   public void setIp313010300(char[] value) {
       value = checkIp313010300Constraints(value);
       arraycopy(value,0,ip313010300,0,value.length);
   } 
	public void setIp313010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ip313010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp996010300
	 *	@return pgmIp996010300
	 */
   public char[] getPgmIp996010300() throws CFException{
   		return pgmIp996010300;
   }

  
	/**
	*  set variable pgmIp996010300
	*  Corresponding COBOL Variable is 300-PGM-IP996010
	*  @param value
	**/
   public void setPgmIp996010300(char[] value) {
       value = checkPgmIp996010300Constraints(value);
       arraycopy(value,0,pgmIp996010300,0,value.length);
   } 
	public void setPgmIp996010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp996010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException{
   		return pgmVersion300;
   }

  
	/**
	*  set variable pgmVersion300
	*  Corresponding COBOL Variable is 300-PGM-VERSION
	*  @param value
	**/
   public void setPgmVersion300(char[] value) {
       value = checkPgmVersion300Constraints(value);
       arraycopy(value,0,pgmVersion300,0,value.length);
   } 
	public void setPgmVersion300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmVersion300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp996010800
	 *	@return ptrIp996010800
	 */
   public char[] getPtrIp996010800() throws CFException{
   		return ptrIp996010800;
   }

  
	/**
	*  set variable ptrIp996010800
	*  Corresponding COBOL Variable is 800-PTR-IP996010
	*  @param value
	**/
   public void setPtrIp996010800(char[] value) {
       value = checkPtrIp996010800Constraints(value);
       arraycopy(value,0,ptrIp996010800,0,value.length);
   } 
	public void setPtrIp996010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp996010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public int getLength800() throws CFException {
   		return length800;
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *  Corresponding COBOL Variable is 800-LENGTH
	 *	@param number
	 */
	public void setLength800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    length800 = checkLength800MaxLimit(number); 
	}


	public void setLength800(long number) {
	    number = checkLength800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLength800((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
