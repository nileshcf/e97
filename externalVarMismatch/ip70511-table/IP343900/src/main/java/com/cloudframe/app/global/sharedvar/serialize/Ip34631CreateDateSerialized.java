package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip34631CreateDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip34631CreateDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip34631CreateDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_34631_CREATE_DATE_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp34631CreateCc;
            protected  int beginIp34631CreateYy;
            protected  int beginIp34631CreateMm;
            protected  int beginIp34631CreateDd;
	
	/**
	* Constructor for Ip34631CreateDateSerialized
	**/
    public Ip34631CreateDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip34631CreateDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip34631CreateDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip34631CreateDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip34631CreateDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip34631CreateDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_34631_CREATE_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp34631CreateCc = getStartOffset() + 0;	// set offset for serialization
  
             beginIp34631CreateYy = getStartOffset() + 2;	// set offset for serialization
  
  
             beginIp34631CreateMm = getStartOffset() + 5;	// set offset for serialization
  
  
             beginIp34631CreateDd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp34631CreateCcCounter = -1;
     public boolean isIp34631CreateCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631CreateCcCounter != sharedCounter;
         localIp34631CreateCcCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_CREATE_CC_LEN = 2;
	/**
	 * 	serialize this Ip34631CreateCc
	 */
   protected void serializeIp34631CreateCc(char[] ip34631CreateCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631CreateCc,0,getStringValue(),beginIp34631CreateCc,IP_34631_CREATE_CC_LEN);
       localIp34631CreateCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631CreateCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp34631CreateCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631CreateCc() {	 
   		return (substring(getStringValue(),beginIp34631CreateCc,beginIp34631CreateCc + IP_34631_CREATE_CC_LEN));
   	}
     int localIp34631CreateYyCounter = -1;
     public boolean isIp34631CreateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631CreateYyCounter != sharedCounter;
         localIp34631CreateYyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_CREATE_YY_LEN = 2;
	/**
	 * 	serialize this Ip34631CreateYy
	 */
   protected void serializeIp34631CreateYy(char[] ip34631CreateYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631CreateYy,0,getStringValue(),beginIp34631CreateYy,IP_34631_CREATE_YY_LEN);
       localIp34631CreateYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631CreateYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp34631CreateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631CreateYy() {	 
   		return (substring(getStringValue(),beginIp34631CreateYy,beginIp34631CreateYy + IP_34631_CREATE_YY_LEN));
   	}
     int localIp34631CreateMmCounter = -1;
     public boolean isIp34631CreateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631CreateMmCounter != sharedCounter;
         localIp34631CreateMmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_CREATE_MM_LEN = 2;
	/**
	 * 	serialize this Ip34631CreateMm
	 */
   protected void serializeIp34631CreateMm(char[] ip34631CreateMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631CreateMm,0,getStringValue(),beginIp34631CreateMm,IP_34631_CREATE_MM_LEN);
       localIp34631CreateMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631CreateMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp34631CreateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631CreateMm() {	 
   		return (substring(getStringValue(),beginIp34631CreateMm,beginIp34631CreateMm + IP_34631_CREATE_MM_LEN));
   	}
     int localIp34631CreateDdCounter = -1;
     public boolean isIp34631CreateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp34631CreateDdCounter != sharedCounter;
         localIp34631CreateDdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_34631_CREATE_DD_LEN = 2;
	/**
	 * 	serialize this Ip34631CreateDd
	 */
   protected void serializeIp34631CreateDd(char[] ip34631CreateDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip34631CreateDd,0,getStringValue(),beginIp34631CreateDd,IP_34631_CREATE_DD_LEN);
       localIp34631CreateDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp34631CreateDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp34631CreateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp34631CreateDd() {	 
   		return (substring(getStringValue(),beginIp34631CreateDd,beginIp34631CreateDd + IP_34631_CREATE_DD_LEN));
   	}




}
  
