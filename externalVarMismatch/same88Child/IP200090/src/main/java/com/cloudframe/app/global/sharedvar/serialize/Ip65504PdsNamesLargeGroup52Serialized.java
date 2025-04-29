package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup52Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup52Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup52Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_52_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1582S;
            protected  int beginIp65504P1582L;
            protected  int beginIp65504P1583S;
            protected  int beginIp65504P1583L;
            protected  int beginIp65504P1584S;
            protected  int beginIp65504P1584L;
            protected  int beginIp65504P1585S;
            protected  int beginIp65504P1585L;
            protected  int beginIp65504P1586S;
            protected  int beginIp65504P1586L;
            protected  int beginIp65504P1587S;
            protected  int beginIp65504P1587L;
            protected  int beginIp65504P1588S;
            protected  int beginIp65504P1588L;
            protected  int beginIp65504P1589S;
            protected  int beginIp65504P1589L;
            protected  int beginIp65504P1590S;
            protected  int beginIp65504P1590L;
            protected  int beginIp65504P1591S;
            protected  int beginIp65504P1591L;
            protected  int beginIp65504P1592S;
            protected  int beginIp65504P1592L;
            protected  int beginIp65504P1593S;
            protected  int beginIp65504P1593L;
            protected  int beginIp65504P1594S;
            protected  int beginIp65504P1594L;
            protected  int beginIp65504P1595S;
            protected  int beginIp65504P1595L;
            protected  int beginIp65504P1596S;
            protected  int beginIp65504P1596L;
            protected  int beginIp65504P1597S;
            protected  int beginIp65504P1597L;
            protected  int beginIp65504P1598S;
            protected  int beginIp65504P1598L;
            protected  int beginIp65504P1599S;
            protected  int beginIp65504P1599L;
            protected  int beginIp65504P1600S;
            protected  int beginIp65504P1600L;
            protected  int beginIp65504P1601S;
            protected  int beginIp65504P1601L;
            protected  int beginIp65504P1602S;
            protected  int beginIp65504P1602L;
            protected  int beginIp65504P1603S;
            protected  int beginIp65504P1603L;
            protected  int beginIp65504P1604S;
            protected  int beginIp65504P1604L;
            protected  int beginIp65504P1605S;
            protected  int beginIp65504P1605L;
            protected  int beginIp65504P1606S;
            protected  int beginIp65504P1606L;
            protected  int beginIp65504P1607S;
            protected  int beginIp65504P1607L;
            protected  int beginIp65504P1608S;
            protected  int beginIp65504P1608L;
            protected  int beginIp65504P1609S;
            protected  int beginIp65504P1609L;
            protected  int beginIp65504P1610S;
            protected  int beginIp65504P1610L;
            protected  int beginIp65504P1611S;
            protected  int beginIp65504P1611L;
            protected  int beginIp65504P1612S;
            protected  int beginIp65504P1612L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup52Serialized
	**/
    public Ip65504PdsNamesLargeGroup52Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup52Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup52Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup52Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12644); // serialize this field at offset 12644 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup52Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12644 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup52Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_52_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1582S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1582L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1583S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1583L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1584S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1584L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1585S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1585L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1586S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1586L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1587S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1587L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1588S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1588L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1589S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1589L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1590S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1590L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1591S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1591L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1592S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1592L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1593S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1593L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1594S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1594L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1595S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1595L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1596S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1596L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1597S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1597L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1598S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1598L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1599S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1599L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1600S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1600L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1601S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1601L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1602S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1602L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1603S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1603L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1604S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1604L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1605S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1605L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1606S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1606L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1607S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1607L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1608S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1608L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1609S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1609L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1610S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1610L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1611S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1611L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1612S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1612L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1582SCounter = -1;
         public boolean isIp65504P1582SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1582SCounter != sharedCounter;
            localIp65504P1582SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1582_S_LEN = 2;
  	/**
	 * serializeIp65504P1582S
	 */
	protected void serializeIp65504P1582S(short ip65504P1582S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1582S,IP_65504_P_1582_S_LEN)
                  ,beginIp65504P1582S
                  ,IP_65504_P_1582_S_LEN
                 );
            localIp65504P1582SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1582SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1582S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1582S() {	 
			return (getShort(beginIp65504P1582S));
   	}
         int localIp65504P1582LCounter = -1;
         public boolean isIp65504P1582LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1582LCounter != sharedCounter;
            localIp65504P1582LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1582_L_LEN = 2;
  	/**
	 * serializeIp65504P1582L
	 */
	protected void serializeIp65504P1582L(short ip65504P1582L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1582L,IP_65504_P_1582_L_LEN)
                  ,beginIp65504P1582L
                  ,IP_65504_P_1582_L_LEN
                 );
            localIp65504P1582LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1582LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1582L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1582L() {	 
			return (getShort(beginIp65504P1582L));
   	}
         int localIp65504P1583SCounter = -1;
         public boolean isIp65504P1583SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1583SCounter != sharedCounter;
            localIp65504P1583SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1583_S_LEN = 2;
  	/**
	 * serializeIp65504P1583S
	 */
	protected void serializeIp65504P1583S(short ip65504P1583S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1583S,IP_65504_P_1583_S_LEN)
                  ,beginIp65504P1583S
                  ,IP_65504_P_1583_S_LEN
                 );
            localIp65504P1583SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1583SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1583S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1583S() {	 
			return (getShort(beginIp65504P1583S));
   	}
         int localIp65504P1583LCounter = -1;
         public boolean isIp65504P1583LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1583LCounter != sharedCounter;
            localIp65504P1583LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1583_L_LEN = 2;
  	/**
	 * serializeIp65504P1583L
	 */
	protected void serializeIp65504P1583L(short ip65504P1583L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1583L,IP_65504_P_1583_L_LEN)
                  ,beginIp65504P1583L
                  ,IP_65504_P_1583_L_LEN
                 );
            localIp65504P1583LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1583LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1583L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1583L() {	 
			return (getShort(beginIp65504P1583L));
   	}
         int localIp65504P1584SCounter = -1;
         public boolean isIp65504P1584SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1584SCounter != sharedCounter;
            localIp65504P1584SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1584_S_LEN = 2;
  	/**
	 * serializeIp65504P1584S
	 */
	protected void serializeIp65504P1584S(short ip65504P1584S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1584S,IP_65504_P_1584_S_LEN)
                  ,beginIp65504P1584S
                  ,IP_65504_P_1584_S_LEN
                 );
            localIp65504P1584SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1584SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1584S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1584S() {	 
			return (getShort(beginIp65504P1584S));
   	}
         int localIp65504P1584LCounter = -1;
         public boolean isIp65504P1584LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1584LCounter != sharedCounter;
            localIp65504P1584LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1584_L_LEN = 2;
  	/**
	 * serializeIp65504P1584L
	 */
	protected void serializeIp65504P1584L(short ip65504P1584L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1584L,IP_65504_P_1584_L_LEN)
                  ,beginIp65504P1584L
                  ,IP_65504_P_1584_L_LEN
                 );
            localIp65504P1584LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1584LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1584L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1584L() {	 
			return (getShort(beginIp65504P1584L));
   	}
         int localIp65504P1585SCounter = -1;
         public boolean isIp65504P1585SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1585SCounter != sharedCounter;
            localIp65504P1585SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1585_S_LEN = 2;
  	/**
	 * serializeIp65504P1585S
	 */
	protected void serializeIp65504P1585S(short ip65504P1585S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1585S,IP_65504_P_1585_S_LEN)
                  ,beginIp65504P1585S
                  ,IP_65504_P_1585_S_LEN
                 );
            localIp65504P1585SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1585SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1585S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1585S() {	 
			return (getShort(beginIp65504P1585S));
   	}
         int localIp65504P1585LCounter = -1;
         public boolean isIp65504P1585LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1585LCounter != sharedCounter;
            localIp65504P1585LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1585_L_LEN = 2;
  	/**
	 * serializeIp65504P1585L
	 */
	protected void serializeIp65504P1585L(short ip65504P1585L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1585L,IP_65504_P_1585_L_LEN)
                  ,beginIp65504P1585L
                  ,IP_65504_P_1585_L_LEN
                 );
            localIp65504P1585LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1585LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1585L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1585L() {	 
			return (getShort(beginIp65504P1585L));
   	}
         int localIp65504P1586SCounter = -1;
         public boolean isIp65504P1586SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1586SCounter != sharedCounter;
            localIp65504P1586SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1586_S_LEN = 2;
  	/**
	 * serializeIp65504P1586S
	 */
	protected void serializeIp65504P1586S(short ip65504P1586S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1586S,IP_65504_P_1586_S_LEN)
                  ,beginIp65504P1586S
                  ,IP_65504_P_1586_S_LEN
                 );
            localIp65504P1586SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1586SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1586S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1586S() {	 
			return (getShort(beginIp65504P1586S));
   	}
         int localIp65504P1586LCounter = -1;
         public boolean isIp65504P1586LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1586LCounter != sharedCounter;
            localIp65504P1586LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1586_L_LEN = 2;
  	/**
	 * serializeIp65504P1586L
	 */
	protected void serializeIp65504P1586L(short ip65504P1586L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1586L,IP_65504_P_1586_L_LEN)
                  ,beginIp65504P1586L
                  ,IP_65504_P_1586_L_LEN
                 );
            localIp65504P1586LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1586LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1586L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1586L() {	 
			return (getShort(beginIp65504P1586L));
   	}
         int localIp65504P1587SCounter = -1;
         public boolean isIp65504P1587SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1587SCounter != sharedCounter;
            localIp65504P1587SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1587_S_LEN = 2;
  	/**
	 * serializeIp65504P1587S
	 */
	protected void serializeIp65504P1587S(short ip65504P1587S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1587S,IP_65504_P_1587_S_LEN)
                  ,beginIp65504P1587S
                  ,IP_65504_P_1587_S_LEN
                 );
            localIp65504P1587SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1587SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1587S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1587S() {	 
			return (getShort(beginIp65504P1587S));
   	}
         int localIp65504P1587LCounter = -1;
         public boolean isIp65504P1587LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1587LCounter != sharedCounter;
            localIp65504P1587LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1587_L_LEN = 2;
  	/**
	 * serializeIp65504P1587L
	 */
	protected void serializeIp65504P1587L(short ip65504P1587L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1587L,IP_65504_P_1587_L_LEN)
                  ,beginIp65504P1587L
                  ,IP_65504_P_1587_L_LEN
                 );
            localIp65504P1587LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1587LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1587L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1587L() {	 
			return (getShort(beginIp65504P1587L));
   	}
         int localIp65504P1588SCounter = -1;
         public boolean isIp65504P1588SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1588SCounter != sharedCounter;
            localIp65504P1588SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1588_S_LEN = 2;
  	/**
	 * serializeIp65504P1588S
	 */
	protected void serializeIp65504P1588S(short ip65504P1588S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1588S,IP_65504_P_1588_S_LEN)
                  ,beginIp65504P1588S
                  ,IP_65504_P_1588_S_LEN
                 );
            localIp65504P1588SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1588SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1588S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1588S() {	 
			return (getShort(beginIp65504P1588S));
   	}
         int localIp65504P1588LCounter = -1;
         public boolean isIp65504P1588LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1588LCounter != sharedCounter;
            localIp65504P1588LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1588_L_LEN = 2;
  	/**
	 * serializeIp65504P1588L
	 */
	protected void serializeIp65504P1588L(short ip65504P1588L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1588L,IP_65504_P_1588_L_LEN)
                  ,beginIp65504P1588L
                  ,IP_65504_P_1588_L_LEN
                 );
            localIp65504P1588LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1588LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1588L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1588L() {	 
			return (getShort(beginIp65504P1588L));
   	}
         int localIp65504P1589SCounter = -1;
         public boolean isIp65504P1589SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1589SCounter != sharedCounter;
            localIp65504P1589SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1589_S_LEN = 2;
  	/**
	 * serializeIp65504P1589S
	 */
	protected void serializeIp65504P1589S(short ip65504P1589S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1589S,IP_65504_P_1589_S_LEN)
                  ,beginIp65504P1589S
                  ,IP_65504_P_1589_S_LEN
                 );
            localIp65504P1589SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1589SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1589S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1589S() {	 
			return (getShort(beginIp65504P1589S));
   	}
         int localIp65504P1589LCounter = -1;
         public boolean isIp65504P1589LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1589LCounter != sharedCounter;
            localIp65504P1589LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1589_L_LEN = 2;
  	/**
	 * serializeIp65504P1589L
	 */
	protected void serializeIp65504P1589L(short ip65504P1589L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1589L,IP_65504_P_1589_L_LEN)
                  ,beginIp65504P1589L
                  ,IP_65504_P_1589_L_LEN
                 );
            localIp65504P1589LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1589LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1589L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1589L() {	 
			return (getShort(beginIp65504P1589L));
   	}
         int localIp65504P1590SCounter = -1;
         public boolean isIp65504P1590SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1590SCounter != sharedCounter;
            localIp65504P1590SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1590_S_LEN = 2;
  	/**
	 * serializeIp65504P1590S
	 */
	protected void serializeIp65504P1590S(short ip65504P1590S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1590S,IP_65504_P_1590_S_LEN)
                  ,beginIp65504P1590S
                  ,IP_65504_P_1590_S_LEN
                 );
            localIp65504P1590SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1590SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1590S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1590S() {	 
			return (getShort(beginIp65504P1590S));
   	}
         int localIp65504P1590LCounter = -1;
         public boolean isIp65504P1590LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1590LCounter != sharedCounter;
            localIp65504P1590LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1590_L_LEN = 2;
  	/**
	 * serializeIp65504P1590L
	 */
	protected void serializeIp65504P1590L(short ip65504P1590L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1590L,IP_65504_P_1590_L_LEN)
                  ,beginIp65504P1590L
                  ,IP_65504_P_1590_L_LEN
                 );
            localIp65504P1590LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1590LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1590L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1590L() {	 
			return (getShort(beginIp65504P1590L));
   	}
         int localIp65504P1591SCounter = -1;
         public boolean isIp65504P1591SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1591SCounter != sharedCounter;
            localIp65504P1591SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1591_S_LEN = 2;
  	/**
	 * serializeIp65504P1591S
	 */
	protected void serializeIp65504P1591S(short ip65504P1591S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1591S,IP_65504_P_1591_S_LEN)
                  ,beginIp65504P1591S
                  ,IP_65504_P_1591_S_LEN
                 );
            localIp65504P1591SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1591SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1591S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1591S() {	 
			return (getShort(beginIp65504P1591S));
   	}
         int localIp65504P1591LCounter = -1;
         public boolean isIp65504P1591LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1591LCounter != sharedCounter;
            localIp65504P1591LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1591_L_LEN = 2;
  	/**
	 * serializeIp65504P1591L
	 */
	protected void serializeIp65504P1591L(short ip65504P1591L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1591L,IP_65504_P_1591_L_LEN)
                  ,beginIp65504P1591L
                  ,IP_65504_P_1591_L_LEN
                 );
            localIp65504P1591LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1591LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1591L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1591L() {	 
			return (getShort(beginIp65504P1591L));
   	}
         int localIp65504P1592SCounter = -1;
         public boolean isIp65504P1592SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1592SCounter != sharedCounter;
            localIp65504P1592SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1592_S_LEN = 2;
  	/**
	 * serializeIp65504P1592S
	 */
	protected void serializeIp65504P1592S(short ip65504P1592S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1592S,IP_65504_P_1592_S_LEN)
                  ,beginIp65504P1592S
                  ,IP_65504_P_1592_S_LEN
                 );
            localIp65504P1592SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1592SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1592S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1592S() {	 
			return (getShort(beginIp65504P1592S));
   	}
         int localIp65504P1592LCounter = -1;
         public boolean isIp65504P1592LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1592LCounter != sharedCounter;
            localIp65504P1592LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1592_L_LEN = 2;
  	/**
	 * serializeIp65504P1592L
	 */
	protected void serializeIp65504P1592L(short ip65504P1592L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1592L,IP_65504_P_1592_L_LEN)
                  ,beginIp65504P1592L
                  ,IP_65504_P_1592_L_LEN
                 );
            localIp65504P1592LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1592LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1592L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1592L() {	 
			return (getShort(beginIp65504P1592L));
   	}
         int localIp65504P1593SCounter = -1;
         public boolean isIp65504P1593SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1593SCounter != sharedCounter;
            localIp65504P1593SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1593_S_LEN = 2;
  	/**
	 * serializeIp65504P1593S
	 */
	protected void serializeIp65504P1593S(short ip65504P1593S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1593S,IP_65504_P_1593_S_LEN)
                  ,beginIp65504P1593S
                  ,IP_65504_P_1593_S_LEN
                 );
            localIp65504P1593SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1593SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1593S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1593S() {	 
			return (getShort(beginIp65504P1593S));
   	}
         int localIp65504P1593LCounter = -1;
         public boolean isIp65504P1593LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1593LCounter != sharedCounter;
            localIp65504P1593LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1593_L_LEN = 2;
  	/**
	 * serializeIp65504P1593L
	 */
	protected void serializeIp65504P1593L(short ip65504P1593L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1593L,IP_65504_P_1593_L_LEN)
                  ,beginIp65504P1593L
                  ,IP_65504_P_1593_L_LEN
                 );
            localIp65504P1593LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1593LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1593L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1593L() {	 
			return (getShort(beginIp65504P1593L));
   	}
         int localIp65504P1594SCounter = -1;
         public boolean isIp65504P1594SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1594SCounter != sharedCounter;
            localIp65504P1594SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1594_S_LEN = 2;
  	/**
	 * serializeIp65504P1594S
	 */
	protected void serializeIp65504P1594S(short ip65504P1594S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1594S,IP_65504_P_1594_S_LEN)
                  ,beginIp65504P1594S
                  ,IP_65504_P_1594_S_LEN
                 );
            localIp65504P1594SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1594SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1594S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1594S() {	 
			return (getShort(beginIp65504P1594S));
   	}
         int localIp65504P1594LCounter = -1;
         public boolean isIp65504P1594LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1594LCounter != sharedCounter;
            localIp65504P1594LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1594_L_LEN = 2;
  	/**
	 * serializeIp65504P1594L
	 */
	protected void serializeIp65504P1594L(short ip65504P1594L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1594L,IP_65504_P_1594_L_LEN)
                  ,beginIp65504P1594L
                  ,IP_65504_P_1594_L_LEN
                 );
            localIp65504P1594LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1594LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1594L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1594L() {	 
			return (getShort(beginIp65504P1594L));
   	}
         int localIp65504P1595SCounter = -1;
         public boolean isIp65504P1595SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1595SCounter != sharedCounter;
            localIp65504P1595SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1595_S_LEN = 2;
  	/**
	 * serializeIp65504P1595S
	 */
	protected void serializeIp65504P1595S(short ip65504P1595S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1595S,IP_65504_P_1595_S_LEN)
                  ,beginIp65504P1595S
                  ,IP_65504_P_1595_S_LEN
                 );
            localIp65504P1595SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1595SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1595S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1595S() {	 
			return (getShort(beginIp65504P1595S));
   	}
         int localIp65504P1595LCounter = -1;
         public boolean isIp65504P1595LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1595LCounter != sharedCounter;
            localIp65504P1595LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1595_L_LEN = 2;
  	/**
	 * serializeIp65504P1595L
	 */
	protected void serializeIp65504P1595L(short ip65504P1595L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1595L,IP_65504_P_1595_L_LEN)
                  ,beginIp65504P1595L
                  ,IP_65504_P_1595_L_LEN
                 );
            localIp65504P1595LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1595LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1595L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1595L() {	 
			return (getShort(beginIp65504P1595L));
   	}
         int localIp65504P1596SCounter = -1;
         public boolean isIp65504P1596SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1596SCounter != sharedCounter;
            localIp65504P1596SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1596_S_LEN = 2;
  	/**
	 * serializeIp65504P1596S
	 */
	protected void serializeIp65504P1596S(short ip65504P1596S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1596S,IP_65504_P_1596_S_LEN)
                  ,beginIp65504P1596S
                  ,IP_65504_P_1596_S_LEN
                 );
            localIp65504P1596SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1596SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1596S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1596S() {	 
			return (getShort(beginIp65504P1596S));
   	}
         int localIp65504P1596LCounter = -1;
         public boolean isIp65504P1596LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1596LCounter != sharedCounter;
            localIp65504P1596LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1596_L_LEN = 2;
  	/**
	 * serializeIp65504P1596L
	 */
	protected void serializeIp65504P1596L(short ip65504P1596L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1596L,IP_65504_P_1596_L_LEN)
                  ,beginIp65504P1596L
                  ,IP_65504_P_1596_L_LEN
                 );
            localIp65504P1596LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1596LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1596L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1596L() {	 
			return (getShort(beginIp65504P1596L));
   	}
         int localIp65504P1597SCounter = -1;
         public boolean isIp65504P1597SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1597SCounter != sharedCounter;
            localIp65504P1597SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1597_S_LEN = 2;
  	/**
	 * serializeIp65504P1597S
	 */
	protected void serializeIp65504P1597S(short ip65504P1597S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1597S,IP_65504_P_1597_S_LEN)
                  ,beginIp65504P1597S
                  ,IP_65504_P_1597_S_LEN
                 );
            localIp65504P1597SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1597SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1597S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1597S() {	 
			return (getShort(beginIp65504P1597S));
   	}
         int localIp65504P1597LCounter = -1;
         public boolean isIp65504P1597LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1597LCounter != sharedCounter;
            localIp65504P1597LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1597_L_LEN = 2;
  	/**
	 * serializeIp65504P1597L
	 */
	protected void serializeIp65504P1597L(short ip65504P1597L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1597L,IP_65504_P_1597_L_LEN)
                  ,beginIp65504P1597L
                  ,IP_65504_P_1597_L_LEN
                 );
            localIp65504P1597LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1597LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1597L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1597L() {	 
			return (getShort(beginIp65504P1597L));
   	}
         int localIp65504P1598SCounter = -1;
         public boolean isIp65504P1598SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1598SCounter != sharedCounter;
            localIp65504P1598SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1598_S_LEN = 2;
  	/**
	 * serializeIp65504P1598S
	 */
	protected void serializeIp65504P1598S(short ip65504P1598S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1598S,IP_65504_P_1598_S_LEN)
                  ,beginIp65504P1598S
                  ,IP_65504_P_1598_S_LEN
                 );
            localIp65504P1598SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1598SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1598S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1598S() {	 
			return (getShort(beginIp65504P1598S));
   	}
         int localIp65504P1598LCounter = -1;
         public boolean isIp65504P1598LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1598LCounter != sharedCounter;
            localIp65504P1598LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1598_L_LEN = 2;
  	/**
	 * serializeIp65504P1598L
	 */
	protected void serializeIp65504P1598L(short ip65504P1598L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1598L,IP_65504_P_1598_L_LEN)
                  ,beginIp65504P1598L
                  ,IP_65504_P_1598_L_LEN
                 );
            localIp65504P1598LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1598LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1598L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1598L() {	 
			return (getShort(beginIp65504P1598L));
   	}
         int localIp65504P1599SCounter = -1;
         public boolean isIp65504P1599SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1599SCounter != sharedCounter;
            localIp65504P1599SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1599_S_LEN = 2;
  	/**
	 * serializeIp65504P1599S
	 */
	protected void serializeIp65504P1599S(short ip65504P1599S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1599S,IP_65504_P_1599_S_LEN)
                  ,beginIp65504P1599S
                  ,IP_65504_P_1599_S_LEN
                 );
            localIp65504P1599SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1599SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1599S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1599S() {	 
			return (getShort(beginIp65504P1599S));
   	}
         int localIp65504P1599LCounter = -1;
         public boolean isIp65504P1599LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1599LCounter != sharedCounter;
            localIp65504P1599LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1599_L_LEN = 2;
  	/**
	 * serializeIp65504P1599L
	 */
	protected void serializeIp65504P1599L(short ip65504P1599L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1599L,IP_65504_P_1599_L_LEN)
                  ,beginIp65504P1599L
                  ,IP_65504_P_1599_L_LEN
                 );
            localIp65504P1599LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1599LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1599L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1599L() {	 
			return (getShort(beginIp65504P1599L));
   	}
         int localIp65504P1600SCounter = -1;
         public boolean isIp65504P1600SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1600SCounter != sharedCounter;
            localIp65504P1600SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1600_S_LEN = 2;
  	/**
	 * serializeIp65504P1600S
	 */
	protected void serializeIp65504P1600S(short ip65504P1600S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1600S,IP_65504_P_1600_S_LEN)
                  ,beginIp65504P1600S
                  ,IP_65504_P_1600_S_LEN
                 );
            localIp65504P1600SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1600SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1600S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1600S() {	 
			return (getShort(beginIp65504P1600S));
   	}
         int localIp65504P1600LCounter = -1;
         public boolean isIp65504P1600LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1600LCounter != sharedCounter;
            localIp65504P1600LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1600_L_LEN = 2;
  	/**
	 * serializeIp65504P1600L
	 */
	protected void serializeIp65504P1600L(short ip65504P1600L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1600L,IP_65504_P_1600_L_LEN)
                  ,beginIp65504P1600L
                  ,IP_65504_P_1600_L_LEN
                 );
            localIp65504P1600LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1600LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1600L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1600L() {	 
			return (getShort(beginIp65504P1600L));
   	}
         int localIp65504P1601SCounter = -1;
         public boolean isIp65504P1601SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1601SCounter != sharedCounter;
            localIp65504P1601SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1601_S_LEN = 2;
  	/**
	 * serializeIp65504P1601S
	 */
	protected void serializeIp65504P1601S(short ip65504P1601S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1601S,IP_65504_P_1601_S_LEN)
                  ,beginIp65504P1601S
                  ,IP_65504_P_1601_S_LEN
                 );
            localIp65504P1601SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1601SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1601S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1601S() {	 
			return (getShort(beginIp65504P1601S));
   	}
         int localIp65504P1601LCounter = -1;
         public boolean isIp65504P1601LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1601LCounter != sharedCounter;
            localIp65504P1601LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1601_L_LEN = 2;
  	/**
	 * serializeIp65504P1601L
	 */
	protected void serializeIp65504P1601L(short ip65504P1601L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1601L,IP_65504_P_1601_L_LEN)
                  ,beginIp65504P1601L
                  ,IP_65504_P_1601_L_LEN
                 );
            localIp65504P1601LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1601LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1601L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1601L() {	 
			return (getShort(beginIp65504P1601L));
   	}
         int localIp65504P1602SCounter = -1;
         public boolean isIp65504P1602SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1602SCounter != sharedCounter;
            localIp65504P1602SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1602_S_LEN = 2;
  	/**
	 * serializeIp65504P1602S
	 */
	protected void serializeIp65504P1602S(short ip65504P1602S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1602S,IP_65504_P_1602_S_LEN)
                  ,beginIp65504P1602S
                  ,IP_65504_P_1602_S_LEN
                 );
            localIp65504P1602SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1602SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1602S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1602S() {	 
			return (getShort(beginIp65504P1602S));
   	}
         int localIp65504P1602LCounter = -1;
         public boolean isIp65504P1602LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1602LCounter != sharedCounter;
            localIp65504P1602LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1602_L_LEN = 2;
  	/**
	 * serializeIp65504P1602L
	 */
	protected void serializeIp65504P1602L(short ip65504P1602L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1602L,IP_65504_P_1602_L_LEN)
                  ,beginIp65504P1602L
                  ,IP_65504_P_1602_L_LEN
                 );
            localIp65504P1602LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1602LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1602L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1602L() {	 
			return (getShort(beginIp65504P1602L));
   	}
         int localIp65504P1603SCounter = -1;
         public boolean isIp65504P1603SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1603SCounter != sharedCounter;
            localIp65504P1603SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1603_S_LEN = 2;
  	/**
	 * serializeIp65504P1603S
	 */
	protected void serializeIp65504P1603S(short ip65504P1603S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1603S,IP_65504_P_1603_S_LEN)
                  ,beginIp65504P1603S
                  ,IP_65504_P_1603_S_LEN
                 );
            localIp65504P1603SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1603SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1603S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1603S() {	 
			return (getShort(beginIp65504P1603S));
   	}
         int localIp65504P1603LCounter = -1;
         public boolean isIp65504P1603LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1603LCounter != sharedCounter;
            localIp65504P1603LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1603_L_LEN = 2;
  	/**
	 * serializeIp65504P1603L
	 */
	protected void serializeIp65504P1603L(short ip65504P1603L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1603L,IP_65504_P_1603_L_LEN)
                  ,beginIp65504P1603L
                  ,IP_65504_P_1603_L_LEN
                 );
            localIp65504P1603LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1603LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1603L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1603L() {	 
			return (getShort(beginIp65504P1603L));
   	}
         int localIp65504P1604SCounter = -1;
         public boolean isIp65504P1604SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1604SCounter != sharedCounter;
            localIp65504P1604SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1604_S_LEN = 2;
  	/**
	 * serializeIp65504P1604S
	 */
	protected void serializeIp65504P1604S(short ip65504P1604S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1604S,IP_65504_P_1604_S_LEN)
                  ,beginIp65504P1604S
                  ,IP_65504_P_1604_S_LEN
                 );
            localIp65504P1604SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1604SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1604S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1604S() {	 
			return (getShort(beginIp65504P1604S));
   	}
         int localIp65504P1604LCounter = -1;
         public boolean isIp65504P1604LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1604LCounter != sharedCounter;
            localIp65504P1604LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1604_L_LEN = 2;
  	/**
	 * serializeIp65504P1604L
	 */
	protected void serializeIp65504P1604L(short ip65504P1604L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1604L,IP_65504_P_1604_L_LEN)
                  ,beginIp65504P1604L
                  ,IP_65504_P_1604_L_LEN
                 );
            localIp65504P1604LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1604LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1604L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1604L() {	 
			return (getShort(beginIp65504P1604L));
   	}
         int localIp65504P1605SCounter = -1;
         public boolean isIp65504P1605SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1605SCounter != sharedCounter;
            localIp65504P1605SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1605_S_LEN = 2;
  	/**
	 * serializeIp65504P1605S
	 */
	protected void serializeIp65504P1605S(short ip65504P1605S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1605S,IP_65504_P_1605_S_LEN)
                  ,beginIp65504P1605S
                  ,IP_65504_P_1605_S_LEN
                 );
            localIp65504P1605SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1605SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1605S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1605S() {	 
			return (getShort(beginIp65504P1605S));
   	}
         int localIp65504P1605LCounter = -1;
         public boolean isIp65504P1605LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1605LCounter != sharedCounter;
            localIp65504P1605LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1605_L_LEN = 2;
  	/**
	 * serializeIp65504P1605L
	 */
	protected void serializeIp65504P1605L(short ip65504P1605L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1605L,IP_65504_P_1605_L_LEN)
                  ,beginIp65504P1605L
                  ,IP_65504_P_1605_L_LEN
                 );
            localIp65504P1605LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1605LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1605L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1605L() {	 
			return (getShort(beginIp65504P1605L));
   	}
         int localIp65504P1606SCounter = -1;
         public boolean isIp65504P1606SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1606SCounter != sharedCounter;
            localIp65504P1606SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1606_S_LEN = 2;
  	/**
	 * serializeIp65504P1606S
	 */
	protected void serializeIp65504P1606S(short ip65504P1606S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1606S,IP_65504_P_1606_S_LEN)
                  ,beginIp65504P1606S
                  ,IP_65504_P_1606_S_LEN
                 );
            localIp65504P1606SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1606SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1606S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1606S() {	 
			return (getShort(beginIp65504P1606S));
   	}
         int localIp65504P1606LCounter = -1;
         public boolean isIp65504P1606LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1606LCounter != sharedCounter;
            localIp65504P1606LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1606_L_LEN = 2;
  	/**
	 * serializeIp65504P1606L
	 */
	protected void serializeIp65504P1606L(short ip65504P1606L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1606L,IP_65504_P_1606_L_LEN)
                  ,beginIp65504P1606L
                  ,IP_65504_P_1606_L_LEN
                 );
            localIp65504P1606LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1606LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1606L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1606L() {	 
			return (getShort(beginIp65504P1606L));
   	}
         int localIp65504P1607SCounter = -1;
         public boolean isIp65504P1607SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1607SCounter != sharedCounter;
            localIp65504P1607SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1607_S_LEN = 2;
  	/**
	 * serializeIp65504P1607S
	 */
	protected void serializeIp65504P1607S(short ip65504P1607S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1607S,IP_65504_P_1607_S_LEN)
                  ,beginIp65504P1607S
                  ,IP_65504_P_1607_S_LEN
                 );
            localIp65504P1607SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1607SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1607S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1607S() {	 
			return (getShort(beginIp65504P1607S));
   	}
         int localIp65504P1607LCounter = -1;
         public boolean isIp65504P1607LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1607LCounter != sharedCounter;
            localIp65504P1607LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1607_L_LEN = 2;
  	/**
	 * serializeIp65504P1607L
	 */
	protected void serializeIp65504P1607L(short ip65504P1607L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1607L,IP_65504_P_1607_L_LEN)
                  ,beginIp65504P1607L
                  ,IP_65504_P_1607_L_LEN
                 );
            localIp65504P1607LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1607LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1607L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1607L() {	 
			return (getShort(beginIp65504P1607L));
   	}
         int localIp65504P1608SCounter = -1;
         public boolean isIp65504P1608SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1608SCounter != sharedCounter;
            localIp65504P1608SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1608_S_LEN = 2;
  	/**
	 * serializeIp65504P1608S
	 */
	protected void serializeIp65504P1608S(short ip65504P1608S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1608S,IP_65504_P_1608_S_LEN)
                  ,beginIp65504P1608S
                  ,IP_65504_P_1608_S_LEN
                 );
            localIp65504P1608SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1608SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1608S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1608S() {	 
			return (getShort(beginIp65504P1608S));
   	}
         int localIp65504P1608LCounter = -1;
         public boolean isIp65504P1608LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1608LCounter != sharedCounter;
            localIp65504P1608LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1608_L_LEN = 2;
  	/**
	 * serializeIp65504P1608L
	 */
	protected void serializeIp65504P1608L(short ip65504P1608L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1608L,IP_65504_P_1608_L_LEN)
                  ,beginIp65504P1608L
                  ,IP_65504_P_1608_L_LEN
                 );
            localIp65504P1608LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1608LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1608L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1608L() {	 
			return (getShort(beginIp65504P1608L));
   	}
         int localIp65504P1609SCounter = -1;
         public boolean isIp65504P1609SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1609SCounter != sharedCounter;
            localIp65504P1609SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1609_S_LEN = 2;
  	/**
	 * serializeIp65504P1609S
	 */
	protected void serializeIp65504P1609S(short ip65504P1609S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1609S,IP_65504_P_1609_S_LEN)
                  ,beginIp65504P1609S
                  ,IP_65504_P_1609_S_LEN
                 );
            localIp65504P1609SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1609SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1609S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1609S() {	 
			return (getShort(beginIp65504P1609S));
   	}
         int localIp65504P1609LCounter = -1;
         public boolean isIp65504P1609LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1609LCounter != sharedCounter;
            localIp65504P1609LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1609_L_LEN = 2;
  	/**
	 * serializeIp65504P1609L
	 */
	protected void serializeIp65504P1609L(short ip65504P1609L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1609L,IP_65504_P_1609_L_LEN)
                  ,beginIp65504P1609L
                  ,IP_65504_P_1609_L_LEN
                 );
            localIp65504P1609LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1609LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1609L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1609L() {	 
			return (getShort(beginIp65504P1609L));
   	}
         int localIp65504P1610SCounter = -1;
         public boolean isIp65504P1610SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1610SCounter != sharedCounter;
            localIp65504P1610SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1610_S_LEN = 2;
  	/**
	 * serializeIp65504P1610S
	 */
	protected void serializeIp65504P1610S(short ip65504P1610S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1610S,IP_65504_P_1610_S_LEN)
                  ,beginIp65504P1610S
                  ,IP_65504_P_1610_S_LEN
                 );
            localIp65504P1610SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1610SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1610S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1610S() {	 
			return (getShort(beginIp65504P1610S));
   	}
         int localIp65504P1610LCounter = -1;
         public boolean isIp65504P1610LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1610LCounter != sharedCounter;
            localIp65504P1610LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1610_L_LEN = 2;
  	/**
	 * serializeIp65504P1610L
	 */
	protected void serializeIp65504P1610L(short ip65504P1610L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1610L,IP_65504_P_1610_L_LEN)
                  ,beginIp65504P1610L
                  ,IP_65504_P_1610_L_LEN
                 );
            localIp65504P1610LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1610LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1610L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1610L() {	 
			return (getShort(beginIp65504P1610L));
   	}
         int localIp65504P1611SCounter = -1;
         public boolean isIp65504P1611SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1611SCounter != sharedCounter;
            localIp65504P1611SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1611_S_LEN = 2;
  	/**
	 * serializeIp65504P1611S
	 */
	protected void serializeIp65504P1611S(short ip65504P1611S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1611S,IP_65504_P_1611_S_LEN)
                  ,beginIp65504P1611S
                  ,IP_65504_P_1611_S_LEN
                 );
            localIp65504P1611SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1611SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1611S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1611S() {	 
			return (getShort(beginIp65504P1611S));
   	}
         int localIp65504P1611LCounter = -1;
         public boolean isIp65504P1611LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1611LCounter != sharedCounter;
            localIp65504P1611LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1611_L_LEN = 2;
  	/**
	 * serializeIp65504P1611L
	 */
	protected void serializeIp65504P1611L(short ip65504P1611L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1611L,IP_65504_P_1611_L_LEN)
                  ,beginIp65504P1611L
                  ,IP_65504_P_1611_L_LEN
                 );
            localIp65504P1611LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1611LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1611L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1611L() {	 
			return (getShort(beginIp65504P1611L));
   	}
         int localIp65504P1612SCounter = -1;
         public boolean isIp65504P1612SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1612SCounter != sharedCounter;
            localIp65504P1612SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1612_S_LEN = 2;
  	/**
	 * serializeIp65504P1612S
	 */
	protected void serializeIp65504P1612S(short ip65504P1612S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1612S,IP_65504_P_1612_S_LEN)
                  ,beginIp65504P1612S
                  ,IP_65504_P_1612_S_LEN
                 );
            localIp65504P1612SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1612SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1612S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1612S() {	 
			return (getShort(beginIp65504P1612S));
   	}
         int localIp65504P1612LCounter = -1;
         public boolean isIp65504P1612LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1612LCounter != sharedCounter;
            localIp65504P1612LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1612_L_LEN = 2;
  	/**
	 * serializeIp65504P1612L
	 */
	protected void serializeIp65504P1612L(short ip65504P1612L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1612L,IP_65504_P_1612_L_LEN)
                  ,beginIp65504P1612L
                  ,IP_65504_P_1612_L_LEN
                 );
            localIp65504P1612LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1612LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1612L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1612L() {	 
			return (getShort(beginIp65504P1612L));
   	}




}
  
