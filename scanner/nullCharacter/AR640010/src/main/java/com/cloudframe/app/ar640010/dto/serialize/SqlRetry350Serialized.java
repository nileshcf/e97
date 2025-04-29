package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SqlRetry350Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlRetry350Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlRetry350Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQL_RETRY_350_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlRetryAttempts350;
            protected  int beginSqlRetryAttemptsD350;
            protected  int beginSqlRetryIntervalD350;
	
	/**
	* Constructor for SqlRetry350Serialized
	**/
    public SqlRetry350Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SqlRetry350Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQL_RETRY_350_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlRetryAttempts350 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginSqlRetryAttemptsD350 = getStartOffset() + 10;	// set offset for serialization
  
             beginSqlRetryIntervalD350 = getStartOffset() + 12;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSqlRetryAttempts350Counter = -1;
         public boolean isSqlRetryAttempts350Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlRetryAttempts350Counter != sharedCounter;
            localSqlRetryAttempts350Counter = sharedCounter; return hasModified; 
         }
   protected static final int SQL_RETRY_ATTEMPTS_350_LEN = 2;
  	/**
	 * serializeSqlRetryAttempts350
	 */
	protected void serializeSqlRetryAttempts350(short sqlRetryAttempts350) {
           replaceValue( //  save the value as string
                   getBinaryString( sqlRetryAttempts350,SQL_RETRY_ATTEMPTS_350_LEN)
                  ,beginSqlRetryAttempts350
                  ,SQL_RETRY_ATTEMPTS_350_LEN
                 );
            localSqlRetryAttempts350Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSqlRetryAttempts350MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSqlRetryAttempts350 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSqlRetryAttempts350() {	 
			return (getShort(beginSqlRetryAttempts350));
   	}
         int localSqlRetryAttemptsD350Counter = -1;
         public boolean isSqlRetryAttemptsD350Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlRetryAttemptsD350Counter != sharedCounter;
            localSqlRetryAttemptsD350Counter = sharedCounter; return hasModified; 
         }
   protected static final int SQL_RETRY_ATTEMPTS_D_350_LEN = 2;
  	/**
	 * serializeSqlRetryAttemptsD350
	 */
	protected void serializeSqlRetryAttemptsD350(short sqlRetryAttemptsD350) {
           replaceValue( //  save the value as string
                   getBinaryString( sqlRetryAttemptsD350,SQL_RETRY_ATTEMPTS_D_350_LEN)
                  ,beginSqlRetryAttemptsD350
                  ,SQL_RETRY_ATTEMPTS_D_350_LEN
                 );
            localSqlRetryAttemptsD350Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSqlRetryAttemptsD350MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSqlRetryAttemptsD350 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSqlRetryAttemptsD350() {	 
			return (getShort(beginSqlRetryAttemptsD350));
   	}
     int localSqlRetryIntervalD350Counter = -1;
     public boolean isSqlRetryIntervalD350Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlRetryIntervalD350Counter != sharedCounter;
         localSqlRetryIntervalD350Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sqlRetryIntervalD350
	 *	@return sqlRetryIntervalD350
	 */
	public char[]  getSqlRetryIntervalD350String() {
	     return getCharArray(beginSqlRetryIntervalD350,SQL_RETRY_INTERVAL_D_350_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sqlRetryIntervalD350IsNumeric() {
	    return isNumeric(beginSqlRetryIntervalD350
	                    ,beginSqlRetryIntervalD350 + SQL_RETRY_INTERVAL_D_350_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SQL_RETRY_INTERVAL_D_350_LEN = 8;
  	/**
	 * serializeSqlRetryIntervalD350
	 */
	protected void serializeSqlRetryIntervalD350(long sqlRetryIntervalD350) {
		 putNumber(beginSqlRetryIntervalD350,sqlRetryIntervalD350,SQL_RETRY_INTERVAL_D_350_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSqlRetryIntervalD350Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSqlRetryIntervalD350
	 */
   	protected  long serializeSqlRetryIntervalD350(char[] value) {
	    long  sqlRetryIntervalD350;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sqlRetryIntervalD350 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSqlRetryIntervalD350
		       ,8
		      );
		 localSqlRetryIntervalD350Counter = shareString.getSerializedField().getModifiedCounter();
		return  sqlRetryIntervalD350;
    }

   protected long checkSqlRetryIntervalD350MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSqlRetryIntervalD350 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSqlRetryIntervalD350() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSqlRetryIntervalD350
			                 ,SQL_RETRY_INTERVAL_D_350_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sqlRetryIntervalD350", beginSqlRetryIntervalD350,SQL_RETRY_INTERVAL_D_350_LEN);
    }
   	}




}
  
