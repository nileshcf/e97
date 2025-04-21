package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503ChkLogAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503ChkLogAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503ChkLogAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_CHK_LOG_AREA_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Sf503ChkLogAreaSerialized
	**/
    public Sf503ChkLogAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503ChkLogAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503ChkLogAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503ChkLogAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503ChkLogAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503ChkLogAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_CHK_LOG_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
