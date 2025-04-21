package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DbcafControlRecord210Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DbcafControlRecord210Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DbcafControlRecord210Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DBCAF_CONTROL_RECORD_210_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDbcafControlDbid210;
            protected  int beginDbcafControlDbpkg210;
            protected  int beginDbcafControlHlqid210;
            protected  int beginDbcafControlMgosDbpkg210;
            protected  int beginDbcafControlMgosDbid210;
	
	/**
	* Constructor for DbcafControlRecord210Serialized
	**/
    public DbcafControlRecord210Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DbcafControlRecord210Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DBCAF_CONTROL_RECORD_210_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDbcafControlDbid210 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginDbcafControlDbpkg210 = getStartOffset() + 9;	// set offset for serialization
  
  
             beginDbcafControlHlqid210 = getStartOffset() + 26;	// set offset for serialization
  
  
             beginDbcafControlMgosDbpkg210 = getStartOffset() + 31;	// set offset for serialization
  
  
             beginDbcafControlMgosDbid210 = getStartOffset() + 50;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDbcafControlDbid210Counter = -1;
     public boolean isDbcafControlDbid210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDbcafControlDbid210Counter != sharedCounter;
         localDbcafControlDbid210Counter = sharedCounter; return hasModified;
     }
	protected static final int DBCAF_CONTROL_DBID_210_LEN = 8;
	/**
	 * 	serialize this DbcafControlDbid210
	 */
   protected void serializeDbcafControlDbid210(char[] dbcafControlDbid210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dbcafControlDbid210,0,getStringValue(),beginDbcafControlDbid210,DBCAF_CONTROL_DBID_210_LEN);
       localDbcafControlDbid210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDbcafControlDbid210Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDbcafControlDbid210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDbcafControlDbid210() {	 
   		return (substring(getStringValue(),beginDbcafControlDbid210,beginDbcafControlDbid210 + DBCAF_CONTROL_DBID_210_LEN));
   	}
     int localDbcafControlDbpkg210Counter = -1;
     public boolean isDbcafControlDbpkg210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDbcafControlDbpkg210Counter != sharedCounter;
         localDbcafControlDbpkg210Counter = sharedCounter; return hasModified;
     }
	protected static final int DBCAF_CONTROL_DBPKG_210_LEN = 16;
	/**
	 * 	serialize this DbcafControlDbpkg210
	 */
   protected void serializeDbcafControlDbpkg210(char[] dbcafControlDbpkg210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dbcafControlDbpkg210,0,getStringValue(),beginDbcafControlDbpkg210,DBCAF_CONTROL_DBPKG_210_LEN);
       localDbcafControlDbpkg210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDbcafControlDbpkg210Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDbcafControlDbpkg210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDbcafControlDbpkg210() {	 
   		return (substring(getStringValue(),beginDbcafControlDbpkg210,beginDbcafControlDbpkg210 + DBCAF_CONTROL_DBPKG_210_LEN));
   	}
     int localDbcafControlHlqid210Counter = -1;
     public boolean isDbcafControlHlqid210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDbcafControlHlqid210Counter != sharedCounter;
         localDbcafControlHlqid210Counter = sharedCounter; return hasModified;
     }
	protected static final int DBCAF_CONTROL_HLQID_210_LEN = 4;
	/**
	 * 	serialize this DbcafControlHlqid210
	 */
   protected void serializeDbcafControlHlqid210(char[] dbcafControlHlqid210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dbcafControlHlqid210,0,getStringValue(),beginDbcafControlHlqid210,DBCAF_CONTROL_HLQID_210_LEN);
       localDbcafControlHlqid210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDbcafControlHlqid210Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshDbcafControlHlqid210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDbcafControlHlqid210() {	 
   		return (substring(getStringValue(),beginDbcafControlHlqid210,beginDbcafControlHlqid210 + DBCAF_CONTROL_HLQID_210_LEN));
   	}
     int localDbcafControlMgosDbpkg210Counter = -1;
     public boolean isDbcafControlMgosDbpkg210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDbcafControlMgosDbpkg210Counter != sharedCounter;
         localDbcafControlMgosDbpkg210Counter = sharedCounter; return hasModified;
     }
	protected static final int DBCAF_CONTROL_MGOS_DBPKG_210_LEN = 18;
	/**
	 * 	serialize this DbcafControlMgosDbpkg210
	 */
   protected void serializeDbcafControlMgosDbpkg210(char[] dbcafControlMgosDbpkg210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dbcafControlMgosDbpkg210,0,getStringValue(),beginDbcafControlMgosDbpkg210,DBCAF_CONTROL_MGOS_DBPKG_210_LEN);
       localDbcafControlMgosDbpkg210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDbcafControlMgosDbpkg210Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDbcafControlMgosDbpkg210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDbcafControlMgosDbpkg210() {	 
   		return (substring(getStringValue(),beginDbcafControlMgosDbpkg210,beginDbcafControlMgosDbpkg210 + DBCAF_CONTROL_MGOS_DBPKG_210_LEN));
   	}
     int localDbcafControlMgosDbid210Counter = -1;
     public boolean isDbcafControlMgosDbid210Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDbcafControlMgosDbid210Counter != sharedCounter;
         localDbcafControlMgosDbid210Counter = sharedCounter; return hasModified;
     }
	protected static final int DBCAF_CONTROL_MGOS_DBID_210_LEN = 8;
	/**
	 * 	serialize this DbcafControlMgosDbid210
	 */
   protected void serializeDbcafControlMgosDbid210(char[] dbcafControlMgosDbid210) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dbcafControlMgosDbid210,0,getStringValue(),beginDbcafControlMgosDbid210,DBCAF_CONTROL_MGOS_DBID_210_LEN);
       localDbcafControlMgosDbid210Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDbcafControlMgosDbid210Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDbcafControlMgosDbid210 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDbcafControlMgosDbid210() {	 
   		return (substring(getStringValue(),beginDbcafControlMgosDbid210,beginDbcafControlMgosDbid210 + DBCAF_CONTROL_MGOS_DBID_210_LEN));
   	}




}
  
