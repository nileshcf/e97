package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SqlRetryIntervalGroup350Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SqlRetryIntervalGroup350Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SqlRetryIntervalGroup350Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SQL_RETRY_INTERVAL_GROUP_350_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlRetryInterval350;
	
	/**
	* Constructor for SqlRetryIntervalGroup350Serialized
	**/
    public SqlRetryIntervalGroup350Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SqlRetryIntervalGroup350Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SqlRetryIntervalGroup350Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SqlRetryIntervalGroup350Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this SqlRetryIntervalGroup350Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in SqlRetryIntervalGroup350Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SQL_RETRY_INTERVAL_GROUP_350_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSqlRetryInterval350 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSqlRetryInterval350Counter = -1;
     public boolean isSqlRetryInterval350Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlRetryInterval350Counter != sharedCounter;
         localSqlRetryInterval350Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sqlRetryInterval350
	 *	@return sqlRetryInterval350
	 */
	public char[]  getSqlRetryInterval350String() {
	     return getCharArray(beginSqlRetryInterval350,SQL_RETRY_INTERVAL_350_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sqlRetryInterval350IsNumeric() {
	    return isNumeric(beginSqlRetryInterval350
	                    ,beginSqlRetryInterval350 + SQL_RETRY_INTERVAL_350_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SQL_RETRY_INTERVAL_350_LEN = 8;
  	/**
	 * serializeSqlRetryInterval350
	 */
	protected void serializeSqlRetryInterval350(long sqlRetryInterval350) {
		 putNumber(beginSqlRetryInterval350,sqlRetryInterval350,SQL_RETRY_INTERVAL_350_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSqlRetryInterval350Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSqlRetryInterval350
	 */
   	protected  long serializeSqlRetryInterval350(char[] value) {
	    long  sqlRetryInterval350;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sqlRetryInterval350 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSqlRetryInterval350
		       ,8
		      );
		 localSqlRetryInterval350Counter = shareString.getSerializedField().getModifiedCounter();
		return  sqlRetryInterval350;
    }

   protected long checkSqlRetryInterval350MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSqlRetryInterval350 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSqlRetryInterval350() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSqlRetryInterval350
			                 ,SQL_RETRY_INTERVAL_350_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sqlRetryInterval350", beginSqlRetryInterval350,SQL_RETRY_INTERVAL_350_LEN);
    }
   	}




}
  
