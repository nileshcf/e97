package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360InterType1SrtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360InterType1SrtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360InterType1SrtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_INTER_TYPE_1_SRT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360InstIdSrt1;
	
	/**
	* Constructor for X360InterType1SrtSerialized
	**/
    public X360InterType1SrtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360InterType1SrtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360InterType1SrtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360InterType1SrtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,179); // serialize this field at offset 179 by default 
    }
    
	/**
	* sets parent for this X360InterType1SrtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 179 by default
    }    
	/**
	* initializes the field in X360InterType1SrtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_INTER_TYPE_1_SRT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360InstIdSrt1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localX360InstIdSrt1Counter = -1;
     public boolean isX360InstIdSrt1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360InstIdSrt1Counter != sharedCounter;
         localX360InstIdSrt1Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_INST_ID_SRT_1_LEN = 10;
	/**
	 * 	serialize this X360InstIdSrt1
	 */
   protected void serializeX360InstIdSrt1(char[] x360InstIdSrt1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360InstIdSrt1,0,getStringValue(),beginX360InstIdSrt1,X_360_INST_ID_SRT_1_LEN);
       localX360InstIdSrt1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360InstIdSrt1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshX360InstIdSrt1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360InstIdSrt1() {	 
   		return (substring(getStringValue(),beginX360InstIdSrt1,beginX360InstIdSrt1 + X_360_INST_ID_SRT_1_LEN));
   	}




}
  
