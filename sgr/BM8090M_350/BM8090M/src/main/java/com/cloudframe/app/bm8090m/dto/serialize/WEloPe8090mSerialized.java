package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WEloPe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WEloPe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WEloPe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_ELO_PE_8090M_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWTioPe8090m;
            protected  int beginWIeoPe8090m;
            protected  int beginWNobPe8090m;
            protected  int beginWNcoPe8090m;
            protected  int beginWInrPe8090m;
            protected  int beginWIsoPe8090m;
	
	/**
	* Constructor for WEloPe8090mSerialized
	**/
    public WEloPe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WEloPe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WEloPe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WEloPe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2352); // serialize this field at offset 2352 by default 
    }
    
	/**
	* sets parent for this WEloPe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2352 by default
    }    
	/**
	* initializes the field in WEloPe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_ELO_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWTioPe8090m = getStartOffset() + 0;	// set offset for serialization
  
             beginWIeoPe8090m = getStartOffset() + 2;	// set offset for serialization
  
             beginWNobPe8090m = getStartOffset() + 4;	// set offset for serialization
  
             beginWNcoPe8090m = getStartOffset() + 10;	// set offset for serialization
  
             beginWInrPe8090m = getStartOffset() + 12;	// set offset for serialization
  
             beginWIsoPe8090m = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localWTioPe8090mCounter = -1;
         public boolean isWTioPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWTioPe8090mCounter != sharedCounter;
            localWTioPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_TIO_PE_8090M_LEN = 2;
  	/**
	 * serializeWTioPe8090m
	 */
	protected void serializeWTioPe8090m(int wTioPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wTioPe8090m,W_TIO_PE_8090M_LEN)
                  ,beginWTioPe8090m
                  ,W_TIO_PE_8090M_LEN
                 );
            localWTioPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWTioPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWTioPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWTioPe8090m() {	 
			return (getUnsignedShort(beginWTioPe8090m));
   	}
         int localWIeoPe8090mCounter = -1;
         public boolean isWIeoPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWIeoPe8090mCounter != sharedCounter;
            localWIeoPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_IEO_PE_8090M_LEN = 2;
  	/**
	 * serializeWIeoPe8090m
	 */
	protected void serializeWIeoPe8090m(int wIeoPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wIeoPe8090m,W_IEO_PE_8090M_LEN)
                  ,beginWIeoPe8090m
                  ,W_IEO_PE_8090M_LEN
                 );
            localWIeoPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWIeoPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWIeoPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWIeoPe8090m() {	 
			return (getUnsignedShort(beginWIeoPe8090m));
   	}
     int localWNobPe8090mCounter = -1;
     public boolean isWNobPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWNobPe8090mCounter != sharedCounter;
         localWNobPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_NOB_PE_8090M_LEN = 6;
	/**
	 * 	serialize this WNobPe8090m
	 */
   protected void serializeWNobPe8090m(char[] wNobPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wNobPe8090m,0,getStringValue(),beginWNobPe8090m,W_NOB_PE_8090M_LEN);
       localWNobPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWNobPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWNobPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWNobPe8090m() {	 
   		return (substring(getStringValue(),beginWNobPe8090m,beginWNobPe8090m + W_NOB_PE_8090M_LEN));
   	}
         int localWNcoPe8090mCounter = -1;
         public boolean isWNcoPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNcoPe8090mCounter != sharedCounter;
            localWNcoPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NCO_PE_8090M_LEN = 2;
  	/**
	 * serializeWNcoPe8090m
	 */
	protected void serializeWNcoPe8090m(int wNcoPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNcoPe8090m,W_NCO_PE_8090M_LEN)
                  ,beginWNcoPe8090m
                  ,W_NCO_PE_8090M_LEN
                 );
            localWNcoPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNcoPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNcoPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNcoPe8090m() {	 
			return (getUnsignedShort(beginWNcoPe8090m));
   	}
         int localWInrPe8090mCounter = -1;
         public boolean isWInrPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWInrPe8090mCounter != sharedCounter;
            localWInrPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_INR_PE_8090M_LEN = 2;
  	/**
	 * serializeWInrPe8090m
	 */
	protected void serializeWInrPe8090m(int wInrPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wInrPe8090m,W_INR_PE_8090M_LEN)
                  ,beginWInrPe8090m
                  ,W_INR_PE_8090M_LEN
                 );
            localWInrPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWInrPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWInrPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWInrPe8090m() {	 
			return (getUnsignedShort(beginWInrPe8090m));
   	}
         int localWIsoPe8090mCounter = -1;
         public boolean isWIsoPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWIsoPe8090mCounter != sharedCounter;
            localWIsoPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_ISO_PE_8090M_LEN = 2;
  	/**
	 * serializeWIsoPe8090m
	 */
	protected void serializeWIsoPe8090m(int wIsoPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wIsoPe8090m,W_ISO_PE_8090M_LEN)
                  ,beginWIsoPe8090m
                  ,W_ISO_PE_8090M_LEN
                 );
            localWIsoPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWIsoPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWIsoPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWIsoPe8090m() {	 
			return (getUnsignedShort(beginWIsoPe8090m));
   	}




}
  
