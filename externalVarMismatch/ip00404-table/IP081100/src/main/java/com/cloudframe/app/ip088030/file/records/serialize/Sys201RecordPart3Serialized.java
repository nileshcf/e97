package com.cloudframe.app.ip088030.file.records.serialize;

/**
*  The class Sys201RecordPart3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201RecordPart3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201RecordPart3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_RECORD_PART_3_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSys201CalcFeeInfo;
           protected static final int SYS_201_CALC_FEE_INFO_SIZE = 2;
	
	/**
	* Constructor for Sys201RecordPart3Serialized
	**/
    public Sys201RecordPart3Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sys201RecordPart3Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys201RecordPart3Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sys201RecordPart3Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,750); // serialize this field at offset 750 by default 
    }
    
	/**
	* sets parent for this Sys201RecordPart3Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 750 by default
    }    
	/**
	* initializes the field in Sys201RecordPart3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_RECORD_PART_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSys201CalcFeeInfo = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int sys201CalcFeeInfoSize() {
			return SYS_201_CALC_FEE_INFO_SIZE;
		}



}
  
