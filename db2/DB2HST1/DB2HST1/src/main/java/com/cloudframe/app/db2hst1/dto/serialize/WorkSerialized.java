package com.cloudframe.app.db2hst1.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSqlcode_Ws;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginSqlcode_Ws = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvEmpFromCounter = -1;
     public boolean isHvEmpFromModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvEmpFromCounter != sharedCounter;
         localHvEmpFromCounter = sharedCounter; return hasModified;
     }

   protected char[] checkHvEmpFromConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
     int localHvEmpThruCounter = -1;
     public boolean isHvEmpThruModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvEmpThruCounter != sharedCounter;
         localHvEmpThruCounter = sharedCounter; return hasModified;
     }

   protected char[] checkHvEmpThruConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
     int localSqlcode_WsCounter = -1;
     public boolean isSqlcode_WsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcode_WsCounter != sharedCounter;
         localSqlcode_WsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
	public char[]  getSqlcode_WsString() {
	     return getCharArray(beginSqlcode_Ws,SQLCODE__WS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sqlcode_WsIsNumeric() {
	    return isNumeric(beginSqlcode_Ws
	                    ,beginSqlcode_Ws + SQLCODE__WS_LEN
	                    ,true/*Signed*/,false/*isSign trailing*/,true/*isSignStoredSeparately*/);
	}

  
   protected  static final int SQLCODE__WS_LEN = 4;
  	/**
	 * serializeSqlcode_Ws
	 */
	protected void serializeSqlcode_Ws(short sqlcode_Ws) {
		 putNumber(beginSqlcode_Ws,sqlcode_Ws,SQLCODE__WS_LEN,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/); 
		 localSqlcode_WsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSqlcode_Ws
	 */
   	protected  short serializeSqlcode_Ws(char[] value) {
	    short  sqlcode_Ws;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sqlcode_Ws = (short) convertString2Number(value,true/*isSigned?*/,false/*signTrailing?*/,true/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginSqlcode_Ws
		       ,4
		      );
		 localSqlcode_WsCounter = shareString.getSerializedField().getModifiedCounter();
		return  sqlcode_Ws;
    }

   protected short checkSqlcode_WsMaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSqlcode_Ws is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSqlcode_Ws() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginSqlcode_Ws
			                 ,SQLCODE__WS_LEN
			                 ,true/*isSigned*/,false/*isSignTrailing*/,true/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sqlcode_Ws", beginSqlcode_Ws,SQLCODE__WS_LEN);
    }
   	}




}
  
