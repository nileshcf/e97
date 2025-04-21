package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503Bd32BulkDataTranLogSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503Bd32BulkDataTranLogSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503Bd32BulkDataTranLogSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_BD_32_BULK_DATA_TRAN_LOG_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Sf503Bd32BulkDataTranLogSerialized
	**/
    public Sf503Bd32BulkDataTranLogSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503Bd32BulkDataTranLogSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503Bd32BulkDataTranLogSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503Bd32BulkDataTranLogSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503Bd32BulkDataTranLogSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503Bd32BulkDataTranLogSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_BD_32_BULK_DATA_TRAN_LOG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
