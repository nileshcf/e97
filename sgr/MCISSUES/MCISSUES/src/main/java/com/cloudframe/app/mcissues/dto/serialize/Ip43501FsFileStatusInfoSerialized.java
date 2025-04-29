package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Ip43501FsFileStatusInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip43501FsFileStatusInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip43501FsFileStatusInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_43501_FS_FILE_STATUS_INFO_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp43501FsFileStatus;
            protected  int beginIp43501FsFileErrorSw;
	
	/**
	* Constructor for Ip43501FsFileStatusInfoSerialized
	**/
    public Ip43501FsFileStatusInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip43501FsFileStatusInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501FsFileStatusInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip43501FsFileStatusInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,98); // serialize this field at offset 98 by default 
    }
    
	/**
	* sets parent for this Ip43501FsFileStatusInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 98 by default
    }    
	/**
	* initializes the field in Ip43501FsFileStatusInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_43501_FS_FILE_STATUS_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp43501FsFileStatus = getStartOffset() + 0;	// set offset for serialization
  
             beginIp43501FsFileErrorSw = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp43501FsFileStatusCounter = -1;
     public boolean isIp43501FsFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501FsFileStatusCounter != sharedCounter;
         localIp43501FsFileStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_FS_FILE_STATUS_LEN = 1;
	/**
	 * 	serialize this Ip43501FsFileStatus
	 */
   protected void serializeIp43501FsFileStatus(char[] ip43501FsFileStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501FsFileStatus,0,getStringValue(),beginIp43501FsFileStatus,IP_43501_FS_FILE_STATUS_LEN);
       localIp43501FsFileStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501FsFileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp43501FsFileStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501FsFileStatus() {	 
   		return (substring(getStringValue(),beginIp43501FsFileStatus,beginIp43501FsFileStatus + IP_43501_FS_FILE_STATUS_LEN));
   	}
     int localIp43501FsFileErrorSwCounter = -1;
     public boolean isIp43501FsFileErrorSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp43501FsFileErrorSwCounter != sharedCounter;
         localIp43501FsFileErrorSwCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_43501_FS_FILE_ERROR_SW_LEN = 1;
	/**
	 * 	serialize this Ip43501FsFileErrorSw
	 */
   protected void serializeIp43501FsFileErrorSw(char[] ip43501FsFileErrorSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip43501FsFileErrorSw,0,getStringValue(),beginIp43501FsFileErrorSw,IP_43501_FS_FILE_ERROR_SW_LEN);
       localIp43501FsFileErrorSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp43501FsFileErrorSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp43501FsFileErrorSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp43501FsFileErrorSw() {	 
   		return (substring(getStringValue(),beginIp43501FsFileErrorSw,beginIp43501FsFileErrorSw + IP_43501_FS_FILE_ERROR_SW_LEN));
   	}




}
  
