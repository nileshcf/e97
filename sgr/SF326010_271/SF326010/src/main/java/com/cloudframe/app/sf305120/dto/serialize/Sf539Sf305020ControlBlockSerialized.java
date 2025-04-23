package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class Sf539Sf305020ControlBlockSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf539Sf305020ControlBlockSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf539Sf305020ControlBlockSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_539_SF_305020_CONTROL_BLOCK_LENGTH = 768;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf539SubprogamId;
            protected  int beginSf539CallingProgram;
            protected  int beginSf539ZlogRecordPtr;
            protected  int beginSf539ZlogRecordAddr;
            protected  int beginSf539ZlogRecordLnth;
            protected  int beginSf539ZlogElapsedTime;
            protected  int beginSf539Sr1Length;
            protected  int beginSf539Sr2Length;
           protected int beginSf539ServiceTable;
           protected static final int SF_539_SERVICE_TABLE_SIZE = 8;
            protected  int beginSf539HeaderSpec;
            protected  int beginSf539IsoMsgOffset;
            protected  int beginSf539IsoMsgLnth;
            protected  int beginSf539Trailer1Offset;
            protected  int beginSf539Trailer1Lnth;
            protected  int beginSf539IsoMsg2Offset;
            protected  int beginSf539IsoMsg2Lnth;
            protected  int beginSf539Trailer2Offset;
            protected  int beginSf539Trailer2Lnth;
            protected  int beginSf539IsoMsg3Offset;
            protected  int beginSf539IsoMsg3Lnth;
            protected  int beginSf539FillerExpansion;
	
	/**
	* Constructor for Sf539Sf305020ControlBlockSerialized
	**/
    public Sf539Sf305020ControlBlockSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sf539Sf305020ControlBlockSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_539_SF_305020_CONTROL_BLOCK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf539SubprogamId = getStartOffset() + 0;	// set offset for serialization
  
             beginSf539CallingProgram = getStartOffset() + 8;	// set offset for serialization
  
             beginSf539ZlogRecordPtr = getStartOffset() + 16;	// set offset for serialization
  
             beginSf539ZlogRecordAddr = getStartOffset() + 16;	// set offset for serialization
  
             beginSf539ZlogRecordLnth = getStartOffset() + 20;	// set offset for serialization
  
             beginSf539ZlogElapsedTime = getStartOffset() + 24;	// set offset for serialization
  
             beginSf539Sr1Length = getStartOffset() + 28;	// set offset for serialization
  
             beginSf539Sr2Length = getStartOffset() + 30;	// set offset for serialization
  
	        beginSf539ServiceTable = getStartOffset() + 32; // set offset for serialization
  
             beginSf539HeaderSpec = getStartOffset() + 672;	// set offset for serialization
  
             beginSf539IsoMsgOffset = getStartOffset() + 688;	// set offset for serialization
  
             beginSf539IsoMsgLnth = getStartOffset() + 690;	// set offset for serialization
  
             beginSf539Trailer1Offset = getStartOffset() + 692;	// set offset for serialization
  
             beginSf539Trailer1Lnth = getStartOffset() + 694;	// set offset for serialization
  
             beginSf539IsoMsg2Offset = getStartOffset() + 696;	// set offset for serialization
  
             beginSf539IsoMsg2Lnth = getStartOffset() + 698;	// set offset for serialization
  
             beginSf539Trailer2Offset = getStartOffset() + 700;	// set offset for serialization
  
             beginSf539Trailer2Lnth = getStartOffset() + 702;	// set offset for serialization
  
             beginSf539IsoMsg3Offset = getStartOffset() + 704;	// set offset for serialization
  
             beginSf539IsoMsg3Lnth = getStartOffset() + 706;	// set offset for serialization
  
             beginSf539FillerExpansion = getStartOffset() + 708;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf539SubprogamIdCounter = -1;
     public boolean isSf539SubprogamIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539SubprogamIdCounter != sharedCounter;
         localSf539SubprogamIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_539_SUBPROGAM_ID_LEN = 8;
	/**
	 * 	serialize this Sf539SubprogamId
	 */
   protected void serializeSf539SubprogamId(char[] sf539SubprogamId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf539SubprogamId,0,getStringValue(),beginSf539SubprogamId,SF_539_SUBPROGAM_ID_LEN);
       localSf539SubprogamIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf539SubprogamIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSf539SubprogamId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf539SubprogamId() {	 
   		return (substring(getStringValue(),beginSf539SubprogamId,beginSf539SubprogamId + SF_539_SUBPROGAM_ID_LEN));
   	}
     int localSf539CallingProgramCounter = -1;
     public boolean isSf539CallingProgramModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539CallingProgramCounter != sharedCounter;
         localSf539CallingProgramCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_539_CALLING_PROGRAM_LEN = 8;
	/**
	 * 	serialize this Sf539CallingProgram
	 */
   protected void serializeSf539CallingProgram(char[] sf539CallingProgram) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf539CallingProgram,0,getStringValue(),beginSf539CallingProgram,SF_539_CALLING_PROGRAM_LEN);
       localSf539CallingProgramCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf539CallingProgramConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshSf539CallingProgram is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf539CallingProgram() {	 
   		return (substring(getStringValue(),beginSf539CallingProgram,beginSf539CallingProgram + SF_539_CALLING_PROGRAM_LEN));
   	}
     int localSf539ZlogRecordPtrCounter = -1;
     public boolean isSf539ZlogRecordPtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539ZlogRecordPtrCounter != sharedCounter;
         localSf539ZlogRecordPtrCounter = sharedCounter; return hasModified; 
     }
   protected static final int SF_539_ZLOG_RECORD_PTR_LEN = 4;
  	/**
	 * serializeSf539ZlogRecordPtr
	 */
	protected void serializeSf539ZlogRecordPtr(int sf539ZlogRecordPtr) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539ZlogRecordPtr,SF_539_ZLOG_RECORD_PTR_LEN)
                  ,beginSf539ZlogRecordPtr
                  ,SF_539_ZLOG_RECORD_PTR_LEN
                 );
            localSf539ZlogRecordPtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf539ZlogRecordPtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSf539ZlogRecordPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf539ZlogRecordPtr() {	 
			return (getInt(beginSf539ZlogRecordPtr));
   	}
         int localSf539ZlogRecordAddrCounter = -1;
         public boolean isSf539ZlogRecordAddrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539ZlogRecordAddrCounter != sharedCounter;
            localSf539ZlogRecordAddrCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_ZLOG_RECORD_ADDR_LEN = 4;
  	/**
	 * serializeSf539ZlogRecordAddr
	 */
	protected void serializeSf539ZlogRecordAddr(int sf539ZlogRecordAddr) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539ZlogRecordAddr,SF_539_ZLOG_RECORD_ADDR_LEN)
                  ,beginSf539ZlogRecordAddr
                  ,SF_539_ZLOG_RECORD_ADDR_LEN
                 );
            localSf539ZlogRecordAddrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf539ZlogRecordAddrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSf539ZlogRecordAddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf539ZlogRecordAddr() {	 
			return (getInt(beginSf539ZlogRecordAddr));
   	}
         int localSf539ZlogRecordLnthCounter = -1;
         public boolean isSf539ZlogRecordLnthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539ZlogRecordLnthCounter != sharedCounter;
            localSf539ZlogRecordLnthCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_ZLOG_RECORD_LNTH_LEN = 4;
  	/**
	 * serializeSf539ZlogRecordLnth
	 */
	protected void serializeSf539ZlogRecordLnth(int sf539ZlogRecordLnth) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539ZlogRecordLnth,SF_539_ZLOG_RECORD_LNTH_LEN)
                  ,beginSf539ZlogRecordLnth
                  ,SF_539_ZLOG_RECORD_LNTH_LEN
                 );
            localSf539ZlogRecordLnthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf539ZlogRecordLnthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSf539ZlogRecordLnth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf539ZlogRecordLnth() {	 
			return (getInt(beginSf539ZlogRecordLnth));
   	}
         int localSf539ZlogElapsedTimeCounter = -1;
         public boolean isSf539ZlogElapsedTimeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539ZlogElapsedTimeCounter != sharedCounter;
            localSf539ZlogElapsedTimeCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_ZLOG_ELAPSED_TIME_LEN = 4;
  	/**
	 * serializeSf539ZlogElapsedTime
	 */
	protected void serializeSf539ZlogElapsedTime(int sf539ZlogElapsedTime) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539ZlogElapsedTime,SF_539_ZLOG_ELAPSED_TIME_LEN)
                  ,beginSf539ZlogElapsedTime
                  ,SF_539_ZLOG_ELAPSED_TIME_LEN
                 );
            localSf539ZlogElapsedTimeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSf539ZlogElapsedTimeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSf539ZlogElapsedTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSf539ZlogElapsedTime() {	 
			return (getInt(beginSf539ZlogElapsedTime));
   	}
         int localSf539Sr1LengthCounter = -1;
         public boolean isSf539Sr1LengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539Sr1LengthCounter != sharedCounter;
            localSf539Sr1LengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_SR_1_LENGTH_LEN = 2;
  	/**
	 * serializeSf539Sr1Length
	 */
	protected void serializeSf539Sr1Length(short sf539Sr1Length) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539Sr1Length,SF_539_SR_1_LENGTH_LEN)
                  ,beginSf539Sr1Length
                  ,SF_539_SR_1_LENGTH_LEN
                 );
            localSf539Sr1LengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539Sr1LengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539Sr1Length is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539Sr1Length() {	 
			return (getShort(beginSf539Sr1Length));
   	}
         int localSf539Sr2LengthCounter = -1;
         public boolean isSf539Sr2LengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539Sr2LengthCounter != sharedCounter;
            localSf539Sr2LengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_SR_2_LENGTH_LEN = 2;
  	/**
	 * serializeSf539Sr2Length
	 */
	protected void serializeSf539Sr2Length(short sf539Sr2Length) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539Sr2Length,SF_539_SR_2_LENGTH_LEN)
                  ,beginSf539Sr2Length
                  ,SF_539_SR_2_LENGTH_LEN
                 );
            localSf539Sr2LengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539Sr2LengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539Sr2Length is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539Sr2Length() {	 
			return (getShort(beginSf539Sr2Length));
   	}
     int localSf539HeaderSpecCounter = -1;
     public boolean isSf539HeaderSpecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539HeaderSpecCounter != sharedCounter;
         localSf539HeaderSpecCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_539_HEADER_SPEC_LEN = 16;
	/**
	 * 	serialize this Sf539HeaderSpec
	 */
   protected void serializeSf539HeaderSpec(char[] sf539HeaderSpec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf539HeaderSpec,0,getStringValue(),beginSf539HeaderSpec,SF_539_HEADER_SPEC_LEN);
       localSf539HeaderSpecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf539HeaderSpecConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshSf539HeaderSpec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf539HeaderSpec() {	 
   		return (substring(getStringValue(),beginSf539HeaderSpec,beginSf539HeaderSpec + SF_539_HEADER_SPEC_LEN));
   	}
         int localSf539IsoMsgOffsetCounter = -1;
         public boolean isSf539IsoMsgOffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539IsoMsgOffsetCounter != sharedCounter;
            localSf539IsoMsgOffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_ISO_MSG_OFFSET_LEN = 2;
  	/**
	 * serializeSf539IsoMsgOffset
	 */
	protected void serializeSf539IsoMsgOffset(short sf539IsoMsgOffset) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539IsoMsgOffset,SF_539_ISO_MSG_OFFSET_LEN)
                  ,beginSf539IsoMsgOffset
                  ,SF_539_ISO_MSG_OFFSET_LEN
                 );
            localSf539IsoMsgOffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539IsoMsgOffsetMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539IsoMsgOffset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539IsoMsgOffset() {	 
			return (getShort(beginSf539IsoMsgOffset));
   	}
         int localSf539IsoMsgLnthCounter = -1;
         public boolean isSf539IsoMsgLnthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539IsoMsgLnthCounter != sharedCounter;
            localSf539IsoMsgLnthCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_ISO_MSG_LNTH_LEN = 2;
  	/**
	 * serializeSf539IsoMsgLnth
	 */
	protected void serializeSf539IsoMsgLnth(short sf539IsoMsgLnth) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539IsoMsgLnth,SF_539_ISO_MSG_LNTH_LEN)
                  ,beginSf539IsoMsgLnth
                  ,SF_539_ISO_MSG_LNTH_LEN
                 );
            localSf539IsoMsgLnthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539IsoMsgLnthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539IsoMsgLnth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539IsoMsgLnth() {	 
			return (getShort(beginSf539IsoMsgLnth));
   	}
         int localSf539Trailer1OffsetCounter = -1;
         public boolean isSf539Trailer1OffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539Trailer1OffsetCounter != sharedCounter;
            localSf539Trailer1OffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_TRAILER_1_OFFSET_LEN = 2;
  	/**
	 * serializeSf539Trailer1Offset
	 */
	protected void serializeSf539Trailer1Offset(short sf539Trailer1Offset) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539Trailer1Offset,SF_539_TRAILER_1_OFFSET_LEN)
                  ,beginSf539Trailer1Offset
                  ,SF_539_TRAILER_1_OFFSET_LEN
                 );
            localSf539Trailer1OffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539Trailer1OffsetMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539Trailer1Offset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539Trailer1Offset() {	 
			return (getShort(beginSf539Trailer1Offset));
   	}
         int localSf539Trailer1LnthCounter = -1;
         public boolean isSf539Trailer1LnthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539Trailer1LnthCounter != sharedCounter;
            localSf539Trailer1LnthCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_TRAILER_1_LNTH_LEN = 2;
  	/**
	 * serializeSf539Trailer1Lnth
	 */
	protected void serializeSf539Trailer1Lnth(short sf539Trailer1Lnth) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539Trailer1Lnth,SF_539_TRAILER_1_LNTH_LEN)
                  ,beginSf539Trailer1Lnth
                  ,SF_539_TRAILER_1_LNTH_LEN
                 );
            localSf539Trailer1LnthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539Trailer1LnthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539Trailer1Lnth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539Trailer1Lnth() {	 
			return (getShort(beginSf539Trailer1Lnth));
   	}
         int localSf539IsoMsg2OffsetCounter = -1;
         public boolean isSf539IsoMsg2OffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539IsoMsg2OffsetCounter != sharedCounter;
            localSf539IsoMsg2OffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_ISO_MSG_2_OFFSET_LEN = 2;
  	/**
	 * serializeSf539IsoMsg2Offset
	 */
	protected void serializeSf539IsoMsg2Offset(short sf539IsoMsg2Offset) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539IsoMsg2Offset,SF_539_ISO_MSG_2_OFFSET_LEN)
                  ,beginSf539IsoMsg2Offset
                  ,SF_539_ISO_MSG_2_OFFSET_LEN
                 );
            localSf539IsoMsg2OffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539IsoMsg2OffsetMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539IsoMsg2Offset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539IsoMsg2Offset() {	 
			return (getShort(beginSf539IsoMsg2Offset));
   	}
         int localSf539IsoMsg2LnthCounter = -1;
         public boolean isSf539IsoMsg2LnthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539IsoMsg2LnthCounter != sharedCounter;
            localSf539IsoMsg2LnthCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_ISO_MSG_2_LNTH_LEN = 2;
  	/**
	 * serializeSf539IsoMsg2Lnth
	 */
	protected void serializeSf539IsoMsg2Lnth(short sf539IsoMsg2Lnth) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539IsoMsg2Lnth,SF_539_ISO_MSG_2_LNTH_LEN)
                  ,beginSf539IsoMsg2Lnth
                  ,SF_539_ISO_MSG_2_LNTH_LEN
                 );
            localSf539IsoMsg2LnthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539IsoMsg2LnthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539IsoMsg2Lnth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539IsoMsg2Lnth() {	 
			return (getShort(beginSf539IsoMsg2Lnth));
   	}
         int localSf539Trailer2OffsetCounter = -1;
         public boolean isSf539Trailer2OffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539Trailer2OffsetCounter != sharedCounter;
            localSf539Trailer2OffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_TRAILER_2_OFFSET_LEN = 2;
  	/**
	 * serializeSf539Trailer2Offset
	 */
	protected void serializeSf539Trailer2Offset(short sf539Trailer2Offset) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539Trailer2Offset,SF_539_TRAILER_2_OFFSET_LEN)
                  ,beginSf539Trailer2Offset
                  ,SF_539_TRAILER_2_OFFSET_LEN
                 );
            localSf539Trailer2OffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539Trailer2OffsetMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539Trailer2Offset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539Trailer2Offset() {	 
			return (getShort(beginSf539Trailer2Offset));
   	}
         int localSf539Trailer2LnthCounter = -1;
         public boolean isSf539Trailer2LnthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539Trailer2LnthCounter != sharedCounter;
            localSf539Trailer2LnthCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_TRAILER_2_LNTH_LEN = 2;
  	/**
	 * serializeSf539Trailer2Lnth
	 */
	protected void serializeSf539Trailer2Lnth(short sf539Trailer2Lnth) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539Trailer2Lnth,SF_539_TRAILER_2_LNTH_LEN)
                  ,beginSf539Trailer2Lnth
                  ,SF_539_TRAILER_2_LNTH_LEN
                 );
            localSf539Trailer2LnthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539Trailer2LnthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539Trailer2Lnth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539Trailer2Lnth() {	 
			return (getShort(beginSf539Trailer2Lnth));
   	}
         int localSf539IsoMsg3OffsetCounter = -1;
         public boolean isSf539IsoMsg3OffsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539IsoMsg3OffsetCounter != sharedCounter;
            localSf539IsoMsg3OffsetCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_ISO_MSG_3_OFFSET_LEN = 2;
  	/**
	 * serializeSf539IsoMsg3Offset
	 */
	protected void serializeSf539IsoMsg3Offset(short sf539IsoMsg3Offset) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539IsoMsg3Offset,SF_539_ISO_MSG_3_OFFSET_LEN)
                  ,beginSf539IsoMsg3Offset
                  ,SF_539_ISO_MSG_3_OFFSET_LEN
                 );
            localSf539IsoMsg3OffsetCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539IsoMsg3OffsetMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539IsoMsg3Offset is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539IsoMsg3Offset() {	 
			return (getShort(beginSf539IsoMsg3Offset));
   	}
         int localSf539IsoMsg3LnthCounter = -1;
         public boolean isSf539IsoMsg3LnthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSf539IsoMsg3LnthCounter != sharedCounter;
            localSf539IsoMsg3LnthCounter = sharedCounter; return hasModified; 
         }
   protected static final int SF_539_ISO_MSG_3_LNTH_LEN = 2;
  	/**
	 * serializeSf539IsoMsg3Lnth
	 */
	protected void serializeSf539IsoMsg3Lnth(short sf539IsoMsg3Lnth) {
           replaceValue( //  save the value as string
                   getBinaryString( sf539IsoMsg3Lnth,SF_539_ISO_MSG_3_LNTH_LEN)
                  ,beginSf539IsoMsg3Lnth
                  ,SF_539_ISO_MSG_3_LNTH_LEN
                 );
            localSf539IsoMsg3LnthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSf539IsoMsg3LnthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSf539IsoMsg3Lnth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSf539IsoMsg3Lnth() {	 
			return (getShort(beginSf539IsoMsg3Lnth));
   	}
     int localSf539FillerExpansionCounter = -1;
     public boolean isSf539FillerExpansionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf539FillerExpansionCounter != sharedCounter;
         localSf539FillerExpansionCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_539_FILLER_EXPANSION_LEN = 60;
	/**
	 * 	serialize this Sf539FillerExpansion
	 */
   protected void serializeSf539FillerExpansion(char[] sf539FillerExpansion) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf539FillerExpansion,0,getStringValue(),beginSf539FillerExpansion,SF_539_FILLER_EXPANSION_LEN);
       localSf539FillerExpansionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf539FillerExpansionConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshSf539FillerExpansion is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf539FillerExpansion() {	 
   		return (substring(getStringValue(),beginSf539FillerExpansion,beginSf539FillerExpansion + SF_539_FILLER_EXPANSION_LEN));
   	}

		public int sf539ServiceTableSize() {
			return SF_539_SERVICE_TABLE_SIZE;
		}



}
  
