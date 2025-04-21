package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ErrorMsg6003008Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg6003008Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg6003008Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_6003008_LENGTH = 57;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTable6003008;
            protected  int beginMaxSize6003008;
	
	/**
	* Constructor for ErrorMsg6003008Serialized
	**/
    public ErrorMsg6003008Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg6003008Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_6003008_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTable6003008 = getStartOffset() + 6;	// set offset for serialization
  
  
             beginMaxSize6003008 = getStartOffset() + 49;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTable6003008Counter = -1;
     public boolean isTable6003008Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTable6003008Counter != sharedCounter;
         localTable6003008Counter = sharedCounter; return hasModified;
     }
	protected static final int TABLE_6003008_LEN = 21;
	/**
	 * 	serialize this Table6003008
	 */
   protected void serializeTable6003008(char[] table6003008) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(table6003008,0,getStringValue(),beginTable6003008,TABLE_6003008_LEN);
       localTable6003008Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTable6003008Constraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
    /**
	 *	refreshTable6003008 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTable6003008() {	 
   		return (substring(getStringValue(),beginTable6003008,beginTable6003008 + TABLE_6003008_LEN));
   	}
     int localMaxSize6003008Counter = -1;
     public boolean isMaxSize6003008Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxSize6003008Counter != sharedCounter;
         localMaxSize6003008Counter = sharedCounter; return hasModified;
     }
	protected static final int MAX_SIZE_6003008_LEN = 8;
	/**
	 * 	serialize this MaxSize6003008
	 */
   protected void serializeMaxSize6003008(char[] maxSize6003008) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(maxSize6003008,0,getStringValue(),beginMaxSize6003008,MAX_SIZE_6003008_LEN);
       localMaxSize6003008Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMaxSize6003008Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMaxSize6003008 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMaxSize6003008() {	 
   		return (substring(getStringValue(),beginMaxSize6003008,beginMaxSize6003008 + MAX_SIZE_6003008_LEN));
   	}




}
  
