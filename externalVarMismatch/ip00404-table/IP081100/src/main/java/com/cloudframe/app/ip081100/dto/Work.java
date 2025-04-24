package com.cloudframe.app.ip081100.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip081100.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

						private char[] isItTheFirstTime100 = new char[1];

						private char[] pgmIp081050300 = new char[8];

						private char[] pgmIp081100300 = new char[8];

						private char[] pgmIp280010300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] pgmVersion300 = new char[7];

						private char[] ptrIp081050800 = new char[8];

						private char[] ptrIp280010800 = new char[8];

						private char[] ptrIp996010800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setPgmIp081050300(("IP081050").toCharArray());
								setPgmIp081100300(("IP081100").toCharArray());
								setPgmIp280010300(("IP280010").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xD7,(byte)0x2D,(byte)0x00,(byte)0xF5,(byte)0x22,(byte)0x00}).toCharArray());
								setPtrIp081050800(("IP081050").toCharArray());
								setPtrIp280010800(("IP280010").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
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
	 *	Returns the value of pgmIp081050300
	 *	@return pgmIp081050300
	 */
   public char[] getPgmIp081050300() throws CFException{
   		return pgmIp081050300;
   }

  
	/**
	*  set variable pgmIp081050300
	*  Corresponding COBOL Variable is 300-PGM-IP081050
	*  @param value
	**/
   public void setPgmIp081050300(char[] value) {
       value = checkPgmIp081050300Constraints(value);
       arraycopy(value,0,pgmIp081050300,0,value.length);
   } 
	public void setPgmIp081050300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp081050300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp081100300
	 *	@return pgmIp081100300
	 */
   public char[] getPgmIp081100300() throws CFException{
   		return pgmIp081100300;
   }

  
	/**
	*  set variable pgmIp081100300
	*  Corresponding COBOL Variable is 300-PGM-IP081100
	*  @param value
	**/
   public void setPgmIp081100300(char[] value) {
       value = checkPgmIp081100300Constraints(value);
       arraycopy(value,0,pgmIp081100300,0,value.length);
   } 
	public void setPgmIp081100300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp081100300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp280010300
	 *	@return pgmIp280010300
	 */
   public char[] getPgmIp280010300() throws CFException{
   		return pgmIp280010300;
   }

  
	/**
	*  set variable pgmIp280010300
	*  Corresponding COBOL Variable is 300-PGM-IP280010
	*  @param value
	**/
   public void setPgmIp280010300(char[] value) {
       value = checkPgmIp280010300Constraints(value);
       arraycopy(value,0,pgmIp280010300,0,value.length);
   } 
	public void setPgmIp280010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp280010300,0,beginIndex + endIndex);
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
	 *	Returns the value of ptrIp081050800
	 *	@return ptrIp081050800
	 */
   public char[] getPtrIp081050800() throws CFException{
   		return ptrIp081050800;
   }

  
	/**
	*  set variable ptrIp081050800
	*  Corresponding COBOL Variable is 800-PTR-IP081050
	*  @param value
	**/
   public void setPtrIp081050800(char[] value) {
       value = checkPtrIp081050800Constraints(value);
       arraycopy(value,0,ptrIp081050800,0,value.length);
   } 
	public void setPtrIp081050800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp081050800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp280010800
	 *	@return ptrIp280010800
	 */
   public char[] getPtrIp280010800() throws CFException{
   		return ptrIp280010800;
   }

  
	/**
	*  set variable ptrIp280010800
	*  Corresponding COBOL Variable is 800-PTR-IP280010
	*  @param value
	**/
   public void setPtrIp280010800(char[] value) {
       value = checkPtrIp280010800Constraints(value);
       arraycopy(value,0,ptrIp280010800,0,value.length);
   } 
	public void setPtrIp280010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp280010800,0,beginIndex + endIndex);
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

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
