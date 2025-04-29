package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360HeaderSscIdGrpSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class X360HeaderSscIdGrpSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360HeaderSscIdGrpSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_HEADER_SSC_ID_GRP_LENGTH = 75;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360HeaderSscId1;
            protected  int beginX360HeaderSscId2;
            protected  int beginX360HeaderSscId3;
            protected  int beginX360HeaderSscId4;
            protected  int beginX360HeaderSscId5;
            protected  int beginX360HeaderSscId6;
            protected  int beginX360HeaderSscId7;
            protected  int beginX360HeaderSscId8;
            protected  int beginX360HeaderSscId9;
            protected  int beginX360HeaderSscId10;
            protected  int beginX360HeaderSscId11;
            protected  int beginX360HeaderSscId12;
            protected  int beginX360HeaderSscId13;
            protected  int beginX360HeaderSscId14;
            protected  int beginX360HeaderSscId15;
            protected  int beginX360HeaderSscId16;
            protected  int beginX360HeaderSscId17;
            protected  int beginX360HeaderSscId18;
            protected  int beginX360HeaderSscId19;
            protected  int beginX360HeaderSscId20;
            protected  int beginX360HeaderSscId21;
            protected  int beginX360HeaderSscId22;
            protected  int beginX360HeaderSscId23;
            protected  int beginX360HeaderSscId24;
            protected  int beginX360HeaderSscId25;
	
	/**
	* Constructor for X360HeaderSscIdGrpSerialized
	**/
    public X360HeaderSscIdGrpSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360HeaderSscIdGrpSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360HeaderSscIdGrpSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360HeaderSscIdGrpSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,56); // serialize this field at offset 56 by default 
    }
    
	/**
	* sets parent for this X360HeaderSscIdGrpSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 56 by default
    }    
	/**
	* initializes the field in X360HeaderSscIdGrpSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_HEADER_SSC_ID_GRP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360HeaderSscId1 = getStartOffset() + 0;	// set offset for serialization
  
             beginX360HeaderSscId2 = getStartOffset() + 3;	// set offset for serialization
  
             beginX360HeaderSscId3 = getStartOffset() + 6;	// set offset for serialization
  
             beginX360HeaderSscId4 = getStartOffset() + 9;	// set offset for serialization
  
             beginX360HeaderSscId5 = getStartOffset() + 12;	// set offset for serialization
  
             beginX360HeaderSscId6 = getStartOffset() + 15;	// set offset for serialization
  
             beginX360HeaderSscId7 = getStartOffset() + 18;	// set offset for serialization
  
             beginX360HeaderSscId8 = getStartOffset() + 21;	// set offset for serialization
  
             beginX360HeaderSscId9 = getStartOffset() + 24;	// set offset for serialization
  
             beginX360HeaderSscId10 = getStartOffset() + 27;	// set offset for serialization
  
             beginX360HeaderSscId11 = getStartOffset() + 30;	// set offset for serialization
  
             beginX360HeaderSscId12 = getStartOffset() + 33;	// set offset for serialization
  
             beginX360HeaderSscId13 = getStartOffset() + 36;	// set offset for serialization
  
             beginX360HeaderSscId14 = getStartOffset() + 39;	// set offset for serialization
  
             beginX360HeaderSscId15 = getStartOffset() + 42;	// set offset for serialization
  
             beginX360HeaderSscId16 = getStartOffset() + 45;	// set offset for serialization
  
             beginX360HeaderSscId17 = getStartOffset() + 48;	// set offset for serialization
  
             beginX360HeaderSscId18 = getStartOffset() + 51;	// set offset for serialization
  
             beginX360HeaderSscId19 = getStartOffset() + 54;	// set offset for serialization
  
             beginX360HeaderSscId20 = getStartOffset() + 57;	// set offset for serialization
  
             beginX360HeaderSscId21 = getStartOffset() + 60;	// set offset for serialization
  
             beginX360HeaderSscId22 = getStartOffset() + 63;	// set offset for serialization
  
             beginX360HeaderSscId23 = getStartOffset() + 66;	// set offset for serialization
  
             beginX360HeaderSscId24 = getStartOffset() + 69;	// set offset for serialization
  
             beginX360HeaderSscId25 = getStartOffset() + 72;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localX360HeaderSscId1Counter = -1;
     public boolean isX360HeaderSscId1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId1Counter != sharedCounter;
         localX360HeaderSscId1Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_1_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId1
	 */
   protected void serializeX360HeaderSscId1(char[] x360HeaderSscId1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId1,0,getStringValue(),beginX360HeaderSscId1,X_360_HEADER_SSC_ID_1_LEN);
       localX360HeaderSscId1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId1Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId1() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId1,beginX360HeaderSscId1 + X_360_HEADER_SSC_ID_1_LEN));
   	}
     int localX360HeaderSscId2Counter = -1;
     public boolean isX360HeaderSscId2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId2Counter != sharedCounter;
         localX360HeaderSscId2Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_2_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId2
	 */
   protected void serializeX360HeaderSscId2(char[] x360HeaderSscId2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId2,0,getStringValue(),beginX360HeaderSscId2,X_360_HEADER_SSC_ID_2_LEN);
       localX360HeaderSscId2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId2Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId2() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId2,beginX360HeaderSscId2 + X_360_HEADER_SSC_ID_2_LEN));
   	}
     int localX360HeaderSscId3Counter = -1;
     public boolean isX360HeaderSscId3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId3Counter != sharedCounter;
         localX360HeaderSscId3Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_3_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId3
	 */
   protected void serializeX360HeaderSscId3(char[] x360HeaderSscId3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId3,0,getStringValue(),beginX360HeaderSscId3,X_360_HEADER_SSC_ID_3_LEN);
       localX360HeaderSscId3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId3Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId3() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId3,beginX360HeaderSscId3 + X_360_HEADER_SSC_ID_3_LEN));
   	}
     int localX360HeaderSscId4Counter = -1;
     public boolean isX360HeaderSscId4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId4Counter != sharedCounter;
         localX360HeaderSscId4Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_4_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId4
	 */
   protected void serializeX360HeaderSscId4(char[] x360HeaderSscId4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId4,0,getStringValue(),beginX360HeaderSscId4,X_360_HEADER_SSC_ID_4_LEN);
       localX360HeaderSscId4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId4Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId4() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId4,beginX360HeaderSscId4 + X_360_HEADER_SSC_ID_4_LEN));
   	}
     int localX360HeaderSscId5Counter = -1;
     public boolean isX360HeaderSscId5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId5Counter != sharedCounter;
         localX360HeaderSscId5Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_5_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId5
	 */
   protected void serializeX360HeaderSscId5(char[] x360HeaderSscId5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId5,0,getStringValue(),beginX360HeaderSscId5,X_360_HEADER_SSC_ID_5_LEN);
       localX360HeaderSscId5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId5Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId5() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId5,beginX360HeaderSscId5 + X_360_HEADER_SSC_ID_5_LEN));
   	}
     int localX360HeaderSscId6Counter = -1;
     public boolean isX360HeaderSscId6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId6Counter != sharedCounter;
         localX360HeaderSscId6Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_6_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId6
	 */
   protected void serializeX360HeaderSscId6(char[] x360HeaderSscId6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId6,0,getStringValue(),beginX360HeaderSscId6,X_360_HEADER_SSC_ID_6_LEN);
       localX360HeaderSscId6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId6Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId6() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId6,beginX360HeaderSscId6 + X_360_HEADER_SSC_ID_6_LEN));
   	}
     int localX360HeaderSscId7Counter = -1;
     public boolean isX360HeaderSscId7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId7Counter != sharedCounter;
         localX360HeaderSscId7Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_7_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId7
	 */
   protected void serializeX360HeaderSscId7(char[] x360HeaderSscId7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId7,0,getStringValue(),beginX360HeaderSscId7,X_360_HEADER_SSC_ID_7_LEN);
       localX360HeaderSscId7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId7Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId7() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId7,beginX360HeaderSscId7 + X_360_HEADER_SSC_ID_7_LEN));
   	}
     int localX360HeaderSscId8Counter = -1;
     public boolean isX360HeaderSscId8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId8Counter != sharedCounter;
         localX360HeaderSscId8Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_8_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId8
	 */
   protected void serializeX360HeaderSscId8(char[] x360HeaderSscId8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId8,0,getStringValue(),beginX360HeaderSscId8,X_360_HEADER_SSC_ID_8_LEN);
       localX360HeaderSscId8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId8Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId8() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId8,beginX360HeaderSscId8 + X_360_HEADER_SSC_ID_8_LEN));
   	}
     int localX360HeaderSscId9Counter = -1;
     public boolean isX360HeaderSscId9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId9Counter != sharedCounter;
         localX360HeaderSscId9Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_9_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId9
	 */
   protected void serializeX360HeaderSscId9(char[] x360HeaderSscId9) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId9,0,getStringValue(),beginX360HeaderSscId9,X_360_HEADER_SSC_ID_9_LEN);
       localX360HeaderSscId9Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId9Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId9() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId9,beginX360HeaderSscId9 + X_360_HEADER_SSC_ID_9_LEN));
   	}
     int localX360HeaderSscId10Counter = -1;
     public boolean isX360HeaderSscId10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId10Counter != sharedCounter;
         localX360HeaderSscId10Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_10_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId10
	 */
   protected void serializeX360HeaderSscId10(char[] x360HeaderSscId10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId10,0,getStringValue(),beginX360HeaderSscId10,X_360_HEADER_SSC_ID_10_LEN);
       localX360HeaderSscId10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId10Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId10() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId10,beginX360HeaderSscId10 + X_360_HEADER_SSC_ID_10_LEN));
   	}
     int localX360HeaderSscId11Counter = -1;
     public boolean isX360HeaderSscId11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId11Counter != sharedCounter;
         localX360HeaderSscId11Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_11_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId11
	 */
   protected void serializeX360HeaderSscId11(char[] x360HeaderSscId11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId11,0,getStringValue(),beginX360HeaderSscId11,X_360_HEADER_SSC_ID_11_LEN);
       localX360HeaderSscId11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId11Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId11() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId11,beginX360HeaderSscId11 + X_360_HEADER_SSC_ID_11_LEN));
   	}
     int localX360HeaderSscId12Counter = -1;
     public boolean isX360HeaderSscId12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId12Counter != sharedCounter;
         localX360HeaderSscId12Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_12_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId12
	 */
   protected void serializeX360HeaderSscId12(char[] x360HeaderSscId12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId12,0,getStringValue(),beginX360HeaderSscId12,X_360_HEADER_SSC_ID_12_LEN);
       localX360HeaderSscId12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId12Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId12() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId12,beginX360HeaderSscId12 + X_360_HEADER_SSC_ID_12_LEN));
   	}
     int localX360HeaderSscId13Counter = -1;
     public boolean isX360HeaderSscId13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId13Counter != sharedCounter;
         localX360HeaderSscId13Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_13_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId13
	 */
   protected void serializeX360HeaderSscId13(char[] x360HeaderSscId13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId13,0,getStringValue(),beginX360HeaderSscId13,X_360_HEADER_SSC_ID_13_LEN);
       localX360HeaderSscId13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId13Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId13() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId13,beginX360HeaderSscId13 + X_360_HEADER_SSC_ID_13_LEN));
   	}
     int localX360HeaderSscId14Counter = -1;
     public boolean isX360HeaderSscId14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId14Counter != sharedCounter;
         localX360HeaderSscId14Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_14_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId14
	 */
   protected void serializeX360HeaderSscId14(char[] x360HeaderSscId14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId14,0,getStringValue(),beginX360HeaderSscId14,X_360_HEADER_SSC_ID_14_LEN);
       localX360HeaderSscId14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId14Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId14() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId14,beginX360HeaderSscId14 + X_360_HEADER_SSC_ID_14_LEN));
   	}
     int localX360HeaderSscId15Counter = -1;
     public boolean isX360HeaderSscId15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId15Counter != sharedCounter;
         localX360HeaderSscId15Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_15_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId15
	 */
   protected void serializeX360HeaderSscId15(char[] x360HeaderSscId15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId15,0,getStringValue(),beginX360HeaderSscId15,X_360_HEADER_SSC_ID_15_LEN);
       localX360HeaderSscId15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId15Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId15() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId15,beginX360HeaderSscId15 + X_360_HEADER_SSC_ID_15_LEN));
   	}
     int localX360HeaderSscId16Counter = -1;
     public boolean isX360HeaderSscId16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId16Counter != sharedCounter;
         localX360HeaderSscId16Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_16_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId16
	 */
   protected void serializeX360HeaderSscId16(char[] x360HeaderSscId16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId16,0,getStringValue(),beginX360HeaderSscId16,X_360_HEADER_SSC_ID_16_LEN);
       localX360HeaderSscId16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId16Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId16() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId16,beginX360HeaderSscId16 + X_360_HEADER_SSC_ID_16_LEN));
   	}
     int localX360HeaderSscId17Counter = -1;
     public boolean isX360HeaderSscId17Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId17Counter != sharedCounter;
         localX360HeaderSscId17Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_17_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId17
	 */
   protected void serializeX360HeaderSscId17(char[] x360HeaderSscId17) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId17,0,getStringValue(),beginX360HeaderSscId17,X_360_HEADER_SSC_ID_17_LEN);
       localX360HeaderSscId17Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId17Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId17 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId17() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId17,beginX360HeaderSscId17 + X_360_HEADER_SSC_ID_17_LEN));
   	}
     int localX360HeaderSscId18Counter = -1;
     public boolean isX360HeaderSscId18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId18Counter != sharedCounter;
         localX360HeaderSscId18Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_18_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId18
	 */
   protected void serializeX360HeaderSscId18(char[] x360HeaderSscId18) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId18,0,getStringValue(),beginX360HeaderSscId18,X_360_HEADER_SSC_ID_18_LEN);
       localX360HeaderSscId18Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId18Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId18 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId18() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId18,beginX360HeaderSscId18 + X_360_HEADER_SSC_ID_18_LEN));
   	}
     int localX360HeaderSscId19Counter = -1;
     public boolean isX360HeaderSscId19Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId19Counter != sharedCounter;
         localX360HeaderSscId19Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_19_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId19
	 */
   protected void serializeX360HeaderSscId19(char[] x360HeaderSscId19) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId19,0,getStringValue(),beginX360HeaderSscId19,X_360_HEADER_SSC_ID_19_LEN);
       localX360HeaderSscId19Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId19Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId19 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId19() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId19,beginX360HeaderSscId19 + X_360_HEADER_SSC_ID_19_LEN));
   	}
     int localX360HeaderSscId20Counter = -1;
     public boolean isX360HeaderSscId20Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId20Counter != sharedCounter;
         localX360HeaderSscId20Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_20_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId20
	 */
   protected void serializeX360HeaderSscId20(char[] x360HeaderSscId20) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId20,0,getStringValue(),beginX360HeaderSscId20,X_360_HEADER_SSC_ID_20_LEN);
       localX360HeaderSscId20Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId20Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId20 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId20() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId20,beginX360HeaderSscId20 + X_360_HEADER_SSC_ID_20_LEN));
   	}
     int localX360HeaderSscId21Counter = -1;
     public boolean isX360HeaderSscId21Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId21Counter != sharedCounter;
         localX360HeaderSscId21Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_21_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId21
	 */
   protected void serializeX360HeaderSscId21(char[] x360HeaderSscId21) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId21,0,getStringValue(),beginX360HeaderSscId21,X_360_HEADER_SSC_ID_21_LEN);
       localX360HeaderSscId21Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId21Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId21 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId21() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId21,beginX360HeaderSscId21 + X_360_HEADER_SSC_ID_21_LEN));
   	}
     int localX360HeaderSscId22Counter = -1;
     public boolean isX360HeaderSscId22Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId22Counter != sharedCounter;
         localX360HeaderSscId22Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_22_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId22
	 */
   protected void serializeX360HeaderSscId22(char[] x360HeaderSscId22) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId22,0,getStringValue(),beginX360HeaderSscId22,X_360_HEADER_SSC_ID_22_LEN);
       localX360HeaderSscId22Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId22Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId22 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId22() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId22,beginX360HeaderSscId22 + X_360_HEADER_SSC_ID_22_LEN));
   	}
     int localX360HeaderSscId23Counter = -1;
     public boolean isX360HeaderSscId23Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId23Counter != sharedCounter;
         localX360HeaderSscId23Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_23_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId23
	 */
   protected void serializeX360HeaderSscId23(char[] x360HeaderSscId23) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId23,0,getStringValue(),beginX360HeaderSscId23,X_360_HEADER_SSC_ID_23_LEN);
       localX360HeaderSscId23Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId23Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId23 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId23() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId23,beginX360HeaderSscId23 + X_360_HEADER_SSC_ID_23_LEN));
   	}
     int localX360HeaderSscId24Counter = -1;
     public boolean isX360HeaderSscId24Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId24Counter != sharedCounter;
         localX360HeaderSscId24Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_24_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId24
	 */
   protected void serializeX360HeaderSscId24(char[] x360HeaderSscId24) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId24,0,getStringValue(),beginX360HeaderSscId24,X_360_HEADER_SSC_ID_24_LEN);
       localX360HeaderSscId24Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId24Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId24 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId24() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId24,beginX360HeaderSscId24 + X_360_HEADER_SSC_ID_24_LEN));
   	}
     int localX360HeaderSscId25Counter = -1;
     public boolean isX360HeaderSscId25Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderSscId25Counter != sharedCounter;
         localX360HeaderSscId25Counter = sharedCounter; return hasModified;
     }
	protected static final int X_360_HEADER_SSC_ID_25_LEN = 3;
	/**
	 * 	serialize this X360HeaderSscId25
	 */
   protected void serializeX360HeaderSscId25(char[] x360HeaderSscId25) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(x360HeaderSscId25,0,getStringValue(),beginX360HeaderSscId25,X_360_HEADER_SSC_ID_25_LEN);
       localX360HeaderSscId25Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkX360HeaderSscId25Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshX360HeaderSscId25 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshX360HeaderSscId25() {	 
   		return (substring(getStringValue(),beginX360HeaderSscId25,beginX360HeaderSscId25 + X_360_HEADER_SSC_ID_25_LEN));
   	}




}
  
