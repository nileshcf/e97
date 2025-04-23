package com.cloudframe.app.vsammon1.dto.serialize;

/**
*  The class IpaddrDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IpaddrDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IpaddrDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IPADDR_DATA_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIIpaddr;
	
	/**
	* Constructor for IpaddrDataSerialized
	**/
    public IpaddrDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IpaddrDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IpaddrDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IpaddrDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this IpaddrDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in IpaddrDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IPADDR_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIIpaddr = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIIpaddrCounter = -1;
     public boolean isIIpaddrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIIpaddrCounter != sharedCounter;
         localIIpaddrCounter = sharedCounter; return hasModified;
     }
	protected static final int I_IPADDR_LEN = 15;
	/**
	 * 	serialize this IIpaddr
	 */
   protected void serializeIIpaddr(char[] iIpaddr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(iIpaddr,0,getStringValue(),beginIIpaddr,I_IPADDR_LEN);
       localIIpaddrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIIpaddrConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshIIpaddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIIpaddr() {	 
   		return (substring(getStringValue(),beginIIpaddr,beginIIpaddr + I_IPADDR_LEN));
   	}




}
  
