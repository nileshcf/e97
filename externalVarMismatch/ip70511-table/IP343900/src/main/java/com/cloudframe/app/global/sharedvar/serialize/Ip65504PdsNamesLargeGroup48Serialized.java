package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup48Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup48Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup48Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_48_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1458S;
            protected  int beginIp65504P1458L;
            protected  int beginIp65504P1459S;
            protected  int beginIp65504P1459L;
            protected  int beginIp65504P1460S;
            protected  int beginIp65504P1460L;
            protected  int beginIp65504P1461S;
            protected  int beginIp65504P1461L;
            protected  int beginIp65504P1462S;
            protected  int beginIp65504P1462L;
            protected  int beginIp65504P1463S;
            protected  int beginIp65504P1463L;
            protected  int beginIp65504P1464S;
            protected  int beginIp65504P1464L;
            protected  int beginIp65504P1465S;
            protected  int beginIp65504P1465L;
            protected  int beginIp65504P1466S;
            protected  int beginIp65504P1466L;
            protected  int beginIp65504P1467S;
            protected  int beginIp65504P1467L;
            protected  int beginIp65504P1468S;
            protected  int beginIp65504P1468L;
            protected  int beginIp65504P1469S;
            protected  int beginIp65504P1469L;
            protected  int beginIp65504P1470S;
            protected  int beginIp65504P1470L;
            protected  int beginIp65504P1471S;
            protected  int beginIp65504P1471L;
            protected  int beginIp65504P1472S;
            protected  int beginIp65504P1472L;
            protected  int beginIp65504P1473S;
            protected  int beginIp65504P1473L;
            protected  int beginIp65504P1474S;
            protected  int beginIp65504P1474L;
            protected  int beginIp65504P1475S;
            protected  int beginIp65504P1475L;
            protected  int beginIp65504P1476S;
            protected  int beginIp65504P1476L;
            protected  int beginIp65504P1477S;
            protected  int beginIp65504P1477L;
            protected  int beginIp65504P1478S;
            protected  int beginIp65504P1478L;
            protected  int beginIp65504P1479S;
            protected  int beginIp65504P1479L;
            protected  int beginIp65504P1480S;
            protected  int beginIp65504P1480L;
            protected  int beginIp65504P1481S;
            protected  int beginIp65504P1481L;
            protected  int beginIp65504P1482S;
            protected  int beginIp65504P1482L;
            protected  int beginIp65504P1483S;
            protected  int beginIp65504P1483L;
            protected  int beginIp65504P1484S;
            protected  int beginIp65504P1484L;
            protected  int beginIp65504P1485S;
            protected  int beginIp65504P1485L;
            protected  int beginIp65504P1486S;
            protected  int beginIp65504P1486L;
            protected  int beginIp65504P1487S;
            protected  int beginIp65504P1487L;
            protected  int beginIp65504P1488S;
            protected  int beginIp65504P1488L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup48Serialized
	**/
    public Ip65504PdsNamesLargeGroup48Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup48Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup48Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup48Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11652); // serialize this field at offset 11652 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup48Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11652 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup48Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_48_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1458S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1458L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1459S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1459L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1460S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1460L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1461S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1461L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1462S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1462L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1463S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1463L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1464S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1464L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1465S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1465L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1466S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1466L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1467S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1467L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1468S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1468L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1469S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1469L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1470S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1470L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1471S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1471L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1472S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1472L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1473S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1473L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1474S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1474L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1475S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1475L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1476S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1476L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1477S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1477L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1478S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1478L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1479S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1479L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1480S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1480L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1481S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1481L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1482S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1482L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1483S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1483L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1484S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1484L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1485S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1485L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1486S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1486L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1487S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1487L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1488S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1488L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1458SCounter = -1;
         public boolean isIp65504P1458SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1458SCounter != sharedCounter;
            localIp65504P1458SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1458_S_LEN = 2;
  	/**
	 * serializeIp65504P1458S
	 */
	protected void serializeIp65504P1458S(short ip65504P1458S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1458S,IP_65504_P_1458_S_LEN)
                  ,beginIp65504P1458S
                  ,IP_65504_P_1458_S_LEN
                 );
            localIp65504P1458SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1458SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1458S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1458S() {	 
			return (getShort(beginIp65504P1458S));
   	}
         int localIp65504P1458LCounter = -1;
         public boolean isIp65504P1458LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1458LCounter != sharedCounter;
            localIp65504P1458LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1458_L_LEN = 2;
  	/**
	 * serializeIp65504P1458L
	 */
	protected void serializeIp65504P1458L(short ip65504P1458L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1458L,IP_65504_P_1458_L_LEN)
                  ,beginIp65504P1458L
                  ,IP_65504_P_1458_L_LEN
                 );
            localIp65504P1458LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1458LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1458L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1458L() {	 
			return (getShort(beginIp65504P1458L));
   	}
         int localIp65504P1459SCounter = -1;
         public boolean isIp65504P1459SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1459SCounter != sharedCounter;
            localIp65504P1459SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1459_S_LEN = 2;
  	/**
	 * serializeIp65504P1459S
	 */
	protected void serializeIp65504P1459S(short ip65504P1459S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1459S,IP_65504_P_1459_S_LEN)
                  ,beginIp65504P1459S
                  ,IP_65504_P_1459_S_LEN
                 );
            localIp65504P1459SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1459SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1459S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1459S() {	 
			return (getShort(beginIp65504P1459S));
   	}
         int localIp65504P1459LCounter = -1;
         public boolean isIp65504P1459LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1459LCounter != sharedCounter;
            localIp65504P1459LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1459_L_LEN = 2;
  	/**
	 * serializeIp65504P1459L
	 */
	protected void serializeIp65504P1459L(short ip65504P1459L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1459L,IP_65504_P_1459_L_LEN)
                  ,beginIp65504P1459L
                  ,IP_65504_P_1459_L_LEN
                 );
            localIp65504P1459LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1459LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1459L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1459L() {	 
			return (getShort(beginIp65504P1459L));
   	}
         int localIp65504P1460SCounter = -1;
         public boolean isIp65504P1460SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1460SCounter != sharedCounter;
            localIp65504P1460SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1460_S_LEN = 2;
  	/**
	 * serializeIp65504P1460S
	 */
	protected void serializeIp65504P1460S(short ip65504P1460S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1460S,IP_65504_P_1460_S_LEN)
                  ,beginIp65504P1460S
                  ,IP_65504_P_1460_S_LEN
                 );
            localIp65504P1460SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1460SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1460S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1460S() {	 
			return (getShort(beginIp65504P1460S));
   	}
         int localIp65504P1460LCounter = -1;
         public boolean isIp65504P1460LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1460LCounter != sharedCounter;
            localIp65504P1460LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1460_L_LEN = 2;
  	/**
	 * serializeIp65504P1460L
	 */
	protected void serializeIp65504P1460L(short ip65504P1460L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1460L,IP_65504_P_1460_L_LEN)
                  ,beginIp65504P1460L
                  ,IP_65504_P_1460_L_LEN
                 );
            localIp65504P1460LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1460LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1460L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1460L() {	 
			return (getShort(beginIp65504P1460L));
   	}
         int localIp65504P1461SCounter = -1;
         public boolean isIp65504P1461SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1461SCounter != sharedCounter;
            localIp65504P1461SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1461_S_LEN = 2;
  	/**
	 * serializeIp65504P1461S
	 */
	protected void serializeIp65504P1461S(short ip65504P1461S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1461S,IP_65504_P_1461_S_LEN)
                  ,beginIp65504P1461S
                  ,IP_65504_P_1461_S_LEN
                 );
            localIp65504P1461SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1461SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1461S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1461S() {	 
			return (getShort(beginIp65504P1461S));
   	}
         int localIp65504P1461LCounter = -1;
         public boolean isIp65504P1461LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1461LCounter != sharedCounter;
            localIp65504P1461LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1461_L_LEN = 2;
  	/**
	 * serializeIp65504P1461L
	 */
	protected void serializeIp65504P1461L(short ip65504P1461L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1461L,IP_65504_P_1461_L_LEN)
                  ,beginIp65504P1461L
                  ,IP_65504_P_1461_L_LEN
                 );
            localIp65504P1461LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1461LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1461L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1461L() {	 
			return (getShort(beginIp65504P1461L));
   	}
         int localIp65504P1462SCounter = -1;
         public boolean isIp65504P1462SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1462SCounter != sharedCounter;
            localIp65504P1462SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1462_S_LEN = 2;
  	/**
	 * serializeIp65504P1462S
	 */
	protected void serializeIp65504P1462S(short ip65504P1462S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1462S,IP_65504_P_1462_S_LEN)
                  ,beginIp65504P1462S
                  ,IP_65504_P_1462_S_LEN
                 );
            localIp65504P1462SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1462SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1462S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1462S() {	 
			return (getShort(beginIp65504P1462S));
   	}
         int localIp65504P1462LCounter = -1;
         public boolean isIp65504P1462LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1462LCounter != sharedCounter;
            localIp65504P1462LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1462_L_LEN = 2;
  	/**
	 * serializeIp65504P1462L
	 */
	protected void serializeIp65504P1462L(short ip65504P1462L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1462L,IP_65504_P_1462_L_LEN)
                  ,beginIp65504P1462L
                  ,IP_65504_P_1462_L_LEN
                 );
            localIp65504P1462LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1462LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1462L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1462L() {	 
			return (getShort(beginIp65504P1462L));
   	}
         int localIp65504P1463SCounter = -1;
         public boolean isIp65504P1463SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1463SCounter != sharedCounter;
            localIp65504P1463SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1463_S_LEN = 2;
  	/**
	 * serializeIp65504P1463S
	 */
	protected void serializeIp65504P1463S(short ip65504P1463S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1463S,IP_65504_P_1463_S_LEN)
                  ,beginIp65504P1463S
                  ,IP_65504_P_1463_S_LEN
                 );
            localIp65504P1463SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1463SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1463S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1463S() {	 
			return (getShort(beginIp65504P1463S));
   	}
         int localIp65504P1463LCounter = -1;
         public boolean isIp65504P1463LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1463LCounter != sharedCounter;
            localIp65504P1463LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1463_L_LEN = 2;
  	/**
	 * serializeIp65504P1463L
	 */
	protected void serializeIp65504P1463L(short ip65504P1463L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1463L,IP_65504_P_1463_L_LEN)
                  ,beginIp65504P1463L
                  ,IP_65504_P_1463_L_LEN
                 );
            localIp65504P1463LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1463LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1463L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1463L() {	 
			return (getShort(beginIp65504P1463L));
   	}
         int localIp65504P1464SCounter = -1;
         public boolean isIp65504P1464SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1464SCounter != sharedCounter;
            localIp65504P1464SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1464_S_LEN = 2;
  	/**
	 * serializeIp65504P1464S
	 */
	protected void serializeIp65504P1464S(short ip65504P1464S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1464S,IP_65504_P_1464_S_LEN)
                  ,beginIp65504P1464S
                  ,IP_65504_P_1464_S_LEN
                 );
            localIp65504P1464SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1464SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1464S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1464S() {	 
			return (getShort(beginIp65504P1464S));
   	}
         int localIp65504P1464LCounter = -1;
         public boolean isIp65504P1464LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1464LCounter != sharedCounter;
            localIp65504P1464LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1464_L_LEN = 2;
  	/**
	 * serializeIp65504P1464L
	 */
	protected void serializeIp65504P1464L(short ip65504P1464L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1464L,IP_65504_P_1464_L_LEN)
                  ,beginIp65504P1464L
                  ,IP_65504_P_1464_L_LEN
                 );
            localIp65504P1464LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1464LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1464L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1464L() {	 
			return (getShort(beginIp65504P1464L));
   	}
         int localIp65504P1465SCounter = -1;
         public boolean isIp65504P1465SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1465SCounter != sharedCounter;
            localIp65504P1465SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1465_S_LEN = 2;
  	/**
	 * serializeIp65504P1465S
	 */
	protected void serializeIp65504P1465S(short ip65504P1465S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1465S,IP_65504_P_1465_S_LEN)
                  ,beginIp65504P1465S
                  ,IP_65504_P_1465_S_LEN
                 );
            localIp65504P1465SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1465SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1465S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1465S() {	 
			return (getShort(beginIp65504P1465S));
   	}
         int localIp65504P1465LCounter = -1;
         public boolean isIp65504P1465LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1465LCounter != sharedCounter;
            localIp65504P1465LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1465_L_LEN = 2;
  	/**
	 * serializeIp65504P1465L
	 */
	protected void serializeIp65504P1465L(short ip65504P1465L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1465L,IP_65504_P_1465_L_LEN)
                  ,beginIp65504P1465L
                  ,IP_65504_P_1465_L_LEN
                 );
            localIp65504P1465LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1465LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1465L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1465L() {	 
			return (getShort(beginIp65504P1465L));
   	}
         int localIp65504P1466SCounter = -1;
         public boolean isIp65504P1466SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1466SCounter != sharedCounter;
            localIp65504P1466SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1466_S_LEN = 2;
  	/**
	 * serializeIp65504P1466S
	 */
	protected void serializeIp65504P1466S(short ip65504P1466S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1466S,IP_65504_P_1466_S_LEN)
                  ,beginIp65504P1466S
                  ,IP_65504_P_1466_S_LEN
                 );
            localIp65504P1466SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1466SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1466S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1466S() {	 
			return (getShort(beginIp65504P1466S));
   	}
         int localIp65504P1466LCounter = -1;
         public boolean isIp65504P1466LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1466LCounter != sharedCounter;
            localIp65504P1466LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1466_L_LEN = 2;
  	/**
	 * serializeIp65504P1466L
	 */
	protected void serializeIp65504P1466L(short ip65504P1466L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1466L,IP_65504_P_1466_L_LEN)
                  ,beginIp65504P1466L
                  ,IP_65504_P_1466_L_LEN
                 );
            localIp65504P1466LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1466LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1466L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1466L() {	 
			return (getShort(beginIp65504P1466L));
   	}
         int localIp65504P1467SCounter = -1;
         public boolean isIp65504P1467SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1467SCounter != sharedCounter;
            localIp65504P1467SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1467_S_LEN = 2;
  	/**
	 * serializeIp65504P1467S
	 */
	protected void serializeIp65504P1467S(short ip65504P1467S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1467S,IP_65504_P_1467_S_LEN)
                  ,beginIp65504P1467S
                  ,IP_65504_P_1467_S_LEN
                 );
            localIp65504P1467SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1467SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1467S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1467S() {	 
			return (getShort(beginIp65504P1467S));
   	}
         int localIp65504P1467LCounter = -1;
         public boolean isIp65504P1467LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1467LCounter != sharedCounter;
            localIp65504P1467LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1467_L_LEN = 2;
  	/**
	 * serializeIp65504P1467L
	 */
	protected void serializeIp65504P1467L(short ip65504P1467L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1467L,IP_65504_P_1467_L_LEN)
                  ,beginIp65504P1467L
                  ,IP_65504_P_1467_L_LEN
                 );
            localIp65504P1467LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1467LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1467L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1467L() {	 
			return (getShort(beginIp65504P1467L));
   	}
         int localIp65504P1468SCounter = -1;
         public boolean isIp65504P1468SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1468SCounter != sharedCounter;
            localIp65504P1468SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1468_S_LEN = 2;
  	/**
	 * serializeIp65504P1468S
	 */
	protected void serializeIp65504P1468S(short ip65504P1468S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1468S,IP_65504_P_1468_S_LEN)
                  ,beginIp65504P1468S
                  ,IP_65504_P_1468_S_LEN
                 );
            localIp65504P1468SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1468SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1468S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1468S() {	 
			return (getShort(beginIp65504P1468S));
   	}
         int localIp65504P1468LCounter = -1;
         public boolean isIp65504P1468LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1468LCounter != sharedCounter;
            localIp65504P1468LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1468_L_LEN = 2;
  	/**
	 * serializeIp65504P1468L
	 */
	protected void serializeIp65504P1468L(short ip65504P1468L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1468L,IP_65504_P_1468_L_LEN)
                  ,beginIp65504P1468L
                  ,IP_65504_P_1468_L_LEN
                 );
            localIp65504P1468LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1468LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1468L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1468L() {	 
			return (getShort(beginIp65504P1468L));
   	}
         int localIp65504P1469SCounter = -1;
         public boolean isIp65504P1469SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1469SCounter != sharedCounter;
            localIp65504P1469SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1469_S_LEN = 2;
  	/**
	 * serializeIp65504P1469S
	 */
	protected void serializeIp65504P1469S(short ip65504P1469S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1469S,IP_65504_P_1469_S_LEN)
                  ,beginIp65504P1469S
                  ,IP_65504_P_1469_S_LEN
                 );
            localIp65504P1469SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1469SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1469S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1469S() {	 
			return (getShort(beginIp65504P1469S));
   	}
         int localIp65504P1469LCounter = -1;
         public boolean isIp65504P1469LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1469LCounter != sharedCounter;
            localIp65504P1469LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1469_L_LEN = 2;
  	/**
	 * serializeIp65504P1469L
	 */
	protected void serializeIp65504P1469L(short ip65504P1469L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1469L,IP_65504_P_1469_L_LEN)
                  ,beginIp65504P1469L
                  ,IP_65504_P_1469_L_LEN
                 );
            localIp65504P1469LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1469LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1469L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1469L() {	 
			return (getShort(beginIp65504P1469L));
   	}
         int localIp65504P1470SCounter = -1;
         public boolean isIp65504P1470SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1470SCounter != sharedCounter;
            localIp65504P1470SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1470_S_LEN = 2;
  	/**
	 * serializeIp65504P1470S
	 */
	protected void serializeIp65504P1470S(short ip65504P1470S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1470S,IP_65504_P_1470_S_LEN)
                  ,beginIp65504P1470S
                  ,IP_65504_P_1470_S_LEN
                 );
            localIp65504P1470SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1470SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1470S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1470S() {	 
			return (getShort(beginIp65504P1470S));
   	}
         int localIp65504P1470LCounter = -1;
         public boolean isIp65504P1470LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1470LCounter != sharedCounter;
            localIp65504P1470LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1470_L_LEN = 2;
  	/**
	 * serializeIp65504P1470L
	 */
	protected void serializeIp65504P1470L(short ip65504P1470L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1470L,IP_65504_P_1470_L_LEN)
                  ,beginIp65504P1470L
                  ,IP_65504_P_1470_L_LEN
                 );
            localIp65504P1470LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1470LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1470L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1470L() {	 
			return (getShort(beginIp65504P1470L));
   	}
         int localIp65504P1471SCounter = -1;
         public boolean isIp65504P1471SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1471SCounter != sharedCounter;
            localIp65504P1471SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1471_S_LEN = 2;
  	/**
	 * serializeIp65504P1471S
	 */
	protected void serializeIp65504P1471S(short ip65504P1471S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1471S,IP_65504_P_1471_S_LEN)
                  ,beginIp65504P1471S
                  ,IP_65504_P_1471_S_LEN
                 );
            localIp65504P1471SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1471SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1471S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1471S() {	 
			return (getShort(beginIp65504P1471S));
   	}
         int localIp65504P1471LCounter = -1;
         public boolean isIp65504P1471LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1471LCounter != sharedCounter;
            localIp65504P1471LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1471_L_LEN = 2;
  	/**
	 * serializeIp65504P1471L
	 */
	protected void serializeIp65504P1471L(short ip65504P1471L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1471L,IP_65504_P_1471_L_LEN)
                  ,beginIp65504P1471L
                  ,IP_65504_P_1471_L_LEN
                 );
            localIp65504P1471LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1471LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1471L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1471L() {	 
			return (getShort(beginIp65504P1471L));
   	}
         int localIp65504P1472SCounter = -1;
         public boolean isIp65504P1472SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1472SCounter != sharedCounter;
            localIp65504P1472SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1472_S_LEN = 2;
  	/**
	 * serializeIp65504P1472S
	 */
	protected void serializeIp65504P1472S(short ip65504P1472S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1472S,IP_65504_P_1472_S_LEN)
                  ,beginIp65504P1472S
                  ,IP_65504_P_1472_S_LEN
                 );
            localIp65504P1472SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1472SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1472S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1472S() {	 
			return (getShort(beginIp65504P1472S));
   	}
         int localIp65504P1472LCounter = -1;
         public boolean isIp65504P1472LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1472LCounter != sharedCounter;
            localIp65504P1472LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1472_L_LEN = 2;
  	/**
	 * serializeIp65504P1472L
	 */
	protected void serializeIp65504P1472L(short ip65504P1472L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1472L,IP_65504_P_1472_L_LEN)
                  ,beginIp65504P1472L
                  ,IP_65504_P_1472_L_LEN
                 );
            localIp65504P1472LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1472LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1472L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1472L() {	 
			return (getShort(beginIp65504P1472L));
   	}
         int localIp65504P1473SCounter = -1;
         public boolean isIp65504P1473SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1473SCounter != sharedCounter;
            localIp65504P1473SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1473_S_LEN = 2;
  	/**
	 * serializeIp65504P1473S
	 */
	protected void serializeIp65504P1473S(short ip65504P1473S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1473S,IP_65504_P_1473_S_LEN)
                  ,beginIp65504P1473S
                  ,IP_65504_P_1473_S_LEN
                 );
            localIp65504P1473SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1473SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1473S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1473S() {	 
			return (getShort(beginIp65504P1473S));
   	}
         int localIp65504P1473LCounter = -1;
         public boolean isIp65504P1473LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1473LCounter != sharedCounter;
            localIp65504P1473LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1473_L_LEN = 2;
  	/**
	 * serializeIp65504P1473L
	 */
	protected void serializeIp65504P1473L(short ip65504P1473L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1473L,IP_65504_P_1473_L_LEN)
                  ,beginIp65504P1473L
                  ,IP_65504_P_1473_L_LEN
                 );
            localIp65504P1473LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1473LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1473L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1473L() {	 
			return (getShort(beginIp65504P1473L));
   	}
         int localIp65504P1474SCounter = -1;
         public boolean isIp65504P1474SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1474SCounter != sharedCounter;
            localIp65504P1474SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1474_S_LEN = 2;
  	/**
	 * serializeIp65504P1474S
	 */
	protected void serializeIp65504P1474S(short ip65504P1474S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1474S,IP_65504_P_1474_S_LEN)
                  ,beginIp65504P1474S
                  ,IP_65504_P_1474_S_LEN
                 );
            localIp65504P1474SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1474SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1474S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1474S() {	 
			return (getShort(beginIp65504P1474S));
   	}
         int localIp65504P1474LCounter = -1;
         public boolean isIp65504P1474LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1474LCounter != sharedCounter;
            localIp65504P1474LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1474_L_LEN = 2;
  	/**
	 * serializeIp65504P1474L
	 */
	protected void serializeIp65504P1474L(short ip65504P1474L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1474L,IP_65504_P_1474_L_LEN)
                  ,beginIp65504P1474L
                  ,IP_65504_P_1474_L_LEN
                 );
            localIp65504P1474LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1474LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1474L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1474L() {	 
			return (getShort(beginIp65504P1474L));
   	}
         int localIp65504P1475SCounter = -1;
         public boolean isIp65504P1475SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1475SCounter != sharedCounter;
            localIp65504P1475SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1475_S_LEN = 2;
  	/**
	 * serializeIp65504P1475S
	 */
	protected void serializeIp65504P1475S(short ip65504P1475S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1475S,IP_65504_P_1475_S_LEN)
                  ,beginIp65504P1475S
                  ,IP_65504_P_1475_S_LEN
                 );
            localIp65504P1475SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1475SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1475S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1475S() {	 
			return (getShort(beginIp65504P1475S));
   	}
         int localIp65504P1475LCounter = -1;
         public boolean isIp65504P1475LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1475LCounter != sharedCounter;
            localIp65504P1475LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1475_L_LEN = 2;
  	/**
	 * serializeIp65504P1475L
	 */
	protected void serializeIp65504P1475L(short ip65504P1475L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1475L,IP_65504_P_1475_L_LEN)
                  ,beginIp65504P1475L
                  ,IP_65504_P_1475_L_LEN
                 );
            localIp65504P1475LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1475LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1475L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1475L() {	 
			return (getShort(beginIp65504P1475L));
   	}
         int localIp65504P1476SCounter = -1;
         public boolean isIp65504P1476SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1476SCounter != sharedCounter;
            localIp65504P1476SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1476_S_LEN = 2;
  	/**
	 * serializeIp65504P1476S
	 */
	protected void serializeIp65504P1476S(short ip65504P1476S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1476S,IP_65504_P_1476_S_LEN)
                  ,beginIp65504P1476S
                  ,IP_65504_P_1476_S_LEN
                 );
            localIp65504P1476SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1476SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1476S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1476S() {	 
			return (getShort(beginIp65504P1476S));
   	}
         int localIp65504P1476LCounter = -1;
         public boolean isIp65504P1476LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1476LCounter != sharedCounter;
            localIp65504P1476LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1476_L_LEN = 2;
  	/**
	 * serializeIp65504P1476L
	 */
	protected void serializeIp65504P1476L(short ip65504P1476L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1476L,IP_65504_P_1476_L_LEN)
                  ,beginIp65504P1476L
                  ,IP_65504_P_1476_L_LEN
                 );
            localIp65504P1476LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1476LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1476L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1476L() {	 
			return (getShort(beginIp65504P1476L));
   	}
         int localIp65504P1477SCounter = -1;
         public boolean isIp65504P1477SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1477SCounter != sharedCounter;
            localIp65504P1477SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1477_S_LEN = 2;
  	/**
	 * serializeIp65504P1477S
	 */
	protected void serializeIp65504P1477S(short ip65504P1477S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1477S,IP_65504_P_1477_S_LEN)
                  ,beginIp65504P1477S
                  ,IP_65504_P_1477_S_LEN
                 );
            localIp65504P1477SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1477SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1477S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1477S() {	 
			return (getShort(beginIp65504P1477S));
   	}
         int localIp65504P1477LCounter = -1;
         public boolean isIp65504P1477LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1477LCounter != sharedCounter;
            localIp65504P1477LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1477_L_LEN = 2;
  	/**
	 * serializeIp65504P1477L
	 */
	protected void serializeIp65504P1477L(short ip65504P1477L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1477L,IP_65504_P_1477_L_LEN)
                  ,beginIp65504P1477L
                  ,IP_65504_P_1477_L_LEN
                 );
            localIp65504P1477LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1477LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1477L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1477L() {	 
			return (getShort(beginIp65504P1477L));
   	}
         int localIp65504P1478SCounter = -1;
         public boolean isIp65504P1478SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1478SCounter != sharedCounter;
            localIp65504P1478SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1478_S_LEN = 2;
  	/**
	 * serializeIp65504P1478S
	 */
	protected void serializeIp65504P1478S(short ip65504P1478S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1478S,IP_65504_P_1478_S_LEN)
                  ,beginIp65504P1478S
                  ,IP_65504_P_1478_S_LEN
                 );
            localIp65504P1478SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1478SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1478S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1478S() {	 
			return (getShort(beginIp65504P1478S));
   	}
         int localIp65504P1478LCounter = -1;
         public boolean isIp65504P1478LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1478LCounter != sharedCounter;
            localIp65504P1478LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1478_L_LEN = 2;
  	/**
	 * serializeIp65504P1478L
	 */
	protected void serializeIp65504P1478L(short ip65504P1478L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1478L,IP_65504_P_1478_L_LEN)
                  ,beginIp65504P1478L
                  ,IP_65504_P_1478_L_LEN
                 );
            localIp65504P1478LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1478LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1478L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1478L() {	 
			return (getShort(beginIp65504P1478L));
   	}
         int localIp65504P1479SCounter = -1;
         public boolean isIp65504P1479SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1479SCounter != sharedCounter;
            localIp65504P1479SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1479_S_LEN = 2;
  	/**
	 * serializeIp65504P1479S
	 */
	protected void serializeIp65504P1479S(short ip65504P1479S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1479S,IP_65504_P_1479_S_LEN)
                  ,beginIp65504P1479S
                  ,IP_65504_P_1479_S_LEN
                 );
            localIp65504P1479SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1479SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1479S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1479S() {	 
			return (getShort(beginIp65504P1479S));
   	}
         int localIp65504P1479LCounter = -1;
         public boolean isIp65504P1479LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1479LCounter != sharedCounter;
            localIp65504P1479LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1479_L_LEN = 2;
  	/**
	 * serializeIp65504P1479L
	 */
	protected void serializeIp65504P1479L(short ip65504P1479L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1479L,IP_65504_P_1479_L_LEN)
                  ,beginIp65504P1479L
                  ,IP_65504_P_1479_L_LEN
                 );
            localIp65504P1479LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1479LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1479L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1479L() {	 
			return (getShort(beginIp65504P1479L));
   	}
         int localIp65504P1480SCounter = -1;
         public boolean isIp65504P1480SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1480SCounter != sharedCounter;
            localIp65504P1480SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1480_S_LEN = 2;
  	/**
	 * serializeIp65504P1480S
	 */
	protected void serializeIp65504P1480S(short ip65504P1480S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1480S,IP_65504_P_1480_S_LEN)
                  ,beginIp65504P1480S
                  ,IP_65504_P_1480_S_LEN
                 );
            localIp65504P1480SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1480SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1480S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1480S() {	 
			return (getShort(beginIp65504P1480S));
   	}
         int localIp65504P1480LCounter = -1;
         public boolean isIp65504P1480LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1480LCounter != sharedCounter;
            localIp65504P1480LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1480_L_LEN = 2;
  	/**
	 * serializeIp65504P1480L
	 */
	protected void serializeIp65504P1480L(short ip65504P1480L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1480L,IP_65504_P_1480_L_LEN)
                  ,beginIp65504P1480L
                  ,IP_65504_P_1480_L_LEN
                 );
            localIp65504P1480LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1480LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1480L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1480L() {	 
			return (getShort(beginIp65504P1480L));
   	}
         int localIp65504P1481SCounter = -1;
         public boolean isIp65504P1481SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1481SCounter != sharedCounter;
            localIp65504P1481SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1481_S_LEN = 2;
  	/**
	 * serializeIp65504P1481S
	 */
	protected void serializeIp65504P1481S(short ip65504P1481S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1481S,IP_65504_P_1481_S_LEN)
                  ,beginIp65504P1481S
                  ,IP_65504_P_1481_S_LEN
                 );
            localIp65504P1481SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1481SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1481S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1481S() {	 
			return (getShort(beginIp65504P1481S));
   	}
         int localIp65504P1481LCounter = -1;
         public boolean isIp65504P1481LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1481LCounter != sharedCounter;
            localIp65504P1481LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1481_L_LEN = 2;
  	/**
	 * serializeIp65504P1481L
	 */
	protected void serializeIp65504P1481L(short ip65504P1481L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1481L,IP_65504_P_1481_L_LEN)
                  ,beginIp65504P1481L
                  ,IP_65504_P_1481_L_LEN
                 );
            localIp65504P1481LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1481LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1481L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1481L() {	 
			return (getShort(beginIp65504P1481L));
   	}
         int localIp65504P1482SCounter = -1;
         public boolean isIp65504P1482SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1482SCounter != sharedCounter;
            localIp65504P1482SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1482_S_LEN = 2;
  	/**
	 * serializeIp65504P1482S
	 */
	protected void serializeIp65504P1482S(short ip65504P1482S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1482S,IP_65504_P_1482_S_LEN)
                  ,beginIp65504P1482S
                  ,IP_65504_P_1482_S_LEN
                 );
            localIp65504P1482SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1482SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1482S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1482S() {	 
			return (getShort(beginIp65504P1482S));
   	}
         int localIp65504P1482LCounter = -1;
         public boolean isIp65504P1482LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1482LCounter != sharedCounter;
            localIp65504P1482LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1482_L_LEN = 2;
  	/**
	 * serializeIp65504P1482L
	 */
	protected void serializeIp65504P1482L(short ip65504P1482L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1482L,IP_65504_P_1482_L_LEN)
                  ,beginIp65504P1482L
                  ,IP_65504_P_1482_L_LEN
                 );
            localIp65504P1482LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1482LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1482L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1482L() {	 
			return (getShort(beginIp65504P1482L));
   	}
         int localIp65504P1483SCounter = -1;
         public boolean isIp65504P1483SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1483SCounter != sharedCounter;
            localIp65504P1483SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1483_S_LEN = 2;
  	/**
	 * serializeIp65504P1483S
	 */
	protected void serializeIp65504P1483S(short ip65504P1483S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1483S,IP_65504_P_1483_S_LEN)
                  ,beginIp65504P1483S
                  ,IP_65504_P_1483_S_LEN
                 );
            localIp65504P1483SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1483SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1483S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1483S() {	 
			return (getShort(beginIp65504P1483S));
   	}
         int localIp65504P1483LCounter = -1;
         public boolean isIp65504P1483LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1483LCounter != sharedCounter;
            localIp65504P1483LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1483_L_LEN = 2;
  	/**
	 * serializeIp65504P1483L
	 */
	protected void serializeIp65504P1483L(short ip65504P1483L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1483L,IP_65504_P_1483_L_LEN)
                  ,beginIp65504P1483L
                  ,IP_65504_P_1483_L_LEN
                 );
            localIp65504P1483LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1483LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1483L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1483L() {	 
			return (getShort(beginIp65504P1483L));
   	}
         int localIp65504P1484SCounter = -1;
         public boolean isIp65504P1484SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1484SCounter != sharedCounter;
            localIp65504P1484SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1484_S_LEN = 2;
  	/**
	 * serializeIp65504P1484S
	 */
	protected void serializeIp65504P1484S(short ip65504P1484S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1484S,IP_65504_P_1484_S_LEN)
                  ,beginIp65504P1484S
                  ,IP_65504_P_1484_S_LEN
                 );
            localIp65504P1484SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1484SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1484S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1484S() {	 
			return (getShort(beginIp65504P1484S));
   	}
         int localIp65504P1484LCounter = -1;
         public boolean isIp65504P1484LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1484LCounter != sharedCounter;
            localIp65504P1484LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1484_L_LEN = 2;
  	/**
	 * serializeIp65504P1484L
	 */
	protected void serializeIp65504P1484L(short ip65504P1484L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1484L,IP_65504_P_1484_L_LEN)
                  ,beginIp65504P1484L
                  ,IP_65504_P_1484_L_LEN
                 );
            localIp65504P1484LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1484LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1484L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1484L() {	 
			return (getShort(beginIp65504P1484L));
   	}
         int localIp65504P1485SCounter = -1;
         public boolean isIp65504P1485SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1485SCounter != sharedCounter;
            localIp65504P1485SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1485_S_LEN = 2;
  	/**
	 * serializeIp65504P1485S
	 */
	protected void serializeIp65504P1485S(short ip65504P1485S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1485S,IP_65504_P_1485_S_LEN)
                  ,beginIp65504P1485S
                  ,IP_65504_P_1485_S_LEN
                 );
            localIp65504P1485SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1485SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1485S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1485S() {	 
			return (getShort(beginIp65504P1485S));
   	}
         int localIp65504P1485LCounter = -1;
         public boolean isIp65504P1485LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1485LCounter != sharedCounter;
            localIp65504P1485LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1485_L_LEN = 2;
  	/**
	 * serializeIp65504P1485L
	 */
	protected void serializeIp65504P1485L(short ip65504P1485L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1485L,IP_65504_P_1485_L_LEN)
                  ,beginIp65504P1485L
                  ,IP_65504_P_1485_L_LEN
                 );
            localIp65504P1485LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1485LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1485L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1485L() {	 
			return (getShort(beginIp65504P1485L));
   	}
         int localIp65504P1486SCounter = -1;
         public boolean isIp65504P1486SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1486SCounter != sharedCounter;
            localIp65504P1486SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1486_S_LEN = 2;
  	/**
	 * serializeIp65504P1486S
	 */
	protected void serializeIp65504P1486S(short ip65504P1486S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1486S,IP_65504_P_1486_S_LEN)
                  ,beginIp65504P1486S
                  ,IP_65504_P_1486_S_LEN
                 );
            localIp65504P1486SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1486SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1486S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1486S() {	 
			return (getShort(beginIp65504P1486S));
   	}
         int localIp65504P1486LCounter = -1;
         public boolean isIp65504P1486LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1486LCounter != sharedCounter;
            localIp65504P1486LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1486_L_LEN = 2;
  	/**
	 * serializeIp65504P1486L
	 */
	protected void serializeIp65504P1486L(short ip65504P1486L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1486L,IP_65504_P_1486_L_LEN)
                  ,beginIp65504P1486L
                  ,IP_65504_P_1486_L_LEN
                 );
            localIp65504P1486LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1486LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1486L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1486L() {	 
			return (getShort(beginIp65504P1486L));
   	}
         int localIp65504P1487SCounter = -1;
         public boolean isIp65504P1487SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1487SCounter != sharedCounter;
            localIp65504P1487SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1487_S_LEN = 2;
  	/**
	 * serializeIp65504P1487S
	 */
	protected void serializeIp65504P1487S(short ip65504P1487S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1487S,IP_65504_P_1487_S_LEN)
                  ,beginIp65504P1487S
                  ,IP_65504_P_1487_S_LEN
                 );
            localIp65504P1487SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1487SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1487S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1487S() {	 
			return (getShort(beginIp65504P1487S));
   	}
         int localIp65504P1487LCounter = -1;
         public boolean isIp65504P1487LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1487LCounter != sharedCounter;
            localIp65504P1487LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1487_L_LEN = 2;
  	/**
	 * serializeIp65504P1487L
	 */
	protected void serializeIp65504P1487L(short ip65504P1487L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1487L,IP_65504_P_1487_L_LEN)
                  ,beginIp65504P1487L
                  ,IP_65504_P_1487_L_LEN
                 );
            localIp65504P1487LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1487LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1487L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1487L() {	 
			return (getShort(beginIp65504P1487L));
   	}
         int localIp65504P1488SCounter = -1;
         public boolean isIp65504P1488SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1488SCounter != sharedCounter;
            localIp65504P1488SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1488_S_LEN = 2;
  	/**
	 * serializeIp65504P1488S
	 */
	protected void serializeIp65504P1488S(short ip65504P1488S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1488S,IP_65504_P_1488_S_LEN)
                  ,beginIp65504P1488S
                  ,IP_65504_P_1488_S_LEN
                 );
            localIp65504P1488SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1488SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1488S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1488S() {	 
			return (getShort(beginIp65504P1488S));
   	}
         int localIp65504P1488LCounter = -1;
         public boolean isIp65504P1488LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1488LCounter != sharedCounter;
            localIp65504P1488LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1488_L_LEN = 2;
  	/**
	 * serializeIp65504P1488L
	 */
	protected void serializeIp65504P1488L(short ip65504P1488L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1488L,IP_65504_P_1488_L_LEN)
                  ,beginIp65504P1488L
                  ,IP_65504_P_1488_L_LEN
                 );
            localIp65504P1488LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1488LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1488L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1488L() {	 
			return (getShort(beginIp65504P1488L));
   	}




}
  
