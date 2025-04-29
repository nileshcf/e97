package com.cloudframe.app.mcsort05.file.records.serialize;

/**
*  The class Ip40005GroupStatusRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip40005GroupStatusRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip40005GroupStatusRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_40005_GROUP_STATUS_REC_LENGTH = 2000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp40005GrpFileSeqNbr;
            protected  int beginIp40005GroupSeqNum;
	
	/**
	* Constructor for Ip40005GroupStatusRecSerialized
	**/
    public Ip40005GroupStatusRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip40005GroupStatusRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_40005_GROUP_STATUS_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp40005GrpFileSeqNbr = getStartOffset() + 1;	// set offset for serialization
  
             beginIp40005GroupSeqNum = getStartOffset() + 29;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp40005GrpFileSeqNbrCounter = -1;
     public boolean isIp40005GrpFileSeqNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp40005GrpFileSeqNbrCounter != sharedCounter;
         localIp40005GrpFileSeqNbrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip40005GrpFileSeqNbr
	 *	@return ip40005GrpFileSeqNbr
	 */
	public char[]  getIp40005GrpFileSeqNbrString() {
	     return getCharArray(beginIp40005GrpFileSeqNbr,IP_40005_GRP_FILE_SEQ_NBR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40005GrpFileSeqNbrIsNumeric() {
	    return isNumeric(beginIp40005GrpFileSeqNbr
	                    ,beginIp40005GrpFileSeqNbr + IP_40005_GRP_FILE_SEQ_NBR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_40005_GRP_FILE_SEQ_NBR_LEN = 3;
  	/**
	 * serializeIp40005GrpFileSeqNbr
	 */
	protected void serializeIp40005GrpFileSeqNbr(int ip40005GrpFileSeqNbr) {
		 putNumber(beginIp40005GrpFileSeqNbr,ip40005GrpFileSeqNbr,IP_40005_GRP_FILE_SEQ_NBR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp40005GrpFileSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp40005GrpFileSeqNbr
	 */
   	protected  int serializeIp40005GrpFileSeqNbr(char[] value) {
	    int  ip40005GrpFileSeqNbr;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip40005GrpFileSeqNbr = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp40005GrpFileSeqNbr
		       ,3
		      );
		 localIp40005GrpFileSeqNbrCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip40005GrpFileSeqNbr;
    }

   protected int checkIp40005GrpFileSeqNbrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp40005GrpFileSeqNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp40005GrpFileSeqNbr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp40005GrpFileSeqNbr
			                 ,IP_40005_GRP_FILE_SEQ_NBR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip40005GrpFileSeqNbr", beginIp40005GrpFileSeqNbr,IP_40005_GRP_FILE_SEQ_NBR_LEN);
    }
   	}
         int localIp40005GroupSeqNumCounter = -1;
         public boolean isIp40005GroupSeqNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp40005GroupSeqNumCounter != sharedCounter;
            localIp40005GroupSeqNumCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_40005_GROUP_SEQ_NUM_LEN = 4;
  	/**
	 * serializeIp40005GroupSeqNum
	 */
	protected void serializeIp40005GroupSeqNum(long ip40005GroupSeqNum) {
           replaceValue( //  save the value as string
                   getBinaryString( ip40005GroupSeqNum,IP_40005_GROUP_SEQ_NUM_LEN)
                  ,beginIp40005GroupSeqNum
                  ,IP_40005_GROUP_SEQ_NUM_LEN
                 );
            localIp40005GroupSeqNumCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkIp40005GroupSeqNumMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp40005GroupSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp40005GroupSeqNum() {	 
			return (getUnsignedInt(beginIp40005GroupSeqNum));
   	}




}
  
