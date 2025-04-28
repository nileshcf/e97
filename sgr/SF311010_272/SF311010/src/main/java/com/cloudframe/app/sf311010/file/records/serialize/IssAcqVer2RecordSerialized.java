package com.cloudframe.app.sf311010.file.records.serialize;

/**
*  The class IssAcqVer2RecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IssAcqVer2RecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IssAcqVer2RecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ISS_ACQ_VER_2_RECORD_LENGTH = 900;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIssAcqVer2RecordString;
	
	/**
	* Constructor for IssAcqVer2RecordSerialized
	**/
    public IssAcqVer2RecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IssAcqVer2RecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ISS_ACQ_VER_2_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIssAcqVer2RecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIssAcqVer2RecordStringCounter = -1;
     public boolean isIssAcqVer2RecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIssAcqVer2RecordStringCounter != sharedCounter;
         localIssAcqVer2RecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int ISS_ACQ_VER_2_RECORD_STRING_LEN = 900;
	/**
	 * 	serialize this IssAcqVer2RecordString
	 */
   protected void serializeIssAcqVer2RecordString(char[] issAcqVer2RecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(issAcqVer2RecordString,0,getStringValue(),beginIssAcqVer2RecordString,ISS_ACQ_VER_2_RECORD_STRING_LEN);
       localIssAcqVer2RecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIssAcqVer2RecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 900 ,false, false);
   }
    /**
	 *	refreshIssAcqVer2RecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIssAcqVer2RecordString() {	 
   		return (substring(getStringValue(),beginIssAcqVer2RecordString,beginIssAcqVer2RecordString + ISS_ACQ_VER_2_RECORD_STRING_LEN));
   	}




}
  
