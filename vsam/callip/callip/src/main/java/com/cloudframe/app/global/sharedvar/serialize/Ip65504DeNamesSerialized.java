package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504DeNamesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504DeNamesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504DeNamesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_DE_NAMES_LENGTH = 1024;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip65504DeNamesSerialized
	**/
    public Ip65504DeNamesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504DeNamesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504DeNamesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip65504DeNamesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip65504DeNamesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_DE_NAMES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
	   /*  end of offset */
	}




}
  
