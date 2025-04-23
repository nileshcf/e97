package com.cloudframe.app.global.shared.file.records.serialize;

/**
*  The class XmlRecordMaxGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class XmlRecordMaxGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(XmlRecordMaxGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int XML_RECORD_MAX_GROUP_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for XmlRecordMaxGroupSerialized
	**/
    public XmlRecordMaxGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in XmlRecordMaxGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(XML_RECORD_MAX_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
