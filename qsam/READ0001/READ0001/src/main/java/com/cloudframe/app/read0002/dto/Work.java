package com.cloudframe.app.read0002.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.read0002.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] xmlData = Field.fillLowValue(80);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
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

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
