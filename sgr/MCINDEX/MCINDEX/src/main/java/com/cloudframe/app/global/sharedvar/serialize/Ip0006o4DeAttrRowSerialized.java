package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0006o4DeAttrRowSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0006o4DeAttrRowSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0006o4DeAttrRowSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0006O_4_DE_ATTR_ROW_LENGTH = 84;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0006o4DeFirstAb;
            protected  int beginIp0006o4DeFirstAbRedefined;
	
	/**
	* Constructor for Ip0006o4DeAttrRowSerialized
	**/
    public Ip0006o4DeAttrRowSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0006o4DeAttrRowSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0006o4DeAttrRowSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0006o4DeAttrRowSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip0006o4DeAttrRowSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip0006o4DeAttrRowSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0006O_4_DE_ATTR_ROW_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0006o4DeFirstAb = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0006o4DeFirstAbRedefined = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp0006o4DeFirstAbCounter = -1;
         public boolean isIp0006o4DeFirstAbModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0006o4DeFirstAbCounter != sharedCounter;
            localIp0006o4DeFirstAbCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0006O_4_DE_FIRST_AB_LEN = 4;
  	/**
	 * serializeIp0006o4DeFirstAb
	 */
	protected void serializeIp0006o4DeFirstAb(int ip0006o4DeFirstAb) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0006o4DeFirstAb,IP_0006O_4_DE_FIRST_AB_LEN)
                  ,beginIp0006o4DeFirstAb
                  ,IP_0006O_4_DE_FIRST_AB_LEN
                 );
            localIp0006o4DeFirstAbCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp0006o4DeFirstAbMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp0006o4DeFirstAb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0006o4DeFirstAb() {	 
			return (getInt(beginIp0006o4DeFirstAb));
   	}
     int localIp0006o4DeFirstAbRedefinedCounter = -1;
     public boolean isIp0006o4DeFirstAbRedefinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0006o4DeFirstAbRedefinedCounter != sharedCounter;
         localIp0006o4DeFirstAbRedefinedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0006O_4_DE_FIRST_AB_REDEFINED_LEN = 4;
	/**
	 * 	serialize this Ip0006o4DeFirstAbRedefined
	 */
   protected void serializeIp0006o4DeFirstAbRedefined(char[] ip0006o4DeFirstAbRedefined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0006o4DeFirstAbRedefined,0,getStringValue(),beginIp0006o4DeFirstAbRedefined,IP_0006O_4_DE_FIRST_AB_REDEFINED_LEN);
       localIp0006o4DeFirstAbRedefinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0006o4DeFirstAbRedefinedConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp0006o4DeFirstAbRedefined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0006o4DeFirstAbRedefined() {	 
   		return (substring(getStringValue(),beginIp0006o4DeFirstAbRedefined,beginIp0006o4DeFirstAbRedefined + IP_0006O_4_DE_FIRST_AB_REDEFINED_LEN));
   	}




}
  
