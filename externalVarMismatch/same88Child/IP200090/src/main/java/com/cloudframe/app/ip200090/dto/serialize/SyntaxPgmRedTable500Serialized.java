package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class SyntaxPgmRedTable500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SyntaxPgmRedTable500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SyntaxPgmRedTable500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYNTAX_PGM_RED_TABLE_500_LENGTH = 144;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSyntaxPgmTableEntry500;
           protected static final int SYNTAX_PGM_TABLE_ENTRY_500_SIZE = 9;
	
	/**
	* Constructor for SyntaxPgmRedTable500Serialized
	**/
    public SyntaxPgmRedTable500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SyntaxPgmRedTable500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SyntaxPgmRedTable500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SyntaxPgmRedTable500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SyntaxPgmRedTable500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SyntaxPgmRedTable500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYNTAX_PGM_RED_TABLE_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSyntaxPgmTableEntry500 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int syntaxPgmTableEntry500Size() {
			return SYNTAX_PGM_TABLE_ENTRY_500_SIZE;
		}



}
  
