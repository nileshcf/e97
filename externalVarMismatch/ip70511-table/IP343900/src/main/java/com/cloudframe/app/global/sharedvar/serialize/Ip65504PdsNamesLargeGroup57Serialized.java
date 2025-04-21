package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup57Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup57Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup57Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_57_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1737S;
            protected  int beginIp65504P1737L;
            protected  int beginIp65504P1738S;
            protected  int beginIp65504P1738L;
            protected  int beginIp65504P1739S;
            protected  int beginIp65504P1739L;
            protected  int beginIp65504P1740S;
            protected  int beginIp65504P1740L;
            protected  int beginIp65504P1741S;
            protected  int beginIp65504P1741L;
            protected  int beginIp65504P1742S;
            protected  int beginIp65504P1742L;
            protected  int beginIp65504P1743S;
            protected  int beginIp65504P1743L;
            protected  int beginIp65504P1744S;
            protected  int beginIp65504P1744L;
            protected  int beginIp65504P1745S;
            protected  int beginIp65504P1745L;
            protected  int beginIp65504P1746S;
            protected  int beginIp65504P1746L;
            protected  int beginIp65504P1747S;
            protected  int beginIp65504P1747L;
            protected  int beginIp65504P1748S;
            protected  int beginIp65504P1748L;
            protected  int beginIp65504P1749S;
            protected  int beginIp65504P1749L;
            protected  int beginIp65504P1750S;
            protected  int beginIp65504P1750L;
            protected  int beginIp65504P1751S;
            protected  int beginIp65504P1751L;
            protected  int beginIp65504P1752S;
            protected  int beginIp65504P1752L;
            protected  int beginIp65504P1753S;
            protected  int beginIp65504P1753L;
            protected  int beginIp65504P1754S;
            protected  int beginIp65504P1754L;
            protected  int beginIp65504P1755S;
            protected  int beginIp65504P1755L;
            protected  int beginIp65504P1756S;
            protected  int beginIp65504P1756L;
            protected  int beginIp65504P1757S;
            protected  int beginIp65504P1757L;
            protected  int beginIp65504P1758S;
            protected  int beginIp65504P1758L;
            protected  int beginIp65504P1759S;
            protected  int beginIp65504P1759L;
            protected  int beginIp65504P1760S;
            protected  int beginIp65504P1760L;
            protected  int beginIp65504P1761S;
            protected  int beginIp65504P1761L;
            protected  int beginIp65504P1762S;
            protected  int beginIp65504P1762L;
            protected  int beginIp65504P1763S;
            protected  int beginIp65504P1763L;
            protected  int beginIp65504P1764S;
            protected  int beginIp65504P1764L;
            protected  int beginIp65504P1765S;
            protected  int beginIp65504P1765L;
            protected  int beginIp65504P1766S;
            protected  int beginIp65504P1766L;
            protected  int beginIp65504P1767S;
            protected  int beginIp65504P1767L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup57Serialized
	**/
    public Ip65504PdsNamesLargeGroup57Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup57Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup57Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup57Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13884); // serialize this field at offset 13884 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup57Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13884 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup57Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_57_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1737S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1737L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1738S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1738L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1739S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1739L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1740S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1740L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1741S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1741L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1742S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1742L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1743S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1743L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1744S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1744L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1745S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1745L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1746S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1746L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1747S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1747L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1748S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1748L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1749S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1749L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1750S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1750L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1751S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1751L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1752S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1752L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1753S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1753L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1754S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1754L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1755S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1755L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1756S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1756L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1757S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1757L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1758S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1758L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1759S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1759L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1760S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1760L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1761S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1761L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1762S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1762L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1763S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1763L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1764S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1764L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1765S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1765L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1766S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1766L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1767S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1767L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1737SCounter = -1;
         public boolean isIp65504P1737SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1737SCounter != sharedCounter;
            localIp65504P1737SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1737_S_LEN = 2;
  	/**
	 * serializeIp65504P1737S
	 */
	protected void serializeIp65504P1737S(short ip65504P1737S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1737S,IP_65504_P_1737_S_LEN)
                  ,beginIp65504P1737S
                  ,IP_65504_P_1737_S_LEN
                 );
            localIp65504P1737SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1737SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1737S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1737S() {	 
			return (getShort(beginIp65504P1737S));
   	}
         int localIp65504P1737LCounter = -1;
         public boolean isIp65504P1737LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1737LCounter != sharedCounter;
            localIp65504P1737LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1737_L_LEN = 2;
  	/**
	 * serializeIp65504P1737L
	 */
	protected void serializeIp65504P1737L(short ip65504P1737L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1737L,IP_65504_P_1737_L_LEN)
                  ,beginIp65504P1737L
                  ,IP_65504_P_1737_L_LEN
                 );
            localIp65504P1737LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1737LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1737L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1737L() {	 
			return (getShort(beginIp65504P1737L));
   	}
         int localIp65504P1738SCounter = -1;
         public boolean isIp65504P1738SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1738SCounter != sharedCounter;
            localIp65504P1738SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1738_S_LEN = 2;
  	/**
	 * serializeIp65504P1738S
	 */
	protected void serializeIp65504P1738S(short ip65504P1738S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1738S,IP_65504_P_1738_S_LEN)
                  ,beginIp65504P1738S
                  ,IP_65504_P_1738_S_LEN
                 );
            localIp65504P1738SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1738SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1738S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1738S() {	 
			return (getShort(beginIp65504P1738S));
   	}
         int localIp65504P1738LCounter = -1;
         public boolean isIp65504P1738LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1738LCounter != sharedCounter;
            localIp65504P1738LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1738_L_LEN = 2;
  	/**
	 * serializeIp65504P1738L
	 */
	protected void serializeIp65504P1738L(short ip65504P1738L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1738L,IP_65504_P_1738_L_LEN)
                  ,beginIp65504P1738L
                  ,IP_65504_P_1738_L_LEN
                 );
            localIp65504P1738LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1738LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1738L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1738L() {	 
			return (getShort(beginIp65504P1738L));
   	}
         int localIp65504P1739SCounter = -1;
         public boolean isIp65504P1739SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1739SCounter != sharedCounter;
            localIp65504P1739SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1739_S_LEN = 2;
  	/**
	 * serializeIp65504P1739S
	 */
	protected void serializeIp65504P1739S(short ip65504P1739S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1739S,IP_65504_P_1739_S_LEN)
                  ,beginIp65504P1739S
                  ,IP_65504_P_1739_S_LEN
                 );
            localIp65504P1739SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1739SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1739S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1739S() {	 
			return (getShort(beginIp65504P1739S));
   	}
         int localIp65504P1739LCounter = -1;
         public boolean isIp65504P1739LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1739LCounter != sharedCounter;
            localIp65504P1739LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1739_L_LEN = 2;
  	/**
	 * serializeIp65504P1739L
	 */
	protected void serializeIp65504P1739L(short ip65504P1739L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1739L,IP_65504_P_1739_L_LEN)
                  ,beginIp65504P1739L
                  ,IP_65504_P_1739_L_LEN
                 );
            localIp65504P1739LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1739LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1739L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1739L() {	 
			return (getShort(beginIp65504P1739L));
   	}
         int localIp65504P1740SCounter = -1;
         public boolean isIp65504P1740SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1740SCounter != sharedCounter;
            localIp65504P1740SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1740_S_LEN = 2;
  	/**
	 * serializeIp65504P1740S
	 */
	protected void serializeIp65504P1740S(short ip65504P1740S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1740S,IP_65504_P_1740_S_LEN)
                  ,beginIp65504P1740S
                  ,IP_65504_P_1740_S_LEN
                 );
            localIp65504P1740SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1740SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1740S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1740S() {	 
			return (getShort(beginIp65504P1740S));
   	}
         int localIp65504P1740LCounter = -1;
         public boolean isIp65504P1740LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1740LCounter != sharedCounter;
            localIp65504P1740LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1740_L_LEN = 2;
  	/**
	 * serializeIp65504P1740L
	 */
	protected void serializeIp65504P1740L(short ip65504P1740L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1740L,IP_65504_P_1740_L_LEN)
                  ,beginIp65504P1740L
                  ,IP_65504_P_1740_L_LEN
                 );
            localIp65504P1740LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1740LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1740L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1740L() {	 
			return (getShort(beginIp65504P1740L));
   	}
         int localIp65504P1741SCounter = -1;
         public boolean isIp65504P1741SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1741SCounter != sharedCounter;
            localIp65504P1741SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1741_S_LEN = 2;
  	/**
	 * serializeIp65504P1741S
	 */
	protected void serializeIp65504P1741S(short ip65504P1741S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1741S,IP_65504_P_1741_S_LEN)
                  ,beginIp65504P1741S
                  ,IP_65504_P_1741_S_LEN
                 );
            localIp65504P1741SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1741SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1741S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1741S() {	 
			return (getShort(beginIp65504P1741S));
   	}
         int localIp65504P1741LCounter = -1;
         public boolean isIp65504P1741LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1741LCounter != sharedCounter;
            localIp65504P1741LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1741_L_LEN = 2;
  	/**
	 * serializeIp65504P1741L
	 */
	protected void serializeIp65504P1741L(short ip65504P1741L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1741L,IP_65504_P_1741_L_LEN)
                  ,beginIp65504P1741L
                  ,IP_65504_P_1741_L_LEN
                 );
            localIp65504P1741LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1741LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1741L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1741L() {	 
			return (getShort(beginIp65504P1741L));
   	}
         int localIp65504P1742SCounter = -1;
         public boolean isIp65504P1742SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1742SCounter != sharedCounter;
            localIp65504P1742SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1742_S_LEN = 2;
  	/**
	 * serializeIp65504P1742S
	 */
	protected void serializeIp65504P1742S(short ip65504P1742S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1742S,IP_65504_P_1742_S_LEN)
                  ,beginIp65504P1742S
                  ,IP_65504_P_1742_S_LEN
                 );
            localIp65504P1742SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1742SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1742S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1742S() {	 
			return (getShort(beginIp65504P1742S));
   	}
         int localIp65504P1742LCounter = -1;
         public boolean isIp65504P1742LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1742LCounter != sharedCounter;
            localIp65504P1742LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1742_L_LEN = 2;
  	/**
	 * serializeIp65504P1742L
	 */
	protected void serializeIp65504P1742L(short ip65504P1742L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1742L,IP_65504_P_1742_L_LEN)
                  ,beginIp65504P1742L
                  ,IP_65504_P_1742_L_LEN
                 );
            localIp65504P1742LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1742LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1742L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1742L() {	 
			return (getShort(beginIp65504P1742L));
   	}
         int localIp65504P1743SCounter = -1;
         public boolean isIp65504P1743SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1743SCounter != sharedCounter;
            localIp65504P1743SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1743_S_LEN = 2;
  	/**
	 * serializeIp65504P1743S
	 */
	protected void serializeIp65504P1743S(short ip65504P1743S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1743S,IP_65504_P_1743_S_LEN)
                  ,beginIp65504P1743S
                  ,IP_65504_P_1743_S_LEN
                 );
            localIp65504P1743SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1743SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1743S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1743S() {	 
			return (getShort(beginIp65504P1743S));
   	}
         int localIp65504P1743LCounter = -1;
         public boolean isIp65504P1743LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1743LCounter != sharedCounter;
            localIp65504P1743LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1743_L_LEN = 2;
  	/**
	 * serializeIp65504P1743L
	 */
	protected void serializeIp65504P1743L(short ip65504P1743L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1743L,IP_65504_P_1743_L_LEN)
                  ,beginIp65504P1743L
                  ,IP_65504_P_1743_L_LEN
                 );
            localIp65504P1743LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1743LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1743L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1743L() {	 
			return (getShort(beginIp65504P1743L));
   	}
         int localIp65504P1744SCounter = -1;
         public boolean isIp65504P1744SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1744SCounter != sharedCounter;
            localIp65504P1744SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1744_S_LEN = 2;
  	/**
	 * serializeIp65504P1744S
	 */
	protected void serializeIp65504P1744S(short ip65504P1744S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1744S,IP_65504_P_1744_S_LEN)
                  ,beginIp65504P1744S
                  ,IP_65504_P_1744_S_LEN
                 );
            localIp65504P1744SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1744SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1744S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1744S() {	 
			return (getShort(beginIp65504P1744S));
   	}
         int localIp65504P1744LCounter = -1;
         public boolean isIp65504P1744LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1744LCounter != sharedCounter;
            localIp65504P1744LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1744_L_LEN = 2;
  	/**
	 * serializeIp65504P1744L
	 */
	protected void serializeIp65504P1744L(short ip65504P1744L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1744L,IP_65504_P_1744_L_LEN)
                  ,beginIp65504P1744L
                  ,IP_65504_P_1744_L_LEN
                 );
            localIp65504P1744LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1744LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1744L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1744L() {	 
			return (getShort(beginIp65504P1744L));
   	}
         int localIp65504P1745SCounter = -1;
         public boolean isIp65504P1745SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1745SCounter != sharedCounter;
            localIp65504P1745SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1745_S_LEN = 2;
  	/**
	 * serializeIp65504P1745S
	 */
	protected void serializeIp65504P1745S(short ip65504P1745S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1745S,IP_65504_P_1745_S_LEN)
                  ,beginIp65504P1745S
                  ,IP_65504_P_1745_S_LEN
                 );
            localIp65504P1745SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1745SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1745S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1745S() {	 
			return (getShort(beginIp65504P1745S));
   	}
         int localIp65504P1745LCounter = -1;
         public boolean isIp65504P1745LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1745LCounter != sharedCounter;
            localIp65504P1745LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1745_L_LEN = 2;
  	/**
	 * serializeIp65504P1745L
	 */
	protected void serializeIp65504P1745L(short ip65504P1745L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1745L,IP_65504_P_1745_L_LEN)
                  ,beginIp65504P1745L
                  ,IP_65504_P_1745_L_LEN
                 );
            localIp65504P1745LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1745LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1745L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1745L() {	 
			return (getShort(beginIp65504P1745L));
   	}
         int localIp65504P1746SCounter = -1;
         public boolean isIp65504P1746SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1746SCounter != sharedCounter;
            localIp65504P1746SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1746_S_LEN = 2;
  	/**
	 * serializeIp65504P1746S
	 */
	protected void serializeIp65504P1746S(short ip65504P1746S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1746S,IP_65504_P_1746_S_LEN)
                  ,beginIp65504P1746S
                  ,IP_65504_P_1746_S_LEN
                 );
            localIp65504P1746SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1746SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1746S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1746S() {	 
			return (getShort(beginIp65504P1746S));
   	}
         int localIp65504P1746LCounter = -1;
         public boolean isIp65504P1746LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1746LCounter != sharedCounter;
            localIp65504P1746LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1746_L_LEN = 2;
  	/**
	 * serializeIp65504P1746L
	 */
	protected void serializeIp65504P1746L(short ip65504P1746L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1746L,IP_65504_P_1746_L_LEN)
                  ,beginIp65504P1746L
                  ,IP_65504_P_1746_L_LEN
                 );
            localIp65504P1746LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1746LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1746L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1746L() {	 
			return (getShort(beginIp65504P1746L));
   	}
         int localIp65504P1747SCounter = -1;
         public boolean isIp65504P1747SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1747SCounter != sharedCounter;
            localIp65504P1747SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1747_S_LEN = 2;
  	/**
	 * serializeIp65504P1747S
	 */
	protected void serializeIp65504P1747S(short ip65504P1747S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1747S,IP_65504_P_1747_S_LEN)
                  ,beginIp65504P1747S
                  ,IP_65504_P_1747_S_LEN
                 );
            localIp65504P1747SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1747SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1747S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1747S() {	 
			return (getShort(beginIp65504P1747S));
   	}
         int localIp65504P1747LCounter = -1;
         public boolean isIp65504P1747LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1747LCounter != sharedCounter;
            localIp65504P1747LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1747_L_LEN = 2;
  	/**
	 * serializeIp65504P1747L
	 */
	protected void serializeIp65504P1747L(short ip65504P1747L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1747L,IP_65504_P_1747_L_LEN)
                  ,beginIp65504P1747L
                  ,IP_65504_P_1747_L_LEN
                 );
            localIp65504P1747LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1747LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1747L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1747L() {	 
			return (getShort(beginIp65504P1747L));
   	}
         int localIp65504P1748SCounter = -1;
         public boolean isIp65504P1748SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1748SCounter != sharedCounter;
            localIp65504P1748SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1748_S_LEN = 2;
  	/**
	 * serializeIp65504P1748S
	 */
	protected void serializeIp65504P1748S(short ip65504P1748S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1748S,IP_65504_P_1748_S_LEN)
                  ,beginIp65504P1748S
                  ,IP_65504_P_1748_S_LEN
                 );
            localIp65504P1748SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1748SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1748S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1748S() {	 
			return (getShort(beginIp65504P1748S));
   	}
         int localIp65504P1748LCounter = -1;
         public boolean isIp65504P1748LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1748LCounter != sharedCounter;
            localIp65504P1748LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1748_L_LEN = 2;
  	/**
	 * serializeIp65504P1748L
	 */
	protected void serializeIp65504P1748L(short ip65504P1748L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1748L,IP_65504_P_1748_L_LEN)
                  ,beginIp65504P1748L
                  ,IP_65504_P_1748_L_LEN
                 );
            localIp65504P1748LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1748LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1748L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1748L() {	 
			return (getShort(beginIp65504P1748L));
   	}
         int localIp65504P1749SCounter = -1;
         public boolean isIp65504P1749SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1749SCounter != sharedCounter;
            localIp65504P1749SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1749_S_LEN = 2;
  	/**
	 * serializeIp65504P1749S
	 */
	protected void serializeIp65504P1749S(short ip65504P1749S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1749S,IP_65504_P_1749_S_LEN)
                  ,beginIp65504P1749S
                  ,IP_65504_P_1749_S_LEN
                 );
            localIp65504P1749SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1749SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1749S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1749S() {	 
			return (getShort(beginIp65504P1749S));
   	}
         int localIp65504P1749LCounter = -1;
         public boolean isIp65504P1749LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1749LCounter != sharedCounter;
            localIp65504P1749LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1749_L_LEN = 2;
  	/**
	 * serializeIp65504P1749L
	 */
	protected void serializeIp65504P1749L(short ip65504P1749L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1749L,IP_65504_P_1749_L_LEN)
                  ,beginIp65504P1749L
                  ,IP_65504_P_1749_L_LEN
                 );
            localIp65504P1749LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1749LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1749L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1749L() {	 
			return (getShort(beginIp65504P1749L));
   	}
         int localIp65504P1750SCounter = -1;
         public boolean isIp65504P1750SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1750SCounter != sharedCounter;
            localIp65504P1750SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1750_S_LEN = 2;
  	/**
	 * serializeIp65504P1750S
	 */
	protected void serializeIp65504P1750S(short ip65504P1750S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1750S,IP_65504_P_1750_S_LEN)
                  ,beginIp65504P1750S
                  ,IP_65504_P_1750_S_LEN
                 );
            localIp65504P1750SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1750SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1750S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1750S() {	 
			return (getShort(beginIp65504P1750S));
   	}
         int localIp65504P1750LCounter = -1;
         public boolean isIp65504P1750LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1750LCounter != sharedCounter;
            localIp65504P1750LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1750_L_LEN = 2;
  	/**
	 * serializeIp65504P1750L
	 */
	protected void serializeIp65504P1750L(short ip65504P1750L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1750L,IP_65504_P_1750_L_LEN)
                  ,beginIp65504P1750L
                  ,IP_65504_P_1750_L_LEN
                 );
            localIp65504P1750LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1750LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1750L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1750L() {	 
			return (getShort(beginIp65504P1750L));
   	}
         int localIp65504P1751SCounter = -1;
         public boolean isIp65504P1751SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1751SCounter != sharedCounter;
            localIp65504P1751SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1751_S_LEN = 2;
  	/**
	 * serializeIp65504P1751S
	 */
	protected void serializeIp65504P1751S(short ip65504P1751S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1751S,IP_65504_P_1751_S_LEN)
                  ,beginIp65504P1751S
                  ,IP_65504_P_1751_S_LEN
                 );
            localIp65504P1751SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1751SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1751S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1751S() {	 
			return (getShort(beginIp65504P1751S));
   	}
         int localIp65504P1751LCounter = -1;
         public boolean isIp65504P1751LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1751LCounter != sharedCounter;
            localIp65504P1751LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1751_L_LEN = 2;
  	/**
	 * serializeIp65504P1751L
	 */
	protected void serializeIp65504P1751L(short ip65504P1751L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1751L,IP_65504_P_1751_L_LEN)
                  ,beginIp65504P1751L
                  ,IP_65504_P_1751_L_LEN
                 );
            localIp65504P1751LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1751LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1751L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1751L() {	 
			return (getShort(beginIp65504P1751L));
   	}
         int localIp65504P1752SCounter = -1;
         public boolean isIp65504P1752SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1752SCounter != sharedCounter;
            localIp65504P1752SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1752_S_LEN = 2;
  	/**
	 * serializeIp65504P1752S
	 */
	protected void serializeIp65504P1752S(short ip65504P1752S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1752S,IP_65504_P_1752_S_LEN)
                  ,beginIp65504P1752S
                  ,IP_65504_P_1752_S_LEN
                 );
            localIp65504P1752SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1752SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1752S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1752S() {	 
			return (getShort(beginIp65504P1752S));
   	}
         int localIp65504P1752LCounter = -1;
         public boolean isIp65504P1752LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1752LCounter != sharedCounter;
            localIp65504P1752LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1752_L_LEN = 2;
  	/**
	 * serializeIp65504P1752L
	 */
	protected void serializeIp65504P1752L(short ip65504P1752L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1752L,IP_65504_P_1752_L_LEN)
                  ,beginIp65504P1752L
                  ,IP_65504_P_1752_L_LEN
                 );
            localIp65504P1752LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1752LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1752L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1752L() {	 
			return (getShort(beginIp65504P1752L));
   	}
         int localIp65504P1753SCounter = -1;
         public boolean isIp65504P1753SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1753SCounter != sharedCounter;
            localIp65504P1753SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1753_S_LEN = 2;
  	/**
	 * serializeIp65504P1753S
	 */
	protected void serializeIp65504P1753S(short ip65504P1753S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1753S,IP_65504_P_1753_S_LEN)
                  ,beginIp65504P1753S
                  ,IP_65504_P_1753_S_LEN
                 );
            localIp65504P1753SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1753SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1753S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1753S() {	 
			return (getShort(beginIp65504P1753S));
   	}
         int localIp65504P1753LCounter = -1;
         public boolean isIp65504P1753LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1753LCounter != sharedCounter;
            localIp65504P1753LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1753_L_LEN = 2;
  	/**
	 * serializeIp65504P1753L
	 */
	protected void serializeIp65504P1753L(short ip65504P1753L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1753L,IP_65504_P_1753_L_LEN)
                  ,beginIp65504P1753L
                  ,IP_65504_P_1753_L_LEN
                 );
            localIp65504P1753LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1753LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1753L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1753L() {	 
			return (getShort(beginIp65504P1753L));
   	}
         int localIp65504P1754SCounter = -1;
         public boolean isIp65504P1754SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1754SCounter != sharedCounter;
            localIp65504P1754SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1754_S_LEN = 2;
  	/**
	 * serializeIp65504P1754S
	 */
	protected void serializeIp65504P1754S(short ip65504P1754S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1754S,IP_65504_P_1754_S_LEN)
                  ,beginIp65504P1754S
                  ,IP_65504_P_1754_S_LEN
                 );
            localIp65504P1754SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1754SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1754S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1754S() {	 
			return (getShort(beginIp65504P1754S));
   	}
         int localIp65504P1754LCounter = -1;
         public boolean isIp65504P1754LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1754LCounter != sharedCounter;
            localIp65504P1754LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1754_L_LEN = 2;
  	/**
	 * serializeIp65504P1754L
	 */
	protected void serializeIp65504P1754L(short ip65504P1754L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1754L,IP_65504_P_1754_L_LEN)
                  ,beginIp65504P1754L
                  ,IP_65504_P_1754_L_LEN
                 );
            localIp65504P1754LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1754LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1754L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1754L() {	 
			return (getShort(beginIp65504P1754L));
   	}
         int localIp65504P1755SCounter = -1;
         public boolean isIp65504P1755SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1755SCounter != sharedCounter;
            localIp65504P1755SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1755_S_LEN = 2;
  	/**
	 * serializeIp65504P1755S
	 */
	protected void serializeIp65504P1755S(short ip65504P1755S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1755S,IP_65504_P_1755_S_LEN)
                  ,beginIp65504P1755S
                  ,IP_65504_P_1755_S_LEN
                 );
            localIp65504P1755SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1755SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1755S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1755S() {	 
			return (getShort(beginIp65504P1755S));
   	}
         int localIp65504P1755LCounter = -1;
         public boolean isIp65504P1755LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1755LCounter != sharedCounter;
            localIp65504P1755LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1755_L_LEN = 2;
  	/**
	 * serializeIp65504P1755L
	 */
	protected void serializeIp65504P1755L(short ip65504P1755L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1755L,IP_65504_P_1755_L_LEN)
                  ,beginIp65504P1755L
                  ,IP_65504_P_1755_L_LEN
                 );
            localIp65504P1755LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1755LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1755L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1755L() {	 
			return (getShort(beginIp65504P1755L));
   	}
         int localIp65504P1756SCounter = -1;
         public boolean isIp65504P1756SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1756SCounter != sharedCounter;
            localIp65504P1756SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1756_S_LEN = 2;
  	/**
	 * serializeIp65504P1756S
	 */
	protected void serializeIp65504P1756S(short ip65504P1756S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1756S,IP_65504_P_1756_S_LEN)
                  ,beginIp65504P1756S
                  ,IP_65504_P_1756_S_LEN
                 );
            localIp65504P1756SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1756SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1756S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1756S() {	 
			return (getShort(beginIp65504P1756S));
   	}
         int localIp65504P1756LCounter = -1;
         public boolean isIp65504P1756LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1756LCounter != sharedCounter;
            localIp65504P1756LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1756_L_LEN = 2;
  	/**
	 * serializeIp65504P1756L
	 */
	protected void serializeIp65504P1756L(short ip65504P1756L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1756L,IP_65504_P_1756_L_LEN)
                  ,beginIp65504P1756L
                  ,IP_65504_P_1756_L_LEN
                 );
            localIp65504P1756LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1756LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1756L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1756L() {	 
			return (getShort(beginIp65504P1756L));
   	}
         int localIp65504P1757SCounter = -1;
         public boolean isIp65504P1757SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1757SCounter != sharedCounter;
            localIp65504P1757SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1757_S_LEN = 2;
  	/**
	 * serializeIp65504P1757S
	 */
	protected void serializeIp65504P1757S(short ip65504P1757S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1757S,IP_65504_P_1757_S_LEN)
                  ,beginIp65504P1757S
                  ,IP_65504_P_1757_S_LEN
                 );
            localIp65504P1757SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1757SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1757S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1757S() {	 
			return (getShort(beginIp65504P1757S));
   	}
         int localIp65504P1757LCounter = -1;
         public boolean isIp65504P1757LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1757LCounter != sharedCounter;
            localIp65504P1757LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1757_L_LEN = 2;
  	/**
	 * serializeIp65504P1757L
	 */
	protected void serializeIp65504P1757L(short ip65504P1757L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1757L,IP_65504_P_1757_L_LEN)
                  ,beginIp65504P1757L
                  ,IP_65504_P_1757_L_LEN
                 );
            localIp65504P1757LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1757LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1757L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1757L() {	 
			return (getShort(beginIp65504P1757L));
   	}
         int localIp65504P1758SCounter = -1;
         public boolean isIp65504P1758SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1758SCounter != sharedCounter;
            localIp65504P1758SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1758_S_LEN = 2;
  	/**
	 * serializeIp65504P1758S
	 */
	protected void serializeIp65504P1758S(short ip65504P1758S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1758S,IP_65504_P_1758_S_LEN)
                  ,beginIp65504P1758S
                  ,IP_65504_P_1758_S_LEN
                 );
            localIp65504P1758SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1758SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1758S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1758S() {	 
			return (getShort(beginIp65504P1758S));
   	}
         int localIp65504P1758LCounter = -1;
         public boolean isIp65504P1758LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1758LCounter != sharedCounter;
            localIp65504P1758LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1758_L_LEN = 2;
  	/**
	 * serializeIp65504P1758L
	 */
	protected void serializeIp65504P1758L(short ip65504P1758L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1758L,IP_65504_P_1758_L_LEN)
                  ,beginIp65504P1758L
                  ,IP_65504_P_1758_L_LEN
                 );
            localIp65504P1758LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1758LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1758L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1758L() {	 
			return (getShort(beginIp65504P1758L));
   	}
         int localIp65504P1759SCounter = -1;
         public boolean isIp65504P1759SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1759SCounter != sharedCounter;
            localIp65504P1759SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1759_S_LEN = 2;
  	/**
	 * serializeIp65504P1759S
	 */
	protected void serializeIp65504P1759S(short ip65504P1759S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1759S,IP_65504_P_1759_S_LEN)
                  ,beginIp65504P1759S
                  ,IP_65504_P_1759_S_LEN
                 );
            localIp65504P1759SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1759SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1759S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1759S() {	 
			return (getShort(beginIp65504P1759S));
   	}
         int localIp65504P1759LCounter = -1;
         public boolean isIp65504P1759LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1759LCounter != sharedCounter;
            localIp65504P1759LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1759_L_LEN = 2;
  	/**
	 * serializeIp65504P1759L
	 */
	protected void serializeIp65504P1759L(short ip65504P1759L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1759L,IP_65504_P_1759_L_LEN)
                  ,beginIp65504P1759L
                  ,IP_65504_P_1759_L_LEN
                 );
            localIp65504P1759LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1759LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1759L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1759L() {	 
			return (getShort(beginIp65504P1759L));
   	}
         int localIp65504P1760SCounter = -1;
         public boolean isIp65504P1760SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1760SCounter != sharedCounter;
            localIp65504P1760SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1760_S_LEN = 2;
  	/**
	 * serializeIp65504P1760S
	 */
	protected void serializeIp65504P1760S(short ip65504P1760S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1760S,IP_65504_P_1760_S_LEN)
                  ,beginIp65504P1760S
                  ,IP_65504_P_1760_S_LEN
                 );
            localIp65504P1760SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1760SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1760S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1760S() {	 
			return (getShort(beginIp65504P1760S));
   	}
         int localIp65504P1760LCounter = -1;
         public boolean isIp65504P1760LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1760LCounter != sharedCounter;
            localIp65504P1760LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1760_L_LEN = 2;
  	/**
	 * serializeIp65504P1760L
	 */
	protected void serializeIp65504P1760L(short ip65504P1760L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1760L,IP_65504_P_1760_L_LEN)
                  ,beginIp65504P1760L
                  ,IP_65504_P_1760_L_LEN
                 );
            localIp65504P1760LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1760LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1760L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1760L() {	 
			return (getShort(beginIp65504P1760L));
   	}
         int localIp65504P1761SCounter = -1;
         public boolean isIp65504P1761SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1761SCounter != sharedCounter;
            localIp65504P1761SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1761_S_LEN = 2;
  	/**
	 * serializeIp65504P1761S
	 */
	protected void serializeIp65504P1761S(short ip65504P1761S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1761S,IP_65504_P_1761_S_LEN)
                  ,beginIp65504P1761S
                  ,IP_65504_P_1761_S_LEN
                 );
            localIp65504P1761SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1761SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1761S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1761S() {	 
			return (getShort(beginIp65504P1761S));
   	}
         int localIp65504P1761LCounter = -1;
         public boolean isIp65504P1761LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1761LCounter != sharedCounter;
            localIp65504P1761LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1761_L_LEN = 2;
  	/**
	 * serializeIp65504P1761L
	 */
	protected void serializeIp65504P1761L(short ip65504P1761L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1761L,IP_65504_P_1761_L_LEN)
                  ,beginIp65504P1761L
                  ,IP_65504_P_1761_L_LEN
                 );
            localIp65504P1761LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1761LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1761L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1761L() {	 
			return (getShort(beginIp65504P1761L));
   	}
         int localIp65504P1762SCounter = -1;
         public boolean isIp65504P1762SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1762SCounter != sharedCounter;
            localIp65504P1762SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1762_S_LEN = 2;
  	/**
	 * serializeIp65504P1762S
	 */
	protected void serializeIp65504P1762S(short ip65504P1762S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1762S,IP_65504_P_1762_S_LEN)
                  ,beginIp65504P1762S
                  ,IP_65504_P_1762_S_LEN
                 );
            localIp65504P1762SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1762SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1762S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1762S() {	 
			return (getShort(beginIp65504P1762S));
   	}
         int localIp65504P1762LCounter = -1;
         public boolean isIp65504P1762LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1762LCounter != sharedCounter;
            localIp65504P1762LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1762_L_LEN = 2;
  	/**
	 * serializeIp65504P1762L
	 */
	protected void serializeIp65504P1762L(short ip65504P1762L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1762L,IP_65504_P_1762_L_LEN)
                  ,beginIp65504P1762L
                  ,IP_65504_P_1762_L_LEN
                 );
            localIp65504P1762LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1762LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1762L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1762L() {	 
			return (getShort(beginIp65504P1762L));
   	}
         int localIp65504P1763SCounter = -1;
         public boolean isIp65504P1763SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1763SCounter != sharedCounter;
            localIp65504P1763SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1763_S_LEN = 2;
  	/**
	 * serializeIp65504P1763S
	 */
	protected void serializeIp65504P1763S(short ip65504P1763S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1763S,IP_65504_P_1763_S_LEN)
                  ,beginIp65504P1763S
                  ,IP_65504_P_1763_S_LEN
                 );
            localIp65504P1763SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1763SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1763S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1763S() {	 
			return (getShort(beginIp65504P1763S));
   	}
         int localIp65504P1763LCounter = -1;
         public boolean isIp65504P1763LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1763LCounter != sharedCounter;
            localIp65504P1763LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1763_L_LEN = 2;
  	/**
	 * serializeIp65504P1763L
	 */
	protected void serializeIp65504P1763L(short ip65504P1763L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1763L,IP_65504_P_1763_L_LEN)
                  ,beginIp65504P1763L
                  ,IP_65504_P_1763_L_LEN
                 );
            localIp65504P1763LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1763LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1763L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1763L() {	 
			return (getShort(beginIp65504P1763L));
   	}
         int localIp65504P1764SCounter = -1;
         public boolean isIp65504P1764SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1764SCounter != sharedCounter;
            localIp65504P1764SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1764_S_LEN = 2;
  	/**
	 * serializeIp65504P1764S
	 */
	protected void serializeIp65504P1764S(short ip65504P1764S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1764S,IP_65504_P_1764_S_LEN)
                  ,beginIp65504P1764S
                  ,IP_65504_P_1764_S_LEN
                 );
            localIp65504P1764SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1764SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1764S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1764S() {	 
			return (getShort(beginIp65504P1764S));
   	}
         int localIp65504P1764LCounter = -1;
         public boolean isIp65504P1764LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1764LCounter != sharedCounter;
            localIp65504P1764LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1764_L_LEN = 2;
  	/**
	 * serializeIp65504P1764L
	 */
	protected void serializeIp65504P1764L(short ip65504P1764L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1764L,IP_65504_P_1764_L_LEN)
                  ,beginIp65504P1764L
                  ,IP_65504_P_1764_L_LEN
                 );
            localIp65504P1764LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1764LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1764L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1764L() {	 
			return (getShort(beginIp65504P1764L));
   	}
         int localIp65504P1765SCounter = -1;
         public boolean isIp65504P1765SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1765SCounter != sharedCounter;
            localIp65504P1765SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1765_S_LEN = 2;
  	/**
	 * serializeIp65504P1765S
	 */
	protected void serializeIp65504P1765S(short ip65504P1765S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1765S,IP_65504_P_1765_S_LEN)
                  ,beginIp65504P1765S
                  ,IP_65504_P_1765_S_LEN
                 );
            localIp65504P1765SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1765SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1765S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1765S() {	 
			return (getShort(beginIp65504P1765S));
   	}
         int localIp65504P1765LCounter = -1;
         public boolean isIp65504P1765LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1765LCounter != sharedCounter;
            localIp65504P1765LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1765_L_LEN = 2;
  	/**
	 * serializeIp65504P1765L
	 */
	protected void serializeIp65504P1765L(short ip65504P1765L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1765L,IP_65504_P_1765_L_LEN)
                  ,beginIp65504P1765L
                  ,IP_65504_P_1765_L_LEN
                 );
            localIp65504P1765LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1765LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1765L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1765L() {	 
			return (getShort(beginIp65504P1765L));
   	}
         int localIp65504P1766SCounter = -1;
         public boolean isIp65504P1766SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1766SCounter != sharedCounter;
            localIp65504P1766SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1766_S_LEN = 2;
  	/**
	 * serializeIp65504P1766S
	 */
	protected void serializeIp65504P1766S(short ip65504P1766S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1766S,IP_65504_P_1766_S_LEN)
                  ,beginIp65504P1766S
                  ,IP_65504_P_1766_S_LEN
                 );
            localIp65504P1766SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1766SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1766S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1766S() {	 
			return (getShort(beginIp65504P1766S));
   	}
         int localIp65504P1766LCounter = -1;
         public boolean isIp65504P1766LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1766LCounter != sharedCounter;
            localIp65504P1766LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1766_L_LEN = 2;
  	/**
	 * serializeIp65504P1766L
	 */
	protected void serializeIp65504P1766L(short ip65504P1766L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1766L,IP_65504_P_1766_L_LEN)
                  ,beginIp65504P1766L
                  ,IP_65504_P_1766_L_LEN
                 );
            localIp65504P1766LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1766LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1766L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1766L() {	 
			return (getShort(beginIp65504P1766L));
   	}
         int localIp65504P1767SCounter = -1;
         public boolean isIp65504P1767SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1767SCounter != sharedCounter;
            localIp65504P1767SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1767_S_LEN = 2;
  	/**
	 * serializeIp65504P1767S
	 */
	protected void serializeIp65504P1767S(short ip65504P1767S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1767S,IP_65504_P_1767_S_LEN)
                  ,beginIp65504P1767S
                  ,IP_65504_P_1767_S_LEN
                 );
            localIp65504P1767SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1767SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1767S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1767S() {	 
			return (getShort(beginIp65504P1767S));
   	}
         int localIp65504P1767LCounter = -1;
         public boolean isIp65504P1767LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1767LCounter != sharedCounter;
            localIp65504P1767LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1767_L_LEN = 2;
  	/**
	 * serializeIp65504P1767L
	 */
	protected void serializeIp65504P1767L(short ip65504P1767L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1767L,IP_65504_P_1767_L_LEN)
                  ,beginIp65504P1767L
                  ,IP_65504_P_1767_L_LEN
                 );
            localIp65504P1767LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1767LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1767L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1767L() {	 
			return (getShort(beginIp65504P1767L));
   	}




}
  
