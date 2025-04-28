package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WZonFpfPe8090mSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WZonFpfPe8090mSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WZonFpfPe8090mSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_ZON_FPF_PE_8090M_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWNupFpfPe8090m;
            protected  int beginWTipFpfPe8090m;
            protected  int beginWMasFpfPe8090m;
            protected  int beginWTmaFpfPe8090m;
            protected  int beginWNcmFpfPe8090m;
	
	/**
	* Constructor for WZonFpfPe8090mSerialized
	**/
    public WZonFpfPe8090mSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WZonFpfPe8090mSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WZonFpfPe8090mSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WZonFpfPe8090mSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2664); // serialize this field at offset 2664 by default 
    }
    
	/**
	* sets parent for this WZonFpfPe8090mSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2664 by default
    }    
	/**
	* initializes the field in WZonFpfPe8090mSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_ZON_FPF_PE_8090M_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWNupFpfPe8090m = getStartOffset() + 0;	// set offset for serialization
  
             beginWTipFpfPe8090m = getStartOffset() + 2;	// set offset for serialization
  
             beginWMasFpfPe8090m = getStartOffset() + 4;	// set offset for serialization
  
             beginWTmaFpfPe8090m = getStartOffset() + 22;	// set offset for serialization
  
             beginWNcmFpfPe8090m = getStartOffset() + 24;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localWNupFpfPe8090mCounter = -1;
         public boolean isWNupFpfPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNupFpfPe8090mCounter != sharedCounter;
            localWNupFpfPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NUP_FPF_PE_8090M_LEN = 2;
  	/**
	 * serializeWNupFpfPe8090m
	 */
	protected void serializeWNupFpfPe8090m(int wNupFpfPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNupFpfPe8090m,W_NUP_FPF_PE_8090M_LEN)
                  ,beginWNupFpfPe8090m
                  ,W_NUP_FPF_PE_8090M_LEN
                 );
            localWNupFpfPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNupFpfPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNupFpfPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNupFpfPe8090m() {	 
			return (getUnsignedShort(beginWNupFpfPe8090m));
   	}
         int localWTipFpfPe8090mCounter = -1;
         public boolean isWTipFpfPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWTipFpfPe8090mCounter != sharedCounter;
            localWTipFpfPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_TIP_FPF_PE_8090M_LEN = 2;
  	/**
	 * serializeWTipFpfPe8090m
	 */
	protected void serializeWTipFpfPe8090m(int wTipFpfPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wTipFpfPe8090m,W_TIP_FPF_PE_8090M_LEN)
                  ,beginWTipFpfPe8090m
                  ,W_TIP_FPF_PE_8090M_LEN
                 );
            localWTipFpfPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWTipFpfPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWTipFpfPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWTipFpfPe8090m() {	 
			return (getUnsignedShort(beginWTipFpfPe8090m));
   	}
     int localWMasFpfPe8090mCounter = -1;
     public boolean isWMasFpfPe8090mModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWMasFpfPe8090mCounter != sharedCounter;
         localWMasFpfPe8090mCounter = sharedCounter; return hasModified;
     }
	protected static final int W_MAS_FPF_PE_8090M_LEN = 18;
	/**
	 * 	serialize this WMasFpfPe8090m
	 */
   protected void serializeWMasFpfPe8090m(char[] wMasFpfPe8090m) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wMasFpfPe8090m,0,getStringValue(),beginWMasFpfPe8090m,W_MAS_FPF_PE_8090M_LEN);
       localWMasFpfPe8090mCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWMasFpfPe8090mConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshWMasFpfPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWMasFpfPe8090m() {	 
   		return (substring(getStringValue(),beginWMasFpfPe8090m,beginWMasFpfPe8090m + W_MAS_FPF_PE_8090M_LEN));
   	}
         int localWTmaFpfPe8090mCounter = -1;
         public boolean isWTmaFpfPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWTmaFpfPe8090mCounter != sharedCounter;
            localWTmaFpfPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_TMA_FPF_PE_8090M_LEN = 2;
  	/**
	 * serializeWTmaFpfPe8090m
	 */
	protected void serializeWTmaFpfPe8090m(int wTmaFpfPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wTmaFpfPe8090m,W_TMA_FPF_PE_8090M_LEN)
                  ,beginWTmaFpfPe8090m
                  ,W_TMA_FPF_PE_8090M_LEN
                 );
            localWTmaFpfPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWTmaFpfPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWTmaFpfPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWTmaFpfPe8090m() {	 
			return (getUnsignedShort(beginWTmaFpfPe8090m));
   	}
         int localWNcmFpfPe8090mCounter = -1;
         public boolean isWNcmFpfPe8090mModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWNcmFpfPe8090mCounter != sharedCounter;
            localWNcmFpfPe8090mCounter = sharedCounter; return hasModified; 
         }
   protected static final int W_NCM_FPF_PE_8090M_LEN = 2;
  	/**
	 * serializeWNcmFpfPe8090m
	 */
	protected void serializeWNcmFpfPe8090m(int wNcmFpfPe8090m) {
           replaceValue( //  save the value as string
                   getBinaryString( wNcmFpfPe8090m,W_NCM_FPF_PE_8090M_LEN)
                  ,beginWNcmFpfPe8090m
                  ,W_NCM_FPF_PE_8090M_LEN
                 );
            localWNcmFpfPe8090mCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkWNcmFpfPe8090mMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWNcmFpfPe8090m is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWNcmFpfPe8090m() {	 
			return (getUnsignedShort(beginWNcmFpfPe8090m));
   	}




}
  
