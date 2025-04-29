package com.cloudframe.app.global.shared.file.records.serialize;

/**
*  The class XmlRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XmlRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XmlRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XML_RECORD_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXmlRecordString;
	
	/**
	* Constructor for XmlRecordSerialized
	**/
    public XmlRecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in XmlRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XML_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginXmlRecordString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localXmlRecordStringCounter = -1;
     public boolean isXmlRecordStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlRecordStringCounter != sharedCounter;
         localXmlRecordStringCounter = sharedCounter; return hasModified;
     }
	protected static final int XML_RECORD_STRING_LEN = 80;
	/**
	 * 	serialize this XmlRecordString
	 */
   protected void serializeXmlRecordString(char[] xmlRecordString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xmlRecordString,0,getStringValue(),beginXmlRecordString,XML_RECORD_STRING_LEN);
       localXmlRecordStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXmlRecordStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshXmlRecordString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXmlRecordString() {	 
   		return (substring(getStringValue(),beginXmlRecordString,beginXmlRecordString + XML_RECORD_STRING_LEN));
   	}




}
  
