package com.cloudframe.app.db2hst1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.db2hst1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] hvEmpFrom = new char[7];

						private char[] hvEmpThru = new char[7];

								private short sqlcode_Ws;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHvEmpFrom(("0000000").toCharArray());
								setHvEmpThru(("9999999").toCharArray());
    }


 

	/**
	 *	Returns the value of hvEmpFrom
	 *	@return hvEmpFrom
	 */
   public char[] getHvEmpFrom() throws CFException{
   		return hvEmpFrom;
   }

  
	/**
	*  set variable hvEmpFrom
	*  Corresponding COBOL Variable is HV-EMP-FROM
	*  @param value
	**/
   public void setHvEmpFrom(char[] value) {
       value = checkHvEmpFromConstraints(value);
       arraycopy(value,0,hvEmpFrom,0,value.length);
   } 
	public void setHvEmpFrom(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hvEmpFrom,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hvEmpThru
	 *	@return hvEmpThru
	 */
   public char[] getHvEmpThru() throws CFException{
   		return hvEmpThru;
   }

  
	/**
	*  set variable hvEmpThru
	*  Corresponding COBOL Variable is HV-EMP-THRU
	*  @param value
	**/
   public void setHvEmpThru(char[] value) {
       value = checkHvEmpThruConstraints(value);
       arraycopy(value,0,hvEmpThru,0,value.length);
   } 
	public void setHvEmpThru(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hvEmpThru,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
	public short getSqlcode_Ws() throws CFException {
       if (isSqlcode_WsModified()) { 
           sqlcode_Ws = refreshSqlcode_Ws();
        }
   		return sqlcode_Ws;
	}
	

    /**
	 *	Returns the String value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
	public char[]  getSqlcode_WsActualString() {
	    String value = String.valueOf(sqlcode_Ws).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Sqlcode_Ws with the passed value
	 *  Corresponding COBOL Variable is WS-SQLCODE
	 *	@param number
	 */
	public void setSqlcode_Ws(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    sqlcode_Ws = checkSqlcode_WsMaxLimit(number); 
		serializeSqlcode_Ws(sqlcode_Ws);
	}
	
	public void setSqlcode_Ws(int number) {
	    number = checkSqlcode_WsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlcode_Ws((short)number);
	}
	public void setSqlcode_Ws(long number) {
	    number = checkSqlcode_WsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlcode_Ws((short)number);
	}
	

	/**
	 * 	Update Sqlcode_Ws with the passed value
	 *	@param value (String or char[])
	 */
	public void setSqlcode_Ws(char[] value) throws CFException {
		 sqlcode_Ws = serializeSqlcode_Ws(value);
	}
	/**
	 * 	Update Sqlcode_Ws with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSqlcode_WsString(char[] value) throws CFException {
		 setSqlcode_Ws(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
