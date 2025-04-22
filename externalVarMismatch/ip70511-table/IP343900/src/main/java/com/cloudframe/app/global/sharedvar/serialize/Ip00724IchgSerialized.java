package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00724IchgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00724IchgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00724IchgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00724_ICHG_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00724IchgRegion;
	
	/**
	* Constructor for Ip00724IchgSerialized
	**/
    public Ip00724IchgSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00724IchgSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00724IchgSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00724IchgSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this Ip00724IchgSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in Ip00724IchgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00724_ICHG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00724IchgRegion = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00724IchgRegionCounter = -1;
     public boolean isIp00724IchgRegionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00724IchgRegionCounter != sharedCounter;
         localIp00724IchgRegionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00724_ICHG_REGION_LEN = 1;
	/**
	 * 	serialize this Ip00724IchgRegion
	 */
   protected void serializeIp00724IchgRegion(char[] ip00724IchgRegion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00724IchgRegion,0,getStringValue(),beginIp00724IchgRegion,IP_00724_ICHG_REGION_LEN);
       localIp00724IchgRegionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00724IchgRegionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00724IchgRegion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00724IchgRegion() {	 
   		return (substring(getStringValue(),beginIp00724IchgRegion,beginIp00724IchgRegion + IP_00724_ICHG_REGION_LEN));
   	}




}
  
