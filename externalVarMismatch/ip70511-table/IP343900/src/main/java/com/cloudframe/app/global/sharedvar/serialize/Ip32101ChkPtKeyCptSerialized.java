package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip32101ChkPtKeyCptSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip32101ChkPtKeyCptSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip32101ChkPtKeyCptSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_32101_CHK_PT_KEY_CPT_LENGTH = 17;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp32101ChkJobGrpName;
            protected  int beginIp32101ChkJobGrpNum;
            protected  int beginIp32101ChkLrmFiller;
	
	/**
	* Constructor for Ip32101ChkPtKeyCptSerialized
	**/
    public Ip32101ChkPtKeyCptSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip32101ChkPtKeyCptSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtKeyCptSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip32101ChkPtKeyCptSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip32101ChkPtKeyCptSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip32101ChkPtKeyCptSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_32101_CHK_PT_KEY_CPT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp32101ChkJobGrpName = getStartOffset() + 0;	// set offset for serialization
  
             beginIp32101ChkJobGrpNum = getStartOffset() + 6;	// set offset for serialization
  
             beginIp32101ChkLrmFiller = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp32101ChkJobGrpNameCounter = -1;
     public boolean isIp32101ChkJobGrpNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101ChkJobGrpNameCounter != sharedCounter;
         localIp32101ChkJobGrpNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_CHK_JOB_GRP_NAME_LEN = 6;
	/**
	 * 	serialize this Ip32101ChkJobGrpName
	 */
   protected void serializeIp32101ChkJobGrpName(char[] ip32101ChkJobGrpName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101ChkJobGrpName,0,getStringValue(),beginIp32101ChkJobGrpName,IP_32101_CHK_JOB_GRP_NAME_LEN);
       localIp32101ChkJobGrpNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101ChkJobGrpNameConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp32101ChkJobGrpName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101ChkJobGrpName() {	 
   		return (substring(getStringValue(),beginIp32101ChkJobGrpName,beginIp32101ChkJobGrpName + IP_32101_CHK_JOB_GRP_NAME_LEN));
   	}
     int localIp32101ChkJobGrpNumCounter = -1;
     public boolean isIp32101ChkJobGrpNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101ChkJobGrpNumCounter != sharedCounter;
         localIp32101ChkJobGrpNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_CHK_JOB_GRP_NUM_LEN = 2;
	/**
	 * 	serialize this Ip32101ChkJobGrpNum
	 */
   protected void serializeIp32101ChkJobGrpNum(char[] ip32101ChkJobGrpNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101ChkJobGrpNum,0,getStringValue(),beginIp32101ChkJobGrpNum,IP_32101_CHK_JOB_GRP_NUM_LEN);
       localIp32101ChkJobGrpNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101ChkJobGrpNumConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp32101ChkJobGrpNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101ChkJobGrpNum() {	 
   		return (substring(getStringValue(),beginIp32101ChkJobGrpNum,beginIp32101ChkJobGrpNum + IP_32101_CHK_JOB_GRP_NUM_LEN));
   	}
     int localIp32101ChkLrmFillerCounter = -1;
     public boolean isIp32101ChkLrmFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101ChkLrmFillerCounter != sharedCounter;
         localIp32101ChkLrmFillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_CHK_LRM_FILLER_LEN = 9;
	/**
	 * 	serialize this Ip32101ChkLrmFiller
	 */
   protected void serializeIp32101ChkLrmFiller(char[] ip32101ChkLrmFiller) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101ChkLrmFiller,0,getStringValue(),beginIp32101ChkLrmFiller,IP_32101_CHK_LRM_FILLER_LEN);
       localIp32101ChkLrmFillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101ChkLrmFillerConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshIp32101ChkLrmFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101ChkLrmFiller() {	 
   		return (substring(getStringValue(),beginIp32101ChkLrmFiller,beginIp32101ChkLrmFiller + IP_32101_CHK_LRM_FILLER_LEN));
   	}




}
  
