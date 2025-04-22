package com.cloudframe.app.xmlpars2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.xmlpars2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] elemNm = new char[20];

						private char[] attrNm = new char[20];

								private short elemLen;

								private short attrLen;

								private int i;

						private char[] vXml = new char[478];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setElemNm(fillSpace(20));
								setAttrNm(fillSpace(20));
								setElemLen((short)0);
								setAttrLen((short)0);
								setI(0);
								setVXml("<?xml version=\"1.0\" encoding=\"UTF-8\"?><EDR_CPF><CLIENT_ID>VISION</CLIENT_ID><TR_COUNT>1</TR_COUNT><BILLING_SYSTEM_ID>2</BILLING_SYSTEM_ID><TRAN_ID>20180130052423461412</TRAN_ID><REFRESH><TR_POPKEY><TR_TYPE>REFRESH</TR_TYPE><TR_TIME>2018-01-30-05.24.15.503368</TR_TIME><TR_FULFILLMENT_TIME>2018-01-30-05.24.15.503368</TR_FULFILLMENT_TIME><TR_MDN>7024193433</TR_MDN><TR_ACCOUNT_NUMBER>0</TR_ACCOUNT_NUMBER><TR_CUSTOMER_ID>203082888</TR_CUSTOMER_ID></TR_POPKEY></REFRESH></EDR_CPF>".toCharArray());
    }


 

	/**
	 *	Returns the value of elemNm
	 *	@return elemNm
	 */
   public char[] getElemNm() throws CFException{
   		return elemNm;
   }

  
	/**
	*  set variable elemNm
	*  Corresponding COBOL Variable is WS-ELEM-NM
	*  @param value
	**/
   public void setElemNm(char[] value) {
       value = checkElemNmConstraints(value);
       arraycopy(value,0,elemNm,0,value.length);
   } 
	public void setElemNm(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,elemNm,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of attrNm
	 *	@return attrNm
	 */
   public char[] getAttrNm() throws CFException{
   		return attrNm;
   }

  
	/**
	*  set variable attrNm
	*  Corresponding COBOL Variable is WS-ATTR-NM
	*  @param value
	**/
   public void setAttrNm(char[] value) {
       value = checkAttrNmConstraints(value);
       arraycopy(value,0,attrNm,0,value.length);
   } 
	public void setAttrNm(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,attrNm,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of elemLen
	 *	@return elemLen
	 */
	public short getElemLen() throws CFException {
   		return elemLen;
	}
	
	/**
	 * 	Update ElemLen with the passed value
	 *  Corresponding COBOL Variable is WS-ELEM-LEN
	 *	@param number
	 */
	public void setElemLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    elemLen = checkElemLenMaxLimit(number); 
	}

	public void setElemLen(int number) {
	    number = checkElemLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setElemLen((short)number);
	}
	public void setElemLen(long number) {
	    number = checkElemLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setElemLen((short)number);
	}
	

	/**
	 *	Returns the value of attrLen
	 *	@return attrLen
	 */
	public short getAttrLen() throws CFException {
   		return attrLen;
	}
	
	/**
	 * 	Update AttrLen with the passed value
	 *  Corresponding COBOL Variable is WS-ATTR-LEN
	 *	@param number
	 */
	public void setAttrLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    attrLen = checkAttrLenMaxLimit(number); 
	}

	public void setAttrLen(int number) {
	    number = checkAttrLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAttrLen((short)number);
	}
	public void setAttrLen(long number) {
	    number = checkAttrLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAttrLen((short)number);
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
	
	/**
	 *	Returns the value of vXml
	 *	@return vXml
	 */
   public char[] getVXml() throws CFException{
   		return vXml;
   }

  
	/**
	*  set variable vXml
	*  Corresponding COBOL Variable is WS-V-XML
	*  @param value
	**/
   public void setVXml(char[] value) {
       value = checkVXmlConstraints(value);
       arraycopy(value,0,vXml,0,value.length);
   } 
	public void setVXml(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vXml,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
