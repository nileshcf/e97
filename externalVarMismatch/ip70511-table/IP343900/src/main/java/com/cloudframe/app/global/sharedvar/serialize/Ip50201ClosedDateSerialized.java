package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip50201ClosedDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip50201ClosedDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip50201ClosedDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_50201_CLOSED_DATE_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp50201ClosedCcyy;
            protected  int beginIp50201Filler1;
            protected  int beginIp50201ClosedMm;
            protected  int beginIp50201Filler2;
            protected  int beginIp50201ClosedDd;
	
	/**
	* Constructor for Ip50201ClosedDateSerialized
	**/
    public Ip50201ClosedDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip50201ClosedDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201ClosedDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip50201ClosedDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,26); // serialize this field at offset 26 by default 
    }
    
	/**
	* sets parent for this Ip50201ClosedDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 26 by default
    }    
	/**
	* initializes the field in Ip50201ClosedDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_50201_CLOSED_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp50201ClosedCcyy = getStartOffset() + 0;	// set offset for serialization
  
             beginIp50201Filler1 = getStartOffset() + 4;	// set offset for serialization
  
             beginIp50201ClosedMm = getStartOffset() + 5;	// set offset for serialization
  
             beginIp50201Filler2 = getStartOffset() + 7;	// set offset for serialization
  
             beginIp50201ClosedDd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp50201ClosedCcyyCounter = -1;
     public boolean isIp50201ClosedCcyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50201ClosedCcyyCounter != sharedCounter;
         localIp50201ClosedCcyyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50201_CLOSED_CCYY_LEN = 4;
	/**
	 * 	serialize this Ip50201ClosedCcyy
	 */
   protected void serializeIp50201ClosedCcyy(char[] ip50201ClosedCcyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50201ClosedCcyy,0,getStringValue(),beginIp50201ClosedCcyy,IP_50201_CLOSED_CCYY_LEN);
       localIp50201ClosedCcyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50201ClosedCcyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp50201ClosedCcyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50201ClosedCcyy() {	 
   		return (substring(getStringValue(),beginIp50201ClosedCcyy,beginIp50201ClosedCcyy + IP_50201_CLOSED_CCYY_LEN));
   	}
     int localIp50201Filler1Counter = -1;
     public boolean isIp50201Filler1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50201Filler1Counter != sharedCounter;
         localIp50201Filler1Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_50201_FILLER_1_LEN = 1;
	/**
	 * 	serialize this Ip50201Filler1
	 */
   protected void serializeIp50201Filler1(char[] ip50201Filler1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50201Filler1,0,getStringValue(),beginIp50201Filler1,IP_50201_FILLER_1_LEN);
       localIp50201Filler1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50201Filler1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp50201Filler1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50201Filler1() {	 
   		return (substring(getStringValue(),beginIp50201Filler1,beginIp50201Filler1 + IP_50201_FILLER_1_LEN));
   	}
     int localIp50201ClosedMmCounter = -1;
     public boolean isIp50201ClosedMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50201ClosedMmCounter != sharedCounter;
         localIp50201ClosedMmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50201_CLOSED_MM_LEN = 2;
	/**
	 * 	serialize this Ip50201ClosedMm
	 */
   protected void serializeIp50201ClosedMm(char[] ip50201ClosedMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50201ClosedMm,0,getStringValue(),beginIp50201ClosedMm,IP_50201_CLOSED_MM_LEN);
       localIp50201ClosedMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50201ClosedMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50201ClosedMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50201ClosedMm() {	 
   		return (substring(getStringValue(),beginIp50201ClosedMm,beginIp50201ClosedMm + IP_50201_CLOSED_MM_LEN));
   	}
     int localIp50201Filler2Counter = -1;
     public boolean isIp50201Filler2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50201Filler2Counter != sharedCounter;
         localIp50201Filler2Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_50201_FILLER_2_LEN = 1;
	/**
	 * 	serialize this Ip50201Filler2
	 */
   protected void serializeIp50201Filler2(char[] ip50201Filler2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50201Filler2,0,getStringValue(),beginIp50201Filler2,IP_50201_FILLER_2_LEN);
       localIp50201Filler2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50201Filler2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp50201Filler2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50201Filler2() {	 
   		return (substring(getStringValue(),beginIp50201Filler2,beginIp50201Filler2 + IP_50201_FILLER_2_LEN));
   	}
     int localIp50201ClosedDdCounter = -1;
     public boolean isIp50201ClosedDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp50201ClosedDdCounter != sharedCounter;
         localIp50201ClosedDdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_50201_CLOSED_DD_LEN = 2;
	/**
	 * 	serialize this Ip50201ClosedDd
	 */
   protected void serializeIp50201ClosedDd(char[] ip50201ClosedDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip50201ClosedDd,0,getStringValue(),beginIp50201ClosedDd,IP_50201_CLOSED_DD_LEN);
       localIp50201ClosedDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp50201ClosedDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp50201ClosedDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp50201ClosedDd() {	 
   		return (substring(getStringValue(),beginIp50201ClosedDd,beginIp50201ClosedDd + IP_50201_CLOSED_DD_LEN));
   	}




}
  
