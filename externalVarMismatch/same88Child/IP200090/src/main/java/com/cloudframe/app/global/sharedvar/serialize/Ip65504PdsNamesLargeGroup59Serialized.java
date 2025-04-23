package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup59Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup59Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup59Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_59_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1799S;
            protected  int beginIp65504P1799L;
            protected  int beginIp65504P1800S;
            protected  int beginIp65504P1800L;
            protected  int beginIp65504P1801S;
            protected  int beginIp65504P1801L;
            protected  int beginIp65504P1802S;
            protected  int beginIp65504P1802L;
            protected  int beginIp65504P1803S;
            protected  int beginIp65504P1803L;
            protected  int beginIp65504P1804S;
            protected  int beginIp65504P1804L;
            protected  int beginIp65504P1805S;
            protected  int beginIp65504P1805L;
            protected  int beginIp65504P1806S;
            protected  int beginIp65504P1806L;
            protected  int beginIp65504P1807S;
            protected  int beginIp65504P1807L;
            protected  int beginIp65504P1808S;
            protected  int beginIp65504P1808L;
            protected  int beginIp65504P1809S;
            protected  int beginIp65504P1809L;
            protected  int beginIp65504P1810S;
            protected  int beginIp65504P1810L;
            protected  int beginIp65504P1811S;
            protected  int beginIp65504P1811L;
            protected  int beginIp65504P1812S;
            protected  int beginIp65504P1812L;
            protected  int beginIp65504P1813S;
            protected  int beginIp65504P1813L;
            protected  int beginIp65504P1814S;
            protected  int beginIp65504P1814L;
            protected  int beginIp65504P1815S;
            protected  int beginIp65504P1815L;
            protected  int beginIp65504P1816S;
            protected  int beginIp65504P1816L;
            protected  int beginIp65504P1817S;
            protected  int beginIp65504P1817L;
            protected  int beginIp65504P1818S;
            protected  int beginIp65504P1818L;
            protected  int beginIp65504P1819S;
            protected  int beginIp65504P1819L;
            protected  int beginIp65504P1820S;
            protected  int beginIp65504P1820L;
            protected  int beginIp65504P1821S;
            protected  int beginIp65504P1821L;
            protected  int beginIp65504P1822S;
            protected  int beginIp65504P1822L;
            protected  int beginIp65504P1823S;
            protected  int beginIp65504P1823L;
            protected  int beginIp65504P1824S;
            protected  int beginIp65504P1824L;
            protected  int beginIp65504P1825S;
            protected  int beginIp65504P1825L;
            protected  int beginIp65504P1826S;
            protected  int beginIp65504P1826L;
            protected  int beginIp65504P1827S;
            protected  int beginIp65504P1827L;
            protected  int beginIp65504P1828S;
            protected  int beginIp65504P1828L;
            protected  int beginIp65504P1829S;
            protected  int beginIp65504P1829L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup59Serialized
	**/
    public Ip65504PdsNamesLargeGroup59Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup59Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup59Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup59Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,14380); // serialize this field at offset 14380 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup59Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 14380 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup59Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_59_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1799S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1799L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1800S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1800L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1801S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1801L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1802S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1802L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1803S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1803L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1804S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1804L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1805S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1805L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1806S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1806L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1807S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1807L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1808S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1808L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1809S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1809L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1810S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1810L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1811S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1811L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1812S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1812L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1813S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1813L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1814S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1814L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1815S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1815L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1816S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1816L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1817S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1817L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1818S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1818L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1819S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1819L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1820S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1820L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1821S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1821L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1822S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1822L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1823S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1823L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1824S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1824L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1825S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1825L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1826S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1826L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1827S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1827L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1828S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1828L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1829S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1829L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1799SCounter = -1;
         public boolean isIp65504P1799SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1799SCounter != sharedCounter;
            localIp65504P1799SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1799_S_LEN = 2;
  	/**
	 * serializeIp65504P1799S
	 */
	protected void serializeIp65504P1799S(short ip65504P1799S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1799S,IP_65504_P_1799_S_LEN)
                  ,beginIp65504P1799S
                  ,IP_65504_P_1799_S_LEN
                 );
            localIp65504P1799SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1799SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1799S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1799S() {	 
			return (getShort(beginIp65504P1799S));
   	}
         int localIp65504P1799LCounter = -1;
         public boolean isIp65504P1799LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1799LCounter != sharedCounter;
            localIp65504P1799LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1799_L_LEN = 2;
  	/**
	 * serializeIp65504P1799L
	 */
	protected void serializeIp65504P1799L(short ip65504P1799L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1799L,IP_65504_P_1799_L_LEN)
                  ,beginIp65504P1799L
                  ,IP_65504_P_1799_L_LEN
                 );
            localIp65504P1799LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1799LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1799L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1799L() {	 
			return (getShort(beginIp65504P1799L));
   	}
         int localIp65504P1800SCounter = -1;
         public boolean isIp65504P1800SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1800SCounter != sharedCounter;
            localIp65504P1800SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1800_S_LEN = 2;
  	/**
	 * serializeIp65504P1800S
	 */
	protected void serializeIp65504P1800S(short ip65504P1800S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1800S,IP_65504_P_1800_S_LEN)
                  ,beginIp65504P1800S
                  ,IP_65504_P_1800_S_LEN
                 );
            localIp65504P1800SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1800SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1800S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1800S() {	 
			return (getShort(beginIp65504P1800S));
   	}
         int localIp65504P1800LCounter = -1;
         public boolean isIp65504P1800LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1800LCounter != sharedCounter;
            localIp65504P1800LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1800_L_LEN = 2;
  	/**
	 * serializeIp65504P1800L
	 */
	protected void serializeIp65504P1800L(short ip65504P1800L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1800L,IP_65504_P_1800_L_LEN)
                  ,beginIp65504P1800L
                  ,IP_65504_P_1800_L_LEN
                 );
            localIp65504P1800LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1800LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1800L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1800L() {	 
			return (getShort(beginIp65504P1800L));
   	}
         int localIp65504P1801SCounter = -1;
         public boolean isIp65504P1801SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1801SCounter != sharedCounter;
            localIp65504P1801SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1801_S_LEN = 2;
  	/**
	 * serializeIp65504P1801S
	 */
	protected void serializeIp65504P1801S(short ip65504P1801S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1801S,IP_65504_P_1801_S_LEN)
                  ,beginIp65504P1801S
                  ,IP_65504_P_1801_S_LEN
                 );
            localIp65504P1801SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1801SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1801S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1801S() {	 
			return (getShort(beginIp65504P1801S));
   	}
         int localIp65504P1801LCounter = -1;
         public boolean isIp65504P1801LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1801LCounter != sharedCounter;
            localIp65504P1801LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1801_L_LEN = 2;
  	/**
	 * serializeIp65504P1801L
	 */
	protected void serializeIp65504P1801L(short ip65504P1801L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1801L,IP_65504_P_1801_L_LEN)
                  ,beginIp65504P1801L
                  ,IP_65504_P_1801_L_LEN
                 );
            localIp65504P1801LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1801LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1801L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1801L() {	 
			return (getShort(beginIp65504P1801L));
   	}
         int localIp65504P1802SCounter = -1;
         public boolean isIp65504P1802SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1802SCounter != sharedCounter;
            localIp65504P1802SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1802_S_LEN = 2;
  	/**
	 * serializeIp65504P1802S
	 */
	protected void serializeIp65504P1802S(short ip65504P1802S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1802S,IP_65504_P_1802_S_LEN)
                  ,beginIp65504P1802S
                  ,IP_65504_P_1802_S_LEN
                 );
            localIp65504P1802SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1802SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1802S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1802S() {	 
			return (getShort(beginIp65504P1802S));
   	}
         int localIp65504P1802LCounter = -1;
         public boolean isIp65504P1802LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1802LCounter != sharedCounter;
            localIp65504P1802LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1802_L_LEN = 2;
  	/**
	 * serializeIp65504P1802L
	 */
	protected void serializeIp65504P1802L(short ip65504P1802L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1802L,IP_65504_P_1802_L_LEN)
                  ,beginIp65504P1802L
                  ,IP_65504_P_1802_L_LEN
                 );
            localIp65504P1802LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1802LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1802L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1802L() {	 
			return (getShort(beginIp65504P1802L));
   	}
         int localIp65504P1803SCounter = -1;
         public boolean isIp65504P1803SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1803SCounter != sharedCounter;
            localIp65504P1803SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1803_S_LEN = 2;
  	/**
	 * serializeIp65504P1803S
	 */
	protected void serializeIp65504P1803S(short ip65504P1803S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1803S,IP_65504_P_1803_S_LEN)
                  ,beginIp65504P1803S
                  ,IP_65504_P_1803_S_LEN
                 );
            localIp65504P1803SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1803SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1803S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1803S() {	 
			return (getShort(beginIp65504P1803S));
   	}
         int localIp65504P1803LCounter = -1;
         public boolean isIp65504P1803LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1803LCounter != sharedCounter;
            localIp65504P1803LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1803_L_LEN = 2;
  	/**
	 * serializeIp65504P1803L
	 */
	protected void serializeIp65504P1803L(short ip65504P1803L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1803L,IP_65504_P_1803_L_LEN)
                  ,beginIp65504P1803L
                  ,IP_65504_P_1803_L_LEN
                 );
            localIp65504P1803LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1803LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1803L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1803L() {	 
			return (getShort(beginIp65504P1803L));
   	}
         int localIp65504P1804SCounter = -1;
         public boolean isIp65504P1804SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1804SCounter != sharedCounter;
            localIp65504P1804SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1804_S_LEN = 2;
  	/**
	 * serializeIp65504P1804S
	 */
	protected void serializeIp65504P1804S(short ip65504P1804S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1804S,IP_65504_P_1804_S_LEN)
                  ,beginIp65504P1804S
                  ,IP_65504_P_1804_S_LEN
                 );
            localIp65504P1804SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1804SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1804S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1804S() {	 
			return (getShort(beginIp65504P1804S));
   	}
         int localIp65504P1804LCounter = -1;
         public boolean isIp65504P1804LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1804LCounter != sharedCounter;
            localIp65504P1804LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1804_L_LEN = 2;
  	/**
	 * serializeIp65504P1804L
	 */
	protected void serializeIp65504P1804L(short ip65504P1804L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1804L,IP_65504_P_1804_L_LEN)
                  ,beginIp65504P1804L
                  ,IP_65504_P_1804_L_LEN
                 );
            localIp65504P1804LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1804LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1804L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1804L() {	 
			return (getShort(beginIp65504P1804L));
   	}
         int localIp65504P1805SCounter = -1;
         public boolean isIp65504P1805SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1805SCounter != sharedCounter;
            localIp65504P1805SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1805_S_LEN = 2;
  	/**
	 * serializeIp65504P1805S
	 */
	protected void serializeIp65504P1805S(short ip65504P1805S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1805S,IP_65504_P_1805_S_LEN)
                  ,beginIp65504P1805S
                  ,IP_65504_P_1805_S_LEN
                 );
            localIp65504P1805SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1805SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1805S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1805S() {	 
			return (getShort(beginIp65504P1805S));
   	}
         int localIp65504P1805LCounter = -1;
         public boolean isIp65504P1805LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1805LCounter != sharedCounter;
            localIp65504P1805LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1805_L_LEN = 2;
  	/**
	 * serializeIp65504P1805L
	 */
	protected void serializeIp65504P1805L(short ip65504P1805L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1805L,IP_65504_P_1805_L_LEN)
                  ,beginIp65504P1805L
                  ,IP_65504_P_1805_L_LEN
                 );
            localIp65504P1805LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1805LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1805L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1805L() {	 
			return (getShort(beginIp65504P1805L));
   	}
         int localIp65504P1806SCounter = -1;
         public boolean isIp65504P1806SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1806SCounter != sharedCounter;
            localIp65504P1806SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1806_S_LEN = 2;
  	/**
	 * serializeIp65504P1806S
	 */
	protected void serializeIp65504P1806S(short ip65504P1806S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1806S,IP_65504_P_1806_S_LEN)
                  ,beginIp65504P1806S
                  ,IP_65504_P_1806_S_LEN
                 );
            localIp65504P1806SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1806SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1806S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1806S() {	 
			return (getShort(beginIp65504P1806S));
   	}
         int localIp65504P1806LCounter = -1;
         public boolean isIp65504P1806LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1806LCounter != sharedCounter;
            localIp65504P1806LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1806_L_LEN = 2;
  	/**
	 * serializeIp65504P1806L
	 */
	protected void serializeIp65504P1806L(short ip65504P1806L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1806L,IP_65504_P_1806_L_LEN)
                  ,beginIp65504P1806L
                  ,IP_65504_P_1806_L_LEN
                 );
            localIp65504P1806LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1806LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1806L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1806L() {	 
			return (getShort(beginIp65504P1806L));
   	}
         int localIp65504P1807SCounter = -1;
         public boolean isIp65504P1807SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1807SCounter != sharedCounter;
            localIp65504P1807SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1807_S_LEN = 2;
  	/**
	 * serializeIp65504P1807S
	 */
	protected void serializeIp65504P1807S(short ip65504P1807S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1807S,IP_65504_P_1807_S_LEN)
                  ,beginIp65504P1807S
                  ,IP_65504_P_1807_S_LEN
                 );
            localIp65504P1807SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1807SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1807S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1807S() {	 
			return (getShort(beginIp65504P1807S));
   	}
         int localIp65504P1807LCounter = -1;
         public boolean isIp65504P1807LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1807LCounter != sharedCounter;
            localIp65504P1807LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1807_L_LEN = 2;
  	/**
	 * serializeIp65504P1807L
	 */
	protected void serializeIp65504P1807L(short ip65504P1807L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1807L,IP_65504_P_1807_L_LEN)
                  ,beginIp65504P1807L
                  ,IP_65504_P_1807_L_LEN
                 );
            localIp65504P1807LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1807LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1807L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1807L() {	 
			return (getShort(beginIp65504P1807L));
   	}
         int localIp65504P1808SCounter = -1;
         public boolean isIp65504P1808SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1808SCounter != sharedCounter;
            localIp65504P1808SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1808_S_LEN = 2;
  	/**
	 * serializeIp65504P1808S
	 */
	protected void serializeIp65504P1808S(short ip65504P1808S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1808S,IP_65504_P_1808_S_LEN)
                  ,beginIp65504P1808S
                  ,IP_65504_P_1808_S_LEN
                 );
            localIp65504P1808SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1808SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1808S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1808S() {	 
			return (getShort(beginIp65504P1808S));
   	}
         int localIp65504P1808LCounter = -1;
         public boolean isIp65504P1808LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1808LCounter != sharedCounter;
            localIp65504P1808LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1808_L_LEN = 2;
  	/**
	 * serializeIp65504P1808L
	 */
	protected void serializeIp65504P1808L(short ip65504P1808L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1808L,IP_65504_P_1808_L_LEN)
                  ,beginIp65504P1808L
                  ,IP_65504_P_1808_L_LEN
                 );
            localIp65504P1808LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1808LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1808L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1808L() {	 
			return (getShort(beginIp65504P1808L));
   	}
         int localIp65504P1809SCounter = -1;
         public boolean isIp65504P1809SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1809SCounter != sharedCounter;
            localIp65504P1809SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1809_S_LEN = 2;
  	/**
	 * serializeIp65504P1809S
	 */
	protected void serializeIp65504P1809S(short ip65504P1809S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1809S,IP_65504_P_1809_S_LEN)
                  ,beginIp65504P1809S
                  ,IP_65504_P_1809_S_LEN
                 );
            localIp65504P1809SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1809SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1809S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1809S() {	 
			return (getShort(beginIp65504P1809S));
   	}
         int localIp65504P1809LCounter = -1;
         public boolean isIp65504P1809LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1809LCounter != sharedCounter;
            localIp65504P1809LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1809_L_LEN = 2;
  	/**
	 * serializeIp65504P1809L
	 */
	protected void serializeIp65504P1809L(short ip65504P1809L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1809L,IP_65504_P_1809_L_LEN)
                  ,beginIp65504P1809L
                  ,IP_65504_P_1809_L_LEN
                 );
            localIp65504P1809LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1809LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1809L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1809L() {	 
			return (getShort(beginIp65504P1809L));
   	}
         int localIp65504P1810SCounter = -1;
         public boolean isIp65504P1810SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1810SCounter != sharedCounter;
            localIp65504P1810SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1810_S_LEN = 2;
  	/**
	 * serializeIp65504P1810S
	 */
	protected void serializeIp65504P1810S(short ip65504P1810S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1810S,IP_65504_P_1810_S_LEN)
                  ,beginIp65504P1810S
                  ,IP_65504_P_1810_S_LEN
                 );
            localIp65504P1810SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1810SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1810S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1810S() {	 
			return (getShort(beginIp65504P1810S));
   	}
         int localIp65504P1810LCounter = -1;
         public boolean isIp65504P1810LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1810LCounter != sharedCounter;
            localIp65504P1810LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1810_L_LEN = 2;
  	/**
	 * serializeIp65504P1810L
	 */
	protected void serializeIp65504P1810L(short ip65504P1810L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1810L,IP_65504_P_1810_L_LEN)
                  ,beginIp65504P1810L
                  ,IP_65504_P_1810_L_LEN
                 );
            localIp65504P1810LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1810LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1810L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1810L() {	 
			return (getShort(beginIp65504P1810L));
   	}
         int localIp65504P1811SCounter = -1;
         public boolean isIp65504P1811SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1811SCounter != sharedCounter;
            localIp65504P1811SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1811_S_LEN = 2;
  	/**
	 * serializeIp65504P1811S
	 */
	protected void serializeIp65504P1811S(short ip65504P1811S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1811S,IP_65504_P_1811_S_LEN)
                  ,beginIp65504P1811S
                  ,IP_65504_P_1811_S_LEN
                 );
            localIp65504P1811SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1811SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1811S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1811S() {	 
			return (getShort(beginIp65504P1811S));
   	}
         int localIp65504P1811LCounter = -1;
         public boolean isIp65504P1811LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1811LCounter != sharedCounter;
            localIp65504P1811LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1811_L_LEN = 2;
  	/**
	 * serializeIp65504P1811L
	 */
	protected void serializeIp65504P1811L(short ip65504P1811L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1811L,IP_65504_P_1811_L_LEN)
                  ,beginIp65504P1811L
                  ,IP_65504_P_1811_L_LEN
                 );
            localIp65504P1811LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1811LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1811L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1811L() {	 
			return (getShort(beginIp65504P1811L));
   	}
         int localIp65504P1812SCounter = -1;
         public boolean isIp65504P1812SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1812SCounter != sharedCounter;
            localIp65504P1812SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1812_S_LEN = 2;
  	/**
	 * serializeIp65504P1812S
	 */
	protected void serializeIp65504P1812S(short ip65504P1812S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1812S,IP_65504_P_1812_S_LEN)
                  ,beginIp65504P1812S
                  ,IP_65504_P_1812_S_LEN
                 );
            localIp65504P1812SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1812SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1812S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1812S() {	 
			return (getShort(beginIp65504P1812S));
   	}
         int localIp65504P1812LCounter = -1;
         public boolean isIp65504P1812LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1812LCounter != sharedCounter;
            localIp65504P1812LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1812_L_LEN = 2;
  	/**
	 * serializeIp65504P1812L
	 */
	protected void serializeIp65504P1812L(short ip65504P1812L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1812L,IP_65504_P_1812_L_LEN)
                  ,beginIp65504P1812L
                  ,IP_65504_P_1812_L_LEN
                 );
            localIp65504P1812LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1812LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1812L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1812L() {	 
			return (getShort(beginIp65504P1812L));
   	}
         int localIp65504P1813SCounter = -1;
         public boolean isIp65504P1813SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1813SCounter != sharedCounter;
            localIp65504P1813SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1813_S_LEN = 2;
  	/**
	 * serializeIp65504P1813S
	 */
	protected void serializeIp65504P1813S(short ip65504P1813S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1813S,IP_65504_P_1813_S_LEN)
                  ,beginIp65504P1813S
                  ,IP_65504_P_1813_S_LEN
                 );
            localIp65504P1813SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1813SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1813S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1813S() {	 
			return (getShort(beginIp65504P1813S));
   	}
         int localIp65504P1813LCounter = -1;
         public boolean isIp65504P1813LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1813LCounter != sharedCounter;
            localIp65504P1813LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1813_L_LEN = 2;
  	/**
	 * serializeIp65504P1813L
	 */
	protected void serializeIp65504P1813L(short ip65504P1813L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1813L,IP_65504_P_1813_L_LEN)
                  ,beginIp65504P1813L
                  ,IP_65504_P_1813_L_LEN
                 );
            localIp65504P1813LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1813LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1813L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1813L() {	 
			return (getShort(beginIp65504P1813L));
   	}
         int localIp65504P1814SCounter = -1;
         public boolean isIp65504P1814SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1814SCounter != sharedCounter;
            localIp65504P1814SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1814_S_LEN = 2;
  	/**
	 * serializeIp65504P1814S
	 */
	protected void serializeIp65504P1814S(short ip65504P1814S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1814S,IP_65504_P_1814_S_LEN)
                  ,beginIp65504P1814S
                  ,IP_65504_P_1814_S_LEN
                 );
            localIp65504P1814SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1814SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1814S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1814S() {	 
			return (getShort(beginIp65504P1814S));
   	}
         int localIp65504P1814LCounter = -1;
         public boolean isIp65504P1814LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1814LCounter != sharedCounter;
            localIp65504P1814LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1814_L_LEN = 2;
  	/**
	 * serializeIp65504P1814L
	 */
	protected void serializeIp65504P1814L(short ip65504P1814L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1814L,IP_65504_P_1814_L_LEN)
                  ,beginIp65504P1814L
                  ,IP_65504_P_1814_L_LEN
                 );
            localIp65504P1814LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1814LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1814L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1814L() {	 
			return (getShort(beginIp65504P1814L));
   	}
         int localIp65504P1815SCounter = -1;
         public boolean isIp65504P1815SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1815SCounter != sharedCounter;
            localIp65504P1815SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1815_S_LEN = 2;
  	/**
	 * serializeIp65504P1815S
	 */
	protected void serializeIp65504P1815S(short ip65504P1815S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1815S,IP_65504_P_1815_S_LEN)
                  ,beginIp65504P1815S
                  ,IP_65504_P_1815_S_LEN
                 );
            localIp65504P1815SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1815SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1815S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1815S() {	 
			return (getShort(beginIp65504P1815S));
   	}
         int localIp65504P1815LCounter = -1;
         public boolean isIp65504P1815LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1815LCounter != sharedCounter;
            localIp65504P1815LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1815_L_LEN = 2;
  	/**
	 * serializeIp65504P1815L
	 */
	protected void serializeIp65504P1815L(short ip65504P1815L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1815L,IP_65504_P_1815_L_LEN)
                  ,beginIp65504P1815L
                  ,IP_65504_P_1815_L_LEN
                 );
            localIp65504P1815LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1815LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1815L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1815L() {	 
			return (getShort(beginIp65504P1815L));
   	}
         int localIp65504P1816SCounter = -1;
         public boolean isIp65504P1816SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1816SCounter != sharedCounter;
            localIp65504P1816SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1816_S_LEN = 2;
  	/**
	 * serializeIp65504P1816S
	 */
	protected void serializeIp65504P1816S(short ip65504P1816S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1816S,IP_65504_P_1816_S_LEN)
                  ,beginIp65504P1816S
                  ,IP_65504_P_1816_S_LEN
                 );
            localIp65504P1816SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1816SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1816S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1816S() {	 
			return (getShort(beginIp65504P1816S));
   	}
         int localIp65504P1816LCounter = -1;
         public boolean isIp65504P1816LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1816LCounter != sharedCounter;
            localIp65504P1816LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1816_L_LEN = 2;
  	/**
	 * serializeIp65504P1816L
	 */
	protected void serializeIp65504P1816L(short ip65504P1816L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1816L,IP_65504_P_1816_L_LEN)
                  ,beginIp65504P1816L
                  ,IP_65504_P_1816_L_LEN
                 );
            localIp65504P1816LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1816LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1816L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1816L() {	 
			return (getShort(beginIp65504P1816L));
   	}
         int localIp65504P1817SCounter = -1;
         public boolean isIp65504P1817SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1817SCounter != sharedCounter;
            localIp65504P1817SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1817_S_LEN = 2;
  	/**
	 * serializeIp65504P1817S
	 */
	protected void serializeIp65504P1817S(short ip65504P1817S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1817S,IP_65504_P_1817_S_LEN)
                  ,beginIp65504P1817S
                  ,IP_65504_P_1817_S_LEN
                 );
            localIp65504P1817SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1817SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1817S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1817S() {	 
			return (getShort(beginIp65504P1817S));
   	}
         int localIp65504P1817LCounter = -1;
         public boolean isIp65504P1817LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1817LCounter != sharedCounter;
            localIp65504P1817LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1817_L_LEN = 2;
  	/**
	 * serializeIp65504P1817L
	 */
	protected void serializeIp65504P1817L(short ip65504P1817L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1817L,IP_65504_P_1817_L_LEN)
                  ,beginIp65504P1817L
                  ,IP_65504_P_1817_L_LEN
                 );
            localIp65504P1817LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1817LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1817L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1817L() {	 
			return (getShort(beginIp65504P1817L));
   	}
         int localIp65504P1818SCounter = -1;
         public boolean isIp65504P1818SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1818SCounter != sharedCounter;
            localIp65504P1818SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1818_S_LEN = 2;
  	/**
	 * serializeIp65504P1818S
	 */
	protected void serializeIp65504P1818S(short ip65504P1818S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1818S,IP_65504_P_1818_S_LEN)
                  ,beginIp65504P1818S
                  ,IP_65504_P_1818_S_LEN
                 );
            localIp65504P1818SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1818SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1818S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1818S() {	 
			return (getShort(beginIp65504P1818S));
   	}
         int localIp65504P1818LCounter = -1;
         public boolean isIp65504P1818LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1818LCounter != sharedCounter;
            localIp65504P1818LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1818_L_LEN = 2;
  	/**
	 * serializeIp65504P1818L
	 */
	protected void serializeIp65504P1818L(short ip65504P1818L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1818L,IP_65504_P_1818_L_LEN)
                  ,beginIp65504P1818L
                  ,IP_65504_P_1818_L_LEN
                 );
            localIp65504P1818LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1818LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1818L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1818L() {	 
			return (getShort(beginIp65504P1818L));
   	}
         int localIp65504P1819SCounter = -1;
         public boolean isIp65504P1819SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1819SCounter != sharedCounter;
            localIp65504P1819SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1819_S_LEN = 2;
  	/**
	 * serializeIp65504P1819S
	 */
	protected void serializeIp65504P1819S(short ip65504P1819S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1819S,IP_65504_P_1819_S_LEN)
                  ,beginIp65504P1819S
                  ,IP_65504_P_1819_S_LEN
                 );
            localIp65504P1819SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1819SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1819S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1819S() {	 
			return (getShort(beginIp65504P1819S));
   	}
         int localIp65504P1819LCounter = -1;
         public boolean isIp65504P1819LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1819LCounter != sharedCounter;
            localIp65504P1819LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1819_L_LEN = 2;
  	/**
	 * serializeIp65504P1819L
	 */
	protected void serializeIp65504P1819L(short ip65504P1819L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1819L,IP_65504_P_1819_L_LEN)
                  ,beginIp65504P1819L
                  ,IP_65504_P_1819_L_LEN
                 );
            localIp65504P1819LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1819LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1819L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1819L() {	 
			return (getShort(beginIp65504P1819L));
   	}
         int localIp65504P1820SCounter = -1;
         public boolean isIp65504P1820SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1820SCounter != sharedCounter;
            localIp65504P1820SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1820_S_LEN = 2;
  	/**
	 * serializeIp65504P1820S
	 */
	protected void serializeIp65504P1820S(short ip65504P1820S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1820S,IP_65504_P_1820_S_LEN)
                  ,beginIp65504P1820S
                  ,IP_65504_P_1820_S_LEN
                 );
            localIp65504P1820SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1820SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1820S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1820S() {	 
			return (getShort(beginIp65504P1820S));
   	}
         int localIp65504P1820LCounter = -1;
         public boolean isIp65504P1820LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1820LCounter != sharedCounter;
            localIp65504P1820LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1820_L_LEN = 2;
  	/**
	 * serializeIp65504P1820L
	 */
	protected void serializeIp65504P1820L(short ip65504P1820L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1820L,IP_65504_P_1820_L_LEN)
                  ,beginIp65504P1820L
                  ,IP_65504_P_1820_L_LEN
                 );
            localIp65504P1820LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1820LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1820L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1820L() {	 
			return (getShort(beginIp65504P1820L));
   	}
         int localIp65504P1821SCounter = -1;
         public boolean isIp65504P1821SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1821SCounter != sharedCounter;
            localIp65504P1821SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1821_S_LEN = 2;
  	/**
	 * serializeIp65504P1821S
	 */
	protected void serializeIp65504P1821S(short ip65504P1821S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1821S,IP_65504_P_1821_S_LEN)
                  ,beginIp65504P1821S
                  ,IP_65504_P_1821_S_LEN
                 );
            localIp65504P1821SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1821SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1821S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1821S() {	 
			return (getShort(beginIp65504P1821S));
   	}
         int localIp65504P1821LCounter = -1;
         public boolean isIp65504P1821LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1821LCounter != sharedCounter;
            localIp65504P1821LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1821_L_LEN = 2;
  	/**
	 * serializeIp65504P1821L
	 */
	protected void serializeIp65504P1821L(short ip65504P1821L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1821L,IP_65504_P_1821_L_LEN)
                  ,beginIp65504P1821L
                  ,IP_65504_P_1821_L_LEN
                 );
            localIp65504P1821LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1821LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1821L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1821L() {	 
			return (getShort(beginIp65504P1821L));
   	}
         int localIp65504P1822SCounter = -1;
         public boolean isIp65504P1822SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1822SCounter != sharedCounter;
            localIp65504P1822SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1822_S_LEN = 2;
  	/**
	 * serializeIp65504P1822S
	 */
	protected void serializeIp65504P1822S(short ip65504P1822S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1822S,IP_65504_P_1822_S_LEN)
                  ,beginIp65504P1822S
                  ,IP_65504_P_1822_S_LEN
                 );
            localIp65504P1822SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1822SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1822S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1822S() {	 
			return (getShort(beginIp65504P1822S));
   	}
         int localIp65504P1822LCounter = -1;
         public boolean isIp65504P1822LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1822LCounter != sharedCounter;
            localIp65504P1822LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1822_L_LEN = 2;
  	/**
	 * serializeIp65504P1822L
	 */
	protected void serializeIp65504P1822L(short ip65504P1822L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1822L,IP_65504_P_1822_L_LEN)
                  ,beginIp65504P1822L
                  ,IP_65504_P_1822_L_LEN
                 );
            localIp65504P1822LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1822LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1822L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1822L() {	 
			return (getShort(beginIp65504P1822L));
   	}
         int localIp65504P1823SCounter = -1;
         public boolean isIp65504P1823SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1823SCounter != sharedCounter;
            localIp65504P1823SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1823_S_LEN = 2;
  	/**
	 * serializeIp65504P1823S
	 */
	protected void serializeIp65504P1823S(short ip65504P1823S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1823S,IP_65504_P_1823_S_LEN)
                  ,beginIp65504P1823S
                  ,IP_65504_P_1823_S_LEN
                 );
            localIp65504P1823SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1823SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1823S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1823S() {	 
			return (getShort(beginIp65504P1823S));
   	}
         int localIp65504P1823LCounter = -1;
         public boolean isIp65504P1823LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1823LCounter != sharedCounter;
            localIp65504P1823LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1823_L_LEN = 2;
  	/**
	 * serializeIp65504P1823L
	 */
	protected void serializeIp65504P1823L(short ip65504P1823L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1823L,IP_65504_P_1823_L_LEN)
                  ,beginIp65504P1823L
                  ,IP_65504_P_1823_L_LEN
                 );
            localIp65504P1823LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1823LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1823L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1823L() {	 
			return (getShort(beginIp65504P1823L));
   	}
         int localIp65504P1824SCounter = -1;
         public boolean isIp65504P1824SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1824SCounter != sharedCounter;
            localIp65504P1824SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1824_S_LEN = 2;
  	/**
	 * serializeIp65504P1824S
	 */
	protected void serializeIp65504P1824S(short ip65504P1824S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1824S,IP_65504_P_1824_S_LEN)
                  ,beginIp65504P1824S
                  ,IP_65504_P_1824_S_LEN
                 );
            localIp65504P1824SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1824SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1824S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1824S() {	 
			return (getShort(beginIp65504P1824S));
   	}
         int localIp65504P1824LCounter = -1;
         public boolean isIp65504P1824LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1824LCounter != sharedCounter;
            localIp65504P1824LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1824_L_LEN = 2;
  	/**
	 * serializeIp65504P1824L
	 */
	protected void serializeIp65504P1824L(short ip65504P1824L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1824L,IP_65504_P_1824_L_LEN)
                  ,beginIp65504P1824L
                  ,IP_65504_P_1824_L_LEN
                 );
            localIp65504P1824LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1824LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1824L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1824L() {	 
			return (getShort(beginIp65504P1824L));
   	}
         int localIp65504P1825SCounter = -1;
         public boolean isIp65504P1825SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1825SCounter != sharedCounter;
            localIp65504P1825SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1825_S_LEN = 2;
  	/**
	 * serializeIp65504P1825S
	 */
	protected void serializeIp65504P1825S(short ip65504P1825S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1825S,IP_65504_P_1825_S_LEN)
                  ,beginIp65504P1825S
                  ,IP_65504_P_1825_S_LEN
                 );
            localIp65504P1825SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1825SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1825S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1825S() {	 
			return (getShort(beginIp65504P1825S));
   	}
         int localIp65504P1825LCounter = -1;
         public boolean isIp65504P1825LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1825LCounter != sharedCounter;
            localIp65504P1825LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1825_L_LEN = 2;
  	/**
	 * serializeIp65504P1825L
	 */
	protected void serializeIp65504P1825L(short ip65504P1825L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1825L,IP_65504_P_1825_L_LEN)
                  ,beginIp65504P1825L
                  ,IP_65504_P_1825_L_LEN
                 );
            localIp65504P1825LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1825LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1825L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1825L() {	 
			return (getShort(beginIp65504P1825L));
   	}
         int localIp65504P1826SCounter = -1;
         public boolean isIp65504P1826SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1826SCounter != sharedCounter;
            localIp65504P1826SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1826_S_LEN = 2;
  	/**
	 * serializeIp65504P1826S
	 */
	protected void serializeIp65504P1826S(short ip65504P1826S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1826S,IP_65504_P_1826_S_LEN)
                  ,beginIp65504P1826S
                  ,IP_65504_P_1826_S_LEN
                 );
            localIp65504P1826SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1826SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1826S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1826S() {	 
			return (getShort(beginIp65504P1826S));
   	}
         int localIp65504P1826LCounter = -1;
         public boolean isIp65504P1826LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1826LCounter != sharedCounter;
            localIp65504P1826LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1826_L_LEN = 2;
  	/**
	 * serializeIp65504P1826L
	 */
	protected void serializeIp65504P1826L(short ip65504P1826L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1826L,IP_65504_P_1826_L_LEN)
                  ,beginIp65504P1826L
                  ,IP_65504_P_1826_L_LEN
                 );
            localIp65504P1826LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1826LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1826L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1826L() {	 
			return (getShort(beginIp65504P1826L));
   	}
         int localIp65504P1827SCounter = -1;
         public boolean isIp65504P1827SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1827SCounter != sharedCounter;
            localIp65504P1827SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1827_S_LEN = 2;
  	/**
	 * serializeIp65504P1827S
	 */
	protected void serializeIp65504P1827S(short ip65504P1827S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1827S,IP_65504_P_1827_S_LEN)
                  ,beginIp65504P1827S
                  ,IP_65504_P_1827_S_LEN
                 );
            localIp65504P1827SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1827SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1827S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1827S() {	 
			return (getShort(beginIp65504P1827S));
   	}
         int localIp65504P1827LCounter = -1;
         public boolean isIp65504P1827LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1827LCounter != sharedCounter;
            localIp65504P1827LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1827_L_LEN = 2;
  	/**
	 * serializeIp65504P1827L
	 */
	protected void serializeIp65504P1827L(short ip65504P1827L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1827L,IP_65504_P_1827_L_LEN)
                  ,beginIp65504P1827L
                  ,IP_65504_P_1827_L_LEN
                 );
            localIp65504P1827LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1827LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1827L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1827L() {	 
			return (getShort(beginIp65504P1827L));
   	}
         int localIp65504P1828SCounter = -1;
         public boolean isIp65504P1828SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1828SCounter != sharedCounter;
            localIp65504P1828SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1828_S_LEN = 2;
  	/**
	 * serializeIp65504P1828S
	 */
	protected void serializeIp65504P1828S(short ip65504P1828S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1828S,IP_65504_P_1828_S_LEN)
                  ,beginIp65504P1828S
                  ,IP_65504_P_1828_S_LEN
                 );
            localIp65504P1828SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1828SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1828S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1828S() {	 
			return (getShort(beginIp65504P1828S));
   	}
         int localIp65504P1828LCounter = -1;
         public boolean isIp65504P1828LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1828LCounter != sharedCounter;
            localIp65504P1828LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1828_L_LEN = 2;
  	/**
	 * serializeIp65504P1828L
	 */
	protected void serializeIp65504P1828L(short ip65504P1828L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1828L,IP_65504_P_1828_L_LEN)
                  ,beginIp65504P1828L
                  ,IP_65504_P_1828_L_LEN
                 );
            localIp65504P1828LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1828LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1828L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1828L() {	 
			return (getShort(beginIp65504P1828L));
   	}
         int localIp65504P1829SCounter = -1;
         public boolean isIp65504P1829SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1829SCounter != sharedCounter;
            localIp65504P1829SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1829_S_LEN = 2;
  	/**
	 * serializeIp65504P1829S
	 */
	protected void serializeIp65504P1829S(short ip65504P1829S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1829S,IP_65504_P_1829_S_LEN)
                  ,beginIp65504P1829S
                  ,IP_65504_P_1829_S_LEN
                 );
            localIp65504P1829SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1829SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1829S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1829S() {	 
			return (getShort(beginIp65504P1829S));
   	}
         int localIp65504P1829LCounter = -1;
         public boolean isIp65504P1829LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1829LCounter != sharedCounter;
            localIp65504P1829LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1829_L_LEN = 2;
  	/**
	 * serializeIp65504P1829L
	 */
	protected void serializeIp65504P1829L(short ip65504P1829L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1829L,IP_65504_P_1829_L_LEN)
                  ,beginIp65504P1829L
                  ,IP_65504_P_1829_L_LEN
                 );
            localIp65504P1829LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1829LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1829L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1829L() {	 
			return (getShort(beginIp65504P1829L));
   	}




}
  
