package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdFrozenChilledIndRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdFrozenChilledIndRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdFrozenChilledIndRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_FROZEN_CHILLED_IND_R_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMsdFcInd1;
            protected  int beginMsdFcInd2;
            protected  int beginMsdFcInd3;
            protected  int beginMsdFcInd4;
            protected  int beginMsdFcInd5;
            protected  int beginMsdFcInd6;
            protected  int beginMsdFcInd7;
            protected  int beginMsdFcInd8;
	
	/**
	* Constructor for MsdFrozenChilledIndRSerialized
	**/
    public MsdFrozenChilledIndRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdFrozenChilledIndRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdFrozenChilledIndRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdFrozenChilledIndRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1343); // serialize this field at offset 1343 by default 
    }
    
	/**
	* sets parent for this MsdFrozenChilledIndRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1343 by default
    }    
	/**
	* initializes the field in MsdFrozenChilledIndRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_FROZEN_CHILLED_IND_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMsdFcInd1 = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdFcInd2 = getStartOffset() + 1;	// set offset for serialization
  
             beginMsdFcInd3 = getStartOffset() + 2;	// set offset for serialization
  
             beginMsdFcInd4 = getStartOffset() + 3;	// set offset for serialization
  
             beginMsdFcInd5 = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdFcInd6 = getStartOffset() + 5;	// set offset for serialization
  
             beginMsdFcInd7 = getStartOffset() + 6;	// set offset for serialization
  
             beginMsdFcInd8 = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMsdFcInd1Counter = -1;
     public boolean isMsdFcInd1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFcInd1Counter != sharedCounter;
         localMsdFcInd1Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_FC_IND_1_LEN = 1;
	/**
	 * 	serialize this MsdFcInd1
	 */
   protected void serializeMsdFcInd1(char[] msdFcInd1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdFcInd1,0,getStringValue(),beginMsdFcInd1,MSD_FC_IND_1_LEN);
       localMsdFcInd1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdFcInd1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdFcInd1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdFcInd1() {	 
   		return (substring(getStringValue(),beginMsdFcInd1,beginMsdFcInd1 + MSD_FC_IND_1_LEN));
   	}
     int localMsdFcInd2Counter = -1;
     public boolean isMsdFcInd2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFcInd2Counter != sharedCounter;
         localMsdFcInd2Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_FC_IND_2_LEN = 1;
	/**
	 * 	serialize this MsdFcInd2
	 */
   protected void serializeMsdFcInd2(char[] msdFcInd2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdFcInd2,0,getStringValue(),beginMsdFcInd2,MSD_FC_IND_2_LEN);
       localMsdFcInd2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdFcInd2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdFcInd2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdFcInd2() {	 
   		return (substring(getStringValue(),beginMsdFcInd2,beginMsdFcInd2 + MSD_FC_IND_2_LEN));
   	}
     int localMsdFcInd3Counter = -1;
     public boolean isMsdFcInd3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFcInd3Counter != sharedCounter;
         localMsdFcInd3Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_FC_IND_3_LEN = 1;
	/**
	 * 	serialize this MsdFcInd3
	 */
   protected void serializeMsdFcInd3(char[] msdFcInd3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdFcInd3,0,getStringValue(),beginMsdFcInd3,MSD_FC_IND_3_LEN);
       localMsdFcInd3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdFcInd3Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdFcInd3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdFcInd3() {	 
   		return (substring(getStringValue(),beginMsdFcInd3,beginMsdFcInd3 + MSD_FC_IND_3_LEN));
   	}
     int localMsdFcInd4Counter = -1;
     public boolean isMsdFcInd4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFcInd4Counter != sharedCounter;
         localMsdFcInd4Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_FC_IND_4_LEN = 1;
	/**
	 * 	serialize this MsdFcInd4
	 */
   protected void serializeMsdFcInd4(char[] msdFcInd4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdFcInd4,0,getStringValue(),beginMsdFcInd4,MSD_FC_IND_4_LEN);
       localMsdFcInd4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdFcInd4Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdFcInd4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdFcInd4() {	 
   		return (substring(getStringValue(),beginMsdFcInd4,beginMsdFcInd4 + MSD_FC_IND_4_LEN));
   	}
     int localMsdFcInd5Counter = -1;
     public boolean isMsdFcInd5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFcInd5Counter != sharedCounter;
         localMsdFcInd5Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_FC_IND_5_LEN = 1;
	/**
	 * 	serialize this MsdFcInd5
	 */
   protected void serializeMsdFcInd5(char[] msdFcInd5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdFcInd5,0,getStringValue(),beginMsdFcInd5,MSD_FC_IND_5_LEN);
       localMsdFcInd5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdFcInd5Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdFcInd5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdFcInd5() {	 
   		return (substring(getStringValue(),beginMsdFcInd5,beginMsdFcInd5 + MSD_FC_IND_5_LEN));
   	}
     int localMsdFcInd6Counter = -1;
     public boolean isMsdFcInd6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFcInd6Counter != sharedCounter;
         localMsdFcInd6Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_FC_IND_6_LEN = 1;
	/**
	 * 	serialize this MsdFcInd6
	 */
   protected void serializeMsdFcInd6(char[] msdFcInd6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdFcInd6,0,getStringValue(),beginMsdFcInd6,MSD_FC_IND_6_LEN);
       localMsdFcInd6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdFcInd6Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdFcInd6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdFcInd6() {	 
   		return (substring(getStringValue(),beginMsdFcInd6,beginMsdFcInd6 + MSD_FC_IND_6_LEN));
   	}
     int localMsdFcInd7Counter = -1;
     public boolean isMsdFcInd7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFcInd7Counter != sharedCounter;
         localMsdFcInd7Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_FC_IND_7_LEN = 1;
	/**
	 * 	serialize this MsdFcInd7
	 */
   protected void serializeMsdFcInd7(char[] msdFcInd7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdFcInd7,0,getStringValue(),beginMsdFcInd7,MSD_FC_IND_7_LEN);
       localMsdFcInd7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdFcInd7Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdFcInd7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdFcInd7() {	 
   		return (substring(getStringValue(),beginMsdFcInd7,beginMsdFcInd7 + MSD_FC_IND_7_LEN));
   	}
     int localMsdFcInd8Counter = -1;
     public boolean isMsdFcInd8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdFcInd8Counter != sharedCounter;
         localMsdFcInd8Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_FC_IND_8_LEN = 1;
	/**
	 * 	serialize this MsdFcInd8
	 */
   protected void serializeMsdFcInd8(char[] msdFcInd8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdFcInd8,0,getStringValue(),beginMsdFcInd8,MSD_FC_IND_8_LEN);
       localMsdFcInd8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdFcInd8Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdFcInd8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdFcInd8() {	 
   		return (substring(getStringValue(),beginMsdFcInd8,beginMsdFcInd8 + MSD_FC_IND_8_LEN));
   	}




}
  
