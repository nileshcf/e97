package com.cloudframe.app.ar640010.dto;

/**
*  The class SqlRetryIntervalGroup350 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SqlRetryIntervalGroup350 extends SqlRetryIntervalGroup350Serialized { 
   

								private long sqlRetryInterval350;
	
	/**
	* Constructor for SqlRetryIntervalGroup350
	**/
    public SqlRetryIntervalGroup350() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SqlRetryIntervalGroup350. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlRetryIntervalGroup350(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSqlRetryInterval350(100L);
    } 

	/**
	 *	Returns the value of sqlRetryInterval350
	 *	@return sqlRetryInterval350
	 */
	public long getSqlRetryInterval350() throws CFException {
       if (isSqlRetryInterval350Modified()) { 
           sqlRetryInterval350 = refreshSqlRetryInterval350();
        }
   		return sqlRetryInterval350;
	}
	

	
	   
	/**
	 * 	Update SqlRetryInterval350 with the passed value
	 *  Corresponding COBOL Variable is 350-SQL-RETRY-INTERVAL
	 *	@param number
	 */
	public void setSqlRetryInterval350(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sqlRetryInterval350 = checkSqlRetryInterval350MaxLimit(number); 
		serializeSqlRetryInterval350(sqlRetryInterval350);
	}
	

	/**
	 * 	Update SqlRetryInterval350 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSqlRetryInterval350(char[] value) throws CFException {
		 sqlRetryInterval350 = serializeSqlRetryInterval350(value);
	}
	/**
	 * 	Update SqlRetryInterval350 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSqlRetryInterval350String(char[] value) throws CFException {
		 setSqlRetryInterval350(value);
	}

	
	
	

		public static int getSqlRetryIntervalGroup350FieldLength() {
			return SQL_RETRY_INTERVAL_GROUP_350_LENGTH;
		}

}
  
