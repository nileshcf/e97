package com.cloudframe.app.ip305710.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip305710.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] isItTheFirstTime100 = new char[1];

						private char[] ip305710300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] pgmIp610010300 = new char[8];

								private long maxLength300;

								private int maxRrnLimit300;

						private char[] abendCd3003300 = new char[4];

						private char[] tableId300 = new char[8];

						private char[] pgmVersion300 = new char[7];

						private char[] para2100300 = new char[30];

						private char[] uniqMaxCabPtrErrorCd610 = new char[4];

						private char[] uniqMaxCabPtrErrorMsg610 = new char[52];

						private char[] ptrIp996010800 = new char[8];

								private int rrnNbr800;

								private int entryLength800;

								private long start800;

								private int length800;

								private long currPtrLngth800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setIp305710300(("IP305710").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmIp610010300(("IP610010").toCharArray());
								setMaxLength300(27951L);
								setMaxRrnLimit300(65);
								setAbendCd3003300(("3003").toCharArray());
								setTableId300(("IP0057T1").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x00,(byte)0xEB,(byte)0xA1,(byte)0x01,(byte)0x91,(byte)0x2D,(byte)0x00}).toCharArray());
								setPara2100300(("2100-SAVE-TABLE-ENTRY         ").toCharArray());
								setUniqMaxCabPtrErrorCd610(("3002").toCharArray());
								setUniqMaxCabPtrErrorMsg610(("UNIQUE CAB PTR TABLE OVERFLOW (100000 MAX).         ").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setRrnNbr800(0);
								setEntryLength800(0);
								setStart800(1L);
								setLength800(0);
								setCurrPtrLngth800(0L);
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
	 *	Returns the value of ip305710300
	 *	@return ip305710300
	 */
   public char[] getIp305710300() throws CFException{
   		return ip305710300;
   }

  
	/**
	*  set variable ip305710300
	*  Corresponding COBOL Variable is 300-IP305710
	*  @param value
	**/
   public void setIp305710300(char[] value) {
       value = checkIp305710300Constraints(value);
       arraycopy(value,0,ip305710300,0,value.length);
   } 
	public void setIp305710300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ip305710300,0,beginIndex + endIndex);
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
	 *	Returns the value of maxLength300
	 *	@return maxLength300
	 */
	public long getMaxLength300() throws CFException {
   		return maxLength300;
	}
	
	/**
	 * 	Update MaxLength300 with the passed value
	 *  Corresponding COBOL Variable is 300-MAX-LENGTH
	 *	@param number
	 */
	public void setMaxLength300(long number) {
	     // Truncate if the number is beyond +/- Max range
	    maxLength300 = checkMaxLength300MaxLimit(number); 
	}


	/**
	 *	Returns the value of maxRrnLimit300
	 *	@return maxRrnLimit300
	 */
	public int getMaxRrnLimit300() throws CFException {
       if (isMaxRrnLimit300Modified()) { 
           maxRrnLimit300 = refreshMaxRrnLimit300();
        }
   		return maxRrnLimit300;
	}
	

	
	   
	/**
	 * 	Update MaxRrnLimit300 with the passed value
	 *  Corresponding COBOL Variable is 300-MAX-RRN-LIMIT
	 *	@param number
	 */
	public void setMaxRrnLimit300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    maxRrnLimit300 = checkMaxRrnLimit300MaxLimit(number); 
		serializeMaxRrnLimit300(maxRrnLimit300);
	}
	

	public void setMaxRrnLimit300(long number) {
	    number = checkMaxRrnLimit300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxRrnLimit300((int)number);
	}
	
	/**
	 * 	Update MaxRrnLimit300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxRrnLimit300(char[] value) throws CFException {
		 maxRrnLimit300 = serializeMaxRrnLimit300(value);
	}
	/**
	 * 	Update MaxRrnLimit300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxRrnLimit300String(char[] value) throws CFException {
		 setMaxRrnLimit300(value);
	}
	/**
	 *	Returns the value of abendCd3003300
	 *	@return abendCd3003300
	 */
   public char[] getAbendCd3003300() throws CFException{
   		return abendCd3003300;
   }

  
	/**
	*  set variable abendCd3003300
	*  Corresponding COBOL Variable is 300-ABEND-CD-3003
	*  @param value
	**/
   public void setAbendCd3003300(char[] value) {
       value = checkAbendCd3003300Constraints(value);
       arraycopy(value,0,abendCd3003300,0,value.length);
   } 
	public void setAbendCd3003300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendCd3003300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tableId300
	 *	@return tableId300
	 */
   public char[] getTableId300() throws CFException{
   		return tableId300;
   }

  
	/**
	*  set variable tableId300
	*  Corresponding COBOL Variable is 300-TABLE-ID
	*  @param value
	**/
   public void setTableId300(char[] value) {
       value = checkTableId300Constraints(value);
       arraycopy(value,0,tableId300,0,value.length);
   } 
	public void setTableId300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableId300,0,beginIndex + endIndex);
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
	 *	Returns the value of para2100300
	 *	@return para2100300
	 */
   public char[] getPara2100300() throws CFException{
   		return para2100300;
   }

  
	/**
	*  set variable para2100300
	*  Corresponding COBOL Variable is 300-PARA-2100
	*  @param value
	**/
   public void setPara2100300(char[] value) {
       value = checkPara2100300Constraints(value);
       arraycopy(value,0,para2100300,0,value.length);
   } 
	public void setPara2100300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para2100300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of uniqMaxCabPtrErrorCd610
	 *	@return uniqMaxCabPtrErrorCd610
	 */
   public char[] getUniqMaxCabPtrErrorCd610() throws CFException{
   		return uniqMaxCabPtrErrorCd610;
   }

  
	/**
	*  set variable uniqMaxCabPtrErrorCd610
	*  Corresponding COBOL Variable is 610-UNIQ-MAX-CAB-PTR-ERROR-CD
	*  @param value
	**/
   public void setUniqMaxCabPtrErrorCd610(char[] value) {
       value = checkUniqMaxCabPtrErrorCd610Constraints(value);
       arraycopy(value,0,uniqMaxCabPtrErrorCd610,0,value.length);
   } 
	public void setUniqMaxCabPtrErrorCd610(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,uniqMaxCabPtrErrorCd610,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of uniqMaxCabPtrErrorMsg610
	 *	@return uniqMaxCabPtrErrorMsg610
	 */
   public char[] getUniqMaxCabPtrErrorMsg610() throws CFException{
   		return uniqMaxCabPtrErrorMsg610;
   }

  
	/**
	*  set variable uniqMaxCabPtrErrorMsg610
	*  Corresponding COBOL Variable is 610-UNIQ-MAX-CAB-PTR-ERROR-MSG
	*  @param value
	**/
   public void setUniqMaxCabPtrErrorMsg610(char[] value) {
       value = checkUniqMaxCabPtrErrorMsg610Constraints(value);
       arraycopy(value,0,uniqMaxCabPtrErrorMsg610,0,value.length);
   } 
	public void setUniqMaxCabPtrErrorMsg610(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,uniqMaxCabPtrErrorMsg610,0,beginIndex + endIndex);
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
	 *	Returns the value of rrnNbr800
	 *	@return rrnNbr800
	 */
	public int getRrnNbr800() throws CFException {
   		return rrnNbr800;
	}
	
	/**
	 * 	Update RrnNbr800 with the passed value
	 *  Corresponding COBOL Variable is 800-RRN-NBR
	 *	@param number
	 */
	public void setRrnNbr800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rrnNbr800 = checkRrnNbr800MaxLimit(number); 
	}


	public void setRrnNbr800(long number) {
	    number = checkRrnNbr800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRrnNbr800((int)number);
	}
	
	/**
	 *	Returns the value of entryLength800
	 *	@return entryLength800
	 */
	public int getEntryLength800() throws CFException {
   		return entryLength800;
	}
	
	/**
	 * 	Update EntryLength800 with the passed value
	 *  Corresponding COBOL Variable is 800-ENTRY-LENGTH
	 *	@param number
	 */
	public void setEntryLength800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    entryLength800 = checkEntryLength800MaxLimit(number); 
	}


	public void setEntryLength800(long number) {
	    number = checkEntryLength800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEntryLength800((int)number);
	}
	
	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public long getStart800() throws CFException {
   		return start800;
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *  Corresponding COBOL Variable is 800-START
	 *	@param number
	 */
	public void setStart800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    start800 = checkStart800MaxLimit(number); 
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
	
	/**
	 *	Returns the value of currPtrLngth800
	 *	@return currPtrLngth800
	 */
	public long getCurrPtrLngth800() throws CFException {
   		return currPtrLngth800;
	}
	
	/**
	 * 	Update CurrPtrLngth800 with the passed value
	 *  Corresponding COBOL Variable is 800-CURR-PTR-LNGTH
	 *	@param number
	 */
	public void setCurrPtrLngth800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    currPtrLngth800 = checkCurrPtrLngth800MaxLimit(number); 
	}



	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
