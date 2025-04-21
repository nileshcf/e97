package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01Fc2DataIndRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01Fc2DataIndRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01Fc2DataIndRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_FC_2_DATA_IND_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01Fc2Ind1;
            protected  int beginBdms01Fc2Ind2;
            protected  int beginBdms01Fc2Ind3;
            protected  int beginBdms01Fc2Ind4;
            protected  int beginBdms01Fc2Ind5;
            protected  int beginBdms01Fc2Ind6;
            protected  int beginBdms01Fc2Ind7;
            protected  int beginBdms01Fc2Ind8;
	
	/**
	* Constructor for Bdms01Fc2DataIndRedefinedSerialized
	**/
    public Bdms01Fc2DataIndRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01Fc2DataIndRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01Fc2DataIndRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01Fc2DataIndRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1351); // serialize this field at offset 1351 by default 
    }
    
	/**
	* sets parent for this Bdms01Fc2DataIndRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1351 by default
    }    
	/**
	* initializes the field in Bdms01Fc2DataIndRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_FC_2_DATA_IND_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01Fc2Ind1 = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01Fc2Ind2 = getStartOffset() + 1;	// set offset for serialization
  
             beginBdms01Fc2Ind3 = getStartOffset() + 2;	// set offset for serialization
  
             beginBdms01Fc2Ind4 = getStartOffset() + 3;	// set offset for serialization
  
             beginBdms01Fc2Ind5 = getStartOffset() + 4;	// set offset for serialization
  
             beginBdms01Fc2Ind6 = getStartOffset() + 5;	// set offset for serialization
  
             beginBdms01Fc2Ind7 = getStartOffset() + 6;	// set offset for serialization
  
             beginBdms01Fc2Ind8 = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01Fc2Ind1Counter = -1;
     public boolean isBdms01Fc2Ind1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2Ind1Counter != sharedCounter;
         localBdms01Fc2Ind1Counter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_IND_1_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2Ind1
	 */
   protected void serializeBdms01Fc2Ind1(char[] bdms01Fc2Ind1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2Ind1,0,getStringValue(),beginBdms01Fc2Ind1,BDMS_01_FC_2_IND_1_LEN);
       localBdms01Fc2Ind1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2Ind1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2Ind1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2Ind1() {	 
   		return (substring(getStringValue(),beginBdms01Fc2Ind1,beginBdms01Fc2Ind1 + BDMS_01_FC_2_IND_1_LEN));
   	}
     int localBdms01Fc2Ind2Counter = -1;
     public boolean isBdms01Fc2Ind2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2Ind2Counter != sharedCounter;
         localBdms01Fc2Ind2Counter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_IND_2_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2Ind2
	 */
   protected void serializeBdms01Fc2Ind2(char[] bdms01Fc2Ind2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2Ind2,0,getStringValue(),beginBdms01Fc2Ind2,BDMS_01_FC_2_IND_2_LEN);
       localBdms01Fc2Ind2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2Ind2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2Ind2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2Ind2() {	 
   		return (substring(getStringValue(),beginBdms01Fc2Ind2,beginBdms01Fc2Ind2 + BDMS_01_FC_2_IND_2_LEN));
   	}
     int localBdms01Fc2Ind3Counter = -1;
     public boolean isBdms01Fc2Ind3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2Ind3Counter != sharedCounter;
         localBdms01Fc2Ind3Counter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_IND_3_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2Ind3
	 */
   protected void serializeBdms01Fc2Ind3(char[] bdms01Fc2Ind3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2Ind3,0,getStringValue(),beginBdms01Fc2Ind3,BDMS_01_FC_2_IND_3_LEN);
       localBdms01Fc2Ind3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2Ind3Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2Ind3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2Ind3() {	 
   		return (substring(getStringValue(),beginBdms01Fc2Ind3,beginBdms01Fc2Ind3 + BDMS_01_FC_2_IND_3_LEN));
   	}
     int localBdms01Fc2Ind4Counter = -1;
     public boolean isBdms01Fc2Ind4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2Ind4Counter != sharedCounter;
         localBdms01Fc2Ind4Counter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_IND_4_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2Ind4
	 */
   protected void serializeBdms01Fc2Ind4(char[] bdms01Fc2Ind4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2Ind4,0,getStringValue(),beginBdms01Fc2Ind4,BDMS_01_FC_2_IND_4_LEN);
       localBdms01Fc2Ind4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2Ind4Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2Ind4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2Ind4() {	 
   		return (substring(getStringValue(),beginBdms01Fc2Ind4,beginBdms01Fc2Ind4 + BDMS_01_FC_2_IND_4_LEN));
   	}
     int localBdms01Fc2Ind5Counter = -1;
     public boolean isBdms01Fc2Ind5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2Ind5Counter != sharedCounter;
         localBdms01Fc2Ind5Counter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_IND_5_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2Ind5
	 */
   protected void serializeBdms01Fc2Ind5(char[] bdms01Fc2Ind5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2Ind5,0,getStringValue(),beginBdms01Fc2Ind5,BDMS_01_FC_2_IND_5_LEN);
       localBdms01Fc2Ind5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2Ind5Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2Ind5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2Ind5() {	 
   		return (substring(getStringValue(),beginBdms01Fc2Ind5,beginBdms01Fc2Ind5 + BDMS_01_FC_2_IND_5_LEN));
   	}
     int localBdms01Fc2Ind6Counter = -1;
     public boolean isBdms01Fc2Ind6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2Ind6Counter != sharedCounter;
         localBdms01Fc2Ind6Counter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_IND_6_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2Ind6
	 */
   protected void serializeBdms01Fc2Ind6(char[] bdms01Fc2Ind6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2Ind6,0,getStringValue(),beginBdms01Fc2Ind6,BDMS_01_FC_2_IND_6_LEN);
       localBdms01Fc2Ind6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2Ind6Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2Ind6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2Ind6() {	 
   		return (substring(getStringValue(),beginBdms01Fc2Ind6,beginBdms01Fc2Ind6 + BDMS_01_FC_2_IND_6_LEN));
   	}
     int localBdms01Fc2Ind7Counter = -1;
     public boolean isBdms01Fc2Ind7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2Ind7Counter != sharedCounter;
         localBdms01Fc2Ind7Counter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_IND_7_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2Ind7
	 */
   protected void serializeBdms01Fc2Ind7(char[] bdms01Fc2Ind7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2Ind7,0,getStringValue(),beginBdms01Fc2Ind7,BDMS_01_FC_2_IND_7_LEN);
       localBdms01Fc2Ind7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2Ind7Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2Ind7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2Ind7() {	 
   		return (substring(getStringValue(),beginBdms01Fc2Ind7,beginBdms01Fc2Ind7 + BDMS_01_FC_2_IND_7_LEN));
   	}
     int localBdms01Fc2Ind8Counter = -1;
     public boolean isBdms01Fc2Ind8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01Fc2Ind8Counter != sharedCounter;
         localBdms01Fc2Ind8Counter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FC_2_IND_8_LEN = 1;
	/**
	 * 	serialize this Bdms01Fc2Ind8
	 */
   protected void serializeBdms01Fc2Ind8(char[] bdms01Fc2Ind8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01Fc2Ind8,0,getStringValue(),beginBdms01Fc2Ind8,BDMS_01_FC_2_IND_8_LEN);
       localBdms01Fc2Ind8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01Fc2Ind8Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01Fc2Ind8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01Fc2Ind8() {	 
   		return (substring(getStringValue(),beginBdms01Fc2Ind8,beginBdms01Fc2Ind8 + BDMS_01_FC_2_IND_8_LEN));
   	}




}
  
