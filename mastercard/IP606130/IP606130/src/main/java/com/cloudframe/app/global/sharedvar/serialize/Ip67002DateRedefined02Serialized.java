package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002DateRedefined02Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002DateRedefined02Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002DateRedefined02Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_DATE_REDEFINED_02_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002Yymmdd;
	
	/**
	* Constructor for Ip67002DateRedefined02Serialized
	**/
    public Ip67002DateRedefined02Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002DateRedefined02Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002DateRedefined02Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002DateRedefined02Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this Ip67002DateRedefined02Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in Ip67002DateRedefined02Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_DATE_REDEFINED_02_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp67002Yymmdd = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp67002YymmddCounter = -1;
     public boolean isIp67002YymmddModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002YymmddCounter != sharedCounter;
         localIp67002YymmddCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_67002_YYMMDD_LEN = 6;
	/**
	 * 	serialize this Ip67002Yymmdd
	 */
   protected void serializeIp67002Yymmdd(char[] ip67002Yymmdd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip67002Yymmdd,0,getStringValue(),beginIp67002Yymmdd,IP_67002_YYMMDD_LEN);
       localIp67002YymmddCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp67002YymmddConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp67002Yymmdd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp67002Yymmdd() {	 
   		return (substring(getStringValue(),beginIp67002Yymmdd,beginIp67002Yymmdd + IP_67002_YYMMDD_LEN));
   	}




}
  
