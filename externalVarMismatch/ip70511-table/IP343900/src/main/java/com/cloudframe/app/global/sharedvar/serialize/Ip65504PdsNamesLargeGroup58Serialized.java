package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup58Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup58Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup58Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_58_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1768S;
            protected  int beginIp65504P1768L;
            protected  int beginIp65504P1769S;
            protected  int beginIp65504P1769L;
            protected  int beginIp65504P1770S;
            protected  int beginIp65504P1770L;
            protected  int beginIp65504P1771S;
            protected  int beginIp65504P1771L;
            protected  int beginIp65504P1772S;
            protected  int beginIp65504P1772L;
            protected  int beginIp65504P1773S;
            protected  int beginIp65504P1773L;
            protected  int beginIp65504P1774S;
            protected  int beginIp65504P1774L;
            protected  int beginIp65504P1775S;
            protected  int beginIp65504P1775L;
            protected  int beginIp65504P1776S;
            protected  int beginIp65504P1776L;
            protected  int beginIp65504P1777S;
            protected  int beginIp65504P1777L;
            protected  int beginIp65504P1778S;
            protected  int beginIp65504P1778L;
            protected  int beginIp65504P1779S;
            protected  int beginIp65504P1779L;
            protected  int beginIp65504P1780S;
            protected  int beginIp65504P1780L;
            protected  int beginIp65504P1781S;
            protected  int beginIp65504P1781L;
            protected  int beginIp65504P1782S;
            protected  int beginIp65504P1782L;
            protected  int beginIp65504P1783S;
            protected  int beginIp65504P1783L;
            protected  int beginIp65504P1784S;
            protected  int beginIp65504P1784L;
            protected  int beginIp65504P1785S;
            protected  int beginIp65504P1785L;
            protected  int beginIp65504P1786S;
            protected  int beginIp65504P1786L;
            protected  int beginIp65504P1787S;
            protected  int beginIp65504P1787L;
            protected  int beginIp65504P1788S;
            protected  int beginIp65504P1788L;
            protected  int beginIp65504P1789S;
            protected  int beginIp65504P1789L;
            protected  int beginIp65504P1790S;
            protected  int beginIp65504P1790L;
            protected  int beginIp65504P1791S;
            protected  int beginIp65504P1791L;
            protected  int beginIp65504P1792S;
            protected  int beginIp65504P1792L;
            protected  int beginIp65504P1793S;
            protected  int beginIp65504P1793L;
            protected  int beginIp65504P1794S;
            protected  int beginIp65504P1794L;
            protected  int beginIp65504P1795S;
            protected  int beginIp65504P1795L;
            protected  int beginIp65504P1796S;
            protected  int beginIp65504P1796L;
            protected  int beginIp65504P1797S;
            protected  int beginIp65504P1797L;
            protected  int beginIp65504P1798S;
            protected  int beginIp65504P1798L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup58Serialized
	**/
    public Ip65504PdsNamesLargeGroup58Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup58Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup58Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup58Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,14132); // serialize this field at offset 14132 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup58Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 14132 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup58Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_58_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1768S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1768L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1769S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1769L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1770S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1770L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1771S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1771L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1772S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1772L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1773S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1773L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1774S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1774L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1775S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1775L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1776S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1776L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1777S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1777L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1778S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1778L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1779S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1779L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1780S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1780L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1781S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1781L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1782S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1782L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1783S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1783L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1784S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1784L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1785S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1785L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1786S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1786L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1787S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1787L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1788S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1788L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1789S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1789L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1790S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1790L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1791S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1791L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1792S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1792L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1793S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1793L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1794S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1794L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1795S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1795L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1796S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1796L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1797S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1797L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1798S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1798L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1768SCounter = -1;
         public boolean isIp65504P1768SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1768SCounter != sharedCounter;
            localIp65504P1768SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1768_S_LEN = 2;
  	/**
	 * serializeIp65504P1768S
	 */
	protected void serializeIp65504P1768S(short ip65504P1768S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1768S,IP_65504_P_1768_S_LEN)
                  ,beginIp65504P1768S
                  ,IP_65504_P_1768_S_LEN
                 );
            localIp65504P1768SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1768SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1768S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1768S() {	 
			return (getShort(beginIp65504P1768S));
   	}
         int localIp65504P1768LCounter = -1;
         public boolean isIp65504P1768LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1768LCounter != sharedCounter;
            localIp65504P1768LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1768_L_LEN = 2;
  	/**
	 * serializeIp65504P1768L
	 */
	protected void serializeIp65504P1768L(short ip65504P1768L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1768L,IP_65504_P_1768_L_LEN)
                  ,beginIp65504P1768L
                  ,IP_65504_P_1768_L_LEN
                 );
            localIp65504P1768LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1768LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1768L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1768L() {	 
			return (getShort(beginIp65504P1768L));
   	}
         int localIp65504P1769SCounter = -1;
         public boolean isIp65504P1769SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1769SCounter != sharedCounter;
            localIp65504P1769SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1769_S_LEN = 2;
  	/**
	 * serializeIp65504P1769S
	 */
	protected void serializeIp65504P1769S(short ip65504P1769S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1769S,IP_65504_P_1769_S_LEN)
                  ,beginIp65504P1769S
                  ,IP_65504_P_1769_S_LEN
                 );
            localIp65504P1769SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1769SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1769S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1769S() {	 
			return (getShort(beginIp65504P1769S));
   	}
         int localIp65504P1769LCounter = -1;
         public boolean isIp65504P1769LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1769LCounter != sharedCounter;
            localIp65504P1769LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1769_L_LEN = 2;
  	/**
	 * serializeIp65504P1769L
	 */
	protected void serializeIp65504P1769L(short ip65504P1769L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1769L,IP_65504_P_1769_L_LEN)
                  ,beginIp65504P1769L
                  ,IP_65504_P_1769_L_LEN
                 );
            localIp65504P1769LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1769LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1769L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1769L() {	 
			return (getShort(beginIp65504P1769L));
   	}
         int localIp65504P1770SCounter = -1;
         public boolean isIp65504P1770SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1770SCounter != sharedCounter;
            localIp65504P1770SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1770_S_LEN = 2;
  	/**
	 * serializeIp65504P1770S
	 */
	protected void serializeIp65504P1770S(short ip65504P1770S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1770S,IP_65504_P_1770_S_LEN)
                  ,beginIp65504P1770S
                  ,IP_65504_P_1770_S_LEN
                 );
            localIp65504P1770SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1770SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1770S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1770S() {	 
			return (getShort(beginIp65504P1770S));
   	}
         int localIp65504P1770LCounter = -1;
         public boolean isIp65504P1770LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1770LCounter != sharedCounter;
            localIp65504P1770LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1770_L_LEN = 2;
  	/**
	 * serializeIp65504P1770L
	 */
	protected void serializeIp65504P1770L(short ip65504P1770L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1770L,IP_65504_P_1770_L_LEN)
                  ,beginIp65504P1770L
                  ,IP_65504_P_1770_L_LEN
                 );
            localIp65504P1770LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1770LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1770L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1770L() {	 
			return (getShort(beginIp65504P1770L));
   	}
         int localIp65504P1771SCounter = -1;
         public boolean isIp65504P1771SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1771SCounter != sharedCounter;
            localIp65504P1771SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1771_S_LEN = 2;
  	/**
	 * serializeIp65504P1771S
	 */
	protected void serializeIp65504P1771S(short ip65504P1771S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1771S,IP_65504_P_1771_S_LEN)
                  ,beginIp65504P1771S
                  ,IP_65504_P_1771_S_LEN
                 );
            localIp65504P1771SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1771SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1771S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1771S() {	 
			return (getShort(beginIp65504P1771S));
   	}
         int localIp65504P1771LCounter = -1;
         public boolean isIp65504P1771LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1771LCounter != sharedCounter;
            localIp65504P1771LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1771_L_LEN = 2;
  	/**
	 * serializeIp65504P1771L
	 */
	protected void serializeIp65504P1771L(short ip65504P1771L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1771L,IP_65504_P_1771_L_LEN)
                  ,beginIp65504P1771L
                  ,IP_65504_P_1771_L_LEN
                 );
            localIp65504P1771LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1771LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1771L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1771L() {	 
			return (getShort(beginIp65504P1771L));
   	}
         int localIp65504P1772SCounter = -1;
         public boolean isIp65504P1772SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1772SCounter != sharedCounter;
            localIp65504P1772SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1772_S_LEN = 2;
  	/**
	 * serializeIp65504P1772S
	 */
	protected void serializeIp65504P1772S(short ip65504P1772S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1772S,IP_65504_P_1772_S_LEN)
                  ,beginIp65504P1772S
                  ,IP_65504_P_1772_S_LEN
                 );
            localIp65504P1772SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1772SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1772S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1772S() {	 
			return (getShort(beginIp65504P1772S));
   	}
         int localIp65504P1772LCounter = -1;
         public boolean isIp65504P1772LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1772LCounter != sharedCounter;
            localIp65504P1772LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1772_L_LEN = 2;
  	/**
	 * serializeIp65504P1772L
	 */
	protected void serializeIp65504P1772L(short ip65504P1772L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1772L,IP_65504_P_1772_L_LEN)
                  ,beginIp65504P1772L
                  ,IP_65504_P_1772_L_LEN
                 );
            localIp65504P1772LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1772LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1772L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1772L() {	 
			return (getShort(beginIp65504P1772L));
   	}
         int localIp65504P1773SCounter = -1;
         public boolean isIp65504P1773SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1773SCounter != sharedCounter;
            localIp65504P1773SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1773_S_LEN = 2;
  	/**
	 * serializeIp65504P1773S
	 */
	protected void serializeIp65504P1773S(short ip65504P1773S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1773S,IP_65504_P_1773_S_LEN)
                  ,beginIp65504P1773S
                  ,IP_65504_P_1773_S_LEN
                 );
            localIp65504P1773SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1773SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1773S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1773S() {	 
			return (getShort(beginIp65504P1773S));
   	}
         int localIp65504P1773LCounter = -1;
         public boolean isIp65504P1773LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1773LCounter != sharedCounter;
            localIp65504P1773LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1773_L_LEN = 2;
  	/**
	 * serializeIp65504P1773L
	 */
	protected void serializeIp65504P1773L(short ip65504P1773L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1773L,IP_65504_P_1773_L_LEN)
                  ,beginIp65504P1773L
                  ,IP_65504_P_1773_L_LEN
                 );
            localIp65504P1773LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1773LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1773L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1773L() {	 
			return (getShort(beginIp65504P1773L));
   	}
         int localIp65504P1774SCounter = -1;
         public boolean isIp65504P1774SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1774SCounter != sharedCounter;
            localIp65504P1774SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1774_S_LEN = 2;
  	/**
	 * serializeIp65504P1774S
	 */
	protected void serializeIp65504P1774S(short ip65504P1774S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1774S,IP_65504_P_1774_S_LEN)
                  ,beginIp65504P1774S
                  ,IP_65504_P_1774_S_LEN
                 );
            localIp65504P1774SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1774SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1774S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1774S() {	 
			return (getShort(beginIp65504P1774S));
   	}
         int localIp65504P1774LCounter = -1;
         public boolean isIp65504P1774LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1774LCounter != sharedCounter;
            localIp65504P1774LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1774_L_LEN = 2;
  	/**
	 * serializeIp65504P1774L
	 */
	protected void serializeIp65504P1774L(short ip65504P1774L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1774L,IP_65504_P_1774_L_LEN)
                  ,beginIp65504P1774L
                  ,IP_65504_P_1774_L_LEN
                 );
            localIp65504P1774LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1774LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1774L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1774L() {	 
			return (getShort(beginIp65504P1774L));
   	}
         int localIp65504P1775SCounter = -1;
         public boolean isIp65504P1775SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1775SCounter != sharedCounter;
            localIp65504P1775SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1775_S_LEN = 2;
  	/**
	 * serializeIp65504P1775S
	 */
	protected void serializeIp65504P1775S(short ip65504P1775S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1775S,IP_65504_P_1775_S_LEN)
                  ,beginIp65504P1775S
                  ,IP_65504_P_1775_S_LEN
                 );
            localIp65504P1775SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1775SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1775S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1775S() {	 
			return (getShort(beginIp65504P1775S));
   	}
         int localIp65504P1775LCounter = -1;
         public boolean isIp65504P1775LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1775LCounter != sharedCounter;
            localIp65504P1775LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1775_L_LEN = 2;
  	/**
	 * serializeIp65504P1775L
	 */
	protected void serializeIp65504P1775L(short ip65504P1775L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1775L,IP_65504_P_1775_L_LEN)
                  ,beginIp65504P1775L
                  ,IP_65504_P_1775_L_LEN
                 );
            localIp65504P1775LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1775LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1775L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1775L() {	 
			return (getShort(beginIp65504P1775L));
   	}
         int localIp65504P1776SCounter = -1;
         public boolean isIp65504P1776SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1776SCounter != sharedCounter;
            localIp65504P1776SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1776_S_LEN = 2;
  	/**
	 * serializeIp65504P1776S
	 */
	protected void serializeIp65504P1776S(short ip65504P1776S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1776S,IP_65504_P_1776_S_LEN)
                  ,beginIp65504P1776S
                  ,IP_65504_P_1776_S_LEN
                 );
            localIp65504P1776SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1776SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1776S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1776S() {	 
			return (getShort(beginIp65504P1776S));
   	}
         int localIp65504P1776LCounter = -1;
         public boolean isIp65504P1776LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1776LCounter != sharedCounter;
            localIp65504P1776LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1776_L_LEN = 2;
  	/**
	 * serializeIp65504P1776L
	 */
	protected void serializeIp65504P1776L(short ip65504P1776L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1776L,IP_65504_P_1776_L_LEN)
                  ,beginIp65504P1776L
                  ,IP_65504_P_1776_L_LEN
                 );
            localIp65504P1776LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1776LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1776L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1776L() {	 
			return (getShort(beginIp65504P1776L));
   	}
         int localIp65504P1777SCounter = -1;
         public boolean isIp65504P1777SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1777SCounter != sharedCounter;
            localIp65504P1777SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1777_S_LEN = 2;
  	/**
	 * serializeIp65504P1777S
	 */
	protected void serializeIp65504P1777S(short ip65504P1777S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1777S,IP_65504_P_1777_S_LEN)
                  ,beginIp65504P1777S
                  ,IP_65504_P_1777_S_LEN
                 );
            localIp65504P1777SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1777SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1777S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1777S() {	 
			return (getShort(beginIp65504P1777S));
   	}
         int localIp65504P1777LCounter = -1;
         public boolean isIp65504P1777LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1777LCounter != sharedCounter;
            localIp65504P1777LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1777_L_LEN = 2;
  	/**
	 * serializeIp65504P1777L
	 */
	protected void serializeIp65504P1777L(short ip65504P1777L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1777L,IP_65504_P_1777_L_LEN)
                  ,beginIp65504P1777L
                  ,IP_65504_P_1777_L_LEN
                 );
            localIp65504P1777LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1777LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1777L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1777L() {	 
			return (getShort(beginIp65504P1777L));
   	}
         int localIp65504P1778SCounter = -1;
         public boolean isIp65504P1778SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1778SCounter != sharedCounter;
            localIp65504P1778SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1778_S_LEN = 2;
  	/**
	 * serializeIp65504P1778S
	 */
	protected void serializeIp65504P1778S(short ip65504P1778S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1778S,IP_65504_P_1778_S_LEN)
                  ,beginIp65504P1778S
                  ,IP_65504_P_1778_S_LEN
                 );
            localIp65504P1778SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1778SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1778S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1778S() {	 
			return (getShort(beginIp65504P1778S));
   	}
         int localIp65504P1778LCounter = -1;
         public boolean isIp65504P1778LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1778LCounter != sharedCounter;
            localIp65504P1778LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1778_L_LEN = 2;
  	/**
	 * serializeIp65504P1778L
	 */
	protected void serializeIp65504P1778L(short ip65504P1778L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1778L,IP_65504_P_1778_L_LEN)
                  ,beginIp65504P1778L
                  ,IP_65504_P_1778_L_LEN
                 );
            localIp65504P1778LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1778LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1778L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1778L() {	 
			return (getShort(beginIp65504P1778L));
   	}
         int localIp65504P1779SCounter = -1;
         public boolean isIp65504P1779SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1779SCounter != sharedCounter;
            localIp65504P1779SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1779_S_LEN = 2;
  	/**
	 * serializeIp65504P1779S
	 */
	protected void serializeIp65504P1779S(short ip65504P1779S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1779S,IP_65504_P_1779_S_LEN)
                  ,beginIp65504P1779S
                  ,IP_65504_P_1779_S_LEN
                 );
            localIp65504P1779SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1779SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1779S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1779S() {	 
			return (getShort(beginIp65504P1779S));
   	}
         int localIp65504P1779LCounter = -1;
         public boolean isIp65504P1779LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1779LCounter != sharedCounter;
            localIp65504P1779LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1779_L_LEN = 2;
  	/**
	 * serializeIp65504P1779L
	 */
	protected void serializeIp65504P1779L(short ip65504P1779L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1779L,IP_65504_P_1779_L_LEN)
                  ,beginIp65504P1779L
                  ,IP_65504_P_1779_L_LEN
                 );
            localIp65504P1779LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1779LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1779L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1779L() {	 
			return (getShort(beginIp65504P1779L));
   	}
         int localIp65504P1780SCounter = -1;
         public boolean isIp65504P1780SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1780SCounter != sharedCounter;
            localIp65504P1780SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1780_S_LEN = 2;
  	/**
	 * serializeIp65504P1780S
	 */
	protected void serializeIp65504P1780S(short ip65504P1780S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1780S,IP_65504_P_1780_S_LEN)
                  ,beginIp65504P1780S
                  ,IP_65504_P_1780_S_LEN
                 );
            localIp65504P1780SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1780SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1780S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1780S() {	 
			return (getShort(beginIp65504P1780S));
   	}
         int localIp65504P1780LCounter = -1;
         public boolean isIp65504P1780LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1780LCounter != sharedCounter;
            localIp65504P1780LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1780_L_LEN = 2;
  	/**
	 * serializeIp65504P1780L
	 */
	protected void serializeIp65504P1780L(short ip65504P1780L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1780L,IP_65504_P_1780_L_LEN)
                  ,beginIp65504P1780L
                  ,IP_65504_P_1780_L_LEN
                 );
            localIp65504P1780LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1780LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1780L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1780L() {	 
			return (getShort(beginIp65504P1780L));
   	}
         int localIp65504P1781SCounter = -1;
         public boolean isIp65504P1781SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1781SCounter != sharedCounter;
            localIp65504P1781SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1781_S_LEN = 2;
  	/**
	 * serializeIp65504P1781S
	 */
	protected void serializeIp65504P1781S(short ip65504P1781S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1781S,IP_65504_P_1781_S_LEN)
                  ,beginIp65504P1781S
                  ,IP_65504_P_1781_S_LEN
                 );
            localIp65504P1781SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1781SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1781S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1781S() {	 
			return (getShort(beginIp65504P1781S));
   	}
         int localIp65504P1781LCounter = -1;
         public boolean isIp65504P1781LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1781LCounter != sharedCounter;
            localIp65504P1781LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1781_L_LEN = 2;
  	/**
	 * serializeIp65504P1781L
	 */
	protected void serializeIp65504P1781L(short ip65504P1781L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1781L,IP_65504_P_1781_L_LEN)
                  ,beginIp65504P1781L
                  ,IP_65504_P_1781_L_LEN
                 );
            localIp65504P1781LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1781LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1781L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1781L() {	 
			return (getShort(beginIp65504P1781L));
   	}
         int localIp65504P1782SCounter = -1;
         public boolean isIp65504P1782SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1782SCounter != sharedCounter;
            localIp65504P1782SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1782_S_LEN = 2;
  	/**
	 * serializeIp65504P1782S
	 */
	protected void serializeIp65504P1782S(short ip65504P1782S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1782S,IP_65504_P_1782_S_LEN)
                  ,beginIp65504P1782S
                  ,IP_65504_P_1782_S_LEN
                 );
            localIp65504P1782SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1782SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1782S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1782S() {	 
			return (getShort(beginIp65504P1782S));
   	}
         int localIp65504P1782LCounter = -1;
         public boolean isIp65504P1782LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1782LCounter != sharedCounter;
            localIp65504P1782LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1782_L_LEN = 2;
  	/**
	 * serializeIp65504P1782L
	 */
	protected void serializeIp65504P1782L(short ip65504P1782L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1782L,IP_65504_P_1782_L_LEN)
                  ,beginIp65504P1782L
                  ,IP_65504_P_1782_L_LEN
                 );
            localIp65504P1782LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1782LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1782L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1782L() {	 
			return (getShort(beginIp65504P1782L));
   	}
         int localIp65504P1783SCounter = -1;
         public boolean isIp65504P1783SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1783SCounter != sharedCounter;
            localIp65504P1783SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1783_S_LEN = 2;
  	/**
	 * serializeIp65504P1783S
	 */
	protected void serializeIp65504P1783S(short ip65504P1783S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1783S,IP_65504_P_1783_S_LEN)
                  ,beginIp65504P1783S
                  ,IP_65504_P_1783_S_LEN
                 );
            localIp65504P1783SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1783SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1783S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1783S() {	 
			return (getShort(beginIp65504P1783S));
   	}
         int localIp65504P1783LCounter = -1;
         public boolean isIp65504P1783LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1783LCounter != sharedCounter;
            localIp65504P1783LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1783_L_LEN = 2;
  	/**
	 * serializeIp65504P1783L
	 */
	protected void serializeIp65504P1783L(short ip65504P1783L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1783L,IP_65504_P_1783_L_LEN)
                  ,beginIp65504P1783L
                  ,IP_65504_P_1783_L_LEN
                 );
            localIp65504P1783LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1783LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1783L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1783L() {	 
			return (getShort(beginIp65504P1783L));
   	}
         int localIp65504P1784SCounter = -1;
         public boolean isIp65504P1784SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1784SCounter != sharedCounter;
            localIp65504P1784SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1784_S_LEN = 2;
  	/**
	 * serializeIp65504P1784S
	 */
	protected void serializeIp65504P1784S(short ip65504P1784S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1784S,IP_65504_P_1784_S_LEN)
                  ,beginIp65504P1784S
                  ,IP_65504_P_1784_S_LEN
                 );
            localIp65504P1784SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1784SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1784S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1784S() {	 
			return (getShort(beginIp65504P1784S));
   	}
         int localIp65504P1784LCounter = -1;
         public boolean isIp65504P1784LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1784LCounter != sharedCounter;
            localIp65504P1784LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1784_L_LEN = 2;
  	/**
	 * serializeIp65504P1784L
	 */
	protected void serializeIp65504P1784L(short ip65504P1784L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1784L,IP_65504_P_1784_L_LEN)
                  ,beginIp65504P1784L
                  ,IP_65504_P_1784_L_LEN
                 );
            localIp65504P1784LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1784LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1784L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1784L() {	 
			return (getShort(beginIp65504P1784L));
   	}
         int localIp65504P1785SCounter = -1;
         public boolean isIp65504P1785SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1785SCounter != sharedCounter;
            localIp65504P1785SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1785_S_LEN = 2;
  	/**
	 * serializeIp65504P1785S
	 */
	protected void serializeIp65504P1785S(short ip65504P1785S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1785S,IP_65504_P_1785_S_LEN)
                  ,beginIp65504P1785S
                  ,IP_65504_P_1785_S_LEN
                 );
            localIp65504P1785SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1785SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1785S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1785S() {	 
			return (getShort(beginIp65504P1785S));
   	}
         int localIp65504P1785LCounter = -1;
         public boolean isIp65504P1785LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1785LCounter != sharedCounter;
            localIp65504P1785LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1785_L_LEN = 2;
  	/**
	 * serializeIp65504P1785L
	 */
	protected void serializeIp65504P1785L(short ip65504P1785L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1785L,IP_65504_P_1785_L_LEN)
                  ,beginIp65504P1785L
                  ,IP_65504_P_1785_L_LEN
                 );
            localIp65504P1785LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1785LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1785L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1785L() {	 
			return (getShort(beginIp65504P1785L));
   	}
         int localIp65504P1786SCounter = -1;
         public boolean isIp65504P1786SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1786SCounter != sharedCounter;
            localIp65504P1786SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1786_S_LEN = 2;
  	/**
	 * serializeIp65504P1786S
	 */
	protected void serializeIp65504P1786S(short ip65504P1786S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1786S,IP_65504_P_1786_S_LEN)
                  ,beginIp65504P1786S
                  ,IP_65504_P_1786_S_LEN
                 );
            localIp65504P1786SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1786SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1786S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1786S() {	 
			return (getShort(beginIp65504P1786S));
   	}
         int localIp65504P1786LCounter = -1;
         public boolean isIp65504P1786LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1786LCounter != sharedCounter;
            localIp65504P1786LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1786_L_LEN = 2;
  	/**
	 * serializeIp65504P1786L
	 */
	protected void serializeIp65504P1786L(short ip65504P1786L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1786L,IP_65504_P_1786_L_LEN)
                  ,beginIp65504P1786L
                  ,IP_65504_P_1786_L_LEN
                 );
            localIp65504P1786LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1786LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1786L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1786L() {	 
			return (getShort(beginIp65504P1786L));
   	}
         int localIp65504P1787SCounter = -1;
         public boolean isIp65504P1787SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1787SCounter != sharedCounter;
            localIp65504P1787SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1787_S_LEN = 2;
  	/**
	 * serializeIp65504P1787S
	 */
	protected void serializeIp65504P1787S(short ip65504P1787S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1787S,IP_65504_P_1787_S_LEN)
                  ,beginIp65504P1787S
                  ,IP_65504_P_1787_S_LEN
                 );
            localIp65504P1787SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1787SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1787S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1787S() {	 
			return (getShort(beginIp65504P1787S));
   	}
         int localIp65504P1787LCounter = -1;
         public boolean isIp65504P1787LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1787LCounter != sharedCounter;
            localIp65504P1787LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1787_L_LEN = 2;
  	/**
	 * serializeIp65504P1787L
	 */
	protected void serializeIp65504P1787L(short ip65504P1787L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1787L,IP_65504_P_1787_L_LEN)
                  ,beginIp65504P1787L
                  ,IP_65504_P_1787_L_LEN
                 );
            localIp65504P1787LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1787LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1787L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1787L() {	 
			return (getShort(beginIp65504P1787L));
   	}
         int localIp65504P1788SCounter = -1;
         public boolean isIp65504P1788SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1788SCounter != sharedCounter;
            localIp65504P1788SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1788_S_LEN = 2;
  	/**
	 * serializeIp65504P1788S
	 */
	protected void serializeIp65504P1788S(short ip65504P1788S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1788S,IP_65504_P_1788_S_LEN)
                  ,beginIp65504P1788S
                  ,IP_65504_P_1788_S_LEN
                 );
            localIp65504P1788SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1788SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1788S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1788S() {	 
			return (getShort(beginIp65504P1788S));
   	}
         int localIp65504P1788LCounter = -1;
         public boolean isIp65504P1788LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1788LCounter != sharedCounter;
            localIp65504P1788LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1788_L_LEN = 2;
  	/**
	 * serializeIp65504P1788L
	 */
	protected void serializeIp65504P1788L(short ip65504P1788L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1788L,IP_65504_P_1788_L_LEN)
                  ,beginIp65504P1788L
                  ,IP_65504_P_1788_L_LEN
                 );
            localIp65504P1788LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1788LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1788L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1788L() {	 
			return (getShort(beginIp65504P1788L));
   	}
         int localIp65504P1789SCounter = -1;
         public boolean isIp65504P1789SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1789SCounter != sharedCounter;
            localIp65504P1789SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1789_S_LEN = 2;
  	/**
	 * serializeIp65504P1789S
	 */
	protected void serializeIp65504P1789S(short ip65504P1789S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1789S,IP_65504_P_1789_S_LEN)
                  ,beginIp65504P1789S
                  ,IP_65504_P_1789_S_LEN
                 );
            localIp65504P1789SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1789SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1789S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1789S() {	 
			return (getShort(beginIp65504P1789S));
   	}
         int localIp65504P1789LCounter = -1;
         public boolean isIp65504P1789LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1789LCounter != sharedCounter;
            localIp65504P1789LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1789_L_LEN = 2;
  	/**
	 * serializeIp65504P1789L
	 */
	protected void serializeIp65504P1789L(short ip65504P1789L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1789L,IP_65504_P_1789_L_LEN)
                  ,beginIp65504P1789L
                  ,IP_65504_P_1789_L_LEN
                 );
            localIp65504P1789LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1789LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1789L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1789L() {	 
			return (getShort(beginIp65504P1789L));
   	}
         int localIp65504P1790SCounter = -1;
         public boolean isIp65504P1790SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1790SCounter != sharedCounter;
            localIp65504P1790SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1790_S_LEN = 2;
  	/**
	 * serializeIp65504P1790S
	 */
	protected void serializeIp65504P1790S(short ip65504P1790S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1790S,IP_65504_P_1790_S_LEN)
                  ,beginIp65504P1790S
                  ,IP_65504_P_1790_S_LEN
                 );
            localIp65504P1790SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1790SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1790S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1790S() {	 
			return (getShort(beginIp65504P1790S));
   	}
         int localIp65504P1790LCounter = -1;
         public boolean isIp65504P1790LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1790LCounter != sharedCounter;
            localIp65504P1790LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1790_L_LEN = 2;
  	/**
	 * serializeIp65504P1790L
	 */
	protected void serializeIp65504P1790L(short ip65504P1790L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1790L,IP_65504_P_1790_L_LEN)
                  ,beginIp65504P1790L
                  ,IP_65504_P_1790_L_LEN
                 );
            localIp65504P1790LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1790LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1790L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1790L() {	 
			return (getShort(beginIp65504P1790L));
   	}
         int localIp65504P1791SCounter = -1;
         public boolean isIp65504P1791SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1791SCounter != sharedCounter;
            localIp65504P1791SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1791_S_LEN = 2;
  	/**
	 * serializeIp65504P1791S
	 */
	protected void serializeIp65504P1791S(short ip65504P1791S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1791S,IP_65504_P_1791_S_LEN)
                  ,beginIp65504P1791S
                  ,IP_65504_P_1791_S_LEN
                 );
            localIp65504P1791SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1791SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1791S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1791S() {	 
			return (getShort(beginIp65504P1791S));
   	}
         int localIp65504P1791LCounter = -1;
         public boolean isIp65504P1791LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1791LCounter != sharedCounter;
            localIp65504P1791LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1791_L_LEN = 2;
  	/**
	 * serializeIp65504P1791L
	 */
	protected void serializeIp65504P1791L(short ip65504P1791L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1791L,IP_65504_P_1791_L_LEN)
                  ,beginIp65504P1791L
                  ,IP_65504_P_1791_L_LEN
                 );
            localIp65504P1791LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1791LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1791L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1791L() {	 
			return (getShort(beginIp65504P1791L));
   	}
         int localIp65504P1792SCounter = -1;
         public boolean isIp65504P1792SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1792SCounter != sharedCounter;
            localIp65504P1792SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1792_S_LEN = 2;
  	/**
	 * serializeIp65504P1792S
	 */
	protected void serializeIp65504P1792S(short ip65504P1792S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1792S,IP_65504_P_1792_S_LEN)
                  ,beginIp65504P1792S
                  ,IP_65504_P_1792_S_LEN
                 );
            localIp65504P1792SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1792SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1792S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1792S() {	 
			return (getShort(beginIp65504P1792S));
   	}
         int localIp65504P1792LCounter = -1;
         public boolean isIp65504P1792LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1792LCounter != sharedCounter;
            localIp65504P1792LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1792_L_LEN = 2;
  	/**
	 * serializeIp65504P1792L
	 */
	protected void serializeIp65504P1792L(short ip65504P1792L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1792L,IP_65504_P_1792_L_LEN)
                  ,beginIp65504P1792L
                  ,IP_65504_P_1792_L_LEN
                 );
            localIp65504P1792LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1792LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1792L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1792L() {	 
			return (getShort(beginIp65504P1792L));
   	}
         int localIp65504P1793SCounter = -1;
         public boolean isIp65504P1793SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1793SCounter != sharedCounter;
            localIp65504P1793SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1793_S_LEN = 2;
  	/**
	 * serializeIp65504P1793S
	 */
	protected void serializeIp65504P1793S(short ip65504P1793S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1793S,IP_65504_P_1793_S_LEN)
                  ,beginIp65504P1793S
                  ,IP_65504_P_1793_S_LEN
                 );
            localIp65504P1793SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1793SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1793S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1793S() {	 
			return (getShort(beginIp65504P1793S));
   	}
         int localIp65504P1793LCounter = -1;
         public boolean isIp65504P1793LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1793LCounter != sharedCounter;
            localIp65504P1793LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1793_L_LEN = 2;
  	/**
	 * serializeIp65504P1793L
	 */
	protected void serializeIp65504P1793L(short ip65504P1793L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1793L,IP_65504_P_1793_L_LEN)
                  ,beginIp65504P1793L
                  ,IP_65504_P_1793_L_LEN
                 );
            localIp65504P1793LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1793LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1793L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1793L() {	 
			return (getShort(beginIp65504P1793L));
   	}
         int localIp65504P1794SCounter = -1;
         public boolean isIp65504P1794SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1794SCounter != sharedCounter;
            localIp65504P1794SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1794_S_LEN = 2;
  	/**
	 * serializeIp65504P1794S
	 */
	protected void serializeIp65504P1794S(short ip65504P1794S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1794S,IP_65504_P_1794_S_LEN)
                  ,beginIp65504P1794S
                  ,IP_65504_P_1794_S_LEN
                 );
            localIp65504P1794SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1794SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1794S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1794S() {	 
			return (getShort(beginIp65504P1794S));
   	}
         int localIp65504P1794LCounter = -1;
         public boolean isIp65504P1794LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1794LCounter != sharedCounter;
            localIp65504P1794LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1794_L_LEN = 2;
  	/**
	 * serializeIp65504P1794L
	 */
	protected void serializeIp65504P1794L(short ip65504P1794L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1794L,IP_65504_P_1794_L_LEN)
                  ,beginIp65504P1794L
                  ,IP_65504_P_1794_L_LEN
                 );
            localIp65504P1794LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1794LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1794L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1794L() {	 
			return (getShort(beginIp65504P1794L));
   	}
         int localIp65504P1795SCounter = -1;
         public boolean isIp65504P1795SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1795SCounter != sharedCounter;
            localIp65504P1795SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1795_S_LEN = 2;
  	/**
	 * serializeIp65504P1795S
	 */
	protected void serializeIp65504P1795S(short ip65504P1795S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1795S,IP_65504_P_1795_S_LEN)
                  ,beginIp65504P1795S
                  ,IP_65504_P_1795_S_LEN
                 );
            localIp65504P1795SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1795SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1795S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1795S() {	 
			return (getShort(beginIp65504P1795S));
   	}
         int localIp65504P1795LCounter = -1;
         public boolean isIp65504P1795LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1795LCounter != sharedCounter;
            localIp65504P1795LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1795_L_LEN = 2;
  	/**
	 * serializeIp65504P1795L
	 */
	protected void serializeIp65504P1795L(short ip65504P1795L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1795L,IP_65504_P_1795_L_LEN)
                  ,beginIp65504P1795L
                  ,IP_65504_P_1795_L_LEN
                 );
            localIp65504P1795LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1795LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1795L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1795L() {	 
			return (getShort(beginIp65504P1795L));
   	}
         int localIp65504P1796SCounter = -1;
         public boolean isIp65504P1796SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1796SCounter != sharedCounter;
            localIp65504P1796SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1796_S_LEN = 2;
  	/**
	 * serializeIp65504P1796S
	 */
	protected void serializeIp65504P1796S(short ip65504P1796S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1796S,IP_65504_P_1796_S_LEN)
                  ,beginIp65504P1796S
                  ,IP_65504_P_1796_S_LEN
                 );
            localIp65504P1796SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1796SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1796S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1796S() {	 
			return (getShort(beginIp65504P1796S));
   	}
         int localIp65504P1796LCounter = -1;
         public boolean isIp65504P1796LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1796LCounter != sharedCounter;
            localIp65504P1796LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1796_L_LEN = 2;
  	/**
	 * serializeIp65504P1796L
	 */
	protected void serializeIp65504P1796L(short ip65504P1796L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1796L,IP_65504_P_1796_L_LEN)
                  ,beginIp65504P1796L
                  ,IP_65504_P_1796_L_LEN
                 );
            localIp65504P1796LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1796LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1796L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1796L() {	 
			return (getShort(beginIp65504P1796L));
   	}
         int localIp65504P1797SCounter = -1;
         public boolean isIp65504P1797SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1797SCounter != sharedCounter;
            localIp65504P1797SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1797_S_LEN = 2;
  	/**
	 * serializeIp65504P1797S
	 */
	protected void serializeIp65504P1797S(short ip65504P1797S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1797S,IP_65504_P_1797_S_LEN)
                  ,beginIp65504P1797S
                  ,IP_65504_P_1797_S_LEN
                 );
            localIp65504P1797SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1797SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1797S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1797S() {	 
			return (getShort(beginIp65504P1797S));
   	}
         int localIp65504P1797LCounter = -1;
         public boolean isIp65504P1797LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1797LCounter != sharedCounter;
            localIp65504P1797LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1797_L_LEN = 2;
  	/**
	 * serializeIp65504P1797L
	 */
	protected void serializeIp65504P1797L(short ip65504P1797L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1797L,IP_65504_P_1797_L_LEN)
                  ,beginIp65504P1797L
                  ,IP_65504_P_1797_L_LEN
                 );
            localIp65504P1797LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1797LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1797L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1797L() {	 
			return (getShort(beginIp65504P1797L));
   	}
         int localIp65504P1798SCounter = -1;
         public boolean isIp65504P1798SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1798SCounter != sharedCounter;
            localIp65504P1798SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1798_S_LEN = 2;
  	/**
	 * serializeIp65504P1798S
	 */
	protected void serializeIp65504P1798S(short ip65504P1798S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1798S,IP_65504_P_1798_S_LEN)
                  ,beginIp65504P1798S
                  ,IP_65504_P_1798_S_LEN
                 );
            localIp65504P1798SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1798SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1798S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1798S() {	 
			return (getShort(beginIp65504P1798S));
   	}
         int localIp65504P1798LCounter = -1;
         public boolean isIp65504P1798LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1798LCounter != sharedCounter;
            localIp65504P1798LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1798_L_LEN = 2;
  	/**
	 * serializeIp65504P1798L
	 */
	protected void serializeIp65504P1798L(short ip65504P1798L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1798L,IP_65504_P_1798_L_LEN)
                  ,beginIp65504P1798L
                  ,IP_65504_P_1798_L_LEN
                 );
            localIp65504P1798LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1798LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1798L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1798L() {	 
			return (getShort(beginIp65504P1798L));
   	}




}
  
