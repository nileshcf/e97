package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class Ip82921CloseDtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip82921CloseDtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip82921CloseDtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_82921_CLOSE_DT_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp82921ClosedCcyy;
            protected  int beginIp82921Filler1;
            protected  int beginIp82921ClosedMm;
            protected  int beginIp82921Filler2;
            protected  int beginIp82921ClosedDd;
	
	/**
	* Constructor for Ip82921CloseDtSerialized
	**/
    public Ip82921CloseDtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip82921CloseDtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921CloseDtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip82921CloseDtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,182); // serialize this field at offset 182 by default 
    }
    
	/**
	* sets parent for this Ip82921CloseDtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 182 by default
    }    
	/**
	* initializes the field in Ip82921CloseDtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_82921_CLOSE_DT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp82921ClosedCcyy = getStartOffset() + 0;	// set offset for serialization
  
             beginIp82921Filler1 = getStartOffset() + 4;	// set offset for serialization
  
             beginIp82921ClosedMm = getStartOffset() + 5;	// set offset for serialization
  
             beginIp82921Filler2 = getStartOffset() + 7;	// set offset for serialization
  
             beginIp82921ClosedDd = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp82921ClosedCcyyCounter = -1;
     public boolean isIp82921ClosedCcyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ClosedCcyyCounter != sharedCounter;
         localIp82921ClosedCcyyCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_CLOSED_CCYY_LEN = 4;
	/**
	 * 	serialize this Ip82921ClosedCcyy
	 */
   protected void serializeIp82921ClosedCcyy(char[] ip82921ClosedCcyy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ClosedCcyy,0,getStringValue(),beginIp82921ClosedCcyy,IP_82921_CLOSED_CCYY_LEN);
       localIp82921ClosedCcyyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ClosedCcyyConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp82921ClosedCcyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ClosedCcyy() {	 
   		return (substring(getStringValue(),beginIp82921ClosedCcyy,beginIp82921ClosedCcyy + IP_82921_CLOSED_CCYY_LEN));
   	}
     int localIp82921Filler1Counter = -1;
     public boolean isIp82921Filler1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921Filler1Counter != sharedCounter;
         localIp82921Filler1Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_FILLER_1_LEN = 1;
	/**
	 * 	serialize this Ip82921Filler1
	 */
   protected void serializeIp82921Filler1(char[] ip82921Filler1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921Filler1,0,getStringValue(),beginIp82921Filler1,IP_82921_FILLER_1_LEN);
       localIp82921Filler1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921Filler1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp82921Filler1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921Filler1() {	 
   		return (substring(getStringValue(),beginIp82921Filler1,beginIp82921Filler1 + IP_82921_FILLER_1_LEN));
   	}
     int localIp82921ClosedMmCounter = -1;
     public boolean isIp82921ClosedMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ClosedMmCounter != sharedCounter;
         localIp82921ClosedMmCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_CLOSED_MM_LEN = 2;
	/**
	 * 	serialize this Ip82921ClosedMm
	 */
   protected void serializeIp82921ClosedMm(char[] ip82921ClosedMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ClosedMm,0,getStringValue(),beginIp82921ClosedMm,IP_82921_CLOSED_MM_LEN);
       localIp82921ClosedMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ClosedMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp82921ClosedMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ClosedMm() {	 
   		return (substring(getStringValue(),beginIp82921ClosedMm,beginIp82921ClosedMm + IP_82921_CLOSED_MM_LEN));
   	}
     int localIp82921Filler2Counter = -1;
     public boolean isIp82921Filler2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921Filler2Counter != sharedCounter;
         localIp82921Filler2Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_FILLER_2_LEN = 1;
	/**
	 * 	serialize this Ip82921Filler2
	 */
   protected void serializeIp82921Filler2(char[] ip82921Filler2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921Filler2,0,getStringValue(),beginIp82921Filler2,IP_82921_FILLER_2_LEN);
       localIp82921Filler2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921Filler2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp82921Filler2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921Filler2() {	 
   		return (substring(getStringValue(),beginIp82921Filler2,beginIp82921Filler2 + IP_82921_FILLER_2_LEN));
   	}
     int localIp82921ClosedDdCounter = -1;
     public boolean isIp82921ClosedDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ClosedDdCounter != sharedCounter;
         localIp82921ClosedDdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_CLOSED_DD_LEN = 2;
	/**
	 * 	serialize this Ip82921ClosedDd
	 */
   protected void serializeIp82921ClosedDd(char[] ip82921ClosedDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ClosedDd,0,getStringValue(),beginIp82921ClosedDd,IP_82921_CLOSED_DD_LEN);
       localIp82921ClosedDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ClosedDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp82921ClosedDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ClosedDd() {	 
   		return (substring(getStringValue(),beginIp82921ClosedDd,beginIp82921ClosedDd + IP_82921_CLOSED_DD_LEN));
   	}




}
  
