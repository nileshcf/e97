package com.cloudframe.app.ip343690.file.records.serialize;

/**
*  The class Db2cloneRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Db2cloneRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Db2cloneRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DB_2CLONE_REC_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDb2cloneRecString;
	
	/**
	* Constructor for Db2cloneRecSerialized
	**/
    public Db2cloneRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Db2cloneRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DB_2CLONE_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDb2cloneRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDb2cloneRecStringCounter = -1;
     public boolean isDb2cloneRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2cloneRecStringCounter != sharedCounter;
         localDb2cloneRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_2CLONE_REC_STRING_LEN = 80;
	/**
	 * 	serialize this Db2cloneRecString
	 */
   protected void serializeDb2cloneRecString(char[] db2cloneRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db2cloneRecString,0,getStringValue(),beginDb2cloneRecString,DB_2CLONE_REC_STRING_LEN);
       localDb2cloneRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb2cloneRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshDb2cloneRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb2cloneRecString() {	 
   		return (substring(getStringValue(),beginDb2cloneRecString,beginDb2cloneRecString + DB_2CLONE_REC_STRING_LEN));
   	}




}
  
