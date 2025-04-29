package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup60Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup60Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup60Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_60_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1830S;
            protected  int beginIp65504P1830L;
            protected  int beginIp65504P1831S;
            protected  int beginIp65504P1831L;
            protected  int beginIp65504P1832S;
            protected  int beginIp65504P1832L;
            protected  int beginIp65504P1833S;
            protected  int beginIp65504P1833L;
            protected  int beginIp65504P1834S;
            protected  int beginIp65504P1834L;
            protected  int beginIp65504P1835S;
            protected  int beginIp65504P1835L;
            protected  int beginIp65504P1836S;
            protected  int beginIp65504P1836L;
            protected  int beginIp65504P1837S;
            protected  int beginIp65504P1837L;
            protected  int beginIp65504P1838S;
            protected  int beginIp65504P1838L;
            protected  int beginIp65504P1839S;
            protected  int beginIp65504P1839L;
            protected  int beginIp65504P1840S;
            protected  int beginIp65504P1840L;
            protected  int beginIp65504P1841S;
            protected  int beginIp65504P1841L;
            protected  int beginIp65504P1842S;
            protected  int beginIp65504P1842L;
            protected  int beginIp65504P1843S;
            protected  int beginIp65504P1843L;
            protected  int beginIp65504P1844S;
            protected  int beginIp65504P1844L;
            protected  int beginIp65504P1845S;
            protected  int beginIp65504P1845L;
            protected  int beginIp65504P1846S;
            protected  int beginIp65504P1846L;
            protected  int beginIp65504P1847S;
            protected  int beginIp65504P1847L;
            protected  int beginIp65504P1848S;
            protected  int beginIp65504P1848L;
            protected  int beginIp65504P1849S;
            protected  int beginIp65504P1849L;
            protected  int beginIp65504P1850S;
            protected  int beginIp65504P1850L;
            protected  int beginIp65504P1851S;
            protected  int beginIp65504P1851L;
            protected  int beginIp65504P1852S;
            protected  int beginIp65504P1852L;
            protected  int beginIp65504P1853S;
            protected  int beginIp65504P1853L;
            protected  int beginIp65504P1854S;
            protected  int beginIp65504P1854L;
            protected  int beginIp65504P1855S;
            protected  int beginIp65504P1855L;
            protected  int beginIp65504P1856S;
            protected  int beginIp65504P1856L;
            protected  int beginIp65504P1857S;
            protected  int beginIp65504P1857L;
            protected  int beginIp65504P1858S;
            protected  int beginIp65504P1858L;
            protected  int beginIp65504P1859S;
            protected  int beginIp65504P1859L;
            protected  int beginIp65504P1860S;
            protected  int beginIp65504P1860L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup60Serialized
	**/
    public Ip65504PdsNamesLargeGroup60Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup60Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup60Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup60Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,14628); // serialize this field at offset 14628 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup60Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 14628 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup60Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_60_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1830S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1830L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1831S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1831L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1832S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1832L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1833S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1833L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1834S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1834L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1835S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1835L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1836S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1836L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1837S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1837L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1838S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1838L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1839S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1839L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1840S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1840L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1841S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1841L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1842S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1842L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1843S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1843L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1844S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1844L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1845S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1845L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1846S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1846L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1847S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1847L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1848S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1848L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1849S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1849L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1850S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1850L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1851S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1851L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1852S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1852L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1853S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1853L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1854S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1854L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1855S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1855L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1856S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1856L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1857S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1857L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1858S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1858L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1859S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1859L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1860S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1860L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1830SCounter = -1;
         public boolean isIp65504P1830SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1830SCounter != sharedCounter;
            localIp65504P1830SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1830_S_LEN = 2;
  	/**
	 * serializeIp65504P1830S
	 */
	protected void serializeIp65504P1830S(short ip65504P1830S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1830S,IP_65504_P_1830_S_LEN)
                  ,beginIp65504P1830S
                  ,IP_65504_P_1830_S_LEN
                 );
            localIp65504P1830SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1830SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1830S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1830S() {	 
			return (getShort(beginIp65504P1830S));
   	}
         int localIp65504P1830LCounter = -1;
         public boolean isIp65504P1830LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1830LCounter != sharedCounter;
            localIp65504P1830LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1830_L_LEN = 2;
  	/**
	 * serializeIp65504P1830L
	 */
	protected void serializeIp65504P1830L(short ip65504P1830L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1830L,IP_65504_P_1830_L_LEN)
                  ,beginIp65504P1830L
                  ,IP_65504_P_1830_L_LEN
                 );
            localIp65504P1830LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1830LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1830L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1830L() {	 
			return (getShort(beginIp65504P1830L));
   	}
         int localIp65504P1831SCounter = -1;
         public boolean isIp65504P1831SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1831SCounter != sharedCounter;
            localIp65504P1831SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1831_S_LEN = 2;
  	/**
	 * serializeIp65504P1831S
	 */
	protected void serializeIp65504P1831S(short ip65504P1831S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1831S,IP_65504_P_1831_S_LEN)
                  ,beginIp65504P1831S
                  ,IP_65504_P_1831_S_LEN
                 );
            localIp65504P1831SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1831SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1831S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1831S() {	 
			return (getShort(beginIp65504P1831S));
   	}
         int localIp65504P1831LCounter = -1;
         public boolean isIp65504P1831LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1831LCounter != sharedCounter;
            localIp65504P1831LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1831_L_LEN = 2;
  	/**
	 * serializeIp65504P1831L
	 */
	protected void serializeIp65504P1831L(short ip65504P1831L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1831L,IP_65504_P_1831_L_LEN)
                  ,beginIp65504P1831L
                  ,IP_65504_P_1831_L_LEN
                 );
            localIp65504P1831LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1831LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1831L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1831L() {	 
			return (getShort(beginIp65504P1831L));
   	}
         int localIp65504P1832SCounter = -1;
         public boolean isIp65504P1832SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1832SCounter != sharedCounter;
            localIp65504P1832SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1832_S_LEN = 2;
  	/**
	 * serializeIp65504P1832S
	 */
	protected void serializeIp65504P1832S(short ip65504P1832S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1832S,IP_65504_P_1832_S_LEN)
                  ,beginIp65504P1832S
                  ,IP_65504_P_1832_S_LEN
                 );
            localIp65504P1832SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1832SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1832S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1832S() {	 
			return (getShort(beginIp65504P1832S));
   	}
         int localIp65504P1832LCounter = -1;
         public boolean isIp65504P1832LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1832LCounter != sharedCounter;
            localIp65504P1832LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1832_L_LEN = 2;
  	/**
	 * serializeIp65504P1832L
	 */
	protected void serializeIp65504P1832L(short ip65504P1832L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1832L,IP_65504_P_1832_L_LEN)
                  ,beginIp65504P1832L
                  ,IP_65504_P_1832_L_LEN
                 );
            localIp65504P1832LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1832LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1832L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1832L() {	 
			return (getShort(beginIp65504P1832L));
   	}
         int localIp65504P1833SCounter = -1;
         public boolean isIp65504P1833SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1833SCounter != sharedCounter;
            localIp65504P1833SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1833_S_LEN = 2;
  	/**
	 * serializeIp65504P1833S
	 */
	protected void serializeIp65504P1833S(short ip65504P1833S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1833S,IP_65504_P_1833_S_LEN)
                  ,beginIp65504P1833S
                  ,IP_65504_P_1833_S_LEN
                 );
            localIp65504P1833SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1833SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1833S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1833S() {	 
			return (getShort(beginIp65504P1833S));
   	}
         int localIp65504P1833LCounter = -1;
         public boolean isIp65504P1833LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1833LCounter != sharedCounter;
            localIp65504P1833LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1833_L_LEN = 2;
  	/**
	 * serializeIp65504P1833L
	 */
	protected void serializeIp65504P1833L(short ip65504P1833L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1833L,IP_65504_P_1833_L_LEN)
                  ,beginIp65504P1833L
                  ,IP_65504_P_1833_L_LEN
                 );
            localIp65504P1833LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1833LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1833L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1833L() {	 
			return (getShort(beginIp65504P1833L));
   	}
         int localIp65504P1834SCounter = -1;
         public boolean isIp65504P1834SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1834SCounter != sharedCounter;
            localIp65504P1834SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1834_S_LEN = 2;
  	/**
	 * serializeIp65504P1834S
	 */
	protected void serializeIp65504P1834S(short ip65504P1834S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1834S,IP_65504_P_1834_S_LEN)
                  ,beginIp65504P1834S
                  ,IP_65504_P_1834_S_LEN
                 );
            localIp65504P1834SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1834SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1834S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1834S() {	 
			return (getShort(beginIp65504P1834S));
   	}
         int localIp65504P1834LCounter = -1;
         public boolean isIp65504P1834LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1834LCounter != sharedCounter;
            localIp65504P1834LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1834_L_LEN = 2;
  	/**
	 * serializeIp65504P1834L
	 */
	protected void serializeIp65504P1834L(short ip65504P1834L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1834L,IP_65504_P_1834_L_LEN)
                  ,beginIp65504P1834L
                  ,IP_65504_P_1834_L_LEN
                 );
            localIp65504P1834LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1834LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1834L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1834L() {	 
			return (getShort(beginIp65504P1834L));
   	}
         int localIp65504P1835SCounter = -1;
         public boolean isIp65504P1835SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1835SCounter != sharedCounter;
            localIp65504P1835SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1835_S_LEN = 2;
  	/**
	 * serializeIp65504P1835S
	 */
	protected void serializeIp65504P1835S(short ip65504P1835S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1835S,IP_65504_P_1835_S_LEN)
                  ,beginIp65504P1835S
                  ,IP_65504_P_1835_S_LEN
                 );
            localIp65504P1835SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1835SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1835S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1835S() {	 
			return (getShort(beginIp65504P1835S));
   	}
         int localIp65504P1835LCounter = -1;
         public boolean isIp65504P1835LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1835LCounter != sharedCounter;
            localIp65504P1835LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1835_L_LEN = 2;
  	/**
	 * serializeIp65504P1835L
	 */
	protected void serializeIp65504P1835L(short ip65504P1835L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1835L,IP_65504_P_1835_L_LEN)
                  ,beginIp65504P1835L
                  ,IP_65504_P_1835_L_LEN
                 );
            localIp65504P1835LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1835LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1835L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1835L() {	 
			return (getShort(beginIp65504P1835L));
   	}
         int localIp65504P1836SCounter = -1;
         public boolean isIp65504P1836SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1836SCounter != sharedCounter;
            localIp65504P1836SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1836_S_LEN = 2;
  	/**
	 * serializeIp65504P1836S
	 */
	protected void serializeIp65504P1836S(short ip65504P1836S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1836S,IP_65504_P_1836_S_LEN)
                  ,beginIp65504P1836S
                  ,IP_65504_P_1836_S_LEN
                 );
            localIp65504P1836SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1836SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1836S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1836S() {	 
			return (getShort(beginIp65504P1836S));
   	}
         int localIp65504P1836LCounter = -1;
         public boolean isIp65504P1836LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1836LCounter != sharedCounter;
            localIp65504P1836LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1836_L_LEN = 2;
  	/**
	 * serializeIp65504P1836L
	 */
	protected void serializeIp65504P1836L(short ip65504P1836L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1836L,IP_65504_P_1836_L_LEN)
                  ,beginIp65504P1836L
                  ,IP_65504_P_1836_L_LEN
                 );
            localIp65504P1836LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1836LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1836L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1836L() {	 
			return (getShort(beginIp65504P1836L));
   	}
         int localIp65504P1837SCounter = -1;
         public boolean isIp65504P1837SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1837SCounter != sharedCounter;
            localIp65504P1837SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1837_S_LEN = 2;
  	/**
	 * serializeIp65504P1837S
	 */
	protected void serializeIp65504P1837S(short ip65504P1837S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1837S,IP_65504_P_1837_S_LEN)
                  ,beginIp65504P1837S
                  ,IP_65504_P_1837_S_LEN
                 );
            localIp65504P1837SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1837SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1837S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1837S() {	 
			return (getShort(beginIp65504P1837S));
   	}
         int localIp65504P1837LCounter = -1;
         public boolean isIp65504P1837LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1837LCounter != sharedCounter;
            localIp65504P1837LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1837_L_LEN = 2;
  	/**
	 * serializeIp65504P1837L
	 */
	protected void serializeIp65504P1837L(short ip65504P1837L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1837L,IP_65504_P_1837_L_LEN)
                  ,beginIp65504P1837L
                  ,IP_65504_P_1837_L_LEN
                 );
            localIp65504P1837LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1837LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1837L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1837L() {	 
			return (getShort(beginIp65504P1837L));
   	}
         int localIp65504P1838SCounter = -1;
         public boolean isIp65504P1838SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1838SCounter != sharedCounter;
            localIp65504P1838SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1838_S_LEN = 2;
  	/**
	 * serializeIp65504P1838S
	 */
	protected void serializeIp65504P1838S(short ip65504P1838S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1838S,IP_65504_P_1838_S_LEN)
                  ,beginIp65504P1838S
                  ,IP_65504_P_1838_S_LEN
                 );
            localIp65504P1838SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1838SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1838S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1838S() {	 
			return (getShort(beginIp65504P1838S));
   	}
         int localIp65504P1838LCounter = -1;
         public boolean isIp65504P1838LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1838LCounter != sharedCounter;
            localIp65504P1838LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1838_L_LEN = 2;
  	/**
	 * serializeIp65504P1838L
	 */
	protected void serializeIp65504P1838L(short ip65504P1838L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1838L,IP_65504_P_1838_L_LEN)
                  ,beginIp65504P1838L
                  ,IP_65504_P_1838_L_LEN
                 );
            localIp65504P1838LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1838LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1838L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1838L() {	 
			return (getShort(beginIp65504P1838L));
   	}
         int localIp65504P1839SCounter = -1;
         public boolean isIp65504P1839SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1839SCounter != sharedCounter;
            localIp65504P1839SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1839_S_LEN = 2;
  	/**
	 * serializeIp65504P1839S
	 */
	protected void serializeIp65504P1839S(short ip65504P1839S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1839S,IP_65504_P_1839_S_LEN)
                  ,beginIp65504P1839S
                  ,IP_65504_P_1839_S_LEN
                 );
            localIp65504P1839SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1839SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1839S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1839S() {	 
			return (getShort(beginIp65504P1839S));
   	}
         int localIp65504P1839LCounter = -1;
         public boolean isIp65504P1839LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1839LCounter != sharedCounter;
            localIp65504P1839LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1839_L_LEN = 2;
  	/**
	 * serializeIp65504P1839L
	 */
	protected void serializeIp65504P1839L(short ip65504P1839L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1839L,IP_65504_P_1839_L_LEN)
                  ,beginIp65504P1839L
                  ,IP_65504_P_1839_L_LEN
                 );
            localIp65504P1839LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1839LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1839L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1839L() {	 
			return (getShort(beginIp65504P1839L));
   	}
         int localIp65504P1840SCounter = -1;
         public boolean isIp65504P1840SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1840SCounter != sharedCounter;
            localIp65504P1840SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1840_S_LEN = 2;
  	/**
	 * serializeIp65504P1840S
	 */
	protected void serializeIp65504P1840S(short ip65504P1840S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1840S,IP_65504_P_1840_S_LEN)
                  ,beginIp65504P1840S
                  ,IP_65504_P_1840_S_LEN
                 );
            localIp65504P1840SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1840SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1840S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1840S() {	 
			return (getShort(beginIp65504P1840S));
   	}
         int localIp65504P1840LCounter = -1;
         public boolean isIp65504P1840LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1840LCounter != sharedCounter;
            localIp65504P1840LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1840_L_LEN = 2;
  	/**
	 * serializeIp65504P1840L
	 */
	protected void serializeIp65504P1840L(short ip65504P1840L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1840L,IP_65504_P_1840_L_LEN)
                  ,beginIp65504P1840L
                  ,IP_65504_P_1840_L_LEN
                 );
            localIp65504P1840LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1840LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1840L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1840L() {	 
			return (getShort(beginIp65504P1840L));
   	}
         int localIp65504P1841SCounter = -1;
         public boolean isIp65504P1841SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1841SCounter != sharedCounter;
            localIp65504P1841SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1841_S_LEN = 2;
  	/**
	 * serializeIp65504P1841S
	 */
	protected void serializeIp65504P1841S(short ip65504P1841S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1841S,IP_65504_P_1841_S_LEN)
                  ,beginIp65504P1841S
                  ,IP_65504_P_1841_S_LEN
                 );
            localIp65504P1841SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1841SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1841S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1841S() {	 
			return (getShort(beginIp65504P1841S));
   	}
         int localIp65504P1841LCounter = -1;
         public boolean isIp65504P1841LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1841LCounter != sharedCounter;
            localIp65504P1841LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1841_L_LEN = 2;
  	/**
	 * serializeIp65504P1841L
	 */
	protected void serializeIp65504P1841L(short ip65504P1841L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1841L,IP_65504_P_1841_L_LEN)
                  ,beginIp65504P1841L
                  ,IP_65504_P_1841_L_LEN
                 );
            localIp65504P1841LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1841LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1841L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1841L() {	 
			return (getShort(beginIp65504P1841L));
   	}
         int localIp65504P1842SCounter = -1;
         public boolean isIp65504P1842SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1842SCounter != sharedCounter;
            localIp65504P1842SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1842_S_LEN = 2;
  	/**
	 * serializeIp65504P1842S
	 */
	protected void serializeIp65504P1842S(short ip65504P1842S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1842S,IP_65504_P_1842_S_LEN)
                  ,beginIp65504P1842S
                  ,IP_65504_P_1842_S_LEN
                 );
            localIp65504P1842SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1842SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1842S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1842S() {	 
			return (getShort(beginIp65504P1842S));
   	}
         int localIp65504P1842LCounter = -1;
         public boolean isIp65504P1842LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1842LCounter != sharedCounter;
            localIp65504P1842LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1842_L_LEN = 2;
  	/**
	 * serializeIp65504P1842L
	 */
	protected void serializeIp65504P1842L(short ip65504P1842L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1842L,IP_65504_P_1842_L_LEN)
                  ,beginIp65504P1842L
                  ,IP_65504_P_1842_L_LEN
                 );
            localIp65504P1842LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1842LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1842L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1842L() {	 
			return (getShort(beginIp65504P1842L));
   	}
         int localIp65504P1843SCounter = -1;
         public boolean isIp65504P1843SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1843SCounter != sharedCounter;
            localIp65504P1843SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1843_S_LEN = 2;
  	/**
	 * serializeIp65504P1843S
	 */
	protected void serializeIp65504P1843S(short ip65504P1843S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1843S,IP_65504_P_1843_S_LEN)
                  ,beginIp65504P1843S
                  ,IP_65504_P_1843_S_LEN
                 );
            localIp65504P1843SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1843SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1843S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1843S() {	 
			return (getShort(beginIp65504P1843S));
   	}
         int localIp65504P1843LCounter = -1;
         public boolean isIp65504P1843LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1843LCounter != sharedCounter;
            localIp65504P1843LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1843_L_LEN = 2;
  	/**
	 * serializeIp65504P1843L
	 */
	protected void serializeIp65504P1843L(short ip65504P1843L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1843L,IP_65504_P_1843_L_LEN)
                  ,beginIp65504P1843L
                  ,IP_65504_P_1843_L_LEN
                 );
            localIp65504P1843LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1843LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1843L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1843L() {	 
			return (getShort(beginIp65504P1843L));
   	}
         int localIp65504P1844SCounter = -1;
         public boolean isIp65504P1844SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1844SCounter != sharedCounter;
            localIp65504P1844SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1844_S_LEN = 2;
  	/**
	 * serializeIp65504P1844S
	 */
	protected void serializeIp65504P1844S(short ip65504P1844S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1844S,IP_65504_P_1844_S_LEN)
                  ,beginIp65504P1844S
                  ,IP_65504_P_1844_S_LEN
                 );
            localIp65504P1844SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1844SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1844S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1844S() {	 
			return (getShort(beginIp65504P1844S));
   	}
         int localIp65504P1844LCounter = -1;
         public boolean isIp65504P1844LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1844LCounter != sharedCounter;
            localIp65504P1844LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1844_L_LEN = 2;
  	/**
	 * serializeIp65504P1844L
	 */
	protected void serializeIp65504P1844L(short ip65504P1844L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1844L,IP_65504_P_1844_L_LEN)
                  ,beginIp65504P1844L
                  ,IP_65504_P_1844_L_LEN
                 );
            localIp65504P1844LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1844LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1844L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1844L() {	 
			return (getShort(beginIp65504P1844L));
   	}
         int localIp65504P1845SCounter = -1;
         public boolean isIp65504P1845SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1845SCounter != sharedCounter;
            localIp65504P1845SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1845_S_LEN = 2;
  	/**
	 * serializeIp65504P1845S
	 */
	protected void serializeIp65504P1845S(short ip65504P1845S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1845S,IP_65504_P_1845_S_LEN)
                  ,beginIp65504P1845S
                  ,IP_65504_P_1845_S_LEN
                 );
            localIp65504P1845SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1845SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1845S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1845S() {	 
			return (getShort(beginIp65504P1845S));
   	}
         int localIp65504P1845LCounter = -1;
         public boolean isIp65504P1845LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1845LCounter != sharedCounter;
            localIp65504P1845LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1845_L_LEN = 2;
  	/**
	 * serializeIp65504P1845L
	 */
	protected void serializeIp65504P1845L(short ip65504P1845L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1845L,IP_65504_P_1845_L_LEN)
                  ,beginIp65504P1845L
                  ,IP_65504_P_1845_L_LEN
                 );
            localIp65504P1845LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1845LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1845L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1845L() {	 
			return (getShort(beginIp65504P1845L));
   	}
         int localIp65504P1846SCounter = -1;
         public boolean isIp65504P1846SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1846SCounter != sharedCounter;
            localIp65504P1846SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1846_S_LEN = 2;
  	/**
	 * serializeIp65504P1846S
	 */
	protected void serializeIp65504P1846S(short ip65504P1846S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1846S,IP_65504_P_1846_S_LEN)
                  ,beginIp65504P1846S
                  ,IP_65504_P_1846_S_LEN
                 );
            localIp65504P1846SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1846SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1846S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1846S() {	 
			return (getShort(beginIp65504P1846S));
   	}
         int localIp65504P1846LCounter = -1;
         public boolean isIp65504P1846LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1846LCounter != sharedCounter;
            localIp65504P1846LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1846_L_LEN = 2;
  	/**
	 * serializeIp65504P1846L
	 */
	protected void serializeIp65504P1846L(short ip65504P1846L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1846L,IP_65504_P_1846_L_LEN)
                  ,beginIp65504P1846L
                  ,IP_65504_P_1846_L_LEN
                 );
            localIp65504P1846LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1846LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1846L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1846L() {	 
			return (getShort(beginIp65504P1846L));
   	}
         int localIp65504P1847SCounter = -1;
         public boolean isIp65504P1847SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1847SCounter != sharedCounter;
            localIp65504P1847SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1847_S_LEN = 2;
  	/**
	 * serializeIp65504P1847S
	 */
	protected void serializeIp65504P1847S(short ip65504P1847S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1847S,IP_65504_P_1847_S_LEN)
                  ,beginIp65504P1847S
                  ,IP_65504_P_1847_S_LEN
                 );
            localIp65504P1847SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1847SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1847S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1847S() {	 
			return (getShort(beginIp65504P1847S));
   	}
         int localIp65504P1847LCounter = -1;
         public boolean isIp65504P1847LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1847LCounter != sharedCounter;
            localIp65504P1847LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1847_L_LEN = 2;
  	/**
	 * serializeIp65504P1847L
	 */
	protected void serializeIp65504P1847L(short ip65504P1847L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1847L,IP_65504_P_1847_L_LEN)
                  ,beginIp65504P1847L
                  ,IP_65504_P_1847_L_LEN
                 );
            localIp65504P1847LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1847LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1847L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1847L() {	 
			return (getShort(beginIp65504P1847L));
   	}
         int localIp65504P1848SCounter = -1;
         public boolean isIp65504P1848SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1848SCounter != sharedCounter;
            localIp65504P1848SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1848_S_LEN = 2;
  	/**
	 * serializeIp65504P1848S
	 */
	protected void serializeIp65504P1848S(short ip65504P1848S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1848S,IP_65504_P_1848_S_LEN)
                  ,beginIp65504P1848S
                  ,IP_65504_P_1848_S_LEN
                 );
            localIp65504P1848SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1848SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1848S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1848S() {	 
			return (getShort(beginIp65504P1848S));
   	}
         int localIp65504P1848LCounter = -1;
         public boolean isIp65504P1848LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1848LCounter != sharedCounter;
            localIp65504P1848LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1848_L_LEN = 2;
  	/**
	 * serializeIp65504P1848L
	 */
	protected void serializeIp65504P1848L(short ip65504P1848L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1848L,IP_65504_P_1848_L_LEN)
                  ,beginIp65504P1848L
                  ,IP_65504_P_1848_L_LEN
                 );
            localIp65504P1848LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1848LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1848L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1848L() {	 
			return (getShort(beginIp65504P1848L));
   	}
         int localIp65504P1849SCounter = -1;
         public boolean isIp65504P1849SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1849SCounter != sharedCounter;
            localIp65504P1849SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1849_S_LEN = 2;
  	/**
	 * serializeIp65504P1849S
	 */
	protected void serializeIp65504P1849S(short ip65504P1849S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1849S,IP_65504_P_1849_S_LEN)
                  ,beginIp65504P1849S
                  ,IP_65504_P_1849_S_LEN
                 );
            localIp65504P1849SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1849SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1849S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1849S() {	 
			return (getShort(beginIp65504P1849S));
   	}
         int localIp65504P1849LCounter = -1;
         public boolean isIp65504P1849LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1849LCounter != sharedCounter;
            localIp65504P1849LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1849_L_LEN = 2;
  	/**
	 * serializeIp65504P1849L
	 */
	protected void serializeIp65504P1849L(short ip65504P1849L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1849L,IP_65504_P_1849_L_LEN)
                  ,beginIp65504P1849L
                  ,IP_65504_P_1849_L_LEN
                 );
            localIp65504P1849LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1849LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1849L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1849L() {	 
			return (getShort(beginIp65504P1849L));
   	}
         int localIp65504P1850SCounter = -1;
         public boolean isIp65504P1850SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1850SCounter != sharedCounter;
            localIp65504P1850SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1850_S_LEN = 2;
  	/**
	 * serializeIp65504P1850S
	 */
	protected void serializeIp65504P1850S(short ip65504P1850S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1850S,IP_65504_P_1850_S_LEN)
                  ,beginIp65504P1850S
                  ,IP_65504_P_1850_S_LEN
                 );
            localIp65504P1850SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1850SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1850S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1850S() {	 
			return (getShort(beginIp65504P1850S));
   	}
         int localIp65504P1850LCounter = -1;
         public boolean isIp65504P1850LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1850LCounter != sharedCounter;
            localIp65504P1850LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1850_L_LEN = 2;
  	/**
	 * serializeIp65504P1850L
	 */
	protected void serializeIp65504P1850L(short ip65504P1850L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1850L,IP_65504_P_1850_L_LEN)
                  ,beginIp65504P1850L
                  ,IP_65504_P_1850_L_LEN
                 );
            localIp65504P1850LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1850LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1850L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1850L() {	 
			return (getShort(beginIp65504P1850L));
   	}
         int localIp65504P1851SCounter = -1;
         public boolean isIp65504P1851SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1851SCounter != sharedCounter;
            localIp65504P1851SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1851_S_LEN = 2;
  	/**
	 * serializeIp65504P1851S
	 */
	protected void serializeIp65504P1851S(short ip65504P1851S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1851S,IP_65504_P_1851_S_LEN)
                  ,beginIp65504P1851S
                  ,IP_65504_P_1851_S_LEN
                 );
            localIp65504P1851SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1851SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1851S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1851S() {	 
			return (getShort(beginIp65504P1851S));
   	}
         int localIp65504P1851LCounter = -1;
         public boolean isIp65504P1851LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1851LCounter != sharedCounter;
            localIp65504P1851LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1851_L_LEN = 2;
  	/**
	 * serializeIp65504P1851L
	 */
	protected void serializeIp65504P1851L(short ip65504P1851L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1851L,IP_65504_P_1851_L_LEN)
                  ,beginIp65504P1851L
                  ,IP_65504_P_1851_L_LEN
                 );
            localIp65504P1851LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1851LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1851L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1851L() {	 
			return (getShort(beginIp65504P1851L));
   	}
         int localIp65504P1852SCounter = -1;
         public boolean isIp65504P1852SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1852SCounter != sharedCounter;
            localIp65504P1852SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1852_S_LEN = 2;
  	/**
	 * serializeIp65504P1852S
	 */
	protected void serializeIp65504P1852S(short ip65504P1852S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1852S,IP_65504_P_1852_S_LEN)
                  ,beginIp65504P1852S
                  ,IP_65504_P_1852_S_LEN
                 );
            localIp65504P1852SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1852SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1852S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1852S() {	 
			return (getShort(beginIp65504P1852S));
   	}
         int localIp65504P1852LCounter = -1;
         public boolean isIp65504P1852LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1852LCounter != sharedCounter;
            localIp65504P1852LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1852_L_LEN = 2;
  	/**
	 * serializeIp65504P1852L
	 */
	protected void serializeIp65504P1852L(short ip65504P1852L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1852L,IP_65504_P_1852_L_LEN)
                  ,beginIp65504P1852L
                  ,IP_65504_P_1852_L_LEN
                 );
            localIp65504P1852LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1852LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1852L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1852L() {	 
			return (getShort(beginIp65504P1852L));
   	}
         int localIp65504P1853SCounter = -1;
         public boolean isIp65504P1853SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1853SCounter != sharedCounter;
            localIp65504P1853SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1853_S_LEN = 2;
  	/**
	 * serializeIp65504P1853S
	 */
	protected void serializeIp65504P1853S(short ip65504P1853S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1853S,IP_65504_P_1853_S_LEN)
                  ,beginIp65504P1853S
                  ,IP_65504_P_1853_S_LEN
                 );
            localIp65504P1853SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1853SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1853S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1853S() {	 
			return (getShort(beginIp65504P1853S));
   	}
         int localIp65504P1853LCounter = -1;
         public boolean isIp65504P1853LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1853LCounter != sharedCounter;
            localIp65504P1853LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1853_L_LEN = 2;
  	/**
	 * serializeIp65504P1853L
	 */
	protected void serializeIp65504P1853L(short ip65504P1853L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1853L,IP_65504_P_1853_L_LEN)
                  ,beginIp65504P1853L
                  ,IP_65504_P_1853_L_LEN
                 );
            localIp65504P1853LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1853LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1853L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1853L() {	 
			return (getShort(beginIp65504P1853L));
   	}
         int localIp65504P1854SCounter = -1;
         public boolean isIp65504P1854SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1854SCounter != sharedCounter;
            localIp65504P1854SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1854_S_LEN = 2;
  	/**
	 * serializeIp65504P1854S
	 */
	protected void serializeIp65504P1854S(short ip65504P1854S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1854S,IP_65504_P_1854_S_LEN)
                  ,beginIp65504P1854S
                  ,IP_65504_P_1854_S_LEN
                 );
            localIp65504P1854SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1854SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1854S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1854S() {	 
			return (getShort(beginIp65504P1854S));
   	}
         int localIp65504P1854LCounter = -1;
         public boolean isIp65504P1854LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1854LCounter != sharedCounter;
            localIp65504P1854LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1854_L_LEN = 2;
  	/**
	 * serializeIp65504P1854L
	 */
	protected void serializeIp65504P1854L(short ip65504P1854L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1854L,IP_65504_P_1854_L_LEN)
                  ,beginIp65504P1854L
                  ,IP_65504_P_1854_L_LEN
                 );
            localIp65504P1854LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1854LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1854L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1854L() {	 
			return (getShort(beginIp65504P1854L));
   	}
         int localIp65504P1855SCounter = -1;
         public boolean isIp65504P1855SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1855SCounter != sharedCounter;
            localIp65504P1855SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1855_S_LEN = 2;
  	/**
	 * serializeIp65504P1855S
	 */
	protected void serializeIp65504P1855S(short ip65504P1855S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1855S,IP_65504_P_1855_S_LEN)
                  ,beginIp65504P1855S
                  ,IP_65504_P_1855_S_LEN
                 );
            localIp65504P1855SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1855SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1855S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1855S() {	 
			return (getShort(beginIp65504P1855S));
   	}
         int localIp65504P1855LCounter = -1;
         public boolean isIp65504P1855LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1855LCounter != sharedCounter;
            localIp65504P1855LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1855_L_LEN = 2;
  	/**
	 * serializeIp65504P1855L
	 */
	protected void serializeIp65504P1855L(short ip65504P1855L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1855L,IP_65504_P_1855_L_LEN)
                  ,beginIp65504P1855L
                  ,IP_65504_P_1855_L_LEN
                 );
            localIp65504P1855LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1855LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1855L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1855L() {	 
			return (getShort(beginIp65504P1855L));
   	}
         int localIp65504P1856SCounter = -1;
         public boolean isIp65504P1856SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1856SCounter != sharedCounter;
            localIp65504P1856SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1856_S_LEN = 2;
  	/**
	 * serializeIp65504P1856S
	 */
	protected void serializeIp65504P1856S(short ip65504P1856S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1856S,IP_65504_P_1856_S_LEN)
                  ,beginIp65504P1856S
                  ,IP_65504_P_1856_S_LEN
                 );
            localIp65504P1856SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1856SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1856S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1856S() {	 
			return (getShort(beginIp65504P1856S));
   	}
         int localIp65504P1856LCounter = -1;
         public boolean isIp65504P1856LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1856LCounter != sharedCounter;
            localIp65504P1856LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1856_L_LEN = 2;
  	/**
	 * serializeIp65504P1856L
	 */
	protected void serializeIp65504P1856L(short ip65504P1856L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1856L,IP_65504_P_1856_L_LEN)
                  ,beginIp65504P1856L
                  ,IP_65504_P_1856_L_LEN
                 );
            localIp65504P1856LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1856LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1856L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1856L() {	 
			return (getShort(beginIp65504P1856L));
   	}
         int localIp65504P1857SCounter = -1;
         public boolean isIp65504P1857SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1857SCounter != sharedCounter;
            localIp65504P1857SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1857_S_LEN = 2;
  	/**
	 * serializeIp65504P1857S
	 */
	protected void serializeIp65504P1857S(short ip65504P1857S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1857S,IP_65504_P_1857_S_LEN)
                  ,beginIp65504P1857S
                  ,IP_65504_P_1857_S_LEN
                 );
            localIp65504P1857SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1857SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1857S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1857S() {	 
			return (getShort(beginIp65504P1857S));
   	}
         int localIp65504P1857LCounter = -1;
         public boolean isIp65504P1857LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1857LCounter != sharedCounter;
            localIp65504P1857LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1857_L_LEN = 2;
  	/**
	 * serializeIp65504P1857L
	 */
	protected void serializeIp65504P1857L(short ip65504P1857L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1857L,IP_65504_P_1857_L_LEN)
                  ,beginIp65504P1857L
                  ,IP_65504_P_1857_L_LEN
                 );
            localIp65504P1857LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1857LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1857L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1857L() {	 
			return (getShort(beginIp65504P1857L));
   	}
         int localIp65504P1858SCounter = -1;
         public boolean isIp65504P1858SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1858SCounter != sharedCounter;
            localIp65504P1858SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1858_S_LEN = 2;
  	/**
	 * serializeIp65504P1858S
	 */
	protected void serializeIp65504P1858S(short ip65504P1858S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1858S,IP_65504_P_1858_S_LEN)
                  ,beginIp65504P1858S
                  ,IP_65504_P_1858_S_LEN
                 );
            localIp65504P1858SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1858SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1858S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1858S() {	 
			return (getShort(beginIp65504P1858S));
   	}
         int localIp65504P1858LCounter = -1;
         public boolean isIp65504P1858LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1858LCounter != sharedCounter;
            localIp65504P1858LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1858_L_LEN = 2;
  	/**
	 * serializeIp65504P1858L
	 */
	protected void serializeIp65504P1858L(short ip65504P1858L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1858L,IP_65504_P_1858_L_LEN)
                  ,beginIp65504P1858L
                  ,IP_65504_P_1858_L_LEN
                 );
            localIp65504P1858LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1858LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1858L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1858L() {	 
			return (getShort(beginIp65504P1858L));
   	}
         int localIp65504P1859SCounter = -1;
         public boolean isIp65504P1859SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1859SCounter != sharedCounter;
            localIp65504P1859SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1859_S_LEN = 2;
  	/**
	 * serializeIp65504P1859S
	 */
	protected void serializeIp65504P1859S(short ip65504P1859S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1859S,IP_65504_P_1859_S_LEN)
                  ,beginIp65504P1859S
                  ,IP_65504_P_1859_S_LEN
                 );
            localIp65504P1859SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1859SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1859S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1859S() {	 
			return (getShort(beginIp65504P1859S));
   	}
         int localIp65504P1859LCounter = -1;
         public boolean isIp65504P1859LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1859LCounter != sharedCounter;
            localIp65504P1859LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1859_L_LEN = 2;
  	/**
	 * serializeIp65504P1859L
	 */
	protected void serializeIp65504P1859L(short ip65504P1859L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1859L,IP_65504_P_1859_L_LEN)
                  ,beginIp65504P1859L
                  ,IP_65504_P_1859_L_LEN
                 );
            localIp65504P1859LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1859LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1859L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1859L() {	 
			return (getShort(beginIp65504P1859L));
   	}
         int localIp65504P1860SCounter = -1;
         public boolean isIp65504P1860SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1860SCounter != sharedCounter;
            localIp65504P1860SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1860_S_LEN = 2;
  	/**
	 * serializeIp65504P1860S
	 */
	protected void serializeIp65504P1860S(short ip65504P1860S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1860S,IP_65504_P_1860_S_LEN)
                  ,beginIp65504P1860S
                  ,IP_65504_P_1860_S_LEN
                 );
            localIp65504P1860SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1860SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1860S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1860S() {	 
			return (getShort(beginIp65504P1860S));
   	}
         int localIp65504P1860LCounter = -1;
         public boolean isIp65504P1860LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1860LCounter != sharedCounter;
            localIp65504P1860LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1860_L_LEN = 2;
  	/**
	 * serializeIp65504P1860L
	 */
	protected void serializeIp65504P1860L(short ip65504P1860L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1860L,IP_65504_P_1860_L_LEN)
                  ,beginIp65504P1860L
                  ,IP_65504_P_1860_L_LEN
                 );
            localIp65504P1860LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1860LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1860L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1860L() {	 
			return (getShort(beginIp65504P1860L));
   	}




}
  
