package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class SyntaxPgmTableEntry500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SyntaxPgmTableEntry500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SyntaxPgmTableEntry500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYNTAX_PGM_TABLE_ENTRY_500_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSyntaxPgmPtr500;
	
	/**
	* Constructor for SyntaxPgmTableEntry500Serialized
	**/
    public SyntaxPgmTableEntry500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SyntaxPgmTableEntry500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SyntaxPgmTableEntry500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SyntaxPgmTableEntry500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SyntaxPgmTableEntry500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SyntaxPgmTableEntry500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYNTAX_PGM_TABLE_ENTRY_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSyntaxPgmPtr500 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSyntaxPgmPtr500Counter = -1;
     public boolean isSyntaxPgmPtr500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSyntaxPgmPtr500Counter != sharedCounter;
         localSyntaxPgmPtr500Counter = sharedCounter; return hasModified;
     }
	protected static final int SYNTAX_PGM_PTR_500_LEN = 8;
	/**
	 * 	serialize this SyntaxPgmPtr500
	 */
   protected void serializeSyntaxPgmPtr500(char[] syntaxPgmPtr500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(syntaxPgmPtr500,0,getStringValue(),beginSyntaxPgmPtr500,SYNTAX_PGM_PTR_500_LEN);
       localSyntaxPgmPtr500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSyntaxPgmPtr500Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSyntaxPgmPtr500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSyntaxPgmPtr500() {	 
   		return (substring(getStringValue(),beginSyntaxPgmPtr500,beginSyntaxPgmPtr500 + SYNTAX_PGM_PTR_500_LEN));
   	}




}
  
