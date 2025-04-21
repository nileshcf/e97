package com.cloudframe.app.edjaddrs.dto.serialize;

/**
*  The class RctHdrOrTrlAkaHotInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RctHdrOrTrlAkaHotInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RctHdrOrTrlAkaHotInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RCT_HDR_OR_TRL_AKA_HOT_INFO_LENGTH = 315;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for RctHdrOrTrlAkaHotInfoSerialized
	**/
    public RctHdrOrTrlAkaHotInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RctHdrOrTrlAkaHotInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RctHdrOrTrlAkaHotInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RctHdrOrTrlAkaHotInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this RctHdrOrTrlAkaHotInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in RctHdrOrTrlAkaHotInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RCT_HDR_OR_TRL_AKA_HOT_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
