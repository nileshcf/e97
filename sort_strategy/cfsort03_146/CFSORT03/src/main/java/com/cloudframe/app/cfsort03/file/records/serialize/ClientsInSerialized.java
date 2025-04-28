package com.cloudframe.app.cfsort03.file.records.serialize;

/**
*  The class ClientsInSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ClientsInSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ClientsInSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CLIENTS_IN_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for ClientsInSerialized
	**/
    public ClientsInSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ClientsInSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CLIENTS_IN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




}
  
