package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class SqlAbendMsg900Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlAbendMsg900Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlAbendMsg900Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQL_ABEND_MSG_900_LENGTH = 86;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAbendSqlCode900;
            protected  int beginAbendSqlerrmc900;
	
	/**
	* Constructor for SqlAbendMsg900Serialized
	**/
    public SqlAbendMsg900Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SqlAbendMsg900Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQL_ABEND_MSG_900_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginAbendSqlCode900 = getStartOffset() + 25;	// set offset for serialization
  
  
             beginAbendSqlerrmc900 = getStartOffset() + 36;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAbendSqlCode900Counter = -1;
     public boolean isAbendSqlCode900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendSqlCode900Counter != sharedCounter;
         localAbendSqlCode900Counter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_SQL_CODE_900_LEN = 10;
	/**
	 * 	serialize this AbendSqlCode900
	 */
   protected void serializeAbendSqlCode900(char[] abendSqlCode900) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendSqlCode900,0,getStringValue(),beginAbendSqlCode900,ABEND_SQL_CODE_900_LEN);
       localAbendSqlCode900Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendSqlCode900Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshAbendSqlCode900 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendSqlCode900() {	 
   		return (substring(getStringValue(),beginAbendSqlCode900,beginAbendSqlCode900 + ABEND_SQL_CODE_900_LEN));
   	}
     int localAbendSqlerrmc900Counter = -1;
     public boolean isAbendSqlerrmc900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendSqlerrmc900Counter != sharedCounter;
         localAbendSqlerrmc900Counter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_SQLERRMC_900_LEN = 50;
	/**
	 * 	serialize this AbendSqlerrmc900
	 */
   protected void serializeAbendSqlerrmc900(char[] abendSqlerrmc900) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendSqlerrmc900,0,getStringValue(),beginAbendSqlerrmc900,ABEND_SQLERRMC_900_LEN);
       localAbendSqlerrmc900Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendSqlerrmc900Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshAbendSqlerrmc900 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendSqlerrmc900() {	 
   		return (substring(getStringValue(),beginAbendSqlerrmc900,beginAbendSqlerrmc900 + ABEND_SQLERRMC_900_LEN));
   	}




}
  
