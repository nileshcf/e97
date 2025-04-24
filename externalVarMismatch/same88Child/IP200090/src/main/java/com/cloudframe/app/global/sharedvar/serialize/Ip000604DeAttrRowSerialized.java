package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip000604DeAttrRowSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip000604DeAttrRowSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip000604DeAttrRowSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_000604_DE_ATTR_ROW_LENGTH = 84;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp000604DeFirstAb;
            protected  int beginIp000604DeFirstAbRedefined;
	
	/**
	* Constructor for Ip000604DeAttrRowSerialized
	**/
    public Ip000604DeAttrRowSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip000604DeAttrRowSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000604DeAttrRowSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip000604DeAttrRowSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip000604DeAttrRowSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip000604DeAttrRowSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_000604_DE_ATTR_ROW_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp000604DeFirstAb = getStartOffset() + 0;	// set offset for serialization
  
             beginIp000604DeFirstAbRedefined = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp000604DeFirstAbCounter = -1;
         public boolean isIp000604DeFirstAbModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000604DeFirstAbCounter != sharedCounter;
            localIp000604DeFirstAbCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000604_DE_FIRST_AB_LEN = 4;
  	/**
	 * serializeIp000604DeFirstAb
	 */
	protected void serializeIp000604DeFirstAb(int ip000604DeFirstAb) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000604DeFirstAb,IP_000604_DE_FIRST_AB_LEN)
                  ,beginIp000604DeFirstAb
                  ,IP_000604_DE_FIRST_AB_LEN
                 );
            localIp000604DeFirstAbCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp000604DeFirstAbMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp000604DeFirstAb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp000604DeFirstAb() {	 
			return (getInt(beginIp000604DeFirstAb));
   	}
     int localIp000604DeFirstAbRedefinedCounter = -1;
     public boolean isIp000604DeFirstAbRedefinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000604DeFirstAbRedefinedCounter != sharedCounter;
         localIp000604DeFirstAbRedefinedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000604_DE_FIRST_AB_REDEFINED_LEN = 4;
	/**
	 * 	serialize this Ip000604DeFirstAbRedefined
	 */
   protected void serializeIp000604DeFirstAbRedefined(char[] ip000604DeFirstAbRedefined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000604DeFirstAbRedefined,0,getStringValue(),beginIp000604DeFirstAbRedefined,IP_000604_DE_FIRST_AB_REDEFINED_LEN);
       localIp000604DeFirstAbRedefinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000604DeFirstAbRedefinedConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp000604DeFirstAbRedefined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000604DeFirstAbRedefined() {	 
   		return (substring(getStringValue(),beginIp000604DeFirstAbRedefined,beginIp000604DeFirstAbRedefined + IP_000604_DE_FIRST_AB_REDEFINED_LEN));
   	}




}
  
