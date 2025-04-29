package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GROUP_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginGroup500;
           protected static final int GROUP_500_SIZE = 5;
	
	/**
	* Constructor for GroupSerialized
	**/
    public GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginGroup500 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int group500Size() {
			return GROUP_500_SIZE;
		}



}
  
