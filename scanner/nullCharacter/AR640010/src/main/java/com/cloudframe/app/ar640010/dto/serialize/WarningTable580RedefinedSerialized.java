package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class WarningTable580RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WarningTable580RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WarningTable580RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WARNING_TABLE_580_REDEFINED_LENGTH = 648;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginWarningTableGroup580Array1;
           protected static final int WARNING_TABLE_GROUP_580_ARRAY_1_SIZE = 12;
	
	/**
	* Constructor for WarningTable580RedefinedSerialized
	**/
    public WarningTable580RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WarningTable580RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WarningTable580RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WarningTable580RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WarningTable580RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WarningTable580RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WARNING_TABLE_580_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginWarningTableGroup580Array1 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int warningTableGroup580Array1Size() {
			return WARNING_TABLE_GROUP_580_ARRAY_1_SIZE;
		}



}
  
