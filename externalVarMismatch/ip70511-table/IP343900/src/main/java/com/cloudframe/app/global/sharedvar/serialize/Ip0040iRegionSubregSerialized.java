package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0040iRegionSubregSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040iRegionSubregSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040iRegionSubregSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040I_REGION_SUBREG_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040iRegion;
	
	/**
	* Constructor for Ip0040iRegionSubregSerialized
	**/
    public Ip0040iRegionSubregSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040iRegionSubregSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iRegionSubregSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040iRegionSubregSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,39); // serialize this field at offset 39 by default 
    }
    
	/**
	* sets parent for this Ip0040iRegionSubregSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 39 by default
    }    
	/**
	* initializes the field in Ip0040iRegionSubregSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040I_REGION_SUBREG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040iRegion = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040iRegionCounter = -1;
     public boolean isIp0040iRegionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iRegionCounter != sharedCounter;
         localIp0040iRegionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0040I_REGION_LEN = 1;
	/**
	 * 	serialize this Ip0040iRegion
	 */
   protected void serializeIp0040iRegion(char[] ip0040iRegion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0040iRegion,0,getStringValue(),beginIp0040iRegion,IP_0040I_REGION_LEN);
       localIp0040iRegionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0040iRegionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp0040iRegion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0040iRegion() {	 
   		return (substring(getStringValue(),beginIp0040iRegion,beginIp0040iRegion + IP_0040I_REGION_LEN));
   	}




}
  
