package com.cloudframe.app.read0001.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/


import com.cloudframe.app.read0001.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] xmlData = Field.fillLowValue(80);

						private char[] read000201 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRead000201(("READ0002").toCharArray());
    }


 

	/**
	 *	Returns the value of xmlData
	 *	@return xmlData
	 */
   public char[] getXmlData() throws CFException{
   		return xmlData;
   }

  
	/**
	*  set variable xmlData
	*  Corresponding COBOL Variable is WS-XML-DATA
	*  @param value
	**/
   public void setXmlData(char[] value) {
       value = checkXmlDataConstraints(value);
       arraycopy(value,0,xmlData,0,value.length);
   } 
	public void setXmlData(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,xmlData,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of read000201
	 *	@return read000201
	 */
   public char[] getRead000201() throws CFException{
   		return read000201;
   }

  
	/**
	*  set variable read000201
	*  Corresponding COBOL Variable is WS-READ0002
	*  @param value
	**/
   public void setRead000201(char[] value) {
       value = checkRead000201Constraints(value);
       arraycopy(value,0,read000201,0,value.length);
   } 
	public void setRead000201(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,read000201,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
