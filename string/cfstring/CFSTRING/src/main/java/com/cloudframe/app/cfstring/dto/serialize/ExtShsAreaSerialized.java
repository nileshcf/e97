package com.cloudframe.app.cfstring.dto.serialize;

/**
*  The class ExtShsAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExtShsAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExtShsAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXT_SHS_AREA_LENGTH = 276;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginExtSpoTbl;
           protected static final int EXT_SPO_TBL_SIZE = 6;
	
	/**
	* Constructor for ExtShsAreaSerialized
	**/
    public ExtShsAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ExtShsAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtShsAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ExtShsAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1332); // serialize this field at offset 1332 by default 
    }
    
	/**
	* sets parent for this ExtShsAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1332 by default
    }    
	/**
	* initializes the field in ExtShsAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXT_SHS_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginExtSpoTbl = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int extSpoTblSize() {
			return EXT_SPO_TBL_SIZE;
		}



}
  
