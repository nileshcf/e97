package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup51Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup51Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup51Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_51_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1551S;
            protected  int beginIp65504P1551L;
            protected  int beginIp65504P1552S;
            protected  int beginIp65504P1552L;
            protected  int beginIp65504P1553S;
            protected  int beginIp65504P1553L;
            protected  int beginIp65504P1554S;
            protected  int beginIp65504P1554L;
            protected  int beginIp65504P1555S;
            protected  int beginIp65504P1555L;
            protected  int beginIp65504P1556S;
            protected  int beginIp65504P1556L;
            protected  int beginIp65504P1557S;
            protected  int beginIp65504P1557L;
            protected  int beginIp65504P1558S;
            protected  int beginIp65504P1558L;
            protected  int beginIp65504P1559S;
            protected  int beginIp65504P1559L;
            protected  int beginIp65504P1560S;
            protected  int beginIp65504P1560L;
            protected  int beginIp65504P1561S;
            protected  int beginIp65504P1561L;
            protected  int beginIp65504P1562S;
            protected  int beginIp65504P1562L;
            protected  int beginIp65504P1563S;
            protected  int beginIp65504P1563L;
            protected  int beginIp65504P1564S;
            protected  int beginIp65504P1564L;
            protected  int beginIp65504P1565S;
            protected  int beginIp65504P1565L;
            protected  int beginIp65504P1566S;
            protected  int beginIp65504P1566L;
            protected  int beginIp65504P1567S;
            protected  int beginIp65504P1567L;
            protected  int beginIp65504P1568S;
            protected  int beginIp65504P1568L;
            protected  int beginIp65504P1569S;
            protected  int beginIp65504P1569L;
            protected  int beginIp65504P1570S;
            protected  int beginIp65504P1570L;
            protected  int beginIp65504P1571S;
            protected  int beginIp65504P1571L;
            protected  int beginIp65504P1572S;
            protected  int beginIp65504P1572L;
            protected  int beginIp65504P1573S;
            protected  int beginIp65504P1573L;
            protected  int beginIp65504P1574S;
            protected  int beginIp65504P1574L;
            protected  int beginIp65504P1575S;
            protected  int beginIp65504P1575L;
            protected  int beginIp65504P1576S;
            protected  int beginIp65504P1576L;
            protected  int beginIp65504P1577S;
            protected  int beginIp65504P1577L;
            protected  int beginIp65504P1578S;
            protected  int beginIp65504P1578L;
            protected  int beginIp65504P1579S;
            protected  int beginIp65504P1579L;
            protected  int beginIp65504P1580S;
            protected  int beginIp65504P1580L;
            protected  int beginIp65504P1581S;
            protected  int beginIp65504P1581L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup51Serialized
	**/
    public Ip65504PdsNamesLargeGroup51Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup51Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup51Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup51Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12396); // serialize this field at offset 12396 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup51Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12396 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup51Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_51_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1551S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1551L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1552S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1552L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1553S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1553L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1554S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1554L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1555S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1555L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1556S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1556L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1557S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1557L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1558S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1558L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1559S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1559L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1560S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1560L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1561S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1561L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1562S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1562L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1563S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1563L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1564S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1564L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1565S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1565L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1566S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1566L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1567S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1567L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1568S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1568L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1569S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1569L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1570S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1570L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1571S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1571L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1572S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1572L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1573S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1573L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1574S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1574L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1575S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1575L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1576S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1576L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1577S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1577L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1578S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1578L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1579S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1579L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1580S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1580L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1581S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1581L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1551SCounter = -1;
         public boolean isIp65504P1551SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1551SCounter != sharedCounter;
            localIp65504P1551SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1551_S_LEN = 2;
  	/**
	 * serializeIp65504P1551S
	 */
	protected void serializeIp65504P1551S(short ip65504P1551S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1551S,IP_65504_P_1551_S_LEN)
                  ,beginIp65504P1551S
                  ,IP_65504_P_1551_S_LEN
                 );
            localIp65504P1551SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1551SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1551S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1551S() {	 
			return (getShort(beginIp65504P1551S));
   	}
         int localIp65504P1551LCounter = -1;
         public boolean isIp65504P1551LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1551LCounter != sharedCounter;
            localIp65504P1551LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1551_L_LEN = 2;
  	/**
	 * serializeIp65504P1551L
	 */
	protected void serializeIp65504P1551L(short ip65504P1551L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1551L,IP_65504_P_1551_L_LEN)
                  ,beginIp65504P1551L
                  ,IP_65504_P_1551_L_LEN
                 );
            localIp65504P1551LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1551LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1551L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1551L() {	 
			return (getShort(beginIp65504P1551L));
   	}
         int localIp65504P1552SCounter = -1;
         public boolean isIp65504P1552SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1552SCounter != sharedCounter;
            localIp65504P1552SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1552_S_LEN = 2;
  	/**
	 * serializeIp65504P1552S
	 */
	protected void serializeIp65504P1552S(short ip65504P1552S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1552S,IP_65504_P_1552_S_LEN)
                  ,beginIp65504P1552S
                  ,IP_65504_P_1552_S_LEN
                 );
            localIp65504P1552SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1552SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1552S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1552S() {	 
			return (getShort(beginIp65504P1552S));
   	}
         int localIp65504P1552LCounter = -1;
         public boolean isIp65504P1552LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1552LCounter != sharedCounter;
            localIp65504P1552LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1552_L_LEN = 2;
  	/**
	 * serializeIp65504P1552L
	 */
	protected void serializeIp65504P1552L(short ip65504P1552L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1552L,IP_65504_P_1552_L_LEN)
                  ,beginIp65504P1552L
                  ,IP_65504_P_1552_L_LEN
                 );
            localIp65504P1552LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1552LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1552L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1552L() {	 
			return (getShort(beginIp65504P1552L));
   	}
         int localIp65504P1553SCounter = -1;
         public boolean isIp65504P1553SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1553SCounter != sharedCounter;
            localIp65504P1553SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1553_S_LEN = 2;
  	/**
	 * serializeIp65504P1553S
	 */
	protected void serializeIp65504P1553S(short ip65504P1553S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1553S,IP_65504_P_1553_S_LEN)
                  ,beginIp65504P1553S
                  ,IP_65504_P_1553_S_LEN
                 );
            localIp65504P1553SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1553SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1553S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1553S() {	 
			return (getShort(beginIp65504P1553S));
   	}
         int localIp65504P1553LCounter = -1;
         public boolean isIp65504P1553LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1553LCounter != sharedCounter;
            localIp65504P1553LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1553_L_LEN = 2;
  	/**
	 * serializeIp65504P1553L
	 */
	protected void serializeIp65504P1553L(short ip65504P1553L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1553L,IP_65504_P_1553_L_LEN)
                  ,beginIp65504P1553L
                  ,IP_65504_P_1553_L_LEN
                 );
            localIp65504P1553LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1553LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1553L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1553L() {	 
			return (getShort(beginIp65504P1553L));
   	}
         int localIp65504P1554SCounter = -1;
         public boolean isIp65504P1554SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1554SCounter != sharedCounter;
            localIp65504P1554SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1554_S_LEN = 2;
  	/**
	 * serializeIp65504P1554S
	 */
	protected void serializeIp65504P1554S(short ip65504P1554S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1554S,IP_65504_P_1554_S_LEN)
                  ,beginIp65504P1554S
                  ,IP_65504_P_1554_S_LEN
                 );
            localIp65504P1554SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1554SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1554S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1554S() {	 
			return (getShort(beginIp65504P1554S));
   	}
         int localIp65504P1554LCounter = -1;
         public boolean isIp65504P1554LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1554LCounter != sharedCounter;
            localIp65504P1554LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1554_L_LEN = 2;
  	/**
	 * serializeIp65504P1554L
	 */
	protected void serializeIp65504P1554L(short ip65504P1554L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1554L,IP_65504_P_1554_L_LEN)
                  ,beginIp65504P1554L
                  ,IP_65504_P_1554_L_LEN
                 );
            localIp65504P1554LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1554LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1554L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1554L() {	 
			return (getShort(beginIp65504P1554L));
   	}
         int localIp65504P1555SCounter = -1;
         public boolean isIp65504P1555SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1555SCounter != sharedCounter;
            localIp65504P1555SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1555_S_LEN = 2;
  	/**
	 * serializeIp65504P1555S
	 */
	protected void serializeIp65504P1555S(short ip65504P1555S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1555S,IP_65504_P_1555_S_LEN)
                  ,beginIp65504P1555S
                  ,IP_65504_P_1555_S_LEN
                 );
            localIp65504P1555SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1555SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1555S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1555S() {	 
			return (getShort(beginIp65504P1555S));
   	}
         int localIp65504P1555LCounter = -1;
         public boolean isIp65504P1555LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1555LCounter != sharedCounter;
            localIp65504P1555LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1555_L_LEN = 2;
  	/**
	 * serializeIp65504P1555L
	 */
	protected void serializeIp65504P1555L(short ip65504P1555L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1555L,IP_65504_P_1555_L_LEN)
                  ,beginIp65504P1555L
                  ,IP_65504_P_1555_L_LEN
                 );
            localIp65504P1555LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1555LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1555L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1555L() {	 
			return (getShort(beginIp65504P1555L));
   	}
         int localIp65504P1556SCounter = -1;
         public boolean isIp65504P1556SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1556SCounter != sharedCounter;
            localIp65504P1556SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1556_S_LEN = 2;
  	/**
	 * serializeIp65504P1556S
	 */
	protected void serializeIp65504P1556S(short ip65504P1556S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1556S,IP_65504_P_1556_S_LEN)
                  ,beginIp65504P1556S
                  ,IP_65504_P_1556_S_LEN
                 );
            localIp65504P1556SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1556SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1556S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1556S() {	 
			return (getShort(beginIp65504P1556S));
   	}
         int localIp65504P1556LCounter = -1;
         public boolean isIp65504P1556LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1556LCounter != sharedCounter;
            localIp65504P1556LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1556_L_LEN = 2;
  	/**
	 * serializeIp65504P1556L
	 */
	protected void serializeIp65504P1556L(short ip65504P1556L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1556L,IP_65504_P_1556_L_LEN)
                  ,beginIp65504P1556L
                  ,IP_65504_P_1556_L_LEN
                 );
            localIp65504P1556LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1556LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1556L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1556L() {	 
			return (getShort(beginIp65504P1556L));
   	}
         int localIp65504P1557SCounter = -1;
         public boolean isIp65504P1557SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1557SCounter != sharedCounter;
            localIp65504P1557SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1557_S_LEN = 2;
  	/**
	 * serializeIp65504P1557S
	 */
	protected void serializeIp65504P1557S(short ip65504P1557S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1557S,IP_65504_P_1557_S_LEN)
                  ,beginIp65504P1557S
                  ,IP_65504_P_1557_S_LEN
                 );
            localIp65504P1557SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1557SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1557S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1557S() {	 
			return (getShort(beginIp65504P1557S));
   	}
         int localIp65504P1557LCounter = -1;
         public boolean isIp65504P1557LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1557LCounter != sharedCounter;
            localIp65504P1557LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1557_L_LEN = 2;
  	/**
	 * serializeIp65504P1557L
	 */
	protected void serializeIp65504P1557L(short ip65504P1557L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1557L,IP_65504_P_1557_L_LEN)
                  ,beginIp65504P1557L
                  ,IP_65504_P_1557_L_LEN
                 );
            localIp65504P1557LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1557LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1557L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1557L() {	 
			return (getShort(beginIp65504P1557L));
   	}
         int localIp65504P1558SCounter = -1;
         public boolean isIp65504P1558SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1558SCounter != sharedCounter;
            localIp65504P1558SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1558_S_LEN = 2;
  	/**
	 * serializeIp65504P1558S
	 */
	protected void serializeIp65504P1558S(short ip65504P1558S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1558S,IP_65504_P_1558_S_LEN)
                  ,beginIp65504P1558S
                  ,IP_65504_P_1558_S_LEN
                 );
            localIp65504P1558SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1558SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1558S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1558S() {	 
			return (getShort(beginIp65504P1558S));
   	}
         int localIp65504P1558LCounter = -1;
         public boolean isIp65504P1558LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1558LCounter != sharedCounter;
            localIp65504P1558LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1558_L_LEN = 2;
  	/**
	 * serializeIp65504P1558L
	 */
	protected void serializeIp65504P1558L(short ip65504P1558L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1558L,IP_65504_P_1558_L_LEN)
                  ,beginIp65504P1558L
                  ,IP_65504_P_1558_L_LEN
                 );
            localIp65504P1558LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1558LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1558L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1558L() {	 
			return (getShort(beginIp65504P1558L));
   	}
         int localIp65504P1559SCounter = -1;
         public boolean isIp65504P1559SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1559SCounter != sharedCounter;
            localIp65504P1559SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1559_S_LEN = 2;
  	/**
	 * serializeIp65504P1559S
	 */
	protected void serializeIp65504P1559S(short ip65504P1559S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1559S,IP_65504_P_1559_S_LEN)
                  ,beginIp65504P1559S
                  ,IP_65504_P_1559_S_LEN
                 );
            localIp65504P1559SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1559SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1559S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1559S() {	 
			return (getShort(beginIp65504P1559S));
   	}
         int localIp65504P1559LCounter = -1;
         public boolean isIp65504P1559LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1559LCounter != sharedCounter;
            localIp65504P1559LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1559_L_LEN = 2;
  	/**
	 * serializeIp65504P1559L
	 */
	protected void serializeIp65504P1559L(short ip65504P1559L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1559L,IP_65504_P_1559_L_LEN)
                  ,beginIp65504P1559L
                  ,IP_65504_P_1559_L_LEN
                 );
            localIp65504P1559LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1559LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1559L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1559L() {	 
			return (getShort(beginIp65504P1559L));
   	}
         int localIp65504P1560SCounter = -1;
         public boolean isIp65504P1560SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1560SCounter != sharedCounter;
            localIp65504P1560SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1560_S_LEN = 2;
  	/**
	 * serializeIp65504P1560S
	 */
	protected void serializeIp65504P1560S(short ip65504P1560S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1560S,IP_65504_P_1560_S_LEN)
                  ,beginIp65504P1560S
                  ,IP_65504_P_1560_S_LEN
                 );
            localIp65504P1560SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1560SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1560S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1560S() {	 
			return (getShort(beginIp65504P1560S));
   	}
         int localIp65504P1560LCounter = -1;
         public boolean isIp65504P1560LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1560LCounter != sharedCounter;
            localIp65504P1560LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1560_L_LEN = 2;
  	/**
	 * serializeIp65504P1560L
	 */
	protected void serializeIp65504P1560L(short ip65504P1560L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1560L,IP_65504_P_1560_L_LEN)
                  ,beginIp65504P1560L
                  ,IP_65504_P_1560_L_LEN
                 );
            localIp65504P1560LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1560LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1560L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1560L() {	 
			return (getShort(beginIp65504P1560L));
   	}
         int localIp65504P1561SCounter = -1;
         public boolean isIp65504P1561SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1561SCounter != sharedCounter;
            localIp65504P1561SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1561_S_LEN = 2;
  	/**
	 * serializeIp65504P1561S
	 */
	protected void serializeIp65504P1561S(short ip65504P1561S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1561S,IP_65504_P_1561_S_LEN)
                  ,beginIp65504P1561S
                  ,IP_65504_P_1561_S_LEN
                 );
            localIp65504P1561SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1561SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1561S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1561S() {	 
			return (getShort(beginIp65504P1561S));
   	}
         int localIp65504P1561LCounter = -1;
         public boolean isIp65504P1561LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1561LCounter != sharedCounter;
            localIp65504P1561LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1561_L_LEN = 2;
  	/**
	 * serializeIp65504P1561L
	 */
	protected void serializeIp65504P1561L(short ip65504P1561L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1561L,IP_65504_P_1561_L_LEN)
                  ,beginIp65504P1561L
                  ,IP_65504_P_1561_L_LEN
                 );
            localIp65504P1561LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1561LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1561L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1561L() {	 
			return (getShort(beginIp65504P1561L));
   	}
         int localIp65504P1562SCounter = -1;
         public boolean isIp65504P1562SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1562SCounter != sharedCounter;
            localIp65504P1562SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1562_S_LEN = 2;
  	/**
	 * serializeIp65504P1562S
	 */
	protected void serializeIp65504P1562S(short ip65504P1562S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1562S,IP_65504_P_1562_S_LEN)
                  ,beginIp65504P1562S
                  ,IP_65504_P_1562_S_LEN
                 );
            localIp65504P1562SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1562SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1562S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1562S() {	 
			return (getShort(beginIp65504P1562S));
   	}
         int localIp65504P1562LCounter = -1;
         public boolean isIp65504P1562LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1562LCounter != sharedCounter;
            localIp65504P1562LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1562_L_LEN = 2;
  	/**
	 * serializeIp65504P1562L
	 */
	protected void serializeIp65504P1562L(short ip65504P1562L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1562L,IP_65504_P_1562_L_LEN)
                  ,beginIp65504P1562L
                  ,IP_65504_P_1562_L_LEN
                 );
            localIp65504P1562LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1562LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1562L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1562L() {	 
			return (getShort(beginIp65504P1562L));
   	}
         int localIp65504P1563SCounter = -1;
         public boolean isIp65504P1563SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1563SCounter != sharedCounter;
            localIp65504P1563SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1563_S_LEN = 2;
  	/**
	 * serializeIp65504P1563S
	 */
	protected void serializeIp65504P1563S(short ip65504P1563S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1563S,IP_65504_P_1563_S_LEN)
                  ,beginIp65504P1563S
                  ,IP_65504_P_1563_S_LEN
                 );
            localIp65504P1563SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1563SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1563S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1563S() {	 
			return (getShort(beginIp65504P1563S));
   	}
         int localIp65504P1563LCounter = -1;
         public boolean isIp65504P1563LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1563LCounter != sharedCounter;
            localIp65504P1563LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1563_L_LEN = 2;
  	/**
	 * serializeIp65504P1563L
	 */
	protected void serializeIp65504P1563L(short ip65504P1563L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1563L,IP_65504_P_1563_L_LEN)
                  ,beginIp65504P1563L
                  ,IP_65504_P_1563_L_LEN
                 );
            localIp65504P1563LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1563LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1563L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1563L() {	 
			return (getShort(beginIp65504P1563L));
   	}
         int localIp65504P1564SCounter = -1;
         public boolean isIp65504P1564SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1564SCounter != sharedCounter;
            localIp65504P1564SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1564_S_LEN = 2;
  	/**
	 * serializeIp65504P1564S
	 */
	protected void serializeIp65504P1564S(short ip65504P1564S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1564S,IP_65504_P_1564_S_LEN)
                  ,beginIp65504P1564S
                  ,IP_65504_P_1564_S_LEN
                 );
            localIp65504P1564SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1564SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1564S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1564S() {	 
			return (getShort(beginIp65504P1564S));
   	}
         int localIp65504P1564LCounter = -1;
         public boolean isIp65504P1564LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1564LCounter != sharedCounter;
            localIp65504P1564LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1564_L_LEN = 2;
  	/**
	 * serializeIp65504P1564L
	 */
	protected void serializeIp65504P1564L(short ip65504P1564L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1564L,IP_65504_P_1564_L_LEN)
                  ,beginIp65504P1564L
                  ,IP_65504_P_1564_L_LEN
                 );
            localIp65504P1564LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1564LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1564L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1564L() {	 
			return (getShort(beginIp65504P1564L));
   	}
         int localIp65504P1565SCounter = -1;
         public boolean isIp65504P1565SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1565SCounter != sharedCounter;
            localIp65504P1565SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1565_S_LEN = 2;
  	/**
	 * serializeIp65504P1565S
	 */
	protected void serializeIp65504P1565S(short ip65504P1565S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1565S,IP_65504_P_1565_S_LEN)
                  ,beginIp65504P1565S
                  ,IP_65504_P_1565_S_LEN
                 );
            localIp65504P1565SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1565SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1565S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1565S() {	 
			return (getShort(beginIp65504P1565S));
   	}
         int localIp65504P1565LCounter = -1;
         public boolean isIp65504P1565LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1565LCounter != sharedCounter;
            localIp65504P1565LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1565_L_LEN = 2;
  	/**
	 * serializeIp65504P1565L
	 */
	protected void serializeIp65504P1565L(short ip65504P1565L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1565L,IP_65504_P_1565_L_LEN)
                  ,beginIp65504P1565L
                  ,IP_65504_P_1565_L_LEN
                 );
            localIp65504P1565LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1565LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1565L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1565L() {	 
			return (getShort(beginIp65504P1565L));
   	}
         int localIp65504P1566SCounter = -1;
         public boolean isIp65504P1566SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1566SCounter != sharedCounter;
            localIp65504P1566SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1566_S_LEN = 2;
  	/**
	 * serializeIp65504P1566S
	 */
	protected void serializeIp65504P1566S(short ip65504P1566S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1566S,IP_65504_P_1566_S_LEN)
                  ,beginIp65504P1566S
                  ,IP_65504_P_1566_S_LEN
                 );
            localIp65504P1566SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1566SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1566S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1566S() {	 
			return (getShort(beginIp65504P1566S));
   	}
         int localIp65504P1566LCounter = -1;
         public boolean isIp65504P1566LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1566LCounter != sharedCounter;
            localIp65504P1566LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1566_L_LEN = 2;
  	/**
	 * serializeIp65504P1566L
	 */
	protected void serializeIp65504P1566L(short ip65504P1566L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1566L,IP_65504_P_1566_L_LEN)
                  ,beginIp65504P1566L
                  ,IP_65504_P_1566_L_LEN
                 );
            localIp65504P1566LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1566LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1566L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1566L() {	 
			return (getShort(beginIp65504P1566L));
   	}
         int localIp65504P1567SCounter = -1;
         public boolean isIp65504P1567SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1567SCounter != sharedCounter;
            localIp65504P1567SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1567_S_LEN = 2;
  	/**
	 * serializeIp65504P1567S
	 */
	protected void serializeIp65504P1567S(short ip65504P1567S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1567S,IP_65504_P_1567_S_LEN)
                  ,beginIp65504P1567S
                  ,IP_65504_P_1567_S_LEN
                 );
            localIp65504P1567SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1567SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1567S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1567S() {	 
			return (getShort(beginIp65504P1567S));
   	}
         int localIp65504P1567LCounter = -1;
         public boolean isIp65504P1567LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1567LCounter != sharedCounter;
            localIp65504P1567LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1567_L_LEN = 2;
  	/**
	 * serializeIp65504P1567L
	 */
	protected void serializeIp65504P1567L(short ip65504P1567L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1567L,IP_65504_P_1567_L_LEN)
                  ,beginIp65504P1567L
                  ,IP_65504_P_1567_L_LEN
                 );
            localIp65504P1567LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1567LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1567L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1567L() {	 
			return (getShort(beginIp65504P1567L));
   	}
         int localIp65504P1568SCounter = -1;
         public boolean isIp65504P1568SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1568SCounter != sharedCounter;
            localIp65504P1568SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1568_S_LEN = 2;
  	/**
	 * serializeIp65504P1568S
	 */
	protected void serializeIp65504P1568S(short ip65504P1568S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1568S,IP_65504_P_1568_S_LEN)
                  ,beginIp65504P1568S
                  ,IP_65504_P_1568_S_LEN
                 );
            localIp65504P1568SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1568SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1568S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1568S() {	 
			return (getShort(beginIp65504P1568S));
   	}
         int localIp65504P1568LCounter = -1;
         public boolean isIp65504P1568LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1568LCounter != sharedCounter;
            localIp65504P1568LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1568_L_LEN = 2;
  	/**
	 * serializeIp65504P1568L
	 */
	protected void serializeIp65504P1568L(short ip65504P1568L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1568L,IP_65504_P_1568_L_LEN)
                  ,beginIp65504P1568L
                  ,IP_65504_P_1568_L_LEN
                 );
            localIp65504P1568LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1568LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1568L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1568L() {	 
			return (getShort(beginIp65504P1568L));
   	}
         int localIp65504P1569SCounter = -1;
         public boolean isIp65504P1569SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1569SCounter != sharedCounter;
            localIp65504P1569SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1569_S_LEN = 2;
  	/**
	 * serializeIp65504P1569S
	 */
	protected void serializeIp65504P1569S(short ip65504P1569S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1569S,IP_65504_P_1569_S_LEN)
                  ,beginIp65504P1569S
                  ,IP_65504_P_1569_S_LEN
                 );
            localIp65504P1569SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1569SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1569S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1569S() {	 
			return (getShort(beginIp65504P1569S));
   	}
         int localIp65504P1569LCounter = -1;
         public boolean isIp65504P1569LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1569LCounter != sharedCounter;
            localIp65504P1569LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1569_L_LEN = 2;
  	/**
	 * serializeIp65504P1569L
	 */
	protected void serializeIp65504P1569L(short ip65504P1569L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1569L,IP_65504_P_1569_L_LEN)
                  ,beginIp65504P1569L
                  ,IP_65504_P_1569_L_LEN
                 );
            localIp65504P1569LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1569LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1569L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1569L() {	 
			return (getShort(beginIp65504P1569L));
   	}
         int localIp65504P1570SCounter = -1;
         public boolean isIp65504P1570SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1570SCounter != sharedCounter;
            localIp65504P1570SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1570_S_LEN = 2;
  	/**
	 * serializeIp65504P1570S
	 */
	protected void serializeIp65504P1570S(short ip65504P1570S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1570S,IP_65504_P_1570_S_LEN)
                  ,beginIp65504P1570S
                  ,IP_65504_P_1570_S_LEN
                 );
            localIp65504P1570SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1570SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1570S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1570S() {	 
			return (getShort(beginIp65504P1570S));
   	}
         int localIp65504P1570LCounter = -1;
         public boolean isIp65504P1570LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1570LCounter != sharedCounter;
            localIp65504P1570LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1570_L_LEN = 2;
  	/**
	 * serializeIp65504P1570L
	 */
	protected void serializeIp65504P1570L(short ip65504P1570L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1570L,IP_65504_P_1570_L_LEN)
                  ,beginIp65504P1570L
                  ,IP_65504_P_1570_L_LEN
                 );
            localIp65504P1570LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1570LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1570L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1570L() {	 
			return (getShort(beginIp65504P1570L));
   	}
         int localIp65504P1571SCounter = -1;
         public boolean isIp65504P1571SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1571SCounter != sharedCounter;
            localIp65504P1571SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1571_S_LEN = 2;
  	/**
	 * serializeIp65504P1571S
	 */
	protected void serializeIp65504P1571S(short ip65504P1571S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1571S,IP_65504_P_1571_S_LEN)
                  ,beginIp65504P1571S
                  ,IP_65504_P_1571_S_LEN
                 );
            localIp65504P1571SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1571SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1571S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1571S() {	 
			return (getShort(beginIp65504P1571S));
   	}
         int localIp65504P1571LCounter = -1;
         public boolean isIp65504P1571LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1571LCounter != sharedCounter;
            localIp65504P1571LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1571_L_LEN = 2;
  	/**
	 * serializeIp65504P1571L
	 */
	protected void serializeIp65504P1571L(short ip65504P1571L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1571L,IP_65504_P_1571_L_LEN)
                  ,beginIp65504P1571L
                  ,IP_65504_P_1571_L_LEN
                 );
            localIp65504P1571LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1571LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1571L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1571L() {	 
			return (getShort(beginIp65504P1571L));
   	}
         int localIp65504P1572SCounter = -1;
         public boolean isIp65504P1572SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1572SCounter != sharedCounter;
            localIp65504P1572SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1572_S_LEN = 2;
  	/**
	 * serializeIp65504P1572S
	 */
	protected void serializeIp65504P1572S(short ip65504P1572S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1572S,IP_65504_P_1572_S_LEN)
                  ,beginIp65504P1572S
                  ,IP_65504_P_1572_S_LEN
                 );
            localIp65504P1572SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1572SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1572S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1572S() {	 
			return (getShort(beginIp65504P1572S));
   	}
         int localIp65504P1572LCounter = -1;
         public boolean isIp65504P1572LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1572LCounter != sharedCounter;
            localIp65504P1572LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1572_L_LEN = 2;
  	/**
	 * serializeIp65504P1572L
	 */
	protected void serializeIp65504P1572L(short ip65504P1572L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1572L,IP_65504_P_1572_L_LEN)
                  ,beginIp65504P1572L
                  ,IP_65504_P_1572_L_LEN
                 );
            localIp65504P1572LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1572LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1572L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1572L() {	 
			return (getShort(beginIp65504P1572L));
   	}
         int localIp65504P1573SCounter = -1;
         public boolean isIp65504P1573SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1573SCounter != sharedCounter;
            localIp65504P1573SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1573_S_LEN = 2;
  	/**
	 * serializeIp65504P1573S
	 */
	protected void serializeIp65504P1573S(short ip65504P1573S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1573S,IP_65504_P_1573_S_LEN)
                  ,beginIp65504P1573S
                  ,IP_65504_P_1573_S_LEN
                 );
            localIp65504P1573SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1573SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1573S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1573S() {	 
			return (getShort(beginIp65504P1573S));
   	}
         int localIp65504P1573LCounter = -1;
         public boolean isIp65504P1573LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1573LCounter != sharedCounter;
            localIp65504P1573LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1573_L_LEN = 2;
  	/**
	 * serializeIp65504P1573L
	 */
	protected void serializeIp65504P1573L(short ip65504P1573L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1573L,IP_65504_P_1573_L_LEN)
                  ,beginIp65504P1573L
                  ,IP_65504_P_1573_L_LEN
                 );
            localIp65504P1573LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1573LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1573L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1573L() {	 
			return (getShort(beginIp65504P1573L));
   	}
         int localIp65504P1574SCounter = -1;
         public boolean isIp65504P1574SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1574SCounter != sharedCounter;
            localIp65504P1574SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1574_S_LEN = 2;
  	/**
	 * serializeIp65504P1574S
	 */
	protected void serializeIp65504P1574S(short ip65504P1574S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1574S,IP_65504_P_1574_S_LEN)
                  ,beginIp65504P1574S
                  ,IP_65504_P_1574_S_LEN
                 );
            localIp65504P1574SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1574SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1574S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1574S() {	 
			return (getShort(beginIp65504P1574S));
   	}
         int localIp65504P1574LCounter = -1;
         public boolean isIp65504P1574LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1574LCounter != sharedCounter;
            localIp65504P1574LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1574_L_LEN = 2;
  	/**
	 * serializeIp65504P1574L
	 */
	protected void serializeIp65504P1574L(short ip65504P1574L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1574L,IP_65504_P_1574_L_LEN)
                  ,beginIp65504P1574L
                  ,IP_65504_P_1574_L_LEN
                 );
            localIp65504P1574LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1574LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1574L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1574L() {	 
			return (getShort(beginIp65504P1574L));
   	}
         int localIp65504P1575SCounter = -1;
         public boolean isIp65504P1575SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1575SCounter != sharedCounter;
            localIp65504P1575SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1575_S_LEN = 2;
  	/**
	 * serializeIp65504P1575S
	 */
	protected void serializeIp65504P1575S(short ip65504P1575S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1575S,IP_65504_P_1575_S_LEN)
                  ,beginIp65504P1575S
                  ,IP_65504_P_1575_S_LEN
                 );
            localIp65504P1575SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1575SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1575S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1575S() {	 
			return (getShort(beginIp65504P1575S));
   	}
         int localIp65504P1575LCounter = -1;
         public boolean isIp65504P1575LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1575LCounter != sharedCounter;
            localIp65504P1575LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1575_L_LEN = 2;
  	/**
	 * serializeIp65504P1575L
	 */
	protected void serializeIp65504P1575L(short ip65504P1575L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1575L,IP_65504_P_1575_L_LEN)
                  ,beginIp65504P1575L
                  ,IP_65504_P_1575_L_LEN
                 );
            localIp65504P1575LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1575LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1575L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1575L() {	 
			return (getShort(beginIp65504P1575L));
   	}
         int localIp65504P1576SCounter = -1;
         public boolean isIp65504P1576SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1576SCounter != sharedCounter;
            localIp65504P1576SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1576_S_LEN = 2;
  	/**
	 * serializeIp65504P1576S
	 */
	protected void serializeIp65504P1576S(short ip65504P1576S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1576S,IP_65504_P_1576_S_LEN)
                  ,beginIp65504P1576S
                  ,IP_65504_P_1576_S_LEN
                 );
            localIp65504P1576SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1576SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1576S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1576S() {	 
			return (getShort(beginIp65504P1576S));
   	}
         int localIp65504P1576LCounter = -1;
         public boolean isIp65504P1576LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1576LCounter != sharedCounter;
            localIp65504P1576LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1576_L_LEN = 2;
  	/**
	 * serializeIp65504P1576L
	 */
	protected void serializeIp65504P1576L(short ip65504P1576L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1576L,IP_65504_P_1576_L_LEN)
                  ,beginIp65504P1576L
                  ,IP_65504_P_1576_L_LEN
                 );
            localIp65504P1576LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1576LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1576L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1576L() {	 
			return (getShort(beginIp65504P1576L));
   	}
         int localIp65504P1577SCounter = -1;
         public boolean isIp65504P1577SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1577SCounter != sharedCounter;
            localIp65504P1577SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1577_S_LEN = 2;
  	/**
	 * serializeIp65504P1577S
	 */
	protected void serializeIp65504P1577S(short ip65504P1577S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1577S,IP_65504_P_1577_S_LEN)
                  ,beginIp65504P1577S
                  ,IP_65504_P_1577_S_LEN
                 );
            localIp65504P1577SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1577SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1577S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1577S() {	 
			return (getShort(beginIp65504P1577S));
   	}
         int localIp65504P1577LCounter = -1;
         public boolean isIp65504P1577LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1577LCounter != sharedCounter;
            localIp65504P1577LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1577_L_LEN = 2;
  	/**
	 * serializeIp65504P1577L
	 */
	protected void serializeIp65504P1577L(short ip65504P1577L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1577L,IP_65504_P_1577_L_LEN)
                  ,beginIp65504P1577L
                  ,IP_65504_P_1577_L_LEN
                 );
            localIp65504P1577LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1577LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1577L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1577L() {	 
			return (getShort(beginIp65504P1577L));
   	}
         int localIp65504P1578SCounter = -1;
         public boolean isIp65504P1578SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1578SCounter != sharedCounter;
            localIp65504P1578SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1578_S_LEN = 2;
  	/**
	 * serializeIp65504P1578S
	 */
	protected void serializeIp65504P1578S(short ip65504P1578S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1578S,IP_65504_P_1578_S_LEN)
                  ,beginIp65504P1578S
                  ,IP_65504_P_1578_S_LEN
                 );
            localIp65504P1578SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1578SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1578S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1578S() {	 
			return (getShort(beginIp65504P1578S));
   	}
         int localIp65504P1578LCounter = -1;
         public boolean isIp65504P1578LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1578LCounter != sharedCounter;
            localIp65504P1578LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1578_L_LEN = 2;
  	/**
	 * serializeIp65504P1578L
	 */
	protected void serializeIp65504P1578L(short ip65504P1578L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1578L,IP_65504_P_1578_L_LEN)
                  ,beginIp65504P1578L
                  ,IP_65504_P_1578_L_LEN
                 );
            localIp65504P1578LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1578LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1578L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1578L() {	 
			return (getShort(beginIp65504P1578L));
   	}
         int localIp65504P1579SCounter = -1;
         public boolean isIp65504P1579SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1579SCounter != sharedCounter;
            localIp65504P1579SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1579_S_LEN = 2;
  	/**
	 * serializeIp65504P1579S
	 */
	protected void serializeIp65504P1579S(short ip65504P1579S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1579S,IP_65504_P_1579_S_LEN)
                  ,beginIp65504P1579S
                  ,IP_65504_P_1579_S_LEN
                 );
            localIp65504P1579SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1579SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1579S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1579S() {	 
			return (getShort(beginIp65504P1579S));
   	}
         int localIp65504P1579LCounter = -1;
         public boolean isIp65504P1579LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1579LCounter != sharedCounter;
            localIp65504P1579LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1579_L_LEN = 2;
  	/**
	 * serializeIp65504P1579L
	 */
	protected void serializeIp65504P1579L(short ip65504P1579L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1579L,IP_65504_P_1579_L_LEN)
                  ,beginIp65504P1579L
                  ,IP_65504_P_1579_L_LEN
                 );
            localIp65504P1579LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1579LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1579L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1579L() {	 
			return (getShort(beginIp65504P1579L));
   	}
         int localIp65504P1580SCounter = -1;
         public boolean isIp65504P1580SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1580SCounter != sharedCounter;
            localIp65504P1580SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1580_S_LEN = 2;
  	/**
	 * serializeIp65504P1580S
	 */
	protected void serializeIp65504P1580S(short ip65504P1580S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1580S,IP_65504_P_1580_S_LEN)
                  ,beginIp65504P1580S
                  ,IP_65504_P_1580_S_LEN
                 );
            localIp65504P1580SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1580SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1580S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1580S() {	 
			return (getShort(beginIp65504P1580S));
   	}
         int localIp65504P1580LCounter = -1;
         public boolean isIp65504P1580LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1580LCounter != sharedCounter;
            localIp65504P1580LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1580_L_LEN = 2;
  	/**
	 * serializeIp65504P1580L
	 */
	protected void serializeIp65504P1580L(short ip65504P1580L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1580L,IP_65504_P_1580_L_LEN)
                  ,beginIp65504P1580L
                  ,IP_65504_P_1580_L_LEN
                 );
            localIp65504P1580LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1580LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1580L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1580L() {	 
			return (getShort(beginIp65504P1580L));
   	}
         int localIp65504P1581SCounter = -1;
         public boolean isIp65504P1581SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1581SCounter != sharedCounter;
            localIp65504P1581SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1581_S_LEN = 2;
  	/**
	 * serializeIp65504P1581S
	 */
	protected void serializeIp65504P1581S(short ip65504P1581S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1581S,IP_65504_P_1581_S_LEN)
                  ,beginIp65504P1581S
                  ,IP_65504_P_1581_S_LEN
                 );
            localIp65504P1581SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1581SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1581S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1581S() {	 
			return (getShort(beginIp65504P1581S));
   	}
         int localIp65504P1581LCounter = -1;
         public boolean isIp65504P1581LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1581LCounter != sharedCounter;
            localIp65504P1581LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1581_L_LEN = 2;
  	/**
	 * serializeIp65504P1581L
	 */
	protected void serializeIp65504P1581L(short ip65504P1581L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1581L,IP_65504_P_1581_L_LEN)
                  ,beginIp65504P1581L
                  ,IP_65504_P_1581_L_LEN
                 );
            localIp65504P1581LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1581LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1581L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1581L() {	 
			return (getShort(beginIp65504P1581L));
   	}




}
  
