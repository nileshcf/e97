package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip66102BitMapSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip66102BitMapSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip66102BitMapSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_66102_BIT_MAP_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp66102BitByte1;
            protected  int beginIp66102BitByte2;
            protected  int beginIp66102BitByte3;
            protected  int beginIp66102BitByte4;
            protected  int beginIp66102BitByte5;
            protected  int beginIp66102BitByte6;
            protected  int beginIp66102BitByte7;
            protected  int beginIp66102BitByte8;
            protected  int beginIp66102BitByte9;
            protected  int beginIp66102BitByte10;
            protected  int beginIp66102BitByte11;
            protected  int beginIp66102BitByte12;
            protected  int beginIp66102BitByte13;
            protected  int beginIp66102BitByte14;
            protected  int beginIp66102BitByte15;
            protected  int beginIp66102BitByte16;
	
	/**
	* Constructor for Ip66102BitMapSerialized
	**/
    public Ip66102BitMapSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip66102BitMapSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66102BitMapSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip66102BitMapSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this Ip66102BitMapSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in Ip66102BitMapSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_66102_BIT_MAP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp66102BitByte1 = getStartOffset() + 0;	// set offset for serialization
  
             beginIp66102BitByte2 = getStartOffset() + 1;	// set offset for serialization
  
             beginIp66102BitByte3 = getStartOffset() + 2;	// set offset for serialization
  
             beginIp66102BitByte4 = getStartOffset() + 3;	// set offset for serialization
  
             beginIp66102BitByte5 = getStartOffset() + 4;	// set offset for serialization
  
             beginIp66102BitByte6 = getStartOffset() + 5;	// set offset for serialization
  
             beginIp66102BitByte7 = getStartOffset() + 6;	// set offset for serialization
  
             beginIp66102BitByte8 = getStartOffset() + 7;	// set offset for serialization
  
             beginIp66102BitByte9 = getStartOffset() + 8;	// set offset for serialization
  
             beginIp66102BitByte10 = getStartOffset() + 9;	// set offset for serialization
  
             beginIp66102BitByte11 = getStartOffset() + 10;	// set offset for serialization
  
             beginIp66102BitByte12 = getStartOffset() + 11;	// set offset for serialization
  
             beginIp66102BitByte13 = getStartOffset() + 12;	// set offset for serialization
  
             beginIp66102BitByte14 = getStartOffset() + 13;	// set offset for serialization
  
             beginIp66102BitByte15 = getStartOffset() + 14;	// set offset for serialization
  
             beginIp66102BitByte16 = getStartOffset() + 15;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp66102BitByte1Counter = -1;
     public boolean isIp66102BitByte1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte1Counter != sharedCounter;
         localIp66102BitByte1Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_1_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte1
	 */
   protected void serializeIp66102BitByte1(char[] ip66102BitByte1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte1,0,getStringValue(),beginIp66102BitByte1,IP_66102_BIT_BYTE_1_LEN);
       localIp66102BitByte1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte1() {	 
   		return (substring(getStringValue(),beginIp66102BitByte1,beginIp66102BitByte1 + IP_66102_BIT_BYTE_1_LEN));
   	}
     int localIp66102BitByte2Counter = -1;
     public boolean isIp66102BitByte2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte2Counter != sharedCounter;
         localIp66102BitByte2Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_2_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte2
	 */
   protected void serializeIp66102BitByte2(char[] ip66102BitByte2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte2,0,getStringValue(),beginIp66102BitByte2,IP_66102_BIT_BYTE_2_LEN);
       localIp66102BitByte2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte2() {	 
   		return (substring(getStringValue(),beginIp66102BitByte2,beginIp66102BitByte2 + IP_66102_BIT_BYTE_2_LEN));
   	}
     int localIp66102BitByte3Counter = -1;
     public boolean isIp66102BitByte3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte3Counter != sharedCounter;
         localIp66102BitByte3Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_3_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte3
	 */
   protected void serializeIp66102BitByte3(char[] ip66102BitByte3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte3,0,getStringValue(),beginIp66102BitByte3,IP_66102_BIT_BYTE_3_LEN);
       localIp66102BitByte3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte3Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte3() {	 
   		return (substring(getStringValue(),beginIp66102BitByte3,beginIp66102BitByte3 + IP_66102_BIT_BYTE_3_LEN));
   	}
     int localIp66102BitByte4Counter = -1;
     public boolean isIp66102BitByte4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte4Counter != sharedCounter;
         localIp66102BitByte4Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_4_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte4
	 */
   protected void serializeIp66102BitByte4(char[] ip66102BitByte4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte4,0,getStringValue(),beginIp66102BitByte4,IP_66102_BIT_BYTE_4_LEN);
       localIp66102BitByte4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte4Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte4() {	 
   		return (substring(getStringValue(),beginIp66102BitByte4,beginIp66102BitByte4 + IP_66102_BIT_BYTE_4_LEN));
   	}
     int localIp66102BitByte5Counter = -1;
     public boolean isIp66102BitByte5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte5Counter != sharedCounter;
         localIp66102BitByte5Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_5_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte5
	 */
   protected void serializeIp66102BitByte5(char[] ip66102BitByte5) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte5,0,getStringValue(),beginIp66102BitByte5,IP_66102_BIT_BYTE_5_LEN);
       localIp66102BitByte5Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte5Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte5() {	 
   		return (substring(getStringValue(),beginIp66102BitByte5,beginIp66102BitByte5 + IP_66102_BIT_BYTE_5_LEN));
   	}
     int localIp66102BitByte6Counter = -1;
     public boolean isIp66102BitByte6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte6Counter != sharedCounter;
         localIp66102BitByte6Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_6_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte6
	 */
   protected void serializeIp66102BitByte6(char[] ip66102BitByte6) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte6,0,getStringValue(),beginIp66102BitByte6,IP_66102_BIT_BYTE_6_LEN);
       localIp66102BitByte6Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte6Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte6() {	 
   		return (substring(getStringValue(),beginIp66102BitByte6,beginIp66102BitByte6 + IP_66102_BIT_BYTE_6_LEN));
   	}
     int localIp66102BitByte7Counter = -1;
     public boolean isIp66102BitByte7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte7Counter != sharedCounter;
         localIp66102BitByte7Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_7_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte7
	 */
   protected void serializeIp66102BitByte7(char[] ip66102BitByte7) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte7,0,getStringValue(),beginIp66102BitByte7,IP_66102_BIT_BYTE_7_LEN);
       localIp66102BitByte7Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte7Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte7() {	 
   		return (substring(getStringValue(),beginIp66102BitByte7,beginIp66102BitByte7 + IP_66102_BIT_BYTE_7_LEN));
   	}
     int localIp66102BitByte8Counter = -1;
     public boolean isIp66102BitByte8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte8Counter != sharedCounter;
         localIp66102BitByte8Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_8_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte8
	 */
   protected void serializeIp66102BitByte8(char[] ip66102BitByte8) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte8,0,getStringValue(),beginIp66102BitByte8,IP_66102_BIT_BYTE_8_LEN);
       localIp66102BitByte8Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte8Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte8() {	 
   		return (substring(getStringValue(),beginIp66102BitByte8,beginIp66102BitByte8 + IP_66102_BIT_BYTE_8_LEN));
   	}
     int localIp66102BitByte9Counter = -1;
     public boolean isIp66102BitByte9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte9Counter != sharedCounter;
         localIp66102BitByte9Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_9_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte9
	 */
   protected void serializeIp66102BitByte9(char[] ip66102BitByte9) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte9,0,getStringValue(),beginIp66102BitByte9,IP_66102_BIT_BYTE_9_LEN);
       localIp66102BitByte9Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte9Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte9() {	 
   		return (substring(getStringValue(),beginIp66102BitByte9,beginIp66102BitByte9 + IP_66102_BIT_BYTE_9_LEN));
   	}
     int localIp66102BitByte10Counter = -1;
     public boolean isIp66102BitByte10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte10Counter != sharedCounter;
         localIp66102BitByte10Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_10_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte10
	 */
   protected void serializeIp66102BitByte10(char[] ip66102BitByte10) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte10,0,getStringValue(),beginIp66102BitByte10,IP_66102_BIT_BYTE_10_LEN);
       localIp66102BitByte10Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte10Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte10 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte10() {	 
   		return (substring(getStringValue(),beginIp66102BitByte10,beginIp66102BitByte10 + IP_66102_BIT_BYTE_10_LEN));
   	}
     int localIp66102BitByte11Counter = -1;
     public boolean isIp66102BitByte11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte11Counter != sharedCounter;
         localIp66102BitByte11Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_11_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte11
	 */
   protected void serializeIp66102BitByte11(char[] ip66102BitByte11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte11,0,getStringValue(),beginIp66102BitByte11,IP_66102_BIT_BYTE_11_LEN);
       localIp66102BitByte11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte11Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte11() {	 
   		return (substring(getStringValue(),beginIp66102BitByte11,beginIp66102BitByte11 + IP_66102_BIT_BYTE_11_LEN));
   	}
     int localIp66102BitByte12Counter = -1;
     public boolean isIp66102BitByte12Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte12Counter != sharedCounter;
         localIp66102BitByte12Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_12_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte12
	 */
   protected void serializeIp66102BitByte12(char[] ip66102BitByte12) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte12,0,getStringValue(),beginIp66102BitByte12,IP_66102_BIT_BYTE_12_LEN);
       localIp66102BitByte12Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte12Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte12 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte12() {	 
   		return (substring(getStringValue(),beginIp66102BitByte12,beginIp66102BitByte12 + IP_66102_BIT_BYTE_12_LEN));
   	}
     int localIp66102BitByte13Counter = -1;
     public boolean isIp66102BitByte13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte13Counter != sharedCounter;
         localIp66102BitByte13Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_13_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte13
	 */
   protected void serializeIp66102BitByte13(char[] ip66102BitByte13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte13,0,getStringValue(),beginIp66102BitByte13,IP_66102_BIT_BYTE_13_LEN);
       localIp66102BitByte13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte13Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte13() {	 
   		return (substring(getStringValue(),beginIp66102BitByte13,beginIp66102BitByte13 + IP_66102_BIT_BYTE_13_LEN));
   	}
     int localIp66102BitByte14Counter = -1;
     public boolean isIp66102BitByte14Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte14Counter != sharedCounter;
         localIp66102BitByte14Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_14_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte14
	 */
   protected void serializeIp66102BitByte14(char[] ip66102BitByte14) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte14,0,getStringValue(),beginIp66102BitByte14,IP_66102_BIT_BYTE_14_LEN);
       localIp66102BitByte14Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte14Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte14 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte14() {	 
   		return (substring(getStringValue(),beginIp66102BitByte14,beginIp66102BitByte14 + IP_66102_BIT_BYTE_14_LEN));
   	}
     int localIp66102BitByte15Counter = -1;
     public boolean isIp66102BitByte15Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte15Counter != sharedCounter;
         localIp66102BitByte15Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_15_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte15
	 */
   protected void serializeIp66102BitByte15(char[] ip66102BitByte15) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte15,0,getStringValue(),beginIp66102BitByte15,IP_66102_BIT_BYTE_15_LEN);
       localIp66102BitByte15Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte15Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte15 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte15() {	 
   		return (substring(getStringValue(),beginIp66102BitByte15,beginIp66102BitByte15 + IP_66102_BIT_BYTE_15_LEN));
   	}
     int localIp66102BitByte16Counter = -1;
     public boolean isIp66102BitByte16Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp66102BitByte16Counter != sharedCounter;
         localIp66102BitByte16Counter = sharedCounter; return hasModified;
     }
	protected static final int IP_66102_BIT_BYTE_16_LEN = 1;
	/**
	 * 	serialize this Ip66102BitByte16
	 */
   protected void serializeIp66102BitByte16(char[] ip66102BitByte16) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip66102BitByte16,0,getStringValue(),beginIp66102BitByte16,IP_66102_BIT_BYTE_16_LEN);
       localIp66102BitByte16Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp66102BitByte16Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp66102BitByte16 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp66102BitByte16() {	 
   		return (substring(getStringValue(),beginIp66102BitByte16,beginIp66102BitByte16 + IP_66102_BIT_BYTE_16_LEN));
   	}




}
  
