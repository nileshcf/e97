package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class FixedHeader801Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FixedHeader801Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FixedHeader801Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FIXED_HEADER_801_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMipZLogLnth801;
            protected  int beginMipZLogRefNum801;
            protected  int beginMipZLogBoxId801;
            protected  int beginMipZLogTime801;
            protected  int beginMipZLogDate801;
            protected  int beginMipZLogEtimeX801;
            protected  int beginZlogSr1LengthX801;
            protected  int beginZlogSr2LengthX801;
	
	/**
	* Constructor for FixedHeader801Serialized
	**/
    public FixedHeader801Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FixedHeader801Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FixedHeader801Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FixedHeader801Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FixedHeader801Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FixedHeader801Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FIXED_HEADER_801_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMipZLogLnth801 = getStartOffset() + 13;	// set offset for serialization
  
  
             beginMipZLogRefNum801 = getStartOffset() + 17;	// set offset for serialization
  
             beginMipZLogBoxId801 = getStartOffset() + 23;	// set offset for serialization
  
             beginMipZLogTime801 = getStartOffset() + 26;	// set offset for serialization
  
             beginMipZLogDate801 = getStartOffset() + 29;	// set offset for serialization
  
             beginMipZLogEtimeX801 = getStartOffset() + 32;	// set offset for serialization
  
             beginZlogSr1LengthX801 = getStartOffset() + 36;	// set offset for serialization
  
             beginZlogSr2LengthX801 = getStartOffset() + 38;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localMipZLogLnth801Counter = -1;
         public boolean isMipZLogLnth801Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMipZLogLnth801Counter != sharedCounter;
            localMipZLogLnth801Counter = sharedCounter; return hasModified; 
         }
   protected static final int MIP_ZLOG_LNTH_801_LEN = 2;
  	/**
	 * serializeMipZLogLnth801
	 */
	protected void serializeMipZLogLnth801(short mipZLogLnth801) {
           replaceValue( //  save the value as string
                   getBinaryString( mipZLogLnth801,MIP_ZLOG_LNTH_801_LEN)
                  ,beginMipZLogLnth801
                  ,MIP_ZLOG_LNTH_801_LEN
                 );
            localMipZLogLnth801Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMipZLogLnth801MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMipZLogLnth801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMipZLogLnth801() {	 
			return (getShort(beginMipZLogLnth801));
   	}
     int localMipZLogRefNum801Counter = -1;
     public boolean isMipZLogRefNum801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipZLogRefNum801Counter != sharedCounter;
         localMipZLogRefNum801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_ZLOG_REF_NUM_801_LEN = 6;
	/**
	 * 	serialize this MipZLogRefNum801
	 */
   protected void serializeMipZLogRefNum801(char[] mipZLogRefNum801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipZLogRefNum801,0,getStringValue(),beginMipZLogRefNum801,MIP_ZLOG_REF_NUM_801_LEN);
       localMipZLogRefNum801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipZLogRefNum801Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMipZLogRefNum801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipZLogRefNum801() {	 
   		return (substring(getStringValue(),beginMipZLogRefNum801,beginMipZLogRefNum801 + MIP_ZLOG_REF_NUM_801_LEN));
   	}
     int localMipZLogBoxId801Counter = -1;
     public boolean isMipZLogBoxId801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipZLogBoxId801Counter != sharedCounter;
         localMipZLogBoxId801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_ZLOG_BOX_ID_801_LEN = 3;
	/**
	 * 	serialize this MipZLogBoxId801
	 */
   protected void serializeMipZLogBoxId801(char[] mipZLogBoxId801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipZLogBoxId801,0,getStringValue(),beginMipZLogBoxId801,MIP_ZLOG_BOX_ID_801_LEN);
       localMipZLogBoxId801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipZLogBoxId801Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMipZLogBoxId801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipZLogBoxId801() {	 
   		return (substring(getStringValue(),beginMipZLogBoxId801,beginMipZLogBoxId801 + MIP_ZLOG_BOX_ID_801_LEN));
   	}
     int localMipZLogTime801Counter = -1;
     public boolean isMipZLogTime801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipZLogTime801Counter != sharedCounter;
         localMipZLogTime801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_ZLOG_TIME_801_LEN = 3;
	/**
	 * 	serialize this MipZLogTime801
	 */
   protected void serializeMipZLogTime801(char[] mipZLogTime801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipZLogTime801,0,getStringValue(),beginMipZLogTime801,MIP_ZLOG_TIME_801_LEN);
       localMipZLogTime801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipZLogTime801Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMipZLogTime801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipZLogTime801() {	 
   		return (substring(getStringValue(),beginMipZLogTime801,beginMipZLogTime801 + MIP_ZLOG_TIME_801_LEN));
   	}
     int localMipZLogDate801Counter = -1;
     public boolean isMipZLogDate801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipZLogDate801Counter != sharedCounter;
         localMipZLogDate801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_ZLOG_DATE_801_LEN = 3;
	/**
	 * 	serialize this MipZLogDate801
	 */
   protected void serializeMipZLogDate801(char[] mipZLogDate801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipZLogDate801,0,getStringValue(),beginMipZLogDate801,MIP_ZLOG_DATE_801_LEN);
       localMipZLogDate801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipZLogDate801Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMipZLogDate801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipZLogDate801() {	 
   		return (substring(getStringValue(),beginMipZLogDate801,beginMipZLogDate801 + MIP_ZLOG_DATE_801_LEN));
   	}
     int localMipZLogEtimeX801Counter = -1;
     public boolean isMipZLogEtimeX801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMipZLogEtimeX801Counter != sharedCounter;
         localMipZLogEtimeX801Counter = sharedCounter; return hasModified;
     }
	protected static final int MIP_ZLOG_ETIME_X_801_LEN = 4;
	/**
	 * 	serialize this MipZLogEtimeX801
	 */
   protected void serializeMipZLogEtimeX801(char[] mipZLogEtimeX801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mipZLogEtimeX801,0,getStringValue(),beginMipZLogEtimeX801,MIP_ZLOG_ETIME_X_801_LEN);
       localMipZLogEtimeX801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMipZLogEtimeX801Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshMipZLogEtimeX801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMipZLogEtimeX801() {	 
   		return (substring(getStringValue(),beginMipZLogEtimeX801,beginMipZLogEtimeX801 + MIP_ZLOG_ETIME_X_801_LEN));
   	}
     int localZlogSr1LengthX801Counter = -1;
     public boolean isZlogSr1LengthX801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZlogSr1LengthX801Counter != sharedCounter;
         localZlogSr1LengthX801Counter = sharedCounter; return hasModified;
     }
	protected static final int ZLOG_SR_1_LENGTH_X_801_LEN = 2;
	/**
	 * 	serialize this ZlogSr1LengthX801
	 */
   protected void serializeZlogSr1LengthX801(char[] zlogSr1LengthX801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(zlogSr1LengthX801,0,getStringValue(),beginZlogSr1LengthX801,ZLOG_SR_1_LENGTH_X_801_LEN);
       localZlogSr1LengthX801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkZlogSr1LengthX801Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshZlogSr1LengthX801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshZlogSr1LengthX801() {	 
   		return (substring(getStringValue(),beginZlogSr1LengthX801,beginZlogSr1LengthX801 + ZLOG_SR_1_LENGTH_X_801_LEN));
   	}
     int localZlogSr2LengthX801Counter = -1;
     public boolean isZlogSr2LengthX801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZlogSr2LengthX801Counter != sharedCounter;
         localZlogSr2LengthX801Counter = sharedCounter; return hasModified;
     }
	protected static final int ZLOG_SR_2_LENGTH_X_801_LEN = 2;
	/**
	 * 	serialize this ZlogSr2LengthX801
	 */
   protected void serializeZlogSr2LengthX801(char[] zlogSr2LengthX801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(zlogSr2LengthX801,0,getStringValue(),beginZlogSr2LengthX801,ZLOG_SR_2_LENGTH_X_801_LEN);
       localZlogSr2LengthX801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkZlogSr2LengthX801Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshZlogSr2LengthX801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshZlogSr2LengthX801() {	 
   		return (substring(getStringValue(),beginZlogSr2LengthX801,beginZlogSr2LengthX801 + ZLOG_SR_2_LENGTH_X_801_LEN));
   	}




}
  
