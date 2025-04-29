package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0040RegionSubregSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040RegionSubregSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040RegionSubregSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040_REGION_SUBREG_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040Region;
	
	/**
	* Constructor for Ip0040RegionSubregSerialized
	**/
    public Ip0040RegionSubregSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040RegionSubregSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040RegionSubregSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040RegionSubregSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,90); // serialize this field at offset 90 by default 
    }
    
	/**
	* sets parent for this Ip0040RegionSubregSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 90 by default
    }    
	/**
	* initializes the field in Ip0040RegionSubregSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040_REGION_SUBREG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040Region = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040RegionCounter = -1;
     public boolean isIp0040RegionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040RegionCounter != sharedCounter;
         localIp0040RegionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040_REGION_LEN = 1;
	/**
	 * 	serialize this Ip0040Region
	 */
   protected void serializeIp0040Region(char[] ip0040Region) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040Region,0,getStringValue(),beginIp0040Region,IP_0040_REGION_LEN);
       localIp0040RegionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040RegionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040Region is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040Region() {	 
   		return (substring(getStringValue(),beginIp0040Region,beginIp0040Region + IP_0040_REGION_LEN));
   	}




}
  
