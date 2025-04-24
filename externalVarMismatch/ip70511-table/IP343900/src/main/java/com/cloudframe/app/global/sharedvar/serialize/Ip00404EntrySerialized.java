package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00404EntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00404EntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00404EntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00404_ENTRY_LENGTH = 226;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00404Filler01;
	
	/**
	* Constructor for Ip00404EntrySerialized
	**/
    public Ip00404EntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00404EntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404EntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00404EntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,42); // serialize this field at offset 42 by default 
    }
    
	/**
	* sets parent for this Ip00404EntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 42 by default
    }    
	/**
	* initializes the field in Ip00404EntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00404_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginIp00404Filler01 = getStartOffset() + 224;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00404Filler01Counter = -1;
     public boolean isIp00404Filler01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404Filler01Counter != sharedCounter;
         localIp00404Filler01Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_FILLER_01_LEN = 2;
	/**
	 * 	serialize this Ip00404Filler01
	 */
   protected void serializeIp00404Filler01(char[] ip00404Filler01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404Filler01,0,getStringValue(),beginIp00404Filler01,IP_00404_FILLER_01_LEN);
       localIp00404Filler01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404Filler01Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp00404Filler01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404Filler01() {	 
   		return (substring(getStringValue(),beginIp00404Filler01,beginIp00404Filler01 + IP_00404_FILLER_01_LEN));
   	}




}
  
