package com.cloudframe.app.global.shared.file.records.serialize;

/**
*  The class XmlRecordMaxSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XmlRecordMaxSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XmlRecordMaxSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XML_RECORD_MAX_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXmlRecordMaxString;
	
	/**
	* Constructor for XmlRecordMaxSerialized
	**/
    public XmlRecordMaxSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XmlRecordMaxSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XmlRecordMaxSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XmlRecordMaxSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this XmlRecordMaxSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in XmlRecordMaxSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XML_RECORD_MAX_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginXmlRecordMaxString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localXmlRecordMaxStringCounter = -1;
     public boolean isXmlRecordMaxStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlRecordMaxStringCounter != sharedCounter;
         localXmlRecordMaxStringCounter = sharedCounter; return hasModified;
     }
	protected static final int XML_RECORD_MAX_STRING_LEN = 80;
	/**
	 * 	serialize this XmlRecordMaxString
	 */
   protected void serializeXmlRecordMaxString(char[] xmlRecordMaxString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xmlRecordMaxString,0,getStringValue(),beginXmlRecordMaxString,XML_RECORD_MAX_STRING_LEN);
       localXmlRecordMaxStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXmlRecordMaxStringConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshXmlRecordMaxString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXmlRecordMaxString() {	 
   		return (substring(getStringValue(),beginXmlRecordMaxString,beginXmlRecordMaxString + XML_RECORD_MAX_STRING_LEN));
   	}




}
  
