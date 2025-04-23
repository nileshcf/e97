package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4MiscData1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ov4MiscData1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4MiscData1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_MISC_DATA_1_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4Md1Oper;
            protected  int beginOv4Md1SortType;
            protected  int beginOv4Md1Tracer;
            protected  int beginOv4Md1Block;
            protected  int beginOv4Md1RrKblk;
	
	/**
	* Constructor for Ov4MiscData1Serialized
	**/
    public Ov4MiscData1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ov4MiscData1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4MiscData1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ov4MiscData1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,375); // serialize this field at offset 375 by default 
    }
    
	/**
	* sets parent for this Ov4MiscData1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 375 by default
    }    
	/**
	* initializes the field in Ov4MiscData1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_MISC_DATA_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOv4Md1Oper = getStartOffset() + 16;	// set offset for serialization
  
             beginOv4Md1SortType = getStartOffset() + 21;	// set offset for serialization
  
  
             beginOv4Md1Tracer = getStartOffset() + 30;	// set offset for serialization
  
  
             beginOv4Md1Block = getStartOffset() + 35;	// set offset for serialization
  
  
             beginOv4Md1RrKblk = getStartOffset() + 40;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localOv4Md1OperCounter = -1;
     public boolean isOv4Md1OperModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4Md1OperCounter != sharedCounter;
         localOv4Md1OperCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_MD_1_OPER_LEN = 5;
	/**
	 * 	serialize this Ov4Md1Oper
	 */
   protected void serializeOv4Md1Oper(char[] ov4Md1Oper) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4Md1Oper,0,getStringValue(),beginOv4Md1Oper,OV_4_MD_1_OPER_LEN);
       localOv4Md1OperCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4Md1OperConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshOv4Md1Oper is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4Md1Oper() {	 
   		return (substring(getStringValue(),beginOv4Md1Oper,beginOv4Md1Oper + OV_4_MD_1_OPER_LEN));
   	}
     int localOv4Md1SortTypeCounter = -1;
     public boolean isOv4Md1SortTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4Md1SortTypeCounter != sharedCounter;
         localOv4Md1SortTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_MD_1_SORT_TYPE_LEN = 3;
	/**
	 * 	serialize this Ov4Md1SortType
	 */
   protected void serializeOv4Md1SortType(char[] ov4Md1SortType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4Md1SortType,0,getStringValue(),beginOv4Md1SortType,OV_4_MD_1_SORT_TYPE_LEN);
       localOv4Md1SortTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4Md1SortTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshOv4Md1SortType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4Md1SortType() {	 
   		return (substring(getStringValue(),beginOv4Md1SortType,beginOv4Md1SortType + OV_4_MD_1_SORT_TYPE_LEN));
   	}
     int localOv4Md1TracerCounter = -1;
     public boolean isOv4Md1TracerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4Md1TracerCounter != sharedCounter;
         localOv4Md1TracerCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_MD_1_TRACER_LEN = 4;
	/**
	 * 	serialize this Ov4Md1Tracer
	 */
   protected void serializeOv4Md1Tracer(char[] ov4Md1Tracer) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4Md1Tracer,0,getStringValue(),beginOv4Md1Tracer,OV_4_MD_1_TRACER_LEN);
       localOv4Md1TracerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4Md1TracerConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshOv4Md1Tracer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4Md1Tracer() {	 
   		return (substring(getStringValue(),beginOv4Md1Tracer,beginOv4Md1Tracer + OV_4_MD_1_TRACER_LEN));
   	}
     int localOv4Md1BlockCounter = -1;
     public boolean isOv4Md1BlockModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4Md1BlockCounter != sharedCounter;
         localOv4Md1BlockCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_MD_1_BLOCK_LEN = 4;
	/**
	 * 	serialize this Ov4Md1Block
	 */
   protected void serializeOv4Md1Block(char[] ov4Md1Block) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4Md1Block,0,getStringValue(),beginOv4Md1Block,OV_4_MD_1_BLOCK_LEN);
       localOv4Md1BlockCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4Md1BlockConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshOv4Md1Block is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4Md1Block() {	 
   		return (substring(getStringValue(),beginOv4Md1Block,beginOv4Md1Block + OV_4_MD_1_BLOCK_LEN));
   	}
     int localOv4Md1RrKblkCounter = -1;
     public boolean isOv4Md1RrKblkModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4Md1RrKblkCounter != sharedCounter;
         localOv4Md1RrKblkCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_MD_1_RR_KBLK_LEN = 5;
	/**
	 * 	serialize this Ov4Md1RrKblk
	 */
   protected void serializeOv4Md1RrKblk(char[] ov4Md1RrKblk) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4Md1RrKblk,0,getStringValue(),beginOv4Md1RrKblk,OV_4_MD_1_RR_KBLK_LEN);
       localOv4Md1RrKblkCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4Md1RrKblkConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshOv4Md1RrKblk is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4Md1RrKblk() {	 
   		return (substring(getStringValue(),beginOv4Md1RrKblk,beginOv4Md1RrKblk + OV_4_MD_1_RR_KBLK_LEN));
   	}




}
  
