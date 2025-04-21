package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class PgmIp343690Group300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PgmIp343690Group300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PgmIp343690Group300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PGM_IP_343690_GROUP_300_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPgmIp343690300;
	
	/**
	* Constructor for PgmIp343690Group300Serialized
	**/
    public PgmIp343690Group300Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PgmIp343690Group300Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmIp343690Group300Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PgmIp343690Group300Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this PgmIp343690Group300Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in PgmIp343690Group300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PGM_IP_343690_GROUP_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPgmIp343690300 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPgmIp343690300Counter = -1;
     public boolean isPgmIp343690300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp343690300Counter != sharedCounter;
         localPgmIp343690300Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_IP_343690300_LEN = 8;
	/**
	 * 	serialize this PgmIp343690300
	 */
   protected void serializePgmIp343690300(char[] pgmIp343690300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmIp343690300,0,getStringValue(),beginPgmIp343690300,PGM_IP_343690300_LEN);
       localPgmIp343690300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmIp343690300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgmIp343690300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmIp343690300() {	 
   		return (substring(getStringValue(),beginPgmIp343690300,beginPgmIp343690300 + PGM_IP_343690300_LEN));
   	}




}
  
