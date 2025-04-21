package com.cloudframe.app.init1.dto.serialize;

/**
*  The class ApplicationVersionSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ApplicationVersionSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ApplicationVersionSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int APPLICATION_VERSION_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginApplicationVersionLen;
	
	/**
	* Constructor for ApplicationVersionSerialized
	**/
    public ApplicationVersionSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ApplicationVersionSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ApplicationVersionSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ApplicationVersionSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10); // serialize this field at offset 10 by default 
    }
    
	/**
	* sets parent for this ApplicationVersionSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10 by default
    }    
	/**
	* initializes the field in ApplicationVersionSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(APPLICATION_VERSION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginApplicationVersionLen = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localApplicationVersionLenCounter = -1;
         public boolean isApplicationVersionLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localApplicationVersionLenCounter != sharedCounter;
            localApplicationVersionLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int APPLICATION_VERSION_LEN_LEN = 2;
  	/**
	 * serializeApplicationVersionLen
	 */
	protected void serializeApplicationVersionLen(short applicationVersionLen) {
           replaceValue( //  save the value as string
                   getBinaryString( applicationVersionLen,APPLICATION_VERSION_LEN_LEN)
                  ,beginApplicationVersionLen
                  ,APPLICATION_VERSION_LEN_LEN
                 );
            localApplicationVersionLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkApplicationVersionLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshApplicationVersionLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshApplicationVersionLen() {	 
			return (getShort(beginApplicationVersionLen));
   	}




}
  
