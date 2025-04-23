package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip66102IpmFileInformationSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66102IpmFileInformationSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66102IpmFileInformationSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66102_IPM_FILE_INFORMATION_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66102IpmMsgLngth;
            protected  int beginIp66102IpmMsgsRead;
            protected  int beginIp66102IpmMsgsWritten;
            protected  int beginIp66102IpmFileStatus;
            protected  int beginIp66102IsIpmFileFinished;
	
	/**
	* Constructor for Ip66102IpmFileInformationSerialized
	**/
    public Ip66102IpmFileInformationSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip66102IpmFileInformationSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66102_IPM_FILE_INFORMATION_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp66102IpmMsgLngth = getStartOffset() + 0;	// set offset for serialization
  
             beginIp66102IpmMsgsRead = getStartOffset() + 4;	// set offset for serialization
  
             beginIp66102IpmMsgsWritten = getStartOffset() + 8;	// set offset for serialization
  
             beginIp66102IpmFileStatus = getStartOffset() + 12;	// set offset for serialization
  
             beginIp66102IsIpmFileFinished = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp66102IpmMsgLngthCounter = -1;
         public boolean isIp66102IpmMsgLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66102IpmMsgLngthCounter != sharedCounter;
            localIp66102IpmMsgLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66102_IPM_MSG_LNGTH_LEN = 4;
  	/**
	 * serializeIp66102IpmMsgLngth
	 */
	protected void serializeIp66102IpmMsgLngth(long ip66102IpmMsgLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66102IpmMsgLngth,IP_66102_IPM_MSG_LNGTH_LEN)
                  ,beginIp66102IpmMsgLngth
                  ,IP_66102_IPM_MSG_LNGTH_LEN
                 );
            localIp66102IpmMsgLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp66102IpmMsgLngthMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp66102IpmMsgLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp66102IpmMsgLngth() {	 
			return (getUnsignedInt(beginIp66102IpmMsgLngth));
   	}
         int localIp66102IpmMsgsReadCounter = -1;
         public boolean isIp66102IpmMsgsReadModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66102IpmMsgsReadCounter != sharedCounter;
            localIp66102IpmMsgsReadCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66102_IPM_MSGS_READ_LEN = 4;
  	/**
	 * serializeIp66102IpmMsgsRead
	 */
	protected void serializeIp66102IpmMsgsRead(int ip66102IpmMsgsRead) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66102IpmMsgsRead,IP_66102_IPM_MSGS_READ_LEN)
                  ,beginIp66102IpmMsgsRead
                  ,IP_66102_IPM_MSGS_READ_LEN
                 );
            localIp66102IpmMsgsReadCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp66102IpmMsgsReadMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp66102IpmMsgsRead is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp66102IpmMsgsRead() {	 
			return (getInt(beginIp66102IpmMsgsRead));
   	}
         int localIp66102IpmMsgsWrittenCounter = -1;
         public boolean isIp66102IpmMsgsWrittenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp66102IpmMsgsWrittenCounter != sharedCounter;
            localIp66102IpmMsgsWrittenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_66102_IPM_MSGS_WRITTEN_LEN = 4;
  	/**
	 * serializeIp66102IpmMsgsWritten
	 */
	protected void serializeIp66102IpmMsgsWritten(int ip66102IpmMsgsWritten) {
           replaceValue( //  save the value as string
                   getBinaryString( ip66102IpmMsgsWritten,IP_66102_IPM_MSGS_WRITTEN_LEN)
                  ,beginIp66102IpmMsgsWritten
                  ,IP_66102_IPM_MSGS_WRITTEN_LEN
                 );
            localIp66102IpmMsgsWrittenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp66102IpmMsgsWrittenMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp66102IpmMsgsWritten is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp66102IpmMsgsWritten() {	 
			return (getInt(beginIp66102IpmMsgsWritten));
   	}
     int localIp66102IpmFileStatusCounter = -1;
     public boolean isIp66102IpmFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102IpmFileStatusCounter != sharedCounter;
         localIp66102IpmFileStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_IPM_FILE_STATUS_LEN = 2;
	/**
	 * 	serialize this Ip66102IpmFileStatus
	 */
   protected void serializeIp66102IpmFileStatus(char[] ip66102IpmFileStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102IpmFileStatus,0,getStringValue(),beginIp66102IpmFileStatus,IP_66102_IPM_FILE_STATUS_LEN);
       localIp66102IpmFileStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102IpmFileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshIp66102IpmFileStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102IpmFileStatus() {	 
   		return (substring(getStringValue(),beginIp66102IpmFileStatus,beginIp66102IpmFileStatus + IP_66102_IPM_FILE_STATUS_LEN));
   	}
     int localIp66102IsIpmFileFinishedCounter = -1;
     public boolean isIp66102IsIpmFileFinishedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102IsIpmFileFinishedCounter != sharedCounter;
         localIp66102IsIpmFileFinishedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_IS_IPM_FILE_FINISHED_LEN = 1;
	/**
	 * 	serialize this Ip66102IsIpmFileFinished
	 */
   protected void serializeIp66102IsIpmFileFinished(char[] ip66102IsIpmFileFinished) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102IsIpmFileFinished,0,getStringValue(),beginIp66102IsIpmFileFinished,IP_66102_IS_IPM_FILE_FINISHED_LEN);
       localIp66102IsIpmFileFinishedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102IsIpmFileFinishedConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102IsIpmFileFinished is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102IsIpmFileFinished() {	 
   		return (substring(getStringValue(),beginIp66102IsIpmFileFinished,beginIp66102IsIpmFileFinished + IP_66102_IS_IPM_FILE_FINISHED_LEN));
   	}




}
  
