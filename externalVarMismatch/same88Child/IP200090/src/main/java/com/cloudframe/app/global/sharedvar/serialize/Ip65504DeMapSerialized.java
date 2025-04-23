package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504DeMapSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504DeMapSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504DeMapSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_DE_MAP_LENGTH = 1024;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp65504DeMapEntry;
           protected static final int IP_65504_DE_MAP_ENTRY_SIZE = 128;
	
	/**
	* Constructor for Ip65504DeMapSerialized
	**/
    public Ip65504DeMapSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504DeMapSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeMapSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504DeMapSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip65504DeMapSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip65504DeMapSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_DE_MAP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp65504DeMapEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip65504DeMapEntrySize() {
			return IP_65504_DE_MAP_ENTRY_SIZE;
		}



}
  
