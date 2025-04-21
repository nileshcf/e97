package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip58041CreateDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip58041CreateDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip58041CreateDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_58041_CREATE_DATE_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp58041CreateCc;
            protected  int beginIp58041CreateYy;
            protected  int beginIp58041CreateMm;
            protected  int beginIp58041CreateDd;
	
	/**
	* Constructor for Ip58041CreateDateSerialized
	**/
    public Ip58041CreateDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip58041CreateDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip58041CreateDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip58041CreateDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip58041CreateDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip58041CreateDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_58041_CREATE_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp58041CreateCc = getStartOffset() + 0;	// set offset for serialization
  
             beginIp58041CreateYy = getStartOffset() + 2;	// set offset for serialization
  
  
             beginIp58041CreateMm = getStartOffset() + 5;	// set offset for serialization
  
  
             beginIp58041CreateDd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp58041CreateCcCounter = -1;
     public boolean isIp58041CreateCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041CreateCcCounter != sharedCounter;
         localIp58041CreateCcCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_CREATE_CC_LEN = 2;
	/**
	 * 	serialize this Ip58041CreateCc
	 */
   protected void serializeIp58041CreateCc(char[] ip58041CreateCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041CreateCc,0,getStringValue(),beginIp58041CreateCc,IP_58041_CREATE_CC_LEN);
       localIp58041CreateCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041CreateCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp58041CreateCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041CreateCc() {	 
   		return (substring(getStringValue(),beginIp58041CreateCc,beginIp58041CreateCc + IP_58041_CREATE_CC_LEN));
   	}
     int localIp58041CreateYyCounter = -1;
     public boolean isIp58041CreateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041CreateYyCounter != sharedCounter;
         localIp58041CreateYyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_CREATE_YY_LEN = 2;
	/**
	 * 	serialize this Ip58041CreateYy
	 */
   protected void serializeIp58041CreateYy(char[] ip58041CreateYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041CreateYy,0,getStringValue(),beginIp58041CreateYy,IP_58041_CREATE_YY_LEN);
       localIp58041CreateYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041CreateYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp58041CreateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041CreateYy() {	 
   		return (substring(getStringValue(),beginIp58041CreateYy,beginIp58041CreateYy + IP_58041_CREATE_YY_LEN));
   	}
     int localIp58041CreateMmCounter = -1;
     public boolean isIp58041CreateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041CreateMmCounter != sharedCounter;
         localIp58041CreateMmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_CREATE_MM_LEN = 2;
	/**
	 * 	serialize this Ip58041CreateMm
	 */
   protected void serializeIp58041CreateMm(char[] ip58041CreateMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041CreateMm,0,getStringValue(),beginIp58041CreateMm,IP_58041_CREATE_MM_LEN);
       localIp58041CreateMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041CreateMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp58041CreateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041CreateMm() {	 
   		return (substring(getStringValue(),beginIp58041CreateMm,beginIp58041CreateMm + IP_58041_CREATE_MM_LEN));
   	}
     int localIp58041CreateDdCounter = -1;
     public boolean isIp58041CreateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp58041CreateDdCounter != sharedCounter;
         localIp58041CreateDdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_58041_CREATE_DD_LEN = 2;
	/**
	 * 	serialize this Ip58041CreateDd
	 */
   protected void serializeIp58041CreateDd(char[] ip58041CreateDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip58041CreateDd,0,getStringValue(),beginIp58041CreateDd,IP_58041_CREATE_DD_LEN);
       localIp58041CreateDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp58041CreateDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp58041CreateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp58041CreateDd() {	 
   		return (substring(getStringValue(),beginIp58041CreateDd,beginIp58041CreateDd + IP_58041_CREATE_DD_LEN));
   	}




}
  
