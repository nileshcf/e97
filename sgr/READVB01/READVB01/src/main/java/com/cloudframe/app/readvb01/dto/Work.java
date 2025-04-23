package com.cloudframe.app.readvb01.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.readvb01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] xmlData = Field.fillLowValue(80);

						private char[] readvb0201 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setReadvb0201(("READVB02").toCharArray());
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
	 *	Returns the value of readvb0201
	 *	@return readvb0201
	 */
   public char[] getReadvb0201() throws CFException{
   		return readvb0201;
   }

  
	/**
	*  set variable readvb0201
	*  Corresponding COBOL Variable is WS-READVB02
	*  @param value
	**/
   public void setReadvb0201(char[] value) {
       value = checkReadvb0201Constraints(value);
       arraycopy(value,0,readvb0201,0,value.length);
   } 
	public void setReadvb0201(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,readvb0201,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
