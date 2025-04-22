package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ErrorMsg6003014Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg6003014Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg6003014Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_6003014_LENGTH = 49;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRtnCd6003014;
	
	/**
	* Constructor for ErrorMsg6003014Serialized
	**/
    public ErrorMsg6003014Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg6003014Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_6003014_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginRtnCd6003014 = getStartOffset() + 41;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRtnCd6003014Counter = -1;
     public boolean isRtnCd6003014Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRtnCd6003014Counter != sharedCounter;
         localRtnCd6003014Counter = sharedCounter; return hasModified;
     }
	protected static final int RTN_CD_6003014_LEN = 8;
	/**
	 * 	serialize this RtnCd6003014
	 */
   protected void serializeRtnCd6003014(char[] rtnCd6003014) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rtnCd6003014,0,getStringValue(),beginRtnCd6003014,RTN_CD_6003014_LEN);
       localRtnCd6003014Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRtnCd6003014Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRtnCd6003014 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRtnCd6003014() {	 
   		return (substring(getStringValue(),beginRtnCd6003014,beginRtnCd6003014 + RTN_CD_6003014_LEN));
   	}




}
  
