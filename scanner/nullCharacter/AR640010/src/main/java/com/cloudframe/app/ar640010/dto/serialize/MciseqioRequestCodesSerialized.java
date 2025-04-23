package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class MciseqioRequestCodesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciseqioRequestCodesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciseqioRequestCodesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCISEQIO_REQUEST_CODES_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciseqioOpenIanyTtcd;
            protected  int beginMciseqioOpenIoneTtcd;
            protected  int beginMciseqioOpenOutput;
            protected  int beginMciseqioClose;
            protected  int beginMciseqioGetNext;
            protected  int beginMciseqioPutNext;
            protected  int beginMciseqioOpenInotTtcd;
            protected  int beginMciseqioForceEof;
	
	/**
	* Constructor for MciseqioRequestCodesSerialized
	**/
    public MciseqioRequestCodesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciseqioRequestCodesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioRequestCodesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciseqioRequestCodesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,125); // serialize this field at offset 125 by default 
    }
    
	/**
	* sets parent for this MciseqioRequestCodesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 125 by default
    }    
	/**
	* initializes the field in MciseqioRequestCodesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCISEQIO_REQUEST_CODES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciseqioOpenIanyTtcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMciseqioOpenIoneTtcd = getStartOffset() + 2;	// set offset for serialization
  
             beginMciseqioOpenOutput = getStartOffset() + 4;	// set offset for serialization
  
             beginMciseqioClose = getStartOffset() + 6;	// set offset for serialization
  
             beginMciseqioGetNext = getStartOffset() + 8;	// set offset for serialization
  
             beginMciseqioPutNext = getStartOffset() + 10;	// set offset for serialization
  
             beginMciseqioOpenInotTtcd = getStartOffset() + 12;	// set offset for serialization
  
             beginMciseqioForceEof = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localMciseqioOpenIanyTtcdCounter = -1;
         public boolean isMciseqioOpenIanyTtcdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioOpenIanyTtcdCounter != sharedCounter;
            localMciseqioOpenIanyTtcdCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_OPEN_IANY_TTCD_LEN = 2;
  	/**
	 * serializeMciseqioOpenIanyTtcd
	 */
	protected void serializeMciseqioOpenIanyTtcd(short mciseqioOpenIanyTtcd) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioOpenIanyTtcd,MCISEQIO_OPEN_IANY_TTCD_LEN)
                  ,beginMciseqioOpenIanyTtcd
                  ,MCISEQIO_OPEN_IANY_TTCD_LEN
                 );
            localMciseqioOpenIanyTtcdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioOpenIanyTtcdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioOpenIanyTtcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioOpenIanyTtcd() {	 
			return (getShort(beginMciseqioOpenIanyTtcd));
   	}
         int localMciseqioOpenIoneTtcdCounter = -1;
         public boolean isMciseqioOpenIoneTtcdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioOpenIoneTtcdCounter != sharedCounter;
            localMciseqioOpenIoneTtcdCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_OPEN_IONE_TTCD_LEN = 2;
  	/**
	 * serializeMciseqioOpenIoneTtcd
	 */
	protected void serializeMciseqioOpenIoneTtcd(short mciseqioOpenIoneTtcd) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioOpenIoneTtcd,MCISEQIO_OPEN_IONE_TTCD_LEN)
                  ,beginMciseqioOpenIoneTtcd
                  ,MCISEQIO_OPEN_IONE_TTCD_LEN
                 );
            localMciseqioOpenIoneTtcdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioOpenIoneTtcdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioOpenIoneTtcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioOpenIoneTtcd() {	 
			return (getShort(beginMciseqioOpenIoneTtcd));
   	}
         int localMciseqioOpenOutputCounter = -1;
         public boolean isMciseqioOpenOutputModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioOpenOutputCounter != sharedCounter;
            localMciseqioOpenOutputCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_OPEN_OUTPUT_LEN = 2;
  	/**
	 * serializeMciseqioOpenOutput
	 */
	protected void serializeMciseqioOpenOutput(short mciseqioOpenOutput) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioOpenOutput,MCISEQIO_OPEN_OUTPUT_LEN)
                  ,beginMciseqioOpenOutput
                  ,MCISEQIO_OPEN_OUTPUT_LEN
                 );
            localMciseqioOpenOutputCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioOpenOutputMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioOpenOutput is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioOpenOutput() {	 
			return (getShort(beginMciseqioOpenOutput));
   	}
         int localMciseqioCloseCounter = -1;
         public boolean isMciseqioCloseModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioCloseCounter != sharedCounter;
            localMciseqioCloseCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_CLOSE_LEN = 2;
  	/**
	 * serializeMciseqioClose
	 */
	protected void serializeMciseqioClose(short mciseqioClose) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioClose,MCISEQIO_CLOSE_LEN)
                  ,beginMciseqioClose
                  ,MCISEQIO_CLOSE_LEN
                 );
            localMciseqioCloseCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioCloseMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioClose is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioClose() {	 
			return (getShort(beginMciseqioClose));
   	}
         int localMciseqioGetNextCounter = -1;
         public boolean isMciseqioGetNextModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioGetNextCounter != sharedCounter;
            localMciseqioGetNextCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_GET_NEXT_LEN = 2;
  	/**
	 * serializeMciseqioGetNext
	 */
	protected void serializeMciseqioGetNext(short mciseqioGetNext) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioGetNext,MCISEQIO_GET_NEXT_LEN)
                  ,beginMciseqioGetNext
                  ,MCISEQIO_GET_NEXT_LEN
                 );
            localMciseqioGetNextCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioGetNextMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioGetNext is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioGetNext() {	 
			return (getShort(beginMciseqioGetNext));
   	}
         int localMciseqioPutNextCounter = -1;
         public boolean isMciseqioPutNextModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioPutNextCounter != sharedCounter;
            localMciseqioPutNextCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_PUT_NEXT_LEN = 2;
  	/**
	 * serializeMciseqioPutNext
	 */
	protected void serializeMciseqioPutNext(short mciseqioPutNext) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioPutNext,MCISEQIO_PUT_NEXT_LEN)
                  ,beginMciseqioPutNext
                  ,MCISEQIO_PUT_NEXT_LEN
                 );
            localMciseqioPutNextCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioPutNextMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioPutNext is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioPutNext() {	 
			return (getShort(beginMciseqioPutNext));
   	}
         int localMciseqioOpenInotTtcdCounter = -1;
         public boolean isMciseqioOpenInotTtcdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioOpenInotTtcdCounter != sharedCounter;
            localMciseqioOpenInotTtcdCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_OPEN_INOT_TTCD_LEN = 2;
  	/**
	 * serializeMciseqioOpenInotTtcd
	 */
	protected void serializeMciseqioOpenInotTtcd(short mciseqioOpenInotTtcd) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioOpenInotTtcd,MCISEQIO_OPEN_INOT_TTCD_LEN)
                  ,beginMciseqioOpenInotTtcd
                  ,MCISEQIO_OPEN_INOT_TTCD_LEN
                 );
            localMciseqioOpenInotTtcdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioOpenInotTtcdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioOpenInotTtcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioOpenInotTtcd() {	 
			return (getShort(beginMciseqioOpenInotTtcd));
   	}
         int localMciseqioForceEofCounter = -1;
         public boolean isMciseqioForceEofModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciseqioForceEofCounter != sharedCounter;
            localMciseqioForceEofCounter = sharedCounter; return hasModified; 
         }
   protected static final int MCISEQIO_FORCE_EOF_LEN = 2;
  	/**
	 * serializeMciseqioForceEof
	 */
	protected void serializeMciseqioForceEof(short mciseqioForceEof) {
           replaceValue( //  save the value as string
                   getBinaryString( mciseqioForceEof,MCISEQIO_FORCE_EOF_LEN)
                  ,beginMciseqioForceEof
                  ,MCISEQIO_FORCE_EOF_LEN
                 );
            localMciseqioForceEofCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkMciseqioForceEofMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshMciseqioForceEof is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshMciseqioForceEof() {	 
			return (getShort(beginMciseqioForceEof));
   	}




}
  
