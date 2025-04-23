package com.cloudframe.app.ip666030.dto.serialize;

/**
*  The class StartGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:01. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StartGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StartGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int START_GROUP_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStart800;
            protected  int beginStartR800;
	
	/**
	* Constructor for StartGroup800Serialized
	**/
    public StartGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in StartGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(START_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStart800 = getStartOffset() + 0;	// set offset for serialization
  
             beginStartR800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localStart800Counter = -1;
         public boolean isStart800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStart800Counter != sharedCounter;
            localStart800Counter = sharedCounter; return hasModified; 
         }
   protected static final int START_800_LEN = 4;
  	/**
	 * serializeStart800
	 */
	protected void serializeStart800(int start800) {
           replaceValue( //  save the value as string
                   getBinaryString( start800,START_800_LEN)
                  ,beginStart800
                  ,START_800_LEN
                 );
            localStart800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkStart800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshStart800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStart800() {	 
			return (getInt(beginStart800));
   	}
         int localStartR800Counter = -1;
         public boolean isStartR800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStartR800Counter != sharedCounter;
            localStartR800Counter = sharedCounter; return hasModified; 
         }
   protected static final int START_R_800_LEN = 4;
  	/**
	 * serializeStartR800
	 */
	protected void serializeStartR800(int startR800) {
           replaceValue( //  save the value as string
                   getBinaryString( startR800,START_R_800_LEN)
                  ,beginStartR800
                  ,START_R_800_LEN
                 );
            localStartR800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkStartR800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshStartR800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStartR800() {	 
			return (getInt(beginStartR800));
   	}




}
  
