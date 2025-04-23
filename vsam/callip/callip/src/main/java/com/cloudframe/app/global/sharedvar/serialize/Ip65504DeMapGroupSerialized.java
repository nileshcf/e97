package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504DeMapGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504DeMapGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504DeMapGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_DE_MAP_GROUP_LENGTH = 1024;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip65504DeMapGroupSerialized
	**/
    public Ip65504DeMapGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip65504DeMapGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_DE_MAP_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
