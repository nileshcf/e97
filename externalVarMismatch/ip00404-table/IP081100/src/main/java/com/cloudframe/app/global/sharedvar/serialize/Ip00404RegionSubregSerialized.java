package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00404RegionSubregSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00404RegionSubregSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00404RegionSubregSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00404_REGION_SUBREG_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00404Region;
	
	/**
	* Constructor for Ip00404RegionSubregSerialized
	**/
    public Ip00404RegionSubregSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00404RegionSubregSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404RegionSubregSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00404RegionSubregSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,81); // serialize this field at offset 81 by default 
    }
    
	/**
	* sets parent for this Ip00404RegionSubregSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 81 by default
    }    
	/**
	* initializes the field in Ip00404RegionSubregSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00404_REGION_SUBREG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00404Region = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00404RegionCounter = -1;
     public boolean isIp00404RegionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404RegionCounter != sharedCounter;
         localIp00404RegionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00404_REGION_LEN = 1;
	/**
	 * 	serialize this Ip00404Region
	 */
   protected void serializeIp00404Region(char[] ip00404Region) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00404Region,0,getStringValue(),beginIp00404Region,IP_00404_REGION_LEN);
       localIp00404RegionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00404RegionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00404Region is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00404Region() {	 
   		return (substring(getStringValue(),beginIp00404Region,beginIp00404Region + IP_00404_REGION_LEN));
   	}




}
  
