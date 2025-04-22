package com.cloudframe.app.ip088030.file.records.serialize;

/**
*  The class Ip98152ClrSetlInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip98152ClrSetlInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip98152ClrSetlInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_98152_CLR_SETL_INFO_LENGTH = 51;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp98152ClrMbrCurCd;
            protected  int beginIp98152ClrMbrCurExp;
	
	/**
	* Constructor for Ip98152ClrSetlInfoSerialized
	**/
    public Ip98152ClrSetlInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip98152ClrSetlInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98152ClrSetlInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip98152ClrSetlInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,575); // serialize this field at offset 575 by default 
    }
    
	/**
	* sets parent for this Ip98152ClrSetlInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 575 by default
    }    
	/**
	* initializes the field in Ip98152ClrSetlInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_98152_CLR_SETL_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp98152ClrMbrCurCd = getStartOffset() + 28;	// set offset for serialization
  
             beginIp98152ClrMbrCurExp = getStartOffset() + 31;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp98152ClrMbrCurCdCounter = -1;
     public boolean isIp98152ClrMbrCurCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98152ClrMbrCurCdCounter != sharedCounter;
         localIp98152ClrMbrCurCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98152_CLR_MBR_CUR_CD_LEN = 3;
	/**
	 * 	serialize this Ip98152ClrMbrCurCd
	 */
   protected void serializeIp98152ClrMbrCurCd(char[] ip98152ClrMbrCurCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98152ClrMbrCurCd,0,getStringValue(),beginIp98152ClrMbrCurCd,IP_98152_CLR_MBR_CUR_CD_LEN);
       localIp98152ClrMbrCurCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98152ClrMbrCurCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp98152ClrMbrCurCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98152ClrMbrCurCd() {	 
   		return (substring(getStringValue(),beginIp98152ClrMbrCurCd,beginIp98152ClrMbrCurCd + IP_98152_CLR_MBR_CUR_CD_LEN));
   	}
     int localIp98152ClrMbrCurExpCounter = -1;
     public boolean isIp98152ClrMbrCurExpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98152ClrMbrCurExpCounter != sharedCounter;
         localIp98152ClrMbrCurExpCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98152_CLR_MBR_CUR_EXP_LEN = 1;
	/**
	 * 	serialize this Ip98152ClrMbrCurExp
	 */
   protected void serializeIp98152ClrMbrCurExp(char[] ip98152ClrMbrCurExp) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98152ClrMbrCurExp,0,getStringValue(),beginIp98152ClrMbrCurExp,IP_98152_CLR_MBR_CUR_EXP_LEN);
       localIp98152ClrMbrCurExpCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98152ClrMbrCurExpConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp98152ClrMbrCurExp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98152ClrMbrCurExp() {	 
   		return (substring(getStringValue(),beginIp98152ClrMbrCurExp,beginIp98152ClrMbrCurExp + IP_98152_CLR_MBR_CUR_EXP_LEN));
   	}




}
  
