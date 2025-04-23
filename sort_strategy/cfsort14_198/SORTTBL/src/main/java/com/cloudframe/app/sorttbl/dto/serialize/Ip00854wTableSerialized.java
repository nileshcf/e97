package com.cloudframe.app.sorttbl.dto.serialize;

/**
*  The class Ip00854wTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:58. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00854wTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00854wTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00854W_TABLE_LENGTH = 8500;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp00854wEntry;
           protected static final int IP_00854W_ENTRY_SIZE = 500;
	
	/**
	* Constructor for Ip00854wTableSerialized
	**/
    public Ip00854wTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00854wTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00854wTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00854wTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00854wTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00854wTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00854W_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp00854wEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip00854wEntrySize() {
			return IP_00854W_ENTRY_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  17);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  17);
     }
}
  
