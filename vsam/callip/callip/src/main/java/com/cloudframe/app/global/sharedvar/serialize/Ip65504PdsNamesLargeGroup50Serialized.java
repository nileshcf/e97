package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup50Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup50Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup50Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_50_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1520S;
            protected  int beginIp65504P1520L;
            protected  int beginIp65504P1521S;
            protected  int beginIp65504P1521L;
            protected  int beginIp65504P1522S;
            protected  int beginIp65504P1522L;
            protected  int beginIp65504P1523S;
            protected  int beginIp65504P1523L;
            protected  int beginIp65504P1524S;
            protected  int beginIp65504P1524L;
            protected  int beginIp65504P1525S;
            protected  int beginIp65504P1525L;
            protected  int beginIp65504P1526S;
            protected  int beginIp65504P1526L;
            protected  int beginIp65504P1527S;
            protected  int beginIp65504P1527L;
            protected  int beginIp65504P1528S;
            protected  int beginIp65504P1528L;
            protected  int beginIp65504P1529S;
            protected  int beginIp65504P1529L;
            protected  int beginIp65504P1530S;
            protected  int beginIp65504P1530L;
            protected  int beginIp65504P1531S;
            protected  int beginIp65504P1531L;
            protected  int beginIp65504P1532S;
            protected  int beginIp65504P1532L;
            protected  int beginIp65504P1533S;
            protected  int beginIp65504P1533L;
            protected  int beginIp65504P1534S;
            protected  int beginIp65504P1534L;
            protected  int beginIp65504P1535S;
            protected  int beginIp65504P1535L;
            protected  int beginIp65504P1536S;
            protected  int beginIp65504P1536L;
            protected  int beginIp65504P1537S;
            protected  int beginIp65504P1537L;
            protected  int beginIp65504P1538S;
            protected  int beginIp65504P1538L;
            protected  int beginIp65504P1539S;
            protected  int beginIp65504P1539L;
            protected  int beginIp65504P1540S;
            protected  int beginIp65504P1540L;
            protected  int beginIp65504P1541S;
            protected  int beginIp65504P1541L;
            protected  int beginIp65504P1542S;
            protected  int beginIp65504P1542L;
            protected  int beginIp65504P1543S;
            protected  int beginIp65504P1543L;
            protected  int beginIp65504P1544S;
            protected  int beginIp65504P1544L;
            protected  int beginIp65504P1545S;
            protected  int beginIp65504P1545L;
            protected  int beginIp65504P1546S;
            protected  int beginIp65504P1546L;
            protected  int beginIp65504P1547S;
            protected  int beginIp65504P1547L;
            protected  int beginIp65504P1548S;
            protected  int beginIp65504P1548L;
            protected  int beginIp65504P1549S;
            protected  int beginIp65504P1549L;
            protected  int beginIp65504P1550S;
            protected  int beginIp65504P1550L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup50Serialized
	**/
    public Ip65504PdsNamesLargeGroup50Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup50Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup50Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup50Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12148); // serialize this field at offset 12148 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup50Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12148 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup50Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_50_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1520S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1520L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1521S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1521L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1522S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1522L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1523S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1523L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1524S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1524L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1525S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1525L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1526S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1526L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1527S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1527L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1528S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1528L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1529S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1529L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1530S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1530L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1531S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1531L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1532S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1532L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1533S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1533L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1534S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1534L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1535S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1535L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1536S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1536L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1537S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1537L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1538S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1538L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1539S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1539L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1540S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1540L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1541S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1541L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1542S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1542L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1543S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1543L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1544S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1544L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1545S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1545L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1546S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1546L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1547S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1547L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1548S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1548L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1549S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1549L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1550S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1550L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1520SCounter = -1;
         public boolean isIp65504P1520SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1520SCounter != sharedCounter;
            localIp65504P1520SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1520_S_LEN = 2;
  	/**
	 * serializeIp65504P1520S
	 */
	protected void serializeIp65504P1520S(short ip65504P1520S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1520S,IP_65504_P_1520_S_LEN)
                  ,beginIp65504P1520S
                  ,IP_65504_P_1520_S_LEN
                 );
            localIp65504P1520SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1520SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1520S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1520S() {	 
			return (getShort(beginIp65504P1520S));
   	}
         int localIp65504P1520LCounter = -1;
         public boolean isIp65504P1520LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1520LCounter != sharedCounter;
            localIp65504P1520LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1520_L_LEN = 2;
  	/**
	 * serializeIp65504P1520L
	 */
	protected void serializeIp65504P1520L(short ip65504P1520L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1520L,IP_65504_P_1520_L_LEN)
                  ,beginIp65504P1520L
                  ,IP_65504_P_1520_L_LEN
                 );
            localIp65504P1520LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1520LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1520L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1520L() {	 
			return (getShort(beginIp65504P1520L));
   	}
         int localIp65504P1521SCounter = -1;
         public boolean isIp65504P1521SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1521SCounter != sharedCounter;
            localIp65504P1521SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1521_S_LEN = 2;
  	/**
	 * serializeIp65504P1521S
	 */
	protected void serializeIp65504P1521S(short ip65504P1521S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1521S,IP_65504_P_1521_S_LEN)
                  ,beginIp65504P1521S
                  ,IP_65504_P_1521_S_LEN
                 );
            localIp65504P1521SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1521SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1521S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1521S() {	 
			return (getShort(beginIp65504P1521S));
   	}
         int localIp65504P1521LCounter = -1;
         public boolean isIp65504P1521LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1521LCounter != sharedCounter;
            localIp65504P1521LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1521_L_LEN = 2;
  	/**
	 * serializeIp65504P1521L
	 */
	protected void serializeIp65504P1521L(short ip65504P1521L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1521L,IP_65504_P_1521_L_LEN)
                  ,beginIp65504P1521L
                  ,IP_65504_P_1521_L_LEN
                 );
            localIp65504P1521LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1521LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1521L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1521L() {	 
			return (getShort(beginIp65504P1521L));
   	}
         int localIp65504P1522SCounter = -1;
         public boolean isIp65504P1522SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1522SCounter != sharedCounter;
            localIp65504P1522SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1522_S_LEN = 2;
  	/**
	 * serializeIp65504P1522S
	 */
	protected void serializeIp65504P1522S(short ip65504P1522S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1522S,IP_65504_P_1522_S_LEN)
                  ,beginIp65504P1522S
                  ,IP_65504_P_1522_S_LEN
                 );
            localIp65504P1522SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1522SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1522S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1522S() {	 
			return (getShort(beginIp65504P1522S));
   	}
         int localIp65504P1522LCounter = -1;
         public boolean isIp65504P1522LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1522LCounter != sharedCounter;
            localIp65504P1522LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1522_L_LEN = 2;
  	/**
	 * serializeIp65504P1522L
	 */
	protected void serializeIp65504P1522L(short ip65504P1522L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1522L,IP_65504_P_1522_L_LEN)
                  ,beginIp65504P1522L
                  ,IP_65504_P_1522_L_LEN
                 );
            localIp65504P1522LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1522LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1522L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1522L() {	 
			return (getShort(beginIp65504P1522L));
   	}
         int localIp65504P1523SCounter = -1;
         public boolean isIp65504P1523SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1523SCounter != sharedCounter;
            localIp65504P1523SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1523_S_LEN = 2;
  	/**
	 * serializeIp65504P1523S
	 */
	protected void serializeIp65504P1523S(short ip65504P1523S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1523S,IP_65504_P_1523_S_LEN)
                  ,beginIp65504P1523S
                  ,IP_65504_P_1523_S_LEN
                 );
            localIp65504P1523SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1523SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1523S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1523S() {	 
			return (getShort(beginIp65504P1523S));
   	}
         int localIp65504P1523LCounter = -1;
         public boolean isIp65504P1523LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1523LCounter != sharedCounter;
            localIp65504P1523LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1523_L_LEN = 2;
  	/**
	 * serializeIp65504P1523L
	 */
	protected void serializeIp65504P1523L(short ip65504P1523L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1523L,IP_65504_P_1523_L_LEN)
                  ,beginIp65504P1523L
                  ,IP_65504_P_1523_L_LEN
                 );
            localIp65504P1523LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1523LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1523L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1523L() {	 
			return (getShort(beginIp65504P1523L));
   	}
         int localIp65504P1524SCounter = -1;
         public boolean isIp65504P1524SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1524SCounter != sharedCounter;
            localIp65504P1524SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1524_S_LEN = 2;
  	/**
	 * serializeIp65504P1524S
	 */
	protected void serializeIp65504P1524S(short ip65504P1524S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1524S,IP_65504_P_1524_S_LEN)
                  ,beginIp65504P1524S
                  ,IP_65504_P_1524_S_LEN
                 );
            localIp65504P1524SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1524SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1524S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1524S() {	 
			return (getShort(beginIp65504P1524S));
   	}
         int localIp65504P1524LCounter = -1;
         public boolean isIp65504P1524LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1524LCounter != sharedCounter;
            localIp65504P1524LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1524_L_LEN = 2;
  	/**
	 * serializeIp65504P1524L
	 */
	protected void serializeIp65504P1524L(short ip65504P1524L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1524L,IP_65504_P_1524_L_LEN)
                  ,beginIp65504P1524L
                  ,IP_65504_P_1524_L_LEN
                 );
            localIp65504P1524LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1524LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1524L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1524L() {	 
			return (getShort(beginIp65504P1524L));
   	}
         int localIp65504P1525SCounter = -1;
         public boolean isIp65504P1525SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1525SCounter != sharedCounter;
            localIp65504P1525SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1525_S_LEN = 2;
  	/**
	 * serializeIp65504P1525S
	 */
	protected void serializeIp65504P1525S(short ip65504P1525S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1525S,IP_65504_P_1525_S_LEN)
                  ,beginIp65504P1525S
                  ,IP_65504_P_1525_S_LEN
                 );
            localIp65504P1525SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1525SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1525S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1525S() {	 
			return (getShort(beginIp65504P1525S));
   	}
         int localIp65504P1525LCounter = -1;
         public boolean isIp65504P1525LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1525LCounter != sharedCounter;
            localIp65504P1525LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1525_L_LEN = 2;
  	/**
	 * serializeIp65504P1525L
	 */
	protected void serializeIp65504P1525L(short ip65504P1525L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1525L,IP_65504_P_1525_L_LEN)
                  ,beginIp65504P1525L
                  ,IP_65504_P_1525_L_LEN
                 );
            localIp65504P1525LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1525LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1525L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1525L() {	 
			return (getShort(beginIp65504P1525L));
   	}
         int localIp65504P1526SCounter = -1;
         public boolean isIp65504P1526SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1526SCounter != sharedCounter;
            localIp65504P1526SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1526_S_LEN = 2;
  	/**
	 * serializeIp65504P1526S
	 */
	protected void serializeIp65504P1526S(short ip65504P1526S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1526S,IP_65504_P_1526_S_LEN)
                  ,beginIp65504P1526S
                  ,IP_65504_P_1526_S_LEN
                 );
            localIp65504P1526SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1526SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1526S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1526S() {	 
			return (getShort(beginIp65504P1526S));
   	}
         int localIp65504P1526LCounter = -1;
         public boolean isIp65504P1526LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1526LCounter != sharedCounter;
            localIp65504P1526LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1526_L_LEN = 2;
  	/**
	 * serializeIp65504P1526L
	 */
	protected void serializeIp65504P1526L(short ip65504P1526L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1526L,IP_65504_P_1526_L_LEN)
                  ,beginIp65504P1526L
                  ,IP_65504_P_1526_L_LEN
                 );
            localIp65504P1526LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1526LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1526L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1526L() {	 
			return (getShort(beginIp65504P1526L));
   	}
         int localIp65504P1527SCounter = -1;
         public boolean isIp65504P1527SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1527SCounter != sharedCounter;
            localIp65504P1527SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1527_S_LEN = 2;
  	/**
	 * serializeIp65504P1527S
	 */
	protected void serializeIp65504P1527S(short ip65504P1527S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1527S,IP_65504_P_1527_S_LEN)
                  ,beginIp65504P1527S
                  ,IP_65504_P_1527_S_LEN
                 );
            localIp65504P1527SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1527SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1527S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1527S() {	 
			return (getShort(beginIp65504P1527S));
   	}
         int localIp65504P1527LCounter = -1;
         public boolean isIp65504P1527LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1527LCounter != sharedCounter;
            localIp65504P1527LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1527_L_LEN = 2;
  	/**
	 * serializeIp65504P1527L
	 */
	protected void serializeIp65504P1527L(short ip65504P1527L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1527L,IP_65504_P_1527_L_LEN)
                  ,beginIp65504P1527L
                  ,IP_65504_P_1527_L_LEN
                 );
            localIp65504P1527LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1527LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1527L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1527L() {	 
			return (getShort(beginIp65504P1527L));
   	}
         int localIp65504P1528SCounter = -1;
         public boolean isIp65504P1528SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1528SCounter != sharedCounter;
            localIp65504P1528SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1528_S_LEN = 2;
  	/**
	 * serializeIp65504P1528S
	 */
	protected void serializeIp65504P1528S(short ip65504P1528S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1528S,IP_65504_P_1528_S_LEN)
                  ,beginIp65504P1528S
                  ,IP_65504_P_1528_S_LEN
                 );
            localIp65504P1528SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1528SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1528S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1528S() {	 
			return (getShort(beginIp65504P1528S));
   	}
         int localIp65504P1528LCounter = -1;
         public boolean isIp65504P1528LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1528LCounter != sharedCounter;
            localIp65504P1528LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1528_L_LEN = 2;
  	/**
	 * serializeIp65504P1528L
	 */
	protected void serializeIp65504P1528L(short ip65504P1528L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1528L,IP_65504_P_1528_L_LEN)
                  ,beginIp65504P1528L
                  ,IP_65504_P_1528_L_LEN
                 );
            localIp65504P1528LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1528LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1528L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1528L() {	 
			return (getShort(beginIp65504P1528L));
   	}
         int localIp65504P1529SCounter = -1;
         public boolean isIp65504P1529SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1529SCounter != sharedCounter;
            localIp65504P1529SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1529_S_LEN = 2;
  	/**
	 * serializeIp65504P1529S
	 */
	protected void serializeIp65504P1529S(short ip65504P1529S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1529S,IP_65504_P_1529_S_LEN)
                  ,beginIp65504P1529S
                  ,IP_65504_P_1529_S_LEN
                 );
            localIp65504P1529SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1529SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1529S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1529S() {	 
			return (getShort(beginIp65504P1529S));
   	}
         int localIp65504P1529LCounter = -1;
         public boolean isIp65504P1529LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1529LCounter != sharedCounter;
            localIp65504P1529LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1529_L_LEN = 2;
  	/**
	 * serializeIp65504P1529L
	 */
	protected void serializeIp65504P1529L(short ip65504P1529L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1529L,IP_65504_P_1529_L_LEN)
                  ,beginIp65504P1529L
                  ,IP_65504_P_1529_L_LEN
                 );
            localIp65504P1529LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1529LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1529L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1529L() {	 
			return (getShort(beginIp65504P1529L));
   	}
         int localIp65504P1530SCounter = -1;
         public boolean isIp65504P1530SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1530SCounter != sharedCounter;
            localIp65504P1530SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1530_S_LEN = 2;
  	/**
	 * serializeIp65504P1530S
	 */
	protected void serializeIp65504P1530S(short ip65504P1530S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1530S,IP_65504_P_1530_S_LEN)
                  ,beginIp65504P1530S
                  ,IP_65504_P_1530_S_LEN
                 );
            localIp65504P1530SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1530SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1530S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1530S() {	 
			return (getShort(beginIp65504P1530S));
   	}
         int localIp65504P1530LCounter = -1;
         public boolean isIp65504P1530LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1530LCounter != sharedCounter;
            localIp65504P1530LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1530_L_LEN = 2;
  	/**
	 * serializeIp65504P1530L
	 */
	protected void serializeIp65504P1530L(short ip65504P1530L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1530L,IP_65504_P_1530_L_LEN)
                  ,beginIp65504P1530L
                  ,IP_65504_P_1530_L_LEN
                 );
            localIp65504P1530LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1530LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1530L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1530L() {	 
			return (getShort(beginIp65504P1530L));
   	}
         int localIp65504P1531SCounter = -1;
         public boolean isIp65504P1531SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1531SCounter != sharedCounter;
            localIp65504P1531SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1531_S_LEN = 2;
  	/**
	 * serializeIp65504P1531S
	 */
	protected void serializeIp65504P1531S(short ip65504P1531S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1531S,IP_65504_P_1531_S_LEN)
                  ,beginIp65504P1531S
                  ,IP_65504_P_1531_S_LEN
                 );
            localIp65504P1531SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1531SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1531S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1531S() {	 
			return (getShort(beginIp65504P1531S));
   	}
         int localIp65504P1531LCounter = -1;
         public boolean isIp65504P1531LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1531LCounter != sharedCounter;
            localIp65504P1531LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1531_L_LEN = 2;
  	/**
	 * serializeIp65504P1531L
	 */
	protected void serializeIp65504P1531L(short ip65504P1531L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1531L,IP_65504_P_1531_L_LEN)
                  ,beginIp65504P1531L
                  ,IP_65504_P_1531_L_LEN
                 );
            localIp65504P1531LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1531LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1531L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1531L() {	 
			return (getShort(beginIp65504P1531L));
   	}
         int localIp65504P1532SCounter = -1;
         public boolean isIp65504P1532SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1532SCounter != sharedCounter;
            localIp65504P1532SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1532_S_LEN = 2;
  	/**
	 * serializeIp65504P1532S
	 */
	protected void serializeIp65504P1532S(short ip65504P1532S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1532S,IP_65504_P_1532_S_LEN)
                  ,beginIp65504P1532S
                  ,IP_65504_P_1532_S_LEN
                 );
            localIp65504P1532SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1532SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1532S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1532S() {	 
			return (getShort(beginIp65504P1532S));
   	}
         int localIp65504P1532LCounter = -1;
         public boolean isIp65504P1532LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1532LCounter != sharedCounter;
            localIp65504P1532LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1532_L_LEN = 2;
  	/**
	 * serializeIp65504P1532L
	 */
	protected void serializeIp65504P1532L(short ip65504P1532L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1532L,IP_65504_P_1532_L_LEN)
                  ,beginIp65504P1532L
                  ,IP_65504_P_1532_L_LEN
                 );
            localIp65504P1532LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1532LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1532L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1532L() {	 
			return (getShort(beginIp65504P1532L));
   	}
         int localIp65504P1533SCounter = -1;
         public boolean isIp65504P1533SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1533SCounter != sharedCounter;
            localIp65504P1533SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1533_S_LEN = 2;
  	/**
	 * serializeIp65504P1533S
	 */
	protected void serializeIp65504P1533S(short ip65504P1533S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1533S,IP_65504_P_1533_S_LEN)
                  ,beginIp65504P1533S
                  ,IP_65504_P_1533_S_LEN
                 );
            localIp65504P1533SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1533SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1533S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1533S() {	 
			return (getShort(beginIp65504P1533S));
   	}
         int localIp65504P1533LCounter = -1;
         public boolean isIp65504P1533LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1533LCounter != sharedCounter;
            localIp65504P1533LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1533_L_LEN = 2;
  	/**
	 * serializeIp65504P1533L
	 */
	protected void serializeIp65504P1533L(short ip65504P1533L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1533L,IP_65504_P_1533_L_LEN)
                  ,beginIp65504P1533L
                  ,IP_65504_P_1533_L_LEN
                 );
            localIp65504P1533LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1533LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1533L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1533L() {	 
			return (getShort(beginIp65504P1533L));
   	}
         int localIp65504P1534SCounter = -1;
         public boolean isIp65504P1534SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1534SCounter != sharedCounter;
            localIp65504P1534SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1534_S_LEN = 2;
  	/**
	 * serializeIp65504P1534S
	 */
	protected void serializeIp65504P1534S(short ip65504P1534S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1534S,IP_65504_P_1534_S_LEN)
                  ,beginIp65504P1534S
                  ,IP_65504_P_1534_S_LEN
                 );
            localIp65504P1534SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1534SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1534S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1534S() {	 
			return (getShort(beginIp65504P1534S));
   	}
         int localIp65504P1534LCounter = -1;
         public boolean isIp65504P1534LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1534LCounter != sharedCounter;
            localIp65504P1534LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1534_L_LEN = 2;
  	/**
	 * serializeIp65504P1534L
	 */
	protected void serializeIp65504P1534L(short ip65504P1534L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1534L,IP_65504_P_1534_L_LEN)
                  ,beginIp65504P1534L
                  ,IP_65504_P_1534_L_LEN
                 );
            localIp65504P1534LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1534LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1534L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1534L() {	 
			return (getShort(beginIp65504P1534L));
   	}
         int localIp65504P1535SCounter = -1;
         public boolean isIp65504P1535SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1535SCounter != sharedCounter;
            localIp65504P1535SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1535_S_LEN = 2;
  	/**
	 * serializeIp65504P1535S
	 */
	protected void serializeIp65504P1535S(short ip65504P1535S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1535S,IP_65504_P_1535_S_LEN)
                  ,beginIp65504P1535S
                  ,IP_65504_P_1535_S_LEN
                 );
            localIp65504P1535SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1535SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1535S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1535S() {	 
			return (getShort(beginIp65504P1535S));
   	}
         int localIp65504P1535LCounter = -1;
         public boolean isIp65504P1535LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1535LCounter != sharedCounter;
            localIp65504P1535LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1535_L_LEN = 2;
  	/**
	 * serializeIp65504P1535L
	 */
	protected void serializeIp65504P1535L(short ip65504P1535L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1535L,IP_65504_P_1535_L_LEN)
                  ,beginIp65504P1535L
                  ,IP_65504_P_1535_L_LEN
                 );
            localIp65504P1535LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1535LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1535L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1535L() {	 
			return (getShort(beginIp65504P1535L));
   	}
         int localIp65504P1536SCounter = -1;
         public boolean isIp65504P1536SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1536SCounter != sharedCounter;
            localIp65504P1536SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1536_S_LEN = 2;
  	/**
	 * serializeIp65504P1536S
	 */
	protected void serializeIp65504P1536S(short ip65504P1536S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1536S,IP_65504_P_1536_S_LEN)
                  ,beginIp65504P1536S
                  ,IP_65504_P_1536_S_LEN
                 );
            localIp65504P1536SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1536SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1536S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1536S() {	 
			return (getShort(beginIp65504P1536S));
   	}
         int localIp65504P1536LCounter = -1;
         public boolean isIp65504P1536LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1536LCounter != sharedCounter;
            localIp65504P1536LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1536_L_LEN = 2;
  	/**
	 * serializeIp65504P1536L
	 */
	protected void serializeIp65504P1536L(short ip65504P1536L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1536L,IP_65504_P_1536_L_LEN)
                  ,beginIp65504P1536L
                  ,IP_65504_P_1536_L_LEN
                 );
            localIp65504P1536LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1536LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1536L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1536L() {	 
			return (getShort(beginIp65504P1536L));
   	}
         int localIp65504P1537SCounter = -1;
         public boolean isIp65504P1537SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1537SCounter != sharedCounter;
            localIp65504P1537SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1537_S_LEN = 2;
  	/**
	 * serializeIp65504P1537S
	 */
	protected void serializeIp65504P1537S(short ip65504P1537S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1537S,IP_65504_P_1537_S_LEN)
                  ,beginIp65504P1537S
                  ,IP_65504_P_1537_S_LEN
                 );
            localIp65504P1537SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1537SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1537S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1537S() {	 
			return (getShort(beginIp65504P1537S));
   	}
         int localIp65504P1537LCounter = -1;
         public boolean isIp65504P1537LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1537LCounter != sharedCounter;
            localIp65504P1537LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1537_L_LEN = 2;
  	/**
	 * serializeIp65504P1537L
	 */
	protected void serializeIp65504P1537L(short ip65504P1537L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1537L,IP_65504_P_1537_L_LEN)
                  ,beginIp65504P1537L
                  ,IP_65504_P_1537_L_LEN
                 );
            localIp65504P1537LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1537LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1537L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1537L() {	 
			return (getShort(beginIp65504P1537L));
   	}
         int localIp65504P1538SCounter = -1;
         public boolean isIp65504P1538SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1538SCounter != sharedCounter;
            localIp65504P1538SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1538_S_LEN = 2;
  	/**
	 * serializeIp65504P1538S
	 */
	protected void serializeIp65504P1538S(short ip65504P1538S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1538S,IP_65504_P_1538_S_LEN)
                  ,beginIp65504P1538S
                  ,IP_65504_P_1538_S_LEN
                 );
            localIp65504P1538SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1538SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1538S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1538S() {	 
			return (getShort(beginIp65504P1538S));
   	}
         int localIp65504P1538LCounter = -1;
         public boolean isIp65504P1538LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1538LCounter != sharedCounter;
            localIp65504P1538LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1538_L_LEN = 2;
  	/**
	 * serializeIp65504P1538L
	 */
	protected void serializeIp65504P1538L(short ip65504P1538L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1538L,IP_65504_P_1538_L_LEN)
                  ,beginIp65504P1538L
                  ,IP_65504_P_1538_L_LEN
                 );
            localIp65504P1538LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1538LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1538L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1538L() {	 
			return (getShort(beginIp65504P1538L));
   	}
         int localIp65504P1539SCounter = -1;
         public boolean isIp65504P1539SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1539SCounter != sharedCounter;
            localIp65504P1539SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1539_S_LEN = 2;
  	/**
	 * serializeIp65504P1539S
	 */
	protected void serializeIp65504P1539S(short ip65504P1539S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1539S,IP_65504_P_1539_S_LEN)
                  ,beginIp65504P1539S
                  ,IP_65504_P_1539_S_LEN
                 );
            localIp65504P1539SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1539SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1539S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1539S() {	 
			return (getShort(beginIp65504P1539S));
   	}
         int localIp65504P1539LCounter = -1;
         public boolean isIp65504P1539LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1539LCounter != sharedCounter;
            localIp65504P1539LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1539_L_LEN = 2;
  	/**
	 * serializeIp65504P1539L
	 */
	protected void serializeIp65504P1539L(short ip65504P1539L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1539L,IP_65504_P_1539_L_LEN)
                  ,beginIp65504P1539L
                  ,IP_65504_P_1539_L_LEN
                 );
            localIp65504P1539LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1539LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1539L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1539L() {	 
			return (getShort(beginIp65504P1539L));
   	}
         int localIp65504P1540SCounter = -1;
         public boolean isIp65504P1540SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1540SCounter != sharedCounter;
            localIp65504P1540SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1540_S_LEN = 2;
  	/**
	 * serializeIp65504P1540S
	 */
	protected void serializeIp65504P1540S(short ip65504P1540S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1540S,IP_65504_P_1540_S_LEN)
                  ,beginIp65504P1540S
                  ,IP_65504_P_1540_S_LEN
                 );
            localIp65504P1540SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1540SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1540S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1540S() {	 
			return (getShort(beginIp65504P1540S));
   	}
         int localIp65504P1540LCounter = -1;
         public boolean isIp65504P1540LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1540LCounter != sharedCounter;
            localIp65504P1540LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1540_L_LEN = 2;
  	/**
	 * serializeIp65504P1540L
	 */
	protected void serializeIp65504P1540L(short ip65504P1540L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1540L,IP_65504_P_1540_L_LEN)
                  ,beginIp65504P1540L
                  ,IP_65504_P_1540_L_LEN
                 );
            localIp65504P1540LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1540LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1540L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1540L() {	 
			return (getShort(beginIp65504P1540L));
   	}
         int localIp65504P1541SCounter = -1;
         public boolean isIp65504P1541SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1541SCounter != sharedCounter;
            localIp65504P1541SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1541_S_LEN = 2;
  	/**
	 * serializeIp65504P1541S
	 */
	protected void serializeIp65504P1541S(short ip65504P1541S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1541S,IP_65504_P_1541_S_LEN)
                  ,beginIp65504P1541S
                  ,IP_65504_P_1541_S_LEN
                 );
            localIp65504P1541SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1541SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1541S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1541S() {	 
			return (getShort(beginIp65504P1541S));
   	}
         int localIp65504P1541LCounter = -1;
         public boolean isIp65504P1541LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1541LCounter != sharedCounter;
            localIp65504P1541LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1541_L_LEN = 2;
  	/**
	 * serializeIp65504P1541L
	 */
	protected void serializeIp65504P1541L(short ip65504P1541L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1541L,IP_65504_P_1541_L_LEN)
                  ,beginIp65504P1541L
                  ,IP_65504_P_1541_L_LEN
                 );
            localIp65504P1541LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1541LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1541L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1541L() {	 
			return (getShort(beginIp65504P1541L));
   	}
         int localIp65504P1542SCounter = -1;
         public boolean isIp65504P1542SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1542SCounter != sharedCounter;
            localIp65504P1542SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1542_S_LEN = 2;
  	/**
	 * serializeIp65504P1542S
	 */
	protected void serializeIp65504P1542S(short ip65504P1542S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1542S,IP_65504_P_1542_S_LEN)
                  ,beginIp65504P1542S
                  ,IP_65504_P_1542_S_LEN
                 );
            localIp65504P1542SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1542SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1542S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1542S() {	 
			return (getShort(beginIp65504P1542S));
   	}
         int localIp65504P1542LCounter = -1;
         public boolean isIp65504P1542LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1542LCounter != sharedCounter;
            localIp65504P1542LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1542_L_LEN = 2;
  	/**
	 * serializeIp65504P1542L
	 */
	protected void serializeIp65504P1542L(short ip65504P1542L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1542L,IP_65504_P_1542_L_LEN)
                  ,beginIp65504P1542L
                  ,IP_65504_P_1542_L_LEN
                 );
            localIp65504P1542LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1542LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1542L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1542L() {	 
			return (getShort(beginIp65504P1542L));
   	}
         int localIp65504P1543SCounter = -1;
         public boolean isIp65504P1543SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1543SCounter != sharedCounter;
            localIp65504P1543SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1543_S_LEN = 2;
  	/**
	 * serializeIp65504P1543S
	 */
	protected void serializeIp65504P1543S(short ip65504P1543S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1543S,IP_65504_P_1543_S_LEN)
                  ,beginIp65504P1543S
                  ,IP_65504_P_1543_S_LEN
                 );
            localIp65504P1543SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1543SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1543S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1543S() {	 
			return (getShort(beginIp65504P1543S));
   	}
         int localIp65504P1543LCounter = -1;
         public boolean isIp65504P1543LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1543LCounter != sharedCounter;
            localIp65504P1543LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1543_L_LEN = 2;
  	/**
	 * serializeIp65504P1543L
	 */
	protected void serializeIp65504P1543L(short ip65504P1543L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1543L,IP_65504_P_1543_L_LEN)
                  ,beginIp65504P1543L
                  ,IP_65504_P_1543_L_LEN
                 );
            localIp65504P1543LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1543LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1543L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1543L() {	 
			return (getShort(beginIp65504P1543L));
   	}
         int localIp65504P1544SCounter = -1;
         public boolean isIp65504P1544SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1544SCounter != sharedCounter;
            localIp65504P1544SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1544_S_LEN = 2;
  	/**
	 * serializeIp65504P1544S
	 */
	protected void serializeIp65504P1544S(short ip65504P1544S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1544S,IP_65504_P_1544_S_LEN)
                  ,beginIp65504P1544S
                  ,IP_65504_P_1544_S_LEN
                 );
            localIp65504P1544SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1544SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1544S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1544S() {	 
			return (getShort(beginIp65504P1544S));
   	}
         int localIp65504P1544LCounter = -1;
         public boolean isIp65504P1544LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1544LCounter != sharedCounter;
            localIp65504P1544LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1544_L_LEN = 2;
  	/**
	 * serializeIp65504P1544L
	 */
	protected void serializeIp65504P1544L(short ip65504P1544L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1544L,IP_65504_P_1544_L_LEN)
                  ,beginIp65504P1544L
                  ,IP_65504_P_1544_L_LEN
                 );
            localIp65504P1544LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1544LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1544L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1544L() {	 
			return (getShort(beginIp65504P1544L));
   	}
         int localIp65504P1545SCounter = -1;
         public boolean isIp65504P1545SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1545SCounter != sharedCounter;
            localIp65504P1545SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1545_S_LEN = 2;
  	/**
	 * serializeIp65504P1545S
	 */
	protected void serializeIp65504P1545S(short ip65504P1545S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1545S,IP_65504_P_1545_S_LEN)
                  ,beginIp65504P1545S
                  ,IP_65504_P_1545_S_LEN
                 );
            localIp65504P1545SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1545SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1545S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1545S() {	 
			return (getShort(beginIp65504P1545S));
   	}
         int localIp65504P1545LCounter = -1;
         public boolean isIp65504P1545LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1545LCounter != sharedCounter;
            localIp65504P1545LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1545_L_LEN = 2;
  	/**
	 * serializeIp65504P1545L
	 */
	protected void serializeIp65504P1545L(short ip65504P1545L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1545L,IP_65504_P_1545_L_LEN)
                  ,beginIp65504P1545L
                  ,IP_65504_P_1545_L_LEN
                 );
            localIp65504P1545LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1545LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1545L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1545L() {	 
			return (getShort(beginIp65504P1545L));
   	}
         int localIp65504P1546SCounter = -1;
         public boolean isIp65504P1546SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1546SCounter != sharedCounter;
            localIp65504P1546SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1546_S_LEN = 2;
  	/**
	 * serializeIp65504P1546S
	 */
	protected void serializeIp65504P1546S(short ip65504P1546S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1546S,IP_65504_P_1546_S_LEN)
                  ,beginIp65504P1546S
                  ,IP_65504_P_1546_S_LEN
                 );
            localIp65504P1546SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1546SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1546S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1546S() {	 
			return (getShort(beginIp65504P1546S));
   	}
         int localIp65504P1546LCounter = -1;
         public boolean isIp65504P1546LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1546LCounter != sharedCounter;
            localIp65504P1546LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1546_L_LEN = 2;
  	/**
	 * serializeIp65504P1546L
	 */
	protected void serializeIp65504P1546L(short ip65504P1546L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1546L,IP_65504_P_1546_L_LEN)
                  ,beginIp65504P1546L
                  ,IP_65504_P_1546_L_LEN
                 );
            localIp65504P1546LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1546LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1546L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1546L() {	 
			return (getShort(beginIp65504P1546L));
   	}
         int localIp65504P1547SCounter = -1;
         public boolean isIp65504P1547SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1547SCounter != sharedCounter;
            localIp65504P1547SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1547_S_LEN = 2;
  	/**
	 * serializeIp65504P1547S
	 */
	protected void serializeIp65504P1547S(short ip65504P1547S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1547S,IP_65504_P_1547_S_LEN)
                  ,beginIp65504P1547S
                  ,IP_65504_P_1547_S_LEN
                 );
            localIp65504P1547SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1547SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1547S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1547S() {	 
			return (getShort(beginIp65504P1547S));
   	}
         int localIp65504P1547LCounter = -1;
         public boolean isIp65504P1547LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1547LCounter != sharedCounter;
            localIp65504P1547LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1547_L_LEN = 2;
  	/**
	 * serializeIp65504P1547L
	 */
	protected void serializeIp65504P1547L(short ip65504P1547L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1547L,IP_65504_P_1547_L_LEN)
                  ,beginIp65504P1547L
                  ,IP_65504_P_1547_L_LEN
                 );
            localIp65504P1547LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1547LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1547L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1547L() {	 
			return (getShort(beginIp65504P1547L));
   	}
         int localIp65504P1548SCounter = -1;
         public boolean isIp65504P1548SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1548SCounter != sharedCounter;
            localIp65504P1548SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1548_S_LEN = 2;
  	/**
	 * serializeIp65504P1548S
	 */
	protected void serializeIp65504P1548S(short ip65504P1548S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1548S,IP_65504_P_1548_S_LEN)
                  ,beginIp65504P1548S
                  ,IP_65504_P_1548_S_LEN
                 );
            localIp65504P1548SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1548SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1548S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1548S() {	 
			return (getShort(beginIp65504P1548S));
   	}
         int localIp65504P1548LCounter = -1;
         public boolean isIp65504P1548LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1548LCounter != sharedCounter;
            localIp65504P1548LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1548_L_LEN = 2;
  	/**
	 * serializeIp65504P1548L
	 */
	protected void serializeIp65504P1548L(short ip65504P1548L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1548L,IP_65504_P_1548_L_LEN)
                  ,beginIp65504P1548L
                  ,IP_65504_P_1548_L_LEN
                 );
            localIp65504P1548LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1548LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1548L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1548L() {	 
			return (getShort(beginIp65504P1548L));
   	}
         int localIp65504P1549SCounter = -1;
         public boolean isIp65504P1549SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1549SCounter != sharedCounter;
            localIp65504P1549SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1549_S_LEN = 2;
  	/**
	 * serializeIp65504P1549S
	 */
	protected void serializeIp65504P1549S(short ip65504P1549S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1549S,IP_65504_P_1549_S_LEN)
                  ,beginIp65504P1549S
                  ,IP_65504_P_1549_S_LEN
                 );
            localIp65504P1549SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1549SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1549S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1549S() {	 
			return (getShort(beginIp65504P1549S));
   	}
         int localIp65504P1549LCounter = -1;
         public boolean isIp65504P1549LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1549LCounter != sharedCounter;
            localIp65504P1549LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1549_L_LEN = 2;
  	/**
	 * serializeIp65504P1549L
	 */
	protected void serializeIp65504P1549L(short ip65504P1549L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1549L,IP_65504_P_1549_L_LEN)
                  ,beginIp65504P1549L
                  ,IP_65504_P_1549_L_LEN
                 );
            localIp65504P1549LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1549LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1549L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1549L() {	 
			return (getShort(beginIp65504P1549L));
   	}
         int localIp65504P1550SCounter = -1;
         public boolean isIp65504P1550SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1550SCounter != sharedCounter;
            localIp65504P1550SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1550_S_LEN = 2;
  	/**
	 * serializeIp65504P1550S
	 */
	protected void serializeIp65504P1550S(short ip65504P1550S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1550S,IP_65504_P_1550_S_LEN)
                  ,beginIp65504P1550S
                  ,IP_65504_P_1550_S_LEN
                 );
            localIp65504P1550SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1550SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1550S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1550S() {	 
			return (getShort(beginIp65504P1550S));
   	}
         int localIp65504P1550LCounter = -1;
         public boolean isIp65504P1550LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1550LCounter != sharedCounter;
            localIp65504P1550LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1550_L_LEN = 2;
  	/**
	 * serializeIp65504P1550L
	 */
	protected void serializeIp65504P1550L(short ip65504P1550L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1550L,IP_65504_P_1550_L_LEN)
                  ,beginIp65504P1550L
                  ,IP_65504_P_1550_L_LEN
                 );
            localIp65504P1550LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1550LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1550L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1550L() {	 
			return (getShort(beginIp65504P1550L));
   	}




}
  
