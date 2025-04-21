package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class QueueVars800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class QueueVars800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(QueueVars800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int QUEUE_VARS_800_LENGTH = 208;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReqQmgrName800;
            protected  int beginReqQName800;
            protected  int beginReqHconn800;
            protected  int beginReqHobj800;
            protected  int beginResQmgrName800;
            protected  int beginResQName800;
            protected  int beginResHconn800;
            protected  int beginResHobj800;
	
	/**
	* Constructor for QueueVars800Serialized
	**/
    public QueueVars800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in QueueVars800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(QUEUE_VARS_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginReqQmgrName800 = getStartOffset() + 0;	// set offset for serialization
  
             beginReqQName800 = getStartOffset() + 48;	// set offset for serialization
  
             beginReqHconn800 = getStartOffset() + 96;	// set offset for serialization
  
             beginReqHobj800 = getStartOffset() + 100;	// set offset for serialization
  
             beginResQmgrName800 = getStartOffset() + 104;	// set offset for serialization
  
             beginResQName800 = getStartOffset() + 152;	// set offset for serialization
  
             beginResHconn800 = getStartOffset() + 200;	// set offset for serialization
  
             beginResHobj800 = getStartOffset() + 204;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReqQmgrName800Counter = -1;
     public boolean isReqQmgrName800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReqQmgrName800Counter != sharedCounter;
         localReqQmgrName800Counter = sharedCounter; return hasModified;
     }
	protected static final int REQ_QMGR_NAME_800_LEN = 48;
	/**
	 * 	serialize this ReqQmgrName800
	 */
   protected void serializeReqQmgrName800(char[] reqQmgrName800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(reqQmgrName800,0,getStringValue(),beginReqQmgrName800,REQ_QMGR_NAME_800_LEN);
       localReqQmgrName800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReqQmgrName800Constraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshReqQmgrName800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReqQmgrName800() {	 
   		return (substring(getStringValue(),beginReqQmgrName800,beginReqQmgrName800 + REQ_QMGR_NAME_800_LEN));
   	}
     int localReqQName800Counter = -1;
     public boolean isReqQName800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReqQName800Counter != sharedCounter;
         localReqQName800Counter = sharedCounter; return hasModified;
     }
	protected static final int REQ_QNAME_800_LEN = 48;
	/**
	 * 	serialize this ReqQName800
	 */
   protected void serializeReqQName800(char[] reqQName800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(reqQName800,0,getStringValue(),beginReqQName800,REQ_QNAME_800_LEN);
       localReqQName800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReqQName800Constraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshReqQName800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReqQName800() {	 
   		return (substring(getStringValue(),beginReqQName800,beginReqQName800 + REQ_QNAME_800_LEN));
   	}
         int localReqHconn800Counter = -1;
         public boolean isReqHconn800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localReqHconn800Counter != sharedCounter;
            localReqHconn800Counter = sharedCounter; return hasModified; 
         }
   protected static final int REQ_HCONN_800_LEN = 4;
  	/**
	 * serializeReqHconn800
	 */
	protected void serializeReqHconn800(int reqHconn800) {
           replaceValue( //  save the value as string
                   getBinaryString( reqHconn800,REQ_HCONN_800_LEN)
                  ,beginReqHconn800
                  ,REQ_HCONN_800_LEN
                 );
            localReqHconn800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkReqHconn800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshReqHconn800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshReqHconn800() {	 
			return (getInt(beginReqHconn800));
   	}
         int localReqHobj800Counter = -1;
         public boolean isReqHobj800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localReqHobj800Counter != sharedCounter;
            localReqHobj800Counter = sharedCounter; return hasModified; 
         }
   protected static final int REQ_HOBJ_800_LEN = 4;
  	/**
	 * serializeReqHobj800
	 */
	protected void serializeReqHobj800(int reqHobj800) {
           replaceValue( //  save the value as string
                   getBinaryString( reqHobj800,REQ_HOBJ_800_LEN)
                  ,beginReqHobj800
                  ,REQ_HOBJ_800_LEN
                 );
            localReqHobj800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkReqHobj800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshReqHobj800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshReqHobj800() {	 
			return (getInt(beginReqHobj800));
   	}
     int localResQmgrName800Counter = -1;
     public boolean isResQmgrName800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResQmgrName800Counter != sharedCounter;
         localResQmgrName800Counter = sharedCounter; return hasModified;
     }
	protected static final int RES_QMGR_NAME_800_LEN = 48;
	/**
	 * 	serialize this ResQmgrName800
	 */
   protected void serializeResQmgrName800(char[] resQmgrName800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resQmgrName800,0,getStringValue(),beginResQmgrName800,RES_QMGR_NAME_800_LEN);
       localResQmgrName800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResQmgrName800Constraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshResQmgrName800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResQmgrName800() {	 
   		return (substring(getStringValue(),beginResQmgrName800,beginResQmgrName800 + RES_QMGR_NAME_800_LEN));
   	}
     int localResQName800Counter = -1;
     public boolean isResQName800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResQName800Counter != sharedCounter;
         localResQName800Counter = sharedCounter; return hasModified;
     }
	protected static final int RES_QNAME_800_LEN = 48;
	/**
	 * 	serialize this ResQName800
	 */
   protected void serializeResQName800(char[] resQName800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resQName800,0,getStringValue(),beginResQName800,RES_QNAME_800_LEN);
       localResQName800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResQName800Constraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
    /**
	 *	refreshResQName800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResQName800() {	 
   		return (substring(getStringValue(),beginResQName800,beginResQName800 + RES_QNAME_800_LEN));
   	}
         int localResHconn800Counter = -1;
         public boolean isResHconn800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localResHconn800Counter != sharedCounter;
            localResHconn800Counter = sharedCounter; return hasModified; 
         }
   protected static final int RES_HCONN_800_LEN = 4;
  	/**
	 * serializeResHconn800
	 */
	protected void serializeResHconn800(int resHconn800) {
           replaceValue( //  save the value as string
                   getBinaryString( resHconn800,RES_HCONN_800_LEN)
                  ,beginResHconn800
                  ,RES_HCONN_800_LEN
                 );
            localResHconn800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkResHconn800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshResHconn800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshResHconn800() {	 
			return (getInt(beginResHconn800));
   	}
         int localResHobj800Counter = -1;
         public boolean isResHobj800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localResHobj800Counter != sharedCounter;
            localResHobj800Counter = sharedCounter; return hasModified; 
         }
   protected static final int RES_HOBJ_800_LEN = 4;
  	/**
	 * serializeResHobj800
	 */
	protected void serializeResHobj800(int resHobj800) {
           replaceValue( //  save the value as string
                   getBinaryString( resHobj800,RES_HOBJ_800_LEN)
                  ,beginResHobj800
                  ,RES_HOBJ_800_LEN
                 );
            localResHobj800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkResHobj800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshResHobj800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshResHobj800() {	 
			return (getInt(beginResHobj800));
   	}




}
  
