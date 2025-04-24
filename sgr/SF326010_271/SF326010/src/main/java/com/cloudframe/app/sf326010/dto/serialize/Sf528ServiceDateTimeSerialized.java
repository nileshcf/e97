package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class Sf528ServiceDateTimeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf528ServiceDateTimeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf528ServiceDateTimeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_528_SERVICE_DATE_TIME_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Sf528ServiceDateTimeSerialized
	**/
    public Sf528ServiceDateTimeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf528ServiceDateTimeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf528ServiceDateTimeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf528ServiceDateTimeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,23); // serialize this field at offset 23 by default 
    }
    
	/**
	* sets parent for this Sf528ServiceDateTimeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 23 by default
    }    
	/**
	* initializes the field in Sf528ServiceDateTimeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_528_SERVICE_DATE_TIME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
