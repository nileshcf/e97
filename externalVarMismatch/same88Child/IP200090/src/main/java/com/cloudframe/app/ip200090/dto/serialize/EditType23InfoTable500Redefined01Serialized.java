package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class EditType23InfoTable500Redefined01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EditType23InfoTable500Redefined01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EditType23InfoTable500Redefined01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EDIT_TYPE_23_INFO_TABLE_500_REDEFINED_01_LENGTH = 31344;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSyntaxEditInfoEntry500;
           protected static final int SYNTAX_EDIT_INFO_ENTRY_500_SIZE = 3918;
	
	/**
	* Constructor for EditType23InfoTable500Redefined01Serialized
	**/
    public EditType23InfoTable500Redefined01Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for EditType23InfoTable500Redefined01Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EditType23InfoTable500Redefined01Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this EditType23InfoTable500Redefined01Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this EditType23InfoTable500Redefined01Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in EditType23InfoTable500Redefined01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EDIT_TYPE_23_INFO_TABLE_500_REDEFINED_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSyntaxEditInfoEntry500 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int syntaxEditInfoEntry500Size() {
			return SYNTAX_EDIT_INFO_ENTRY_500_SIZE;
		}



}
  
