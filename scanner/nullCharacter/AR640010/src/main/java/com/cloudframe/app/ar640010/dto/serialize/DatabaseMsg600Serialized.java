package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DatabaseMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DatabaseMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DatabaseMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DATABASE_MSG_600_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDatabaseDbid600;
            protected  int beginDatabaseDbpkg600;
	
	/**
	* Constructor for DatabaseMsg600Serialized
	**/
    public DatabaseMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DatabaseMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DATABASE_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDatabaseDbid600 = getStartOffset() + 18;	// set offset for serialization
  
  
             beginDatabaseDbpkg600 = getStartOffset() + 32;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDatabaseDbid600Counter = -1;
     public boolean isDatabaseDbid600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDatabaseDbid600Counter != sharedCounter;
         localDatabaseDbid600Counter = sharedCounter; return hasModified;
     }
	protected static final int DATABASE_DBID_600_LEN = 8;
	/**
	 * 	serialize this DatabaseDbid600
	 */
   protected void serializeDatabaseDbid600(char[] databaseDbid600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(databaseDbid600,0,getStringValue(),beginDatabaseDbid600,DATABASE_DBID_600_LEN);
       localDatabaseDbid600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDatabaseDbid600Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDatabaseDbid600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDatabaseDbid600() {	 
   		return (substring(getStringValue(),beginDatabaseDbid600,beginDatabaseDbid600 + DATABASE_DBID_600_LEN));
   	}
     int localDatabaseDbpkg600Counter = -1;
     public boolean isDatabaseDbpkg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDatabaseDbpkg600Counter != sharedCounter;
         localDatabaseDbpkg600Counter = sharedCounter; return hasModified;
     }
	protected static final int DATABASE_DBPKG_600_LEN = 18;
	/**
	 * 	serialize this DatabaseDbpkg600
	 */
   protected void serializeDatabaseDbpkg600(char[] databaseDbpkg600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(databaseDbpkg600,0,getStringValue(),beginDatabaseDbpkg600,DATABASE_DBPKG_600_LEN);
       localDatabaseDbpkg600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDatabaseDbpkg600Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDatabaseDbpkg600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDatabaseDbpkg600() {	 
   		return (substring(getStringValue(),beginDatabaseDbpkg600,beginDatabaseDbpkg600 + DATABASE_DBPKG_600_LEN));
   	}




}
  
