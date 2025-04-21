package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50211CloseDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50211CloseDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50211CloseDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50211_CLOSE_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50211ClosedCcyy;
            protected  int beginIp50211Filler1;
            protected  int beginIp50211ClosedMm;
            protected  int beginIp50211Filler2;
            protected  int beginIp50211ClosedDd;
	
	/**
	* Constructor for Ip50211CloseDtSerialized
	**/
    public Ip50211CloseDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50211CloseDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211CloseDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50211CloseDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,114); // serialize this field at offset 114 by default 
    }
    
	/**
	* sets parent for this Ip50211CloseDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 114 by default
    }    
	/**
	* initializes the field in Ip50211CloseDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50211_CLOSE_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50211ClosedCcyy = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50211Filler1 = getStartOffset() + 4;	// set offset for serialization
  
             beginIp50211ClosedMm = getStartOffset() + 5;	// set offset for serialization
  
             beginIp50211Filler2 = getStartOffset() + 7;	// set offset for serialization
  
             beginIp50211ClosedDd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50211ClosedCcyyCounter = -1;
     public boolean isIp50211ClosedCcyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211ClosedCcyyCounter != sharedCounter;
         localIp50211ClosedCcyyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_CLOSED_CCYY_LEN = 4;
	/**
	 * 	serialize this Ip50211ClosedCcyy
	 */
   protected void serializeIp50211ClosedCcyy(char[] ip50211ClosedCcyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211ClosedCcyy,0,getStringValue(),beginIp50211ClosedCcyy,IP_50211_CLOSED_CCYY_LEN);
       localIp50211ClosedCcyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211ClosedCcyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp50211ClosedCcyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211ClosedCcyy() {	 
   		return (substring(getStringValue(),beginIp50211ClosedCcyy,beginIp50211ClosedCcyy + IP_50211_CLOSED_CCYY_LEN));
   	}
     int localIp50211Filler1Counter = -1;
     public boolean isIp50211Filler1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211Filler1Counter != sharedCounter;
         localIp50211Filler1Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_FILLER_1_LEN = 1;
	/**
	 * 	serialize this Ip50211Filler1
	 */
   protected void serializeIp50211Filler1(char[] ip50211Filler1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211Filler1,0,getStringValue(),beginIp50211Filler1,IP_50211_FILLER_1_LEN);
       localIp50211Filler1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211Filler1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp50211Filler1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211Filler1() {	 
   		return (substring(getStringValue(),beginIp50211Filler1,beginIp50211Filler1 + IP_50211_FILLER_1_LEN));
   	}
     int localIp50211ClosedMmCounter = -1;
     public boolean isIp50211ClosedMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211ClosedMmCounter != sharedCounter;
         localIp50211ClosedMmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_CLOSED_MM_LEN = 2;
	/**
	 * 	serialize this Ip50211ClosedMm
	 */
   protected void serializeIp50211ClosedMm(char[] ip50211ClosedMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211ClosedMm,0,getStringValue(),beginIp50211ClosedMm,IP_50211_CLOSED_MM_LEN);
       localIp50211ClosedMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211ClosedMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50211ClosedMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211ClosedMm() {	 
   		return (substring(getStringValue(),beginIp50211ClosedMm,beginIp50211ClosedMm + IP_50211_CLOSED_MM_LEN));
   	}
     int localIp50211Filler2Counter = -1;
     public boolean isIp50211Filler2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211Filler2Counter != sharedCounter;
         localIp50211Filler2Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_FILLER_2_LEN = 1;
	/**
	 * 	serialize this Ip50211Filler2
	 */
   protected void serializeIp50211Filler2(char[] ip50211Filler2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211Filler2,0,getStringValue(),beginIp50211Filler2,IP_50211_FILLER_2_LEN);
       localIp50211Filler2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211Filler2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp50211Filler2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211Filler2() {	 
   		return (substring(getStringValue(),beginIp50211Filler2,beginIp50211Filler2 + IP_50211_FILLER_2_LEN));
   	}
     int localIp50211ClosedDdCounter = -1;
     public boolean isIp50211ClosedDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50211ClosedDdCounter != sharedCounter;
         localIp50211ClosedDdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50211_CLOSED_DD_LEN = 2;
	/**
	 * 	serialize this Ip50211ClosedDd
	 */
   protected void serializeIp50211ClosedDd(char[] ip50211ClosedDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50211ClosedDd,0,getStringValue(),beginIp50211ClosedDd,IP_50211_CLOSED_DD_LEN);
       localIp50211ClosedDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50211ClosedDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50211ClosedDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50211ClosedDd() {	 
   		return (substring(getStringValue(),beginIp50211ClosedDd,beginIp50211ClosedDd + IP_50211_CLOSED_DD_LEN));
   	}




}
  
