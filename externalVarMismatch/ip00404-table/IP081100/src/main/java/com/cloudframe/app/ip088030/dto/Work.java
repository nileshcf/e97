package com.cloudframe.app.ip088030.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip088030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] isTxnQualify100 = new char[1];

						private char[] isMccFound100 = new char[1];

						private char[] isMaidFound100 = new char[1];

						private char[] isArRecFound100 = new char[1];

						private char[] isEndOfLoop100 = new char[1];

						private char[] isIchgCalculated100 = new char[1];

						private char[] sys001FileStatus200 = new char[2];

						private char[] sys002FileStatus200 = new char[2];

						private char[] sys201FileStatus200 = new char[2];

						private char[] pgmId300 = new char[8];

						private char[] pgmVersion300 = new char[7];

						private char[] pgmIp610010300 = new char[8];

						private char[] pgmIp081110300 = new char[8];

						private char[] pgmIp280010300 = new char[8];

						private char[] pgmIp280510300 = new char[8];

						private char[] pgmIp282010300 = new char[8];

						private char[] pgmIp288010300 = new char[8];

						private char[] pgmIp783510300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] valueC300 = new char[1];

						private char[] valueD300 = new char[1];

								private short val1300;

								private short minus1300;

						private char[] abendParaName300 = new char[30];

								private int abendCode300;

								private long readCnt400;

								private long writeCnt400;

						private char[] abendMsgTblErr600 = new char[42];

						private char[] ptrIp610010800 = new char[8];

						private char[] ptrIp081110800 = new char[8];

						private char[] ptrIp280010800 = new char[8];

						private char[] ptrIp280510800 = new char[8];

						private char[] ptrIp282010800 = new char[8];

						private char[] ptrIp288010800 = new char[8];

						private char[] ptrIp783510800 = new char[8];

						private char[] ptrIp996010800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsTxnQualify100(("N").toCharArray());
								setIsMccFound100(("N").toCharArray());
								setIsMaidFound100(("N").toCharArray());
								setIsArRecFound100(("N").toCharArray());
								setIsEndOfLoop100(("N").toCharArray());
								setIsIchgCalculated100(("N").toCharArray());
								setSys001FileStatus200(fillSpace(2));
								setSys002FileStatus200(fillSpace(2));
								setSys201FileStatus200(fillSpace(2));
								setPgmId300(("IP088030").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xD7,(byte)0x2D,(byte)0x00,(byte)0xF5,(byte)0x22,(byte)0x00}).toCharArray());
								setPgmIp610010300(("IP610010").toCharArray());
								setPgmIp081110300(("IP081110").toCharArray());
								setPgmIp280010300(("IP280010").toCharArray());
								setPgmIp280510300(("IP280510").toCharArray());
								setPgmIp282010300(("IP282010").toCharArray());
								setPgmIp288010300(("IP288010").toCharArray());
								setPgmIp783510300(("IP783510").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setValueC300(("C").toCharArray());
								setValueD300(("D").toCharArray());
								setVal1300((short)1);
								setMinus1300((short)-1);
								setAbendParaName300(fillSpace(30));
								setAbendCode300(0);
								setReadCnt400(0L);
								setWriteCnt400(0L);
								setAbendMsgTblErr600(("INTERNAL TABLE OVERFLOW ERROR             ").toCharArray());
								setPtrIp610010800(("IP610010").toCharArray());
								setPtrIp081110800(("IP081110").toCharArray());
								setPtrIp280010800(("IP280010").toCharArray());
								setPtrIp280510800(("IP280510").toCharArray());
								setPtrIp282010800(("IP282010").toCharArray());
								setPtrIp288010800(("IP288010").toCharArray());
								setPtrIp783510800(("IP783510").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
    }


 

	/**
	 *	Returns the value of isTxnQualify100
	 *	@return isTxnQualify100
	 */
   public char[] getIsTxnQualify100() throws CFException{
   		return isTxnQualify100;
   }

  
	/**
	*  set variable isTxnQualify100
	*  Corresponding COBOL Variable is 100-IS-TXN-QUALIFY
	*  @param value
	**/
   public void setIsTxnQualify100(char[] value) {
       value = checkIsTxnQualify100Constraints(value);
       arraycopy(value,0,isTxnQualify100,0,value.length);
   } 
	public void setIsTxnQualify100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isTxnQualify100,0,beginIndex + endIndex);
   }
	char[] txnQualifyN8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isTxnQualifyN88100()
	 *	@return  Returns true if isTxnQualifyN88100() is "N"
	 */
   public boolean isTxnQualifyN88100() throws CFException {
      return (  compareChars( getIsTxnQualify100() , txnQualifyN8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setTxnQualifyN88100True() {  			
    	setIsTxnQualify100( txnQualifyN8810088Value);
   	}
	char[] txnQualifyY8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isTxnQualifyY88100()
	 *	@return  Returns true if isTxnQualifyY88100() is "Y"
	 */
   public boolean isTxnQualifyY88100() throws CFException {
      return (  compareChars( getIsTxnQualify100() , txnQualifyY8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setTxnQualifyY88100True() {  			
    	setIsTxnQualify100( txnQualifyY8810088Value);
   	}
	/**
	 *	Returns the value of isMccFound100
	 *	@return isMccFound100
	 */
   public char[] getIsMccFound100() throws CFException{
   		return isMccFound100;
   }

  
	/**
	*  set variable isMccFound100
	*  Corresponding COBOL Variable is 100-IS-MCC-FOUND
	*  @param value
	**/
   public void setIsMccFound100(char[] value) {
       value = checkIsMccFound100Constraints(value);
       arraycopy(value,0,isMccFound100,0,value.length);
   } 
	public void setIsMccFound100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isMccFound100,0,beginIndex + endIndex);
   }
	char[] itIsMccFndN8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsMccFndN88100()
	 *	@return  Returns true if isItIsMccFndN88100() is "N"
	 */
   public boolean isItIsMccFndN88100() throws CFException {
      return (  compareChars( getIsMccFound100() , itIsMccFndN8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsMccFndN88100True() {  			
    	setIsMccFound100( itIsMccFndN8810088Value);
   	}
	char[] itIsMccFndY8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsMccFndY88100()
	 *	@return  Returns true if isItIsMccFndY88100() is "Y"
	 */
   public boolean isItIsMccFndY88100() throws CFException {
      return (  compareChars( getIsMccFound100() , itIsMccFndY8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsMccFndY88100True() {  			
    	setIsMccFound100( itIsMccFndY8810088Value);
   	}
	/**
	 *	Returns the value of isMaidFound100
	 *	@return isMaidFound100
	 */
   public char[] getIsMaidFound100() throws CFException{
   		return isMaidFound100;
   }

  
	/**
	*  set variable isMaidFound100
	*  Corresponding COBOL Variable is 100-IS-MAID-FOUND
	*  @param value
	**/
   public void setIsMaidFound100(char[] value) {
       value = checkIsMaidFound100Constraints(value);
       arraycopy(value,0,isMaidFound100,0,value.length);
   } 
	public void setIsMaidFound100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isMaidFound100,0,beginIndex + endIndex);
   }
	char[] itIsMaidFndN8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsMaidFndN88100()
	 *	@return  Returns true if isItIsMaidFndN88100() is "N"
	 */
   public boolean isItIsMaidFndN88100() throws CFException {
      return (  compareChars( getIsMaidFound100() , itIsMaidFndN8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsMaidFndN88100True() {  			
    	setIsMaidFound100( itIsMaidFndN8810088Value);
   	}
	char[] itIsMaidFndY8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsMaidFndY88100()
	 *	@return  Returns true if isItIsMaidFndY88100() is "Y"
	 */
   public boolean isItIsMaidFndY88100() throws CFException {
      return (  compareChars( getIsMaidFound100() , itIsMaidFndY8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsMaidFndY88100True() {  			
    	setIsMaidFound100( itIsMaidFndY8810088Value);
   	}
	/**
	 *	Returns the value of isArRecFound100
	 *	@return isArRecFound100
	 */
   public char[] getIsArRecFound100() throws CFException{
   		return isArRecFound100;
   }

  
	/**
	*  set variable isArRecFound100
	*  Corresponding COBOL Variable is 100-IS-AR-REC-FOUND
	*  @param value
	**/
   public void setIsArRecFound100(char[] value) {
       value = checkIsArRecFound100Constraints(value);
       arraycopy(value,0,isArRecFound100,0,value.length);
   } 
	public void setIsArRecFound100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isArRecFound100,0,beginIndex + endIndex);
   }
	char[] arRecNotFound8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isArRecNotFound88100()
	 *	@return  Returns true if isArRecNotFound88100() is "N"
	 */
   public boolean isArRecNotFound88100() throws CFException {
      return (  compareChars( getIsArRecFound100() , arRecNotFound8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setArRecNotFound88100True() {  			
    	setIsArRecFound100( arRecNotFound8810088Value);
   	}
	char[] arRecFound8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isArRecFound88100()
	 *	@return  Returns true if isArRecFound88100() is "Y"
	 */
   public boolean isArRecFound88100() throws CFException {
      return (  compareChars( getIsArRecFound100() , arRecFound8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setArRecFound88100True() {  			
    	setIsArRecFound100( arRecFound8810088Value);
   	}
	/**
	 *	Returns the value of isEndOfLoop100
	 *	@return isEndOfLoop100
	 */
   public char[] getIsEndOfLoop100() throws CFException{
   		return isEndOfLoop100;
   }

  
	/**
	*  set variable isEndOfLoop100
	*  Corresponding COBOL Variable is 100-IS-END-OF-LOOP
	*  @param value
	**/
   public void setIsEndOfLoop100(char[] value) {
       value = checkIsEndOfLoop100Constraints(value);
       arraycopy(value,0,isEndOfLoop100,0,value.length);
   } 
	public void setIsEndOfLoop100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isEndOfLoop100,0,beginIndex + endIndex);
   }
	char[] itIsNotEndLoop8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotEndLoop88100()
	 *	@return  Returns true if isItIsNotEndLoop88100() is "N"
	 */
   public boolean isItIsNotEndLoop88100() throws CFException {
      return (  compareChars( getIsEndOfLoop100() , itIsNotEndLoop8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotEndLoop88100True() {  			
    	setIsEndOfLoop100( itIsNotEndLoop8810088Value);
   	}
	char[] itIsEndOfLoop8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsEndOfLoop88100()
	 *	@return  Returns true if isItIsEndOfLoop88100() is "Y"
	 */
   public boolean isItIsEndOfLoop88100() throws CFException {
      return (  compareChars( getIsEndOfLoop100() , itIsEndOfLoop8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsEndOfLoop88100True() {  			
    	setIsEndOfLoop100( itIsEndOfLoop8810088Value);
   	}
	/**
	 *	Returns the value of isIchgCalculated100
	 *	@return isIchgCalculated100
	 */
   public char[] getIsIchgCalculated100() throws CFException{
   		return isIchgCalculated100;
   }

  
	/**
	*  set variable isIchgCalculated100
	*  Corresponding COBOL Variable is 100-IS-ICHG-CALCULATED
	*  @param value
	**/
   public void setIsIchgCalculated100(char[] value) {
       value = checkIsIchgCalculated100Constraints(value);
       arraycopy(value,0,isIchgCalculated100,0,value.length);
   } 
	public void setIsIchgCalculated100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isIchgCalculated100,0,beginIndex + endIndex);
   }
	char[] ichgCalculatedN8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIchgCalculatedN88100()
	 *	@return  Returns true if isIchgCalculatedN88100() is "N"
	 */
   public boolean isIchgCalculatedN88100() throws CFException {
      return (  compareChars( getIsIchgCalculated100() , ichgCalculatedN8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIchgCalculatedN88100True() {  			
    	setIsIchgCalculated100( ichgCalculatedN8810088Value);
   	}
	char[] ichgCalculatedY8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIchgCalculatedY88100()
	 *	@return  Returns true if isIchgCalculatedY88100() is "Y"
	 */
   public boolean isIchgCalculatedY88100() throws CFException {
      return (  compareChars( getIsIchgCalculated100() , ichgCalculatedY8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIchgCalculatedY88100True() {  			
    	setIsIchgCalculated100( ichgCalculatedY8810088Value);
   	}
	/**
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException{
   		return sys001FileStatus200;
   }

  
	/**
	*  set variable sys001FileStatus200
	*  Corresponding COBOL Variable is 200-SYS001-FILE-STATUS
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) {
       value = checkSys001FileStatus200Constraints(value);
       arraycopy(value,0,sys001FileStatus200,0,value.length);
   } 
	public void setSys001FileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys001FileStatus200,0,beginIndex + endIndex);
   }
	char[] sys001IoGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys001IoGood88200()
	 *	@return  Returns true if isSys001IoGood88200() is "00"
	 */
   public boolean isSys001IoGood88200() throws CFException {
      return (  compareChars( getSys001FileStatus200() , sys001IoGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys001IoGood88200True() {  			
    	setSys001FileStatus200( sys001IoGood8820088Value);
   	}
	char[] sys001Eof8820088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isSys001Eof88200()
	 *	@return  Returns true if isSys001Eof88200() is "10"
	 */
   public boolean isSys001Eof88200() throws CFException {
      return (  compareChars( getSys001FileStatus200() , sys001Eof8820088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setSys001Eof88200True() {  			
    	setSys001FileStatus200( sys001Eof8820088Value);
   	}
	/**
	 *	Returns the value of sys002FileStatus200
	 *	@return sys002FileStatus200
	 */
   public char[] getSys002FileStatus200() throws CFException{
   		return sys002FileStatus200;
   }

  
	/**
	*  set variable sys002FileStatus200
	*  Corresponding COBOL Variable is 200-SYS002-FILE-STATUS
	*  @param value
	**/
   public void setSys002FileStatus200(char[] value) {
       value = checkSys002FileStatus200Constraints(value);
       arraycopy(value,0,sys002FileStatus200,0,value.length);
   } 
	public void setSys002FileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys002FileStatus200,0,beginIndex + endIndex);
   }
	char[] sys002IoGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys002IoGood88200()
	 *	@return  Returns true if isSys002IoGood88200() is "00"
	 */
   public boolean isSys002IoGood88200() throws CFException {
      return (  compareChars( getSys002FileStatus200() , sys002IoGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys002IoGood88200True() {  			
    	setSys002FileStatus200( sys002IoGood8820088Value);
   	}
	char[] sys002Eof8820088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isSys002Eof88200()
	 *	@return  Returns true if isSys002Eof88200() is "10"
	 */
   public boolean isSys002Eof88200() throws CFException {
      return (  compareChars( getSys002FileStatus200() , sys002Eof8820088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setSys002Eof88200True() {  			
    	setSys002FileStatus200( sys002Eof8820088Value);
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
	char[] sys201IoGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys201IoGood88200()
	 *	@return  Returns true if isSys201IoGood88200() is "00"
	 */
   public boolean isSys201IoGood88200() throws CFException {
      return (  compareChars( getSys201FileStatus200() , sys201IoGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys201IoGood88200True() {  			
    	setSys201FileStatus200( sys201IoGood8820088Value);
   	}
	/**
	 *	Returns the value of pgmId300
	 *	@return pgmId300
	 */
   public char[] getPgmId300() throws CFException{
   		return pgmId300;
   }

  
	/**
	*  set variable pgmId300
	*  Corresponding COBOL Variable is 300-PGM-ID
	*  @param value
	**/
   public void setPgmId300(char[] value) {
       value = checkPgmId300Constraints(value);
       arraycopy(value,0,pgmId300,0,value.length);
   } 
	public void setPgmId300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmId300,0,beginIndex + endIndex);
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
	 *	Returns the value of pgmIp610010300
	 *	@return pgmIp610010300
	 */
   public char[] getPgmIp610010300() throws CFException{
   		return pgmIp610010300;
   }

  
	/**
	*  set variable pgmIp610010300
	*  Corresponding COBOL Variable is 300-PGM-IP610010
	*  @param value
	**/
   public void setPgmIp610010300(char[] value) {
       value = checkPgmIp610010300Constraints(value);
       arraycopy(value,0,pgmIp610010300,0,value.length);
   } 
	public void setPgmIp610010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp610010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp081110300
	 *	@return pgmIp081110300
	 */
   public char[] getPgmIp081110300() throws CFException{
   		return pgmIp081110300;
   }

  
	/**
	*  set variable pgmIp081110300
	*  Corresponding COBOL Variable is 300-PGM-IP081110
	*  @param value
	**/
   public void setPgmIp081110300(char[] value) {
       value = checkPgmIp081110300Constraints(value);
       arraycopy(value,0,pgmIp081110300,0,value.length);
   } 
	public void setPgmIp081110300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp081110300,0,beginIndex + endIndex);
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
	 *	Returns the value of pgmIp280510300
	 *	@return pgmIp280510300
	 */
   public char[] getPgmIp280510300() throws CFException{
   		return pgmIp280510300;
   }

  
	/**
	*  set variable pgmIp280510300
	*  Corresponding COBOL Variable is 300-PGM-IP280510
	*  @param value
	**/
   public void setPgmIp280510300(char[] value) {
       value = checkPgmIp280510300Constraints(value);
       arraycopy(value,0,pgmIp280510300,0,value.length);
   } 
	public void setPgmIp280510300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp280510300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp282010300
	 *	@return pgmIp282010300
	 */
   public char[] getPgmIp282010300() throws CFException{
   		return pgmIp282010300;
   }

  
	/**
	*  set variable pgmIp282010300
	*  Corresponding COBOL Variable is 300-PGM-IP282010
	*  @param value
	**/
   public void setPgmIp282010300(char[] value) {
       value = checkPgmIp282010300Constraints(value);
       arraycopy(value,0,pgmIp282010300,0,value.length);
   } 
	public void setPgmIp282010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp282010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp288010300
	 *	@return pgmIp288010300
	 */
   public char[] getPgmIp288010300() throws CFException{
   		return pgmIp288010300;
   }

  
	/**
	*  set variable pgmIp288010300
	*  Corresponding COBOL Variable is 300-PGM-IP288010
	*  @param value
	**/
   public void setPgmIp288010300(char[] value) {
       value = checkPgmIp288010300Constraints(value);
       arraycopy(value,0,pgmIp288010300,0,value.length);
   } 
	public void setPgmIp288010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp288010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp783510300
	 *	@return pgmIp783510300
	 */
   public char[] getPgmIp783510300() throws CFException{
   		return pgmIp783510300;
   }

  
	/**
	*  set variable pgmIp783510300
	*  Corresponding COBOL Variable is 300-PGM-IP783510
	*  @param value
	**/
   public void setPgmIp783510300(char[] value) {
       value = checkPgmIp783510300Constraints(value);
       arraycopy(value,0,pgmIp783510300,0,value.length);
   } 
	public void setPgmIp783510300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp783510300,0,beginIndex + endIndex);
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
	 *	Returns the value of valueC300
	 *	@return valueC300
	 */
   public char[] getValueC300() throws CFException{
   		return valueC300;
   }

  
	/**
	*  set variable valueC300
	*  Corresponding COBOL Variable is 300-VALUE-C
	*  @param value
	**/
   public void setValueC300(char[] value) {
       value = checkValueC300Constraints(value);
       arraycopy(value,0,valueC300,0,value.length);
   } 
	public void setValueC300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueC300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueD300
	 *	@return valueD300
	 */
   public char[] getValueD300() throws CFException{
   		return valueD300;
   }

  
	/**
	*  set variable valueD300
	*  Corresponding COBOL Variable is 300-VALUE-D
	*  @param value
	**/
   public void setValueD300(char[] value) {
       value = checkValueD300Constraints(value);
       arraycopy(value,0,valueD300,0,value.length);
   } 
	public void setValueD300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueD300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of val1300
	 *	@return val1300
	 */
	public short getVal1300() throws CFException {
   		return val1300;
	}
	
	/**
	 * 	Update Val1300 with the passed value
	 *  Corresponding COBOL Variable is 300-VAL-1
	 *	@param number
	 */
	public void setVal1300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    val1300 = checkVal1300MaxLimit(number); 
	}

	public void setVal1300(int number) {
	    number = checkVal1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVal1300((short)number);
	}
	public void setVal1300(long number) {
	    number = checkVal1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVal1300((short)number);
	}
	

	/**
	 *	Returns the value of minus1300
	 *	@return minus1300
	 */
	public short getMinus1300() throws CFException {
   		return minus1300;
	}
	
	/**
	 * 	Update Minus1300 with the passed value
	 *  Corresponding COBOL Variable is 300-MINUS-1
	 *	@param number
	 */
	public void setMinus1300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    minus1300 = checkMinus1300MaxLimit(number); 
	}

	public void setMinus1300(int number) {
	    number = checkMinus1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMinus1300((short)number);
	}
	public void setMinus1300(long number) {
	    number = checkMinus1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMinus1300((short)number);
	}
	

	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException{
   		return abendParaName300;
   }

  
	/**
	*  set variable abendParaName300
	*  Corresponding COBOL Variable is 300-ABEND-PARA-NAME
	*  @param value
	**/
   public void setAbendParaName300(char[] value) {
       value = checkAbendParaName300Constraints(value);
       arraycopy(value,0,abendParaName300,0,value.length);
   } 
	public void setAbendParaName300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendParaName300,0,beginIndex + endIndex);
   }
	char[] abendPara13108830088Value = "1310-OPEN-INPUT-SYS001        ".toCharArray();
	/**
	 *	Test condition "1310-OPEN-INPUT-SYS001" for isAbendPara131088300()
	 *	@return  Returns true if isAbendPara131088300() is "1310-OPEN-INPUT-SYS001"
	 */
   public boolean isAbendPara131088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara13108830088Value)  == 0  );
   }


	/**
	*  set values "1310-OPEN-INPUT-SYS001"
	*/
   	public void setAbendPara131088300True() {  			
    	setAbendParaName300( abendPara13108830088Value);
   	}
	char[] abendPara13208830088Value = "1320-OPEN-INPUT-SYS002        ".toCharArray();
	/**
	 *	Test condition "1320-OPEN-INPUT-SYS002" for isAbendPara132088300()
	 *	@return  Returns true if isAbendPara132088300() is "1320-OPEN-INPUT-SYS002"
	 */
   public boolean isAbendPara132088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara13208830088Value)  == 0  );
   }


	/**
	*  set values "1320-OPEN-INPUT-SYS002"
	*/
   	public void setAbendPara132088300True() {  			
    	setAbendParaName300( abendPara13208830088Value);
   	}
	char[] abendPara13308830088Value = "1330-OPEN-OUTPUT-SYS201       ".toCharArray();
	/**
	 *	Test condition "1330-OPEN-OUTPUT-SYS201" for isAbendPara133088300()
	 *	@return  Returns true if isAbendPara133088300() is "1330-OPEN-OUTPUT-SYS201"
	 */
   public boolean isAbendPara133088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara13308830088Value)  == 0  );
   }


	/**
	*  set values "1330-OPEN-OUTPUT-SYS201"
	*/
   	public void setAbendPara133088300True() {  			
    	setAbendParaName300( abendPara13308830088Value);
   	}
	char[] abendPara15008830088Value = "1500-LOAD-ICHG-FEE-TABLE      ".toCharArray();
	/**
	 *	Test condition "1500-LOAD-ICHG-FEE-TABLE" for isAbendPara150088300()
	 *	@return  Returns true if isAbendPara150088300() is "1500-LOAD-ICHG-FEE-TABLE"
	 */
   public boolean isAbendPara150088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara15008830088Value)  == 0  );
   }


	/**
	*  set values "1500-LOAD-ICHG-FEE-TABLE"
	*/
   	public void setAbendPara150088300True() {  			
    	setAbendParaName300( abendPara15008830088Value);
   	}
	char[] abendPara21208830088Value = "2120-WRITE-OUTPUT-SYS201      ".toCharArray();
	/**
	 *	Test condition "2120-WRITE-OUTPUT-SYS201" for isAbendPara212088300()
	 *	@return  Returns true if isAbendPara212088300() is "2120-WRITE-OUTPUT-SYS201"
	 */
   public boolean isAbendPara212088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara21208830088Value)  == 0  );
   }


	/**
	*  set values "2120-WRITE-OUTPUT-SYS201"
	*/
   	public void setAbendPara212088300True() {  			
    	setAbendParaName300( abendPara21208830088Value);
   	}
	char[] abendPara31008830088Value = "3100-CLOSE-SYS001             ".toCharArray();
	/**
	 *	Test condition "3100-CLOSE-SYS001" for isAbendPara310088300()
	 *	@return  Returns true if isAbendPara310088300() is "3100-CLOSE-SYS001"
	 */
   public boolean isAbendPara310088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara31008830088Value)  == 0  );
   }


	/**
	*  set values "3100-CLOSE-SYS001"
	*/
   	public void setAbendPara310088300True() {  			
    	setAbendParaName300( abendPara31008830088Value);
   	}
	char[] abendPara32008830088Value = "3200-CLOSE-SYS002             ".toCharArray();
	/**
	 *	Test condition "3200-CLOSE-SYS002" for isAbendPara320088300()
	 *	@return  Returns true if isAbendPara320088300() is "3200-CLOSE-SYS002"
	 */
   public boolean isAbendPara320088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara32008830088Value)  == 0  );
   }


	/**
	*  set values "3200-CLOSE-SYS002"
	*/
   	public void setAbendPara320088300True() {  			
    	setAbendParaName300( abendPara32008830088Value);
   	}
	char[] abendPara33008830088Value = "3300-CLOSE-SYS201             ".toCharArray();
	/**
	 *	Test condition "3300-CLOSE-SYS201" for isAbendPara330088300()
	 *	@return  Returns true if isAbendPara330088300() is "3300-CLOSE-SYS201"
	 */
   public boolean isAbendPara330088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara33008830088Value)  == 0  );
   }


	/**
	*  set values "3300-CLOSE-SYS201"
	*/
   	public void setAbendPara330088300True() {  			
    	setAbendParaName300( abendPara33008830088Value);
   	}
	char[] abendPara80008830088Value = "8000-READ-SYS001-FILE         ".toCharArray();
	/**
	 *	Test condition "8000-READ-SYS001-FILE" for isAbendPara800088300()
	 *	@return  Returns true if isAbendPara800088300() is "8000-READ-SYS001-FILE"
	 */
   public boolean isAbendPara800088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara80008830088Value)  == 0  );
   }


	/**
	*  set values "8000-READ-SYS001-FILE"
	*/
   	public void setAbendPara800088300True() {  			
    	setAbendParaName300( abendPara80008830088Value);
   	}
	char[] abendPara81008830088Value = "8100-READ-SYS002-FILE         ".toCharArray();
	/**
	 *	Test condition "8100-READ-SYS002-FILE" for isAbendPara810088300()
	 *	@return  Returns true if isAbendPara810088300() is "8100-READ-SYS002-FILE"
	 */
   public boolean isAbendPara810088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara81008830088Value)  == 0  );
   }


	/**
	*  set values "8100-READ-SYS002-FILE"
	*/
   	public void setAbendPara810088300True() {  			
    	setAbendParaName300( abendPara81008830088Value);
   	}
	char[] abendPara83008830088Value = "8300-CALL-CURR-CONV-API       ".toCharArray();
	/**
	 *	Test condition "8300-CALL-CURR-CONV-API" for isAbendPara830088300()
	 *	@return  Returns true if isAbendPara830088300() is "8300-CALL-CURR-CONV-API"
	 */
   public boolean isAbendPara830088300() throws CFException {
      return (  compareChars( getAbendParaName300() , abendPara83008830088Value)  == 0  );
   }


	/**
	*  set values "8300-CALL-CURR-CONV-API"
	*/
   	public void setAbendPara830088300True() {  			
    	setAbendParaName300( abendPara83008830088Value);
   	}
	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
       if (isAbendCode300Modified()) { 
           abendCode300 = refreshAbendCode300();
        }
   		return abendCode300;
	}
	

	
	   
	/**
	 * 	Update AbendCode300 with the passed value
	 *  Corresponding COBOL Variable is 300-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode300 = checkAbendCode300MaxLimit(number); 
		serializeAbendCode300(abendCode300);
	}
	

	public void setAbendCode300(long number) {
	    number = checkAbendCode300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode300((int)number);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value) throws CFException {
		 abendCode300 = serializeAbendCode300(value);
	}
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value) throws CFException {
		 setAbendCode300(value);
	}
	
	/**
	 *	Test condition 3001 for isOpenAbendCode88300()
	 *	@return  Returns true if isOpenAbendCode88300() is 3001
	 */
   public boolean isOpenAbendCode88300() throws CFException {
      return (  getAbendCode300()  ==  3001  );
   }


	/**
	*  set values 3001
	*/
   	public void setOpenAbendCode88300True() {  			
    	setAbendCode300( 3001);
   	}
	
	/**
	 *	Test condition 3002 for isReadAbendCode88300()
	 *	@return  Returns true if isReadAbendCode88300() is 3002
	 */
   public boolean isReadAbendCode88300() throws CFException {
      return (  getAbendCode300()  ==  3002  );
   }


	/**
	*  set values 3002
	*/
   	public void setReadAbendCode88300True() {  			
    	setAbendCode300( 3002);
   	}
	
	/**
	 *	Test condition 3003 for isWriteAbendCode88300()
	 *	@return  Returns true if isWriteAbendCode88300() is 3003
	 */
   public boolean isWriteAbendCode88300() throws CFException {
      return (  getAbendCode300()  ==  3003  );
   }


	/**
	*  set values 3003
	*/
   	public void setWriteAbendCode88300True() {  			
    	setAbendCode300( 3003);
   	}
	
	/**
	 *	Test condition 3004 for isCloseAbendCode88300()
	 *	@return  Returns true if isCloseAbendCode88300() is 3004
	 */
   public boolean isCloseAbendCode88300() throws CFException {
      return (  getAbendCode300()  ==  3004  );
   }


	/**
	*  set values 3004
	*/
   	public void setCloseAbendCode88300True() {  			
    	setAbendCode300( 3004);
   	}
	
	/**
	 *	Test condition 3005 for isTblAbendCode88300()
	 *	@return  Returns true if isTblAbendCode88300() is 3005
	 */
   public boolean isTblAbendCode88300() throws CFException {
      return (  getAbendCode300()  ==  3005  );
   }


	/**
	*  set values 3005
	*/
   	public void setTblAbendCode88300True() {  			
    	setAbendCode300( 3005);
   	}
	
	/**
	 *	Test condition 3006 for isConvAbendCode88300()
	 *	@return  Returns true if isConvAbendCode88300() is 3006
	 */
   public boolean isConvAbendCode88300() throws CFException {
      return (  getAbendCode300()  ==  3006  );
   }


	/**
	*  set values 3006
	*/
   	public void setConvAbendCode88300True() {  			
    	setAbendCode300( 3006);
   	}
	/**
	 *	Returns the value of readCnt400
	 *	@return readCnt400
	 */
	public long getReadCnt400() throws CFException {
       if (isReadCnt400Modified()) { 
           readCnt400 = refreshReadCnt400();
        }
   		return readCnt400;
	}
	

	
	   
	/**
	 * 	Update ReadCnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-READ-CNT
	 *	@param number
	 */
	public void setReadCnt400(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    readCnt400 = checkReadCnt400MaxLimit(number); 
		serializeReadCnt400(readCnt400);
	}
	

	/**
	 * 	Update ReadCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setReadCnt400(char[] value) throws CFException {
		 readCnt400 = serializeReadCnt400(value);
	}
	/**
	 * 	Update ReadCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReadCnt400String(char[] value) throws CFException {
		 setReadCnt400(value);
	}
	/**
	 *	Returns the value of writeCnt400
	 *	@return writeCnt400
	 */
	public long getWriteCnt400() throws CFException {
       if (isWriteCnt400Modified()) { 
           writeCnt400 = refreshWriteCnt400();
        }
   		return writeCnt400;
	}
	

	
	   
	/**
	 * 	Update WriteCnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-WRITE-CNT
	 *	@param number
	 */
	public void setWriteCnt400(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    writeCnt400 = checkWriteCnt400MaxLimit(number); 
		serializeWriteCnt400(writeCnt400);
	}
	

	/**
	 * 	Update WriteCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWriteCnt400(char[] value) throws CFException {
		 writeCnt400 = serializeWriteCnt400(value);
	}
	/**
	 * 	Update WriteCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWriteCnt400String(char[] value) throws CFException {
		 setWriteCnt400(value);
	}
	/**
	 *	Returns the value of abendMsgTblErr600
	 *	@return abendMsgTblErr600
	 */
   public char[] getAbendMsgTblErr600() throws CFException{
   		return abendMsgTblErr600;
   }

  
	/**
	*  set variable abendMsgTblErr600
	*  Corresponding COBOL Variable is 600-ABEND-MSG-TBL-ERR
	*  @param value
	**/
   public void setAbendMsgTblErr600(char[] value) {
       value = checkAbendMsgTblErr600Constraints(value);
       arraycopy(value,0,abendMsgTblErr600,0,value.length);
   } 
	public void setAbendMsgTblErr600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendMsgTblErr600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp610010800
	 *	@return ptrIp610010800
	 */
   public char[] getPtrIp610010800() throws CFException{
   		return ptrIp610010800;
   }

  
	/**
	*  set variable ptrIp610010800
	*  Corresponding COBOL Variable is 800-PTR-IP610010
	*  @param value
	**/
   public void setPtrIp610010800(char[] value) {
       value = checkPtrIp610010800Constraints(value);
       arraycopy(value,0,ptrIp610010800,0,value.length);
   } 
	public void setPtrIp610010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp610010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp081110800
	 *	@return ptrIp081110800
	 */
   public char[] getPtrIp081110800() throws CFException{
   		return ptrIp081110800;
   }

  
	/**
	*  set variable ptrIp081110800
	*  Corresponding COBOL Variable is 800-PTR-IP081110
	*  @param value
	**/
   public void setPtrIp081110800(char[] value) {
       value = checkPtrIp081110800Constraints(value);
       arraycopy(value,0,ptrIp081110800,0,value.length);
   } 
	public void setPtrIp081110800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp081110800,0,beginIndex + endIndex);
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
	 *	Returns the value of ptrIp280510800
	 *	@return ptrIp280510800
	 */
   public char[] getPtrIp280510800() throws CFException{
   		return ptrIp280510800;
   }

  
	/**
	*  set variable ptrIp280510800
	*  Corresponding COBOL Variable is 800-PTR-IP280510
	*  @param value
	**/
   public void setPtrIp280510800(char[] value) {
       value = checkPtrIp280510800Constraints(value);
       arraycopy(value,0,ptrIp280510800,0,value.length);
   } 
	public void setPtrIp280510800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp280510800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp282010800
	 *	@return ptrIp282010800
	 */
   public char[] getPtrIp282010800() throws CFException{
   		return ptrIp282010800;
   }

  
	/**
	*  set variable ptrIp282010800
	*  Corresponding COBOL Variable is 800-PTR-IP282010
	*  @param value
	**/
   public void setPtrIp282010800(char[] value) {
       value = checkPtrIp282010800Constraints(value);
       arraycopy(value,0,ptrIp282010800,0,value.length);
   } 
	public void setPtrIp282010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp282010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp288010800
	 *	@return ptrIp288010800
	 */
   public char[] getPtrIp288010800() throws CFException{
   		return ptrIp288010800;
   }

  
	/**
	*  set variable ptrIp288010800
	*  Corresponding COBOL Variable is 800-PTR-IP288010
	*  @param value
	**/
   public void setPtrIp288010800(char[] value) {
       value = checkPtrIp288010800Constraints(value);
       arraycopy(value,0,ptrIp288010800,0,value.length);
   } 
	public void setPtrIp288010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp288010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp783510800
	 *	@return ptrIp783510800
	 */
   public char[] getPtrIp783510800() throws CFException{
   		return ptrIp783510800;
   }

  
	/**
	*  set variable ptrIp783510800
	*  Corresponding COBOL Variable is 800-PTR-IP783510
	*  @param value
	**/
   public void setPtrIp783510800(char[] value) {
       value = checkPtrIp783510800Constraints(value);
       arraycopy(value,0,ptrIp783510800,0,value.length);
   } 
	public void setPtrIp783510800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp783510800,0,beginIndex + endIndex);
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
  
