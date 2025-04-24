package com.cloudframe.app.cfdate02.file.records.serialize;

/**
*  The class Rl001MachToMachInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Rl001MachToMachInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rl001MachToMachInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RL_001_MACH_TO_MACH_INFO_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRl001PricingTypCd;
	
	/**
	* Constructor for Rl001MachToMachInfoSerialized
	**/
    public Rl001MachToMachInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rl001MachToMachInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001MachToMachInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rl001MachToMachInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,192); // serialize this field at offset 192 by default 
    }
    
	/**
	* sets parent for this Rl001MachToMachInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 192 by default
    }    
	/**
	* initializes the field in Rl001MachToMachInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RL_001_MACH_TO_MACH_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRl001PricingTypCd = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRl001PricingTypCdCounter = -1;
     public boolean isRl001PricingTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRl001PricingTypCdCounter != sharedCounter;
         localRl001PricingTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int RL_001_PRICING_TYP_CD_LEN = 1;
	/**
	 * 	serialize this Rl001PricingTypCd
	 */
   protected void serializeRl001PricingTypCd(char[] rl001PricingTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rl001PricingTypCd,0,getStringValue(),beginRl001PricingTypCd,RL_001_PRICING_TYP_CD_LEN);
       localRl001PricingTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRl001PricingTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRl001PricingTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRl001PricingTypCd() {	 
   		return (substring(getStringValue(),beginRl001PricingTypCd,beginRl001PricingTypCd + RL_001_PRICING_TYP_CD_LEN));
   	}




}
  
