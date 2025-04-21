package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class SyntaxPgmTableGroup500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SyntaxPgmTableGroup500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SyntaxPgmTableGroup500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYNTAX_PGM_TABLE_GROUP_500_LENGTH = 144;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for SyntaxPgmTableGroup500Serialized
	**/
    public SyntaxPgmTableGroup500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SyntaxPgmTableGroup500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYNTAX_PGM_TABLE_GROUP_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
	   /*  end of offset */
	}




}
  
