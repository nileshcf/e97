package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip3oo8o1EditsPerfEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip3oo8o1EditsPerfEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip3oo8o1EditsPerfEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_3OO_8O_1_EDITS_PERF_ENTRY_LENGTH = 4000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp3oo8o1EditPerformedInd;
           protected static final int IP_3OO_8O_1_EDIT_PERFORMED_IND_SIZE = 4000;
	
	/**
	* Constructor for Ip3oo8o1EditsPerfEntrySerialized
	**/
    public Ip3oo8o1EditsPerfEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip3oo8o1EditsPerfEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip3oo8o1EditsPerfEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip3oo8o1EditsPerfEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip3oo8o1EditsPerfEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip3oo8o1EditsPerfEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_3OO_8O_1_EDITS_PERF_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp3oo8o1EditPerformedInd = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int IP_3OO_8O_1_EDIT_PERFORMED_IND_LEN = 1;
   /**
	 *	serializeIp3oo8o1EditPerformedInd as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeIp3oo8o1EditPerformedInd(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginIp3oo8o1EditPerformedInd + index*IP_3OO_8O_1_EDIT_PERFORMED_IND_LEN)
   	          , IP_3OO_8O_1_EDIT_PERFORMED_IND_LEN 
   	          );
   }

		public int ip3oo8o1EditPerformedIndSize() {
			return IP_3OO_8O_1_EDIT_PERFORMED_IND_SIZE;
		}



}
  
