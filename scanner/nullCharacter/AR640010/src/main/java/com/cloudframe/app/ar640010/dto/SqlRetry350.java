package com.cloudframe.app.ar640010.dto;

/**
*  The class SqlRetry350 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SqlRetry350 extends SqlRetry350Serialized {
   

								private short sqlRetryAttempts350;
				private SqlRetryIntervalGroup350 sqlRetryIntervalGroup350 = new SqlRetryIntervalGroup350();

								private short sqlRetryAttemptsD350;

								private long sqlRetryIntervalD350;
	
	/**
	* Constructor for SqlRetry350
	**/
    public SqlRetry350() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sqlRetryIntervalGroup350.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setSqlRetryAttempts350((short)30);
								setSqlRetryAttemptsD350((short)30);
								setSqlRetryIntervalD350(100L);
    }


 

	/**
	 *	Returns the value of sqlRetryAttempts350
	 *	@return sqlRetryAttempts350
	 */
	public short getSqlRetryAttempts350() throws CFException {
        if (isSqlRetryAttempts350Modified()) { 
           sqlRetryAttempts350 = refreshSqlRetryAttempts350();
        }
   		return sqlRetryAttempts350;
	}
	
	/**
	 * 	Update SqlRetryAttempts350 with the passed value
	 *  Corresponding COBOL Variable is 350-SQL-RETRY-ATTEMPTS
	 *	@param number
	 */
	public void setSqlRetryAttempts350(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlRetryAttempts350 = checkSqlRetryAttempts350MaxLimit(number); 
		serializeSqlRetryAttempts350(sqlRetryAttempts350);
	}

	public void setSqlRetryAttempts350(int number) {
	    number = checkSqlRetryAttempts350MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlRetryAttempts350((short)number);
	}
	public void setSqlRetryAttempts350(long number) {
	    number = checkSqlRetryAttempts350MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlRetryAttempts350((short)number);
	}
	

	/**
	 *	Returns the value of sqlRetryIntervalGroup350
	 *	@return sqlRetryIntervalGroup350
	 */   
	 public SqlRetryIntervalGroup350 getSqlRetryIntervalGroup350() {
   	return sqlRetryIntervalGroup350;
   }
   /**
	* 	Update SqlRetryIntervalGroup350 with the passed value
	*   Corresponding COBOL Variable is 350-SQL-RETRY-INTERVAL-GROUP
	*	@param value
	*/
   public void setSqlRetryIntervalGroup350(char[] value) {
      sqlRetryIntervalGroup350.setString(value); 
   }   
    
     /**
	 * 	Update SqlRetryIntervalGroup350 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlRetryIntervalGroup350(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlRetryIntervalGroup350.begin,sqlRetryIntervalGroup350.length());
   }
   
     /**
	 * 	Update SqlRetryIntervalGroup350 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlRetryIntervalGroup350(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlRetryIntervalGroup350.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SqlRetryIntervalGroup350 with another Field
	 *	@param value
	 */
   public void setSqlRetryIntervalGroup350(Field source) {
   	replace(source,0,source.length(),sqlRetryIntervalGroup350.begin,sqlRetryIntervalGroup350.length());
   }  
   
     /**
	 * 	Update SqlRetryIntervalGroup350 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlRetryIntervalGroup350(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sqlRetryIntervalGroup350.begin,sqlRetryIntervalGroup350.length());
   }
   
     /**
	 * 	Update SqlRetryIntervalGroup350 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlRetryIntervalGroup350(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sqlRetryIntervalGroup350.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sqlRetryAttemptsD350
	 *	@return sqlRetryAttemptsD350
	 */
	public short getSqlRetryAttemptsD350() throws CFException {
        if (isSqlRetryAttemptsD350Modified()) { 
           sqlRetryAttemptsD350 = refreshSqlRetryAttemptsD350();
        }
   		return sqlRetryAttemptsD350;
	}
	
	/**
	 * 	Update SqlRetryAttemptsD350 with the passed value
	 *  Corresponding COBOL Variable is 350-SQL-RETRY-ATTEMPTS-D
	 *	@param number
	 */
	public void setSqlRetryAttemptsD350(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sqlRetryAttemptsD350 = checkSqlRetryAttemptsD350MaxLimit(number); 
		serializeSqlRetryAttemptsD350(sqlRetryAttemptsD350);
	}

	public void setSqlRetryAttemptsD350(int number) {
	    number = checkSqlRetryAttemptsD350MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlRetryAttemptsD350((short)number);
	}
	public void setSqlRetryAttemptsD350(long number) {
	    number = checkSqlRetryAttemptsD350MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSqlRetryAttemptsD350((short)number);
	}
	

	/**
	 *	Returns the value of sqlRetryIntervalD350
	 *	@return sqlRetryIntervalD350
	 */
	public long getSqlRetryIntervalD350() throws CFException {
       if (isSqlRetryIntervalD350Modified()) { 
           sqlRetryIntervalD350 = refreshSqlRetryIntervalD350();
        }
   		return sqlRetryIntervalD350;
	}
	

	
	   
	/**
	 * 	Update SqlRetryIntervalD350 with the passed value
	 *  Corresponding COBOL Variable is 350-SQL-RETRY-INTERVAL-D
	 *	@param number
	 */
	public void setSqlRetryIntervalD350(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sqlRetryIntervalD350 = checkSqlRetryIntervalD350MaxLimit(number); 
		serializeSqlRetryIntervalD350(sqlRetryIntervalD350);
	}
	

	/**
	 * 	Update SqlRetryIntervalD350 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSqlRetryIntervalD350(char[] value) throws CFException {
		 sqlRetryIntervalD350 = serializeSqlRetryIntervalD350(value);
	}
	/**
	 * 	Update SqlRetryIntervalD350 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSqlRetryIntervalD350String(char[] value) throws CFException {
		 setSqlRetryIntervalD350(value);
	}

	
	
	

		public static int getSqlRetry350FieldLength() {
			return SQL_RETRY_350_LENGTH;
		}

}
  
