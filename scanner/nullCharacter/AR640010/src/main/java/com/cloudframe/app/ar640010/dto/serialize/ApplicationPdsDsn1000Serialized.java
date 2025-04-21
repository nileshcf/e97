package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ApplicationPdsDsn1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ApplicationPdsDsn1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ApplicationPdsDsn1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int APPLICATION_PDS_DSN_1000_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginApplicationPdsDd1000;
	
	/**
	* Constructor for ApplicationPdsDsn1000Serialized
	**/
    public ApplicationPdsDsn1000Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ApplicationPdsDsn1000Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplicationPdsDsn1000Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ApplicationPdsDsn1000Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,138); // serialize this field at offset 138 by default 
    }
    
	/**
	* sets parent for this ApplicationPdsDsn1000Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 138 by default
    }    
	/**
	* initializes the field in ApplicationPdsDsn1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(APPLICATION_PDS_DSN_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginApplicationPdsDd1000 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localApplicationPdsDd1000Counter = -1;
     public boolean isApplicationPdsDd1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplicationPdsDd1000Counter != sharedCounter;
         localApplicationPdsDd1000Counter = sharedCounter; return hasModified;
     }
	protected static final int APPLICATION_PDS_DD_1000_LEN = 8;
	/**
	 * 	serialize this ApplicationPdsDd1000
	 */
   protected void serializeApplicationPdsDd1000(char[] applicationPdsDd1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applicationPdsDd1000,0,getStringValue(),beginApplicationPdsDd1000,APPLICATION_PDS_DD_1000_LEN);
       localApplicationPdsDd1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplicationPdsDd1000Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshApplicationPdsDd1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplicationPdsDd1000() {	 
   		return (substring(getStringValue(),beginApplicationPdsDd1000,beginApplicationPdsDd1000 + APPLICATION_PDS_DD_1000_LEN));
   	}




}
  
