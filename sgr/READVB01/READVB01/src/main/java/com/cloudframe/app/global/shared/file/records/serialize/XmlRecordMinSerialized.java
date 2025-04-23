package com.cloudframe.app.global.shared.file.records.serialize;

/**
*  The class XmlRecordMinSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XmlRecordMinSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XmlRecordMinSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XML_RECORD_MIN_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginXmlRecordMinString;
	
	/**
	* Constructor for XmlRecordMinSerialized
	**/
    public XmlRecordMinSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for XmlRecordMinSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XmlRecordMinSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this XmlRecordMinSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this XmlRecordMinSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in XmlRecordMinSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XML_RECORD_MIN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginXmlRecordMinString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localXmlRecordMinStringCounter = -1;
     public boolean isXmlRecordMinStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localXmlRecordMinStringCounter != sharedCounter;
         localXmlRecordMinStringCounter = sharedCounter; return hasModified;
     }
	protected static final int XML_RECORD_MIN_STRING_LEN = 43;
	/**
	 * 	serialize this XmlRecordMinString
	 */
   protected void serializeXmlRecordMinString(char[] xmlRecordMinString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(xmlRecordMinString,0,getStringValue(),beginXmlRecordMinString,XML_RECORD_MIN_STRING_LEN);
       localXmlRecordMinStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkXmlRecordMinStringConstraints(char[] value) {
   			return super.checkConstraints(value , 43 ,false, false);
   }
    /**
	 *	refreshXmlRecordMinString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshXmlRecordMinString() {	 
   		return (substring(getStringValue(),beginXmlRecordMinString,beginXmlRecordMinString + XML_RECORD_MIN_STRING_LEN));
   	}




}
  
